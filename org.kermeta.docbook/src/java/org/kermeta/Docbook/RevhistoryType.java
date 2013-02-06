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
 * A representation of the model object '<em><b>Revhistory Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.RevhistoryType#getRevision <em>Revision</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getRevhistoryType()
 * @model extendedMetaData="name='revhistory_._type' kind='elementOnly'"
 * @generated
 */
public interface RevhistoryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Revision</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.RevisionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revision</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revision</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getRevhistoryType_Revision()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revision' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<RevisionType> getRevision();

} // RevhistoryType
