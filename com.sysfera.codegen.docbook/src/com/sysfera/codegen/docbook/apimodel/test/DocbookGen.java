package com.sysfera.codegen.docbook.apimodel.test;

import com.sysfera.codegen.api.apimodel.*;
import com.sysfera.codegen.docbook.apimodel.DocBookGenApimUtils;
import com.sysfera.codegen.docbook.apimodel.ErrorTypeTable;
import com.sysfera.codegen.docbook.apimodel.PackageContentPrinter;
import com.sysfera.codegen.docbook.apimodel.ParametersTable;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
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
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import org.kermeta.Docbook.BookType;
import org.kermeta.Docbook.ChapterType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.DocumentRoot;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.TitleType;
import org.kermeta.Docbook.impl.DocbookFactoryImpl;

public class DocbookGen {

	public DocbookGen(){

	}
	
	void printPortContent(EList<Port> listPort,  ResourceSet resourceSet, DocbookFactory factory, SectionType section, 
			              List<String> ListInstanceClass) {

		for (int k=0; k <listPort.size();++k) {

			URI uri = listPort.get(k).getDataType().getECoreType().eResource().getURI();
			System.out.println("ECoreType:"+uri);
			Resource Typeresource = resourceSet.createResource(uri);
			loadTyperesource(Typeresource);
			
			String instanceTypeName = listPort.get(k).getDataType().getECoreType().getInstanceTypeName();
			PackageContentPrinter.content(Typeresource, instanceTypeName, factory, section, ListInstanceClass);

		}
	}

	
	void printTypeContent(Map<String, URI> InstanceList,  ResourceSet resourceSet, 
			  DocbookFactory factory, SectionType section, String moduleName) {

        for(Iterator<String> iter = InstanceList.keySet().iterator(); iter.hasNext();) {
        	String InstanceName = (String) iter.next();
        	URI uri = InstanceList.get(InstanceName);
			System.out.println("URI:"+uri);
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

	void addInstanceName(EList<Port> listPort,  ResourceSet resourceSet, Map<String, URI> InstanceList) {

		for (int k=0; k <listPort.size();++k) {

			URI uri = listPort.get(k).getDataType().getECoreType().eResource().getURI();
			//System.out.println("URI:"+uri);
			Resource Typeresource = resourceSet.createResource(uri);
			loadTyperesource(Typeresource);

			String instanceTypeName = listPort.get(k).getDataType().getECoreType().getInstanceTypeName();
			
			PackageContentPrinter.addInstanceName(Typeresource, instanceTypeName, InstanceList, uri);

		}
	}
	
	void loadTyperesource(Resource Typeresource) {

		try {
			Map<Object, Object> loadOptions = new HashMap<Object, Object>();
			Typeresource.load(loadOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void loadResource(Resource resource, ResourceSet resourceSet) {
		
		DocbookFactory factory = new DocbookFactoryImpl();
		BookType book = factory.createBookType();
		Resource ressource;
		

		ChapterType chapter = factory.createChapterType();
		book.getChapter().add(chapter);

		
		SectionType sectionClassDef = factory.createSectionType();
		
		TitleType sectionClassDefTitle = factory.createTitleType();
		FeatureMapUtil.addText(sectionClassDefTitle.getMixed(), "Class definitions");
		sectionClassDef.getTitle().add(sectionClassDefTitle);
		
	    //List<String> ListInstanceClass =  new ArrayList<String>();
	    Map<String, URI> InstanceList = new TreeMap<String, URI>();
	    
	    
		Iterator<EObject> iter = resource.getContents().iterator();
		//To traverse the resource content
		while (iter.hasNext()) {
			EObject obj = iter.next();

			if (obj instanceof API) {
				API api = (API)obj;
				EList<Module> listModules = api.getModules(); 
                //To traverse the list of modules
				for (int i=0; i <listModules.size();++i) {
					System.out.println("Modules:"+listModules.get(i).getName());
					TitleType title = factory.createTitleType();
					FeatureMapUtil.addText(title.getMixed(), listModules.get(i).getName());
					chapter.setTitle(title);

					//To save document
					ressource = new XMLResourceImpl();
					DocumentRoot documentRoot = factory.createDocumentRoot();
					documentRoot.setBook(book);

					try {
						DataOutputStream os = new DataOutputStream(new FileOutputStream(listModules.get(i).
								getName()+".xml"));

						EList<Service> listService = listModules.get(i).getServices(); 	
						System.out.println("ListService:"+listService);
                        //To traverse a list of services
						for (int j=0; j <listService.size();++j) {
							System.out.println("Service:"+listService.get(j).getName());
							SectionType section = factory.createSectionType();

							chapter.getSection().add(section);
							TitleType secTitle = factory.createTitleType();
							FeatureMapUtil.addText(secTitle.getMixed(), listService.get(j).getName());
							section.getTitle().add(secTitle);
						
							//To put service Parameters
							{ 
								ParaType funcParameters = factory.createParaType();
								EmphasisType emphasis1 = factory.createEmphasisType();
								emphasis1.setRole("bold");
								FeatureMapUtil.addText(emphasis1.getMixed(), "Parameters");
								funcParameters.getEmphasis().add(emphasis1);
								section.getPara().add(funcParameters);
								ParametersTable parameterstable = new ParametersTable(factory);
								section.getInformaltable().add(parameterstable.getTableApi(listService.get(j).getPorts()));
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
								String Description = listService.get(j).getDescription();
								Description = Description.substring(0,1).toLowerCase()+Description.substring(1);
								System.out.println("Description="+Description);
								Description = "The "+listService.get(j).getName()+"() function "+Description;
								FeatureMapUtil.addText(funcName.getMixed(), Description);
								section.getPara().add(funcName);
							}
							
							//To put a content  of a port if it is an class type or enum type
							{
								//printPortContent(listService.get(j).getPorts(), resourceSet, factory, sectionClassDef, ListInstanceClass);
								addInstanceName(listService.get(j).getPorts(), resourceSet, InstanceList);
							}
							
							//To put a table of errors code
							{
								ParaType returnvalues = factory.createParaType();
								EmphasisType emphasis3 = factory.createEmphasisType();
								emphasis3.setRole("bold");
								FeatureMapUtil.addText(emphasis3.getMixed(), "Return Value ");
								returnvalues.getEmphasis().add(emphasis3);
								section.getPara().add(returnvalues);

								ParaType messagePara = factory.createParaType();
								String message = "An error code is returned when an error occurs during the execution of the function.";
								FeatureMapUtil.addText(messagePara.getMixed(), message);
								section.getPara().add(messagePara);

								ErrorTypeTable errortable = new ErrorTypeTable(factory);
								section.getInformaltable().add(errortable.getTable(listService.get(j).getResultCodes(), APIUsage.API_ONLY));
							}
							
							// To service signature
							{
								ParaType funcSign = factory.createParaType();
								EmphasisType emphasis4 = factory.createEmphasisType();
								emphasis4.setRole("bold");
								FeatureMapUtil.addText(emphasis4.getMixed(), "Signature ");
								funcSign.getEmphasis().add(emphasis4);
								section.getPara().add(funcSign);
//								DocBookGenApimUtils.printSignature(factory, section, listService.get(j));
							}
						}

					
						//To put a content  of a port if it is an class type or enum type
						{
							String moduleName = listModules.get(0).getName();
							printTypeContent(InstanceList, resourceSet, factory, sectionClassDef, moduleName);

						}

						chapter.getSection().add(sectionClassDef);
						
						//documentRoot.setTitle(null);
						ressource.getContents().add(documentRoot);
						ressource.save(os, null);
						System.out.println(listModules.get(0).getName()+".xml");

					} catch (IOException e) {
						e.printStackTrace();
					}
				}
			}
		}
	}

	public static void main(String[] args) {

		// Initialize the model
		ApimodelPackage.eINSTANCE.eClass();

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("apim", 
				new EcoreResourceFactoryImpl()); 

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", 
				new EcoreResourceFactoryImpl()); 

		//String path = "/home/traore/EMF_API_MODEL/eclipse_1/EDF-API/UMS.apim";
		//String path = "/home/traore/EMF_API_MODEL/eclipse_1/TMS_APIM/model/TMS.apim";
		String path = args[0];
		URI uri = URI.createFileURI(path);

		System.out.println("Dans loadressource "+uri.path());
		Resource resource = resourceSet.createResource(uri);

		try {
			Map<Object, Object> loadOptions = new HashMap<Object, Object>();
			resource.load(loadOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}

		DocbookGen doc = new DocbookGen();
		doc.loadResource(resource, resourceSet );
	}
}