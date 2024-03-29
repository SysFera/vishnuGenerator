/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import java.math.BigInteger;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tgroup Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.TgroupType#getColspec <em>Colspec</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TgroupType#getThead <em>Thead</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TgroupType#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TgroupType#getCols <em>Cols</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TgroupType#getColseq <em>Colseq</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TgroupType#getRowseq <em>Rowseq</em>}</li>
 *   <li>{@link org.kermeta.Docbook.TgroupType#getAlign <em>Align</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType()
 * @model extendedMetaData="name='tgroup_._type' kind='elementOnly'"
 * @generated
 */
public interface TgroupType extends EObject {
	/**
	 * Returns the value of the '<em><b>Colspec</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.ColspecType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colspec</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colspec</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType_Colspec()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='colspec' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<ColspecType> getColspec();

	/**
	 * Returns the value of the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Thead</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Thead</em>' containment reference.
	 * @see #setThead(TheadType)
	 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType_Thead()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='thead' namespace='##targetNamespace'"
	 * @generated
	 */
	TheadType getThead();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.TgroupType#getThead <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Thead</em>' containment reference.
	 * @see #getThead()
	 * @generated
	 */
	void setThead(TheadType value);

	/**
	 * Returns the value of the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tbody</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tbody</em>' containment reference.
	 * @see #setTbody(TbodyType)
	 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType_Tbody()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='tbody' namespace='##targetNamespace'"
	 * @generated
	 */
	TbodyType getTbody();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.TgroupType#getTbody <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tbody</em>' containment reference.
	 * @see #getTbody()
	 * @generated
	 */
	void setTbody(TbodyType value);

	/**
	 * Returns the value of the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cols</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cols</em>' attribute.
	 * @see #setCols(BigInteger)
	 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType_Cols()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='cols' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getCols();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.TgroupType#getCols <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Cols</em>' attribute.
	 * @see #getCols()
	 * @generated
	 */
	void setCols(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Colseq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Colseq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Colseq</em>' attribute.
	 * @see #setColseq(BigInteger)
	 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType_Colseq()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='colseq' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getColseq();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.TgroupType#getColseq <em>Colseq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Colseq</em>' attribute.
	 * @see #getColseq()
	 * @generated
	 */
	void setColseq(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Rowseq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rowseq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Rowseq</em>' attribute.
	 * @see #setRowseq(BigInteger)
	 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType_Rowseq()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Integer" required="true"
	 *        extendedMetaData="kind='attribute' name='rowseq' namespace='##targetNamespace'"
	 * @generated
	 */
	BigInteger getRowseq();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.TgroupType#getRowseq <em>Rowseq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rowseq</em>' attribute.
	 * @see #getRowseq()
	 * @generated
	 */
	void setRowseq(BigInteger value);

	/**
	 * Returns the value of the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Align</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Align</em>' attribute.
	 * @see #setAlign(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getTgroupType_Align()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.NMTOKEN" required="true"
	 *        extendedMetaData="kind='attribute' name='align' namespace='##targetNamespace'"
	 * @generated
	 */
	String getAlign();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.TgroupType#getAlign <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Align</em>' attribute.
	 * @see #getAlign()
	 * @generated
	 */
	void setAlign(String value);

} // TgroupType
