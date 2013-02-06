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
 * A representation of the model object '<em><b>Example Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.ExampleType#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ExampleType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.ExampleType#getProgramlisting <em>Programlisting</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getExampleType()
 * @model extendedMetaData="name='example_._type' kind='mixed'"
 * @generated
 */
public interface ExampleType extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getExampleType_Id()
	 * @model required="true"
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ExampleType#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Title</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Title</em>' containment reference.
	 * @see #setTitle(TitleType)
	 * @see org.kermeta.Docbook.DocbookPackage#getExampleType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ExampleType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Programlisting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Programlisting</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programlisting</em>' containment reference.
	 * @see #setProgramlisting(ProgramlistingType)
	 * @see org.kermeta.Docbook.DocbookPackage#getExampleType_Programlisting()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='programlisting' namespace='##targetNamespace'"
	 * @generated
	 */
	ProgramlistingType getProgramlisting();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.ExampleType#getProgramlisting <em>Programlisting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Programlisting</em>' containment reference.
	 * @see #getProgramlisting()
	 * @generated
	 */
	void setProgramlisting(ProgramlistingType value);

} // ExampleType
