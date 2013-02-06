/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Segmented List Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.SegmentedListType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.SegmentedListType#getSegtitle <em>Segtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.SegmentedListType#getSeglistitem <em>Seglistitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getSegmentedListType()
 * @model extendedMetaData="name='segmentedlist_._type' kind='elementOnly'"
 * @generated
 */
public interface SegmentedListType extends EObject {
	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getSegmentedListType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Segtitle</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segtitle</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segtitle</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getSegmentedListType_Segtitle()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='segtitle' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<String> getSegtitle();

	/**
	 * Returns the value of the '<em><b>Seglistitem</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.SegListItemType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seglistitem</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seglistitem</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getSegmentedListType_Seglistitem()
	 * @model containment="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='seglistitem' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<SegListItemType> getSeglistitem();

} // SegmentedListType
