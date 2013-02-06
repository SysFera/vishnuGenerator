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
 * A representation of the model object '<em><b>Ref Synopsis Div Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.RefSynopsisDivType#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.kermeta.Docbook.RefSynopsisDivType#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getRefSynopsisDivType()
 * @model extendedMetaData="name='refsynopsisdiv_._type' kind='elementOnly'"
 * @generated
 */
public interface RefSynopsisDivType extends EObject {
	/**
	 * Returns the value of the '<em><b>Cmdsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.CmdsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cmdsynopsis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cmdsynopsis</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getRefSynopsisDivType_Cmdsynopsis()
	 * @model containment="true"
	 * @generated
	 */
	EList<CmdsynopsisType> getCmdsynopsis();

	/**
	 * Returns the value of the '<em><b>Funcsynopsis</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.FuncsynopsisType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Funcsynopsis</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Funcsynopsis</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getRefSynopsisDivType_Funcsynopsis()
	 * @model containment="true"
	 * @generated
	 */
	EList<FuncsynopsisType> getFuncsynopsis();

} // RefSynopsisDivType
