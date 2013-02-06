/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.kermeta.Docbook.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocbookFactoryImpl extends EFactoryImpl implements DocbookFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DocbookFactory init() {
		try {
			DocbookFactory theDocbookFactory = (DocbookFactory)EPackage.Registry.INSTANCE.getEFactory("http://docbook.org/ns/docbook"); 
			if (theDocbookFactory != null) {
				return theDocbookFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new DocbookFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case DocbookPackage.ABSTRACT_TYPE: return createAbstractType();
			case DocbookPackage.ADDRESS_TYPE: return createAddressType();
			case DocbookPackage.ARG_TYPE: return createArgType();
			case DocbookPackage.AUTHORINITIALS_TYPE: return createAuthorinitialsType();
			case DocbookPackage.AUTHOR_TYPE: return createAuthorType();
			case DocbookPackage.BOOK_TYPE: return createBookType();
			case DocbookPackage.CHAPTER_TYPE: return createChapterType();
			case DocbookPackage.COLSPEC_TYPE: return createColspecType();
			case DocbookPackage.CMDSYNOPSIS_TYPE: return createCmdsynopsisType();
			case DocbookPackage.COMMAND_TYPE: return createCommandType();
			case DocbookPackage.CONFGROUP_TYPE: return createConfgroupType();
			case DocbookPackage.COPYRIGHT_TYPE: return createCopyrightType();
			case DocbookPackage.DATE_TYPE: return createDateType();
			case DocbookPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case DocbookPackage.EMPHASIS_TYPE: return createEmphasisType();
			case DocbookPackage.ENTRY_TYPE: return createEntryType();
			case DocbookPackage.ENVAR_TYPE: return createEnvarType();
			case DocbookPackage.EXAMPLE_TYPE: return createExampleType();
			case DocbookPackage.FIGURE_TYPE: return createFigureType();
			case DocbookPackage.FILE_NAME_TYPE: return createFileNameType();
			case DocbookPackage.FIRSTNAME_TYPE: return createFirstnameType();
			case DocbookPackage.FOOTNOTE_TYPE: return createFootnoteType();
			case DocbookPackage.FUNCDEF_TYPE: return createFuncdefType();
			case DocbookPackage.FUNCPROTOTYPE_TYPE: return createFuncprototypeType();
			case DocbookPackage.FUNCSYNOPSIS_TYPE: return createFuncsynopsisType();
			case DocbookPackage.FUNCTION_TYPE: return createFunctionType();
			case DocbookPackage.IMAGEDATA_TYPE: return createImagedataType();
			case DocbookPackage.IMAGEOBJECT_TYPE: return createImageobjectType();
			case DocbookPackage.IMPORTANT_TYPE: return createImportantType();
			case DocbookPackage.INFORMALTABLE_TYPE: return createInformaltableType();
			case DocbookPackage.INFO_TYPE: return createInfoType();
			case DocbookPackage.ITEMIZEDLIST_TYPE: return createItemizedlistType();
			case DocbookPackage.KEYWORDSET_TYPE: return createKeywordsetType();
			case DocbookPackage.LEGAL_NOTICE_TYPE: return createLegalNoticeType();
			case DocbookPackage.LINK_TYPE: return createLinkType();
			case DocbookPackage.LISTITEM_TYPE: return createListitemType();
			case DocbookPackage.LITERAL_TYPE: return createLiteralType();
			case DocbookPackage.MEDIAOBJECT_TYPE: return createMediaobjectType();
			case DocbookPackage.NOTE_TYPE: return createNoteType();
			case DocbookPackage.OPTION_TYPE: return createOptionType();
			case DocbookPackage.ORDEREDLIST_TYPE: return createOrderedlistType();
			case DocbookPackage.OTHERADDR_TYPE: return createOtheraddrType();
			case DocbookPackage.PARAMETER_TYPE: return createParameterType();
			case DocbookPackage.PARAMDEF_TYPE: return createParamdefType();
			case DocbookPackage.PARA_TYPE: return createParaType();
			case DocbookPackage.PERSONNAME_TYPE: return createPersonnameType();
			case DocbookPackage.PHRASE_TYPE: return createPhraseType();
			case DocbookPackage.PREFACE_TYPE: return createPrefaceType();
			case DocbookPackage.PROGRAMLISTING_TYPE: return createProgramlistingType();
			case DocbookPackage.PUBLISHER_TYPE: return createPublisherType();
			case DocbookPackage.REF_ENTRY_TYPE: return createRefEntryType();
			case DocbookPackage.REF_ENTRY_TITLE_TYPE: return createRefEntryTitleType();
			case DocbookPackage.REFERENCE_TYPE: return createReferenceType();
			case DocbookPackage.REF_META_TYPE: return createRefMetaType();
			case DocbookPackage.REF_NAME_DIV_TYPE: return createRefNameDivType();
			case DocbookPackage.REF_SECT1_TYPE: return createRefSect1Type();
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE: return createRefSynopsisDivType();
			case DocbookPackage.REPLACEABLE_TYPE: return createReplaceableType();
			case DocbookPackage.REVDESCRIPTION_TYPE: return createRevdescriptionType();
			case DocbookPackage.REVHISTORY_TYPE: return createRevhistoryType();
			case DocbookPackage.REVISION_TYPE: return createRevisionType();
			case DocbookPackage.REVNUMBER_TYPE: return createRevnumberType();
			case DocbookPackage.ROW_TYPE: return createRowType();
			case DocbookPackage.SECTION_TYPE: return createSectionType();
			case DocbookPackage.SEG_LIST_ITEM_TYPE: return createSegListItemType();
			case DocbookPackage.SEGMENTED_LIST_TYPE: return createSegmentedListType();
			case DocbookPackage.SEG_TYPE: return createSegType();
			case DocbookPackage.SUBTITLE_TYPE: return createSubtitleType();
			case DocbookPackage.SURNAME_TYPE: return createSurnameType();
			case DocbookPackage.TABLE_TYPE: return createTableType();
			case DocbookPackage.TERM_TYPE: return createTermType();
			case DocbookPackage.TBODY_TYPE: return createTbodyType();
			case DocbookPackage.TGROUP_TYPE: return createTgroupType();
			case DocbookPackage.THEAD_TYPE: return createTheadType();
			case DocbookPackage.TIP_TYPE: return createTipType();
			case DocbookPackage.TITLE_TYPE: return createTitleType();
			case DocbookPackage.ULINK_TYPE: return createUlinkType();
			case DocbookPackage.VARIABLE_LIST_TYPE: return createVariableListType();
			case DocbookPackage.VAR_LIST_ENTRY_TYPE: return createVarListEntryType();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType createAbstractType() {
		AbstractTypeImpl abstractType = new AbstractTypeImpl();
		return abstractType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType createAddressType() {
		AddressTypeImpl addressType = new AddressTypeImpl();
		return addressType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorinitialsType createAuthorinitialsType() {
		AuthorinitialsTypeImpl authorinitialsType = new AuthorinitialsTypeImpl();
		return authorinitialsType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorType createAuthorType() {
		AuthorTypeImpl authorType = new AuthorTypeImpl();
		return authorType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BookType createBookType() {
		BookTypeImpl bookType = new BookTypeImpl();
		return bookType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChapterType createChapterType() {
		ChapterTypeImpl chapterType = new ChapterTypeImpl();
		return chapterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ColspecType createColspecType() {
		ColspecTypeImpl colspecType = new ColspecTypeImpl();
		return colspecType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfgroupType createConfgroupType() {
		ConfgroupTypeImpl confgroupType = new ConfgroupTypeImpl();
		return confgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyrightType createCopyrightType() {
		CopyrightTypeImpl copyrightType = new CopyrightTypeImpl();
		return copyrightType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType createDateType() {
		DateTypeImpl dateType = new DateTypeImpl();
		return dateType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmphasisType createEmphasisType() {
		EmphasisTypeImpl emphasisType = new EmphasisTypeImpl();
		return emphasisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntryType createEntryType() {
		EntryTypeImpl entryType = new EntryTypeImpl();
		return entryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvarType createEnvarType() {
		EnvarTypeImpl envarType = new EnvarTypeImpl();
		return envarType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FigureType createFigureType() {
		FigureTypeImpl figureType = new FigureTypeImpl();
		return figureType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileNameType createFileNameType() {
		FileNameTypeImpl fileNameType = new FileNameTypeImpl();
		return fileNameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstnameType createFirstnameType() {
		FirstnameTypeImpl firstnameType = new FirstnameTypeImpl();
		return firstnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FootnoteType createFootnoteType() {
		FootnoteTypeImpl footnoteType = new FootnoteTypeImpl();
		return footnoteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImagedataType createImagedataType() {
		ImagedataTypeImpl imagedataType = new ImagedataTypeImpl();
		return imagedataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImageobjectType createImageobjectType() {
		ImageobjectTypeImpl imageobjectType = new ImageobjectTypeImpl();
		return imageobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ImportantType createImportantType() {
		ImportantTypeImpl importantType = new ImportantTypeImpl();
		return importantType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InformaltableType createInformaltableType() {
		InformaltableTypeImpl informaltableType = new InformaltableTypeImpl();
		return informaltableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoType createInfoType() {
		InfoTypeImpl infoType = new InfoTypeImpl();
		return infoType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemizedlistType createItemizedlistType() {
		ItemizedlistTypeImpl itemizedlistType = new ItemizedlistTypeImpl();
		return itemizedlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public KeywordsetType createKeywordsetType() {
		KeywordsetTypeImpl keywordsetType = new KeywordsetTypeImpl();
		return keywordsetType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalNoticeType createLegalNoticeType() {
		LegalNoticeTypeImpl legalNoticeType = new LegalNoticeTypeImpl();
		return legalNoticeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LinkType createLinkType() {
		LinkTypeImpl linkType = new LinkTypeImpl();
		return linkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListitemType createListitemType() {
		ListitemTypeImpl listitemType = new ListitemTypeImpl();
		return listitemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LiteralType createLiteralType() {
		LiteralTypeImpl literalType = new LiteralTypeImpl();
		return literalType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MediaobjectType createMediaobjectType() {
		MediaobjectTypeImpl mediaobjectType = new MediaobjectTypeImpl();
		return mediaobjectType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoteType createNoteType() {
		NoteTypeImpl noteType = new NoteTypeImpl();
		return noteType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OptionType createOptionType() {
		OptionTypeImpl optionType = new OptionTypeImpl();
		return optionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OrderedlistType createOrderedlistType() {
		OrderedlistTypeImpl orderedlistType = new OrderedlistTypeImpl();
		return orderedlistType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtheraddrType createOtheraddrType() {
		OtheraddrTypeImpl otheraddrType = new OtheraddrTypeImpl();
		return otheraddrType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParaType createParaType() {
		ParaTypeImpl paraType = new ParaTypeImpl();
		return paraType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonnameType createPersonnameType() {
		PersonnameTypeImpl personnameType = new PersonnameTypeImpl();
		return personnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PhraseType createPhraseType() {
		PhraseTypeImpl phraseType = new PhraseTypeImpl();
		return phraseType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefaceType createPrefaceType() {
		PrefaceTypeImpl prefaceType = new PrefaceTypeImpl();
		return prefaceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramlistingType createProgramlistingType() {
		ProgramlistingTypeImpl programlistingType = new ProgramlistingTypeImpl();
		return programlistingType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherType createPublisherType() {
		PublisherTypeImpl publisherType = new PublisherTypeImpl();
		return publisherType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefEntryType createRefEntryType() {
		RefEntryTypeImpl refEntryType = new RefEntryTypeImpl();
		return refEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefEntryTitleType createRefEntryTitleType() {
		RefEntryTitleTypeImpl refEntryTitleType = new RefEntryTitleTypeImpl();
		return refEntryTitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceType createReferenceType() {
		ReferenceTypeImpl referenceType = new ReferenceTypeImpl();
		return referenceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMetaType createRefMetaType() {
		RefMetaTypeImpl refMetaType = new RefMetaTypeImpl();
		return refMetaType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefNameDivType createRefNameDivType() {
		RefNameDivTypeImpl refNameDivType = new RefNameDivTypeImpl();
		return refNameDivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSect1Type createRefSect1Type() {
		RefSect1TypeImpl refSect1Type = new RefSect1TypeImpl();
		return refSect1Type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSynopsisDivType createRefSynopsisDivType() {
		RefSynopsisDivTypeImpl refSynopsisDivType = new RefSynopsisDivTypeImpl();
		return refSynopsisDivType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevdescriptionType createRevdescriptionType() {
		RevdescriptionTypeImpl revdescriptionType = new RevdescriptionTypeImpl();
		return revdescriptionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevhistoryType createRevhistoryType() {
		RevhistoryTypeImpl revhistoryType = new RevhistoryTypeImpl();
		return revhistoryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevisionType createRevisionType() {
		RevisionTypeImpl revisionType = new RevisionTypeImpl();
		return revisionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevnumberType createRevnumberType() {
		RevnumberTypeImpl revnumberType = new RevnumberTypeImpl();
		return revnumberType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RowType createRowType() {
		RowTypeImpl rowType = new RowTypeImpl();
		return rowType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SectionType createSectionType() {
		SectionTypeImpl sectionType = new SectionTypeImpl();
		return sectionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegListItemType createSegListItemType() {
		SegListItemTypeImpl segListItemType = new SegListItemTypeImpl();
		return segListItemType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentedListType createSegmentedListType() {
		SegmentedListTypeImpl segmentedListType = new SegmentedListTypeImpl();
		return segmentedListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegType createSegType() {
		SegTypeImpl segType = new SegTypeImpl();
		return segType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtitleType createSubtitleType() {
		SubtitleTypeImpl subtitleType = new SubtitleTypeImpl();
		return subtitleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurnameType createSurnameType() {
		SurnameTypeImpl surnameType = new SurnameTypeImpl();
		return surnameType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableType createTableType() {
		TableTypeImpl tableType = new TableTypeImpl();
		return tableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TermType createTermType() {
		TermTypeImpl termType = new TermTypeImpl();
		return termType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TbodyType createTbodyType() {
		TbodyTypeImpl tbodyType = new TbodyTypeImpl();
		return tbodyType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TgroupType createTgroupType() {
		TgroupTypeImpl tgroupType = new TgroupTypeImpl();
		return tgroupType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheadType createTheadType() {
		TheadTypeImpl theadType = new TheadTypeImpl();
		return theadType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TipType createTipType() {
		TipTypeImpl tipType = new TipTypeImpl();
		return tipType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType createTitleType() {
		TitleTypeImpl titleType = new TitleTypeImpl();
		return titleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UlinkType createUlinkType() {
		UlinkTypeImpl ulinkType = new UlinkTypeImpl();
		return ulinkType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableListType createVariableListType() {
		VariableListTypeImpl variableListType = new VariableListTypeImpl();
		return variableListType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VarListEntryType createVarListEntryType() {
		VarListEntryTypeImpl varListEntryType = new VarListEntryTypeImpl();
		return varListEntryType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncsynopsisType createFuncsynopsisType() {
		FuncsynopsisTypeImpl funcsynopsisType = new FuncsynopsisTypeImpl();
		return funcsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncprototypeType createFuncprototypeType() {
		FuncprototypeTypeImpl funcprototypeType = new FuncprototypeTypeImpl();
		return funcprototypeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParamdefType createParamdefType() {
		ParamdefTypeImpl paramdefType = new ParamdefTypeImpl();
		return paramdefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncdefType createFuncdefType() {
		FuncdefTypeImpl funcdefType = new FuncdefTypeImpl();
		return funcdefType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ParameterType createParameterType() {
		ParameterTypeImpl parameterType = new ParameterTypeImpl();
		return parameterType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionType createFunctionType() {
		FunctionTypeImpl functionType = new FunctionTypeImpl();
		return functionType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExampleType createExampleType() {
		ExampleTypeImpl exampleType = new ExampleTypeImpl();
		return exampleType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CmdsynopsisType createCmdsynopsisType() {
		CmdsynopsisTypeImpl cmdsynopsisType = new CmdsynopsisTypeImpl();
		return cmdsynopsisType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandType createCommandType() {
		CommandTypeImpl commandType = new CommandTypeImpl();
		return commandType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ArgType createArgType() {
		ArgTypeImpl argType = new ArgTypeImpl();
		return argType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReplaceableType createReplaceableType() {
		ReplaceableTypeImpl replaceableType = new ReplaceableTypeImpl();
		return replaceableType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookPackage getDocbookPackage() {
		return (DocbookPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static DocbookPackage getPackage() {
		return DocbookPackage.eINSTANCE;
	}

} //DocbookFactoryImpl
