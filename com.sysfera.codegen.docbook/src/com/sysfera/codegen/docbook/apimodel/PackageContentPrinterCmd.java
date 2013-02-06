package com.sysfera.codegen.docbook.apimodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.TbodyType;

public class PackageContentPrinterCmd {


	public static void content(Resource Typeresource, String instanceTypeName, 
			DocbookFactory factory, SectionType section, List<String> ListInstanceClass) {

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
								List<EObject> childObject =  new ArrayList<EObject>();

								if((eclass.getInstanceTypeName().compareTo(instanceTypeName)==0 ) && !ListInstanceClass.contains(instanceTypeName)) {

									ListInstanceClass.add(instanceTypeName);

									ClassTable classtable = new ClassTable(factory);
									TbodyType tbody = factory.createTbodyType();
									InformaltableType tab = classtable.createTable(tbody);

									ParaType objectName = factory.createParaType();
									EmphasisType emphasisobjectName = factory.createEmphasisType();
									emphasisobjectName.setRole("bold");
									FeatureMapUtil.addText(emphasisobjectName.getMixed(), instanceTypeName+" " +
									"Class Content");
									objectName.setId(instanceTypeName); //To set a reference id
									objectName.getEmphasis().add(emphasisobjectName);
									//section.getPara().add(objectName);

									EList<EObject> classType = eclass.eContents();
									for(int j=0; j < classType.size(); j++) {
										boolean isClassType = false;
										String prefix ="";
										String Name = "Error";
										String InstanceName = "Error";
										String Desc = "TO DO";


										if(classType.get(j) instanceof EAttribute) {
											EAttribute attr = (EAttribute)classType.get(j);
											Name = attr.getName();
											InstanceName = attr.getEAttributeType().getInstanceTypeName();
											if(attr.getUpperBound()==-1) prefix = "List of ";
											if(attr.getEAnnotation("Description")!=null) 
												Desc = attr.getEAnnotation("Description").getDetails().get("content");

											if(attr.getEType() instanceof EEnum) {
												childObject.add(attr.getEType());
												isClassType = true;
											}
										}
										else if(classType.get(j) instanceof EEnum) {
											EEnum enumtype = (EEnum)classType.get(j);
											Name = enumtype.getName();
											InstanceName = enumtype.getInstanceTypeName();
											if(enumtype.getEAnnotation("Description")!=null) 
												Desc = enumtype.getEAnnotation("Description").getDetails().get("content");
										}
										else if(classType.get(j) instanceof EClass) {
											EClass eclasstype = ( EClass)classType.get(j);
											Name =  eclasstype.getName();
											InstanceName =  eclasstype.getInstanceTypeName();

											if(eclasstype.getEAnnotation("Description")!=null) 
												Desc = eclasstype.getEAnnotation("Description").getDetails().get("content");


											EList<EReference> classRef = eclasstype.getEReferences();
											for(int k=0; k < classRef.size(); k++) {
												if(classRef.get(k) instanceof EEnum)
												{
													childObject.add(classRef.get(k));
												}
											}
											isClassType = true;
										}
										else if(classType.get(j) instanceof EReference) {
											EReference ereference = (EReference)classType.get(j);
											Name = ereference.getName();
											InstanceName = ereference.getEType().getInstanceTypeName();
											if(ereference.getUpperBound()==-1) prefix = "List of ";

											if(ereference.getEAnnotation("Description")!=null) 
												Desc = ereference.getEAnnotation("Description").getDetails().get("content");

											if(ereference.getEType() instanceof EEnum) {
												childObject.add(ereference.getEType());
												isClassType = true;
											}
										}
										if(InstanceName.compareTo("java.lang.String")==0)  InstanceName = "string";
										//classtable.addRow(tbody, Name, prefix+InstanceName, Desc, isClassType);
										//section.getInformaltable().add(tab);
									} //Endof for classType.size()
									for(int k=0; k < childObject.size(); k++) {
										ClassContentPrinter.content(childObject.get(k), factory, section, ListInstanceClass);
									}
									return;
								} //End of eclass.getInstanceTypeName().compareTo(instanceTypeName) 

							}  //End of EClass
							else if(datacontent.get(i) instanceof EEnum) {

								EEnum enumobj = (EEnum)datacontent.get(i);	
								String instanceName = enumobj.getInstanceTypeName();

								if((instanceName.compareTo(instanceTypeName)==0) && !ListInstanceClass.contains(instanceTypeName)){

									ListInstanceClass.add(instanceTypeName);

									EnumTable enumtable = new EnumTable(factory);
									TbodyType tbody = factory.createTbodyType();
									InformaltableType tab = enumtable.createTable(tbody);

									ParaType objectName = factory.createParaType();
									EmphasisType emphasisobjectName = factory.createEmphasisType();
									emphasisobjectName.setRole("bold");
									FeatureMapUtil.addText(emphasisobjectName.getMixed(), instanceName+" Enumeration Type");
									objectName.getEmphasis().add(emphasisobjectName);
									objectName.setId(instanceTypeName); //To set a reference id
									section.getPara().add(objectName);

									EList<EEnumLiteral> enumType = enumobj.getELiterals();
									for(int j=0; j < enumType.size(); j++) {
										String value = enumType.get(j).getValue()+"";
										enumtable.addRow(tbody, enumType.get(j).getName(), value);
										section.getInformaltable().add(tab);
									}
									return;
								}
							}
							else if(datacontent.get(i) instanceof EPackage) {
								content(Typeresource, instanceTypeName, factory, section, ListInstanceClass);
								return;
							}
						} //End of datacontent.size()
					} //End of data.getName().compareTo("ecore")

				} //End of EPackage
			} // End of Wile
		} //End of If
	}

	public static void addInstanceName(Resource Typeresource, String instanceTypeName, Map<String, URI> InstanceList, URI uri) {

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
								List<EObject> childObject =  new ArrayList<EObject>();

								if((eclass.getInstanceTypeName().compareTo(instanceTypeName)==0 ) && !InstanceList.containsKey(instanceTypeName)) {

									InstanceList.put("Class "+instanceTypeName, uri);

									EList<EObject> classType = eclass.eContents();
									for(int j=0; j < classType.size(); j++) {
										boolean isClassType = false;
										String prefix ="";
										String Name = "Error";
										String InstanceName = "Error";
										String Desc = "TO DO";


										if(classType.get(j) instanceof EAttribute) {
											EAttribute attr = (EAttribute)classType.get(j);
											Name = attr.getName();
											InstanceName = attr.getEAttributeType().getInstanceTypeName();
											if(attr.getUpperBound()==-1) prefix = "List of ";
											if(attr.getEAnnotation("Description")!=null) 
												Desc = attr.getEAnnotation("Description").getDetails().get("content");

											if(attr.getEType() instanceof EEnum) {
												childObject.add(attr.getEType());
												isClassType = true;
											}
										}
										else if(classType.get(j) instanceof EEnum) {
											EEnum enumtype = (EEnum)classType.get(j);
											Name = enumtype.getName();
											InstanceName = enumtype.getInstanceTypeName();
											if(enumtype.getEAnnotation("Description")!=null) 
												Desc = enumtype.getEAnnotation("Description").getDetails().get("content");
										}
										else if(classType.get(j) instanceof EClass) {
											EClass eclasstype = ( EClass)classType.get(j);
											Name =  eclasstype.getName();
											InstanceName =  eclasstype.getInstanceTypeName();

											if(eclasstype.getEAnnotation("Description")!=null) 
												Desc = eclasstype.getEAnnotation("Description").getDetails().get("content");


											EList<EReference> classRef = eclasstype.getEReferences();
											for(int k=0; k < classRef.size(); k++) {
												if(classRef.get(k) instanceof EEnum)
												{
													childObject.add(classRef.get(k));
												}
											}
											isClassType = true;
										}
										else if(classType.get(j) instanceof EReference) {
											EReference ereference = (EReference)classType.get(j);
											Name = ereference.getName();
											InstanceName = ereference.getEType().getInstanceTypeName();
											if(ereference.getUpperBound()==-1) prefix = "List of ";

											if(ereference.getEAnnotation("Description")!=null) 
												Desc = ereference.getEAnnotation("Description").getDetails().get("content");

											if(ereference.getEType() instanceof EEnum) {
												childObject.add(ereference.getEType());
												isClassType = true;
											}
										}
										if(InstanceName.compareTo("java.lang.String")==0)  InstanceName = "string";
										//classtable.addRow(tbody, Name, prefix+InstanceName, Desc, isClassType);
										//section.getInformaltable().add(tab);
									} //Endof for classType.size()
									for(int k=0; k < childObject.size(); k++) {
										ClassContentPrinter.addInstanceName(childObject.get(k), InstanceList, uri);
									}
									return;
								} //End of eclass.getInstanceTypeName().compareTo(instanceTypeName) 

							}  //End of EClass
							else if(datacontent.get(i) instanceof EEnum) {

								EEnum enumobj = (EEnum)datacontent.get(i);	
								String instanceName = enumobj.getInstanceTypeName();

								if((instanceName.compareTo(instanceTypeName)==0) && !InstanceList.containsKey(instanceTypeName)){

									InstanceList.put("Enumeration "+instanceTypeName, uri);

									return;
								}
							}
							else if(datacontent.get(i) instanceof EPackage) {
								addInstanceName(Typeresource, instanceTypeName, InstanceList, uri);
								return;
							}
						} //End of datacontent.size()
					} //End of data.getName().compareTo("ecore")

				} //End of EPackage
			} // End of Wile
		} //End of If


	}


	public static void content(Resource Typeresource, String instanceTypeName, 
			DocbookFactory factory, SectionType section, String moduleName) {

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

									ClassTable classtable = new ClassTable(factory);
									TbodyType tbody = factory.createTbodyType();
									InformaltableType tab = classtable.createTable(tbody);

									ParaType objectName = factory.createParaType();
									EmphasisType emphasisobjectName = factory.createEmphasisType();
									emphasisobjectName.setRole("bold");
									FeatureMapUtil.addText(emphasisobjectName.getMixed(), "Class "+moduleName+"::"+instanceTypeName+
									" Content");
									objectName.setId(instanceTypeName); //To set a reference id
									objectName.getEmphasis().add(emphasisobjectName);
									//section.getPara().add(objectName);

									EList<EObject> classType = eclass.eContents();
									for(int j=0; j < classType.size(); j++) {
										boolean isClassType = false;
										String prefix ="";
										String Name = "Error";
										String InstanceName = "Error";
										String Desc = "TO DO";


										if(classType.get(j) instanceof EAttribute) {
											EAttribute attr = (EAttribute)classType.get(j);
											Name = attr.getName();
											InstanceName = attr.getEAttributeType().getInstanceTypeName();
											if(attr.getUpperBound()==-1) prefix = "List of ";
											if(attr.getEAnnotation("Description")!=null) 
												Desc = attr.getEAnnotation("Description").getDetails().get("content");

											if(attr.getEType() instanceof EEnum) {
												isClassType = true;
											}
										}
										else if(classType.get(j) instanceof EEnum) {
											EEnum enumtype = (EEnum)classType.get(j);
											Name = enumtype.getName();
											InstanceName = enumtype.getInstanceTypeName();
											if(enumtype.getEAnnotation("Description")!=null) 
												Desc = enumtype.getEAnnotation("Description").getDetails().get("content");
										}
										else if(classType.get(j) instanceof EClass) {
											EClass eclasstype = ( EClass)classType.get(j);
											Name =  eclasstype.getName();
											InstanceName =  eclasstype.getInstanceTypeName();

											if(eclasstype.getEAnnotation("Description")!=null) 
												Desc = eclasstype.getEAnnotation("Description").getDetails().get("content");

											isClassType = true;
										}
										else if(classType.get(j) instanceof EReference) {
											EReference ereference = (EReference)classType.get(j);
											Name = ereference.getName();
											InstanceName = ereference.getEType().getInstanceTypeName();
											if(ereference.getUpperBound()==-1) prefix = "List of ";

											if(ereference.getEAnnotation("Description")!=null) 
												Desc = ereference.getEAnnotation("Description").getDetails().get("content");
											isClassType = true;
										}
										if(InstanceName.compareTo("java.lang.String")==0)  InstanceName = "string";
										//classtable.addRow(tbody, Name, prefix+InstanceName, Desc, isClassType);
										//section.getInformaltable().add(tab);
									} //Endof for classType.size()

									return;
								} //End of eclass.getInstanceTypeName().compareTo(instanceTypeName) 

							}  //End of EClass
							else if(datacontent.get(i) instanceof EEnum) {

								EEnum enumobj = (EEnum)datacontent.get(i);	
								String instanceName = enumobj.getInstanceTypeName();

								if((instanceName.compareTo(instanceTypeName)==0)){

									EnumTable enumtable = new EnumTable(factory);
									TbodyType tbody = factory.createTbodyType();
									InformaltableType tab = enumtable.createTable(tbody);

									ParaType objectName = factory.createParaType();
									EmphasisType emphasisobjectName = factory.createEmphasisType();
									emphasisobjectName.setRole("bold");
									FeatureMapUtil.addText(emphasisobjectName.getMixed(), "Enumeration "+moduleName+"::"+instanceName+" Type");
									objectName.getEmphasis().add(emphasisobjectName);
									objectName.setId(instanceTypeName); //To set a reference id
									section.getPara().add(objectName);

									EList<EEnumLiteral> enumType = enumobj.getELiterals();
									for(int j=0; j < enumType.size(); j++) {
										String value = enumType.get(j).getValue()+"";
										enumtable.addRow(tbody, enumType.get(j).getName(), value);
										section.getInformaltable().add(tab);
									}
									return;
								}
							}
							else if(datacontent.get(i) instanceof EPackage) {
								content(Typeresource, instanceTypeName, factory, section, moduleName);
								return;
							}
						} //End of datacontent.size()
					} //End of data.getName().compareTo("ecore")

				} //End of EPackage
			} // End of Wile
		} //End of If
	}
}
