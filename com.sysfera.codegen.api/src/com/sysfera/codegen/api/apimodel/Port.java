/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getService <em>Service</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getUsage <em>Usage</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getShortOptionLetter <em>Short Option Letter</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getLongOptionName <em>Long Option Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getEnvOption <em>Env Option</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.Port#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort()
 * @model
 * @generated
 */
public interface Port extends EObject {
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
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Service</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link com.sysfera.codegen.api.apimodel.Service#getPorts <em>Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' container reference.
	 * @see #setService(Service)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_Service()
	 * @see com.sysfera.codegen.api.apimodel.Service#getPorts
	 * @model opposite="ports" transient="false"
	 * @generated
	 */
	Service getService();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getService <em>Service</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service</em>' container reference.
	 * @see #getService()
	 * @generated
	 */
	void setService(Service value);

	/**
	 * Returns the value of the '<em><b>Direction</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link com.sysfera.codegen.api.apimodel.portDirection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Direction</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Direction</em>' attribute.
	 * @see com.sysfera.codegen.api.apimodel.portDirection
	 * @see #setDirection(portDirection)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_Direction()
	 * @model default="0"
	 * @generated
	 */
	portDirection getDirection();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getDirection <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Direction</em>' attribute.
	 * @see com.sysfera.codegen.api.apimodel.portDirection
	 * @see #getDirection()
	 * @generated
	 */
	void setDirection(portDirection value);

	/**
	 * Returns the value of the '<em><b>Usage</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * The literals are from the enumeration {@link com.sysfera.codegen.api.apimodel.APIUsage}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usage</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usage</em>' attribute.
	 * @see com.sysfera.codegen.api.apimodel.APIUsage
	 * @see #setUsage(APIUsage)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_Usage()
	 * @model default="0"
	 * @generated
	 */
	APIUsage getUsage();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getUsage <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usage</em>' attribute.
	 * @see com.sysfera.codegen.api.apimodel.APIUsage
	 * @see #getUsage()
	 * @generated
	 */
	void setUsage(APIUsage value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' reference.
	 * @see #setDataType(Type)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_DataType()
	 * @model
	 * @generated
	 */
	Type getDataType();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getDataType <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' reference.
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(Type value);

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
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Optional</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Optional</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Optional</em>' attribute.
	 * @see #setOptional(boolean)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_Optional()
	 * @model default="false"
	 * @generated
	 */
	boolean isOptional();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#isOptional <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Optional</em>' attribute.
	 * @see #isOptional()
	 * @generated
	 */
	void setOptional(boolean value);

	/**
	 * Returns the value of the '<em><b>Short Option Letter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Short Option Letter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Short Option Letter</em>' attribute.
	 * @see #setShortOptionLetter(String)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_ShortOptionLetter()
	 * @model
	 * @generated
	 */
	String getShortOptionLetter();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getShortOptionLetter <em>Short Option Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Short Option Letter</em>' attribute.
	 * @see #getShortOptionLetter()
	 * @generated
	 */
	void setShortOptionLetter(String value);

	/**
	 * Returns the value of the '<em><b>Long Option Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Long Option Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Long Option Name</em>' attribute.
	 * @see #setLongOptionName(String)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_LongOptionName()
	 * @model
	 * @generated
	 */
	String getLongOptionName();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getLongOptionName <em>Long Option Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Long Option Name</em>' attribute.
	 * @see #getLongOptionName()
	 * @generated
	 */
	void setLongOptionName(String value);

	/**
	 * Returns the value of the '<em><b>Env Option</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Env Option</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Env Option</em>' reference.
	 * @see #setEnvOption(EnvVariable)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_EnvOption()
	 * @model
	 * @generated
	 */
	EnvVariable getEnvOption();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getEnvOption <em>Env Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Env Option</em>' reference.
	 * @see #getEnvOption()
	 * @generated
	 */
	void setEnvOption(EnvVariable value);

	/**
	 * Returns the value of the '<em><b>Default Value Literal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value Literal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value Literal</em>' attribute.
	 * @see #setDefaultValueLiteral(String)
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_DefaultValueLiteral()
	 * @model
	 * @generated
	 */
	String getDefaultValueLiteral();

	/**
	 * Sets the value of the '{@link com.sysfera.codegen.api.apimodel.Port#getDefaultValueLiteral <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value Literal</em>' attribute.
	 * @see #getDefaultValueLiteral()
	 * @generated
	 */
	void setDefaultValueLiteral(String value);

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
	 * @see com.sysfera.codegen.api.apimodel.ApimodelPackage#getPort_Details()
	 * @model mapType="org.eclipse.emf.ecore.EStringToStringMapEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EString>"
	 * @generated
	 */
	EMap<String, String> getDetails();

} // Port
