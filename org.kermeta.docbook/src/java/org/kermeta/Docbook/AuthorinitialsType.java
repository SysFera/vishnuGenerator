/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.ecore.EObject;

import org.eclipse.emf.ecore.util.FeatureMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Authorinitials Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.AuthorinitialsType#getMixed <em>Mixed</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getAuthorinitialsType()
 * @model extendedMetaData="name='authorinitials_._type' kind='mixed'"
 * @generated
 */
public interface AuthorinitialsType extends EObject {
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
	 * @see org.kermeta.Docbook.DocbookPackage#getAuthorinitialsType_Mixed()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='elementWildcard' name=':mixed'"
	 * @generated
	 */
	FeatureMap getMixed();

} // AuthorinitialsType
