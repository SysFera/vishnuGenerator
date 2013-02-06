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
 * A representation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.API#getModules <em>Modules</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.API#getEnvVariableList <em>Env Variable List</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.API#getJobEnvVariableList <em>Job Env Variable List</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.API#getTypeList <em>Type List</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getAPI()
 * @model
 * @generated
 */
public interface API extends EObject {
	/**
	 * Returns the value of the '<em><b>Modules</b></em>' containment reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.Module}.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.Module#getApi <em>Api</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Modules</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Modules</em>' containment reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getAPI_Modules()
	 * @see com.sysfera.codegen.api.apimodel.Module#getApi
	 * @model opposite="api" containment="true"
	 * @generated
	 */
	EList<Module> getModules();

	/**
	 * Returns the value of the '<em><b>Env Variable List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Variable List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Variable List</em>' containment reference.
	 * @see #setEnvVariableList(EnvVariableList)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getAPI_EnvVariableList()
	 * @model containment="true"
	 * @generated
	 */
	EnvVariableList getEnvVariableList();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.API#getEnvVariableList <em>Env Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Variable List</em>' containment reference.
	 * @see #getEnvVariableList()
	 * @generated
	 */
	void setEnvVariableList(EnvVariableList value);

	/**
	 * Returns the value of the '<em><b>Job Env Variable List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Job Env Variable List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Job Env Variable List</em>' containment reference.
	 * @see #setJobEnvVariableList(JobEnvVariableList)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getAPI_JobEnvVariableList()
	 * @model containment="true"
	 * @generated
	 */
	JobEnvVariableList getJobEnvVariableList();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.API#getJobEnvVariableList <em>Job Env Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Job Env Variable List</em>' containment reference.
	 * @see #getJobEnvVariableList()
	 * @generated
	 */
	void setJobEnvVariableList(JobEnvVariableList value);

	/**
	 * Returns the value of the '<em><b>Type List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type List</em>' containment reference.
	 * @see #setTypeList(TypeList)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getAPI_TypeList()
	 * @model containment="true"
	 * @generated
	 */
	TypeList getTypeList();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.API#getTypeList <em>Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type List</em>' containment reference.
	 * @see #getTypeList()
	 * @generated
	 */
	void setTypeList(TypeList value);

} // API
