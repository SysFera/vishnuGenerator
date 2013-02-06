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
 * A representation of the model object '<em><b>Seg List Item Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.SegListItemType#getSeg <em>Seg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getSegListItemType()
 * @model extendedMetaData="name='seglistitem_._type' kind='elementOnly'"
 * @generated
 */
public interface SegListItemType extends EObject {
	/**
	 * Returns the value of the '<em><b>Seg</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.SegType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seg</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seg</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getSegListItemType_Seg()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='seg' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<SegType> getSeg();

} // SegListItemType
