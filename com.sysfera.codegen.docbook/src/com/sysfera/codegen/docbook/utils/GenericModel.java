package com.sysfera.codegen.docbook.utils;

import org.kermeta.Docbook.ReferenceType;
import org.kermeta.Docbook.SectionType;

/**
 * This interface is used to encapsulate any model used for code generation in docbook
 * It uses one model file and produces docbook sections based on references that are
 * specific to the kind of model.
 * @author Benjamin Isnard
 *
 */

public interface GenericModel {
	
	/**
	 * Load a model file
	 * @param modelFilePath
	 */
	public void load(String modelFilePath);
	
	/**
	 * Generate a DocBook section based on the model and referenced by srcRef
	 * @param srcRef	a string that specifies which part of the model must be converted to DocBook
	 * @return			a new DocBook section object
	 */
	public SectionType generateSection(String srcRef);
	
	/**
	 * Generate a "reference" section based on the model
	 * @param srcRef	a string that specifies which part of the model must be converted to DocBook
	 * @return			a new DocBook reference object
	 */
	public ReferenceType generateReference(String srcRef);

}
