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
 * A representation of the model object '<em><b>Info Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.InfoType#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.InfoType#getReleaseinfo <em>Releaseinfo</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.kermeta.Docbook.DocbookPackage#getInfoType()
 * @model extendedMetaData="name='info_._type' kind='elementOnly'"
 * @generated
 */
public interface InfoType extends EObject {
	/**
	 * Returns the value of the '<em><b>Pubdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pubdate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pubdate</em>' attribute.
	 * @see #setPubdate(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Pubdate()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='pubdate' namespace='##targetNamespace'"
	 * @generated
	 */
	String getPubdate();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getPubdate <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pubdate</em>' attribute.
	 * @see #getPubdate()
	 * @generated
	 */
	void setPubdate(String value);

	/**
	 * Returns the value of the '<em><b>Author</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.AuthorType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Author</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Author()
	 * @model containment="true"
	 *        extendedMetaData="kind='element' name='author' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<AuthorType> getAuthor();

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
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Title()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	TitleType getTitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getTitle <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Title</em>' containment reference.
	 * @see #getTitle()
	 * @generated
	 */
	void setTitle(TitleType value);

	/**
	 * Returns the value of the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Subtitle</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Subtitle</em>' containment reference.
	 * @see #setSubtitle(SubtitleType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Subtitle()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='title' namespace='##targetNamespace'"
	 * @generated
	 */
	SubtitleType getSubtitle();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getSubtitle <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Subtitle</em>' containment reference.
	 * @see #getSubtitle()
	 * @generated
	 */
	void setSubtitle(SubtitleType value);

	/**
	 * Returns the value of the '<em><b>Group</b></em>' attribute list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.util.FeatureMap.Entry}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Group()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.EFeatureMapEntry" many="true"
	 *        extendedMetaData="kind='group' name='group:3'"
	 * @generated
	 */
	FeatureMap getGroup();

	/**
	 * Returns the value of the '<em><b>Bibliomisc</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bibliomisc</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bibliomisc</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Bibliomisc()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='bibliomisc' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<String> getBibliomisc();

	/**
	 * Returns the value of the '<em><b>Date</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date</em>' attribute list.
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Date()
	 * @model unique="false" dataType="org.eclipse.emf.ecore.xml.type.String" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='date' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<String> getDate();

	/**
	 * Returns the value of the '<em><b>Keywordset</b></em>' containment reference list.
	 * The list contents are of type {@link org.kermeta.Docbook.KeywordsetType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Keywordset</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Keywordset</em>' containment reference list.
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Keywordset()
	 * @model containment="true" transient="true" volatile="true" derived="true"
	 *        extendedMetaData="kind='element' name='keywordset' namespace='##targetNamespace' group='group:3'"
	 * @generated
	 */
	EList<KeywordsetType> getKeywordset();

	/**
	 * Returns the value of the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Abstract</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Abstract</em>' containment reference.
	 * @see #setAbstract(AbstractType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Abstract()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='abstract' namespace='##targetNamespace'"
	 * @generated
	 */
	AbstractType getAbstract();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getAbstract <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Abstract</em>' containment reference.
	 * @see #getAbstract()
	 * @generated
	 */
	void setAbstract(AbstractType value);

	/**
	 * Returns the value of the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Publisher</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Publisher</em>' containment reference.
	 * @see #setPublisher(PublisherType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Publisher()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='publisher' namespace='##targetNamespace'"
	 * @generated
	 */
	PublisherType getPublisher();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getPublisher <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Publisher</em>' containment reference.
	 * @see #getPublisher()
	 * @generated
	 */
	void setPublisher(PublisherType value);

	/**
	 * Returns the value of the '<em><b>Confgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Confgroup</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Confgroup</em>' containment reference.
	 * @see #setConfgroup(ConfgroupType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Confgroup()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='confgroup' namespace='##targetNamespace'"
	 * @generated
	 */
	ConfgroupType getConfgroup();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getConfgroup <em>Confgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Confgroup</em>' containment reference.
	 * @see #getConfgroup()
	 * @generated
	 */
	void setConfgroup(ConfgroupType value);

	/**
	 * Returns the value of the '<em><b>Revhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Revhistory</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Revhistory</em>' containment reference.
	 * @see #setRevhistory(RevhistoryType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Revhistory()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='revhistory' namespace='##targetNamespace'"
	 * @generated
	 */
	RevhistoryType getRevhistory();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getRevhistory <em>Revhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Revhistory</em>' containment reference.
	 * @see #getRevhistory()
	 * @generated
	 */
	void setRevhistory(RevhistoryType value);

	/**
	 * Returns the value of the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Copyright</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Copyright</em>' containment reference.
	 * @see #setCopyright(CopyrightType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Copyright()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='copyright' namespace='##targetNamespace'"
	 * @generated
	 */
	CopyrightType getCopyright();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getCopyright <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Copyright</em>' containment reference.
	 * @see #getCopyright()
	 * @generated
	 */
	void setCopyright(CopyrightType value);

	/**
	 * Returns the value of the '<em><b>Legalnotice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Legalnotice</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Legalnotice</em>' containment reference.
	 * @see #setLegalnotice(LegalNoticeType)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Legalnotice()
	 * @model containment="true" required="true"
	 *        extendedMetaData="kind='element' name='legalnotice' namespace='##targetNamespace'"
	 * @generated
	 */
	LegalNoticeType getLegalnotice();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getLegalnotice <em>Legalnotice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Legalnotice</em>' containment reference.
	 * @see #getLegalnotice()
	 * @generated
	 */
	void setLegalnotice(LegalNoticeType value);

	/**
	 * Returns the value of the '<em><b>Productname</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productname</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productname</em>' attribute.
	 * @see #setProductname(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Productname()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='productname' namespace='##targetNamespace'"
	 * @generated
	 */
	String getProductname();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getProductname <em>Productname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Productname</em>' attribute.
	 * @see #getProductname()
	 * @generated
	 */
	void setProductname(String value);

	/**
	 * Returns the value of the '<em><b>Releaseinfo</b></em>' attribute.
	 * The default value is <code>""</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Releaseinfo</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Releaseinfo</em>' attribute.
	 * @see #setReleaseinfo(String)
	 * @see org.kermeta.Docbook.DocbookPackage#getInfoType_Releaseinfo()
	 * @model default="" dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 *        extendedMetaData="kind='element' name='releaseinfo' namespace='##targetNamespace'"
	 * @generated
	 */
	String getReleaseinfo();

	/**
	 * Sets the value of the '{@link org.kermeta.Docbook.InfoType#getReleaseinfo <em>Releaseinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Releaseinfo</em>' attribute.
	 * @see #getReleaseinfo()
	 * @generated
	 */
	void setReleaseinfo(String value);

} // InfoType
