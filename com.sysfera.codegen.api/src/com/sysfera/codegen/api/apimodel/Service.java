/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getModule <em>Module</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#isAdminOnly <em>Admin Only</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#isIsCommand <em>Is Command</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#isIsFunction <em>Is Function</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getResultCodes <em>Result Codes</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getUsedServices <em>Used Services</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getUsedByServices <em>Used By Services</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#getDetails <em>Details</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Service#isUseJobEnv <em>Use Job Env</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService()
 * @model
 * @generated
 */
public interface Service extends EObject {
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
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Service#getName <em>Name</em>}' attribute.
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
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Service#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Module</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.Module#getServices <em>Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Module</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Module</em>' container reference.
	 * @see #setModule(Module)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_Module()
	 * @see com.sysfera.codegen.api.apimodel.Module#getServices
	 * @model opposite="services" transient="false"
	 * @generated
	 */
	Module getModule();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Service#getModule <em>Module</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Module</em>' container reference.
	 * @see #getModule()
	 * @generated
	 */
	void setModule(Module value);

	/**
	 * Returns the value of the '<em><b>Ports</b></em>' containment reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.Port}.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.Port#getService <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ports</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ports</em>' containment reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_Ports()
	 * @see com.sysfera.codegen.api.apimodel.Port#getService
	 * @model opposite="service" containment="true"
	 * @generated
	 */
	EList<Port> getPorts();

	/**
	 * Returns the value of the '<em><b>Admin Only</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Admin Only</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Admin Only</em>' attribute.
	 * @see #setAdminOnly(boolean)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_AdminOnly()
	 * @model default="false"
	 * @generated
	 */
	boolean isAdminOnly();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Service#isAdminOnly <em>Admin Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Admin Only</em>' attribute.
	 * @see #isAdminOnly()
	 * @generated
	 */
	void setAdminOnly(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Command</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Command</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Command</em>' attribute.
	 * @see #setIsCommand(boolean)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_IsCommand()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsCommand();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Service#isIsCommand <em>Is Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Command</em>' attribute.
	 * @see #isIsCommand()
	 * @generated
	 */
	void setIsCommand(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Function</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that this service is part of the programmatic API as a function
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Is Function</em>' attribute.
	 * @see #setIsFunction(boolean)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_IsFunction()
	 * @model default="true"
	 * @generated
	 */
	boolean isIsFunction();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Service#isIsFunction <em>Is Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Function</em>' attribute.
	 * @see #isIsFunction()
	 * @generated
	 */
	void setIsFunction(boolean value);

	/**
	 * Returns the value of the '<em><b>Result Codes</b></em>' reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.ResultCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Codes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Codes</em>' reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_ResultCodes()
	 * @model keys="value"
	 * @generated
	 */
	EList<ResultCode> getResultCodes();

	/**
	 * Returns the value of the '<em><b>Used Services</b></em>' reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.Service}.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.Service#getUsedByServices <em>Used By Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used Services</em>' reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_UsedServices()
	 * @see com.sysfera.codegen.api.apimodel.Service#getUsedByServices
	 * @model opposite="usedByServices"
	 * @generated
	 */
	EList<Service> getUsedServices();

	/**
	 * Returns the value of the '<em><b>Used By Services</b></em>' reference list.
	 * The list contents are of type {@link com.sysfera.codegen.api.apimodel.Service}.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.Service#getUsedServices <em>Used Services</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Used By Services</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Used By Services</em>' reference list.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_UsedByServices()
	 * @see com.sysfera.codegen.api.apimodel.Service#getUsedServices
	 * @model opposite="usedServices"
	 * @generated
	 */
	EList<Service> getUsedByServices();

	/**
	 * Returns the value of the '<em><b>Details</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Details</em>' map.
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_Details()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getDetails();

	/**
	 * Returns the value of the '<em><b>Use Job Env</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * Specifies that this service is part of the programmatic API as a function
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Use Job Env</em>' attribute.
	 * @see #setUseJobEnv(boolean)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getService_UseJobEnv()
	 * @model default="false"
	 * @generated
	 */
	boolean isUseJobEnv();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Service#isUseJobEnv <em>Use Job Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Job Env</em>' attribute.
	 * @see #isUseJobEnv()
	 * @generated
	 */
	void setUseJobEnv(boolean value);

} // Service
