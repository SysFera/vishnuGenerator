/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Revision Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.RevisionType#getRevnumber <em>Revnumber</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RevisionType#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RevisionType#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RevisionType#getRevdescription <em>Revdescription</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getRevisionType()
 * @model extendedMetaData="name='revision_._type' kind='elementOnly'"
 * @generated
 */
public interface RevisionType extends EObject {
	/**
	 * Returns the value of the '<em><b>Revnumber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revnumber</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revnumber</em>' containment reference.
	 * @see #setRevnumber(RevnumberType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRevisionType_Revnumber()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revnumber' namespace='##targetNamespace'"
	 * @generated
	 */
	RevnumberType getRevnumber();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RevisionType#getRevnumber <em>Revnumber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revnumber</em>' containment reference.
	 * @see #getRevnumber()
	 * @generated
	 */
	void setRevnumber(RevnumberType value);

	/**
	 * Returns the value of the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' containment reference.
	 * @see #setDate(DateType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRevisionType_Date()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace'"
	 * @generated
	 */
	DateType getDate();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RevisionType#getDate <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date</em>' containment reference.
	 * @see #getDate()
	 * @generated
	 */
	void setDate(DateType value);

	/**
	 * Returns the value of the '<em><b>Revdescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revdescription</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revdescription</em>' containment reference.
	 * @see #setRevdescription(RevdescriptionType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRevisionType_Revdescription()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='revdescription' namespace='##targetNamespace'"
	 * @generated
	 */
	RevdescriptionType getRevdescription();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RevisionType#getRevdescription <em>Revdescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revdescription</em>' containment reference.
	 * @see #getRevdescription()
	 * @generated
	 */
	void setRevdescription(RevdescriptionType value);

	/**
	 * Returns the value of the '<em><b>Authorinitials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorinitials</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorinitials</em>' containment reference.
	 * @see #setAuthorinitials(AuthorinitialsType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRevisionType_Authorinitials()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='authorinitials' namespace='##targetNamespace'"
	 * @generated
	 */
	AuthorinitialsType getAuthorinitials();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RevisionType#getAuthorinitials <em>Authorinitials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Authorinitials</em>' containment reference.
	 * @see #getAuthorinitials()
	 * @generated
	 */
	void setAuthorinitials(AuthorinitialsType value);

} // RevisionType
