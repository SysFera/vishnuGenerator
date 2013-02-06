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
 * A representation of the model object '<em><b>Job Env Variable List</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.JobEnvVariableList#getEnvVariables <em>Env Variables</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getJobEnvVariableList()
 * @model
 * @generated
 */
public interface JobEnvVariableList extends EObject {
	/**
	 * Returns the value of the '<em><b>Env Variables</b></em>' containment reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.EnvVariable}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Variables</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Variables</em>' containment reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getJobEnvVariableList_EnvVariables()
	 * @model containment="true" keys="name"
	 * @generated
	 */
	EList<EnvVariable> getEnvVariables();

} // JobEnvVariableList
