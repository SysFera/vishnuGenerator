package com.sysfera.codegen.docbook.apimodel;


import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.kermeta.Docbook.ArgType;
import org.kermeta.Docbook.CmdsynopsisType;
import org.kermeta.Docbook.CommandType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.RefEntryTitleType;
import org.kermeta.Docbook.RefEntryType;
import org.kermeta.Docbook.RefMetaType;
import org.kermeta.Docbook.RefNameDivType;
import org.kermeta.Docbook.RefSect1Type;
import org.kermeta.Docbook.RefSynopsisDivType;
import org.kermeta.Docbook.ReferenceType;
import org.kermeta.Docbook.ReplaceableType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.SegmentedListType;
import org.kermeta.Docbook.TitleType;
import org.kermeta.Docbook.VariableListType;

import com.sysfera.codegen.api.apimodel.API;
import com.sysfera.codegen.api.apimodel.ApimodelPackage;
import com.sysfera.codegen.api.apimodel.EnvVariable;
import com.sysfera.codegen.api.apimodel.JobEnvVariableList;
import com.sysfera.codegen.api.apimodel.Module;
import com.sysfera.codegen.api.apimodel.Port;
import com.sysfera.codegen.api.apimodel.Service;
import com.sysfera.codegen.api.apimodel.APIUsage;
import com.sysfera.codegen.api.apimodel.util.ApimodelUtils;
import com.sysfera.codegen.docbook.utils.GenericModel;

public class ApiModel implements GenericModel {

	private DocbookFactory		factory;
	private String				filePath;
	private ResourceSet resourceSet;
	private Resource resource;
	private String _version;

	public ApiModel(String version) {
		factory = DocbookFactory.eINSTANCE;
		_version = version;
	}
	
	void loadTyperesource(Resource Typeresource) {

		try {
			Map<Object, Object> loadOptions = new HashMap<Object, Object>();
			Typeresource.load(loadOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void load(String modelFilePath) {

		filePath = modelFilePath;

		// Initialize the model
		ApimodelPackage.eINSTANCE.eClass();

		resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("apim", 
				new EcoreResourceFactoryImpl()); 

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", 
				new EcoreResourceFactoryImpl()); 

		URI uri = URI.createFileURI(filePath);

		resource = resourceSet.createResource(uri);

		try {
			Map<Object, Object> loadOptions = new HashMap<Object, Object>();
			resource.load(loadOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public SectionType generateSection(String srcRef) {

		SectionType section = null;
		if (srcRef.equals("APIOPS")) {
			section = generateSection_APIOPS();
		} else if (srcRef.equals("APIDATA")) {
			section = generateSection_APIDATA();
		} else if (srcRef.equals("CLIOPS")) {
			section = generateSection_CLIOPS();
		} else if (srcRef.equals("CLIDATA")) {
			section = generateSection_CLIDATA();
		} else if (srcRef.equals("SERVICES")) {
			section = generateSection_SERVICES();
		} else {
			System.err.println("ERROR: unknown section tag '" + srcRef +"'");
		}

		return section;
	}

	/**
	 * Generates the section containing all methods of the API
	 * NOTE: the model is supposed to contain one API containing ONLY ONE module
	 * @return
	 */
	public SectionType generateSection_APIOPS() {

		SectionType section = factory.createSectionType();
		// Title
		TitleType secTitle = factory.createTitleType();
		FeatureMapUtil.addText(secTitle.getMixed(), "Definition of the functions of the package");
		section.getTitle().add(secTitle);

		Iterator<EObject> iter = resource.getContents().iterator();
		//To traverse the resource content
		while (iter.hasNext()) {
			EObject obj = iter.next();

			if (obj instanceof API) {
				API api = (API)obj;
				EList<Module> listModules = api.getModules(); 

				String moduleName = listModules.get(0).getName();
				System.out.println("Modules:" + moduleName);

				//To traverse a list of services
				for (Service service : listModules.get(0).getServices()) {

					if (service.isIsFunction()) {


						System.out.println("Service:" + service.getName());

						// sub-section creation
						SectionType subSection = factory.createSectionType();
						TitleType subSecTitle = factory.createTitleType();
						String functionTitle = "Function " + moduleName + "::" + service.getName();
						FeatureMapUtil.addText(subSecTitle.getMixed(), functionTitle);
						subSection.getTitle().add(subSecTitle);
						section.getSection().add(subSection);

						// access restriction
						{
							ParaType para1 = factory.createParaType();
							EmphasisType emphasis = factory.createEmphasisType();
							emphasis.setRole("bold");
							FeatureMapUtil.addText(emphasis.getMixed(), "Access");
							para1.getEmphasis().add(emphasis);
							subSection.getPara().add(para1);

							ParaType para2 = factory.createParaType();
							if (!service.isAdminOnly())
								FeatureMapUtil.addText(para2.getMixed(), "This function can be used by any VISHNU user");
							else
								FeatureMapUtil.addText(para2.getMixed(), "This function can be used by ADMIN users only");
							subSection.getPara().add(para2);
						}

						//To put service Parameters
						{ 

							List<Port> ports = ApimodelUtils.getPortsByUsage(service, APIUsage.API_ONLY);
							if(ports.size() > 0) {

								ParaType funcParameters = factory.createParaType();
								EmphasisType emphasis1 = factory.createEmphasisType();
								emphasis1.setRole("bold");
								FeatureMapUtil.addText(emphasis1.getMixed(), "Parameters");
								funcParameters.getEmphasis().add(emphasis1);
								subSection.getPara().add(funcParameters);

								ParametersTable parameterstable = new ParametersTable(factory);
								subSection.getInformaltable().add(parameterstable.getTableApi(ports));

							} else {

								ParaType funcParameters = factory.createParaType();
								EmphasisType emphasis1 = factory.createEmphasisType();
								emphasis1.setRole("bold");
								FeatureMapUtil.addText(emphasis1.getMixed(), "Parameters");
								funcParameters.getEmphasis().add(emphasis1);
								subSection.getPara().add(funcParameters);

								String msg = "This command defines no parameters.";
								ParaType docbookMsg = factory.createParaType();
								FeatureMapUtil.addText(docbookMsg.getMixed(), msg);
								subSection.getPara().add(docbookMsg);
							}
						}

						//To put service Description
						{ 
							ParaType funcDesc = factory.createParaType();
							EmphasisType emphasis2 = factory.createEmphasisType();
							emphasis2.setRole("bold");
							FeatureMapUtil.addText(emphasis2.getMixed(), "Description ");
							funcDesc.getEmphasis().add(emphasis2);
							subSection.getPara().add(funcDesc);

							ParaType funcName= factory.createParaType();
							String Description = service.getDescription();
							Description = Description.substring(0,1).toLowerCase()+Description.substring(1);
							Description = "The "+service.getName()+"() function "+Description;
							FeatureMapUtil.addText(funcName.getMixed(), Description);
							subSection.getPara().add(funcName);
						}


						//To put a table of errors code
						{
							ParaType returnvalues = factory.createParaType();
							EmphasisType emphasis3 = factory.createEmphasisType();
							emphasis3.setRole("bold");
							FeatureMapUtil.addText(emphasis3.getMixed(), "Return Value ");
							returnvalues.getEmphasis().add(emphasis3);
							subSection.getPara().add(returnvalues);

							ParaType messagePara = factory.createParaType();
							String message = "An error code is returned when an error occurs during the execution of the function";
							FeatureMapUtil.addText(messagePara.getMixed(), message);
							subSection.getPara().add(messagePara);

							ErrorTypeTable errortable = new ErrorTypeTable(factory);
							subSection.getInformaltable().add(errortable.getTable(service.getResultCodes(), APIUsage.API_ONLY));
						}

						// To service signature
						{
							ParaType funcSign = factory.createParaType();
							EmphasisType emphasis4 = factory.createEmphasisType();
							emphasis4.setRole("bold");
							FeatureMapUtil.addText(emphasis4.getMixed(), "Signature ");
							funcSign.getEmphasis().add(emphasis4);
							subSection.getPara().add(funcSign);

							ServiceSignaturePrinter signPrinter = new ServiceSignaturePrinter(service, _version);
							subSection.getFuncsynopsis().add(signPrinter.getCPPAPISignature());
						}

					} else {
						System.out.println("Service:" + service.getName() + " (EXCLUDED)");
					}
				}
			} // End if
		} // End while
		return section;
	}

	/**
	 * This generates the section containing the class definitions
	 * NOTE: the model is supposed to contain one API containing ONLY ONE module
	 * @return
	 */
	public SectionType generateSection_APIDATA() {

		SectionType section = factory.createSectionType();
		// Title
		TitleType sectionTitle = factory.createTitleType();
		FeatureMapUtil.addText(sectionTitle.getMixed(), "Data types definitions");
		section.getTitle().add(sectionTitle);

		//List<String> ListInstanceClass =  new ArrayList<String>();
		Map<String, URI> InstanceList = new TreeMap<String, URI>();
		//To put a content  of a port if it is an class type or enum type
		Iterator<EObject> iter = resource.getContents().iterator();
		//To traverse the resource content
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof API) {
				EList<Module> listModules = ((API)obj).getModules();
				//To traverse a list of services
				for (Service service : listModules.get(0).getServices()) {
					if (service.isIsFunction()) {
						List<Port> ports = ApimodelUtils.getPortsByUsage(service, APIUsage.API_ONLY);
						addInstanceName(ports, resourceSet, InstanceList);
					}
				}
				String moduleName = listModules.get(0).getName();
				printTypeContent(InstanceList, resourceSet, factory, section, moduleName);
			}
		}

		return section;

	}

	/**
	 * Generates the class/enum definitions sorted for the API
	 * @param InstanceList
	 * @param resourceSet
	 * @param factory
	 * @param section
	 */
	void printTypeContent(Map<String, URI> InstanceList,  ResourceSet resourceSet, 
			DocbookFactory factory, SectionType section, String moduleName) {

		for(Iterator<String> iter = InstanceList.keySet().iterator(); iter.hasNext();) {
			String InstanceName = (String) iter.next();
			URI uri = InstanceList.get(InstanceName);
			Resource Typeresource = resourceSet.createResource(uri);
			loadTyperesource(Typeresource);

			String prefix1 = "Class ";
			String prefix2 = "Enumeration ";
			if(InstanceName.startsWith(prefix1)) 
				InstanceName = InstanceName.substring(prefix1.length());
			if(InstanceName.startsWith(prefix2))
				InstanceName = InstanceName.substring(prefix2.length());

			PackageContentPrinter.content(Typeresource, InstanceName, factory, section, moduleName);

		}
	}

	/**
	 * add the type instance name in the InsatnceList
	 * @param listPort
	 * @param resourceSet
	 * @param InstanceList
	 * @param section
	 */
	void addInstanceName(List<Port> listPort,  ResourceSet resourceSet, Map<String, URI> InstanceList) {

		for (Port port : listPort) {

			URI uri = port.getDataType().getECoreType().eResource().getURI();
			Resource Typeresource = resourceSet.createResource(uri);
			loadTyperesource(Typeresource);
			String instanceTypeName = port.getDataType().getECoreType().getInstanceTypeName();
			PackageContentPrinter.addInstanceName(Typeresource, instanceTypeName, InstanceList, uri);

		}
	}
	/**
	 * Generates the section describing the command line interface commands
	 * NOTE: the model is supposed to contain one API containing ONLY ONE module
	 * @return
	 */
	public SectionType generateSection_CLIOPS() {
		SectionType mainSection = factory.createSectionType();
		// Title
		TitleType sectionTitle = factory.createTitleType();
		FeatureMapUtil.addText(sectionTitle.getMixed(), "Command definitions");
		mainSection.getTitle().add(sectionTitle);

		//To put a content  of a port if it is an class type or enum type
		Iterator<EObject> iter = resource.getContents().iterator();
		//To traverse the resource content
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof API) {
				EList<Module> listModules = ((API)obj).getModules();

				String moduleName = listModules.get(0).getName();
				System.out.println("Modules:" + moduleName);
				//To traverse a list of services
				for (Service service : listModules.get(0).getServices()) {
			
					if (service.isIsCommand()) {
						
						System.out.println("Service:" + service.getName());
						SectionType section = factory.createSectionType();
						String commandName = DocBookGenApimUtils.convertServiceToCommandName(service);

						mainSection.getSection().add(section);
						TitleType secTitle = factory.createTitleType();
						FeatureMapUtil.addText(secTitle.getMixed(), commandName);
						section.getTitle().add(secTitle);

						// access restriction
						{
							ParaType para1 = factory.createParaType();
							EmphasisType emphasis = factory.createEmphasisType();
							emphasis.setRole("bold");
							FeatureMapUtil.addText(emphasis.getMixed(), "Access");
							para1.getEmphasis().add(emphasis);
							section.getPara().add(para1);

							ParaType para2 = factory.createParaType();
							if (!service.isAdminOnly())
								FeatureMapUtil.addText(para2.getMixed(), "This command line can be used by any VISHNU user");
							else
								FeatureMapUtil.addText(para2.getMixed(), "This command line can be used by ADMIN users only");
							section.getPara().add(para2);
						}

						//To put service Description
						{ 
							ParaType funcDesc = factory.createParaType();
							EmphasisType emphasis2 = factory.createEmphasisType();
							emphasis2.setRole("bold");
							FeatureMapUtil.addText(emphasis2.getMixed(), "Description ");
							funcDesc.getEmphasis().add(emphasis2);
							section.getPara().add(funcDesc);

							ParaType funcName= factory.createParaType();
							String Description = service.getDescription();
							Description = Description.substring(0,1).toLowerCase()+Description.substring(1);
							Description = "The "+ commandName +" command "+ Description;
							FeatureMapUtil.addText(funcName.getMixed(), Description);
							section.getPara().add(funcName);
						}

						//To put Example of Use
						{   
							
							ParaType funcExampleUse = factory.createParaType();
							EmphasisType emphasis = factory.createEmphasisType();
							emphasis.setRole("bold");
							FeatureMapUtil.addText(emphasis.getMixed(), "Example of use ");
							funcExampleUse.getEmphasis().add(emphasis);
							section.getPara().add(funcExampleUse);

							ServiceSignaturePrinter sigPrint = new ServiceSignaturePrinter(service, _version);
							CmdsynopsisType cmdSynopsis = sigPrint.getCommandSynopsis();
							section.getCmdsynopsis().add(cmdSynopsis);
						}
						
						//To put service parameters
						{
							ParametersTable parameterstable = new ParametersTable(factory);
							List<Port> ports = ApimodelUtils.getPortsByUsage(service, APIUsage.CLI_ONLY);
							// TODO replace usage of ports by params
							List<CommandParameter> params = CommandParameter.getCommandParameters(service, null);

							ParaType funcParameters = factory.createParaType();
							EmphasisType emphasis1 = factory.createEmphasisType();
							emphasis1.setRole("bold");
							FeatureMapUtil.addText(emphasis1.getMixed(), "Parameters");
							funcParameters.getEmphasis().add(emphasis1);
							section.getPara().add(funcParameters);
							
							InformaltableType paramTable = parameterstable.getTableCmd(ports);
							
							if(!paramTable.getTgroup().getTbody().getRow().isEmpty()) {
								section.getInformaltable().add(paramTable);
							} else {
								String msg = "This command defines no arguments.";
								ParaType docbookMsg = factory.createParaType();
								FeatureMapUtil.addText(docbookMsg.getMixed(), msg);
								section.getPara().add(docbookMsg);
							}
						
							// ENVIRONMENT VARIABLES
							ParaType funcVarEnv = factory.createParaType();
							EmphasisType emphasis3 = factory.createEmphasisType();
							emphasis3.setRole("bold");
							FeatureMapUtil.addText(emphasis3.getMixed(), "Environment variables");
							funcVarEnv.getEmphasis().add(emphasis3);
							section.getPara().add(funcVarEnv);
							
							InformaltableType envVarTable = parameterstable.getTableEnv(params);
							
							if (!envVarTable.getTgroup().getTbody().getRow().isEmpty()) {
								section.getInformaltable().add(envVarTable);
							} else {
								String msg = "This command defines no environment variables.";
								ParaType docbookMsg = factory.createParaType();
								FeatureMapUtil.addText(docbookMsg.getMixed(), msg);
								section.getPara().add(docbookMsg);
							}
						}

					} else {
						System.out.println("Service:" + service.getName() + " (EXCLUDED)");
					}
				}
			}
		}
		return mainSection;
	}

	/**
	 * Generates the data definitions for CLI document
	 * @return
	 */
	public SectionType generateSection_CLIDATA() {
		SectionType section = factory.createSectionType();
		// Title
		TitleType sectionTitle = factory.createTitleType();
		FeatureMapUtil.addText(sectionTitle.getMixed(), "Parameters definitions");
		section.getTitle().add(sectionTitle);

		//List<String> ListInstanceClass =  new ArrayList<String>();
		Map<String, URI> InstanceList = new TreeMap<String, URI>();
		//To put a content  of a port if it is an class type or enum type
		Iterator<EObject> iter = resource.getContents().iterator();
		//To traverse the resource content
		while (iter.hasNext()) {
			EObject obj = iter.next();
			if (obj instanceof API) {
				EList<Module> listModules = ((API)obj).getModules();
				//To traverse a list of services
				for (Service service : listModules.get(0).getServices()) {
					List<Port> ports = ApimodelUtils.getPortsByUsage(service, APIUsage.CLI_ONLY);
					addInstanceName(ports, resourceSet, InstanceList);
				}
				String moduleName = listModules.get(0).getName();
				printTypeContentCmd(InstanceList, resourceSet, factory, section, moduleName);
			}
		}
		return section;
	}

	/**
	 * Generates the class/enum definitions sorted for the CLI
	 * @param InstanceList
	 * @param resourceSet
	 * @param factory
	 * @param section
	 */
	void printTypeContentCmd(Map<String, URI> InstanceList,  ResourceSet resourceSet, 
			DocbookFactory factory, SectionType section, String moduleName) {

		for(Iterator<String> iter = InstanceList.keySet().iterator(); iter.hasNext();) {
			String InstanceName = (String) iter.next();
			URI uri = InstanceList.get(InstanceName);
			Resource Typeresource = resourceSet.createResource(uri);
			loadTyperesource(Typeresource);

			String prefix1 = "Class ";
			String prefix2 = "Enumeration ";
			if(InstanceName.startsWith(prefix1)) 
				InstanceName = InstanceName.substring(prefix1.length());
			if(InstanceName.startsWith(prefix2))
				InstanceName = InstanceName.substring(prefix2.length());

			PackageContentPrinterCmd.content(Typeresource, InstanceName, factory, section, moduleName);

		}
	}

	/**
	 * Generates the section containing all methods of the internal API
	 * NOTE: the model is supposed to contain one API containing ONLY ONE module
	 * FIXME very similar to other generators APIOPS and CLIOPS - REFACTORING NEEDED!!
	 * @return
	 */
	public SectionType generateSection_SERVICES() {

		SectionType section = factory.createSectionType();
		// Title
		TitleType secTitle = factory.createTitleType();
		FeatureMapUtil.addText(secTitle.getMixed(), "Definition of the services of the package");
		section.getTitle().add(secTitle);

		Iterator<EObject> iter = resource.getContents().iterator();
		//To traverse the resource content
		while (iter.hasNext()) {
			EObject obj = iter.next();

			if (obj instanceof API) {
				API api = (API)obj;
				EList<Module> listModules = api.getModules(); 

				String moduleName = listModules.get(0).getName();
				System.out.println("Modules:" + moduleName);

				//To traverse a list of services
				for (Service service : listModules.get(0).getServices()) {

					if (service.isIsFunction()) {

						System.out.println("Service:" + service.getName());
						// sub-section creation
						SectionType subSection = factory.createSectionType();
						TitleType subSecTitle = factory.createTitleType();
						String functionTitle = "Service " + service.getName();
						FeatureMapUtil.addText(subSecTitle.getMixed(), functionTitle);
						subSection.getTitle().add(subSecTitle);
						section.getSection().add(subSection);

						// access restriction
						{
							ParaType para1 = factory.createParaType();
							EmphasisType emphasis = factory.createEmphasisType();
							emphasis.setRole("bold");
							FeatureMapUtil.addText(emphasis.getMixed(), "Access");
							para1.getEmphasis().add(emphasis);
							subSection.getPara().add(para1);

							ParaType para2 = factory.createParaType();
							if (!service.isAdminOnly())
								FeatureMapUtil.addText(para2.getMixed(), "This service can be used by any VISHNU user");
							else
								FeatureMapUtil.addText(para2.getMixed(), "This service can be used by ADMIN users only");
							subSection.getPara().add(para2);
						}

						//To put service Parameters
						{ 

							if(service.getPorts().size() > 0) {

								ParaType funcParameters = factory.createParaType();
								EmphasisType emphasis1 = factory.createEmphasisType();
								emphasis1.setRole("bold");
								FeatureMapUtil.addText(emphasis1.getMixed(), "Parameters");
								funcParameters.getEmphasis().add(emphasis1);
								subSection.getPara().add(funcParameters);

								ParametersTable parameterstable = new ParametersTable(factory);
								subSection.getInformaltable().add(parameterstable.getTableInternalApi(service.getPorts()));

							} else {

								ParaType funcParameters = factory.createParaType();
								EmphasisType emphasis1 = factory.createEmphasisType();
								emphasis1.setRole("bold");
								FeatureMapUtil.addText(emphasis1.getMixed(), "Parameters");
								funcParameters.getEmphasis().add(emphasis1);
								subSection.getPara().add(funcParameters);

								String msg = "This service defines no parameters.";
								ParaType docbookMsg = factory.createParaType();
								FeatureMapUtil.addText(docbookMsg.getMixed(), msg);
								subSection.getPara().add(docbookMsg);
							}
						}

						//To put service Description
						{ 
							ParaType funcDesc = factory.createParaType();
							EmphasisType emphasis2 = factory.createEmphasisType();
							emphasis2.setRole("bold");
							FeatureMapUtil.addText(emphasis2.getMixed(), "Description ");
							funcDesc.getEmphasis().add(emphasis2);
							subSection.getPara().add(funcDesc);

							ParaType funcName= factory.createParaType();
							String Description = service.getDescription();
							Description = Description.substring(0,1).toLowerCase()+Description.substring(1);
							Description = "The "+service.getName()+"() function "+Description;
							FeatureMapUtil.addText(funcName.getMixed(), Description);
							subSection.getPara().add(funcName);
						}


						//To put a table of errors code
						{
							ParaType returnvalues = factory.createParaType();
							EmphasisType emphasis3 = factory.createEmphasisType();
							emphasis3.setRole("bold");
							FeatureMapUtil.addText(emphasis3.getMixed(), "Return Value ");
							returnvalues.getEmphasis().add(emphasis3);
							subSection.getPara().add(returnvalues);

							ParaType messagePara = factory.createParaType();
							String message = "An error code is returned when an error occurs during the execution of the service";
							FeatureMapUtil.addText(messagePara.getMixed(), message);
							subSection.getPara().add(messagePara);

							ErrorTypeTable errortable = new ErrorTypeTable(factory);
							subSection.getInformaltable().add(errortable.getTable(service.getResultCodes(), APIUsage.API_ONLY));
						}
						
						//Usedby services
						{
							ParaType para = factory.createParaType();
							EmphasisType emphasis = factory.createEmphasisType();
							emphasis.setRole("bold");
							FeatureMapUtil.addText(emphasis.getMixed(), "Used by this(these) API function(s): ");
							para.getEmphasis().add(emphasis);
							subSection.getPara().add(para);
							
							ParaType genPara = factory.createParaType();
							String genParaStr = "";
							if (service.getUsedByServices().isEmpty()) {
								genParaStr = "None";
							} else {
								for (int i=0; i < service.getUsedByServices().size(); i++) {
									Service usedByService = service.getUsedByServices().get(i);
									genParaStr += usedByService.getModule().getName() + "::" + usedByService.getName();
									if (i < service.getUsedByServices().size() - 1) {
										genParaStr += ", ";
									}
								}
							}
							FeatureMapUtil.addText(genPara.getMixed(), genParaStr);
							subSection.getPara().add(genPara);
						}

					} else {
						System.out.println("Service:" + service.getName() + " (EXCLUDED)");
					}
				}
			} // End if
		} // End while
		return section;
	}

	
	
	@Override
	/**
	 * Generates a reference section
	 * @srcRef	the definition and parameters of the reference section
	 */
	public ReferenceType generateReference(String srcRef) {
		ReferenceType ref = null;
		
		if (srcRef.startsWith("MAN")) {
			ref = generateReference_MAN(srcRef);
		} else if (srcRef.startsWith("CPP")) {
			ref = generateReference_CPP(srcRef);
		} else if (srcRef.startsWith("PYTHON")) {
			ref = generateReference_Python(srcRef);
		} else {
			System.err.println("ERROR: unknown reference tag '" + srcRef +"'");
		}
		
		return ref;
	}
	
	/**
	 * Generates the reference containing all the man pages of the API
	 * @param srcRef
	 * @return
	 */
	public ReferenceType generateReference_MAN(String srcRef) {
		
		// Create the reference
		ReferenceType ref = factory.createReferenceType();
		
		// The title of the reference is added at the end of the function and uses
		// the module name found inside the APIM
		String moduleName = "";
		
		// Extract the argument of the generator ('admin' or 'user')
		String arg = extractRefParam(srcRef);
		Iterator<EObject> iter = resource.getContents().iterator();
		
		// Process the first Module found within the API
		while (iter.hasNext()) {
			EObject obj = iter.next();

			if (obj instanceof API) {
				API api = (API)obj;
				EList<Module> listModules = api.getModules(); 
				moduleName = listModules.get(0).getName();
				System.out.println("Modules:" + moduleName);

				// Process all services that are commands and that match the argument (user/admin)
				for (Service service : listModules.get(0).getServices()) {

					if (service.isIsCommand() 
							&& ((arg.equals("user") && !service.isAdminOnly()) 
									|| (arg.equals("admin") && service.isAdminOnly())
									|| (arg.equals("all")) ))
					{
						System.out.println("Service:" + service.getName());
						// Create reference entry
						RefEntryType entry = factory.createRefEntryType();
						ref.getRefentry().add(entry);
						
						// Add meta-information
						RefMetaType meta = factory.createRefMetaType();
						entry.setRefmeta(meta);
						meta.setManvolnum("1");
						RefEntryTitleType entryTitle = factory.createRefEntryTitleType();
						// Ref entry title is the title of the section within the reference
						meta.setRefentrytitle(entryTitle);
						FeatureMapUtil.addText(entryTitle.getMixed(), DocBookGenApimUtils.convertServiceToCommandName(service));
						
						// Add Name information
						RefNameDivType nameDiv = factory.createRefNameDivType();
						entry.setRefnamediv(nameDiv);
						nameDiv.setRefname(DocBookGenApimUtils.convertServiceToCommandName(service));
						nameDiv.setRefpurpose(service.getDescription());
						
						// Add Synopsis of the command
						RefSynopsisDivType synopsis = factory.createRefSynopsisDivType();
						entry.setRefsynopsisdiv(synopsis);
						ServiceSignaturePrinter sigPrint = new ServiceSignaturePrinter(service, _version);
						synopsis.getCmdsynopsis().add(sigPrint.getCommandSynopsis());
						
						// Add Description
						RefSect1Type desc = createRefSect1(entry, "DESCRIPTION");
						String descValue = service.getDetails().get("description");
						if ((descValue != null) && !descValue.isEmpty()) {
							ParaType para = factory.createParaType();
							desc.getPara().add(para);
							FeatureMapUtil.addText(para.getMixed(), descValue);
						} else {
							System.err.println("WARNING: missing long description for service '" + service.getName() + "'");
						}
						
						// Add Options section
						VariableListType varList = sigPrint.getCommandOptionsList();
						if (!varList.getVarlistentry().isEmpty()) {
							RefSect1Type options = createRefSect1(entry, "OPTIONS");
							options.getVariablelist().add(varList);
						}
						
						// Add Files section TODO
						
						// Add Environment section
						if(service.isUseJobEnv()) {
							VariableListType jobEnvVarList = sigPrint.getJobEnvVarList(api);
							if (!jobEnvVarList.getVarlistentry().isEmpty()) {
								RefSect1Type envVars = createRefSect1(entry, "JOB OUTPUT ENVIRONMENT VARIABLES");
								ParaType para = factory.createParaType();
								envVars.getPara().add(para);
								String jobEnvDesc = "The VISHNU Job Manager set the following variables in the environment of the batch script.";
								FeatureMapUtil.addText(para.getMixed(), jobEnvDesc);
								envVars.getVariablelist().add(jobEnvVarList);
							}
						}
						
						// Add Environment section
						VariableListType envVarList = sigPrint.getCommandEnvVarList(api);
						if (!envVarList.getVarlistentry().isEmpty()) {
							RefSect1Type envVars = createRefSect1(entry, "ENVIRONMENT");
							envVars.getVariablelist().add(envVarList);
						}
						
						// Add Diagnostics section
						VariableListType errList = sigPrint.getCommandErrorCodes(APIUsage.CLI_ONLY);
						if (!errList.getVarlistentry().isEmpty()) {
							RefSect1Type diag = createRefSect1(entry, "DIAGNOSTICS");
							ParaType errPara = factory.createParaType();
							FeatureMapUtil.addText(errPara.getMixed(), "The following diagnostics may be issued on stderr and the command will return the code provided within brackets: ");
							diag.getPara().add(errPara);
							diag.getVariablelist().add(errList);
						}
						
						// Show an example of use
						RefSect1Type diag = createRefSect1(entry, "EXAMPLE");
						java.util.StringTokenizer tokenizer = new java.util.StringTokenizer(service.getDetails().get("exCLI"), "\n");
						while ( tokenizer.hasMoreTokens() ) {
							ParaType errPara = factory.createParaType();
							FeatureMapUtil.addText(errPara.getMixed(), tokenizer.nextToken());
							diag.getPara().add(errPara);
						}
					} else {
						System.out.println("Service:" + service.getName() + " (EXCLUDED)");
					}
				}
			} // End if
		} // End while
		
		// Add title to reference
		TitleType refTitle = factory.createTitleType();
		ref.setTitle(refTitle);
		FeatureMapUtil.addText(refTitle.getMixed(), moduleName + " Command reference");
		
		return ref;
	}
	
	/**
	 * Generates the reference containing all the functions of the C++ API
	 * TODO refactoring with previous function
	 * @param srcRef
	 * @return
	 */
	public ReferenceType generateReference_CPP(String srcRef) {
		
		// Create the reference
		ReferenceType ref = factory.createReferenceType();
		
		// The title of the reference is added at the end of the function and uses
		// the module name found inside the APIM
		String moduleName = "";
		
		// Extract the argument of the generator ('admin' or 'user')
		String arg = extractRefParam(srcRef);
		Iterator<EObject> iter = resource.getContents().iterator();
		
		// Process the first Module found within the API
		while (iter.hasNext()) {
			EObject obj = iter.next();

			if (obj instanceof API) {
				API api = (API)obj;
				EList<Module> listModules = api.getModules(); 

				moduleName = listModules.get(0).getName();
				System.out.println("Modules:" + moduleName);

				// Process all services that are functions and that match the argument (user/admin)
				for (Service service : listModules.get(0).getServices()) {

					if (service.isIsFunction()
							&& ((arg.equals("user") && !service.isAdminOnly()) 
									|| (arg.equals("admin") && service.isAdminOnly())
									|| (arg.equals("all")) ))
					{
						System.out.println("Service:" + service.getName());
						
						// Create reference entry
						RefEntryType entry = factory.createRefEntryType();
						ref.getRefentry().add(entry);
						
						// Add meta-information
						RefMetaType meta = factory.createRefMetaType();
						entry.setRefmeta(meta);
						meta.setManvolnum("3");
						RefEntryTitleType entryTitle = factory.createRefEntryTitleType();
						// Ref entry title is the title of the section within the reference
						meta.setRefentrytitle(entryTitle);
						FeatureMapUtil.addText(entryTitle.getMixed(), service.getName());
						
						// Add Name information
						RefNameDivType nameDiv = factory.createRefNameDivType();
						entry.setRefnamediv(nameDiv);
						nameDiv.setRefname(service.getName());
						nameDiv.setRefpurpose(service.getDescription());
						
						// Add Synopsis of the command
						RefSynopsisDivType synopsis = factory.createRefSynopsisDivType();
						entry.setRefsynopsisdiv(synopsis);
						ServiceSignaturePrinter sigPrint = new ServiceSignaturePrinter(service, _version);
						synopsis.getFuncsynopsis().add(sigPrint.getCPPAPISignature());
						
						// Add Description
						RefSect1Type desc = createRefSect1(entry, "DESCRIPTION");
						String descValue = service.getDetails().get("description");
						if ((descValue != null) && !descValue.isEmpty()) {
							ParaType para = factory.createParaType();
							desc.getPara().add(para);
							FeatureMapUtil.addText(para.getMixed(), descValue);
						} else {
							System.err.println("WARNING: missing long description for service '" + service.getName() + "'");
						}
						
						// Add Parameters section
						VariableListType varList = sigPrint.getCppArgumentsList();
						if (!varList.getVarlistentry().isEmpty()) {
							RefSect1Type options = createRefSect1(entry, "ARGUMENTS");
							options.getVariablelist().add(varList);
						}
						
						// Add Exceptions section
						VariableListType errList = sigPrint.getCommandErrorCodes(APIUsage.API_ONLY);
						if (!errList.getVarlistentry().isEmpty()) {
							RefSect1Type diag = createRefSect1(entry, "EXCEPTIONS");
							ParaType errPara = factory.createParaType();
							FeatureMapUtil.addText(errPara.getMixed(), "The following exceptions may be thrown: ");
							diag.getPara().add(errPara);
							diag.getVariablelist().add(errList);
						}
						
					} else {
						System.out.println("Service:" + service.getName() + " (EXCLUDED)");
					}
				}
			} // End if
		} // End while
		
		// Add title to reference
		TitleType refTitle = factory.createTitleType();
		ref.setTitle(refTitle);
		FeatureMapUtil.addText(refTitle.getMixed(), moduleName + " C++ API Reference");
		
		return ref;
	}
	/**
	 * Generates the reference containing all the functions of the Python API
	 * TODO refactoring with previous function
	 * @param srcRef
	 * @return
	 */
	public ReferenceType generateReference_Python(String srcRef) {
		
		// Create the reference
		ReferenceType ref = factory.createReferenceType();
		
		// The title of the reference is added at the end of the function and uses
		// the module name found inside the APIM
		String moduleName = "";
		
		// Extract the argument of the generator ('admin' or 'user')
		String arg = extractRefParam(srcRef);
		Iterator<EObject> iter = resource.getContents().iterator();
		
		// Process the first Module found within the API
		while (iter.hasNext()) {
			EObject obj = iter.next();

			if (obj instanceof API) {
				API api = (API)obj;
				EList<Module> listModules = api.getModules(); 

				moduleName = listModules.get(0).getName();
				System.out.println("Modules:" + moduleName);

				// Process all services that are functions and that match the argument (user/admin)
				for (Service service : listModules.get(0).getServices()) {

					if (service.isIsFunction()
							&& ((arg.equals("user") && !service.isAdminOnly()) 
									|| (arg.equals("admin") && service.isAdminOnly())
									|| (arg.equals("all")) ))
					{
						System.out.println("Service:" + service.getName());
						
						// Create reference entry
						RefEntryType entry = factory.createRefEntryType();
						ref.getRefentry().add(entry);
						
						// Add meta-information
						RefMetaType meta = factory.createRefMetaType();
						entry.setRefmeta(meta);
						meta.setManvolnum("3");
						RefEntryTitleType entryTitle = factory.createRefEntryTitleType();
						// Ref entry title is the title of the section within the reference
						meta.setRefentrytitle(entryTitle);
						FeatureMapUtil.addText(entryTitle.getMixed(), "VISHNU." + service.getName());
						
						// Add Name information
						RefNameDivType nameDiv = factory.createRefNameDivType();
						entry.setRefnamediv(nameDiv);
						nameDiv.setRefname("VISHNU." + service.getName());
						nameDiv.setRefpurpose(service.getDescription());
						
						// Add Synopsis of the command
						RefSynopsisDivType synopsis = factory.createRefSynopsisDivType();
						entry.setRefsynopsisdiv(synopsis);
						ServiceSignaturePrinter sigPrint = new ServiceSignaturePrinter(service, _version);
						synopsis.getFuncsynopsis().add(sigPrint.getPythonAPISignature());
						
						// Add Description
						RefSect1Type desc = createRefSect1(entry, "DESCRIPTION");
						String descValue = service.getDetails().get("description");
						if ((descValue != null) && !descValue.isEmpty()) {
							ParaType para = factory.createParaType();
							desc.getPara().add(para);
							FeatureMapUtil.addText(para.getMixed(), descValue);
						} else {
							System.err.println("WARNING: missing long description for service '" + service.getName() + "'");
						}
						
						// Add Parameters section
						VariableListType varList = sigPrint.getPythonArgumentsList();
						if (!varList.getVarlistentry().isEmpty()) {
							RefSect1Type options = createRefSect1(entry, "ARGUMENTS");
							options.getVariablelist().add(varList);
						}
						
						// Add Output section
						VariableListType outList = sigPrint.getPythonOutputsList();
						if (!outList.getVarlistentry().isEmpty()) {
							RefSect1Type options = createRefSect1(entry, "RETURNED OBJECTS");
							options.getVariablelist().add(outList);
						}
						
						// Add Exceptions section
						VariableListType errList = sigPrint.getFunctionExceptions();
						if (!errList.getVarlistentry().isEmpty()) {
							RefSect1Type diag = createRefSect1(entry, "EXCEPTIONS");
							ParaType errPara = factory.createParaType();
							FeatureMapUtil.addText(errPara.getMixed(), "The following exceptions may be thrown: ");
							diag.getPara().add(errPara);
							diag.getVariablelist().add(errList);
						}
						
					} else {
						System.out.println("Service:" + service.getName() + " (EXCLUDED)");
					}
				}
			} // End if
		} // End while
		
		// Add title to reference
		TitleType refTitle = factory.createTitleType();
		ref.setTitle(refTitle);
		FeatureMapUtil.addText(refTitle.getMixed(), moduleName + " Python API Reference");
		
		return ref;
	}
	
	/**
	 * Creates a new 'refsect1' section within a reference entry, with the given name
	 * @param entry		the parent 'refentry' object
	 * @param name		the title of the section
	 * @return			the refsect1 object
	 */
	private RefSect1Type createRefSect1(RefEntryType entry, String name) {
		RefSect1Type sect = factory.createRefSect1Type();
		entry.getRefsect1().add(sect);
		sect.setId(name.toLowerCase());
		
		TitleType optTitle = factory.createTitleType();
		sect.setTitle(optTitle);
		FeatureMapUtil.addText(optTitle.getMixed(), name);
		
		return sect;
	}
	
	private String extractRefParam(String ref) {
		String param = null;
		if (ref.endsWith(")") && ref.contains("(")) {
			param = ref.substring(ref.indexOf("(")+1, ref.length()-1);
		}
		return param;
	}

}
