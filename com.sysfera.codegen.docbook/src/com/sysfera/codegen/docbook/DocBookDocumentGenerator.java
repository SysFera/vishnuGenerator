package com.sysfera.codegen.docbook;

import com.sysfera.codegen.docbook.apimodel.ApiModel;
import com.sysfera.codegen.docbook.astah.AstahModel;
import com.sysfera.codegen.docbook.utils.DocBookTemplateParser;


public class DocBookDocumentGenerator {
	
	/**
	 * Main function for the docbook generator
	 * This generator takes a docbook template as parameter, which can contain annotations
	 * (xml attributes) containing references to APIM or ASTAH files.
	 * 
	 * The "annotation" attribute can be used on the following docbook elements:
	 * 		- chapter
	 *
	 * The format of the annotation attribute is the following:
	 * 		<relative_file_path>[.apim|.astah]#<section_code1>[+<section_code_2]
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		String version = "1.3.0";
		
		if (args.length == 3) {
			System.out.println("WARNING:The generator uses VISHNU version rules for V."+version);
			System.out.println("If you want to change version rules add another parameter in the form:");
			System.out.println("Usage: command  [-I include_path] docbook-template.docbook version(x.y.z)");
		}
		
		if (args.length == 4) {
			version = args[3];
		}
		
		DocBookTemplateParser parser = new DocBookTemplateParser();
		parser.addModel("apim", new ApiModel(version));
		parser.addModel("asta", new AstahModel());
		parser.processCommandLine("docbookgen", args);
		parser.loadTemplate();
		parser.generate();
		parser.save();
	}

}
