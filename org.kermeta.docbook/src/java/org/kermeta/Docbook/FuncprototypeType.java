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
 * A representation of the model object '<em><b>Funcprototype Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.FuncprototypeType#getFuncdef <em>Funcdef</em>}</li>
 *   <li>{@link org.kermeta.Docbook.FuncprototypeType#getParamdef <em>Paramdef</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getFuncprototypeType()
 * @model extendedMetaData="name='funcprototype_._type' kind='mixed'"
 * @generated
 */
public interface FuncprototypeType extends EObject {
	/**
	 * Returns the value of the '<em><b>Funcdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcdef</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcdef</em>' containment reference.
	 * @see #setFuncdef(FuncdefType)
	 * @see org.kermeta.Docbook.DocbookPackage#getFuncprototypeType_Funcdef()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='funcdef' namespace='##targetNamespace'"
	 * @generated
	 */
	FuncdefType getFuncdef();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.FuncprototypeType#getFuncdef <em>Funcdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Funcdef</em>' containment reference.
	 * @see #getFuncdef()
	 * @generated
	 */
	void setFuncdef(FuncdefType value);

	/**
	 * Returns the value of the '<em><b>Paramdef</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ParamdefType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paramdef</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paramdef</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getFuncprototypeType_Paramdef()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='paramdef' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ParamdefType> getParamdef();

} // FuncprototypeType
