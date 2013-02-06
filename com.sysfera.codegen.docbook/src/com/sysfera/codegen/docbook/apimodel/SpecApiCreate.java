package com.sysfera.codegen.docbook.apimodel;

import com.sysfera.codegen.docbook.utils.DocBookTemplateParser;
import com.sysfera.codegen.docbook.utils.GenericModel;

// OBSOLETE : use DocBookDocumentGenerator instead
public class SpecApiCreate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GenericModel model = new ApiModel();
		DocBookTemplateParser parser = new DocBookTemplateParser();
		parser.addModel("apim", model);
		parser.processCommandLine("apim2docbook", args);
		parser.loadTemplate();
		parser.generate();
		parser.save();

	}

}
