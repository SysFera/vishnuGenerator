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
 * A representation of the model object '<em><b>Author Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.AuthorType#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.AuthorType#getContrib <em>Contrib</em>}</li>
 *   <li>{@link org.kermeta.Docbook.AuthorType#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getAuthorType()
 * @model extendedMetaData="name='author_._type' kind='elementOnly'"
 * @generated
 */
public interface AuthorType extends EObject {
	/**
	 * Returns the value of the '<em><b>Personname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Personname</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Personname</em>' containment reference.
	 * @see #setPersonname(PersonnameType)
	 * @see org.kermeta.Docbook.DocbookPackage#getAuthorType_Personname()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='personname' namespace='##targetNamespace'"
	 * @generated
	 */
	PersonnameType getPersonname();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.AuthorType#getPersonname <em>Personname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Personname</em>' containment reference.
	 * @see #getPersonname()
	 * @generated
	 */
	void setPersonname(PersonnameType value);

	/**
	 * Returns the value of the '<em><b>Contrib</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contrib</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contrib</em>' attribute.
	 * @see #setContrib(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getAuthorType_Contrib()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='contrib' namespace='##targetNamespace'"
	 * @generated
	 */
	String getContrib();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.AuthorType#getContrib <em>Contrib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contrib</em>' attribute.
	 * @see #getContrib()
	 * @generated
	 */
	void setContrib(String value);

	/**
	 * Returns the value of the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Address</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Address</em>' containment reference.
	 * @see #setAddress(AddressType)
	 * @see org.kermeta.Docbook.DocbookPackage#getAuthorType_Address()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='address' namespace='##targetNamespace'"
	 * @generated
	 */
	AddressType getAddress();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.AuthorType#getAddress <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Address</em>' containment reference.
	 * @see #getAddress()
	 * @generated
	 */
	void setAddress(AddressType value);

} // AuthorType
