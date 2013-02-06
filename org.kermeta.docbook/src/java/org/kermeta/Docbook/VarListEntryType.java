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
 * A representation of the model object '<em><b>Var List Entry Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.VarListEntryType#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.kermeta.Docbook.VarListEntryType#getTermlength <em>Termlength</em>}</li>
 *   <li>{@link org.kermeta.Docbook.VarListEntryType#getTerm <em>Term</em>}</li>
 *   <li>{@link org.kermeta.Docbook.VarListEntryType#getListitem <em>Listitem</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getVarListEntryType()
 * @model extendedMetaData="name='varlistentry_._type' kind='elementOnly'"
 * @generated
 */
public interface VarListEntryType extends EObject {
	/**
	 * Returns the value of the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spacing</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spacing</em>' attribute.
	 * @see #setSpacing(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getVarListEntryType_Spacing()
	 * @model
	 * @generated
	 */
	String getSpacing();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.VarListEntryType#getSpacing <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Spacing</em>' attribute.
	 * @see #getSpacing()
	 * @generated
	 */
	void setSpacing(String value);

	/**
	 * Returns the value of the '<em><b>Termlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Termlength</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Termlength</em>' attribute.
	 * @see #setTermlength(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getVarListEntryType_Termlength()
	 * @model
	 * @generated
	 */
	String getTermlength();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.VarListEntryType#getTermlength <em>Termlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Termlength</em>' attribute.
	 * @see #getTermlength()
	 * @generated
	 */
	void setTermlength(String value);

	/**
	 * Returns the value of the '<em><b>Term</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.TermType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Term</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Term</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getVarListEntryType_Term()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<TermType> getTerm();

	/**
	 * Returns the value of the '<em><b>Listitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Listitem</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Listitem</em>' containment reference.
	 * @see #setListitem(ListitemType)
	 * @see org.kermeta.Docbook.DocbookPackage#getVarListEntryType_Listitem()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ListitemType getListitem();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.VarListEntryType#getListitem <em>Listitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Listitem</em>' containment reference.
	 * @see #getListitem()
	 * @generated
	 */
	void setListitem(ListitemType value);

} // VarListEntryType
