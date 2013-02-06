/**
 * Program used to add an error code to all services
 */

package com.sysfera.codegen.api.apimodel.util;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import com.sysfera.codegen.api.apimodel.*;

public class AddErrorCode {
	
	
	static public Resource load(String modelFilePath) {

		// Initialize the model
		ApimodelPackage.eINSTANCE.eClass();

		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("apim", 
				new EcoreResourceFactoryImpl()); 

		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", 
				new EcoreResourceFactoryImpl()); 

		System.out.println("Loading model: " + modelFilePath);
		URI uri = URI.createFileURI(modelFilePath);

		Resource resource = resourceSet.createResource(uri);

		try {
			Map<Object, Object> loadOptions = new HashMap<Object, Object>();
			resource.load(loadOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return resource;

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		if (args.length < 2) {
			System.out.println("Usage: AddErrorCode <apim_file> <errcode_name>");
			System.exit(1);
		}
		
		Resource res = load(args[0]);
		
		Iterator<EObject> iter = res.getContents().iterator();
		
		// Process the first Module found within the API
		while (iter.hasNext()) {
			EObject obj = iter.next();

			if (obj instanceof API) {
				API api = (API)obj;
				EList<Module> listModules = api.getModules(); 

				String moduleName = listModules.get(0).getName();
				System.out.println("Modules:" + moduleName);
				
				// Find the result code
				ResultCode code  = null;
				for (ResultCode currCode : listModules.get(0).getResultCodeList().getResultCodes()) {
					if (currCode.getName().equals(args[1])) {
						code = currCode;
						break;
					}
				}
				
				if (code == null) {
					System.out.println("Could not find the error code");
					System.exit(1);
				}
				
				System.out.println("Adding error code: " + code.getName() + " to all commands...");

				// Loop over all services of the API
				for (Service service : listModules.get(0).getServices()) {

					
						System.out.println("Service:" + service.getName());
						
						// ACTION
						service.getResultCodes().add(code);
					
				}
				System.out.println("DONE");
				
			}
		}
		
		// Save
		try {
			Map<Object, Object> saveOptions = new HashMap<Object, Object>();
			saveOptions.put(
			  Resource.OPTION_SAVE_ONLY_IF_CHANGED,
			  Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);
			res.save(saveOptions);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("Model saved");
	}

}
