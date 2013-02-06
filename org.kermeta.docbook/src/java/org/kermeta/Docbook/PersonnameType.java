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
 * A representation of the model object '<em><b>Personname Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.PersonnameType#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.PersonnameType#getSurname <em>Surname</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getPersonnameType()
 * @model extendedMetaData="name='personname_._type' kind='elementOnly'"
 * @generated
 */
public interface PersonnameType extends EObject {
	/**
	 * Returns the value of the '<em><b>Firstname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Firstname</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Firstname</em>' containment reference.
	 * @see #setFirstname(FirstnameType)
	 * @see org.kermeta.Docbook.DocbookPackage#getPersonnameType_Firstname()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='firstname' namespace='##targetNamespace'"
	 * @generated
	 */
	FirstnameType getFirstname();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.PersonnameType#getFirstname <em>Firstname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Firstname</em>' containment reference.
	 * @see #getFirstname()
	 * @generated
	 */
	void setFirstname(FirstnameType value);

	/**
	 * Returns the value of the '<em><b>Surname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Surname</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Surname</em>' containment reference.
	 * @see #setSurname(SurnameType)
	 * @see org.kermeta.Docbook.DocbookPackage#getPersonnameType_Surname()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='surname' namespace='##targetNamespace'"
	 * @generated
	 */
	SurnameType getSurname();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.PersonnameType#getSurname <em>Surname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Surname</em>' containment reference.
	 * @see #getSurname()
	 * @generated
	 */
	void setSurname(SurnameType value);

} // PersonnameType
