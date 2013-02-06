package com.sysfera.codegen.api.apimodel.util;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;

import com.sysfera.codegen.api.apimodel.*;

public class ApimodelUtils {
	
	public static String	getAttributeDescr(EAttribute attribute) {
		
		String descr = null;
		EAnnotation annotation = attribute.getEAnnotation("Description");
		if (annotation != null) 
			descr = annotation.getDetails().get("content");
		return descr;
		
	}

	public static String	getAttributeShortOption(EAttribute attribute) {

		String opt = null;
		EAnnotation annotation = attribute.getEAnnotation("Description");
		if (annotation != null) 
			opt = annotation.getDetails().get("shortOption");
		return opt;	
	}

	public static String	getAttributeUserOption(EAttribute attribute) {

		String opt = null;
		EAnnotation annotation = attribute.getEAnnotation("Description");
		if (annotation != null) 
			opt = annotation.getDetails().get("userOption");
		return opt;	
	}

	public static boolean 	isInteractiveParam(String paramName) {
		return (paramName.contains("password"));	
	}
	
	public static List<Port>	getPortsByUsage(Service service, APIUsage usageFilter) {
		List<Port> list = new ArrayList<Port>();
		for (Port port : service.getPorts()) {
			APIUsage usage = port.getUsage();
			if (usage.equals(usageFilter) || usage.equals(APIUsage.ALL)) {
				list.add(port);
			}
		}
		return list;
	}
	
	public static List<ResultCode> 	getErrorCodesByUsage(Service service, APIUsage usageFilter) {
		List<ResultCode> list = new ArrayList<ResultCode>();
		for (ResultCode code : service.getResultCodes()) {
			APIUsage usage = code.getUsage();
			if (usage.equals(usageFilter) || usage.equals(APIUsage.ALL)) {
				list.add(code);
			}
		}
		return list;
	}
	
	public static List<ResultCode> 	getErrorCodesByUsage(Module module, APIUsage usageFilter) {
		List<ResultCode> list = new ArrayList<ResultCode>();
		for (ResultCode code : module.getResultCodeList().getResultCodes()) {
			APIUsage usage = code.getUsage();
			if (usage.equals(usageFilter) || usage.equals(APIUsage.ALL)) {
				list.add(code);
			}
		}
		return list;
	}
	
	public static EDataType getEDataType(String typeName) {
		EPackage eCorePackage = EPackage.Registry.INSTANCE.getEPackage("http://www.eclipse.org/emf/2002/Ecore");
		EClassifier eClassifier = eCorePackage.getEClassifier(typeName);
		if (eClassifier instanceof EDataType) {
			return (EDataType) eClassifier;
		} else {
			System.err.println("Cannot find EDataType '" + typeName + "' in the Ecore Package");
			return null;
		}
	}


}
