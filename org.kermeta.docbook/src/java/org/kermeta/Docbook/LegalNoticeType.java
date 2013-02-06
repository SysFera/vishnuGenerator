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
 * A representation of the model object '<em><b>Legal Notice Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.LegalNoticeType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.LegalNoticeType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.LegalNoticeType#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.kermeta.Docbook.LegalNoticeType#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.LegalNoticeType#getOrderedlist <em>Orderedlist</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getLegalNoticeType()
 * @model extendedMetaData="name='legalnotice_._type' kind='elementOnly'"
 * @generated
 */
public interface LegalNoticeType extends EObject {
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
	 * @see org.kermeta.Docbook.DocbookPackage#getLegalNoticeType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:0'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.kermeta.Docbook.DocbookPackage#getLegalNoticeType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.LegalNoticeType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Revhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revhistory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory</em>' containment reference.
	 * @see #setRevhistory(RevhistoryType)
	 * @see org.kermeta.Docbook.DocbookPackage#getLegalNoticeType_Revhistory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	RevhistoryType getRevhistory();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.LegalNoticeType#getRevhistory <em>Revhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revhistory</em>' containment reference.
	 * @see #getRevhistory()
	 * @generated
	 */
	void setRevhistory(RevhistoryType value);

	/**
	 * Returns the value of the '<em><b>Para</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ParaType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Para</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Para</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getLegalNoticeType_Para()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='para' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<ParaType> getPara();

	/**
	 * Returns the value of the '<em><b>Orderedlist</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.OrderedlistType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Orderedlist</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Orderedlist</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getLegalNoticeType_Orderedlist()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='orderedlist' namespace='##targetNamespace' group='group:0'"
	 * @generated
	 */
	EList<OrderedlistType> getOrderedlist();

} // LegalNoticeType
