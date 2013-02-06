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
 * A representation of the model object '<em><b>Ref Meta Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.RefMetaType#getRefentrytitle <em>Refentrytitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefMetaType#getManvolnum <em>Manvolnum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getRefMetaType()
 * @model extendedMetaData="name='refmeta_._type' kind='elementOnly'"
 * @generated
 */
public interface RefMetaType extends EObject {
	/**
	 * Returns the value of the '<em><b>Refentrytitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refentrytitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refentrytitle</em>' containment reference.
	 * @see #setRefentrytitle(RefEntryTitleType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefMetaType_Refentrytitle()
	 * @model containment="true" required="true"
	 * @generated
	 */
	RefEntryTitleType getRefentrytitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefMetaType#getRefentrytitle <em>Refentrytitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refentrytitle</em>' containment reference.
	 * @see #getRefentrytitle()
	 * @generated
	 */
	void setRefentrytitle(RefEntryTitleType value);

	/**
	 * Returns the value of the '<em><b>Manvolnum</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Manvolnum</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Manvolnum</em>' attribute.
	 * @see #setManvolnum(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefMetaType_Manvolnum()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='manvolnum' namespace='##targetNamespace'"
	 * @generated
	 */
	String getManvolnum();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefMetaType#getManvolnum <em>Manvolnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Manvolnum</em>' attribute.
	 * @see #getManvolnum()
	 * @generated
	 */
	void setManvolnum(String value);

} // RefMetaType
