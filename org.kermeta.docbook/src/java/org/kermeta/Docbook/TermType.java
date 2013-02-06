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
 * A representation of the model object '<em><b>Term Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.TermType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TermType#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TermType#getOption <em>Option</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TermType#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TermType#getEnvar <em>Envar</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getTermType()
 * @model extendedMetaData="name='term_._type' kind='mixed'"
 * @generated
 */
public interface TermType extends EObject {
	/**
	 * Returns the value of the '<em><b>Mixed</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Mixed</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mixed</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getTermType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

	/**
	 * Returns the value of the '<em><b>Emphasis</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.EmphasisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Emphasis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Emphasis</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getTermType_Emphasis()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='emphasis' namespace='##targetNamespace' group='group:1'"
	 * @generated
	 */
	EList<EmphasisType> getEmphasis();

	/**
	 * Returns the value of the '<em><b>Option</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.OptionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Option</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Option</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getTermType_Option()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionType> getOption();

	/**
	 * Returns the value of the '<em><b>Filename</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.FileNameType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Filename</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Filename</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getTermType_Filename()
	 * @model containment="true"
	 * @generated
	 */
	EList<FileNameType> getFilename();

	/**
	 * Returns the value of the '<em><b>Envar</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.EnvarType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Envar</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Envar</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getTermType_Envar()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnvarType> getEnvar();

} // TermType
