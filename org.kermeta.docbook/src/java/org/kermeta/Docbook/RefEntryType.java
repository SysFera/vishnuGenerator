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
 * A representation of the model object '<em><b>Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.RefEntryType#getInfo <em>Info</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefEntryType#getRefmeta <em>Refmeta</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefEntryType#getRefnamediv <em>Refnamediv</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefEntryType#getRefsynopsisdiv <em>Refsynopsisdiv</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefEntryType#getRefsect1 <em>Refsect1</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefEntryType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getRefEntryType()
 * @model extendedMetaData="name='refentry_._type' kind='elementOnly'"
 * @generated
 */
public interface RefEntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Info</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Info</em>' containment reference.
	 * @see #setInfo(InfoType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefEntryType_Info()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='info' namespace='##targetNamespace'"
	 * @generated
	 */
	InfoType getInfo();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefEntryType#getInfo <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Info</em>' containment reference.
	 * @see #getInfo()
	 * @generated
	 */
	void setInfo(InfoType value);

	/**
	 * Returns the value of the '<em><b>Refmeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refmeta</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refmeta</em>' containment reference.
	 * @see #setRefmeta(RefMetaType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefEntryType_Refmeta()
	 * @model containment="true"
	 * @generated
	 */
	RefMetaType getRefmeta();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefEntryType#getRefmeta <em>Refmeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refmeta</em>' containment reference.
	 * @see #getRefmeta()
	 * @generated
	 */
	void setRefmeta(RefMetaType value);

	/**
	 * Returns the value of the '<em><b>Refnamediv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refnamediv</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refnamediv</em>' containment reference.
	 * @see #setRefnamediv(RefNameDivType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefEntryType_Refnamediv()
	 * @model containment="true"
	 * @generated
	 */
	RefNameDivType getRefnamediv();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefEntryType#getRefnamediv <em>Refnamediv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refnamediv</em>' containment reference.
	 * @see #getRefnamediv()
	 * @generated
	 */
	void setRefnamediv(RefNameDivType value);

	/**
	 * Returns the value of the '<em><b>Refsynopsisdiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refsynopsisdiv</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsynopsisdiv</em>' containment reference.
	 * @see #setRefsynopsisdiv(RefSynopsisDivType)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefEntryType_Refsynopsisdiv()
	 * @model containment="true"
	 * @generated
	 */
	RefSynopsisDivType getRefsynopsisdiv();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefEntryType#getRefsynopsisdiv <em>Refsynopsisdiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Refsynopsisdiv</em>' containment reference.
	 * @see #getRefsynopsisdiv()
	 * @generated
	 */
	void setRefsynopsisdiv(RefSynopsisDivType value);

	/**
	 * Returns the value of the '<em><b>Refsect1</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.RefSect1Type}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Refsect1</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Refsect1</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getRefEntryType_Refsect1()
	 * @model containment="true"
	 * @generated
	 */
	EList<RefSect1Type> getRefsect1();

	/**
	 * Returns the value of the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' attribute.
	 * @see #setVersion(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getRefEntryType_Version()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" derived="true"
	 *        extendedMetaData="kind='attribute' name='version'"
	 * @generated
	 */
	String getVersion();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.RefEntryType#getVersion <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' attribute.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(String value);

} // RefEntryType
