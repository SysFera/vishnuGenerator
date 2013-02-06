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
 * A representation of the model object '<em><b>Funcsynopsis Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.FuncsynopsisType#getFuncprototype <em>Funcprototype</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getFuncsynopsisType()
 * @model extendedMetaData="name='funcsynopsis_._type' kind='mixed'"
 * @generated
 */
public interface FuncsynopsisType extends EObject {
	/**
	 * Returns the value of the '<em><b>Funcprototype</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.FuncprototypeType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcprototype</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcprototype</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getFuncsynopsisType_Funcprototype()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='funcprototype' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<FuncprototypeType> getFuncprototype();

} // FuncsynopsisType
