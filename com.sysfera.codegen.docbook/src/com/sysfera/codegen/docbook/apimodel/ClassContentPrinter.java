package com.sysfera.codegen.docbook.apimodel;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.TbodyType;

public class ClassContentPrinter {


	public static void content(EObject eobject, DocbookFactory factory, SectionType section, List<String> ListInstanceClass) {


		List<EObject> childObject =  new ArrayList<EObject>();

		if(eobject instanceof EClass) {

			EClass eclass = (EClass)eobject;

			String instanceTypeName = eclass.getInstanceTypeName();
			if(!ListInstanceClass.contains(instanceTypeName)) {

				ListInstanceClass.add(instanceTypeName);

				ClassTable classtable = new ClassTable(factory);
				TbodyType tbody = factory.createTbodyType();
				InformaltableType tab = classtable.createTable(tbody);

				ParaType objectName = factory.createParaType();
				EmphasisType emphasisobjectName = factory.createEmphasisType();
				emphasisobjectName.setRole("bold");
				FeatureMapUtil.addText(emphasisobjectName.getMixed(), instanceTypeName+" Class Content");
				objectName.getEmphasis().add(emphasisobjectName);
				objectName.setId(instanceTypeName); //To set the reference id
				section.getPara().add(objectName);

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

						if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
								|| (attr.getEType() instanceof EReference)) {
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
						isClassType = true;
					}
					else if(classType.get(j) instanceof EClass) {
						EClass eclasstype = ( EClass)classType.get(j);
						Name =  eclasstype.getName();
						InstanceName =  eclasstype.getInstanceTypeName();
						if(eclasstype.getEAnnotation("Description")!=null) 
							Desc = eclasstype.getEAnnotation("Description").getDetails().get("content");

						EList<EReference> classRef = eclasstype.getEReferences();
						for(int k=0; k < classRef.size(); k++) {
							if((classRef.get(k) instanceof EClass) || (classRef.get(k) instanceof EEnum) 
									|| (classRef.get(k) instanceof EReference) )
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

						if((ereference.getEType() instanceof EClass) || (ereference.getEType() instanceof EEnum)
								|| (ereference.getEType() instanceof EReference)) {
							childObject.add(ereference.getEType());
						}
						isClassType = true;
					}
					if(InstanceName.compareTo("java.lang.String")==0)  InstanceName = "string";
					classtable.addRow(tbody, Name, prefix+InstanceName, Desc, isClassType);
					section.getInformaltable().add(tab);
				} //Endof for classType.size()
				for(int k=0; k < childObject.size(); k++) {
					ClassContentPrinter.content(childObject.get(k), factory, section, ListInstanceClass);
				}
			}
		}
		else if(eobject instanceof EReference) {

			EReference eclass = (EReference)eobject;	
			String instanceTypeName = eclass.getEType().getInstanceTypeName();
			if(!ListInstanceClass.contains(instanceTypeName)) {

				ListInstanceClass.add(instanceTypeName);
				TbodyType tbody = factory.createTbodyType();
				ClassTable classtable = new ClassTable(factory);
				InformaltableType tab = classtable.createTable(tbody);

				ParaType objectName = factory.createParaType();
				EmphasisType emphasisobjectName = factory.createEmphasisType();
				emphasisobjectName.setRole("bold");
				FeatureMapUtil.addText(emphasisobjectName.getMixed(), instanceTypeName+" Class Content");
				objectName.getEmphasis().add(emphasisobjectName);
				objectName.setId(instanceTypeName); //To set a reference id
				section.getPara().add(objectName);

				EList<EObject> classType = eclass.getEType().eContents();
				for(int j=0; j < classType.size(); j++) {
					boolean isClassType = false;
					String prefix="";
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

						if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
								|| (attr.getEType() instanceof EReference)) {
							childObject.add(attr);
							isClassType = true;
						}
					}
					else if(classType.get(j) instanceof EEnum) {
						EEnum enumtype = (EEnum)classType.get(j);
						Name = enumtype.getName();
						InstanceName = enumtype.getInstanceTypeName();
						if(enumtype.getEAnnotation("Description")!=null) 
							Desc = enumtype.getEAnnotation("Description").getDetails().get("content");
						isClassType = true;
					}
					else if(classType.get(j) instanceof EClass) {
						EClass eclasstype = ( EClass)classType.get(j);
						Name =  eclasstype.getName();
						InstanceName =  eclasstype.getInstanceTypeName();
						if(eclasstype.getEAnnotation("Description")!=null) 
							Desc = eclasstype.getEAnnotation("Description").getDetails().get("content");

						EList<EReference> classRef = eclasstype.getEReferences();
						for(int k=0; k < classRef.size(); k++) {
							if((classRef.get(k) instanceof EClass) || (classRef.get(k) instanceof EEnum) 
									|| (classRef.get(k) instanceof EReference) )
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

						if((ereference.getEType() instanceof EClass) || (ereference.getEType() instanceof EEnum)
								|| (ereference.getEType() instanceof EReference)) {
							childObject.add(ereference.getEType());
						}
						isClassType = true;
					}
					if(InstanceName.compareTo("java.lang.String")==0)  InstanceName = "string";
					classtable.addRow(tbody, Name, prefix+InstanceName, Desc, isClassType);
					section.getInformaltable().add(tab);
				} //Endof for classType.size()
				for(int k=0; k < childObject.size(); k++) {
					ClassContentPrinter.content(childObject.get(k), factory, section, ListInstanceClass);
				}
			}
		} 
		else if(eobject instanceof EEnum) {

			EEnum enumobj = (EEnum)eobject;	
			String instanceTypeName = enumobj.getInstanceTypeName();
			if(!ListInstanceClass.contains(instanceTypeName)) {

				ListInstanceClass.add(instanceTypeName);
				EnumTable enumtable = new EnumTable(factory);
				TbodyType tbody = factory.createTbodyType();
				InformaltableType tab = enumtable.createTable(tbody);

				ParaType objectName = factory.createParaType();
				EmphasisType emphasisobjectName = factory.createEmphasisType();
				emphasisobjectName.setRole("bold");
				FeatureMapUtil.addText(emphasisobjectName.getMixed(), instanceTypeName+" Enumeration Type");
				objectName.getEmphasis().add(emphasisobjectName);
				objectName.setId(instanceTypeName); //To set a reference id
				section.getPara().add(objectName);

				EList<EEnumLiteral> enumType = enumobj.getELiterals();
				for(int j=0; j < enumType.size(); j++) {
					String value = enumType.get(j).getValue()+"";
					enumtable.addRow(tbody, enumType.get(j).getName(), value);
					section.getInformaltable().add(tab);
				}
			}
		} 
	}

	public static void addInstanceName(EObject eobject, Map<String, URI> InstanceList, URI uri) {


		List<EObject> childObject =  new ArrayList<EObject>();

		if(eobject instanceof EClass) {

			EClass eclass = (EClass)eobject;

			String instanceTypeName = eclass.getInstanceTypeName();
			if(!InstanceList.containsKey(instanceTypeName)) {

				InstanceList.put("Class "+instanceTypeName, uri);

				EList<EObject> classType = eclass.eContents();
				for(int j=0; j < classType.size(); j++) {

					if(classType.get(j) instanceof EAttribute) {

						EAttribute attr = (EAttribute)classType.get(j);

						if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
								|| (attr.getEType() instanceof EReference)) {
							childObject.add(attr.getEType());
						}
					}
					else if(classType.get(j) instanceof EClass) {
						EClass eclasstype = ( EClass)classType.get(j);

						EList<EReference> classRef = eclasstype.getEReferences();
						for(int k=0; k < classRef.size(); k++) {
							if((classRef.get(k) instanceof EClass) || (classRef.get(k) instanceof EEnum) 
									|| (classRef.get(k) instanceof EReference) )
							{
								childObject.add(classRef.get(k));
							}
						}
					}
					else if(classType.get(j) instanceof EReference) {
						EReference ereference = (EReference)classType.get(j);

						if((ereference.getEType() instanceof EClass) || (ereference.getEType() instanceof EEnum)
								|| (ereference.getEType() instanceof EReference)) {
							childObject.add(ereference.getEType());
						}
					}
				} //Endof for classType.size()
				for(int k=0; k < childObject.size(); k++) {
					ClassContentPrinter.addInstanceName(childObject.get(k), InstanceList, uri);
				}
			}
		}
		else if(eobject instanceof EReference) {

			EReference eclass = (EReference)eobject;	
			String instanceTypeName = eclass.getEType().getInstanceTypeName();

			if(!InstanceList.containsKey(instanceTypeName)) {

				InstanceList.put("Class "+instanceTypeName, uri);

				EList<EObject> classType = eclass.getEType().eContents();
				for(int j=0; j < classType.size(); j++) {

					if(classType.get(j) instanceof EAttribute) {
						EAttribute attr = (EAttribute)classType.get(j);

						if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
								|| (attr.getEType() instanceof EReference)) {
							childObject.add(attr);
						}
					}
					else if(classType.get(j) instanceof EClass) {
						EClass eclasstype = ( EClass)classType.get(j);

						EList<EReference> classRef = eclasstype.getEReferences();
						for(int k=0; k < classRef.size(); k++) {
							if((classRef.get(k) instanceof EClass) || (classRef.get(k) instanceof EEnum) 
									|| (classRef.get(k) instanceof EReference) )
							{
								childObject.add(classRef.get(k));
							}
						}
					}
					else if(classType.get(j) instanceof EReference) {
						EReference ereference = (EReference)classType.get(j);

						if((ereference.getEType() instanceof EClass) || (ereference.getEType() instanceof EEnum)
								|| (ereference.getEType() instanceof EReference)) {
							childObject.add(ereference.getEType());
						}
					}
				} //Endof for classType.size()
				for(int k=0; k < childObject.size(); k++) {
					ClassContentPrinter.addInstanceName(childObject.get(k), InstanceList, uri);
				}
			}
		} 
		else if(eobject instanceof EEnum) {

			EEnum enumobj = (EEnum)eobject;	
			String instanceTypeName = enumobj.getInstanceTypeName();
			if(!InstanceList.containsKey(instanceTypeName)) {
				InstanceList.put("Enumeration "+instanceTypeName, uri);
			}
		} 
	}

	public static void content(EObject eobject, DocbookFactory factory, SectionType section) {


		List<EObject> childObject =  new ArrayList<EObject>();

		if(eobject instanceof EClass) {

			EClass eclass = (EClass)eobject;

			String instanceTypeName = eclass.getInstanceTypeName();

			ClassTable classtable = new ClassTable(factory);
			TbodyType tbody = factory.createTbodyType();
			InformaltableType tab = classtable.createTable(tbody);

			ParaType objectName = factory.createParaType();
			EmphasisType emphasisobjectName = factory.createEmphasisType();
			emphasisobjectName.setRole("bold");
			FeatureMapUtil.addText(emphasisobjectName.getMixed(), "Class "+instanceTypeName+" Content");
			objectName.getEmphasis().add(emphasisobjectName);
			objectName.setId(instanceTypeName); //To set the reference id
			section.getPara().add(objectName);

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

					if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
							|| (attr.getEType() instanceof EReference)) {
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
					isClassType = true;
				}
				else if(classType.get(j) instanceof EClass) {
					EClass eclasstype = ( EClass)classType.get(j);
					Name =  eclasstype.getName();
					InstanceName =  eclasstype.getInstanceTypeName();
					if(eclasstype.getEAnnotation("Description")!=null) 
						Desc = eclasstype.getEAnnotation("Description").getDetails().get("content");

					EList<EReference> classRef = eclasstype.getEReferences();
					for(int k=0; k < classRef.size(); k++) {
						if((classRef.get(k) instanceof EClass) || (classRef.get(k) instanceof EEnum) 
								|| (classRef.get(k) instanceof EReference) )
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

					if((ereference.getEType() instanceof EClass) || (ereference.getEType() instanceof EEnum)
							|| (ereference.getEType() instanceof EReference)) {
						childObject.add(ereference.getEType());
					}
					isClassType = true;
				}
				if(InstanceName.compareTo("java.lang.String")==0)  InstanceName = "string";
				classtable.addRow(tbody, Name, prefix+InstanceName, Desc, isClassType);
				section.getInformaltable().add(tab);
			} //Endof for classType.size()
			for(int k=0; k < childObject.size(); k++) {
				ClassContentPrinter.content(childObject.get(k), factory, section);
			}
		}
		else if(eobject instanceof EReference) {

			EReference eclass = (EReference)eobject;	
			String instanceTypeName = eclass.getEType().getInstanceTypeName();

			TbodyType tbody = factory.createTbodyType();
			ClassTable classtable = new ClassTable(factory);
			InformaltableType tab = classtable.createTable(tbody);

			ParaType objectName = factory.createParaType();
			EmphasisType emphasisobjectName = factory.createEmphasisType();
			emphasisobjectName.setRole("bold");
			FeatureMapUtil.addText(emphasisobjectName.getMixed(), "Class "+instanceTypeName+" Content");
			objectName.getEmphasis().add(emphasisobjectName);
			objectName.setId(instanceTypeName); //To set a reference id
			section.getPara().add(objectName);

			EList<EObject> classType = eclass.getEType().eContents();
			for(int j=0; j < classType.size(); j++) {
				boolean isClassType = false;
				String prefix="";
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

					if((attr.getEType() instanceof EClass) || (attr.getEType() instanceof EEnum)
							|| (attr.getEType() instanceof EReference)) {
						childObject.add(attr);
						isClassType = true;
					}
				}
				else if(classType.get(j) instanceof EEnum) {
					EEnum enumtype = (EEnum)classType.get(j);
					Name = enumtype.getName();
					InstanceName = enumtype.getInstanceTypeName();
					if(enumtype.getEAnnotation("Description")!=null) 
						Desc = enumtype.getEAnnotation("Description").getDetails().get("content");
					isClassType = true;
				}
				else if(classType.get(j) instanceof EClass) {
					EClass eclasstype = ( EClass)classType.get(j);
					Name =  eclasstype.getName();
					InstanceName =  eclasstype.getInstanceTypeName();
					if(eclasstype.getEAnnotation("Description")!=null) 
						Desc = eclasstype.getEAnnotation("Description").getDetails().get("content");

					EList<EReference> classRef = eclasstype.getEReferences();
					for(int k=0; k < classRef.size(); k++) {
						if((classRef.get(k) instanceof EClass) || (classRef.get(k) instanceof EEnum) 
								|| (classRef.get(k) instanceof EReference) )
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

					if((ereference.getEType() instanceof EClass) || (ereference.getEType() instanceof EEnum)
							|| (ereference.getEType() instanceof EReference)) {
						childObject.add(ereference.getEType());
					}
					isClassType = true;
				}
				if(InstanceName.compareTo("java.lang.String")==0)  InstanceName = "string";
				classtable.addRow(tbody, Name, prefix+InstanceName, Desc, isClassType);
				section.getInformaltable().add(tab);
			} //Endof for classType.size()
			for(int k=0; k < childObject.size(); k++) {
				ClassContentPrinter.content(childObject.get(k), factory, section);
			}
		} 
		else if(eobject instanceof EEnum) {

			EEnum enumobj = (EEnum)eobject;	
			String instanceTypeName = enumobj.getInstanceTypeName();

			EnumTable enumtable = new EnumTable(factory);
			TbodyType tbody = factory.createTbodyType();
			InformaltableType tab = enumtable.createTable(tbody);

			ParaType objectName = factory.createParaType();
			EmphasisType emphasisobjectName = factory.createEmphasisType();
			emphasisobjectName.setRole("bold");
			FeatureMapUtil.addText(emphasisobjectName.getMixed(), "Enumeration "+instanceTypeName+" Type");
			objectName.getEmphasis().add(emphasisobjectName);
			objectName.setId(instanceTypeName); //To set a reference id
			section.getPara().add(objectName);

			EList<EEnumLiteral> enumType = enumobj.getELiterals();
			for(int j=0; j < enumType.size(); j++) {
				String value = enumType.get(j).getValue()+"";
				enumtable.addRow(tbody, enumType.get(j).getName(), value);
				section.getInformaltable().add(tab);
			}
		}
	} 
}
