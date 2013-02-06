package com.sysfera.codegen.docbook.astah;

import com.sysfera.codegen.docbook.utils.DocBookTemplateParser;
import com.sysfera.codegen.docbook.utils.GenericModel;

//OBSOLETE : use DocBookDocumentGenerator instead
public class SpecGenCreate {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		GenericModel model = new AstahModel();
		DocBookTemplateParser parser = new DocBookTemplateParser();
		parser.addModel("asta", model);
		parser.processCommandLine("astah2docbook", args);
		parser.loadTemplate();
		parser.generate();
		parser.save();
        
	}

}
