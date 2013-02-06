package com.sysfera.codegen.docbook.utils;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.EnvarType;
import org.kermeta.Docbook.ListitemType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.TermType;
import org.kermeta.Docbook.VarListEntryType;

import com.sysfera.codegen.api.apimodel.API;
import com.sysfera.codegen.api.apimodel.EnvVariable;
import com.sysfera.codegen.api.apimodel.EnvVariableList;
import com.sysfera.codegen.api.apimodel.JobEnvVariableList;

public class ManPagesUtils {

	/**
	 * Returns a list of generated varlistentry elements for the general environment variables
	 * (variables that are common to all services: at the moment only the config file)
	 * @param 	api	the parent api object from the apim model
	 * @return	a list of varlistentry
	 */
	public static List<VarListEntryType> getCommonEnvVars(API api) {
		List<VarListEntryType> list = new ArrayList<VarListEntryType>();
		EnvVariableList moduleEnvVarList = api.getEnvVariableList();
		if (moduleEnvVarList != null) {
			for (EnvVariable var : moduleEnvVarList.getEnvVariables()) {
				if (var.getName().equals("VISHNU_CONFIG_FILE")) {
					VarListEntryType entry = DocbookFactory.eINSTANCE.createVarListEntryType();
					generateEnvVarEntry(entry, var.getName(), var.getDescription(), null);
					list.add(entry);
				}
			}
		}
		return list;
	}
	
	/**
	 * Returns a list of generated varlistentry elements for the general environment variables
	 * (variables that are common to all services: at the moment only the config file)
	 * @param 	api	the parent api object from the apim model
	 * @return	a list of varlistentry
	 */
	public static List<VarListEntryType> getJobEnvVars(API api) {
		List<VarListEntryType> list = new ArrayList<VarListEntryType>();
		JobEnvVariableList moduleJobEnvVarList = api.getJobEnvVariableList();
		if (moduleJobEnvVarList != null) {
			for (EnvVariable var : moduleJobEnvVarList.getEnvVariables()) {

				VarListEntryType entry = DocbookFactory.eINSTANCE.createVarListEntryType();
				generateEnvVarEntry(entry, var.getName(), var.getDescription(), null);
				list.add(entry);

			}
		}
		return list;
	}

	/**
	 * Fills a 'varlistentry' element with the details of an environment variable
	 * @param entry				the parent entry
	 * @param name				the env variable name
	 * @param description		the description
	 * @param shortOptionLetter	the short option letter (may be NULL)
	 */
	public static void generateEnvVarEntry(VarListEntryType entry,
											String name,
											String description,
											String shortOptionLetter) {
		// Term
		TermType term = DocbookFactory.eINSTANCE.createTermType();
		entry.getTerm().add(term);
		EnvarType envar = DocbookFactory.eINSTANCE.createEnvarType();
		FeatureMapUtil.addText(envar.getMixed(), name);
		term.getEnvar().add(envar);
		
		// Listitem
		ListitemType listitem = DocbookFactory.eINSTANCE.createListitemType();
		entry.setListitem(listitem);
		ParaType para = DocbookFactory.eINSTANCE.createParaType();
		listitem.getPara().add(para);
		String content = description + ".";
		if ((shortOptionLetter != null) && !shortOptionLetter.equals("")) {
			content += " Overridden by the -" + shortOptionLetter + " option.";
		}
		FeatureMapUtil.addText(para.getMixed(), content);
	}
}
