package com.sysfera.codegen.docbook.apimodel;
//import com.sysfera.codegen.docbook.apimodel.util;

import java.io.IOException;
import java.math.BigInteger;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.RowType;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TgroupType;
import org.kermeta.Docbook.TheadType;

import com.sysfera.codegen.api.apimodel.Port;
import com.sysfera.codegen.api.apimodel.util.ApimodelUtils;

public class ParametersTable {


	private DocbookFactory factory;

	public ParametersTable(DocbookFactory docBookFactory) {
		factory = docBookFactory;
	}

	/**
	 * Header line for the C++ API
	 * @param head
	 */
	private  void addHeadRowApi(TheadType head) {

		RowType row = factory.createRowType();
		head.getRow().add(row);
		// Parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		FeatureMapUtil.addText(entry.getMixed(), "Parameter\n");
		// Type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		FeatureMapUtil.addText(entry2.getMixed(), "Type\n");
		// Description
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		FeatureMapUtil.addText(entry3.getMixed(), "Description\n");
		// Mode
		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		FeatureMapUtil.addText(entry4.getMixed(), "Mode\n");
		// Required
		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		FeatureMapUtil.addText(entry5.getMixed(), "Required\n");

	}

	/**
	 * Standard line for the C++ API
	 * @param tbody
	 * @param param
	 * @param type
	 * @param desc
	 * @param mod
	 * @param req
	 * @param isClassType
	 */
	private void addRowApi(TbodyType tbody, String param, String type, String desc,
			String mod, String req, boolean isClassType) {

		RowType row = factory.createRowType();
		tbody.getRow().add(row);
		// parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		DocBookGenApimUtils.insertText(factory, entry, param);
		// type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		if(!isClassType) DocBookGenApimUtils.insertText(factory, entry2, type);
		else DocBookGenApimUtils.insertLinkText(factory, entry2, type);
		// description
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		DocBookGenApimUtils.insertText(factory, entry3, desc);
		// mode
		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		DocBookGenApimUtils.insertText(factory, entry4, mod);
		// required
		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		DocBookGenApimUtils.insertText(factory, entry5, req);

	}

	/**
	 * Displays the service parameters for the C++ API
	 * @param Ports
	 * @return
	 */
	public InformaltableType getTableApi(List<Port> Ports) {

		InformaltableType 	table = factory.createInformaltableType();
		TbodyType 	tbody = factory.createTbodyType();
		TgroupType 	tgroup = factory.createTgroupType();
		TheadType	thead = factory.createTheadType();

		table.setTgroup(tgroup);
		tgroup.setTbody(tbody);
		tgroup.setThead(thead);

		tgroup.setCols(BigInteger.valueOf(5));

		// Column specifications (width)
		ColspecType colspecParam = factory.createColspecType();
		ColspecType colspecType = factory.createColspecType();
		ColspecType colspecDesc = factory.createColspecType();
		ColspecType colspecReq = factory.createColspecType();
		ColspecType colspecMod = factory.createColspecType();
		colspecParam.setColwidth("2cm");
		colspecType.setColwidth("3cm");
		colspecDesc.setColwidth("8cm");
		colspecMod.setColwidth("1.5cm");
		colspecReq.setColwidth("2cm");

		tgroup.getColspec().add(colspecParam);
		tgroup.getColspec().add(colspecType);
		tgroup.getColspec().add(colspecDesc);
		tgroup.getColspec().add(colspecReq);
		tgroup.getColspec().add(colspecMod);

		// Head row
		addHeadRowApi(thead);

		//Print parameters table
		for (Port port : Ports) {
			
			String parameter = port.getName();
			String type = port.getDataType().getName();
			String desc = port.getDescription();
			String mod = port.getDirection().toString();
			EClassifier eType = port.getDataType().getECoreType();
			boolean isClassType = false;
			if((eType instanceof EClass) || (eType instanceof EEnum) || (eType instanceof EReference) ) 
				isClassType = true;
			//if(port.getDataType().getName().contains("Options")) 
			if(port.isOptional())
				addRowApi(tbody, parameter, type, desc, mod, "no", isClassType);
			else addRowApi(tbody, parameter, type, desc, mod, "yes", isClassType);
		}
		return table;
	}

	/**
	 * Header line for CLI
	 * @param head
	 */
	private  void addHeadRowCmd(TheadType head) {

		RowType row = factory.createRowType();
		head.getRow().add(row);
		// Parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		FeatureMapUtil.addText(entry.getMixed(), "Parameter\n");
		// Type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		FeatureMapUtil.addText(entry2.getMixed(), "Type\n");
		// Option
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		FeatureMapUtil.addText(entry3.getMixed(), "Option\n");
		// Description
		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		FeatureMapUtil.addText(entry4.getMixed(), "Description\n");

		// required
		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		FeatureMapUtil.addText(entry5.getMixed(), "Required\n");

	}

	/**
	 * Standard line for the CLI
	 * @param tbody
	 * @param param
	 * @param type
	 * @param opt
	 * @param desc
	 * @param req
	 * @param isClassType
	 */
	private void addRowCmd(TbodyType tbody, String param, String type, String opt, String desc, String req, boolean isClassType) {

		RowType row = factory.createRowType();
		tbody.getRow().add(row);
		// parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		DocBookGenApimUtils.insertText(factory, entry, param);
		// type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		if(!isClassType) DocBookGenApimUtils.insertText(factory, entry2, type);
		else DocBookGenApimUtils.insertLinkText(factory, entry2, type);
		// option
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		DocBookGenApimUtils.insertText(factory, entry3, opt);
		// description
		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		DocBookGenApimUtils.insertText(factory, entry4, desc);

		// required
		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		DocBookGenApimUtils.insertText(factory, entry5, req);		
	}


	/**
	 * Displays the list of service parameters for the CLI
	 * @param Ports
	 * @return
	 */
	public InformaltableType getTableCmd(List<Port> Ports) {

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("apim", 
				new EcoreResourceFactoryImpl()); 

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", 
				new EcoreResourceFactoryImpl()); 

		InformaltableType 	table = factory.createInformaltableType();
		TbodyType 	tbody = factory.createTbodyType();
		TgroupType 	tgroup = factory.createTgroupType();
		TheadType	thead = factory.createTheadType();

		table.setTgroup(tgroup);
		tgroup.setTbody(tbody);
		tgroup.setThead(thead);

		tgroup.setCols(BigInteger.valueOf(5));

		// Column specifications (width)
		ColspecType colspecParam = factory.createColspecType();
		ColspecType colspecType = factory.createColspecType();
		ColspecType colspecDesc = factory.createColspecType();
		ColspecType colspecReq = factory.createColspecType();
		ColspecType colspecMod = factory.createColspecType();
		colspecParam.setColwidth("3.5cm");
		colspecType.setColwidth("3cm");
		colspecDesc.setColwidth("1cm");
		colspecReq.setColwidth("7cm");
		colspecMod.setColwidth("1.5cm");

		tgroup.getColspec().add(colspecParam);
		tgroup.getColspec().add(colspecType);
		tgroup.getColspec().add(colspecDesc);
		tgroup.getColspec().add(colspecReq);
		tgroup.getColspec().add(colspecMod);

		// Head row
		addHeadRowCmd(thead);

		//Print parameters table
		for (Port port : Ports) {
			
			String parameter = port.getName();
			String type = port.getDataType().getName();
			String desc = port.getDescription();
			String requiredType = port.getDirection().toString();

			if (requiredType.compareTo("IN")==0) { 

				EClassifier eType = port.getDataType().getECoreType();
				boolean isClassType = false;
				boolean isVarEnv = (port.getEnvOption()!=null);
				boolean isUseroption = false;

				if (isVarEnv) {
					isUseroption = port.getEnvOption().isIsUserOption();
				}

				if((eType instanceof EClass) || (eType instanceof EEnum) || (eType instanceof EReference) ) 
					isClassType = true;
				//if(port.getDataType().getName().contains("Options")) 
				if(port.isOptional()) {

					if (isClassType) {

						if (eType instanceof EEnum) {
							addRowCmd(tbody, parameter, type, port.getShortOptionLetter(), port.getDescription(),"NO", isClassType);
						}
						else {
							URI uri = port.getDataType().getECoreType().eResource().getURI();
							Resource Typeresource = resourceSet.createResource(uri);
							loadTyperesourceCmd(Typeresource);

							String instanceTypeName = port.getDataType().getECoreType().getInstanceTypeName();
							getcontent(Typeresource, instanceTypeName, tbody);
						}


					} else {
						addRowCmd(tbody, parameter, type, port.getShortOptionLetter(), port.getDescription(),"NO", isClassType);
					}

				}

				else {

					if (isClassType) {

						if (eType instanceof EEnum) {
							addRowCmd(tbody, parameter, type, port.getShortOptionLetter(), port.getDescription(),"YES", isClassType);
						}	
						else {

							URI uri = port.getDataType().getECoreType().eResource().getURI();
							Resource Typeresource = resourceSet.createResource(uri);
							loadTyperesourceCmd(Typeresource);

							String instanceTypeName = port.getDataType().getECoreType().getInstanceTypeName();
							getcontent(Typeresource, instanceTypeName, tbody);
						}

					}
					else {
						if (!ApimodelUtils.isInteractiveParam(parameter)) {

							if (!isVarEnv) {	
								addRowCmd(tbody, parameter, type, "", desc, "YES", isClassType);
							} else {

								if (isUseroption) {
									addRowCmd(tbody, parameter, type, port.getShortOptionLetter(), port.getDescription(),"NO", isClassType);
								}

							}

						}
						else {
							addRowCmd(tbody, parameter, type, "", desc+", it is an interactive parameter", "YES", isClassType);	
						}
					}


				}
			}//FIN IF PORT == IN
		}

		return table;
	}
	
	/**
	 * Header line for the environment variables
	 * @param head
	 */
	private void addHeadRowCmdEnv(TheadType head) {

		RowType row = factory.createRowType();
		head.getRow().add(row);

		// Option
		EntryType entry0 = factory.createEntryType();
		row.getEntry().add(entry0);
		FeatureMapUtil.addText(entry0.getMixed(), "Name\n");

		// Parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		FeatureMapUtil.addText(entry.getMixed(), "Parameter\n");
		// Type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		FeatureMapUtil.addText(entry2.getMixed(), "Type\n");
		// Description
		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		FeatureMapUtil.addText(entry4.getMixed(), "Description\n");

		// required
		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		FeatureMapUtil.addText(entry5.getMixed(), "Required\n");

		// User Option
		EntryType entry6 = factory.createEntryType();
		row.getEntry().add(entry6);
		FeatureMapUtil.addText(entry6.getMixed(), "User option\n");

	}
	
	/**
	 * Standard line for the environment variables
	 * @param tbody
	 * @param envVarName
	 * @param param
	 * @param type
	 * @param desc
	 * @param req
	 * @param useropt
	 * @param isClassType
	 */
	private void addRowCmdEnv(TbodyType tbody, String envVarName, String param, String type, String desc, String req, String useropt, boolean isClassType) {

		RowType row = factory.createRowType();
		tbody.getRow().add(row);

		//Environment variable name

		EntryType entry0 = factory.createEntryType();
		row.getEntry().add(entry0);
		DocBookGenApimUtils.insertText(factory, entry0, envVarName);

		// parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		DocBookGenApimUtils.insertText(factory, entry, param);
		// type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		if(!isClassType) DocBookGenApimUtils.insertText(factory, entry2, type);
		else DocBookGenApimUtils.insertLinkText(factory, entry2, type);
		// option
		/*EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
	    DocBookGenApimUtils.insertText(factory, entry3, opt);*/
		// description
		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		DocBookGenApimUtils.insertText(factory, entry4, desc);

		// required
		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		DocBookGenApimUtils.insertText(factory, entry5, req);

		// user option
		EntryType entry6 = factory.createEntryType();
		row.getEntry().add(entry6);
		DocBookGenApimUtils.insertText(factory, entry6, useropt);

	}

	/**
	 * Displays the list of environment variables for the CLI
	 */
	public InformaltableType getTableEnv(List<CommandParameter> params) {

		InformaltableType 	table = factory.createInformaltableType();
		TbodyType 	tbody = factory.createTbodyType();
		TgroupType 	tgroup = factory.createTgroupType();
		TheadType	thead = factory.createTheadType();

		table.setTgroup(tgroup);
		tgroup.setTbody(tbody);
		tgroup.setThead(thead);

		tgroup.setCols(BigInteger.valueOf(6));

		// Column specifications (width)
		ColspecType colspecEnv = factory.createColspecType();
		ColspecType colspecParam = factory.createColspecType();
		ColspecType colspecType = factory.createColspecType();
		ColspecType colspecDesc = factory.createColspecType();
		ColspecType colspecReq = factory.createColspecType();
		ColspecType colspecUserOpt = factory.createColspecType();

		colspecEnv.setColwidth("4.1cm");
		colspecParam.setColwidth("2cm");
		colspecType.setColwidth("2.5cm");
		colspecDesc.setColwidth("4.2cm");
		colspecReq.setColwidth("1.5cm");
		colspecUserOpt.setColwidth("1.5cm");

		tgroup.getColspec().add(colspecEnv);
		tgroup.getColspec().add(colspecParam);
		tgroup.getColspec().add(colspecType);
		tgroup.getColspec().add(colspecDesc);
		tgroup.getColspec().add(colspecReq);
		tgroup.getColspec().add(colspecUserOpt);


		// Head row
		addHeadRowCmdEnv(thead);

		//Print parameters table
		for (CommandParameter param : params) {

			if (param.hasEnvVariable()) {	
				addRowCmdEnv(tbody, param.getEnvVariable().getName(), param.getName(), param.getTypeName(), 
						     param.getDescription(), param.isOptional() ? "NO" : "YES", 
						     userOptToString(param.getEnvVariable().isIsUserOption()),
						     param.getType() instanceof EEnum);
			}				

		}

		return table;
	}
	
	/**
	 * Header line for the internal API
	 * @param head
	 */
	private void addHeadRowInternalAPI(TheadType head) {

		RowType row = factory.createRowType();
		head.getRow().add(row);

		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		FeatureMapUtil.addText(entry.getMixed(), "Parameter");

		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		FeatureMapUtil.addText(entry2.getMixed(), "Type");
		
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		FeatureMapUtil.addText(entry3.getMixed(), "Serialized type");

		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		FeatureMapUtil.addText(entry4.getMixed(), "Description");

		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		FeatureMapUtil.addText(entry5.getMixed(), "Mode");
	}
	
	/**
	 * Standard line for the internal API
	 */
	private void addRowInternalApi(TbodyType tbody, String param, String type, String serType, String desc,
			String mod, boolean isClassType) {

		RowType row = factory.createRowType();
		tbody.getRow().add(row);
		// parameter
		EntryType entry = factory.createEntryType();
		row.getEntry().add(entry);
		DocBookGenApimUtils.insertText(factory, entry, param);
		// type
		EntryType entry2 = factory.createEntryType();
		row.getEntry().add(entry2);
		DocBookGenApimUtils.insertText(factory, entry2, type);
		// serialized type
		EntryType entry3 = factory.createEntryType();
		row.getEntry().add(entry3);
		if(!isClassType) DocBookGenApimUtils.insertText(factory, entry3, serType);
		else DocBookGenApimUtils.insertLinkText(factory, entry3, serType);
		// description
		EntryType entry4 = factory.createEntryType();
		row.getEntry().add(entry4);
		DocBookGenApimUtils.insertText(factory, entry4, desc);
		// mode
		EntryType entry5 = factory.createEntryType();
		row.getEntry().add(entry5);
		DocBookGenApimUtils.insertText(factory, entry5, mod);

	}
	
	/**
	 * Converts the APIM type name to the type used for the Internal API
	 * @param apimType		contains the type name as visible in the APIM model
	 * @param isClassType	must be set to True if the provided type is a class or enum
	 * @return				the type to use for the internal API
	 */
	private String convertTypeInternalAPI(String apimType, boolean isClassType) {
		String ret = "";
		if (apimType.equals("string"))	ret = "string";
		else if (isClassType) 			ret = "string";
		else  ret= apimType;
		return ret;
	}
	
	/**
	 * Returns true when the provided type is serialized
	 * @param apimType
	 * @return
	 */
	private boolean isSerializedType(String apimType) {
		return true;
	}
	
	/**
	 * Displays the parameters table for the INTERNAL API
	 * @param Ports
	 * @return
	 */
	public InformaltableType getTableInternalApi(EList<Port> Ports) {

		InformaltableType 	table = factory.createInformaltableType();
		TbodyType 	tbody = factory.createTbodyType();
		TgroupType 	tgroup = factory.createTgroupType();
		TheadType	thead = factory.createTheadType();

		table.setTgroup(tgroup);
		tgroup.setTbody(tbody);
		tgroup.setThead(thead);

		tgroup.setCols(BigInteger.valueOf(5));

		// Column specifications (width)
		ColspecType colspec1 = factory.createColspecType();
		ColspecType colspec2 = factory.createColspecType();
		ColspecType colspec3 = factory.createColspecType();
		ColspecType colspec4 = factory.createColspecType();
		ColspecType colspec5 = factory.createColspecType();
		colspec1.setColwidth("2cm");
		colspec2.setColwidth("2cm");
		colspec3.setColwidth("3cm");
		colspec4.setColwidth("8cm");
		colspec5.setColwidth("1cm");

		tgroup.getColspec().add(colspec1);
		tgroup.getColspec().add(colspec2);
		tgroup.getColspec().add(colspec3);
		tgroup.getColspec().add(colspec4);
		tgroup.getColspec().add(colspec5);

		// Head row
		addHeadRowInternalAPI(thead);

		//Print parameters table
		for (Port port : Ports) {
			
			String parameter = port.getName();
			String apimTypeName = port.getDataType().getName();
			EClassifier eType = port.getDataType().getECoreType();
			boolean isClassType = (eType instanceof EClass) || (eType instanceof EEnum) || (eType instanceof EReference);
			
			String type = convertTypeInternalAPI(apimTypeName, isClassType);
			String serializedType = isClassType ? apimTypeName : "n/a";
			String desc = port.getDescription();
			String mod = port.getDirection().toString();
			
			
			addRowInternalApi(tbody, parameter, type, serializedType, desc, mod, isClassType);
		}
		return table;
	}

	public String getRequiredCmd(int lowerbound) {

		if (lowerbound == 1) {
			return "YES";
		} else {
			return "NO";	
		}

	}

	private String userOptToString(boolean userOpt) {

		if (userOpt) {
			return "YES";
		} else {
			return "NO";	
		}

	}

	public String convertType(String type) {

		//switch (type) {
		String typeconvert = type;

		if (type.compareTo("EBigDecimal")==0) typeconvert = "long double"; // Will change. See http://beta.boost.org/community/sandbox.html for BigDecimal and BigInt
		if (type.compareTo("EBigInteger")==0) typeconvert ="long long int"; // Will change for GMP
		if (type.compareTo("EBoolean")==0) typeconvert ="boolean";
		if (type.compareTo("EByte")==0) typeconvert = "unsigned char";
		if (type.compareTo("EChar")==0) typeconvert ="char"; // Maybe int, as you should consider UTF-8
		if (type.compareTo("EDate")==0) typeconvert = "time_t";
		if (type.compareTo("EDouble")==0) typeconvert = "double";
		if (type.compareTo("EFloat")==0) typeconvert ="float"; 
		if (type.compareTo("EInt")==0) typeconvert ="int";
		if (type.compareTo("ELong")==0) typeconvert ="long";
		if (type.compareTo("EShort")==0) typeconvert ="short";
		//case "EString": "char*"
		if (type.compareTo("EString")==0) typeconvert = "string";
		//default: 
		//return(type);
		//}
		return typeconvert;
	}


	//TODO
	private void getcontent(Resource Typeresource, String instanceTypeName, TbodyType tbodyOne) {

		if(Typeresource!=null){

			Iterator<EObject> Typeiter = Typeresource.getContents().iterator();
			while (Typeiter.hasNext()) {

				EObject dataobj = Typeiter.next();
				if (dataobj instanceof EPackage) {
					EPackage data =(EPackage)dataobj;
					if(data.getName().compareTo("ecore")!=0){
						EList<EObject>  datacontent = data.eContents();
						for(int i=0; i < datacontent.size(); i++) {

							if(datacontent.get(i) instanceof EClass) {
								EClass eclass = (EClass)datacontent.get(i);
	
								if((eclass.getInstanceTypeName().compareTo(instanceTypeName)==0 )) {

									EList<EObject> classType = eclass.eContents();
									for(int j=0; j < classType.size(); j++) {
										String Name = "Error";
										String Desc = "TO DO";
										String ShortOption = "TO DO";
										if(classType.get(j) instanceof EAttribute) {
											EAttribute attr = (EAttribute)classType.get(j);
											if(attr.getEAnnotation("Description")!=null) { 
												Desc = ApimodelUtils.getAttributeDescr(attr);
												ShortOption = ApimodelUtils.getAttributeShortOption(attr);
											}
											if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
													|| (attr.getEType() instanceof EReference)) {
												addRowCmd(tbodyOne, attr.getName(), convertType(attr.getEType().getName()), ShortOption, Desc, getRequiredCmd(attr.getLowerBound()), true);	
											}
											else {	
												if (!ApimodelUtils.isInteractiveParam(Name)) {
												addRowCmd(tbodyOne, attr.getName(), convertType(attr.getEType().getName()), ShortOption, Desc, getRequiredCmd(attr.getLowerBound()), false);
												} else {
												addRowCmd(tbodyOne, attr.getName(), convertType(attr.getEType().getName()), ShortOption, Desc+", it is an interactive parameter", getRequiredCmd(attr.getLowerBound()), false);
												}	
											}
										} else if(classType.get(j) instanceof EReference) {
											EReference eref = (EReference) classType.get(j);
											if(eref.getEType() instanceof EClass) {
												EClass erefClass = (EClass)eref.getEType() ;
												EList<EObject> erefClassType =  erefClass.eContents();
												for(int k=0; k < erefClassType.size();k++) {
													String DescEref = "TO DO";
													String ShortOptionEref = "TO DO";
													if(erefClassType.get(k) instanceof EAttribute) {
														EAttribute attr = (EAttribute)erefClassType.get(k);
														if(attr.getEAnnotation("Description")!=null) { 
															DescEref = ApimodelUtils.getAttributeDescr(attr);
															ShortOptionEref = ApimodelUtils.getAttributeShortOption(attr);
														}
														if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
																|| (attr.getEType() instanceof EReference)) {
															addRowCmd(tbodyOne, attr.getName(), convertType(attr.getEType().getName()), ShortOptionEref, DescEref, getRequiredCmd(attr.getLowerBound()), true);	
														}
														else {
															if (!ApimodelUtils.isInteractiveParam(Name)) {
																addRowCmd(tbodyOne, attr.getName(), convertType(attr.getEType().getName()), ShortOptionEref, DescEref, getRequiredCmd(attr.getLowerBound()), false);
															} else {
																addRowCmd(tbodyOne, attr.getName(), convertType(attr.getEType().getName()), ShortOptionEref, DescEref+", it is an interactive parameter", getRequiredCmd(attr.getLowerBound()), false);
															}
														}
													} 
												}
											}
										}
									} //Endof for classType.size()

									return;
								} //End of eclass.getInstanceTypeName().compareTo(instanceTypeName) 

							}  //End of EClass
						} //End of datacontent.size()
					} //End of data.getName().compareTo("ecore")

				} //End of EPackage
			} // End of Wile
		} //End of If
	}


	private void loadTyperesourceCmd(Resource Typeresource) {

		try {
			Map<Object, Object> loadOptions = new HashMap<Object, Object>();
			Typeresource.load(loadOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}


