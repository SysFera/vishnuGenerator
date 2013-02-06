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
 * A representation of the model object '<em><b>Arg Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ArgType#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ArgType#getOption <em>Option</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ArgType#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ArgType#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ArgType#getRep <em>Rep</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getArgType()
 * @model extendedMetaData="name='arg_._type' kind='mixed'"
 * @generated
 */
public interface ArgType extends EObject {
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
	 * @see org.kermeta.Docbook.DocbookPackage#getArgType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

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
	 * @see org.kermeta.Docbook.DocbookPackage#getArgType_Option()
	 * @model containment="true"
	 * @generated
	 */
	EList<OptionType> getOption();

	/**
	 * Returns the value of the '<em><b>Replaceable</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ReplaceableType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Replaceable</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Replaceable</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getArgType_Replaceable()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='replaceable' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ReplaceableType> getReplaceable();

	/**
	 * Returns the value of the '<em><b>Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Choice</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Choice</em>' attribute.
	 * @see #setChoice(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getArgType_Choice()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='choice' namespace='##targetNamespace'"
	 * @generated
	 */
	String getChoice();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ArgType#getChoice <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Choice</em>' attribute.
	 * @see #getChoice()
	 * @generated
	 */
	void setChoice(String value);

	/**
	 * Returns the value of the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rep</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rep</em>' attribute.
	 * @see #setRep(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getArgType_Rep()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NCName"
	 *        extendedMetaData="kind='attribute' name='rep' namespace='##targetNamespace'"
	 * @generated
	 */
	String getRep();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ArgType#getRep <em>Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep</em>' attribute.
	 * @see #getRep()
	 * @generated
	 */
	void setRep(String value);

} // ArgType
