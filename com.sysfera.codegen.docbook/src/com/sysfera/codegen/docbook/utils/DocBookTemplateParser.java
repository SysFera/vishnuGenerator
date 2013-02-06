package com.sysfera.codegen.docbook.utils;

import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

import org.apache.commons.cli.BasicParser;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.GenericXMLResourceFactoryImpl;
import org.kermeta.Docbook.BookType;
import org.kermeta.Docbook.ChapterType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.DocumentRoot;
import org.kermeta.Docbook.SectionType;


/**
 * A DocBook template parser that generates docbook sections based on model(s).
 * Supports different types of models within the same document
 * Supports the 'annotation' tag for generation at the chapter and 1st section levels
 * Supports the 'label' tag for generation at the book level
 * @author Benjamin Isnard
 *
 */

public class DocBookTemplateParser {
	
	public static final String DB_FILE_EXTENSION = "docbook";
	
	private Map<String,GenericModel>	modelsRegistry;
	private String 				templateFile;
	private String				outputFile;
	private String				modelDir;
	private ResourceSet			myResourceSet;
	private Resource.Factory 	myResourceFactory;
	private Resource 			myResource;
	private DocumentRoot 		root;
	
	public DocBookTemplateParser() {
		myResourceSet 		= new ResourceSetImpl();
		myResourceFactory 	= new GenericXMLResourceFactoryImpl();
		myResourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put(DB_FILE_EXTENSION, myResourceFactory);
		System.out.println("Registering package with URI:" + DocbookPackage.eNS_URI);
		myResourceSet.getPackageRegistry().put(DocbookPackage.eNS_URI, DocbookPackage.eINSTANCE);
		modelsRegistry = new HashMap<String,GenericModel>();
	}
	
	/**
	 * Registers a new model for files with a given file extension
	 * @param extension		the file extension (ex: astah)
	 * @param model			the model object
	 */
	public void addModel(String extension, GenericModel model) {
		modelsRegistry.put(extension, model);
	}
	
	public void processCommandLine(String command, String args[]) {
		
		// Process command arguments
		if (args.length < 1) {
			System.err.println("Usage: " + command + " [-I include_path] docbook-template.docbook");
			System.exit(0);
		}
		// Handle command options
		Option optionIncl = new Option("I", "Include a path to look for model files");
		optionIncl.setArgs(1);
		optionIncl.setOptionalArg(true);
		
		Options options = new Options();
		options.addOption(optionIncl);
		
		CommandLineParser parser = new BasicParser();
		CommandLine cmd = null;

		try {
		  cmd = parser.parse(options, args);
		} catch (ParseException e) {
		  System.out.println("***ERROR: " 
		    + e.getClass() + ": " 
		    + e.getMessage());
		  System.exit(-1) ;
		}

		modelDir = ".";
		if (cmd.hasOption(optionIncl.getOpt())) {
			System.out.println("Include directory: " + cmd.getOptionValue(optionIncl.getOpt()));
			modelDir = cmd.getOptionValue(optionIncl.getOpt());
		}
		
		// Handle command parameter
		if (cmd.getArgs().length < 1) {
			System.err.println("Usage: " + command + " [-I include_path] docbook-template.docbook");
			System.exit(0);
		}
		templateFile = cmd.getArgs()[0];
		System.out.println("INPUT: " + templateFile);
		
		// Generate output file path
		outputFile = "";
		try {
			String baseName = templateFile.substring(0, templateFile.indexOf("-template"));
			outputFile = baseName + "-gen.docbook";
			System.out.println("OUTPUT: " + outputFile);
		} catch (StringIndexOutOfBoundsException e) {
			System.out.println("Template file must have suffix '-template'");
			System.exit(-1);
		}
	}
	
	public void loadTemplate() {
    	
    	// Create resource by loading XML file
    	myResource = myResourceSet.getResource(URI.createFileURI(templateFile), true);

		try {
			myResource.load(Collections.EMPTY_MAP);
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
        System.out.println("Template load: OK");
	}
	
	public void generate() {
        
        
        root = (DocumentRoot) myResource.getContents().get(0);
        BookType book = root.getBook();
        
        // Check if the book has a label
        String bookLabel = book.getLabel();
        if ((bookLabel != null) && (!bookLabel.isEmpty())) {
        	
        	
        	// Loop for each reference (separated by ;)
        	StringTokenizer st_model = new StringTokenizer(bookLabel, ";");
        	while (st_model.hasMoreTokens()) {
        		
        		// Get the references for a given model
        		String ref = st_model.nextToken();
        		System.out.println("Found references to generate : source=" + ref);
        		
        		// Load the model
        		GenericModel srcModel = extractModelFromRef(ref);
        		srcModel.load(modelDir + "/" + extractFileNameFromRef(ref));

        		// Generate reference
        		StringTokenizer st = extractSectionRefFromRef(ref);
        		while (st.hasMoreTokens()) {
        			String subRef = st.nextToken();
        			System.out.println("  - add reference : " + subRef);
        			book.getReference().add(srcModel.generateReference(subRef));
        		}
        	}
        	System.out.println("References generated: OK");
        }
        
        // Browse the book for chapters with annotations
        Collection<ChapterType> chapters = book.getChapter();
        for (ChapterType chapter : chapters) {
        	if (chapter.getAnnotations() != null) {
        		System.out.println("Found chapter to generate : source=" + chapter.getAnnotations());
        		String srcRef = chapter.getAnnotations();
        		
        		// Load the model
        		GenericModel srcModel = extractModelFromRef(srcRef);
        		srcModel.load(modelDir + "/" + extractFileNameFromRef(srcRef));
        		
        		// Generate section for each section reference
        		StringTokenizer st = extractSectionRefFromRef(srcRef);
        		while (st.hasMoreTokens()) {
        			String ref = st.nextToken();
        			System.out.println("  - add section : " + ref);
        			chapter.getSection().add(srcModel.generateSection(ref));
        		}
        		System.out.println("Chapter generated: OK");
        	}
        	
        	// Browse the chapter for sections with annotations
        	Collection<SectionType> sections = chapter.getSection();
        	for (SectionType section : sections) {
        		if (section.getAnnotations() != null) {
        			System.out.println("Found section to generate : source=" + section.getAnnotations());
        			String srcRef = section.getAnnotations();
            		
            		// Load the model
            		GenericModel srcModel = extractModelFromRef(srcRef);
            		srcModel.load(modelDir + "/" + extractFileNameFromRef(srcRef));
            		
            		// Generate section for each section reference
            		StringTokenizer st = extractSectionRefFromRef(srcRef);
            		while (st.hasMoreTokens()) {
            			String ref = st.nextToken();
            			System.out.println("  - add section : " + ref);
            			section.getSection().add(srcModel.generateSection(ref));
            		}
            		System.out.println("Chapter generated: OK");
        		}
        	}
        }
	}
	
	/**
	 * Get the file name from the reference
	 * @param ref	the full reference
	 * @return		the file path
	 */
	private String extractFileNameFromRef(String ref) {
		return ref.substring(0, ref.indexOf("#"));
	}
	
	/**
	 * Get the model object corresponding to the reference (using the file suffix)
	 * @param 	the full reference
	 * @return	the model object
	 */
	private GenericModel extractModelFromRef(String ref) {
		String srcFile = extractFileNameFromRef(ref);
		// Extract the extension of the model file and find the corresponding model object in the registry
		String srcFileExtension = srcFile.substring(srcFile.lastIndexOf(".")+1, srcFile.length());
		GenericModel srcModel = modelsRegistry.get(srcFileExtension);
		if (srcModel == null) {
			throw new RuntimeException("DocBook template parser: cannot find model in registry for extension '" + srcFileExtension +"'");
		}
		return srcModel;
	}
	
	/**
	 * Get the list of section references from the full reference
	 * @param ref	the full reference
	 * @return		a tokenizer containing the section references
	 */
	private StringTokenizer	extractSectionRefFromRef(String ref) {
		String srcLabels = ref.substring(ref.indexOf("#")+1, ref.length());
		return new StringTokenizer(srcLabels, "+");
	}
	
	
	public void save() {
        
        // Save the final document
        Resource finalResource = myResourceFactory.createResource(URI.createFileURI(outputFile));
        finalResource.getContents().add(root);
        
        // Some tricks to get the proper attributes on the toplevel element
        root.getXMLNSPrefixMap().put("","http://docbook.org/ns/docbook");
        Map<Object,Object> saveOptions = new HashMap<Object,Object>();
        saveOptions.put(XMLResource.OPTION_SCHEMA_LOCATION, "");
        try {
        	finalResource.save(saveOptions);
        } catch (IOException e) {
        	e.printStackTrace();
        }
        
        System.out.println("Document saved: OK");
	}

}
