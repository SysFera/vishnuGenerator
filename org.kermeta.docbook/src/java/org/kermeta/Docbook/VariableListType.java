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
 * A representation of the model object '<em><b>Variable List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.VariableListType#getVarlistentry <em>Varlistentry</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getVariableListType()
 * @model extendedMetaData="name='variablelist_._type' kind='elementOnly'"
 * @generated
 */
public interface VariableListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Varlistentry</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.VarListEntryType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Varlistentry</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Varlistentry</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getVariableListType_Varlistentry()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='varlistentry' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<VarListEntryType> getVarlistentry();

} // VariableListType
