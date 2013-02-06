/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cmdsynopsis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.CmdsynopsisType#getCommand <em>Command</em>}</li>
 *   <li>{@link org.kermeta.Docbook.CmdsynopsisType#getArg <em>Arg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getCmdsynopsisType()
 * @model extendedMetaData="name='cmdsynopsis_._type' kind='mixed'"
 * @generated
 */
public interface CmdsynopsisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Command</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Command</em>' containment reference.
	 * @see #setCommand(CommandType)
	 * @see org.kermeta.Docbook.DocbookPackage#getCmdsynopsisType_Command()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='command' namespace='##targetNamespace'"
	 * @generated
	 */
	CommandType getCommand();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.CmdsynopsisType#getCommand <em>Command</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Command</em>' containment reference.
	 * @see #getCommand()
	 * @generated
	 */
	void setCommand(CommandType value);

	/**
	 * Returns the value of the '<em><b>Arg</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ArgType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arg</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getCmdsynopsisType_Arg()
	 * @model containment="true" derived="true"
	 *        extendedMetaData="kind='element' name='arg' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ArgType> getArg();

} // CmdsynopsisType
