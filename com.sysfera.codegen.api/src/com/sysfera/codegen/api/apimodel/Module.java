/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Module#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Module#getApi <em>Api</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Module#getServices <em>Services</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Module#getTypeList <em>Type List</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Module#getResultCodeList <em>Result Code List</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getModule()
 * @model
 * @generated
 */
public interface Module extends EObject {
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
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getModule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Module#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Api</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.API#getModules <em>Modules</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Api</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Api</em>' container reference.
	 * @see #setApi(API)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getModule_Api()
	 * @see com.sysfera.codegen.api.apimodel.API#getModules
	 * @model opposite="modules" transient="false"
	 * @generated
	 */
	API getApi();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Module#getApi <em>Api</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Api</em>' container reference.
	 * @see #getApi()
	 * @generated
	 */
	void setApi(API value);

	/**
	 * Returns the value of the '<em><b>Services</b></em>' containment reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.Service}.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.Service#getModule <em>Module</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Services</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Services</em>' containment reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getModule_Services()
	 * @see com.sysfera.codegen.api.apimodel.Service#getModule
	 * @model opposite="module" containment="true"
	 * @generated
	 */
	EList<Service> getServices();

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
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getModule_TypeList()
	 * @model containment="true"
	 * @generated
	 */
	TypeList getTypeList();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Module#getTypeList <em>Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type List</em>' containment reference.
	 * @see #getTypeList()
	 * @generated
	 */
	void setTypeList(TypeList value);

	/**
	 * Returns the value of the '<em><b>Result Code List</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Code List</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Code List</em>' containment reference.
	 * @see #setResultCodeList(ResultCodeList)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getModule_ResultCodeList()
	 * @model containment="true"
	 * @generated
	 */
	ResultCodeList getResultCodeList();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Module#getResultCodeList <em>Result Code List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Result Code List</em>' containment reference.
	 * @see #getResultCodeList()
	 * @generated
	 */
	void setResultCodeList(ResultCodeList value);

} // Module
