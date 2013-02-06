/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Result Code List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.ResultCodeList#getResultCodes <em>Result Codes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getResultCodeList()
 * @model
 * @generated
 */
public interface ResultCodeList extends EObject {
	/**
	 * Returns the value of the '<em><b>Result Codes</b></em>' containment reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.ResultCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Codes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Codes</em>' containment reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getResultCodeList_ResultCodes()
	 * @model containment="true" keys="value"
	 * @generated
	 */
	EList<ResultCode> getResultCodes();

} // ResultCodeList
