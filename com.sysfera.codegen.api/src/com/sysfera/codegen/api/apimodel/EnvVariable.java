/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Env Variable</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.EnvVariable#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.EnvVariable#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.EnvVariable#isIsUserOption <em>Is User Option</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getEnvVariable()
 * @model
 * @generated
 */
public interface EnvVariable extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getEnvVariable_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.EnvVariable#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getEnvVariable_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.EnvVariable#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Is User Option</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is User Option</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is User Option</em>' attribute.
	 * @see #setIsUserOption(boolean)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getEnvVariable_IsUserOption()
	 * @model
	 * @generated
	 */
	boolean isIsUserOption();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.EnvVariable#isIsUserOption <em>Is User Option</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is User Option</em>' attribute.
	 * @see #isIsUserOption()
	 * @generated
	 */
	void setIsUserOption(boolean value);

} // EnvVariable
