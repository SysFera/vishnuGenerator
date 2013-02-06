/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.kermeta.Docbook.DocbookFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface DocbookPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "Docbook";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://docbook.org/ns/docbook";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "Docbook";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	DocbookPackage eINSTANCE = org.kermeta.Docbook.impl.DocbookPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.AbstractTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAbstractType()
	 * @generated
	 */
	int ABSTRACT_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE__PARA = 0;

	/**
	 * The number of structural features of the '<em>Abstract Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ABSTRACT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.AddressTypeImpl <em>Address Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.AddressTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAddressType()
	 * @generated
	 */
	int ADDRESS_TYPE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__STATE = 0;

	/**
	 * The feature id for the '<em><b>Otheraddr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__OTHERADDR = 1;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__FORMAT = 2;

	/**
	 * The feature id for the '<em><b>Email</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE__EMAIL = 3;

	/**
	 * The number of structural features of the '<em>Address Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDRESS_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.AuthorinitialsTypeImpl <em>Authorinitials Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.AuthorinitialsTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAuthorinitialsType()
	 * @generated
	 */
	int AUTHORINITIALS_TYPE = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.AuthorTypeImpl <em>Author Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.AuthorTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAuthorType()
	 * @generated
	 */
	int AUTHOR_TYPE = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.BookTypeImpl <em>Book Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.BookTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getBookType()
	 * @generated
	 */
	int BOOK_TYPE = 5;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ChapterTypeImpl <em>Chapter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ChapterTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getChapterType()
	 * @generated
	 */
	int CHAPTER_TYPE = 6;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ColspecTypeImpl <em>Colspec Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ColspecTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getColspecType()
	 * @generated
	 */
	int COLSPEC_TYPE = 7;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ConfgroupTypeImpl <em>Confgroup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ConfgroupTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getConfgroupType()
	 * @generated
	 */
	int CONFGROUP_TYPE = 10;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.DateTypeImpl <em>Date Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.DateTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getDateType()
	 * @generated
	 */
	int DATE_TYPE = 12;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.DocumentRootImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 13;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.EmphasisTypeImpl <em>Emphasis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.EmphasisTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getEmphasisType()
	 * @generated
	 */
	int EMPHASIS_TYPE = 14;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.EntryTypeImpl <em>Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.EntryTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getEntryType()
	 * @generated
	 */
	int ENTRY_TYPE = 15;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FigureTypeImpl <em>Figure Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FigureTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFigureType()
	 * @generated
	 */
	int FIGURE_TYPE = 18;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FirstnameTypeImpl <em>Firstname Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FirstnameTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFirstnameType()
	 * @generated
	 */
	int FIRSTNAME_TYPE = 20;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FootnoteTypeImpl <em>Footnote Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FootnoteTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFootnoteType()
	 * @generated
	 */
	int FOOTNOTE_TYPE = 21;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ImagedataTypeImpl <em>Imagedata Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ImagedataTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getImagedataType()
	 * @generated
	 */
	int IMAGEDATA_TYPE = 26;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ImageobjectTypeImpl <em>Imageobject Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ImageobjectTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getImageobjectType()
	 * @generated
	 */
	int IMAGEOBJECT_TYPE = 27;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ImportantTypeImpl <em>Important Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ImportantTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getImportantType()
	 * @generated
	 */
	int IMPORTANT_TYPE = 28;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.InformaltableTypeImpl <em>Informaltable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.InformaltableTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getInformaltableType()
	 * @generated
	 */
	int INFORMALTABLE_TYPE = 29;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.InfoTypeImpl <em>Info Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.InfoTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getInfoType()
	 * @generated
	 */
	int INFO_TYPE = 30;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ItemizedlistTypeImpl <em>Itemizedlist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ItemizedlistTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getItemizedlistType()
	 * @generated
	 */
	int ITEMIZEDLIST_TYPE = 31;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.KeywordsetTypeImpl <em>Keywordset Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.KeywordsetTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getKeywordsetType()
	 * @generated
	 */
	int KEYWORDSET_TYPE = 32;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.LinkTypeImpl <em>Link Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.LinkTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getLinkType()
	 * @generated
	 */
	int LINK_TYPE = 34;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ListitemTypeImpl <em>Listitem Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ListitemTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getListitemType()
	 * @generated
	 */
	int LISTITEM_TYPE = 35;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.LiteralTypeImpl <em>Literal Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.LiteralTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getLiteralType()
	 * @generated
	 */
	int LITERAL_TYPE = 36;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.MediaobjectTypeImpl <em>Mediaobject Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.MediaobjectTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getMediaobjectType()
	 * @generated
	 */
	int MEDIAOBJECT_TYPE = 37;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.NoteTypeImpl <em>Note Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.NoteTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getNoteType()
	 * @generated
	 */
	int NOTE_TYPE = 38;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.OrderedlistTypeImpl <em>Orderedlist Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.OrderedlistTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getOrderedlistType()
	 * @generated
	 */
	int ORDEREDLIST_TYPE = 40;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.OtheraddrTypeImpl <em>Otheraddr Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.OtheraddrTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getOtheraddrType()
	 * @generated
	 */
	int OTHERADDR_TYPE = 41;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ParaTypeImpl <em>Para Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ParaTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getParaType()
	 * @generated
	 */
	int PARA_TYPE = 44;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.PersonnameTypeImpl <em>Personname Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.PersonnameTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPersonnameType()
	 * @generated
	 */
	int PERSONNAME_TYPE = 45;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.PhraseTypeImpl <em>Phrase Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.PhraseTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPhraseType()
	 * @generated
	 */
	int PHRASE_TYPE = 46;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.PrefaceTypeImpl <em>Preface Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.PrefaceTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPrefaceType()
	 * @generated
	 */
	int PREFACE_TYPE = 47;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ProgramlistingTypeImpl <em>Programlisting Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ProgramlistingTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getProgramlistingType()
	 * @generated
	 */
	int PROGRAMLISTING_TYPE = 48;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.PublisherTypeImpl <em>Publisher Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.PublisherTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPublisherType()
	 * @generated
	 */
	int PUBLISHER_TYPE = 49;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RevdescriptionTypeImpl <em>Revdescription Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RevdescriptionTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevdescriptionType()
	 * @generated
	 */
	int REVDESCRIPTION_TYPE = 58;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RevhistoryTypeImpl <em>Revhistory Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RevhistoryTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevhistoryType()
	 * @generated
	 */
	int REVHISTORY_TYPE = 59;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RevisionTypeImpl <em>Revision Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RevisionTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevisionType()
	 * @generated
	 */
	int REVISION_TYPE = 60;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RevnumberTypeImpl <em>Revnumber Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RevnumberTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevnumberType()
	 * @generated
	 */
	int REVNUMBER_TYPE = 61;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RowTypeImpl <em>Row Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RowTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRowType()
	 * @generated
	 */
	int ROW_TYPE = 62;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.SectionTypeImpl <em>Section Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.SectionTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSectionType()
	 * @generated
	 */
	int SECTION_TYPE = 63;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.SubtitleTypeImpl <em>Subtitle Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.SubtitleTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSubtitleType()
	 * @generated
	 */
	int SUBTITLE_TYPE = 67;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.SurnameTypeImpl <em>Surname Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.SurnameTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSurnameType()
	 * @generated
	 */
	int SURNAME_TYPE = 68;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.TableTypeImpl <em>Table Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.TableTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTableType()
	 * @generated
	 */
	int TABLE_TYPE = 69;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.TbodyTypeImpl <em>Tbody Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.TbodyTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTbodyType()
	 * @generated
	 */
	int TBODY_TYPE = 71;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.TgroupTypeImpl <em>Tgroup Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.TgroupTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTgroupType()
	 * @generated
	 */
	int TGROUP_TYPE = 72;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.TheadTypeImpl <em>Thead Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.TheadTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTheadType()
	 * @generated
	 */
	int THEAD_TYPE = 73;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.TipTypeImpl <em>Tip Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.TipTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTipType()
	 * @generated
	 */
	int TIP_TYPE = 74;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.TitleTypeImpl <em>Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.TitleTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTitleType()
	 * @generated
	 */
	int TITLE_TYPE = 75;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.UlinkTypeImpl <em>Ulink Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.UlinkTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getUlinkType()
	 * @generated
	 */
	int ULINK_TYPE = 76;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FuncsynopsisTypeImpl <em>Funcsynopsis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FuncsynopsisTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFuncsynopsisType()
	 * @generated
	 */
	int FUNCSYNOPSIS_TYPE = 24;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FuncprototypeTypeImpl <em>Funcprototype Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FuncprototypeTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFuncprototypeType()
	 * @generated
	 */
	int FUNCPROTOTYPE_TYPE = 23;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ParamdefTypeImpl <em>Paramdef Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ParamdefTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getParamdefType()
	 * @generated
	 */
	int PARAMDEF_TYPE = 43;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FuncdefTypeImpl <em>Funcdef Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FuncdefTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFuncdefType()
	 * @generated
	 */
	int FUNCDEF_TYPE = 22;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ParameterTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getParameterType()
	 * @generated
	 */
	int PARAMETER_TYPE = 42;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FunctionTypeImpl <em>Function Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FunctionTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFunctionType()
	 * @generated
	 */
	int FUNCTION_TYPE = 25;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ExampleTypeImpl <em>Example Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ExampleTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getExampleType()
	 * @generated
	 */
	int EXAMPLE_TYPE = 17;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.CmdsynopsisTypeImpl <em>Cmdsynopsis Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.CmdsynopsisTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getCmdsynopsisType()
	 * @generated
	 */
	int CMDSYNOPSIS_TYPE = 8;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.CommandTypeImpl <em>Command Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.CommandTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getCommandType()
	 * @generated
	 */
	int COMMAND_TYPE = 9;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ArgTypeImpl <em>Arg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ArgTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getArgType()
	 * @generated
	 */
	int ARG_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE__OPTION = 1;

	/**
	 * The feature id for the '<em><b>Replaceable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE__REPLACEABLE = 2;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE__CHOICE = 3;

	/**
	 * The feature id for the '<em><b>Rep</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE__REP = 4;

	/**
	 * The number of structural features of the '<em>Arg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ARG_TYPE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORINITIALS_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Authorinitials Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHORINITIALS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Personname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TYPE__PERSONNAME = 0;

	/**
	 * The feature id for the '<em><b>Contrib</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TYPE__CONTRIB = 1;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TYPE__ADDRESS = 2;

	/**
	 * The number of structural features of the '<em>Author Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTHOR_TYPE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__INFO = 0;

	/**
	 * The feature id for the '<em><b>Preface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__PREFACE = 1;

	/**
	 * The feature id for the '<em><b>Chapter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__CHAPTER = 2;

	/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__REFERENCE = 3;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__LANG = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__VERSION = 5;

	/**
	 * The feature id for the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE__LABEL = 6;

	/**
	 * The number of structural features of the '<em>Book Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BOOK_TYPE_FEATURE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_TYPE__PARA = 1;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_TYPE__NOTE = 2;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_TYPE__SECTION = 3;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_TYPE__ANNOTATIONS = 4;

	/**
	 * The number of structural features of the '<em>Chapter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAPTER_TYPE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Colname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLSPEC_TYPE__COLNAME = 0;

	/**
	 * The feature id for the '<em><b>Colwidth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLSPEC_TYPE__COLWIDTH = 1;

	/**
	 * The number of structural features of the '<em>Colspec Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COLSPEC_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Command</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMDSYNOPSIS_TYPE__COMMAND = 0;

	/**
	 * The feature id for the '<em><b>Arg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMDSYNOPSIS_TYPE__ARG = 1;

	/**
	 * The number of structural features of the '<em>Cmdsynopsis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CMDSYNOPSIS_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Command Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMAND_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Conftitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFGROUP_TYPE__CONFTITLE = 0;

	/**
	 * The feature id for the '<em><b>Confnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFGROUP_TYPE__CONFNUM = 1;

	/**
	 * The feature id for the '<em><b>Confsponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFGROUP_TYPE__CONFSPONSOR = 2;

	/**
	 * The number of structural features of the '<em>Confgroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONFGROUP_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.CopyrightTypeImpl <em>Copyright Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.CopyrightTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getCopyrightType()
	 * @generated
	 */
	int COPYRIGHT_TYPE = 11;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Year</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE__YEAR = 1;

	/**
	 * The feature id for the '<em><b>Holder</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE__HOLDER = 2;

	/**
	 * The number of structural features of the '<em>Copyright Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COPYRIGHT_TYPE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Date Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ABSTRACT = 3;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__AUTHOR = 5;

	/**
	 * The feature id for the '<em><b>Bibliomisc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BIBLIOMISC = 6;

	/**
	 * The feature id for the '<em><b>Book</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__BOOK = 7;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INFO = 8;

	/**
	 * The feature id for the '<em><b>Caution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CAUTION = 9;

	/**
	 * The feature id for the '<em><b>Chapter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CHAPTER = 10;

	/**
	 * The feature id for the '<em><b>Colspec</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__COLSPEC = 11;

	/**
	 * The feature id for the '<em><b>Confgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFGROUP = 12;

	/**
	 * The feature id for the '<em><b>Confnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFNUM = 13;

	/**
	 * The feature id for the '<em><b>Confsponsor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFSPONSOR = 14;

	/**
	 * The feature id for the '<em><b>Conftitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__CONFTITLE = 15;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__DATE = 16;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__EMPHASIS = 17;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ENTRY = 18;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIGURE = 19;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FIRSTNAME = 20;

	/**
	 * The feature id for the '<em><b>Footnote</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__FOOTNOTE = 21;

	/**
	 * The feature id for the '<em><b>Imagedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGEDATA = 22;

	/**
	 * The feature id for the '<em><b>Imageobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMAGEOBJECT = 23;

	/**
	 * The feature id for the '<em><b>Important</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__IMPORTANT = 24;

	/**
	 * The feature id for the '<em><b>Informaltable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__INFORMALTABLE = 25;

	/**
	 * The feature id for the '<em><b>Itemizedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ITEMIZEDLIST = 26;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORD = 27;

	/**
	 * The feature id for the '<em><b>Keywordset</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__KEYWORDSET = 28;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LINK = 29;

	/**
	 * The feature id for the '<em><b>Listitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LISTITEM = 30;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__LITERAL = 31;

	/**
	 * The feature id for the '<em><b>Mediaobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MEDIAOBJECT = 32;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__NOTE = 33;

	/**
	 * The feature id for the '<em><b>Orderedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ORDEREDLIST = 34;

	/**
	 * The feature id for the '<em><b>Otheraddr</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__OTHERADDR = 35;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PARA = 36;

	/**
	 * The feature id for the '<em><b>Phrase</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PHRASE = 37;

	/**
	 * The feature id for the '<em><b>Preface</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PREFACE = 38;

	/**
	 * The feature id for the '<em><b>Programlisting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PROGRAMLISTING = 39;

	/**
	 * The feature id for the '<em><b>Pubdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBDATE = 40;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHER = 41;

	/**
	 * The feature id for the '<em><b>Publishername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__PUBLISHERNAME = 42;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ROW = 43;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SECTION = 44;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__STATE = 45;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUBTITLE = 46;

	/**
	 * The feature id for the '<em><b>Superscript</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__SUPERSCRIPT = 47;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TABLE = 48;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TBODY = 49;

	/**
	 * The feature id for the '<em><b>Tgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TGROUP = 50;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__THEAD = 51;

	/**
	 * The feature id for the '<em><b>Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TIP = 52;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TITLE = 53;

	/**
	 * The feature id for the '<em><b>Ulink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__ULINK = 54;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__WARNING = 55;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 56;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_TYPE__EMPHASIS = 1;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_TYPE__ROLE = 2;

	/**
	 * The number of structural features of the '<em>Emphasis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPHASIS_TYPE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Programlisting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__PROGRAMLISTING = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__MIXED = 1;

	/**
	 * The feature id for the '<em><b>Mediaobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__MEDIAOBJECT = 2;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__PARA = 3;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__ALIGN = 4;

	/**
	 * The feature id for the '<em><b>Morerows</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__MOREROWS = 5;

	/**
	 * The feature id for the '<em><b>Nameend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__NAMEEND = 6;

	/**
	 * The feature id for the '<em><b>Namest</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__NAMEST = 7;

	/**
	 * The feature id for the '<em><b>Valign</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE__VALIGN = 8;

	/**
	 * The number of structural features of the '<em>Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTRY_TYPE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.EnvarTypeImpl <em>Envar Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.EnvarTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getEnvarType()
	 * @generated
	 */
	int ENVAR_TYPE = 16;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVAR_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Replaceable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVAR_TYPE__REPLACEABLE = 1;

	/**
	 * The number of structural features of the '<em>Envar Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENVAR_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TYPE__ID = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Programlisting</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TYPE__PROGRAMLISTING = 2;

	/**
	 * The number of structural features of the '<em>Example Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EXAMPLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Mediaobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_TYPE__MEDIAOBJECT = 1;

	/**
	 * The feature id for the '<em><b>Float</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_TYPE__FLOAT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_TYPE__ID = 3;

	/**
	 * The number of structural features of the '<em>Figure Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIGURE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.FileNameTypeImpl <em>File Name Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.FileNameTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFileNameType()
	 * @generated
	 */
	int FILE_NAME_TYPE = 19;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Replaceable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_TYPE__REPLACEABLE = 1;

	/**
	 * The number of structural features of the '<em>File Name Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_NAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRSTNAME_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Firstname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIRSTNAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_TYPE__PARA = 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_TYPE__ID = 1;

	/**
	 * The number of structural features of the '<em>Footnote Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOOTNOTE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Function</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF_TYPE__FUNCTION = 1;

	/**
	 * The number of structural features of the '<em>Funcdef Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCDEF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Funcdef</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCPROTOTYPE_TYPE__FUNCDEF = 0;

	/**
	 * The feature id for the '<em><b>Paramdef</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCPROTOTYPE_TYPE__PARAMDEF = 1;

	/**
	 * The number of structural features of the '<em>Funcprototype Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCPROTOTYPE_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Funcprototype</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE = 0;

	/**
	 * The number of structural features of the '<em>Funcsynopsis Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCSYNOPSIS_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Function Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Depth</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEDATA_TYPE__DEPTH = 0;

	/**
	 * The feature id for the '<em><b>Fileref</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEDATA_TYPE__FILEREF = 1;

	/**
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEDATA_TYPE__WIDTH = 2;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEDATA_TYPE__ALIGN = 3;

	/**
	 * The feature id for the '<em><b>Scale</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEDATA_TYPE__SCALE = 4;

	/**
	 * The number of structural features of the '<em>Imagedata Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEDATA_TYPE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Imagedata</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEOBJECT_TYPE__IMAGEDATA = 0;

	/**
	 * The number of structural features of the '<em>Imageobject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMAGEOBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_TYPE__EMPHASIS = 2;

	/**
	 * The feature id for the '<em><b>Ulink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_TYPE__ULINK = 3;

	/**
	 * The number of structural features of the '<em>Important Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTANT_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Tgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMALTABLE_TYPE__TGROUP = 0;

	/**
	 * The number of structural features of the '<em>Informaltable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFORMALTABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Pubdate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__PUBDATE = 0;

	/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__AUTHOR = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__TITLE = 2;

	/**
	 * The feature id for the '<em><b>Subtitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__SUBTITLE = 3;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__GROUP = 4;

	/**
	 * The feature id for the '<em><b>Bibliomisc</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__BIBLIOMISC = 5;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__DATE = 6;

	/**
	 * The feature id for the '<em><b>Keywordset</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__KEYWORDSET = 7;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__ABSTRACT = 8;

	/**
	 * The feature id for the '<em><b>Publisher</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__PUBLISHER = 9;

	/**
	 * The feature id for the '<em><b>Confgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__CONFGROUP = 10;

	/**
	 * The feature id for the '<em><b>Revhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__REVHISTORY = 11;

	/**
	 * The feature id for the '<em><b>Copyright</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__COPYRIGHT = 12;

	/**
	 * The feature id for the '<em><b>Legalnotice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__LEGALNOTICE = 13;

	/**
	 * The feature id for the '<em><b>Productname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__PRODUCTNAME = 14;

	/**
	 * The feature id for the '<em><b>Releaseinfo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE__RELEASEINFO = 15;

	/**
	 * The number of structural features of the '<em>Info Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INFO_TYPE_FEATURE_COUNT = 16;

	/**
	 * The feature id for the '<em><b>Listitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMIZEDLIST_TYPE__LISTITEM = 0;

	/**
	 * The number of structural features of the '<em>Itemizedlist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ITEMIZEDLIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Keyword</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDSET_TYPE__KEYWORD = 0;

	/**
	 * The number of structural features of the '<em>Keywordset Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KEYWORDSET_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.LegalNoticeTypeImpl <em>Legal Notice Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.LegalNoticeTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getLegalNoticeType()
	 * @generated
	 */
	int LEGAL_NOTICE_TYPE = 33;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_NOTICE_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_NOTICE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Revhistory</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_NOTICE_TYPE__REVHISTORY = 2;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_NOTICE_TYPE__PARA = 3;

	/**
	 * The feature id for the '<em><b>Orderedlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_NOTICE_TYPE__ORDEREDLIST = 4;

	/**
	 * The number of structural features of the '<em>Legal Notice Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEGAL_NOTICE_TYPE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__VALUE = 1;

	/**
	 * The feature id for the '<em><b>Linkend</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE__LINKEND = 2;

	/**
	 * The number of structural features of the '<em>Link Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_TYPE_FEATURE_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTITEM_TYPE__PARA = 0;

	/**
	 * The feature id for the '<em><b>Itemizedlist</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTITEM_TYPE__ITEMIZEDLIST = 1;

	/**
	 * The number of structural features of the '<em>Listitem Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LISTITEM_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE__VALUE = 0;

	/**
	 * The feature id for the '<em><b>Moreinfo</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE__MOREINFO = 1;

	/**
	 * The number of structural features of the '<em>Literal Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LITERAL_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Imageobject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAOBJECT_TYPE__IMAGEOBJECT = 0;

	/**
	 * The number of structural features of the '<em>Mediaobject Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIAOBJECT_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__LITERAL = 2;

	/**
	 * The feature id for the '<em><b>Ulink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE__ULINK = 3;

	/**
	 * The number of structural features of the '<em>Note Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NOTE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.OptionTypeImpl <em>Option Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.OptionTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getOptionType()
	 * @generated
	 */
	int OPTION_TYPE = 39;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Replaceable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE__REPLACEABLE = 1;

	/**
	 * The number of structural features of the '<em>Option Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Listitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEREDLIST_TYPE__LISTITEM = ITEMIZEDLIST_TYPE__LISTITEM;

	/**
	 * The feature id for the '<em><b>Continuation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEREDLIST_TYPE__CONTINUATION = ITEMIZEDLIST_TYPE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inheritnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEREDLIST_TYPE__INHERITNUM = ITEMIZEDLIST_TYPE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Orderedlist Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ORDEREDLIST_TYPE_FEATURE_COUNT = ITEMIZEDLIST_TYPE_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Ulink</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERADDR_TYPE__ULINK = 0;

	/**
	 * The number of structural features of the '<em>Otheraddr Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OTHERADDR_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Parameter Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMDEF_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMDEF_TYPE__PARAMETER = 1;

	/**
	 * The number of structural features of the '<em>Paramdef Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMDEF_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__EMPHASIS = 2;

	/**
	 * The feature id for the '<em><b>Literal</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__LITERAL = 3;

	/**
	 * The feature id for the '<em><b>Ulink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__ULINK = 4;

	/**
	 * The feature id for the '<em><b>Footnote</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__FOOTNOTE = 5;

	/**
	 * The feature id for the '<em><b>Link</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__LINK = 6;

	/**
	 * The feature id for the '<em><b>Role</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__ROLE = 7;

	/**
	 * The feature id for the '<em><b>Itemizedlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__ITEMIZEDLIST = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__ID = 9;

	/**
	 * The feature id for the '<em><b>Variablelist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE__VARIABLELIST = 10;

	/**
	 * The number of structural features of the '<em>Para Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARA_TYPE_FEATURE_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Firstname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNAME_TYPE__FIRSTNAME = 0;

	/**
	 * The feature id for the '<em><b>Surname</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNAME_TYPE__SURNAME = 1;

	/**
	 * The number of structural features of the '<em>Personname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSONNAME_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_TYPE__ID = 0;

	/**
	 * The number of structural features of the '<em>Phrase Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHRASE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE_TYPE__PARA = 1;

	/**
	 * The feature id for the '<em><b>Important</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE_TYPE__IMPORTANT = 2;

	/**
	 * The feature id for the '<em><b>Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE_TYPE__TIP = 3;

	/**
	 * The number of structural features of the '<em>Preface Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PREFACE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__EMPHASIS = 2;

	/**
	 * The feature id for the '<em><b>Phrase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__PHRASE = 3;

	/**
	 * The feature id for the '<em><b>Superscript</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__SUPERSCRIPT = 4;

	/**
	 * The feature id for the '<em><b>Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__FORMAT = 5;

	/**
	 * The feature id for the '<em><b>Language</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__LANGUAGE = 6;

	/**
	 * The feature id for the '<em><b>Linenumbering</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE__LINENUMBERING = 7;

	/**
	 * The number of structural features of the '<em>Programlisting Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROGRAMLISTING_TYPE_FEATURE_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Publishername</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_TYPE__PUBLISHERNAME = 0;

	/**
	 * The feature id for the '<em><b>Address</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_TYPE__ADDRESS = 1;

	/**
	 * The number of structural features of the '<em>Publisher Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PUBLISHER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RefEntryTypeImpl <em>Ref Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RefEntryTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefEntryType()
	 * @generated
	 */
	int REF_ENTRY_TYPE = 50;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TYPE__INFO = 0;

	/**
	 * The feature id for the '<em><b>Refmeta</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TYPE__REFMETA = 1;

	/**
	 * The feature id for the '<em><b>Refnamediv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TYPE__REFNAMEDIV = 2;

	/**
	 * The feature id for the '<em><b>Refsynopsisdiv</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TYPE__REFSYNOPSISDIV = 3;

	/**
	 * The feature id for the '<em><b>Refsect1</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TYPE__REFSECT1 = 4;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TYPE__VERSION = 5;

	/**
	 * The number of structural features of the '<em>Ref Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RefEntryTitleTypeImpl <em>Ref Entry Title Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RefEntryTitleTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefEntryTitleType()
	 * @generated
	 */
	int REF_ENTRY_TITLE_TYPE = 51;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TITLE_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Ref Entry Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_ENTRY_TITLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ReferenceTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getReferenceType()
	 * @generated
	 */
	int REFERENCE_TYPE = 52;

	/**
	 * The feature id for the '<em><b>Info</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__INFO = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__VERSION = 2;

	/**
	 * The feature id for the '<em><b>Refentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE__REFENTRY = 3;

	/**
	 * The number of structural features of the '<em>Reference Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RefMetaTypeImpl <em>Ref Meta Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RefMetaTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefMetaType()
	 * @generated
	 */
	int REF_META_TYPE = 53;

	/**
	 * The feature id for the '<em><b>Refentrytitle</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_META_TYPE__REFENTRYTITLE = 0;

	/**
	 * The feature id for the '<em><b>Manvolnum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_META_TYPE__MANVOLNUM = 1;

	/**
	 * The number of structural features of the '<em>Ref Meta Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_META_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RefNameDivTypeImpl <em>Ref Name Div Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RefNameDivTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefNameDivType()
	 * @generated
	 */
	int REF_NAME_DIV_TYPE = 54;

	/**
	 * The feature id for the '<em><b>Refname</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_NAME_DIV_TYPE__REFNAME = 0;

	/**
	 * The feature id for the '<em><b>Refpurpose</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_NAME_DIV_TYPE__REFPURPOSE = 1;

	/**
	 * The feature id for the '<em><b>Refclass</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_NAME_DIV_TYPE__REFCLASS = 2;

	/**
	 * The number of structural features of the '<em>Ref Name Div Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_NAME_DIV_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RefSect1TypeImpl <em>Ref Sect1 Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RefSect1TypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefSect1Type()
	 * @generated
	 */
	int REF_SECT1_TYPE = 55;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SECT1_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SECT1_TYPE__TITLE = 1;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SECT1_TYPE__PARA = 2;

	/**
	 * The feature id for the '<em><b>Variablelist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SECT1_TYPE__VARIABLELIST = 3;

	/**
	 * The feature id for the '<em><b>Segmentedlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SECT1_TYPE__SEGMENTEDLIST = 4;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SECT1_TYPE__ID = 5;

	/**
	 * The number of structural features of the '<em>Ref Sect1 Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SECT1_TYPE_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.RefSynopsisDivTypeImpl <em>Ref Synopsis Div Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.RefSynopsisDivTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefSynopsisDivType()
	 * @generated
	 */
	int REF_SYNOPSIS_DIV_TYPE = 56;

	/**
	 * The feature id for the '<em><b>Cmdsynopsis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS = 0;

	/**
	 * The feature id for the '<em><b>Funcsynopsis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS = 1;

	/**
	 * The number of structural features of the '<em>Ref Synopsis Div Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REF_SYNOPSIS_DIV_TYPE_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.ReplaceableTypeImpl <em>Replaceable Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.ReplaceableTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getReplaceableType()
	 * @generated
	 */
	int REPLACEABLE_TYPE = 57;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEABLE_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Replaceable Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REPLACEABLE_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVDESCRIPTION_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVDESCRIPTION_TYPE__PARA = 1;

	/**
	 * The number of structural features of the '<em>Revdescription Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVDESCRIPTION_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Revision</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVHISTORY_TYPE__REVISION = 0;

	/**
	 * The number of structural features of the '<em>Revhistory Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVHISTORY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Revnumber</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_TYPE__REVNUMBER = 0;

	/**
	 * The feature id for the '<em><b>Date</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_TYPE__DATE = 1;

	/**
	 * The feature id for the '<em><b>Authorinitials</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_TYPE__AUTHORINITIALS = 2;

	/**
	 * The feature id for the '<em><b>Revdescription</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_TYPE__REVDESCRIPTION = 3;

	/**
	 * The number of structural features of the '<em>Revision Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVISION_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVNUMBER_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Ulink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVNUMBER_TYPE__ULINK = 1;

	/**
	 * The number of structural features of the '<em>Revnumber Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REVNUMBER_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_TYPE__ENTRY = 0;

	/**
	 * The number of structural features of the '<em>Row Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROW_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Itemizedlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__ITEMIZEDLIST = 1;

	/**
	 * The feature id for the '<em><b>Mediaobject</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__MEDIAOBJECT = 2;

	/**
	 * The feature id for the '<em><b>Note</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__NOTE = 3;

	/**
	 * The feature id for the '<em><b>Para</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__PARA = 4;

	/**
	 * The feature id for the '<em><b>Programlisting</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__PROGRAMLISTING = 5;

	/**
	 * The feature id for the '<em><b>Section</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__SECTION = 6;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__TITLE = 7;

	/**
	 * The feature id for the '<em><b>Figure</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__FIGURE = 8;

	/**
	 * The feature id for the '<em><b>Informaltable</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__INFORMALTABLE = 9;

	/**
	 * The feature id for the '<em><b>Orderedlist</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__ORDEREDLIST = 10;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__TABLE = 11;

	/**
	 * The feature id for the '<em><b>Warning</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__WARNING = 12;

	/**
	 * The feature id for the '<em><b>Tip</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__TIP = 13;

	/**
	 * The feature id for the '<em><b>Funcsynopsis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__FUNCSYNOPSIS = 14;

	/**
	 * The feature id for the '<em><b>Caution</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__CAUTION = 15;

	/**
	 * The feature id for the '<em><b>Example</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__EXAMPLE = 16;

	/**
	 * The feature id for the '<em><b>Cmdsynopsis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__CMDSYNOPSIS = 17;

	/**
	 * The feature id for the '<em><b>Annotations</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE__ANNOTATIONS = 18;

	/**
	 * The number of structural features of the '<em>Section Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SECTION_TYPE_FEATURE_COUNT = 19;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.SegListItemTypeImpl <em>Seg List Item Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.SegListItemTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSegListItemType()
	 * @generated
	 */
	int SEG_LIST_ITEM_TYPE = 64;

	/**
	 * The feature id for the '<em><b>Seg</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEG_LIST_ITEM_TYPE__SEG = 0;

	/**
	 * The number of structural features of the '<em>Seg List Item Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEG_LIST_ITEM_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.SegmentedListTypeImpl <em>Segmented List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.SegmentedListTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSegmentedListType()
	 * @generated
	 */
	int SEGMENTED_LIST_TYPE = 65;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTED_LIST_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Segtitle</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTED_LIST_TYPE__SEGTITLE = 1;

	/**
	 * The feature id for the '<em><b>Seglistitem</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTED_LIST_TYPE__SEGLISTITEM = 2;

	/**
	 * The number of structural features of the '<em>Segmented List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEGMENTED_LIST_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.SegTypeImpl <em>Seg Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.SegTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSegType()
	 * @generated
	 */
	int SEG_TYPE = 66;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEG_TYPE__GROUP = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEG_TYPE__MIXED = 1;

	/**
	 * The feature id for the '<em><b>Errorcode</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEG_TYPE__ERRORCODE = 2;

	/**
	 * The feature id for the '<em><b>Errortext</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEG_TYPE__ERRORTEXT = 3;

	/**
	 * The number of structural features of the '<em>Seg Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SEG_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__EMPHASIS = 2;

	/**
	 * The feature id for the '<em><b>Phrase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE__PHRASE = 3;

	/**
	 * The number of structural features of the '<em>Subtitle Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBTITLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURNAME_TYPE__MIXED = 0;

	/**
	 * The number of structural features of the '<em>Surname Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SURNAME_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TITLE = 0;

	/**
	 * The feature id for the '<em><b>Tgroup</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__TGROUP = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE__ID = 2;

	/**
	 * The number of structural features of the '<em>Table Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_TYPE_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.TermTypeImpl <em>Term Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.TermTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTermType()
	 * @generated
	 */
	int TERM_TYPE = 70;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__EMPHASIS = 1;

	/**
	 * The feature id for the '<em><b>Option</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__OPTION = 2;

	/**
	 * The feature id for the '<em><b>Filename</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__FILENAME = 3;

	/**
	 * The feature id for the '<em><b>Envar</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE__ENVAR = 4;

	/**
	 * The number of structural features of the '<em>Term Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TERM_TYPE_FEATURE_COUNT = 5;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE__ROW = 0;

	/**
	 * The number of structural features of the '<em>Tbody Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TBODY_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Colspec</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__COLSPEC = 0;

	/**
	 * The feature id for the '<em><b>Thead</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__THEAD = 1;

	/**
	 * The feature id for the '<em><b>Tbody</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__TBODY = 2;

	/**
	 * The feature id for the '<em><b>Cols</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__COLS = 3;

	/**
	 * The feature id for the '<em><b>Colseq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__COLSEQ = 4;

	/**
	 * The feature id for the '<em><b>Rowseq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__ROWSEQ = 5;

	/**
	 * The feature id for the '<em><b>Align</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE__ALIGN = 6;

	/**
	 * The number of structural features of the '<em>Tgroup Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TGROUP_TYPE_FEATURE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Row</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE__ROW = 0;

	/**
	 * The number of structural features of the '<em>Thead Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int THEAD_TYPE_FEATURE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Ulink</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP_TYPE__ULINK = 1;

	/**
	 * The number of structural features of the '<em>Tip Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIP_TYPE_FEATURE_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Group</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__GROUP = 1;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__EMPHASIS = 2;

	/**
	 * The feature id for the '<em><b>Phrase</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE__PHRASE = 3;

	/**
	 * The number of structural features of the '<em>Title Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TITLE_TYPE_FEATURE_COUNT = 4;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULINK_TYPE__MIXED = 0;

	/**
	 * The feature id for the '<em><b>Emphasis</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULINK_TYPE__EMPHASIS = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULINK_TYPE__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Url</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULINK_TYPE__URL = 3;

	/**
	 * The number of structural features of the '<em>Ulink Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ULINK_TYPE_FEATURE_COUNT = 4;


	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.VariableListTypeImpl <em>Variable List Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.VariableListTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getVariableListType()
	 * @generated
	 */
	int VARIABLE_LIST_TYPE = 77;

	/**
	 * The feature id for the '<em><b>Varlistentry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST_TYPE__VARLISTENTRY = 0;

	/**
	 * The number of structural features of the '<em>Variable List Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VARIABLE_LIST_TYPE_FEATURE_COUNT = 1;

	/**
	 * The meta object id for the '{@link org.kermeta.Docbook.impl.VarListEntryTypeImpl <em>Var List Entry Type</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.kermeta.Docbook.impl.VarListEntryTypeImpl
	 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getVarListEntryType()
	 * @generated
	 */
	int VAR_LIST_ENTRY_TYPE = 78;

	/**
	 * The feature id for the '<em><b>Spacing</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ENTRY_TYPE__SPACING = 0;

	/**
	 * The feature id for the '<em><b>Termlength</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ENTRY_TYPE__TERMLENGTH = 1;

	/**
	 * The feature id for the '<em><b>Term</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ENTRY_TYPE__TERM = 2;

	/**
	 * The feature id for the '<em><b>Listitem</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ENTRY_TYPE__LISTITEM = 3;

	/**
	 * The number of structural features of the '<em>Var List Entry Type</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VAR_LIST_ENTRY_TYPE_FEATURE_COUNT = 4;


	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.AbstractType <em>Abstract Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Abstract Type</em>'.
	 * @see org.kermeta.Docbook.AbstractType
	 * @generated
	 */
	EClass getAbstractType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.AbstractType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Para</em>'.
	 * @see org.kermeta.Docbook.AbstractType#getPara()
	 * @see #getAbstractType()
	 * @generated
	 */
	EReference getAbstractType_Para();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.AddressType <em>Address Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Address Type</em>'.
	 * @see org.kermeta.Docbook.AddressType
	 * @generated
	 */
	EClass getAddressType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.AddressType#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.kermeta.Docbook.AddressType#getState()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_State();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.AddressType#getOtheraddr <em>Otheraddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otheraddr</em>'.
	 * @see org.kermeta.Docbook.AddressType#getOtheraddr()
	 * @see #getAddressType()
	 * @generated
	 */
	EReference getAddressType_Otheraddr();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.AddressType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.kermeta.Docbook.AddressType#getFormat()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.AddressType#getEmail <em>Email</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Email</em>'.
	 * @see org.kermeta.Docbook.AddressType#getEmail()
	 * @see #getAddressType()
	 * @generated
	 */
	EAttribute getAddressType_Email();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.AuthorinitialsType <em>Authorinitials Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Authorinitials Type</em>'.
	 * @see org.kermeta.Docbook.AuthorinitialsType
	 * @generated
	 */
	EClass getAuthorinitialsType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.AuthorinitialsType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.AuthorinitialsType#getMixed()
	 * @see #getAuthorinitialsType()
	 * @generated
	 */
	EAttribute getAuthorinitialsType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.AuthorType <em>Author Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Author Type</em>'.
	 * @see org.kermeta.Docbook.AuthorType
	 * @generated
	 */
	EClass getAuthorType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.AuthorType#getPersonname <em>Personname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Personname</em>'.
	 * @see org.kermeta.Docbook.AuthorType#getPersonname()
	 * @see #getAuthorType()
	 * @generated
	 */
	EReference getAuthorType_Personname();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.AuthorType#getContrib <em>Contrib</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Contrib</em>'.
	 * @see org.kermeta.Docbook.AuthorType#getContrib()
	 * @see #getAuthorType()
	 * @generated
	 */
	EAttribute getAuthorType_Contrib();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.AuthorType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.kermeta.Docbook.AuthorType#getAddress()
	 * @see #getAuthorType()
	 * @generated
	 */
	EReference getAuthorType_Address();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.BookType <em>Book Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Book Type</em>'.
	 * @see org.kermeta.Docbook.BookType
	 * @generated
	 */
	EClass getBookType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.BookType#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.kermeta.Docbook.BookType#getInfo()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_Info();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.BookType#getPreface <em>Preface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preface</em>'.
	 * @see org.kermeta.Docbook.BookType#getPreface()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_Preface();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.BookType#getChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chapter</em>'.
	 * @see org.kermeta.Docbook.BookType#getChapter()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_Chapter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.BookType#getReference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reference</em>'.
	 * @see org.kermeta.Docbook.BookType#getReference()
	 * @see #getBookType()
	 * @generated
	 */
	EReference getBookType_Reference();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.BookType#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see org.kermeta.Docbook.BookType#getLang()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Lang();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.BookType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.kermeta.Docbook.BookType#getVersion()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.BookType#getLabel <em>Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Label</em>'.
	 * @see org.kermeta.Docbook.BookType#getLabel()
	 * @see #getBookType()
	 * @generated
	 */
	EAttribute getBookType_Label();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ChapterType <em>Chapter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chapter Type</em>'.
	 * @see org.kermeta.Docbook.ChapterType
	 * @generated
	 */
	EClass getChapterType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ChapterType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.ChapterType#getTitle()
	 * @see #getChapterType()
	 * @generated
	 */
	EReference getChapterType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ChapterType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.ChapterType#getPara()
	 * @see #getChapterType()
	 * @generated
	 */
	EReference getChapterType_Para();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ChapterType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see org.kermeta.Docbook.ChapterType#getNote()
	 * @see #getChapterType()
	 * @generated
	 */
	EReference getChapterType_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ChapterType#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see org.kermeta.Docbook.ChapterType#getSection()
	 * @see #getChapterType()
	 * @generated
	 */
	EReference getChapterType_Section();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ChapterType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotations</em>'.
	 * @see org.kermeta.Docbook.ChapterType#getAnnotations()
	 * @see #getChapterType()
	 * @generated
	 */
	EAttribute getChapterType_Annotations();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ColspecType <em>Colspec Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Colspec Type</em>'.
	 * @see org.kermeta.Docbook.ColspecType
	 * @generated
	 */
	EClass getColspecType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ColspecType#getColname <em>Colname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colname</em>'.
	 * @see org.kermeta.Docbook.ColspecType#getColname()
	 * @see #getColspecType()
	 * @generated
	 */
	EAttribute getColspecType_Colname();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ColspecType#getColwidth <em>Colwidth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colwidth</em>'.
	 * @see org.kermeta.Docbook.ColspecType#getColwidth()
	 * @see #getColspecType()
	 * @generated
	 */
	EAttribute getColspecType_Colwidth();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ConfgroupType <em>Confgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Confgroup Type</em>'.
	 * @see org.kermeta.Docbook.ConfgroupType
	 * @generated
	 */
	EClass getConfgroupType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ConfgroupType#getConftitle <em>Conftitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conftitle</em>'.
	 * @see org.kermeta.Docbook.ConfgroupType#getConftitle()
	 * @see #getConfgroupType()
	 * @generated
	 */
	EAttribute getConfgroupType_Conftitle();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ConfgroupType#getConfnum <em>Confnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confnum</em>'.
	 * @see org.kermeta.Docbook.ConfgroupType#getConfnum()
	 * @see #getConfgroupType()
	 * @generated
	 */
	EAttribute getConfgroupType_Confnum();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ConfgroupType#getConfsponsor <em>Confsponsor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confsponsor</em>'.
	 * @see org.kermeta.Docbook.ConfgroupType#getConfsponsor()
	 * @see #getConfgroupType()
	 * @generated
	 */
	EAttribute getConfgroupType_Confsponsor();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.CopyrightType <em>Copyright Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Copyright Type</em>'.
	 * @see org.kermeta.Docbook.CopyrightType
	 * @generated
	 */
	EClass getCopyrightType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.CopyrightType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.CopyrightType#getGroup()
	 * @see #getCopyrightType()
	 * @generated
	 */
	EAttribute getCopyrightType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.CopyrightType#getYear <em>Year</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Year</em>'.
	 * @see org.kermeta.Docbook.CopyrightType#getYear()
	 * @see #getCopyrightType()
	 * @generated
	 */
	EAttribute getCopyrightType_Year();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.CopyrightType#getHolder <em>Holder</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Holder</em>'.
	 * @see org.kermeta.Docbook.CopyrightType#getHolder()
	 * @see #getCopyrightType()
	 * @generated
	 */
	EAttribute getCopyrightType_Holder();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.DateType <em>Date Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Date Type</em>'.
	 * @see org.kermeta.Docbook.DateType
	 * @generated
	 */
	EClass getDateType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.DateType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.DateType#getMixed()
	 * @see #getDateType()
	 * @generated
	 */
	EAttribute getDateType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.kermeta.Docbook.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.kermeta.Docbook.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getAbstract()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getAddress()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Address();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Author</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getAuthor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Author();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getBibliomisc <em>Bibliomisc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Bibliomisc</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getBibliomisc()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Bibliomisc();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getBook <em>Book</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Book</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getBook()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Book();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getInfo()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Info();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getCaution <em>Caution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caution</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getCaution()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Caution();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getChapter <em>Chapter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Chapter</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getChapter()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Chapter();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getColspec <em>Colspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Colspec</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getColspec()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Colspec();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getConfgroup <em>Confgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confgroup</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getConfgroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Confgroup();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getConfnum <em>Confnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confnum</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getConfnum()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Confnum();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getConfsponsor <em>Confsponsor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Confsponsor</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getConfsponsor()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Confsponsor();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getConftitle <em>Conftitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Conftitle</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getConftitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Conftitle();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getDate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Date();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getEmphasis()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Emphasis();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Entry</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getEntry()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Entry();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Figure</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getFigure()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Figure();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Firstname</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getFirstname()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Firstname();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getFootnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Footnote</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getFootnote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Footnote();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getImagedata <em>Imagedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imagedata</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getImagedata()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Imagedata();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getImageobject <em>Imageobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imageobject</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getImageobject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Imageobject();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getImportant <em>Important</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Important</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getImportant()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Important();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getInformaltable <em>Informaltable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Informaltable</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getInformaltable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Informaltable();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getItemizedlist <em>Itemizedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Itemizedlist</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getItemizedlist()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Itemizedlist();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Keyword</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getKeyword()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Keyword();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getKeywordset <em>Keywordset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Keywordset</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getKeywordset()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Keywordset();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Link</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getLink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Link();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getListitem <em>Listitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listitem</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getListitem()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Listitem();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Literal</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getLiteral()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Literal();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getMediaobject <em>Mediaobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mediaobject</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getMediaobject()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Mediaobject();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Note</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getNote()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Note();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getOrderedlist <em>Orderedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Orderedlist</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getOrderedlist()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Orderedlist();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getOtheraddr <em>Otheraddr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Otheraddr</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getOtheraddr()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Otheraddr();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Para</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getPara()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Para();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getPhrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Phrase</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getPhrase()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Phrase();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getPreface <em>Preface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Preface</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getPreface()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Preface();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getProgramlisting <em>Programlisting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programlisting</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getProgramlisting()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Programlisting();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getPubdate <em>Pubdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pubdate</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getPubdate()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Pubdate();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getPublisher()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Publisher();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getPublishername <em>Publishername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publishername</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getPublishername()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Publishername();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Row</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getRow()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Row();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Section</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getSection()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Section();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getState()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_State();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Subtitle</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getSubtitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Subtitle();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getSuperscript <em>Superscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Superscript</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getSuperscript()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Superscript();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Table</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getTable()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Table();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tbody</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getTbody()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tbody();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getTgroup <em>Tgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tgroup</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getTgroup()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getThead()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getTip <em>Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tip</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getTip()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Tip();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getTitle()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.DocumentRoot#getUlink <em>Ulink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ulink</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getUlink()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Ulink();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.DocumentRoot#getWarning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Warning</em>'.
	 * @see org.kermeta.Docbook.DocumentRoot#getWarning()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Warning();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.EmphasisType <em>Emphasis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Emphasis Type</em>'.
	 * @see org.kermeta.Docbook.EmphasisType
	 * @generated
	 */
	EClass getEmphasisType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.EmphasisType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.EmphasisType#getMixed()
	 * @see #getEmphasisType()
	 * @generated
	 */
	EAttribute getEmphasisType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.EmphasisType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.EmphasisType#getEmphasis()
	 * @see #getEmphasisType()
	 * @generated
	 */
	EReference getEmphasisType_Emphasis();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.EmphasisType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.kermeta.Docbook.EmphasisType#getRole()
	 * @see #getEmphasisType()
	 * @generated
	 */
	EAttribute getEmphasisType_Role();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.EntryType <em>Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entry Type</em>'.
	 * @see org.kermeta.Docbook.EntryType
	 * @generated
	 */
	EClass getEntryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.EntryType#getProgramlisting <em>Programlisting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programlisting</em>'.
	 * @see org.kermeta.Docbook.EntryType#getProgramlisting()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Programlisting();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.EntryType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.EntryType#getMixed()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Mixed();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.EntryType#getMediaobject <em>Mediaobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mediaobject</em>'.
	 * @see org.kermeta.Docbook.EntryType#getMediaobject()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Mediaobject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.EntryType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.EntryType#getPara()
	 * @see #getEntryType()
	 * @generated
	 */
	EReference getEntryType_Para();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.EntryType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.kermeta.Docbook.EntryType#getAlign()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.EntryType#getMorerows <em>Morerows</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Morerows</em>'.
	 * @see org.kermeta.Docbook.EntryType#getMorerows()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Morerows();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.EntryType#getNameend <em>Nameend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nameend</em>'.
	 * @see org.kermeta.Docbook.EntryType#getNameend()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Nameend();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.EntryType#getNamest <em>Namest</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Namest</em>'.
	 * @see org.kermeta.Docbook.EntryType#getNamest()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Namest();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.EntryType#getValign <em>Valign</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Valign</em>'.
	 * @see org.kermeta.Docbook.EntryType#getValign()
	 * @see #getEntryType()
	 * @generated
	 */
	EAttribute getEntryType_Valign();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.EnvarType <em>Envar Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Envar Type</em>'.
	 * @see org.kermeta.Docbook.EnvarType
	 * @generated
	 */
	EClass getEnvarType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.EnvarType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.EnvarType#getMixed()
	 * @see #getEnvarType()
	 * @generated
	 */
	EAttribute getEnvarType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.EnvarType#getReplaceable <em>Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replaceable</em>'.
	 * @see org.kermeta.Docbook.EnvarType#getReplaceable()
	 * @see #getEnvarType()
	 * @generated
	 */
	EReference getEnvarType_Replaceable();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FigureType <em>Figure Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Figure Type</em>'.
	 * @see org.kermeta.Docbook.FigureType
	 * @generated
	 */
	EClass getFigureType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.FigureType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.FigureType#getTitle()
	 * @see #getFigureType()
	 * @generated
	 */
	EReference getFigureType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.FigureType#getMediaobject <em>Mediaobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Mediaobject</em>'.
	 * @see org.kermeta.Docbook.FigureType#getMediaobject()
	 * @see #getFigureType()
	 * @generated
	 */
	EReference getFigureType_Mediaobject();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.FigureType#getFloat <em>Float</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Float</em>'.
	 * @see org.kermeta.Docbook.FigureType#getFloat()
	 * @see #getFigureType()
	 * @generated
	 */
	EAttribute getFigureType_Float();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.FigureType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.Docbook.FigureType#getId()
	 * @see #getFigureType()
	 * @generated
	 */
	EAttribute getFigureType_Id();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FileNameType <em>File Name Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File Name Type</em>'.
	 * @see org.kermeta.Docbook.FileNameType
	 * @generated
	 */
	EClass getFileNameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.FileNameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.FileNameType#getMixed()
	 * @see #getFileNameType()
	 * @generated
	 */
	EAttribute getFileNameType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.FileNameType#getReplaceable <em>Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replaceable</em>'.
	 * @see org.kermeta.Docbook.FileNameType#getReplaceable()
	 * @see #getFileNameType()
	 * @generated
	 */
	EReference getFileNameType_Replaceable();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FirstnameType <em>Firstname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Firstname Type</em>'.
	 * @see org.kermeta.Docbook.FirstnameType
	 * @generated
	 */
	EClass getFirstnameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.FirstnameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.FirstnameType#getMixed()
	 * @see #getFirstnameType()
	 * @generated
	 */
	EAttribute getFirstnameType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FootnoteType <em>Footnote Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Footnote Type</em>'.
	 * @see org.kermeta.Docbook.FootnoteType
	 * @generated
	 */
	EClass getFootnoteType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.FootnoteType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Para</em>'.
	 * @see org.kermeta.Docbook.FootnoteType#getPara()
	 * @see #getFootnoteType()
	 * @generated
	 */
	EReference getFootnoteType_Para();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.FootnoteType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.Docbook.FootnoteType#getId()
	 * @see #getFootnoteType()
	 * @generated
	 */
	EAttribute getFootnoteType_Id();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ImagedataType <em>Imagedata Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imagedata Type</em>'.
	 * @see org.kermeta.Docbook.ImagedataType
	 * @generated
	 */
	EClass getImagedataType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ImagedataType#getDepth <em>Depth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Depth</em>'.
	 * @see org.kermeta.Docbook.ImagedataType#getDepth()
	 * @see #getImagedataType()
	 * @generated
	 */
	EAttribute getImagedataType_Depth();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ImagedataType#getFileref <em>Fileref</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fileref</em>'.
	 * @see org.kermeta.Docbook.ImagedataType#getFileref()
	 * @see #getImagedataType()
	 * @generated
	 */
	EAttribute getImagedataType_Fileref();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ImagedataType#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see org.kermeta.Docbook.ImagedataType#getWidth()
	 * @see #getImagedataType()
	 * @generated
	 */
	EAttribute getImagedataType_Width();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ImagedataType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.kermeta.Docbook.ImagedataType#getAlign()
	 * @see #getImagedataType()
	 * @generated
	 */
	EAttribute getImagedataType_Align();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ImagedataType#getScale <em>Scale</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Scale</em>'.
	 * @see org.kermeta.Docbook.ImagedataType#getScale()
	 * @see #getImagedataType()
	 * @generated
	 */
	EAttribute getImagedataType_Scale();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ImageobjectType <em>Imageobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imageobject Type</em>'.
	 * @see org.kermeta.Docbook.ImageobjectType
	 * @generated
	 */
	EClass getImageobjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ImageobjectType#getImagedata <em>Imagedata</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imagedata</em>'.
	 * @see org.kermeta.Docbook.ImageobjectType#getImagedata()
	 * @see #getImageobjectType()
	 * @generated
	 */
	EReference getImageobjectType_Imagedata();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ImportantType <em>Important Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Important Type</em>'.
	 * @see org.kermeta.Docbook.ImportantType
	 * @generated
	 */
	EClass getImportantType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ImportantType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.ImportantType#getMixed()
	 * @see #getImportantType()
	 * @generated
	 */
	EAttribute getImportantType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ImportantType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.ImportantType#getGroup()
	 * @see #getImportantType()
	 * @generated
	 */
	EAttribute getImportantType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ImportantType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.ImportantType#getEmphasis()
	 * @see #getImportantType()
	 * @generated
	 */
	EReference getImportantType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ImportantType#getUlink <em>Ulink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ulink</em>'.
	 * @see org.kermeta.Docbook.ImportantType#getUlink()
	 * @see #getImportantType()
	 * @generated
	 */
	EReference getImportantType_Ulink();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.InformaltableType <em>Informaltable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Informaltable Type</em>'.
	 * @see org.kermeta.Docbook.InformaltableType
	 * @generated
	 */
	EClass getInformaltableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InformaltableType#getTgroup <em>Tgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tgroup</em>'.
	 * @see org.kermeta.Docbook.InformaltableType#getTgroup()
	 * @see #getInformaltableType()
	 * @generated
	 */
	EReference getInformaltableType_Tgroup();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.InfoType <em>Info Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Info Type</em>'.
	 * @see org.kermeta.Docbook.InfoType
	 * @generated
	 */
	EClass getInfoType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.InfoType#getPubdate <em>Pubdate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pubdate</em>'.
	 * @see org.kermeta.Docbook.InfoType#getPubdate()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Pubdate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.InfoType#getAuthor <em>Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Author</em>'.
	 * @see org.kermeta.Docbook.InfoType#getAuthor()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Author();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.InfoType#getTitle()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getSubtitle <em>Subtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Subtitle</em>'.
	 * @see org.kermeta.Docbook.InfoType#getSubtitle()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Subtitle();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.InfoType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.InfoType#getGroup()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.InfoType#getBibliomisc <em>Bibliomisc</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Bibliomisc</em>'.
	 * @see org.kermeta.Docbook.InfoType#getBibliomisc()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Bibliomisc();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.InfoType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Date</em>'.
	 * @see org.kermeta.Docbook.InfoType#getDate()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Date();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.InfoType#getKeywordset <em>Keywordset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Keywordset</em>'.
	 * @see org.kermeta.Docbook.InfoType#getKeywordset()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Keywordset();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getAbstract <em>Abstract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Abstract</em>'.
	 * @see org.kermeta.Docbook.InfoType#getAbstract()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Abstract();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getPublisher <em>Publisher</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Publisher</em>'.
	 * @see org.kermeta.Docbook.InfoType#getPublisher()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Publisher();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getConfgroup <em>Confgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Confgroup</em>'.
	 * @see org.kermeta.Docbook.InfoType#getConfgroup()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Confgroup();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getRevhistory <em>Revhistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revhistory</em>'.
	 * @see org.kermeta.Docbook.InfoType#getRevhistory()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Revhistory();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getCopyright <em>Copyright</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Copyright</em>'.
	 * @see org.kermeta.Docbook.InfoType#getCopyright()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Copyright();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.InfoType#getLegalnotice <em>Legalnotice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Legalnotice</em>'.
	 * @see org.kermeta.Docbook.InfoType#getLegalnotice()
	 * @see #getInfoType()
	 * @generated
	 */
	EReference getInfoType_Legalnotice();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.InfoType#getProductname <em>Productname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Productname</em>'.
	 * @see org.kermeta.Docbook.InfoType#getProductname()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Productname();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.InfoType#getReleaseinfo <em>Releaseinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Releaseinfo</em>'.
	 * @see org.kermeta.Docbook.InfoType#getReleaseinfo()
	 * @see #getInfoType()
	 * @generated
	 */
	EAttribute getInfoType_Releaseinfo();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ItemizedlistType <em>Itemizedlist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Itemizedlist Type</em>'.
	 * @see org.kermeta.Docbook.ItemizedlistType
	 * @generated
	 */
	EClass getItemizedlistType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ItemizedlistType#getListitem <em>Listitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Listitem</em>'.
	 * @see org.kermeta.Docbook.ItemizedlistType#getListitem()
	 * @see #getItemizedlistType()
	 * @generated
	 */
	EReference getItemizedlistType_Listitem();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.KeywordsetType <em>Keywordset Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Keywordset Type</em>'.
	 * @see org.kermeta.Docbook.KeywordsetType
	 * @generated
	 */
	EClass getKeywordsetType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.KeywordsetType#getKeyword <em>Keyword</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Keyword</em>'.
	 * @see org.kermeta.Docbook.KeywordsetType#getKeyword()
	 * @see #getKeywordsetType()
	 * @generated
	 */
	EAttribute getKeywordsetType_Keyword();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.LegalNoticeType <em>Legal Notice Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Legal Notice Type</em>'.
	 * @see org.kermeta.Docbook.LegalNoticeType
	 * @generated
	 */
	EClass getLegalNoticeType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.LegalNoticeType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.LegalNoticeType#getGroup()
	 * @see #getLegalNoticeType()
	 * @generated
	 */
	EAttribute getLegalNoticeType_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.LegalNoticeType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.LegalNoticeType#getTitle()
	 * @see #getLegalNoticeType()
	 * @generated
	 */
	EReference getLegalNoticeType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.LegalNoticeType#getRevhistory <em>Revhistory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revhistory</em>'.
	 * @see org.kermeta.Docbook.LegalNoticeType#getRevhistory()
	 * @see #getLegalNoticeType()
	 * @generated
	 */
	EReference getLegalNoticeType_Revhistory();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.LegalNoticeType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.LegalNoticeType#getPara()
	 * @see #getLegalNoticeType()
	 * @generated
	 */
	EReference getLegalNoticeType_Para();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.LegalNoticeType#getOrderedlist <em>Orderedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderedlist</em>'.
	 * @see org.kermeta.Docbook.LegalNoticeType#getOrderedlist()
	 * @see #getLegalNoticeType()
	 * @generated
	 */
	EReference getLegalNoticeType_Orderedlist();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.LinkType <em>Link Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link Type</em>'.
	 * @see org.kermeta.Docbook.LinkType
	 * @generated
	 */
	EClass getLinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.LinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.LinkType#getMixed()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Mixed();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.LinkType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.Docbook.LinkType#getValue()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.LinkType#getLinkend <em>Linkend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linkend</em>'.
	 * @see org.kermeta.Docbook.LinkType#getLinkend()
	 * @see #getLinkType()
	 * @generated
	 */
	EAttribute getLinkType_Linkend();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ListitemType <em>Listitem Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Listitem Type</em>'.
	 * @see org.kermeta.Docbook.ListitemType
	 * @generated
	 */
	EClass getListitemType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ListitemType#getItemizedlist <em>Itemizedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Itemizedlist</em>'.
	 * @see org.kermeta.Docbook.ListitemType#getItemizedlist()
	 * @see #getListitemType()
	 * @generated
	 */
	EReference getListitemType_Itemizedlist();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ListitemType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.ListitemType#getPara()
	 * @see #getListitemType()
	 * @generated
	 */
	EReference getListitemType_Para();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.LiteralType <em>Literal Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Literal Type</em>'.
	 * @see org.kermeta.Docbook.LiteralType
	 * @generated
	 */
	EClass getLiteralType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.LiteralType#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.kermeta.Docbook.LiteralType#getValue()
	 * @see #getLiteralType()
	 * @generated
	 */
	EAttribute getLiteralType_Value();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.LiteralType#getMoreinfo <em>Moreinfo</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Moreinfo</em>'.
	 * @see org.kermeta.Docbook.LiteralType#getMoreinfo()
	 * @see #getLiteralType()
	 * @generated
	 */
	EAttribute getLiteralType_Moreinfo();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.MediaobjectType <em>Mediaobject Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mediaobject Type</em>'.
	 * @see org.kermeta.Docbook.MediaobjectType
	 * @generated
	 */
	EClass getMediaobjectType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.MediaobjectType#getImageobject <em>Imageobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Imageobject</em>'.
	 * @see org.kermeta.Docbook.MediaobjectType#getImageobject()
	 * @see #getMediaobjectType()
	 * @generated
	 */
	EReference getMediaobjectType_Imageobject();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.NoteType <em>Note Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Note Type</em>'.
	 * @see org.kermeta.Docbook.NoteType
	 * @generated
	 */
	EClass getNoteType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.NoteType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.NoteType#getMixed()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.NoteType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.NoteType#getGroup()
	 * @see #getNoteType()
	 * @generated
	 */
	EAttribute getNoteType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.NoteType#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see org.kermeta.Docbook.NoteType#getLiteral()
	 * @see #getNoteType()
	 * @generated
	 */
	EReference getNoteType_Literal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.NoteType#getUlink <em>Ulink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ulink</em>'.
	 * @see org.kermeta.Docbook.NoteType#getUlink()
	 * @see #getNoteType()
	 * @generated
	 */
	EReference getNoteType_Ulink();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.OptionType <em>Option Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Option Type</em>'.
	 * @see org.kermeta.Docbook.OptionType
	 * @generated
	 */
	EClass getOptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.OptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.OptionType#getMixed()
	 * @see #getOptionType()
	 * @generated
	 */
	EAttribute getOptionType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.OptionType#getReplaceable <em>Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replaceable</em>'.
	 * @see org.kermeta.Docbook.OptionType#getReplaceable()
	 * @see #getOptionType()
	 * @generated
	 */
	EReference getOptionType_Replaceable();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.OrderedlistType <em>Orderedlist Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Orderedlist Type</em>'.
	 * @see org.kermeta.Docbook.OrderedlistType
	 * @generated
	 */
	EClass getOrderedlistType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.OrderedlistType#getContinuation <em>Continuation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Continuation</em>'.
	 * @see org.kermeta.Docbook.OrderedlistType#getContinuation()
	 * @see #getOrderedlistType()
	 * @generated
	 */
	EAttribute getOrderedlistType_Continuation();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.OrderedlistType#getInheritnum <em>Inheritnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inheritnum</em>'.
	 * @see org.kermeta.Docbook.OrderedlistType#getInheritnum()
	 * @see #getOrderedlistType()
	 * @generated
	 */
	EAttribute getOrderedlistType_Inheritnum();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.OtheraddrType <em>Otheraddr Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Otheraddr Type</em>'.
	 * @see org.kermeta.Docbook.OtheraddrType
	 * @generated
	 */
	EClass getOtheraddrType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.OtheraddrType#getUlink <em>Ulink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Ulink</em>'.
	 * @see org.kermeta.Docbook.OtheraddrType#getUlink()
	 * @see #getOtheraddrType()
	 * @generated
	 */
	EReference getOtheraddrType_Ulink();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ParaType <em>Para Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Para Type</em>'.
	 * @see org.kermeta.Docbook.ParaType
	 * @generated
	 */
	EClass getParaType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ParaType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.ParaType#getMixed()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ParaType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.ParaType#getGroup()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ParaType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.ParaType#getEmphasis()
	 * @see #getParaType()
	 * @generated
	 */
	EReference getParaType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ParaType#getLiteral <em>Literal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Literal</em>'.
	 * @see org.kermeta.Docbook.ParaType#getLiteral()
	 * @see #getParaType()
	 * @generated
	 */
	EReference getParaType_Literal();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ParaType#getUlink <em>Ulink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ulink</em>'.
	 * @see org.kermeta.Docbook.ParaType#getUlink()
	 * @see #getParaType()
	 * @generated
	 */
	EReference getParaType_Ulink();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ParaType#getFootnote <em>Footnote</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Footnote</em>'.
	 * @see org.kermeta.Docbook.ParaType#getFootnote()
	 * @see #getParaType()
	 * @generated
	 */
	EReference getParaType_Footnote();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ParaType#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Link</em>'.
	 * @see org.kermeta.Docbook.ParaType#getLink()
	 * @see #getParaType()
	 * @generated
	 */
	EReference getParaType_Link();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ParaType#getRole <em>Role</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Role</em>'.
	 * @see org.kermeta.Docbook.ParaType#getRole()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_Role();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ParaType#getItemizedlist <em>Itemizedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Itemizedlist</em>'.
	 * @see org.kermeta.Docbook.ParaType#getItemizedlist()
	 * @see #getParaType()
	 * @generated
	 */
	EReference getParaType_Itemizedlist();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ParaType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.Docbook.ParaType#getId()
	 * @see #getParaType()
	 * @generated
	 */
	EAttribute getParaType_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ParaType#getVariablelist <em>Variablelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variablelist</em>'.
	 * @see org.kermeta.Docbook.ParaType#getVariablelist()
	 * @see #getParaType()
	 * @generated
	 */
	EReference getParaType_Variablelist();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.PersonnameType <em>Personname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Personname Type</em>'.
	 * @see org.kermeta.Docbook.PersonnameType
	 * @generated
	 */
	EClass getPersonnameType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.PersonnameType#getFirstname <em>Firstname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Firstname</em>'.
	 * @see org.kermeta.Docbook.PersonnameType#getFirstname()
	 * @see #getPersonnameType()
	 * @generated
	 */
	EReference getPersonnameType_Firstname();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.PersonnameType#getSurname <em>Surname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Surname</em>'.
	 * @see org.kermeta.Docbook.PersonnameType#getSurname()
	 * @see #getPersonnameType()
	 * @generated
	 */
	EReference getPersonnameType_Surname();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.PhraseType <em>Phrase Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Phrase Type</em>'.
	 * @see org.kermeta.Docbook.PhraseType
	 * @generated
	 */
	EClass getPhraseType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.PhraseType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.Docbook.PhraseType#getId()
	 * @see #getPhraseType()
	 * @generated
	 */
	EAttribute getPhraseType_Id();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.PrefaceType <em>Preface Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Preface Type</em>'.
	 * @see org.kermeta.Docbook.PrefaceType
	 * @generated
	 */
	EClass getPrefaceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.PrefaceType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.PrefaceType#getTitle()
	 * @see #getPrefaceType()
	 * @generated
	 */
	EReference getPrefaceType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.PrefaceType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.PrefaceType#getPara()
	 * @see #getPrefaceType()
	 * @generated
	 */
	EReference getPrefaceType_Para();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.PrefaceType#getImportant <em>Important</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Important</em>'.
	 * @see org.kermeta.Docbook.PrefaceType#getImportant()
	 * @see #getPrefaceType()
	 * @generated
	 */
	EReference getPrefaceType_Important();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.PrefaceType#getTip <em>Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tip</em>'.
	 * @see org.kermeta.Docbook.PrefaceType#getTip()
	 * @see #getPrefaceType()
	 * @generated
	 */
	EReference getPrefaceType_Tip();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ProgramlistingType <em>Programlisting Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Programlisting Type</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType
	 * @generated
	 */
	EClass getProgramlistingType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ProgramlistingType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getMixed()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EAttribute getProgramlistingType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ProgramlistingType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getGroup()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EAttribute getProgramlistingType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ProgramlistingType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getEmphasis()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EReference getProgramlistingType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ProgramlistingType#getPhrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phrase</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getPhrase()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EReference getProgramlistingType_Phrase();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ProgramlistingType#getSuperscript <em>Superscript</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Superscript</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getSuperscript()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EAttribute getProgramlistingType_Superscript();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ProgramlistingType#getFormat <em>Format</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Format</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getFormat()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EAttribute getProgramlistingType_Format();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ProgramlistingType#getLanguage <em>Language</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Language</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getLanguage()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EAttribute getProgramlistingType_Language();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ProgramlistingType#getLinenumbering <em>Linenumbering</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Linenumbering</em>'.
	 * @see org.kermeta.Docbook.ProgramlistingType#getLinenumbering()
	 * @see #getProgramlistingType()
	 * @generated
	 */
	EAttribute getProgramlistingType_Linenumbering();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.PublisherType <em>Publisher Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Publisher Type</em>'.
	 * @see org.kermeta.Docbook.PublisherType
	 * @generated
	 */
	EClass getPublisherType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.PublisherType#getPublishername <em>Publishername</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Publishername</em>'.
	 * @see org.kermeta.Docbook.PublisherType#getPublishername()
	 * @see #getPublisherType()
	 * @generated
	 */
	EAttribute getPublisherType_Publishername();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.PublisherType#getAddress <em>Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Address</em>'.
	 * @see org.kermeta.Docbook.PublisherType#getAddress()
	 * @see #getPublisherType()
	 * @generated
	 */
	EReference getPublisherType_Address();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RefEntryType <em>Ref Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Entry Type</em>'.
	 * @see org.kermeta.Docbook.RefEntryType
	 * @generated
	 */
	EClass getRefEntryType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RefEntryType#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.kermeta.Docbook.RefEntryType#getInfo()
	 * @see #getRefEntryType()
	 * @generated
	 */
	EReference getRefEntryType_Info();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RefEntryType#getRefmeta <em>Refmeta</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refmeta</em>'.
	 * @see org.kermeta.Docbook.RefEntryType#getRefmeta()
	 * @see #getRefEntryType()
	 * @generated
	 */
	EReference getRefEntryType_Refmeta();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RefEntryType#getRefnamediv <em>Refnamediv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refnamediv</em>'.
	 * @see org.kermeta.Docbook.RefEntryType#getRefnamediv()
	 * @see #getRefEntryType()
	 * @generated
	 */
	EReference getRefEntryType_Refnamediv();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RefEntryType#getRefsynopsisdiv <em>Refsynopsisdiv</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refsynopsisdiv</em>'.
	 * @see org.kermeta.Docbook.RefEntryType#getRefsynopsisdiv()
	 * @see #getRefEntryType()
	 * @generated
	 */
	EReference getRefEntryType_Refsynopsisdiv();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RefEntryType#getRefsect1 <em>Refsect1</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refsect1</em>'.
	 * @see org.kermeta.Docbook.RefEntryType#getRefsect1()
	 * @see #getRefEntryType()
	 * @generated
	 */
	EReference getRefEntryType_Refsect1();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.RefEntryType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.kermeta.Docbook.RefEntryType#getVersion()
	 * @see #getRefEntryType()
	 * @generated
	 */
	EAttribute getRefEntryType_Version();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RefEntryTitleType <em>Ref Entry Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Entry Title Type</em>'.
	 * @see org.kermeta.Docbook.RefEntryTitleType
	 * @generated
	 */
	EClass getRefEntryTitleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.RefEntryTitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.RefEntryTitleType#getMixed()
	 * @see #getRefEntryTitleType()
	 * @generated
	 */
	EAttribute getRefEntryTitleType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ReferenceType <em>Reference Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference Type</em>'.
	 * @see org.kermeta.Docbook.ReferenceType
	 * @generated
	 */
	EClass getReferenceType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ReferenceType#getInfo <em>Info</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Info</em>'.
	 * @see org.kermeta.Docbook.ReferenceType#getInfo()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Info();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ReferenceType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.ReferenceType#getTitle()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Title();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ReferenceType#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see org.kermeta.Docbook.ReferenceType#getVersion()
	 * @see #getReferenceType()
	 * @generated
	 */
	EAttribute getReferenceType_Version();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ReferenceType#getRefentry <em>Refentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Refentry</em>'.
	 * @see org.kermeta.Docbook.ReferenceType#getRefentry()
	 * @see #getReferenceType()
	 * @generated
	 */
	EReference getReferenceType_Refentry();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RefMetaType <em>Ref Meta Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Meta Type</em>'.
	 * @see org.kermeta.Docbook.RefMetaType
	 * @generated
	 */
	EClass getRefMetaType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RefMetaType#getRefentrytitle <em>Refentrytitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Refentrytitle</em>'.
	 * @see org.kermeta.Docbook.RefMetaType#getRefentrytitle()
	 * @see #getRefMetaType()
	 * @generated
	 */
	EReference getRefMetaType_Refentrytitle();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.RefMetaType#getManvolnum <em>Manvolnum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Manvolnum</em>'.
	 * @see org.kermeta.Docbook.RefMetaType#getManvolnum()
	 * @see #getRefMetaType()
	 * @generated
	 */
	EAttribute getRefMetaType_Manvolnum();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RefNameDivType <em>Ref Name Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Name Div Type</em>'.
	 * @see org.kermeta.Docbook.RefNameDivType
	 * @generated
	 */
	EClass getRefNameDivType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.RefNameDivType#getRefname <em>Refname</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refname</em>'.
	 * @see org.kermeta.Docbook.RefNameDivType#getRefname()
	 * @see #getRefNameDivType()
	 * @generated
	 */
	EAttribute getRefNameDivType_Refname();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.RefNameDivType#getRefpurpose <em>Refpurpose</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refpurpose</em>'.
	 * @see org.kermeta.Docbook.RefNameDivType#getRefpurpose()
	 * @see #getRefNameDivType()
	 * @generated
	 */
	EAttribute getRefNameDivType_Refpurpose();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.RefNameDivType#getRefclass <em>Refclass</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Refclass</em>'.
	 * @see org.kermeta.Docbook.RefNameDivType#getRefclass()
	 * @see #getRefNameDivType()
	 * @generated
	 */
	EAttribute getRefNameDivType_Refclass();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RefSect1Type <em>Ref Sect1 Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Sect1 Type</em>'.
	 * @see org.kermeta.Docbook.RefSect1Type
	 * @generated
	 */
	EClass getRefSect1Type();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.RefSect1Type#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.RefSect1Type#getGroup()
	 * @see #getRefSect1Type()
	 * @generated
	 */
	EAttribute getRefSect1Type_Group();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RefSect1Type#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.RefSect1Type#getTitle()
	 * @see #getRefSect1Type()
	 * @generated
	 */
	EReference getRefSect1Type_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RefSect1Type#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.RefSect1Type#getPara()
	 * @see #getRefSect1Type()
	 * @generated
	 */
	EReference getRefSect1Type_Para();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RefSect1Type#getVariablelist <em>Variablelist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Variablelist</em>'.
	 * @see org.kermeta.Docbook.RefSect1Type#getVariablelist()
	 * @see #getRefSect1Type()
	 * @generated
	 */
	EReference getRefSect1Type_Variablelist();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RefSect1Type#getSegmentedlist <em>Segmentedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Segmentedlist</em>'.
	 * @see org.kermeta.Docbook.RefSect1Type#getSegmentedlist()
	 * @see #getRefSect1Type()
	 * @generated
	 */
	EReference getRefSect1Type_Segmentedlist();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.RefSect1Type#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.Docbook.RefSect1Type#getId()
	 * @see #getRefSect1Type()
	 * @generated
	 */
	EAttribute getRefSect1Type_Id();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RefSynopsisDivType <em>Ref Synopsis Div Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ref Synopsis Div Type</em>'.
	 * @see org.kermeta.Docbook.RefSynopsisDivType
	 * @generated
	 */
	EClass getRefSynopsisDivType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RefSynopsisDivType#getCmdsynopsis <em>Cmdsynopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmdsynopsis</em>'.
	 * @see org.kermeta.Docbook.RefSynopsisDivType#getCmdsynopsis()
	 * @see #getRefSynopsisDivType()
	 * @generated
	 */
	EReference getRefSynopsisDivType_Cmdsynopsis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RefSynopsisDivType#getFuncsynopsis <em>Funcsynopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcsynopsis</em>'.
	 * @see org.kermeta.Docbook.RefSynopsisDivType#getFuncsynopsis()
	 * @see #getRefSynopsisDivType()
	 * @generated
	 */
	EReference getRefSynopsisDivType_Funcsynopsis();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RevdescriptionType <em>Revdescription Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revdescription Type</em>'.
	 * @see org.kermeta.Docbook.RevdescriptionType
	 * @generated
	 */
	EClass getRevdescriptionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.RevdescriptionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.RevdescriptionType#getMixed()
	 * @see #getRevdescriptionType()
	 * @generated
	 */
	EAttribute getRevdescriptionType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RevdescriptionType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.RevdescriptionType#getPara()
	 * @see #getRevdescriptionType()
	 * @generated
	 */
	EReference getRevdescriptionType_Para();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RevhistoryType <em>Revhistory Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revhistory Type</em>'.
	 * @see org.kermeta.Docbook.RevhistoryType
	 * @generated
	 */
	EClass getRevhistoryType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RevhistoryType#getRevision <em>Revision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Revision</em>'.
	 * @see org.kermeta.Docbook.RevhistoryType#getRevision()
	 * @see #getRevhistoryType()
	 * @generated
	 */
	EReference getRevhistoryType_Revision();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RevisionType <em>Revision Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revision Type</em>'.
	 * @see org.kermeta.Docbook.RevisionType
	 * @generated
	 */
	EClass getRevisionType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RevisionType#getRevnumber <em>Revnumber</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revnumber</em>'.
	 * @see org.kermeta.Docbook.RevisionType#getRevnumber()
	 * @see #getRevisionType()
	 * @generated
	 */
	EReference getRevisionType_Revnumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RevisionType#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date</em>'.
	 * @see org.kermeta.Docbook.RevisionType#getDate()
	 * @see #getRevisionType()
	 * @generated
	 */
	EReference getRevisionType_Date();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RevisionType#getRevdescription <em>Revdescription</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Revdescription</em>'.
	 * @see org.kermeta.Docbook.RevisionType#getRevdescription()
	 * @see #getRevisionType()
	 * @generated
	 */
	EReference getRevisionType_Revdescription();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.RevisionType#getAuthorinitials <em>Authorinitials</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Authorinitials</em>'.
	 * @see org.kermeta.Docbook.RevisionType#getAuthorinitials()
	 * @see #getRevisionType()
	 * @generated
	 */
	EReference getRevisionType_Authorinitials();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RevnumberType <em>Revnumber Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Revnumber Type</em>'.
	 * @see org.kermeta.Docbook.RevnumberType
	 * @generated
	 */
	EClass getRevnumberType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.RevnumberType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.RevnumberType#getMixed()
	 * @see #getRevnumberType()
	 * @generated
	 */
	EAttribute getRevnumberType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RevnumberType#getUlink <em>Ulink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ulink</em>'.
	 * @see org.kermeta.Docbook.RevnumberType#getUlink()
	 * @see #getRevnumberType()
	 * @generated
	 */
	EReference getRevnumberType_Ulink();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.RowType <em>Row Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Row Type</em>'.
	 * @see org.kermeta.Docbook.RowType
	 * @generated
	 */
	EClass getRowType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.RowType#getEntry <em>Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry</em>'.
	 * @see org.kermeta.Docbook.RowType#getEntry()
	 * @see #getRowType()
	 * @generated
	 */
	EReference getRowType_Entry();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.SectionType <em>Section Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Section Type</em>'.
	 * @see org.kermeta.Docbook.SectionType
	 * @generated
	 */
	EClass getSectionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SectionType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.SectionType#getGroup()
	 * @see #getSectionType()
	 * @generated
	 */
	EAttribute getSectionType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getItemizedlist <em>Itemizedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Itemizedlist</em>'.
	 * @see org.kermeta.Docbook.SectionType#getItemizedlist()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Itemizedlist();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getMediaobject <em>Mediaobject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Mediaobject</em>'.
	 * @see org.kermeta.Docbook.SectionType#getMediaobject()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Mediaobject();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getNote <em>Note</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Note</em>'.
	 * @see org.kermeta.Docbook.SectionType#getNote()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Note();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getPara <em>Para</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Para</em>'.
	 * @see org.kermeta.Docbook.SectionType#getPara()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Para();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getProgramlisting <em>Programlisting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Programlisting</em>'.
	 * @see org.kermeta.Docbook.SectionType#getProgramlisting()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Programlisting();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getSection <em>Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Section</em>'.
	 * @see org.kermeta.Docbook.SectionType#getSection()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Section();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Title</em>'.
	 * @see org.kermeta.Docbook.SectionType#getTitle()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Title();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getFigure <em>Figure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Figure</em>'.
	 * @see org.kermeta.Docbook.SectionType#getFigure()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Figure();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getInformaltable <em>Informaltable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Informaltable</em>'.
	 * @see org.kermeta.Docbook.SectionType#getInformaltable()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Informaltable();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getOrderedlist <em>Orderedlist</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Orderedlist</em>'.
	 * @see org.kermeta.Docbook.SectionType#getOrderedlist()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Orderedlist();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see org.kermeta.Docbook.SectionType#getTable()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Table();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SectionType#getWarning <em>Warning</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Warning</em>'.
	 * @see org.kermeta.Docbook.SectionType#getWarning()
	 * @see #getSectionType()
	 * @generated
	 */
	EAttribute getSectionType_Warning();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.SectionType#getTip <em>Tip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tip</em>'.
	 * @see org.kermeta.Docbook.SectionType#getTip()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Tip();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.SectionType#getCaution <em>Caution</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Caution</em>'.
	 * @see org.kermeta.Docbook.SectionType#getCaution()
	 * @see #getSectionType()
	 * @generated
	 */
	EAttribute getSectionType_Caution();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.SectionType#getExample <em>Example</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Example</em>'.
	 * @see org.kermeta.Docbook.SectionType#getExample()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Example();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getCmdsynopsis <em>Cmdsynopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cmdsynopsis</em>'.
	 * @see org.kermeta.Docbook.SectionType#getCmdsynopsis()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Cmdsynopsis();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.SectionType#getAnnotations <em>Annotations</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Annotations</em>'.
	 * @see org.kermeta.Docbook.SectionType#getAnnotations()
	 * @see #getSectionType()
	 * @generated
	 */
	EAttribute getSectionType_Annotations();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.SegListItemType <em>Seg List Item Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seg List Item Type</em>'.
	 * @see org.kermeta.Docbook.SegListItemType
	 * @generated
	 */
	EClass getSegListItemType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SegListItemType#getSeg <em>Seg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seg</em>'.
	 * @see org.kermeta.Docbook.SegListItemType#getSeg()
	 * @see #getSegListItemType()
	 * @generated
	 */
	EReference getSegListItemType_Seg();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.SegmentedListType <em>Segmented List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Segmented List Type</em>'.
	 * @see org.kermeta.Docbook.SegmentedListType
	 * @generated
	 */
	EClass getSegmentedListType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SegmentedListType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.SegmentedListType#getGroup()
	 * @see #getSegmentedListType()
	 * @generated
	 */
	EAttribute getSegmentedListType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SegmentedListType#getSegtitle <em>Segtitle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segtitle</em>'.
	 * @see org.kermeta.Docbook.SegmentedListType#getSegtitle()
	 * @see #getSegmentedListType()
	 * @generated
	 */
	EAttribute getSegmentedListType_Segtitle();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SegmentedListType#getSeglistitem <em>Seglistitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Seglistitem</em>'.
	 * @see org.kermeta.Docbook.SegmentedListType#getSeglistitem()
	 * @see #getSegmentedListType()
	 * @generated
	 */
	EReference getSegmentedListType_Seglistitem();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.SegType <em>Seg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Seg Type</em>'.
	 * @see org.kermeta.Docbook.SegType
	 * @generated
	 */
	EClass getSegType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SegType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.SegType#getGroup()
	 * @see #getSegType()
	 * @generated
	 */
	EAttribute getSegType_Group();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SegType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.SegType#getMixed()
	 * @see #getSegType()
	 * @generated
	 */
	EAttribute getSegType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SegType#getErrorcode <em>Errorcode</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Errorcode</em>'.
	 * @see org.kermeta.Docbook.SegType#getErrorcode()
	 * @see #getSegType()
	 * @generated
	 */
	EAttribute getSegType_Errorcode();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SegType#getErrortext <em>Errortext</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Errortext</em>'.
	 * @see org.kermeta.Docbook.SegType#getErrortext()
	 * @see #getSegType()
	 * @generated
	 */
	EAttribute getSegType_Errortext();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SectionType#getFuncsynopsis <em>Funcsynopsis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcsynopsis</em>'.
	 * @see org.kermeta.Docbook.SectionType#getFuncsynopsis()
	 * @see #getSectionType()
	 * @generated
	 */
	EReference getSectionType_Funcsynopsis();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.SubtitleType <em>Subtitle Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subtitle Type</em>'.
	 * @see org.kermeta.Docbook.SubtitleType
	 * @generated
	 */
	EClass getSubtitleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SubtitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.SubtitleType#getMixed()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SubtitleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.SubtitleType#getGroup()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EAttribute getSubtitleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SubtitleType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.SubtitleType#getEmphasis()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.SubtitleType#getPhrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phrase</em>'.
	 * @see org.kermeta.Docbook.SubtitleType#getPhrase()
	 * @see #getSubtitleType()
	 * @generated
	 */
	EReference getSubtitleType_Phrase();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.SurnameType <em>Surname Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Surname Type</em>'.
	 * @see org.kermeta.Docbook.SurnameType
	 * @generated
	 */
	EClass getSurnameType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.SurnameType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.SurnameType#getMixed()
	 * @see #getSurnameType()
	 * @generated
	 */
	EAttribute getSurnameType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.TableType <em>Table Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Type</em>'.
	 * @see org.kermeta.Docbook.TableType
	 * @generated
	 */
	EClass getTableType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.TableType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.TableType#getTitle()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.TableType#getTgroup <em>Tgroup</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tgroup</em>'.
	 * @see org.kermeta.Docbook.TableType#getTgroup()
	 * @see #getTableType()
	 * @generated
	 */
	EReference getTableType_Tgroup();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.TableType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.Docbook.TableType#getId()
	 * @see #getTableType()
	 * @generated
	 */
	EAttribute getTableType_Id();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.TermType <em>Term Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Term Type</em>'.
	 * @see org.kermeta.Docbook.TermType
	 * @generated
	 */
	EClass getTermType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.TermType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.TermType#getMixed()
	 * @see #getTermType()
	 * @generated
	 */
	EAttribute getTermType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TermType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.TermType#getEmphasis()
	 * @see #getTermType()
	 * @generated
	 */
	EReference getTermType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TermType#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see org.kermeta.Docbook.TermType#getOption()
	 * @see #getTermType()
	 * @generated
	 */
	EReference getTermType_Option();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TermType#getFilename <em>Filename</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Filename</em>'.
	 * @see org.kermeta.Docbook.TermType#getFilename()
	 * @see #getTermType()
	 * @generated
	 */
	EReference getTermType_Filename();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TermType#getEnvar <em>Envar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Envar</em>'.
	 * @see org.kermeta.Docbook.TermType#getEnvar()
	 * @see #getTermType()
	 * @generated
	 */
	EReference getTermType_Envar();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.TbodyType <em>Tbody Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tbody Type</em>'.
	 * @see org.kermeta.Docbook.TbodyType
	 * @generated
	 */
	EClass getTbodyType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TbodyType#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see org.kermeta.Docbook.TbodyType#getRow()
	 * @see #getTbodyType()
	 * @generated
	 */
	EReference getTbodyType_Row();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.TgroupType <em>Tgroup Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tgroup Type</em>'.
	 * @see org.kermeta.Docbook.TgroupType
	 * @generated
	 */
	EClass getTgroupType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TgroupType#getColspec <em>Colspec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Colspec</em>'.
	 * @see org.kermeta.Docbook.TgroupType#getColspec()
	 * @see #getTgroupType()
	 * @generated
	 */
	EReference getTgroupType_Colspec();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.TgroupType#getThead <em>Thead</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Thead</em>'.
	 * @see org.kermeta.Docbook.TgroupType#getThead()
	 * @see #getTgroupType()
	 * @generated
	 */
	EReference getTgroupType_Thead();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.TgroupType#getTbody <em>Tbody</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Tbody</em>'.
	 * @see org.kermeta.Docbook.TgroupType#getTbody()
	 * @see #getTgroupType()
	 * @generated
	 */
	EReference getTgroupType_Tbody();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.TgroupType#getCols <em>Cols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Cols</em>'.
	 * @see org.kermeta.Docbook.TgroupType#getCols()
	 * @see #getTgroupType()
	 * @generated
	 */
	EAttribute getTgroupType_Cols();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.TgroupType#getColseq <em>Colseq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Colseq</em>'.
	 * @see org.kermeta.Docbook.TgroupType#getColseq()
	 * @see #getTgroupType()
	 * @generated
	 */
	EAttribute getTgroupType_Colseq();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.TgroupType#getRowseq <em>Rowseq</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rowseq</em>'.
	 * @see org.kermeta.Docbook.TgroupType#getRowseq()
	 * @see #getTgroupType()
	 * @generated
	 */
	EAttribute getTgroupType_Rowseq();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.TgroupType#getAlign <em>Align</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Align</em>'.
	 * @see org.kermeta.Docbook.TgroupType#getAlign()
	 * @see #getTgroupType()
	 * @generated
	 */
	EAttribute getTgroupType_Align();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.TheadType <em>Thead Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Thead Type</em>'.
	 * @see org.kermeta.Docbook.TheadType
	 * @generated
	 */
	EClass getTheadType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TheadType#getRow <em>Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Row</em>'.
	 * @see org.kermeta.Docbook.TheadType#getRow()
	 * @see #getTheadType()
	 * @generated
	 */
	EReference getTheadType_Row();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.TipType <em>Tip Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Tip Type</em>'.
	 * @see org.kermeta.Docbook.TipType
	 * @generated
	 */
	EClass getTipType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.TipType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.TipType#getMixed()
	 * @see #getTipType()
	 * @generated
	 */
	EAttribute getTipType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TipType#getUlink <em>Ulink</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ulink</em>'.
	 * @see org.kermeta.Docbook.TipType#getUlink()
	 * @see #getTipType()
	 * @generated
	 */
	EReference getTipType_Ulink();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.TitleType <em>Title Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Title Type</em>'.
	 * @see org.kermeta.Docbook.TitleType
	 * @generated
	 */
	EClass getTitleType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.TitleType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.TitleType#getMixed()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Mixed();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.TitleType#getGroup <em>Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Group</em>'.
	 * @see org.kermeta.Docbook.TitleType#getGroup()
	 * @see #getTitleType()
	 * @generated
	 */
	EAttribute getTitleType_Group();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TitleType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.TitleType#getEmphasis()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Emphasis();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.TitleType#getPhrase <em>Phrase</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Phrase</em>'.
	 * @see org.kermeta.Docbook.TitleType#getPhrase()
	 * @see #getTitleType()
	 * @generated
	 */
	EReference getTitleType_Phrase();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.UlinkType <em>Ulink Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Ulink Type</em>'.
	 * @see org.kermeta.Docbook.UlinkType
	 * @generated
	 */
	EClass getUlinkType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.UlinkType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.UlinkType#getMixed()
	 * @see #getUlinkType()
	 * @generated
	 */
	EAttribute getUlinkType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.UlinkType#getEmphasis <em>Emphasis</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Emphasis</em>'.
	 * @see org.kermeta.Docbook.UlinkType#getEmphasis()
	 * @see #getUlinkType()
	 * @generated
	 */
	EReference getUlinkType_Emphasis();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.UlinkType#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see org.kermeta.Docbook.UlinkType#getType()
	 * @see #getUlinkType()
	 * @generated
	 */
	EAttribute getUlinkType_Type();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.UlinkType#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Url</em>'.
	 * @see org.kermeta.Docbook.UlinkType#getUrl()
	 * @see #getUlinkType()
	 * @generated
	 */
	EAttribute getUlinkType_Url();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.VariableListType <em>Variable List Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Variable List Type</em>'.
	 * @see org.kermeta.Docbook.VariableListType
	 * @generated
	 */
	EClass getVariableListType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.VariableListType#getVarlistentry <em>Varlistentry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Varlistentry</em>'.
	 * @see org.kermeta.Docbook.VariableListType#getVarlistentry()
	 * @see #getVariableListType()
	 * @generated
	 */
	EReference getVariableListType_Varlistentry();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.VarListEntryType <em>Var List Entry Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Var List Entry Type</em>'.
	 * @see org.kermeta.Docbook.VarListEntryType
	 * @generated
	 */
	EClass getVarListEntryType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.VarListEntryType#getSpacing <em>Spacing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spacing</em>'.
	 * @see org.kermeta.Docbook.VarListEntryType#getSpacing()
	 * @see #getVarListEntryType()
	 * @generated
	 */
	EAttribute getVarListEntryType_Spacing();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.VarListEntryType#getTermlength <em>Termlength</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Termlength</em>'.
	 * @see org.kermeta.Docbook.VarListEntryType#getTermlength()
	 * @see #getVarListEntryType()
	 * @generated
	 */
	EAttribute getVarListEntryType_Termlength();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.VarListEntryType#getTerm <em>Term</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Term</em>'.
	 * @see org.kermeta.Docbook.VarListEntryType#getTerm()
	 * @see #getVarListEntryType()
	 * @generated
	 */
	EReference getVarListEntryType_Term();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.VarListEntryType#getListitem <em>Listitem</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Listitem</em>'.
	 * @see org.kermeta.Docbook.VarListEntryType#getListitem()
	 * @see #getVarListEntryType()
	 * @generated
	 */
	EReference getVarListEntryType_Listitem();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FuncsynopsisType <em>Funcsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcsynopsis Type</em>'.
	 * @see org.kermeta.Docbook.FuncsynopsisType
	 * @generated
	 */
	EClass getFuncsynopsisType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.FuncsynopsisType#getFuncprototype <em>Funcprototype</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Funcprototype</em>'.
	 * @see org.kermeta.Docbook.FuncsynopsisType#getFuncprototype()
	 * @see #getFuncsynopsisType()
	 * @generated
	 */
	EReference getFuncsynopsisType_Funcprototype();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FuncprototypeType <em>Funcprototype Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcprototype Type</em>'.
	 * @see org.kermeta.Docbook.FuncprototypeType
	 * @generated
	 */
	EClass getFuncprototypeType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.FuncprototypeType#getFuncdef <em>Funcdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Funcdef</em>'.
	 * @see org.kermeta.Docbook.FuncprototypeType#getFuncdef()
	 * @see #getFuncprototypeType()
	 * @generated
	 */
	EReference getFuncprototypeType_Funcdef();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.FuncprototypeType#getParamdef <em>Paramdef</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Paramdef</em>'.
	 * @see org.kermeta.Docbook.FuncprototypeType#getParamdef()
	 * @see #getFuncprototypeType()
	 * @generated
	 */
	EReference getFuncprototypeType_Paramdef();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ParamdefType <em>Paramdef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Paramdef Type</em>'.
	 * @see org.kermeta.Docbook.ParamdefType
	 * @generated
	 */
	EClass getParamdefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ParamdefType#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Parameter</em>'.
	 * @see org.kermeta.Docbook.ParamdefType#getParameter()
	 * @see #getParamdefType()
	 * @generated
	 */
	EReference getParamdefType_Parameter();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ParamdefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.ParamdefType#getMixed()
	 * @see #getParamdefType()
	 * @generated
	 */
	EAttribute getParamdefType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FuncdefType <em>Funcdef Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Funcdef Type</em>'.
	 * @see org.kermeta.Docbook.FuncdefType
	 * @generated
	 */
	EClass getFuncdefType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.FuncdefType#getFunction <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Function</em>'.
	 * @see org.kermeta.Docbook.FuncdefType#getFunction()
	 * @see #getFuncdefType()
	 * @generated
	 */
	EReference getFuncdefType_Function();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.FuncdefType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.FuncdefType#getMixed()
	 * @see #getFuncdefType()
	 * @generated
	 */
	EAttribute getFuncdefType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ParameterType <em>Parameter Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter Type</em>'.
	 * @see org.kermeta.Docbook.ParameterType
	 * @generated
	 */
	EClass getParameterType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ParameterType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.ParameterType#getMixed()
	 * @see #getParameterType()
	 * @generated
	 */
	EAttribute getParameterType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.FunctionType <em>Function Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Type</em>'.
	 * @see org.kermeta.Docbook.FunctionType
	 * @generated
	 */
	EClass getFunctionType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.FunctionType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.FunctionType#getMixed()
	 * @see #getFunctionType()
	 * @generated
	 */
	EAttribute getFunctionType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ExampleType <em>Example Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Example Type</em>'.
	 * @see org.kermeta.Docbook.ExampleType
	 * @generated
	 */
	EClass getExampleType();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ExampleType#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see org.kermeta.Docbook.ExampleType#getId()
	 * @see #getExampleType()
	 * @generated
	 */
	EAttribute getExampleType_Id();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ExampleType#getTitle <em>Title</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Title</em>'.
	 * @see org.kermeta.Docbook.ExampleType#getTitle()
	 * @see #getExampleType()
	 * @generated
	 */
	EReference getExampleType_Title();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.ExampleType#getProgramlisting <em>Programlisting</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Programlisting</em>'.
	 * @see org.kermeta.Docbook.ExampleType#getProgramlisting()
	 * @see #getExampleType()
	 * @generated
	 */
	EReference getExampleType_Programlisting();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.CmdsynopsisType <em>Cmdsynopsis Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Cmdsynopsis Type</em>'.
	 * @see org.kermeta.Docbook.CmdsynopsisType
	 * @generated
	 */
	EClass getCmdsynopsisType();

	/**
	 * Returns the meta object for the containment reference '{@link org.kermeta.Docbook.CmdsynopsisType#getCommand <em>Command</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Command</em>'.
	 * @see org.kermeta.Docbook.CmdsynopsisType#getCommand()
	 * @see #getCmdsynopsisType()
	 * @generated
	 */
	EReference getCmdsynopsisType_Command();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.CmdsynopsisType#getArg <em>Arg</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Arg</em>'.
	 * @see org.kermeta.Docbook.CmdsynopsisType#getArg()
	 * @see #getCmdsynopsisType()
	 * @generated
	 */
	EReference getCmdsynopsisType_Arg();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.CommandType <em>Command Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Command Type</em>'.
	 * @see org.kermeta.Docbook.CommandType
	 * @generated
	 */
	EClass getCommandType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.CommandType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.CommandType#getMixed()
	 * @see #getCommandType()
	 * @generated
	 */
	EAttribute getCommandType_Mixed();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ArgType <em>Arg Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Arg Type</em>'.
	 * @see org.kermeta.Docbook.ArgType
	 * @generated
	 */
	EClass getArgType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ArgType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.ArgType#getMixed()
	 * @see #getArgType()
	 * @generated
	 */
	EAttribute getArgType_Mixed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ArgType#getOption <em>Option</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Option</em>'.
	 * @see org.kermeta.Docbook.ArgType#getOption()
	 * @see #getArgType()
	 * @generated
	 */
	EReference getArgType_Option();

	/**
	 * Returns the meta object for the containment reference list '{@link org.kermeta.Docbook.ArgType#getReplaceable <em>Replaceable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Replaceable</em>'.
	 * @see org.kermeta.Docbook.ArgType#getReplaceable()
	 * @see #getArgType()
	 * @generated
	 */
	EReference getArgType_Replaceable();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ArgType#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Choice</em>'.
	 * @see org.kermeta.Docbook.ArgType#getChoice()
	 * @see #getArgType()
	 * @generated
	 */
	EAttribute getArgType_Choice();

	/**
	 * Returns the meta object for the attribute '{@link org.kermeta.Docbook.ArgType#getRep <em>Rep</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rep</em>'.
	 * @see org.kermeta.Docbook.ArgType#getRep()
	 * @see #getArgType()
	 * @generated
	 */
	EAttribute getArgType_Rep();

	/**
	 * Returns the meta object for class '{@link org.kermeta.Docbook.ReplaceableType <em>Replaceable Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Replaceable Type</em>'.
	 * @see org.kermeta.Docbook.ReplaceableType
	 * @generated
	 */
	EClass getReplaceableType();

	/**
	 * Returns the meta object for the attribute list '{@link org.kermeta.Docbook.ReplaceableType#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.kermeta.Docbook.ReplaceableType#getMixed()
	 * @see #getReplaceableType()
	 * @generated
	 */
	EAttribute getReplaceableType_Mixed();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	DocbookFactory getDocbookFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.AbstractTypeImpl <em>Abstract Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.AbstractTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAbstractType()
		 * @generated
		 */
		EClass ABSTRACT_TYPE = eINSTANCE.getAbstractType();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ABSTRACT_TYPE__PARA = eINSTANCE.getAbstractType_Para();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.AddressTypeImpl <em>Address Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.AddressTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAddressType()
		 * @generated
		 */
		EClass ADDRESS_TYPE = eINSTANCE.getAddressType();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__STATE = eINSTANCE.getAddressType_State();

		/**
		 * The meta object literal for the '<em><b>Otheraddr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDRESS_TYPE__OTHERADDR = eINSTANCE.getAddressType_Otheraddr();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__FORMAT = eINSTANCE.getAddressType_Format();

		/**
		 * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDRESS_TYPE__EMAIL = eINSTANCE.getAddressType_Email();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.AuthorinitialsTypeImpl <em>Authorinitials Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.AuthorinitialsTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAuthorinitialsType()
		 * @generated
		 */
		EClass AUTHORINITIALS_TYPE = eINSTANCE.getAuthorinitialsType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHORINITIALS_TYPE__MIXED = eINSTANCE.getAuthorinitialsType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.AuthorTypeImpl <em>Author Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.AuthorTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getAuthorType()
		 * @generated
		 */
		EClass AUTHOR_TYPE = eINSTANCE.getAuthorType();

		/**
		 * The meta object literal for the '<em><b>Personname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR_TYPE__PERSONNAME = eINSTANCE.getAuthorType_Personname();

		/**
		 * The meta object literal for the '<em><b>Contrib</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute AUTHOR_TYPE__CONTRIB = eINSTANCE.getAuthorType_Contrib();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference AUTHOR_TYPE__ADDRESS = eINSTANCE.getAuthorType_Address();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.BookTypeImpl <em>Book Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.BookTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getBookType()
		 * @generated
		 */
		EClass BOOK_TYPE = eINSTANCE.getBookType();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_TYPE__INFO = eINSTANCE.getBookType_Info();

		/**
		 * The meta object literal for the '<em><b>Preface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_TYPE__PREFACE = eINSTANCE.getBookType_Preface();

		/**
		 * The meta object literal for the '<em><b>Chapter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_TYPE__CHAPTER = eINSTANCE.getBookType_Chapter();

		/**
		 * The meta object literal for the '<em><b>Reference</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BOOK_TYPE__REFERENCE = eINSTANCE.getBookType_Reference();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__LANG = eINSTANCE.getBookType_Lang();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__VERSION = eINSTANCE.getBookType_Version();

		/**
		 * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BOOK_TYPE__LABEL = eINSTANCE.getBookType_Label();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ChapterTypeImpl <em>Chapter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ChapterTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getChapterType()
		 * @generated
		 */
		EClass CHAPTER_TYPE = eINSTANCE.getChapterType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_TYPE__TITLE = eINSTANCE.getChapterType_Title();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_TYPE__PARA = eINSTANCE.getChapterType_Para();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_TYPE__NOTE = eINSTANCE.getChapterType_Note();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAPTER_TYPE__SECTION = eINSTANCE.getChapterType_Section();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHAPTER_TYPE__ANNOTATIONS = eINSTANCE.getChapterType_Annotations();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ColspecTypeImpl <em>Colspec Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ColspecTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getColspecType()
		 * @generated
		 */
		EClass COLSPEC_TYPE = eINSTANCE.getColspecType();

		/**
		 * The meta object literal for the '<em><b>Colname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLSPEC_TYPE__COLNAME = eINSTANCE.getColspecType_Colname();

		/**
		 * The meta object literal for the '<em><b>Colwidth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COLSPEC_TYPE__COLWIDTH = eINSTANCE.getColspecType_Colwidth();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ConfgroupTypeImpl <em>Confgroup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ConfgroupTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getConfgroupType()
		 * @generated
		 */
		EClass CONFGROUP_TYPE = eINSTANCE.getConfgroupType();

		/**
		 * The meta object literal for the '<em><b>Conftitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFGROUP_TYPE__CONFTITLE = eINSTANCE.getConfgroupType_Conftitle();

		/**
		 * The meta object literal for the '<em><b>Confnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFGROUP_TYPE__CONFNUM = eINSTANCE.getConfgroupType_Confnum();

		/**
		 * The meta object literal for the '<em><b>Confsponsor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONFGROUP_TYPE__CONFSPONSOR = eINSTANCE.getConfgroupType_Confsponsor();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.CopyrightTypeImpl <em>Copyright Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.CopyrightTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getCopyrightType()
		 * @generated
		 */
		EClass COPYRIGHT_TYPE = eINSTANCE.getCopyrightType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT_TYPE__GROUP = eINSTANCE.getCopyrightType_Group();

		/**
		 * The meta object literal for the '<em><b>Year</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT_TYPE__YEAR = eINSTANCE.getCopyrightType_Year();

		/**
		 * The meta object literal for the '<em><b>Holder</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COPYRIGHT_TYPE__HOLDER = eINSTANCE.getCopyrightType_Holder();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.DateTypeImpl <em>Date Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.DateTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getDateType()
		 * @generated
		 */
		EClass DATE_TYPE = eINSTANCE.getDateType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DATE_TYPE__MIXED = eINSTANCE.getDateType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.DocumentRootImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ABSTRACT = eINSTANCE.getDocumentRoot_Abstract();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ADDRESS = eINSTANCE.getDocumentRoot_Address();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__AUTHOR = eINSTANCE.getDocumentRoot_Author();

		/**
		 * The meta object literal for the '<em><b>Bibliomisc</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__BIBLIOMISC = eINSTANCE.getDocumentRoot_Bibliomisc();

		/**
		 * The meta object literal for the '<em><b>Book</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__BOOK = eINSTANCE.getDocumentRoot_Book();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INFO = eINSTANCE.getDocumentRoot_Info();

		/**
		 * The meta object literal for the '<em><b>Caution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CAUTION = eINSTANCE.getDocumentRoot_Caution();

		/**
		 * The meta object literal for the '<em><b>Chapter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CHAPTER = eINSTANCE.getDocumentRoot_Chapter();

		/**
		 * The meta object literal for the '<em><b>Colspec</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__COLSPEC = eINSTANCE.getDocumentRoot_Colspec();

		/**
		 * The meta object literal for the '<em><b>Confgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__CONFGROUP = eINSTANCE.getDocumentRoot_Confgroup();

		/**
		 * The meta object literal for the '<em><b>Confnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONFNUM = eINSTANCE.getDocumentRoot_Confnum();

		/**
		 * The meta object literal for the '<em><b>Confsponsor</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONFSPONSOR = eINSTANCE.getDocumentRoot_Confsponsor();

		/**
		 * The meta object literal for the '<em><b>Conftitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__CONFTITLE = eINSTANCE.getDocumentRoot_Conftitle();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__DATE = eINSTANCE.getDocumentRoot_Date();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__EMPHASIS = eINSTANCE.getDocumentRoot_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ENTRY = eINSTANCE.getDocumentRoot_Entry();

		/**
		 * The meta object literal for the '<em><b>Figure</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FIGURE = eINSTANCE.getDocumentRoot_Figure();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__FIRSTNAME = eINSTANCE.getDocumentRoot_Firstname();

		/**
		 * The meta object literal for the '<em><b>Footnote</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__FOOTNOTE = eINSTANCE.getDocumentRoot_Footnote();

		/**
		 * The meta object literal for the '<em><b>Imagedata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMAGEDATA = eINSTANCE.getDocumentRoot_Imagedata();

		/**
		 * The meta object literal for the '<em><b>Imageobject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMAGEOBJECT = eINSTANCE.getDocumentRoot_Imageobject();

		/**
		 * The meta object literal for the '<em><b>Important</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__IMPORTANT = eINSTANCE.getDocumentRoot_Important();

		/**
		 * The meta object literal for the '<em><b>Informaltable</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__INFORMALTABLE = eINSTANCE.getDocumentRoot_Informaltable();

		/**
		 * The meta object literal for the '<em><b>Itemizedlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ITEMIZEDLIST = eINSTANCE.getDocumentRoot_Itemizedlist();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__KEYWORD = eINSTANCE.getDocumentRoot_Keyword();

		/**
		 * The meta object literal for the '<em><b>Keywordset</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__KEYWORDSET = eINSTANCE.getDocumentRoot_Keywordset();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LINK = eINSTANCE.getDocumentRoot_Link();

		/**
		 * The meta object literal for the '<em><b>Listitem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LISTITEM = eINSTANCE.getDocumentRoot_Listitem();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__LITERAL = eINSTANCE.getDocumentRoot_Literal();

		/**
		 * The meta object literal for the '<em><b>Mediaobject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__MEDIAOBJECT = eINSTANCE.getDocumentRoot_Mediaobject();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__NOTE = eINSTANCE.getDocumentRoot_Note();

		/**
		 * The meta object literal for the '<em><b>Orderedlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ORDEREDLIST = eINSTANCE.getDocumentRoot_Orderedlist();

		/**
		 * The meta object literal for the '<em><b>Otheraddr</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__OTHERADDR = eINSTANCE.getDocumentRoot_Otheraddr();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PARA = eINSTANCE.getDocumentRoot_Para();

		/**
		 * The meta object literal for the '<em><b>Phrase</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PHRASE = eINSTANCE.getDocumentRoot_Phrase();

		/**
		 * The meta object literal for the '<em><b>Preface</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PREFACE = eINSTANCE.getDocumentRoot_Preface();

		/**
		 * The meta object literal for the '<em><b>Programlisting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PROGRAMLISTING = eINSTANCE.getDocumentRoot_Programlisting();

		/**
		 * The meta object literal for the '<em><b>Pubdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PUBDATE = eINSTANCE.getDocumentRoot_Pubdate();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__PUBLISHER = eINSTANCE.getDocumentRoot_Publisher();

		/**
		 * The meta object literal for the '<em><b>Publishername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__PUBLISHERNAME = eINSTANCE.getDocumentRoot_Publishername();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ROW = eINSTANCE.getDocumentRoot_Row();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__SECTION = eINSTANCE.getDocumentRoot_Section();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__STATE = eINSTANCE.getDocumentRoot_State();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUBTITLE = eINSTANCE.getDocumentRoot_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Superscript</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__SUPERSCRIPT = eINSTANCE.getDocumentRoot_Superscript();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TABLE = eINSTANCE.getDocumentRoot_Table();

		/**
		 * The meta object literal for the '<em><b>Tbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TBODY = eINSTANCE.getDocumentRoot_Tbody();

		/**
		 * The meta object literal for the '<em><b>Tgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TGROUP = eINSTANCE.getDocumentRoot_Tgroup();

		/**
		 * The meta object literal for the '<em><b>Thead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__THEAD = eINSTANCE.getDocumentRoot_Thead();

		/**
		 * The meta object literal for the '<em><b>Tip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TIP = eINSTANCE.getDocumentRoot_Tip();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TITLE = eINSTANCE.getDocumentRoot_Title();

		/**
		 * The meta object literal for the '<em><b>Ulink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__ULINK = eINSTANCE.getDocumentRoot_Ulink();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__WARNING = eINSTANCE.getDocumentRoot_Warning();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.EmphasisTypeImpl <em>Emphasis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.EmphasisTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getEmphasisType()
		 * @generated
		 */
		EClass EMPHASIS_TYPE = eINSTANCE.getEmphasisType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS_TYPE__MIXED = eINSTANCE.getEmphasisType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMPHASIS_TYPE__EMPHASIS = eINSTANCE.getEmphasisType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPHASIS_TYPE__ROLE = eINSTANCE.getEmphasisType_Role();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.EntryTypeImpl <em>Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.EntryTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getEntryType()
		 * @generated
		 */
		EClass ENTRY_TYPE = eINSTANCE.getEntryType();

		/**
		 * The meta object literal for the '<em><b>Programlisting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__PROGRAMLISTING = eINSTANCE.getEntryType_Programlisting();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__MIXED = eINSTANCE.getEntryType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Mediaobject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__MEDIAOBJECT = eINSTANCE.getEntryType_Mediaobject();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTRY_TYPE__PARA = eINSTANCE.getEntryType_Para();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__ALIGN = eINSTANCE.getEntryType_Align();

		/**
		 * The meta object literal for the '<em><b>Morerows</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__MOREROWS = eINSTANCE.getEntryType_Morerows();

		/**
		 * The meta object literal for the '<em><b>Nameend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__NAMEEND = eINSTANCE.getEntryType_Nameend();

		/**
		 * The meta object literal for the '<em><b>Namest</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__NAMEST = eINSTANCE.getEntryType_Namest();

		/**
		 * The meta object literal for the '<em><b>Valign</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTRY_TYPE__VALIGN = eINSTANCE.getEntryType_Valign();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.EnvarTypeImpl <em>Envar Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.EnvarTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getEnvarType()
		 * @generated
		 */
		EClass ENVAR_TYPE = eINSTANCE.getEnvarType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENVAR_TYPE__MIXED = eINSTANCE.getEnvarType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Replaceable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENVAR_TYPE__REPLACEABLE = eINSTANCE.getEnvarType_Replaceable();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FigureTypeImpl <em>Figure Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FigureTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFigureType()
		 * @generated
		 */
		EClass FIGURE_TYPE = eINSTANCE.getFigureType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE_TYPE__TITLE = eINSTANCE.getFigureType_Title();

		/**
		 * The meta object literal for the '<em><b>Mediaobject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FIGURE_TYPE__MEDIAOBJECT = eINSTANCE.getFigureType_Mediaobject();

		/**
		 * The meta object literal for the '<em><b>Float</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_TYPE__FLOAT = eINSTANCE.getFigureType_Float();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIGURE_TYPE__ID = eINSTANCE.getFigureType_Id();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FileNameTypeImpl <em>File Name Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FileNameTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFileNameType()
		 * @generated
		 */
		EClass FILE_NAME_TYPE = eINSTANCE.getFileNameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE_NAME_TYPE__MIXED = eINSTANCE.getFileNameType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Replaceable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FILE_NAME_TYPE__REPLACEABLE = eINSTANCE.getFileNameType_Replaceable();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FirstnameTypeImpl <em>Firstname Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FirstnameTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFirstnameType()
		 * @generated
		 */
		EClass FIRSTNAME_TYPE = eINSTANCE.getFirstnameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIRSTNAME_TYPE__MIXED = eINSTANCE.getFirstnameType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FootnoteTypeImpl <em>Footnote Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FootnoteTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFootnoteType()
		 * @generated
		 */
		EClass FOOTNOTE_TYPE = eINSTANCE.getFootnoteType();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOOTNOTE_TYPE__PARA = eINSTANCE.getFootnoteType_Para();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FOOTNOTE_TYPE__ID = eINSTANCE.getFootnoteType_Id();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ImagedataTypeImpl <em>Imagedata Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ImagedataTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getImagedataType()
		 * @generated
		 */
		EClass IMAGEDATA_TYPE = eINSTANCE.getImagedataType();

		/**
		 * The meta object literal for the '<em><b>Depth</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEDATA_TYPE__DEPTH = eINSTANCE.getImagedataType_Depth();

		/**
		 * The meta object literal for the '<em><b>Fileref</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEDATA_TYPE__FILEREF = eINSTANCE.getImagedataType_Fileref();

		/**
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEDATA_TYPE__WIDTH = eINSTANCE.getImagedataType_Width();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEDATA_TYPE__ALIGN = eINSTANCE.getImagedataType_Align();

		/**
		 * The meta object literal for the '<em><b>Scale</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMAGEDATA_TYPE__SCALE = eINSTANCE.getImagedataType_Scale();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ImageobjectTypeImpl <em>Imageobject Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ImageobjectTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getImageobjectType()
		 * @generated
		 */
		EClass IMAGEOBJECT_TYPE = eINSTANCE.getImageobjectType();

		/**
		 * The meta object literal for the '<em><b>Imagedata</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMAGEOBJECT_TYPE__IMAGEDATA = eINSTANCE.getImageobjectType_Imagedata();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ImportantTypeImpl <em>Important Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ImportantTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getImportantType()
		 * @generated
		 */
		EClass IMPORTANT_TYPE = eINSTANCE.getImportantType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTANT_TYPE__MIXED = eINSTANCE.getImportantType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTANT_TYPE__GROUP = eINSTANCE.getImportantType_Group();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTANT_TYPE__EMPHASIS = eINSTANCE.getImportantType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Ulink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IMPORTANT_TYPE__ULINK = eINSTANCE.getImportantType_Ulink();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.InformaltableTypeImpl <em>Informaltable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.InformaltableTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getInformaltableType()
		 * @generated
		 */
		EClass INFORMALTABLE_TYPE = eINSTANCE.getInformaltableType();

		/**
		 * The meta object literal for the '<em><b>Tgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFORMALTABLE_TYPE__TGROUP = eINSTANCE.getInformaltableType_Tgroup();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.InfoTypeImpl <em>Info Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.InfoTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getInfoType()
		 * @generated
		 */
		EClass INFO_TYPE = eINSTANCE.getInfoType();

		/**
		 * The meta object literal for the '<em><b>Pubdate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__PUBDATE = eINSTANCE.getInfoType_Pubdate();

		/**
		 * The meta object literal for the '<em><b>Author</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__AUTHOR = eINSTANCE.getInfoType_Author();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__TITLE = eINSTANCE.getInfoType_Title();

		/**
		 * The meta object literal for the '<em><b>Subtitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__SUBTITLE = eINSTANCE.getInfoType_Subtitle();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__GROUP = eINSTANCE.getInfoType_Group();

		/**
		 * The meta object literal for the '<em><b>Bibliomisc</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__BIBLIOMISC = eINSTANCE.getInfoType_Bibliomisc();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__DATE = eINSTANCE.getInfoType_Date();

		/**
		 * The meta object literal for the '<em><b>Keywordset</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__KEYWORDSET = eINSTANCE.getInfoType_Keywordset();

		/**
		 * The meta object literal for the '<em><b>Abstract</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__ABSTRACT = eINSTANCE.getInfoType_Abstract();

		/**
		 * The meta object literal for the '<em><b>Publisher</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__PUBLISHER = eINSTANCE.getInfoType_Publisher();

		/**
		 * The meta object literal for the '<em><b>Confgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__CONFGROUP = eINSTANCE.getInfoType_Confgroup();

		/**
		 * The meta object literal for the '<em><b>Revhistory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__REVHISTORY = eINSTANCE.getInfoType_Revhistory();

		/**
		 * The meta object literal for the '<em><b>Copyright</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__COPYRIGHT = eINSTANCE.getInfoType_Copyright();

		/**
		 * The meta object literal for the '<em><b>Legalnotice</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INFO_TYPE__LEGALNOTICE = eINSTANCE.getInfoType_Legalnotice();

		/**
		 * The meta object literal for the '<em><b>Productname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__PRODUCTNAME = eINSTANCE.getInfoType_Productname();

		/**
		 * The meta object literal for the '<em><b>Releaseinfo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INFO_TYPE__RELEASEINFO = eINSTANCE.getInfoType_Releaseinfo();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ItemizedlistTypeImpl <em>Itemizedlist Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ItemizedlistTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getItemizedlistType()
		 * @generated
		 */
		EClass ITEMIZEDLIST_TYPE = eINSTANCE.getItemizedlistType();

		/**
		 * The meta object literal for the '<em><b>Listitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ITEMIZEDLIST_TYPE__LISTITEM = eINSTANCE.getItemizedlistType_Listitem();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.KeywordsetTypeImpl <em>Keywordset Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.KeywordsetTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getKeywordsetType()
		 * @generated
		 */
		EClass KEYWORDSET_TYPE = eINSTANCE.getKeywordsetType();

		/**
		 * The meta object literal for the '<em><b>Keyword</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KEYWORDSET_TYPE__KEYWORD = eINSTANCE.getKeywordsetType_Keyword();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.LegalNoticeTypeImpl <em>Legal Notice Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.LegalNoticeTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getLegalNoticeType()
		 * @generated
		 */
		EClass LEGAL_NOTICE_TYPE = eINSTANCE.getLegalNoticeType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEGAL_NOTICE_TYPE__GROUP = eINSTANCE.getLegalNoticeType_Group();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_NOTICE_TYPE__TITLE = eINSTANCE.getLegalNoticeType_Title();

		/**
		 * The meta object literal for the '<em><b>Revhistory</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_NOTICE_TYPE__REVHISTORY = eINSTANCE.getLegalNoticeType_Revhistory();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_NOTICE_TYPE__PARA = eINSTANCE.getLegalNoticeType_Para();

		/**
		 * The meta object literal for the '<em><b>Orderedlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LEGAL_NOTICE_TYPE__ORDEREDLIST = eINSTANCE.getLegalNoticeType_Orderedlist();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.LinkTypeImpl <em>Link Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.LinkTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getLinkType()
		 * @generated
		 */
		EClass LINK_TYPE = eINSTANCE.getLinkType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__MIXED = eINSTANCE.getLinkType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__VALUE = eINSTANCE.getLinkType_Value();

		/**
		 * The meta object literal for the '<em><b>Linkend</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK_TYPE__LINKEND = eINSTANCE.getLinkType_Linkend();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ListitemTypeImpl <em>Listitem Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ListitemTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getListitemType()
		 * @generated
		 */
		EClass LISTITEM_TYPE = eINSTANCE.getListitemType();

		/**
		 * The meta object literal for the '<em><b>Itemizedlist</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTITEM_TYPE__ITEMIZEDLIST = eINSTANCE.getListitemType_Itemizedlist();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LISTITEM_TYPE__PARA = eINSTANCE.getListitemType_Para();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.LiteralTypeImpl <em>Literal Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.LiteralTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getLiteralType()
		 * @generated
		 */
		EClass LITERAL_TYPE = eINSTANCE.getLiteralType();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TYPE__VALUE = eINSTANCE.getLiteralType_Value();

		/**
		 * The meta object literal for the '<em><b>Moreinfo</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LITERAL_TYPE__MOREINFO = eINSTANCE.getLiteralType_Moreinfo();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.MediaobjectTypeImpl <em>Mediaobject Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.MediaobjectTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getMediaobjectType()
		 * @generated
		 */
		EClass MEDIAOBJECT_TYPE = eINSTANCE.getMediaobjectType();

		/**
		 * The meta object literal for the '<em><b>Imageobject</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEDIAOBJECT_TYPE__IMAGEOBJECT = eINSTANCE.getMediaobjectType_Imageobject();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.NoteTypeImpl <em>Note Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.NoteTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getNoteType()
		 * @generated
		 */
		EClass NOTE_TYPE = eINSTANCE.getNoteType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_TYPE__MIXED = eINSTANCE.getNoteType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NOTE_TYPE__GROUP = eINSTANCE.getNoteType_Group();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE_TYPE__LITERAL = eINSTANCE.getNoteType_Literal();

		/**
		 * The meta object literal for the '<em><b>Ulink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NOTE_TYPE__ULINK = eINSTANCE.getNoteType_Ulink();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.OptionTypeImpl <em>Option Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.OptionTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getOptionType()
		 * @generated
		 */
		EClass OPTION_TYPE = eINSTANCE.getOptionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OPTION_TYPE__MIXED = eINSTANCE.getOptionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Replaceable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OPTION_TYPE__REPLACEABLE = eINSTANCE.getOptionType_Replaceable();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.OrderedlistTypeImpl <em>Orderedlist Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.OrderedlistTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getOrderedlistType()
		 * @generated
		 */
		EClass ORDEREDLIST_TYPE = eINSTANCE.getOrderedlistType();

		/**
		 * The meta object literal for the '<em><b>Continuation</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDEREDLIST_TYPE__CONTINUATION = eINSTANCE.getOrderedlistType_Continuation();

		/**
		 * The meta object literal for the '<em><b>Inheritnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ORDEREDLIST_TYPE__INHERITNUM = eINSTANCE.getOrderedlistType_Inheritnum();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.OtheraddrTypeImpl <em>Otheraddr Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.OtheraddrTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getOtheraddrType()
		 * @generated
		 */
		EClass OTHERADDR_TYPE = eINSTANCE.getOtheraddrType();

		/**
		 * The meta object literal for the '<em><b>Ulink</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OTHERADDR_TYPE__ULINK = eINSTANCE.getOtheraddrType_Ulink();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ParaTypeImpl <em>Para Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ParaTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getParaType()
		 * @generated
		 */
		EClass PARA_TYPE = eINSTANCE.getParaType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__MIXED = eINSTANCE.getParaType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__GROUP = eINSTANCE.getParaType_Group();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA_TYPE__EMPHASIS = eINSTANCE.getParaType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Literal</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA_TYPE__LITERAL = eINSTANCE.getParaType_Literal();

		/**
		 * The meta object literal for the '<em><b>Ulink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA_TYPE__ULINK = eINSTANCE.getParaType_Ulink();

		/**
		 * The meta object literal for the '<em><b>Footnote</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA_TYPE__FOOTNOTE = eINSTANCE.getParaType_Footnote();

		/**
		 * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA_TYPE__LINK = eINSTANCE.getParaType_Link();

		/**
		 * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__ROLE = eINSTANCE.getParaType_Role();

		/**
		 * The meta object literal for the '<em><b>Itemizedlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA_TYPE__ITEMIZEDLIST = eINSTANCE.getParaType_Itemizedlist();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARA_TYPE__ID = eINSTANCE.getParaType_Id();

		/**
		 * The meta object literal for the '<em><b>Variablelist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARA_TYPE__VARIABLELIST = eINSTANCE.getParaType_Variablelist();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.PersonnameTypeImpl <em>Personname Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.PersonnameTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPersonnameType()
		 * @generated
		 */
		EClass PERSONNAME_TYPE = eINSTANCE.getPersonnameType();

		/**
		 * The meta object literal for the '<em><b>Firstname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNAME_TYPE__FIRSTNAME = eINSTANCE.getPersonnameType_Firstname();

		/**
		 * The meta object literal for the '<em><b>Surname</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSONNAME_TYPE__SURNAME = eINSTANCE.getPersonnameType_Surname();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.PhraseTypeImpl <em>Phrase Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.PhraseTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPhraseType()
		 * @generated
		 */
		EClass PHRASE_TYPE = eINSTANCE.getPhraseType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHRASE_TYPE__ID = eINSTANCE.getPhraseType_Id();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.PrefaceTypeImpl <em>Preface Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.PrefaceTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPrefaceType()
		 * @generated
		 */
		EClass PREFACE_TYPE = eINSTANCE.getPrefaceType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFACE_TYPE__TITLE = eINSTANCE.getPrefaceType_Title();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFACE_TYPE__PARA = eINSTANCE.getPrefaceType_Para();

		/**
		 * The meta object literal for the '<em><b>Important</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFACE_TYPE__IMPORTANT = eINSTANCE.getPrefaceType_Important();

		/**
		 * The meta object literal for the '<em><b>Tip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PREFACE_TYPE__TIP = eINSTANCE.getPrefaceType_Tip();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ProgramlistingTypeImpl <em>Programlisting Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ProgramlistingTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getProgramlistingType()
		 * @generated
		 */
		EClass PROGRAMLISTING_TYPE = eINSTANCE.getProgramlistingType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMLISTING_TYPE__MIXED = eINSTANCE.getProgramlistingType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMLISTING_TYPE__GROUP = eINSTANCE.getProgramlistingType_Group();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMLISTING_TYPE__EMPHASIS = eINSTANCE.getProgramlistingType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Phrase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROGRAMLISTING_TYPE__PHRASE = eINSTANCE.getProgramlistingType_Phrase();

		/**
		 * The meta object literal for the '<em><b>Superscript</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMLISTING_TYPE__SUPERSCRIPT = eINSTANCE.getProgramlistingType_Superscript();

		/**
		 * The meta object literal for the '<em><b>Format</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMLISTING_TYPE__FORMAT = eINSTANCE.getProgramlistingType_Format();

		/**
		 * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMLISTING_TYPE__LANGUAGE = eINSTANCE.getProgramlistingType_Language();

		/**
		 * The meta object literal for the '<em><b>Linenumbering</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROGRAMLISTING_TYPE__LINENUMBERING = eINSTANCE.getProgramlistingType_Linenumbering();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.PublisherTypeImpl <em>Publisher Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.PublisherTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getPublisherType()
		 * @generated
		 */
		EClass PUBLISHER_TYPE = eINSTANCE.getPublisherType();

		/**
		 * The meta object literal for the '<em><b>Publishername</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PUBLISHER_TYPE__PUBLISHERNAME = eINSTANCE.getPublisherType_Publishername();

		/**
		 * The meta object literal for the '<em><b>Address</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PUBLISHER_TYPE__ADDRESS = eINSTANCE.getPublisherType_Address();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RefEntryTypeImpl <em>Ref Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RefEntryTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefEntryType()
		 * @generated
		 */
		EClass REF_ENTRY_TYPE = eINSTANCE.getRefEntryType();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_ENTRY_TYPE__INFO = eINSTANCE.getRefEntryType_Info();

		/**
		 * The meta object literal for the '<em><b>Refmeta</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_ENTRY_TYPE__REFMETA = eINSTANCE.getRefEntryType_Refmeta();

		/**
		 * The meta object literal for the '<em><b>Refnamediv</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_ENTRY_TYPE__REFNAMEDIV = eINSTANCE.getRefEntryType_Refnamediv();

		/**
		 * The meta object literal for the '<em><b>Refsynopsisdiv</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_ENTRY_TYPE__REFSYNOPSISDIV = eINSTANCE.getRefEntryType_Refsynopsisdiv();

		/**
		 * The meta object literal for the '<em><b>Refsect1</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_ENTRY_TYPE__REFSECT1 = eINSTANCE.getRefEntryType_Refsect1();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_ENTRY_TYPE__VERSION = eINSTANCE.getRefEntryType_Version();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RefEntryTitleTypeImpl <em>Ref Entry Title Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RefEntryTitleTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefEntryTitleType()
		 * @generated
		 */
		EClass REF_ENTRY_TITLE_TYPE = eINSTANCE.getRefEntryTitleType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_ENTRY_TITLE_TYPE__MIXED = eINSTANCE.getRefEntryTitleType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ReferenceTypeImpl <em>Reference Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ReferenceTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getReferenceType()
		 * @generated
		 */
		EClass REFERENCE_TYPE = eINSTANCE.getReferenceType();

		/**
		 * The meta object literal for the '<em><b>Info</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__INFO = eINSTANCE.getReferenceType_Info();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__TITLE = eINSTANCE.getReferenceType_Title();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REFERENCE_TYPE__VERSION = eINSTANCE.getReferenceType_Version();

		/**
		 * The meta object literal for the '<em><b>Refentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE_TYPE__REFENTRY = eINSTANCE.getReferenceType_Refentry();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RefMetaTypeImpl <em>Ref Meta Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RefMetaTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefMetaType()
		 * @generated
		 */
		EClass REF_META_TYPE = eINSTANCE.getRefMetaType();

		/**
		 * The meta object literal for the '<em><b>Refentrytitle</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_META_TYPE__REFENTRYTITLE = eINSTANCE.getRefMetaType_Refentrytitle();

		/**
		 * The meta object literal for the '<em><b>Manvolnum</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_META_TYPE__MANVOLNUM = eINSTANCE.getRefMetaType_Manvolnum();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RefNameDivTypeImpl <em>Ref Name Div Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RefNameDivTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefNameDivType()
		 * @generated
		 */
		EClass REF_NAME_DIV_TYPE = eINSTANCE.getRefNameDivType();

		/**
		 * The meta object literal for the '<em><b>Refname</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_NAME_DIV_TYPE__REFNAME = eINSTANCE.getRefNameDivType_Refname();

		/**
		 * The meta object literal for the '<em><b>Refpurpose</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_NAME_DIV_TYPE__REFPURPOSE = eINSTANCE.getRefNameDivType_Refpurpose();

		/**
		 * The meta object literal for the '<em><b>Refclass</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_NAME_DIV_TYPE__REFCLASS = eINSTANCE.getRefNameDivType_Refclass();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RefSect1TypeImpl <em>Ref Sect1 Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RefSect1TypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefSect1Type()
		 * @generated
		 */
		EClass REF_SECT1_TYPE = eINSTANCE.getRefSect1Type();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_SECT1_TYPE__GROUP = eINSTANCE.getRefSect1Type_Group();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_SECT1_TYPE__TITLE = eINSTANCE.getRefSect1Type_Title();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_SECT1_TYPE__PARA = eINSTANCE.getRefSect1Type_Para();

		/**
		 * The meta object literal for the '<em><b>Variablelist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_SECT1_TYPE__VARIABLELIST = eINSTANCE.getRefSect1Type_Variablelist();

		/**
		 * The meta object literal for the '<em><b>Segmentedlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_SECT1_TYPE__SEGMENTEDLIST = eINSTANCE.getRefSect1Type_Segmentedlist();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REF_SECT1_TYPE__ID = eINSTANCE.getRefSect1Type_Id();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RefSynopsisDivTypeImpl <em>Ref Synopsis Div Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RefSynopsisDivTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRefSynopsisDivType()
		 * @generated
		 */
		EClass REF_SYNOPSIS_DIV_TYPE = eINSTANCE.getRefSynopsisDivType();

		/**
		 * The meta object literal for the '<em><b>Cmdsynopsis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS = eINSTANCE.getRefSynopsisDivType_Cmdsynopsis();

		/**
		 * The meta object literal for the '<em><b>Funcsynopsis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS = eINSTANCE.getRefSynopsisDivType_Funcsynopsis();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RevdescriptionTypeImpl <em>Revdescription Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RevdescriptionTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevdescriptionType()
		 * @generated
		 */
		EClass REVDESCRIPTION_TYPE = eINSTANCE.getRevdescriptionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVDESCRIPTION_TYPE__MIXED = eINSTANCE.getRevdescriptionType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVDESCRIPTION_TYPE__PARA = eINSTANCE.getRevdescriptionType_Para();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RevhistoryTypeImpl <em>Revhistory Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RevhistoryTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevhistoryType()
		 * @generated
		 */
		EClass REVHISTORY_TYPE = eINSTANCE.getRevhistoryType();

		/**
		 * The meta object literal for the '<em><b>Revision</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVHISTORY_TYPE__REVISION = eINSTANCE.getRevhistoryType_Revision();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RevisionTypeImpl <em>Revision Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RevisionTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevisionType()
		 * @generated
		 */
		EClass REVISION_TYPE = eINSTANCE.getRevisionType();

		/**
		 * The meta object literal for the '<em><b>Revnumber</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_TYPE__REVNUMBER = eINSTANCE.getRevisionType_Revnumber();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_TYPE__DATE = eINSTANCE.getRevisionType_Date();

		/**
		 * The meta object literal for the '<em><b>Revdescription</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_TYPE__REVDESCRIPTION = eINSTANCE.getRevisionType_Revdescription();

		/**
		 * The meta object literal for the '<em><b>Authorinitials</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVISION_TYPE__AUTHORINITIALS = eINSTANCE.getRevisionType_Authorinitials();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RevnumberTypeImpl <em>Revnumber Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RevnumberTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRevnumberType()
		 * @generated
		 */
		EClass REVNUMBER_TYPE = eINSTANCE.getRevnumberType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REVNUMBER_TYPE__MIXED = eINSTANCE.getRevnumberType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Ulink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REVNUMBER_TYPE__ULINK = eINSTANCE.getRevnumberType_Ulink();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.RowTypeImpl <em>Row Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.RowTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getRowType()
		 * @generated
		 */
		EClass ROW_TYPE = eINSTANCE.getRowType();

		/**
		 * The meta object literal for the '<em><b>Entry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROW_TYPE__ENTRY = eINSTANCE.getRowType_Entry();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.SectionTypeImpl <em>Section Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.SectionTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSectionType()
		 * @generated
		 */
		EClass SECTION_TYPE = eINSTANCE.getSectionType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_TYPE__GROUP = eINSTANCE.getSectionType_Group();

		/**
		 * The meta object literal for the '<em><b>Itemizedlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__ITEMIZEDLIST = eINSTANCE.getSectionType_Itemizedlist();

		/**
		 * The meta object literal for the '<em><b>Mediaobject</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__MEDIAOBJECT = eINSTANCE.getSectionType_Mediaobject();

		/**
		 * The meta object literal for the '<em><b>Note</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__NOTE = eINSTANCE.getSectionType_Note();

		/**
		 * The meta object literal for the '<em><b>Para</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__PARA = eINSTANCE.getSectionType_Para();

		/**
		 * The meta object literal for the '<em><b>Programlisting</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__PROGRAMLISTING = eINSTANCE.getSectionType_Programlisting();

		/**
		 * The meta object literal for the '<em><b>Section</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__SECTION = eINSTANCE.getSectionType_Section();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__TITLE = eINSTANCE.getSectionType_Title();

		/**
		 * The meta object literal for the '<em><b>Figure</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__FIGURE = eINSTANCE.getSectionType_Figure();

		/**
		 * The meta object literal for the '<em><b>Informaltable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__INFORMALTABLE = eINSTANCE.getSectionType_Informaltable();

		/**
		 * The meta object literal for the '<em><b>Orderedlist</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__ORDEREDLIST = eINSTANCE.getSectionType_Orderedlist();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__TABLE = eINSTANCE.getSectionType_Table();

		/**
		 * The meta object literal for the '<em><b>Warning</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_TYPE__WARNING = eINSTANCE.getSectionType_Warning();

		/**
		 * The meta object literal for the '<em><b>Tip</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__TIP = eINSTANCE.getSectionType_Tip();

		/**
		 * The meta object literal for the '<em><b>Caution</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_TYPE__CAUTION = eINSTANCE.getSectionType_Caution();

		/**
		 * The meta object literal for the '<em><b>Example</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__EXAMPLE = eINSTANCE.getSectionType_Example();

		/**
		 * The meta object literal for the '<em><b>Cmdsynopsis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__CMDSYNOPSIS = eINSTANCE.getSectionType_Cmdsynopsis();

		/**
		 * The meta object literal for the '<em><b>Annotations</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SECTION_TYPE__ANNOTATIONS = eINSTANCE.getSectionType_Annotations();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.SegListItemTypeImpl <em>Seg List Item Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.SegListItemTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSegListItemType()
		 * @generated
		 */
		EClass SEG_LIST_ITEM_TYPE = eINSTANCE.getSegListItemType();

		/**
		 * The meta object literal for the '<em><b>Seg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEG_LIST_ITEM_TYPE__SEG = eINSTANCE.getSegListItemType_Seg();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.SegmentedListTypeImpl <em>Segmented List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.SegmentedListTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSegmentedListType()
		 * @generated
		 */
		EClass SEGMENTED_LIST_TYPE = eINSTANCE.getSegmentedListType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENTED_LIST_TYPE__GROUP = eINSTANCE.getSegmentedListType_Group();

		/**
		 * The meta object literal for the '<em><b>Segtitle</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEGMENTED_LIST_TYPE__SEGTITLE = eINSTANCE.getSegmentedListType_Segtitle();

		/**
		 * The meta object literal for the '<em><b>Seglistitem</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SEGMENTED_LIST_TYPE__SEGLISTITEM = eINSTANCE.getSegmentedListType_Seglistitem();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.SegTypeImpl <em>Seg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.SegTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSegType()
		 * @generated
		 */
		EClass SEG_TYPE = eINSTANCE.getSegType();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEG_TYPE__GROUP = eINSTANCE.getSegType_Group();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEG_TYPE__MIXED = eINSTANCE.getSegType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Errorcode</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEG_TYPE__ERRORCODE = eINSTANCE.getSegType_Errorcode();

		/**
		 * The meta object literal for the '<em><b>Errortext</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SEG_TYPE__ERRORTEXT = eINSTANCE.getSegType_Errortext();

		/**
		 * The meta object literal for the '<em><b>Funcsynopsis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SECTION_TYPE__FUNCSYNOPSIS = eINSTANCE.getSectionType_Funcsynopsis();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.SubtitleTypeImpl <em>Subtitle Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.SubtitleTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSubtitleType()
		 * @generated
		 */
		EClass SUBTITLE_TYPE = eINSTANCE.getSubtitleType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE_TYPE__MIXED = eINSTANCE.getSubtitleType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SUBTITLE_TYPE__GROUP = eINSTANCE.getSubtitleType_Group();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE_TYPE__EMPHASIS = eINSTANCE.getSubtitleType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Phrase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBTITLE_TYPE__PHRASE = eINSTANCE.getSubtitleType_Phrase();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.SurnameTypeImpl <em>Surname Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.SurnameTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getSurnameType()
		 * @generated
		 */
		EClass SURNAME_TYPE = eINSTANCE.getSurnameType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SURNAME_TYPE__MIXED = eINSTANCE.getSurnameType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.TableTypeImpl <em>Table Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.TableTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTableType()
		 * @generated
		 */
		EClass TABLE_TYPE = eINSTANCE.getTableType();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TITLE = eINSTANCE.getTableType_Title();

		/**
		 * The meta object literal for the '<em><b>Tgroup</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_TYPE__TGROUP = eINSTANCE.getTableType_Tgroup();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_TYPE__ID = eINSTANCE.getTableType_Id();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.TermTypeImpl <em>Term Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.TermTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTermType()
		 * @generated
		 */
		EClass TERM_TYPE = eINSTANCE.getTermType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TERM_TYPE__MIXED = eINSTANCE.getTermType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_TYPE__EMPHASIS = eINSTANCE.getTermType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_TYPE__OPTION = eINSTANCE.getTermType_Option();

		/**
		 * The meta object literal for the '<em><b>Filename</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_TYPE__FILENAME = eINSTANCE.getTermType_Filename();

		/**
		 * The meta object literal for the '<em><b>Envar</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TERM_TYPE__ENVAR = eINSTANCE.getTermType_Envar();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.TbodyTypeImpl <em>Tbody Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.TbodyTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTbodyType()
		 * @generated
		 */
		EClass TBODY_TYPE = eINSTANCE.getTbodyType();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TBODY_TYPE__ROW = eINSTANCE.getTbodyType_Row();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.TgroupTypeImpl <em>Tgroup Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.TgroupTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTgroupType()
		 * @generated
		 */
		EClass TGROUP_TYPE = eINSTANCE.getTgroupType();

		/**
		 * The meta object literal for the '<em><b>Colspec</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__COLSPEC = eINSTANCE.getTgroupType_Colspec();

		/**
		 * The meta object literal for the '<em><b>Thead</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__THEAD = eINSTANCE.getTgroupType_Thead();

		/**
		 * The meta object literal for the '<em><b>Tbody</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TGROUP_TYPE__TBODY = eINSTANCE.getTgroupType_Tbody();

		/**
		 * The meta object literal for the '<em><b>Cols</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TYPE__COLS = eINSTANCE.getTgroupType_Cols();

		/**
		 * The meta object literal for the '<em><b>Colseq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TYPE__COLSEQ = eINSTANCE.getTgroupType_Colseq();

		/**
		 * The meta object literal for the '<em><b>Rowseq</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TYPE__ROWSEQ = eINSTANCE.getTgroupType_Rowseq();

		/**
		 * The meta object literal for the '<em><b>Align</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TGROUP_TYPE__ALIGN = eINSTANCE.getTgroupType_Align();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.TheadTypeImpl <em>Thead Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.TheadTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTheadType()
		 * @generated
		 */
		EClass THEAD_TYPE = eINSTANCE.getTheadType();

		/**
		 * The meta object literal for the '<em><b>Row</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference THEAD_TYPE__ROW = eINSTANCE.getTheadType_Row();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.TipTypeImpl <em>Tip Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.TipTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTipType()
		 * @generated
		 */
		EClass TIP_TYPE = eINSTANCE.getTipType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIP_TYPE__MIXED = eINSTANCE.getTipType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Ulink</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIP_TYPE__ULINK = eINSTANCE.getTipType_Ulink();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.TitleTypeImpl <em>Title Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.TitleTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getTitleType()
		 * @generated
		 */
		EClass TITLE_TYPE = eINSTANCE.getTitleType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__MIXED = eINSTANCE.getTitleType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Group</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TITLE_TYPE__GROUP = eINSTANCE.getTitleType_Group();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE_TYPE__EMPHASIS = eINSTANCE.getTitleType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Phrase</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TITLE_TYPE__PHRASE = eINSTANCE.getTitleType_Phrase();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.UlinkTypeImpl <em>Ulink Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.UlinkTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getUlinkType()
		 * @generated
		 */
		EClass ULINK_TYPE = eINSTANCE.getUlinkType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULINK_TYPE__MIXED = eINSTANCE.getUlinkType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Emphasis</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ULINK_TYPE__EMPHASIS = eINSTANCE.getUlinkType_Emphasis();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULINK_TYPE__TYPE = eINSTANCE.getUlinkType_Type();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ULINK_TYPE__URL = eINSTANCE.getUlinkType_Url();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.VariableListTypeImpl <em>Variable List Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.VariableListTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getVariableListType()
		 * @generated
		 */
		EClass VARIABLE_LIST_TYPE = eINSTANCE.getVariableListType();

		/**
		 * The meta object literal for the '<em><b>Varlistentry</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VARIABLE_LIST_TYPE__VARLISTENTRY = eINSTANCE.getVariableListType_Varlistentry();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.VarListEntryTypeImpl <em>Var List Entry Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.VarListEntryTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getVarListEntryType()
		 * @generated
		 */
		EClass VAR_LIST_ENTRY_TYPE = eINSTANCE.getVarListEntryType();

		/**
		 * The meta object literal for the '<em><b>Spacing</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_LIST_ENTRY_TYPE__SPACING = eINSTANCE.getVarListEntryType_Spacing();

		/**
		 * The meta object literal for the '<em><b>Termlength</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VAR_LIST_ENTRY_TYPE__TERMLENGTH = eINSTANCE.getVarListEntryType_Termlength();

		/**
		 * The meta object literal for the '<em><b>Term</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_LIST_ENTRY_TYPE__TERM = eINSTANCE.getVarListEntryType_Term();

		/**
		 * The meta object literal for the '<em><b>Listitem</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VAR_LIST_ENTRY_TYPE__LISTITEM = eINSTANCE.getVarListEntryType_Listitem();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FuncsynopsisTypeImpl <em>Funcsynopsis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FuncsynopsisTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFuncsynopsisType()
		 * @generated
		 */
		EClass FUNCSYNOPSIS_TYPE = eINSTANCE.getFuncsynopsisType();

		/**
		 * The meta object literal for the '<em><b>Funcprototype</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE = eINSTANCE.getFuncsynopsisType_Funcprototype();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FuncprototypeTypeImpl <em>Funcprototype Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FuncprototypeTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFuncprototypeType()
		 * @generated
		 */
		EClass FUNCPROTOTYPE_TYPE = eINSTANCE.getFuncprototypeType();

		/**
		 * The meta object literal for the '<em><b>Funcdef</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCPROTOTYPE_TYPE__FUNCDEF = eINSTANCE.getFuncprototypeType_Funcdef();

		/**
		 * The meta object literal for the '<em><b>Paramdef</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCPROTOTYPE_TYPE__PARAMDEF = eINSTANCE.getFuncprototypeType_Paramdef();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ParamdefTypeImpl <em>Paramdef Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ParamdefTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getParamdefType()
		 * @generated
		 */
		EClass PARAMDEF_TYPE = eINSTANCE.getParamdefType();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PARAMDEF_TYPE__PARAMETER = eINSTANCE.getParamdefType_Parameter();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMDEF_TYPE__MIXED = eINSTANCE.getParamdefType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FuncdefTypeImpl <em>Funcdef Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FuncdefTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFuncdefType()
		 * @generated
		 */
		EClass FUNCDEF_TYPE = eINSTANCE.getFuncdefType();

		/**
		 * The meta object literal for the '<em><b>Function</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCDEF_TYPE__FUNCTION = eINSTANCE.getFuncdefType_Function();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCDEF_TYPE__MIXED = eINSTANCE.getFuncdefType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ParameterTypeImpl <em>Parameter Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ParameterTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getParameterType()
		 * @generated
		 */
		EClass PARAMETER_TYPE = eINSTANCE.getParameterType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER_TYPE__MIXED = eINSTANCE.getParameterType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.FunctionTypeImpl <em>Function Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.FunctionTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getFunctionType()
		 * @generated
		 */
		EClass FUNCTION_TYPE = eINSTANCE.getFunctionType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_TYPE__MIXED = eINSTANCE.getFunctionType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ExampleTypeImpl <em>Example Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ExampleTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getExampleType()
		 * @generated
		 */
		EClass EXAMPLE_TYPE = eINSTANCE.getExampleType();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EXAMPLE_TYPE__ID = eINSTANCE.getExampleType_Id();

		/**
		 * The meta object literal for the '<em><b>Title</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TYPE__TITLE = eINSTANCE.getExampleType_Title();

		/**
		 * The meta object literal for the '<em><b>Programlisting</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EXAMPLE_TYPE__PROGRAMLISTING = eINSTANCE.getExampleType_Programlisting();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.CmdsynopsisTypeImpl <em>Cmdsynopsis Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.CmdsynopsisTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getCmdsynopsisType()
		 * @generated
		 */
		EClass CMDSYNOPSIS_TYPE = eINSTANCE.getCmdsynopsisType();

		/**
		 * The meta object literal for the '<em><b>Command</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMDSYNOPSIS_TYPE__COMMAND = eINSTANCE.getCmdsynopsisType_Command();

		/**
		 * The meta object literal for the '<em><b>Arg</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CMDSYNOPSIS_TYPE__ARG = eINSTANCE.getCmdsynopsisType_Arg();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.CommandTypeImpl <em>Command Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.CommandTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getCommandType()
		 * @generated
		 */
		EClass COMMAND_TYPE = eINSTANCE.getCommandType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMAND_TYPE__MIXED = eINSTANCE.getCommandType_Mixed();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ArgTypeImpl <em>Arg Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ArgTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getArgType()
		 * @generated
		 */
		EClass ARG_TYPE = eINSTANCE.getArgType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARG_TYPE__MIXED = eINSTANCE.getArgType_Mixed();

		/**
		 * The meta object literal for the '<em><b>Option</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARG_TYPE__OPTION = eINSTANCE.getArgType_Option();

		/**
		 * The meta object literal for the '<em><b>Replaceable</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ARG_TYPE__REPLACEABLE = eINSTANCE.getArgType_Replaceable();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARG_TYPE__CHOICE = eINSTANCE.getArgType_Choice();

		/**
		 * The meta object literal for the '<em><b>Rep</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ARG_TYPE__REP = eINSTANCE.getArgType_Rep();

		/**
		 * The meta object literal for the '{@link org.kermeta.Docbook.impl.ReplaceableTypeImpl <em>Replaceable Type</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.kermeta.Docbook.impl.ReplaceableTypeImpl
		 * @see org.kermeta.Docbook.impl.DocbookPackageImpl#getReplaceableType()
		 * @generated
		 */
		EClass REPLACEABLE_TYPE = eINSTANCE.getReplaceableType();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REPLACEABLE_TYPE__MIXED = eINSTANCE.getReplaceableType_Mixed();

	}

} //DocbookPackage
