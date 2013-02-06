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
 * A representation of the model object '<em><b>Ref Name Div Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.RefNameDivType#getRefname <em>Refname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefNameDivType#getRefpurpose <em>Refpurpose</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefNameDivType#getRefclass <em>Refclass</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getRefNameDivType()
 * @model extendedMetaData="name='refnamediv_._type' kind='elementOnly'"
 * @generated
 */
public interface RefNameDivType extends EObject {
	/**
	 * Returns the value of the '<em><b>Refname</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refname</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refname</em>' attribute.
	 * @see #setRefname(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefNameDivType_Refname()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='refname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefname();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefNameDivType#getRefname <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refname</em>' attribute.
	 * @see #getRefname()
	 * @generated
	 */
	void setRefname(String value);

	/**
	 * Returns the value of the '<em><b>Refpurpose</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refpurpose</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refpurpose</em>' attribute.
	 * @see #setRefpurpose(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefNameDivType_Refpurpose()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='refpurpose' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefpurpose();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefNameDivType#getRefpurpose <em>Refpurpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refpurpose</em>' attribute.
	 * @see #getRefpurpose()
	 * @generated
	 */
	void setRefpurpose(String value);

	/**
	 * Returns the value of the '<em><b>Refclass</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refclass</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refclass</em>' attribute.
	 * @see #setRefclass(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefNameDivType_Refclass()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='refclass' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRefclass();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefNameDivType#getRefclass <em>Refclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refclass</em>' attribute.
	 * @see #getRefclass()
	 * @generated
	 */
	void setRefclass(String value);

} // RefNameDivType
