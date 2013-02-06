/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import org.kermeta.Docbook.AbstractType;
import org.kermeta.Docbook.AddressType;
import org.kermeta.Docbook.ArgType;
import org.kermeta.Docbook.AuthorType;
import org.kermeta.Docbook.AuthorinitialsType;
import org.kermeta.Docbook.BookType;
import org.kermeta.Docbook.ChapterType;
import org.kermeta.Docbook.CmdsynopsisType;
import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.CommandType;
import org.kermeta.Docbook.ConfgroupType;
import org.kermeta.Docbook.CopyrightType;
import org.kermeta.Docbook.DateType;
import org.kermeta.Docbook.DocbookFactory;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.DocumentRoot;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.EntryType;
import org.kermeta.Docbook.EnvarType;
import org.kermeta.Docbook.ExampleType;
import org.kermeta.Docbook.FigureType;
import org.kermeta.Docbook.FileNameType;
import org.kermeta.Docbook.FirstnameType;
import org.kermeta.Docbook.FootnoteType;
import org.kermeta.Docbook.FuncdefType;
import org.kermeta.Docbook.FuncprototypeType;
import org.kermeta.Docbook.FuncsynopsisType;
import org.kermeta.Docbook.FunctionType;
import org.kermeta.Docbook.ImagedataType;
import org.kermeta.Docbook.ImageobjectType;
import org.kermeta.Docbook.ImportantType;
import org.kermeta.Docbook.InfoType;
import org.kermeta.Docbook.InformaltableType;
import org.kermeta.Docbook.ItemizedlistType;
import org.kermeta.Docbook.KeywordsetType;
import org.kermeta.Docbook.LegalNoticeType;
import org.kermeta.Docbook.LinkType;
import org.kermeta.Docbook.ListitemType;
import org.kermeta.Docbook.LiteralType;
import org.kermeta.Docbook.MediaobjectType;
import org.kermeta.Docbook.NoteType;
import org.kermeta.Docbook.OptionType;
import org.kermeta.Docbook.OrderedlistType;
import org.kermeta.Docbook.OtheraddrType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.ParamdefType;
import org.kermeta.Docbook.ParameterType;
import org.kermeta.Docbook.PersonnameType;
import org.kermeta.Docbook.PhraseType;
import org.kermeta.Docbook.PrefaceType;
import org.kermeta.Docbook.ProgramlistingType;
import org.kermeta.Docbook.PublisherType;
import org.kermeta.Docbook.RefEntryTitleType;
import org.kermeta.Docbook.RefEntryType;
import org.kermeta.Docbook.RefMetaType;
import org.kermeta.Docbook.RefNameDivType;
import org.kermeta.Docbook.RefSect1Type;
import org.kermeta.Docbook.RefSynopsisDivType;
import org.kermeta.Docbook.ReferenceType;
import org.kermeta.Docbook.ReplaceableType;
import org.kermeta.Docbook.RevdescriptionType;
import org.kermeta.Docbook.RevhistoryType;
import org.kermeta.Docbook.RevisionType;
import org.kermeta.Docbook.RevnumberType;
import org.kermeta.Docbook.RowType;
import org.kermeta.Docbook.SectionType;
import org.kermeta.Docbook.SegListItemType;
import org.kermeta.Docbook.SegType;
import org.kermeta.Docbook.SegmentedListType;
import org.kermeta.Docbook.SubtitleType;
import org.kermeta.Docbook.SurnameType;
import org.kermeta.Docbook.TableType;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TermType;
import org.kermeta.Docbook.TgroupType;
import org.kermeta.Docbook.TheadType;
import org.kermeta.Docbook.TipType;
import org.kermeta.Docbook.TitleType;
import org.kermeta.Docbook.UlinkType;
import org.kermeta.Docbook.VarListEntryType;
import org.kermeta.Docbook.VariableListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class DocbookPackageImpl extends EPackageImpl implements DocbookPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass abstractTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass addressTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorinitialsTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass authorTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass bookTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chapterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass colspecTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass confgroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass copyrightTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dateTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass emphasisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass envarTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass figureTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileNameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass firstnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass footnoteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imagedataTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass imageobjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass importantTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass informaltableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass infoTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass itemizedlistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass keywordsetTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass legalNoticeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass linkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass listitemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass literalTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaobjectTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass noteTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass optionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass orderedlistTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass otheraddrTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paraTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass personnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass phraseTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prefaceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass programlistingTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass publisherTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refEntryTitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass referenceTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refMetaTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refNameDivTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSect1TypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass refSynopsisDivTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revdescriptionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revhistoryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revisionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass revnumberTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass rowTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sectionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segListItemTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segmentedListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass segTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subtitleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass surnameTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass termTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tbodyTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tgroupTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass theadTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tipTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass titleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass ulinkTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass variableListTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass varListEntryTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcsynopsisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcprototypeTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass paramdefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass funcdefTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass parameterTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass exampleTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass cmdsynopsisTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass argTypeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass replaceableTypeEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.kermeta.Docbook.DocbookPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private DocbookPackageImpl() {
		super(eNS_URI, DocbookFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link DocbookPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static DocbookPackage init() {
		if (isInited) return (DocbookPackage)EPackage.Registry.INSTANCE.getEPackage(DocbookPackage.eNS_URI);

		// Obtain or create and register package
		DocbookPackageImpl theDocbookPackage = (DocbookPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof DocbookPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new DocbookPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theDocbookPackage.createPackageContents();

		// Initialize created meta-data
		theDocbookPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theDocbookPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(DocbookPackage.eNS_URI, theDocbookPackage);
		return theDocbookPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAbstractType() {
		return abstractTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAbstractType_Para() {
		return (EReference)abstractTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAddressType() {
		return addressTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_State() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAddressType_Otheraddr() {
		return (EReference)addressTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Format() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAddressType_Email() {
		return (EAttribute)addressTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorinitialsType() {
		return authorinitialsTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorinitialsType_Mixed() {
		return (EAttribute)authorinitialsTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAuthorType() {
		return authorTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorType_Personname() {
		return (EReference)authorTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAuthorType_Contrib() {
		return (EAttribute)authorTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAuthorType_Address() {
		return (EReference)authorTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getBookType() {
		return bookTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Info() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Preface() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Chapter() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getBookType_Reference() {
		return (EReference)bookTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Lang() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Version() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getBookType_Label() {
		return (EAttribute)bookTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getChapterType() {
		return chapterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Title() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Para() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Note() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getChapterType_Section() {
		return (EReference)chapterTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getChapterType_Annotations() {
		return (EAttribute)chapterTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getColspecType() {
		return colspecTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColspecType_Colname() {
		return (EAttribute)colspecTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getColspecType_Colwidth() {
		return (EAttribute)colspecTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getConfgroupType() {
		return confgroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfgroupType_Conftitle() {
		return (EAttribute)confgroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfgroupType_Confnum() {
		return (EAttribute)confgroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getConfgroupType_Confsponsor() {
		return (EAttribute)confgroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCopyrightType() {
		return copyrightTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyrightType_Group() {
		return (EAttribute)copyrightTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyrightType_Year() {
		return (EAttribute)copyrightTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCopyrightType_Holder() {
		return (EAttribute)copyrightTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDateType() {
		return dateTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDateType_Mixed() {
		return (EAttribute)dateTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Abstract() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Address() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Author() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Bibliomisc() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Book() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Info() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Caution() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Chapter() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Colspec() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Confgroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Confnum() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Confsponsor() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Conftitle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Date() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Emphasis() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Entry() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Figure() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Firstname() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Footnote() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Imagedata() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Imageobject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Important() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Informaltable() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Itemizedlist() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Keyword() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Keywordset() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Link() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Listitem() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Literal() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Mediaobject() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Note() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Orderedlist() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Otheraddr() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Para() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Phrase() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Preface() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Programlisting() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Pubdate() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Publisher() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Publishername() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Row() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Section() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_State() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Subtitle() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(46);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Superscript() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(47);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Table() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(48);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tbody() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(49);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tgroup() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(50);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Thead() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(51);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Tip() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(52);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Title() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(53);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Ulink() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(54);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Warning() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(55);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEmphasisType() {
		return emphasisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasisType_Mixed() {
		return (EAttribute)emphasisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEmphasisType_Emphasis() {
		return (EReference)emphasisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEmphasisType_Role() {
		return (EAttribute)emphasisTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntryType() {
		return entryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Programlisting() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Mixed() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Mediaobject() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntryType_Para() {
		return (EReference)entryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Align() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Morerows() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Nameend() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Namest() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntryType_Valign() {
		return (EAttribute)entryTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEnvarType() {
		return envarTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEnvarType_Mixed() {
		return (EAttribute)envarTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEnvarType_Replaceable() {
		return (EReference)envarTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFigureType() {
		return figureTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigureType_Title() {
		return (EReference)figureTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFigureType_Mediaobject() {
		return (EReference)figureTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigureType_Float() {
		return (EAttribute)figureTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFigureType_Id() {
		return (EAttribute)figureTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFileNameType() {
		return fileNameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFileNameType_Mixed() {
		return (EAttribute)fileNameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFileNameType_Replaceable() {
		return (EReference)fileNameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFirstnameType() {
		return firstnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFirstnameType_Mixed() {
		return (EAttribute)firstnameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFootnoteType() {
		return footnoteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFootnoteType_Para() {
		return (EReference)footnoteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFootnoteType_Id() {
		return (EAttribute)footnoteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImagedataType() {
		return imagedataTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Depth() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Fileref() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Width() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Align() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImagedataType_Scale() {
		return (EAttribute)imagedataTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImageobjectType() {
		return imageobjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImageobjectType_Imagedata() {
		return (EReference)imageobjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getImportantType() {
		return importantTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportantType_Mixed() {
		return (EAttribute)importantTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getImportantType_Group() {
		return (EAttribute)importantTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportantType_Emphasis() {
		return (EReference)importantTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getImportantType_Ulink() {
		return (EReference)importantTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInformaltableType() {
		return informaltableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInformaltableType_Tgroup() {
		return (EReference)informaltableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInfoType() {
		return infoTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_Pubdate() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Author() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Title() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Subtitle() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_Group() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_Bibliomisc() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_Date() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Keywordset() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Abstract() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Publisher() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Confgroup() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Revhistory() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Copyright() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInfoType_Legalnotice() {
		return (EReference)infoTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_Productname() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInfoType_Releaseinfo() {
		return (EAttribute)infoTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getItemizedlistType() {
		return itemizedlistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getItemizedlistType_Listitem() {
		return (EReference)itemizedlistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getKeywordsetType() {
		return keywordsetTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getKeywordsetType_Keyword() {
		return (EAttribute)keywordsetTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLegalNoticeType() {
		return legalNoticeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLegalNoticeType_Group() {
		return (EAttribute)legalNoticeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalNoticeType_Title() {
		return (EReference)legalNoticeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalNoticeType_Revhistory() {
		return (EReference)legalNoticeTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalNoticeType_Para() {
		return (EReference)legalNoticeTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLegalNoticeType_Orderedlist() {
		return (EReference)legalNoticeTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLinkType() {
		return linkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Mixed() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Value() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLinkType_Linkend() {
		return (EAttribute)linkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getListitemType() {
		return listitemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListitemType_Itemizedlist() {
		return (EReference)listitemTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getListitemType_Para() {
		return (EReference)listitemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLiteralType() {
		return literalTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralType_Value() {
		return (EAttribute)literalTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLiteralType_Moreinfo() {
		return (EAttribute)literalTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMediaobjectType() {
		return mediaobjectTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMediaobjectType_Imageobject() {
		return (EReference)mediaobjectTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNoteType() {
		return noteTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Mixed() {
		return (EAttribute)noteTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNoteType_Group() {
		return (EAttribute)noteTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteType_Literal() {
		return (EReference)noteTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNoteType_Ulink() {
		return (EReference)noteTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOptionType() {
		return optionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOptionType_Mixed() {
		return (EAttribute)optionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOptionType_Replaceable() {
		return (EReference)optionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOrderedlistType() {
		return orderedlistTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderedlistType_Continuation() {
		return (EAttribute)orderedlistTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getOrderedlistType_Inheritnum() {
		return (EAttribute)orderedlistTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getOtheraddrType() {
		return otheraddrTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getOtheraddrType_Ulink() {
		return (EReference)otheraddrTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParaType() {
		return paraTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Mixed() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Group() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Emphasis() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Literal() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Ulink() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Footnote() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Link() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Role() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Itemizedlist() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParaType_Id() {
		return (EAttribute)paraTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParaType_Variablelist() {
		return (EReference)paraTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPersonnameType() {
		return personnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonnameType_Firstname() {
		return (EReference)personnameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPersonnameType_Surname() {
		return (EReference)personnameTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPhraseType() {
		return phraseTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPhraseType_Id() {
		return (EAttribute)phraseTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrefaceType() {
		return prefaceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Title() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Para() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Important() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrefaceType_Tip() {
		return (EReference)prefaceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProgramlistingType() {
		return programlistingTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Mixed() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Group() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramlistingType_Emphasis() {
		return (EReference)programlistingTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getProgramlistingType_Phrase() {
		return (EReference)programlistingTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Superscript() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Format() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Language() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getProgramlistingType_Linenumbering() {
		return (EAttribute)programlistingTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPublisherType() {
		return publisherTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPublisherType_Publishername() {
		return (EAttribute)publisherTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPublisherType_Address() {
		return (EReference)publisherTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefEntryType() {
		return refEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefEntryType_Info() {
		return (EReference)refEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefEntryType_Refmeta() {
		return (EReference)refEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefEntryType_Refnamediv() {
		return (EReference)refEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefEntryType_Refsynopsisdiv() {
		return (EReference)refEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefEntryType_Refsect1() {
		return (EReference)refEntryTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefEntryType_Version() {
		return (EAttribute)refEntryTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefEntryTitleType() {
		return refEntryTitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefEntryTitleType_Mixed() {
		return (EAttribute)refEntryTitleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReferenceType() {
		return referenceTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_Info() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_Title() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReferenceType_Version() {
		return (EAttribute)referenceTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getReferenceType_Refentry() {
		return (EReference)referenceTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefMetaType() {
		return refMetaTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefMetaType_Refentrytitle() {
		return (EReference)refMetaTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefMetaType_Manvolnum() {
		return (EAttribute)refMetaTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefNameDivType() {
		return refNameDivTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefNameDivType_Refname() {
		return (EAttribute)refNameDivTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefNameDivType_Refpurpose() {
		return (EAttribute)refNameDivTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefNameDivType_Refclass() {
		return (EAttribute)refNameDivTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefSect1Type() {
		return refSect1TypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefSect1Type_Group() {
		return (EAttribute)refSect1TypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSect1Type_Title() {
		return (EReference)refSect1TypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSect1Type_Para() {
		return (EReference)refSect1TypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSect1Type_Variablelist() {
		return (EReference)refSect1TypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSect1Type_Segmentedlist() {
		return (EReference)refSect1TypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRefSect1Type_Id() {
		return (EAttribute)refSect1TypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRefSynopsisDivType() {
		return refSynopsisDivTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSynopsisDivType_Cmdsynopsis() {
		return (EReference)refSynopsisDivTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRefSynopsisDivType_Funcsynopsis() {
		return (EReference)refSynopsisDivTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevdescriptionType() {
		return revdescriptionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevdescriptionType_Mixed() {
		return (EAttribute)revdescriptionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevdescriptionType_Para() {
		return (EReference)revdescriptionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevhistoryType() {
		return revhistoryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevhistoryType_Revision() {
		return (EReference)revhistoryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevisionType() {
		return revisionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionType_Revnumber() {
		return (EReference)revisionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionType_Date() {
		return (EReference)revisionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionType_Revdescription() {
		return (EReference)revisionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevisionType_Authorinitials() {
		return (EReference)revisionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRevnumberType() {
		return revnumberTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRevnumberType_Mixed() {
		return (EAttribute)revnumberTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRevnumberType_Ulink() {
		return (EReference)revnumberTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRowType() {
		return rowTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRowType_Entry() {
		return (EReference)rowTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSectionType() {
		return sectionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Group() {
		return (EAttribute)sectionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Itemizedlist() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Mediaobject() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Note() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Para() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Programlisting() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Section() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Title() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Figure() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Informaltable() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Orderedlist() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Table() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Warning() {
		return (EAttribute)sectionTypeEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Tip() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Caution() {
		return (EAttribute)sectionTypeEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Example() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Cmdsynopsis() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSectionType_Annotations() {
		return (EAttribute)sectionTypeEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegListItemType() {
		return segListItemTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegListItemType_Seg() {
		return (EReference)segListItemTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegmentedListType() {
		return segmentedListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentedListType_Group() {
		return (EAttribute)segmentedListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegmentedListType_Segtitle() {
		return (EAttribute)segmentedListTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSegmentedListType_Seglistitem() {
		return (EReference)segmentedListTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSegType() {
		return segTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegType_Group() {
		return (EAttribute)segTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegType_Mixed() {
		return (EAttribute)segTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegType_Errorcode() {
		return (EAttribute)segTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSegType_Errortext() {
		return (EAttribute)segTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSectionType_Funcsynopsis() {
		return (EReference)sectionTypeEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubtitleType() {
		return subtitleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtitleType_Mixed() {
		return (EAttribute)subtitleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSubtitleType_Group() {
		return (EAttribute)subtitleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtitleType_Emphasis() {
		return (EReference)subtitleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubtitleType_Phrase() {
		return (EReference)subtitleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSurnameType() {
		return surnameTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSurnameType_Mixed() {
		return (EAttribute)surnameTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableType() {
		return tableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Title() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableType_Tgroup() {
		return (EReference)tableTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTableType_Id() {
		return (EAttribute)tableTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTermType() {
		return termTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTermType_Mixed() {
		return (EAttribute)termTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermType_Emphasis() {
		return (EReference)termTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermType_Option() {
		return (EReference)termTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermType_Filename() {
		return (EReference)termTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTermType_Envar() {
		return (EReference)termTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTbodyType() {
		return tbodyTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTbodyType_Row() {
		return (EReference)tbodyTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTgroupType() {
		return tgroupTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTgroupType_Colspec() {
		return (EReference)tgroupTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTgroupType_Thead() {
		return (EReference)tgroupTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTgroupType_Tbody() {
		return (EReference)tgroupTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTgroupType_Cols() {
		return (EAttribute)tgroupTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTgroupType_Colseq() {
		return (EAttribute)tgroupTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTgroupType_Rowseq() {
		return (EAttribute)tgroupTypeEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTgroupType_Align() {
		return (EAttribute)tgroupTypeEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTheadType() {
		return theadTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTheadType_Row() {
		return (EReference)theadTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTipType() {
		return tipTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTipType_Mixed() {
		return (EAttribute)tipTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTipType_Ulink() {
		return (EReference)tipTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTitleType() {
		return titleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Mixed() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTitleType_Group() {
		return (EAttribute)titleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitleType_Emphasis() {
		return (EReference)titleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTitleType_Phrase() {
		return (EReference)titleTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUlinkType() {
		return ulinkTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlinkType_Mixed() {
		return (EAttribute)ulinkTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUlinkType_Emphasis() {
		return (EReference)ulinkTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlinkType_Type() {
		return (EAttribute)ulinkTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUlinkType_Url() {
		return (EAttribute)ulinkTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVariableListType() {
		return variableListTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVariableListType_Varlistentry() {
		return (EReference)variableListTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getVarListEntryType() {
		return varListEntryTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarListEntryType_Spacing() {
		return (EAttribute)varListEntryTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getVarListEntryType_Termlength() {
		return (EAttribute)varListEntryTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarListEntryType_Term() {
		return (EReference)varListEntryTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getVarListEntryType_Listitem() {
		return (EReference)varListEntryTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncsynopsisType() {
		return funcsynopsisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncsynopsisType_Funcprototype() {
		return (EReference)funcsynopsisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncprototypeType() {
		return funcprototypeTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncprototypeType_Funcdef() {
		return (EReference)funcprototypeTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncprototypeType_Paramdef() {
		return (EReference)funcprototypeTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParamdefType() {
		return paramdefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getParamdefType_Parameter() {
		return (EReference)paramdefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParamdefType_Mixed() {
		return (EAttribute)paramdefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFuncdefType() {
		return funcdefTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFuncdefType_Function() {
		return (EReference)funcdefTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFuncdefType_Mixed() {
		return (EAttribute)funcdefTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getParameterType() {
		return parameterTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getParameterType_Mixed() {
		return (EAttribute)parameterTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFunctionType() {
		return functionTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFunctionType_Mixed() {
		return (EAttribute)functionTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getExampleType() {
		return exampleTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getExampleType_Id() {
		return (EAttribute)exampleTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleType_Title() {
		return (EReference)exampleTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getExampleType_Programlisting() {
		return (EReference)exampleTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCmdsynopsisType() {
		return cmdsynopsisTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdsynopsisType_Command() {
		return (EReference)cmdsynopsisTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCmdsynopsisType_Arg() {
		return (EReference)cmdsynopsisTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandType() {
		return commandTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCommandType_Mixed() {
		return (EAttribute)commandTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getArgType() {
		return argTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgType_Mixed() {
		return (EAttribute)argTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgType_Option() {
		return (EReference)argTypeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getArgType_Replaceable() {
		return (EReference)argTypeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgType_Choice() {
		return (EAttribute)argTypeEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getArgType_Rep() {
		return (EAttribute)argTypeEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getReplaceableType() {
		return replaceableTypeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getReplaceableType_Mixed() {
		return (EAttribute)replaceableTypeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookFactory getDocbookFactory() {
		return (DocbookFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		abstractTypeEClass = createEClass(ABSTRACT_TYPE);
		createEReference(abstractTypeEClass, ABSTRACT_TYPE__PARA);

		addressTypeEClass = createEClass(ADDRESS_TYPE);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__STATE);
		createEReference(addressTypeEClass, ADDRESS_TYPE__OTHERADDR);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__FORMAT);
		createEAttribute(addressTypeEClass, ADDRESS_TYPE__EMAIL);

		argTypeEClass = createEClass(ARG_TYPE);
		createEAttribute(argTypeEClass, ARG_TYPE__MIXED);
		createEReference(argTypeEClass, ARG_TYPE__OPTION);
		createEReference(argTypeEClass, ARG_TYPE__REPLACEABLE);
		createEAttribute(argTypeEClass, ARG_TYPE__CHOICE);
		createEAttribute(argTypeEClass, ARG_TYPE__REP);

		authorinitialsTypeEClass = createEClass(AUTHORINITIALS_TYPE);
		createEAttribute(authorinitialsTypeEClass, AUTHORINITIALS_TYPE__MIXED);

		authorTypeEClass = createEClass(AUTHOR_TYPE);
		createEReference(authorTypeEClass, AUTHOR_TYPE__PERSONNAME);
		createEAttribute(authorTypeEClass, AUTHOR_TYPE__CONTRIB);
		createEReference(authorTypeEClass, AUTHOR_TYPE__ADDRESS);

		bookTypeEClass = createEClass(BOOK_TYPE);
		createEReference(bookTypeEClass, BOOK_TYPE__INFO);
		createEReference(bookTypeEClass, BOOK_TYPE__PREFACE);
		createEReference(bookTypeEClass, BOOK_TYPE__CHAPTER);
		createEReference(bookTypeEClass, BOOK_TYPE__REFERENCE);
		createEAttribute(bookTypeEClass, BOOK_TYPE__LANG);
		createEAttribute(bookTypeEClass, BOOK_TYPE__VERSION);
		createEAttribute(bookTypeEClass, BOOK_TYPE__LABEL);

		chapterTypeEClass = createEClass(CHAPTER_TYPE);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__TITLE);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__PARA);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__NOTE);
		createEReference(chapterTypeEClass, CHAPTER_TYPE__SECTION);
		createEAttribute(chapterTypeEClass, CHAPTER_TYPE__ANNOTATIONS);

		colspecTypeEClass = createEClass(COLSPEC_TYPE);
		createEAttribute(colspecTypeEClass, COLSPEC_TYPE__COLNAME);
		createEAttribute(colspecTypeEClass, COLSPEC_TYPE__COLWIDTH);

		cmdsynopsisTypeEClass = createEClass(CMDSYNOPSIS_TYPE);
		createEReference(cmdsynopsisTypeEClass, CMDSYNOPSIS_TYPE__COMMAND);
		createEReference(cmdsynopsisTypeEClass, CMDSYNOPSIS_TYPE__ARG);

		commandTypeEClass = createEClass(COMMAND_TYPE);
		createEAttribute(commandTypeEClass, COMMAND_TYPE__MIXED);

		confgroupTypeEClass = createEClass(CONFGROUP_TYPE);
		createEAttribute(confgroupTypeEClass, CONFGROUP_TYPE__CONFTITLE);
		createEAttribute(confgroupTypeEClass, CONFGROUP_TYPE__CONFNUM);
		createEAttribute(confgroupTypeEClass, CONFGROUP_TYPE__CONFSPONSOR);

		copyrightTypeEClass = createEClass(COPYRIGHT_TYPE);
		createEAttribute(copyrightTypeEClass, COPYRIGHT_TYPE__GROUP);
		createEAttribute(copyrightTypeEClass, COPYRIGHT_TYPE__YEAR);
		createEAttribute(copyrightTypeEClass, COPYRIGHT_TYPE__HOLDER);

		dateTypeEClass = createEClass(DATE_TYPE);
		createEAttribute(dateTypeEClass, DATE_TYPE__MIXED);

		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ABSTRACT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ADDRESS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__AUTHOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__BIBLIOMISC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__BOOK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INFO);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CAUTION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CHAPTER);
		createEReference(documentRootEClass, DOCUMENT_ROOT__COLSPEC);
		createEReference(documentRootEClass, DOCUMENT_ROOT__CONFGROUP);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONFNUM);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONFSPONSOR);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__CONFTITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__DATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__EMPHASIS);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ENTRY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FIGURE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__FIRSTNAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__FOOTNOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMAGEDATA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMAGEOBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__IMPORTANT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__INFORMALTABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ITEMIZEDLIST);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__KEYWORD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__KEYWORDSET);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LINK);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LISTITEM);
		createEReference(documentRootEClass, DOCUMENT_ROOT__LITERAL);
		createEReference(documentRootEClass, DOCUMENT_ROOT__MEDIAOBJECT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__NOTE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ORDEREDLIST);
		createEReference(documentRootEClass, DOCUMENT_ROOT__OTHERADDR);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PARA);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PHRASE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PREFACE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PROGRAMLISTING);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PUBDATE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__PUBLISHER);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__PUBLISHERNAME);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ROW);
		createEReference(documentRootEClass, DOCUMENT_ROOT__SECTION);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__STATE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUBTITLE);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__SUPERSCRIPT);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TABLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TBODY);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TGROUP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__THEAD);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TIP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TITLE);
		createEReference(documentRootEClass, DOCUMENT_ROOT__ULINK);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__WARNING);

		emphasisTypeEClass = createEClass(EMPHASIS_TYPE);
		createEAttribute(emphasisTypeEClass, EMPHASIS_TYPE__MIXED);
		createEReference(emphasisTypeEClass, EMPHASIS_TYPE__EMPHASIS);
		createEAttribute(emphasisTypeEClass, EMPHASIS_TYPE__ROLE);

		entryTypeEClass = createEClass(ENTRY_TYPE);
		createEReference(entryTypeEClass, ENTRY_TYPE__PROGRAMLISTING);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__MIXED);
		createEReference(entryTypeEClass, ENTRY_TYPE__MEDIAOBJECT);
		createEReference(entryTypeEClass, ENTRY_TYPE__PARA);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__ALIGN);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__MOREROWS);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__NAMEEND);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__NAMEST);
		createEAttribute(entryTypeEClass, ENTRY_TYPE__VALIGN);

		envarTypeEClass = createEClass(ENVAR_TYPE);
		createEAttribute(envarTypeEClass, ENVAR_TYPE__MIXED);
		createEReference(envarTypeEClass, ENVAR_TYPE__REPLACEABLE);

		exampleTypeEClass = createEClass(EXAMPLE_TYPE);
		createEAttribute(exampleTypeEClass, EXAMPLE_TYPE__ID);
		createEReference(exampleTypeEClass, EXAMPLE_TYPE__TITLE);
		createEReference(exampleTypeEClass, EXAMPLE_TYPE__PROGRAMLISTING);

		figureTypeEClass = createEClass(FIGURE_TYPE);
		createEReference(figureTypeEClass, FIGURE_TYPE__TITLE);
		createEReference(figureTypeEClass, FIGURE_TYPE__MEDIAOBJECT);
		createEAttribute(figureTypeEClass, FIGURE_TYPE__FLOAT);
		createEAttribute(figureTypeEClass, FIGURE_TYPE__ID);

		fileNameTypeEClass = createEClass(FILE_NAME_TYPE);
		createEAttribute(fileNameTypeEClass, FILE_NAME_TYPE__MIXED);
		createEReference(fileNameTypeEClass, FILE_NAME_TYPE__REPLACEABLE);

		firstnameTypeEClass = createEClass(FIRSTNAME_TYPE);
		createEAttribute(firstnameTypeEClass, FIRSTNAME_TYPE__MIXED);

		footnoteTypeEClass = createEClass(FOOTNOTE_TYPE);
		createEReference(footnoteTypeEClass, FOOTNOTE_TYPE__PARA);
		createEAttribute(footnoteTypeEClass, FOOTNOTE_TYPE__ID);

		funcdefTypeEClass = createEClass(FUNCDEF_TYPE);
		createEAttribute(funcdefTypeEClass, FUNCDEF_TYPE__MIXED);
		createEReference(funcdefTypeEClass, FUNCDEF_TYPE__FUNCTION);

		funcprototypeTypeEClass = createEClass(FUNCPROTOTYPE_TYPE);
		createEReference(funcprototypeTypeEClass, FUNCPROTOTYPE_TYPE__FUNCDEF);
		createEReference(funcprototypeTypeEClass, FUNCPROTOTYPE_TYPE__PARAMDEF);

		funcsynopsisTypeEClass = createEClass(FUNCSYNOPSIS_TYPE);
		createEReference(funcsynopsisTypeEClass, FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE);

		functionTypeEClass = createEClass(FUNCTION_TYPE);
		createEAttribute(functionTypeEClass, FUNCTION_TYPE__MIXED);

		imagedataTypeEClass = createEClass(IMAGEDATA_TYPE);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__DEPTH);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__FILEREF);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__WIDTH);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__ALIGN);
		createEAttribute(imagedataTypeEClass, IMAGEDATA_TYPE__SCALE);

		imageobjectTypeEClass = createEClass(IMAGEOBJECT_TYPE);
		createEReference(imageobjectTypeEClass, IMAGEOBJECT_TYPE__IMAGEDATA);

		importantTypeEClass = createEClass(IMPORTANT_TYPE);
		createEAttribute(importantTypeEClass, IMPORTANT_TYPE__MIXED);
		createEAttribute(importantTypeEClass, IMPORTANT_TYPE__GROUP);
		createEReference(importantTypeEClass, IMPORTANT_TYPE__EMPHASIS);
		createEReference(importantTypeEClass, IMPORTANT_TYPE__ULINK);

		informaltableTypeEClass = createEClass(INFORMALTABLE_TYPE);
		createEReference(informaltableTypeEClass, INFORMALTABLE_TYPE__TGROUP);

		infoTypeEClass = createEClass(INFO_TYPE);
		createEAttribute(infoTypeEClass, INFO_TYPE__PUBDATE);
		createEReference(infoTypeEClass, INFO_TYPE__AUTHOR);
		createEReference(infoTypeEClass, INFO_TYPE__TITLE);
		createEReference(infoTypeEClass, INFO_TYPE__SUBTITLE);
		createEAttribute(infoTypeEClass, INFO_TYPE__GROUP);
		createEAttribute(infoTypeEClass, INFO_TYPE__BIBLIOMISC);
		createEAttribute(infoTypeEClass, INFO_TYPE__DATE);
		createEReference(infoTypeEClass, INFO_TYPE__KEYWORDSET);
		createEReference(infoTypeEClass, INFO_TYPE__ABSTRACT);
		createEReference(infoTypeEClass, INFO_TYPE__PUBLISHER);
		createEReference(infoTypeEClass, INFO_TYPE__CONFGROUP);
		createEReference(infoTypeEClass, INFO_TYPE__REVHISTORY);
		createEReference(infoTypeEClass, INFO_TYPE__COPYRIGHT);
		createEReference(infoTypeEClass, INFO_TYPE__LEGALNOTICE);
		createEAttribute(infoTypeEClass, INFO_TYPE__PRODUCTNAME);
		createEAttribute(infoTypeEClass, INFO_TYPE__RELEASEINFO);

		itemizedlistTypeEClass = createEClass(ITEMIZEDLIST_TYPE);
		createEReference(itemizedlistTypeEClass, ITEMIZEDLIST_TYPE__LISTITEM);

		keywordsetTypeEClass = createEClass(KEYWORDSET_TYPE);
		createEAttribute(keywordsetTypeEClass, KEYWORDSET_TYPE__KEYWORD);

		legalNoticeTypeEClass = createEClass(LEGAL_NOTICE_TYPE);
		createEAttribute(legalNoticeTypeEClass, LEGAL_NOTICE_TYPE__GROUP);
		createEReference(legalNoticeTypeEClass, LEGAL_NOTICE_TYPE__TITLE);
		createEReference(legalNoticeTypeEClass, LEGAL_NOTICE_TYPE__REVHISTORY);
		createEReference(legalNoticeTypeEClass, LEGAL_NOTICE_TYPE__PARA);
		createEReference(legalNoticeTypeEClass, LEGAL_NOTICE_TYPE__ORDEREDLIST);

		linkTypeEClass = createEClass(LINK_TYPE);
		createEAttribute(linkTypeEClass, LINK_TYPE__MIXED);
		createEAttribute(linkTypeEClass, LINK_TYPE__VALUE);
		createEAttribute(linkTypeEClass, LINK_TYPE__LINKEND);

		listitemTypeEClass = createEClass(LISTITEM_TYPE);
		createEReference(listitemTypeEClass, LISTITEM_TYPE__PARA);
		createEReference(listitemTypeEClass, LISTITEM_TYPE__ITEMIZEDLIST);

		literalTypeEClass = createEClass(LITERAL_TYPE);
		createEAttribute(literalTypeEClass, LITERAL_TYPE__VALUE);
		createEAttribute(literalTypeEClass, LITERAL_TYPE__MOREINFO);

		mediaobjectTypeEClass = createEClass(MEDIAOBJECT_TYPE);
		createEReference(mediaobjectTypeEClass, MEDIAOBJECT_TYPE__IMAGEOBJECT);

		noteTypeEClass = createEClass(NOTE_TYPE);
		createEAttribute(noteTypeEClass, NOTE_TYPE__MIXED);
		createEAttribute(noteTypeEClass, NOTE_TYPE__GROUP);
		createEReference(noteTypeEClass, NOTE_TYPE__LITERAL);
		createEReference(noteTypeEClass, NOTE_TYPE__ULINK);

		optionTypeEClass = createEClass(OPTION_TYPE);
		createEAttribute(optionTypeEClass, OPTION_TYPE__MIXED);
		createEReference(optionTypeEClass, OPTION_TYPE__REPLACEABLE);

		orderedlistTypeEClass = createEClass(ORDEREDLIST_TYPE);
		createEAttribute(orderedlistTypeEClass, ORDEREDLIST_TYPE__CONTINUATION);
		createEAttribute(orderedlistTypeEClass, ORDEREDLIST_TYPE__INHERITNUM);

		otheraddrTypeEClass = createEClass(OTHERADDR_TYPE);
		createEReference(otheraddrTypeEClass, OTHERADDR_TYPE__ULINK);

		parameterTypeEClass = createEClass(PARAMETER_TYPE);
		createEAttribute(parameterTypeEClass, PARAMETER_TYPE__MIXED);

		paramdefTypeEClass = createEClass(PARAMDEF_TYPE);
		createEAttribute(paramdefTypeEClass, PARAMDEF_TYPE__MIXED);
		createEReference(paramdefTypeEClass, PARAMDEF_TYPE__PARAMETER);

		paraTypeEClass = createEClass(PARA_TYPE);
		createEAttribute(paraTypeEClass, PARA_TYPE__MIXED);
		createEAttribute(paraTypeEClass, PARA_TYPE__GROUP);
		createEReference(paraTypeEClass, PARA_TYPE__EMPHASIS);
		createEReference(paraTypeEClass, PARA_TYPE__LITERAL);
		createEReference(paraTypeEClass, PARA_TYPE__ULINK);
		createEReference(paraTypeEClass, PARA_TYPE__FOOTNOTE);
		createEReference(paraTypeEClass, PARA_TYPE__LINK);
		createEAttribute(paraTypeEClass, PARA_TYPE__ROLE);
		createEReference(paraTypeEClass, PARA_TYPE__ITEMIZEDLIST);
		createEAttribute(paraTypeEClass, PARA_TYPE__ID);
		createEReference(paraTypeEClass, PARA_TYPE__VARIABLELIST);

		personnameTypeEClass = createEClass(PERSONNAME_TYPE);
		createEReference(personnameTypeEClass, PERSONNAME_TYPE__FIRSTNAME);
		createEReference(personnameTypeEClass, PERSONNAME_TYPE__SURNAME);

		phraseTypeEClass = createEClass(PHRASE_TYPE);
		createEAttribute(phraseTypeEClass, PHRASE_TYPE__ID);

		prefaceTypeEClass = createEClass(PREFACE_TYPE);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__TITLE);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__PARA);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__IMPORTANT);
		createEReference(prefaceTypeEClass, PREFACE_TYPE__TIP);

		programlistingTypeEClass = createEClass(PROGRAMLISTING_TYPE);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__MIXED);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__GROUP);
		createEReference(programlistingTypeEClass, PROGRAMLISTING_TYPE__EMPHASIS);
		createEReference(programlistingTypeEClass, PROGRAMLISTING_TYPE__PHRASE);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__SUPERSCRIPT);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__FORMAT);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__LANGUAGE);
		createEAttribute(programlistingTypeEClass, PROGRAMLISTING_TYPE__LINENUMBERING);

		publisherTypeEClass = createEClass(PUBLISHER_TYPE);
		createEAttribute(publisherTypeEClass, PUBLISHER_TYPE__PUBLISHERNAME);
		createEReference(publisherTypeEClass, PUBLISHER_TYPE__ADDRESS);

		refEntryTypeEClass = createEClass(REF_ENTRY_TYPE);
		createEReference(refEntryTypeEClass, REF_ENTRY_TYPE__INFO);
		createEReference(refEntryTypeEClass, REF_ENTRY_TYPE__REFMETA);
		createEReference(refEntryTypeEClass, REF_ENTRY_TYPE__REFNAMEDIV);
		createEReference(refEntryTypeEClass, REF_ENTRY_TYPE__REFSYNOPSISDIV);
		createEReference(refEntryTypeEClass, REF_ENTRY_TYPE__REFSECT1);
		createEAttribute(refEntryTypeEClass, REF_ENTRY_TYPE__VERSION);

		refEntryTitleTypeEClass = createEClass(REF_ENTRY_TITLE_TYPE);
		createEAttribute(refEntryTitleTypeEClass, REF_ENTRY_TITLE_TYPE__MIXED);

		referenceTypeEClass = createEClass(REFERENCE_TYPE);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__INFO);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__TITLE);
		createEAttribute(referenceTypeEClass, REFERENCE_TYPE__VERSION);
		createEReference(referenceTypeEClass, REFERENCE_TYPE__REFENTRY);

		refMetaTypeEClass = createEClass(REF_META_TYPE);
		createEReference(refMetaTypeEClass, REF_META_TYPE__REFENTRYTITLE);
		createEAttribute(refMetaTypeEClass, REF_META_TYPE__MANVOLNUM);

		refNameDivTypeEClass = createEClass(REF_NAME_DIV_TYPE);
		createEAttribute(refNameDivTypeEClass, REF_NAME_DIV_TYPE__REFNAME);
		createEAttribute(refNameDivTypeEClass, REF_NAME_DIV_TYPE__REFPURPOSE);
		createEAttribute(refNameDivTypeEClass, REF_NAME_DIV_TYPE__REFCLASS);

		refSect1TypeEClass = createEClass(REF_SECT1_TYPE);
		createEAttribute(refSect1TypeEClass, REF_SECT1_TYPE__GROUP);
		createEReference(refSect1TypeEClass, REF_SECT1_TYPE__TITLE);
		createEReference(refSect1TypeEClass, REF_SECT1_TYPE__PARA);
		createEReference(refSect1TypeEClass, REF_SECT1_TYPE__VARIABLELIST);
		createEReference(refSect1TypeEClass, REF_SECT1_TYPE__SEGMENTEDLIST);
		createEAttribute(refSect1TypeEClass, REF_SECT1_TYPE__ID);

		refSynopsisDivTypeEClass = createEClass(REF_SYNOPSIS_DIV_TYPE);
		createEReference(refSynopsisDivTypeEClass, REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS);
		createEReference(refSynopsisDivTypeEClass, REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS);

		replaceableTypeEClass = createEClass(REPLACEABLE_TYPE);
		createEAttribute(replaceableTypeEClass, REPLACEABLE_TYPE__MIXED);

		revdescriptionTypeEClass = createEClass(REVDESCRIPTION_TYPE);
		createEAttribute(revdescriptionTypeEClass, REVDESCRIPTION_TYPE__MIXED);
		createEReference(revdescriptionTypeEClass, REVDESCRIPTION_TYPE__PARA);

		revhistoryTypeEClass = createEClass(REVHISTORY_TYPE);
		createEReference(revhistoryTypeEClass, REVHISTORY_TYPE__REVISION);

		revisionTypeEClass = createEClass(REVISION_TYPE);
		createEReference(revisionTypeEClass, REVISION_TYPE__REVNUMBER);
		createEReference(revisionTypeEClass, REVISION_TYPE__DATE);
		createEReference(revisionTypeEClass, REVISION_TYPE__AUTHORINITIALS);
		createEReference(revisionTypeEClass, REVISION_TYPE__REVDESCRIPTION);

		revnumberTypeEClass = createEClass(REVNUMBER_TYPE);
		createEAttribute(revnumberTypeEClass, REVNUMBER_TYPE__MIXED);
		createEReference(revnumberTypeEClass, REVNUMBER_TYPE__ULINK);

		rowTypeEClass = createEClass(ROW_TYPE);
		createEReference(rowTypeEClass, ROW_TYPE__ENTRY);

		sectionTypeEClass = createEClass(SECTION_TYPE);
		createEAttribute(sectionTypeEClass, SECTION_TYPE__GROUP);
		createEReference(sectionTypeEClass, SECTION_TYPE__ITEMIZEDLIST);
		createEReference(sectionTypeEClass, SECTION_TYPE__MEDIAOBJECT);
		createEReference(sectionTypeEClass, SECTION_TYPE__NOTE);
		createEReference(sectionTypeEClass, SECTION_TYPE__PARA);
		createEReference(sectionTypeEClass, SECTION_TYPE__PROGRAMLISTING);
		createEReference(sectionTypeEClass, SECTION_TYPE__SECTION);
		createEReference(sectionTypeEClass, SECTION_TYPE__TITLE);
		createEReference(sectionTypeEClass, SECTION_TYPE__FIGURE);
		createEReference(sectionTypeEClass, SECTION_TYPE__INFORMALTABLE);
		createEReference(sectionTypeEClass, SECTION_TYPE__ORDEREDLIST);
		createEReference(sectionTypeEClass, SECTION_TYPE__TABLE);
		createEAttribute(sectionTypeEClass, SECTION_TYPE__WARNING);
		createEReference(sectionTypeEClass, SECTION_TYPE__TIP);
		createEReference(sectionTypeEClass, SECTION_TYPE__FUNCSYNOPSIS);
		createEAttribute(sectionTypeEClass, SECTION_TYPE__CAUTION);
		createEReference(sectionTypeEClass, SECTION_TYPE__EXAMPLE);
		createEReference(sectionTypeEClass, SECTION_TYPE__CMDSYNOPSIS);
		createEAttribute(sectionTypeEClass, SECTION_TYPE__ANNOTATIONS);

		segListItemTypeEClass = createEClass(SEG_LIST_ITEM_TYPE);
		createEReference(segListItemTypeEClass, SEG_LIST_ITEM_TYPE__SEG);

		segmentedListTypeEClass = createEClass(SEGMENTED_LIST_TYPE);
		createEAttribute(segmentedListTypeEClass, SEGMENTED_LIST_TYPE__GROUP);
		createEAttribute(segmentedListTypeEClass, SEGMENTED_LIST_TYPE__SEGTITLE);
		createEReference(segmentedListTypeEClass, SEGMENTED_LIST_TYPE__SEGLISTITEM);

		segTypeEClass = createEClass(SEG_TYPE);
		createEAttribute(segTypeEClass, SEG_TYPE__GROUP);
		createEAttribute(segTypeEClass, SEG_TYPE__MIXED);
		createEAttribute(segTypeEClass, SEG_TYPE__ERRORCODE);
		createEAttribute(segTypeEClass, SEG_TYPE__ERRORTEXT);

		subtitleTypeEClass = createEClass(SUBTITLE_TYPE);
		createEAttribute(subtitleTypeEClass, SUBTITLE_TYPE__MIXED);
		createEAttribute(subtitleTypeEClass, SUBTITLE_TYPE__GROUP);
		createEReference(subtitleTypeEClass, SUBTITLE_TYPE__EMPHASIS);
		createEReference(subtitleTypeEClass, SUBTITLE_TYPE__PHRASE);

		surnameTypeEClass = createEClass(SURNAME_TYPE);
		createEAttribute(surnameTypeEClass, SURNAME_TYPE__MIXED);

		tableTypeEClass = createEClass(TABLE_TYPE);
		createEReference(tableTypeEClass, TABLE_TYPE__TITLE);
		createEReference(tableTypeEClass, TABLE_TYPE__TGROUP);
		createEAttribute(tableTypeEClass, TABLE_TYPE__ID);

		termTypeEClass = createEClass(TERM_TYPE);
		createEAttribute(termTypeEClass, TERM_TYPE__MIXED);
		createEReference(termTypeEClass, TERM_TYPE__EMPHASIS);
		createEReference(termTypeEClass, TERM_TYPE__OPTION);
		createEReference(termTypeEClass, TERM_TYPE__FILENAME);
		createEReference(termTypeEClass, TERM_TYPE__ENVAR);

		tbodyTypeEClass = createEClass(TBODY_TYPE);
		createEReference(tbodyTypeEClass, TBODY_TYPE__ROW);

		tgroupTypeEClass = createEClass(TGROUP_TYPE);
		createEReference(tgroupTypeEClass, TGROUP_TYPE__COLSPEC);
		createEReference(tgroupTypeEClass, TGROUP_TYPE__THEAD);
		createEReference(tgroupTypeEClass, TGROUP_TYPE__TBODY);
		createEAttribute(tgroupTypeEClass, TGROUP_TYPE__COLS);
		createEAttribute(tgroupTypeEClass, TGROUP_TYPE__COLSEQ);
		createEAttribute(tgroupTypeEClass, TGROUP_TYPE__ROWSEQ);
		createEAttribute(tgroupTypeEClass, TGROUP_TYPE__ALIGN);

		theadTypeEClass = createEClass(THEAD_TYPE);
		createEReference(theadTypeEClass, THEAD_TYPE__ROW);

		tipTypeEClass = createEClass(TIP_TYPE);
		createEAttribute(tipTypeEClass, TIP_TYPE__MIXED);
		createEReference(tipTypeEClass, TIP_TYPE__ULINK);

		titleTypeEClass = createEClass(TITLE_TYPE);
		createEAttribute(titleTypeEClass, TITLE_TYPE__MIXED);
		createEAttribute(titleTypeEClass, TITLE_TYPE__GROUP);
		createEReference(titleTypeEClass, TITLE_TYPE__EMPHASIS);
		createEReference(titleTypeEClass, TITLE_TYPE__PHRASE);

		ulinkTypeEClass = createEClass(ULINK_TYPE);
		createEAttribute(ulinkTypeEClass, ULINK_TYPE__MIXED);
		createEReference(ulinkTypeEClass, ULINK_TYPE__EMPHASIS);
		createEAttribute(ulinkTypeEClass, ULINK_TYPE__TYPE);
		createEAttribute(ulinkTypeEClass, ULINK_TYPE__URL);

		variableListTypeEClass = createEClass(VARIABLE_LIST_TYPE);
		createEReference(variableListTypeEClass, VARIABLE_LIST_TYPE__VARLISTENTRY);

		varListEntryTypeEClass = createEClass(VAR_LIST_ENTRY_TYPE);
		createEAttribute(varListEntryTypeEClass, VAR_LIST_ENTRY_TYPE__SPACING);
		createEAttribute(varListEntryTypeEClass, VAR_LIST_ENTRY_TYPE__TERMLENGTH);
		createEReference(varListEntryTypeEClass, VAR_LIST_ENTRY_TYPE__TERM);
		createEReference(varListEntryTypeEClass, VAR_LIST_ENTRY_TYPE__LISTITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		orderedlistTypeEClass.getESuperTypes().add(this.getItemizedlistType());

		// Initialize classes and features; add operations and parameters
		initEClass(abstractTypeEClass, AbstractType.class, "AbstractType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAbstractType_Para(), this.getParaType(), null, "para", null, 1, 1, AbstractType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(addressTypeEClass, AddressType.class, "AddressType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAddressType_State(), theXMLTypePackage.getNCName(), "state", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAddressType_Otheraddr(), this.getOtheraddrType(), null, "otheraddr", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Format(), theXMLTypePackage.getNCName(), "format", null, 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAddressType_Email(), theXMLTypePackage.getString(), "email", "", 1, 1, AddressType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(argTypeEClass, ArgType.class, "ArgType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getArgType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgType_Option(), this.getOptionType(), null, "option", null, 0, -1, ArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getArgType_Replaceable(), this.getReplaceableType(), null, "replaceable", null, 0, -1, ArgType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgType_Choice(), theXMLTypePackage.getNCName(), "choice", null, 0, 1, ArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getArgType_Rep(), theXMLTypePackage.getNCName(), "rep", null, 0, 1, ArgType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorinitialsTypeEClass, AuthorinitialsType.class, "AuthorinitialsType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAuthorinitialsType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, AuthorinitialsType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(authorTypeEClass, AuthorType.class, "AuthorType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAuthorType_Personname(), this.getPersonnameType(), null, "personname", null, 1, 1, AuthorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAuthorType_Contrib(), theXMLTypePackage.getString(), "contrib", "", 1, 1, AuthorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAuthorType_Address(), this.getAddressType(), null, "address", null, 0, 1, AuthorType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(bookTypeEClass, BookType.class, "BookType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBookType_Info(), this.getInfoType(), null, "info", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Preface(), this.getPrefaceType(), null, "preface", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Chapter(), this.getChapterType(), null, "chapter", null, 1, -1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBookType_Reference(), this.getReferenceType(), null, "reference", null, 0, -1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Lang(), theXMLTypePackage.getNCName(), "lang", null, 1, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getBookType_Label(), ecorePackage.getEString(), "label", null, 0, 1, BookType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chapterTypeEClass, ChapterType.class, "ChapterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChapterType_Title(), this.getTitleType(), null, "title", null, 1, 1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChapterType_Para(), this.getParaType(), null, "para", null, 0, -1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChapterType_Note(), this.getNoteType(), null, "note", null, 0, 1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChapterType_Section(), this.getSectionType(), null, "section", null, 0, -1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getChapterType_Annotations(), theXMLTypePackage.getString(), "annotations", null, 0, 1, ChapterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(colspecTypeEClass, ColspecType.class, "ColspecType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getColspecType_Colname(), theXMLTypePackage.getNCName(), "colname", null, 1, 1, ColspecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getColspecType_Colwidth(), theXMLTypePackage.getNMTOKEN(), "colwidth", null, 1, 1, ColspecType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(cmdsynopsisTypeEClass, CmdsynopsisType.class, "CmdsynopsisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCmdsynopsisType_Command(), this.getCommandType(), null, "command", null, 1, 1, CmdsynopsisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCmdsynopsisType_Arg(), this.getArgType(), null, "arg", null, 0, -1, CmdsynopsisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(commandTypeEClass, CommandType.class, "CommandType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommandType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, 1, CommandType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(confgroupTypeEClass, ConfgroupType.class, "ConfgroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getConfgroupType_Conftitle(), theXMLTypePackage.getNCName(), "conftitle", null, 1, 1, ConfgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfgroupType_Confnum(), theXMLTypePackage.getNCName(), "confnum", null, 1, 1, ConfgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getConfgroupType_Confsponsor(), theXMLTypePackage.getNCName(), "confsponsor", null, 1, 1, ConfgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(copyrightTypeEClass, CopyrightType.class, "CopyrightType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCopyrightType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, CopyrightType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyrightType_Year(), theXMLTypePackage.getString(), "year", null, 0, -1, CopyrightType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getCopyrightType_Holder(), theXMLTypePackage.getString(), "holder", null, 0, -1, CopyrightType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(dateTypeEClass, DateType.class, "DateType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDateType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, DateType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), ecorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), ecorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Abstract(), this.getAbstractType(), null, "abstract", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Address(), this.getAddressType(), null, "address", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Author(), this.getAuthorType(), null, "author", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Bibliomisc(), theXMLTypePackage.getString(), "bibliomisc", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Book(), this.getBookType(), null, "book", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Info(), this.getInfoType(), null, "info", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Caution(), theXMLTypePackage.getString(), "caution", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Chapter(), this.getChapterType(), null, "chapter", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Colspec(), this.getColspecType(), null, "colspec", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Confgroup(), this.getConfgroupType(), null, "confgroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Confnum(), theXMLTypePackage.getNCName(), "confnum", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Confsponsor(), theXMLTypePackage.getNCName(), "confsponsor", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Conftitle(), theXMLTypePackage.getNCName(), "conftitle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Date(), theXMLTypePackage.getString(), "date", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Entry(), this.getEntryType(), null, "entry", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Figure(), this.getFigureType(), null, "figure", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Firstname(), theXMLTypePackage.getString(), "firstname", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Footnote(), this.getFootnoteType(), null, "footnote", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Imagedata(), this.getImagedataType(), null, "imagedata", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Imageobject(), this.getImageobjectType(), null, "imageobject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Important(), this.getImportantType(), null, "important", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Informaltable(), this.getInformaltableType(), null, "informaltable", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Itemizedlist(), this.getItemizedlistType(), null, "itemizedlist", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Keyword(), theXMLTypePackage.getNCName(), "keyword", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Keywordset(), this.getKeywordsetType(), null, "keywordset", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Link(), this.getLinkType(), null, "link", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Listitem(), this.getListitemType(), null, "listitem", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Literal(), this.getLiteralType(), null, "literal", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Note(), this.getNoteType(), null, "note", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Orderedlist(), this.getOrderedlistType(), null, "orderedlist", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Otheraddr(), this.getOtheraddrType(), null, "otheraddr", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Para(), this.getParaType(), null, "para", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Phrase(), this.getPhraseType(), null, "phrase", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Preface(), this.getPrefaceType(), null, "preface", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Programlisting(), this.getProgramlistingType(), null, "programlisting", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Pubdate(), theXMLTypePackage.getString(), "pubdate", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Publisher(), this.getPublisherType(), null, "publisher", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Publishername(), theXMLTypePackage.getNCName(), "publishername", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Row(), this.getRowType(), null, "row", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Section(), this.getSectionType(), null, "section", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_State(), theXMLTypePackage.getNCName(), "state", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Subtitle(), theXMLTypePackage.getString(), "subtitle", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Superscript(), theXMLTypePackage.getNCName(), "superscript", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Table(), this.getTableType(), null, "table", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tbody(), this.getTbodyType(), null, "tbody", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tgroup(), this.getTgroupType(), null, "tgroup", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Thead(), this.getTheadType(), null, "thead", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Tip(), this.getTipType(), null, "tip", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Title(), this.getTitleType(), null, "title", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getDocumentRoot_Warning(), theXMLTypePackage.getString(), "warning", null, 0, -2, null, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(emphasisTypeEClass, EmphasisType.class, "EmphasisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEmphasisType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EmphasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEmphasisType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, EmphasisType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getEmphasisType_Role(), theXMLTypePackage.getNCName(), "role", null, 0, 1, EmphasisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(entryTypeEClass, EntryType.class, "EntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntryType_Programlisting(), this.getProgramlistingType(), null, "programlisting", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntryType_Para(), this.getParaType(), null, "para", null, 0, -1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Align(), theXMLTypePackage.getNCName(), "align", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Morerows(), theXMLTypePackage.getInteger(), "morerows", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Nameend(), theXMLTypePackage.getNCName(), "nameend", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Namest(), theXMLTypePackage.getNCName(), "namest", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntryType_Valign(), theXMLTypePackage.getNCName(), "valign", null, 0, 1, EntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(envarTypeEClass, EnvarType.class, "EnvarType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getEnvarType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, EnvarType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEnvarType_Replaceable(), this.getReplaceableType(), null, "replaceable", null, 0, -1, EnvarType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(exampleTypeEClass, ExampleType.class, "ExampleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getExampleType_Id(), ecorePackage.getEString(), "id", null, 1, 1, ExampleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleType_Title(), this.getTitleType(), null, "title", null, 1, 1, ExampleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getExampleType_Programlisting(), this.getProgramlistingType(), null, "programlisting", null, 1, 1, ExampleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(figureTypeEClass, FigureType.class, "FigureType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFigureType_Title(), this.getTitleType(), null, "title", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFigureType_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigureType_Float(), theXMLTypePackage.getInteger(), "float", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFigureType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, FigureType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileNameTypeEClass, FileNameType.class, "FileNameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFileNameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, FileNameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFileNameType_Replaceable(), this.getReplaceableType(), null, "replaceable", null, 0, -1, FileNameType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(firstnameTypeEClass, FirstnameType.class, "FirstnameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFirstnameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, FirstnameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(footnoteTypeEClass, FootnoteType.class, "FootnoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFootnoteType_Para(), this.getParaType(), null, "para", null, 1, 1, FootnoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFootnoteType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, FootnoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcdefTypeEClass, FuncdefType.class, "FuncdefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFuncdefType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 1, -1, FuncdefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncdefType_Function(), this.getFunctionType(), null, "function", null, 0, 1, FuncdefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcprototypeTypeEClass, FuncprototypeType.class, "FuncprototypeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuncprototypeType_Funcdef(), this.getFuncdefType(), null, "funcdef", null, 1, 1, FuncprototypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFuncprototypeType_Paramdef(), this.getParamdefType(), null, "paramdef", null, 0, -1, FuncprototypeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(funcsynopsisTypeEClass, FuncsynopsisType.class, "FuncsynopsisType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFuncsynopsisType_Funcprototype(), this.getFuncprototypeType(), null, "funcprototype", null, 1, -1, FuncsynopsisType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionTypeEClass, FunctionType.class, "FunctionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, 1, FunctionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imagedataTypeEClass, ImagedataType.class, "ImagedataType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImagedataType_Depth(), theXMLTypePackage.getNMTOKEN(), "depth", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagedataType_Fileref(), theXMLTypePackage.getAnySimpleType(), "fileref", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagedataType_Width(), theXMLTypePackage.getNMTOKEN(), "width", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagedataType_Align(), theXMLTypePackage.getNMTOKEN(), "align", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImagedataType_Scale(), theXMLTypePackage.getNMTOKEN(), "scale", null, 1, 1, ImagedataType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(imageobjectTypeEClass, ImageobjectType.class, "ImageobjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getImageobjectType_Imagedata(), this.getImagedataType(), null, "imagedata", null, 1, 1, ImageobjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(importantTypeEClass, ImportantType.class, "ImportantType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getImportantType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ImportantType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getImportantType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ImportantType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImportantType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, ImportantType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getImportantType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, ImportantType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(informaltableTypeEClass, InformaltableType.class, "InformaltableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getInformaltableType_Tgroup(), this.getTgroupType(), null, "tgroup", null, 1, 1, InformaltableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(infoTypeEClass, InfoType.class, "InfoType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInfoType_Pubdate(), theXMLTypePackage.getString(), "pubdate", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Author(), this.getAuthorType(), null, "author", null, 0, -1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Title(), this.getTitleType(), null, "title", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Subtitle(), this.getSubtitleType(), null, "subtitle", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoType_Bibliomisc(), theXMLTypePackage.getString(), "bibliomisc", null, 0, -1, InfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoType_Date(), theXMLTypePackage.getString(), "date", null, 0, -1, InfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Keywordset(), this.getKeywordsetType(), null, "keywordset", null, 0, -1, InfoType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Abstract(), this.getAbstractType(), null, "abstract", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Publisher(), this.getPublisherType(), null, "publisher", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Confgroup(), this.getConfgroupType(), null, "confgroup", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Revhistory(), this.getRevhistoryType(), null, "revhistory", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Copyright(), this.getCopyrightType(), null, "copyright", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInfoType_Legalnotice(), this.getLegalNoticeType(), null, "legalnotice", null, 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoType_Productname(), theXMLTypePackage.getString(), "productname", "", 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getInfoType_Releaseinfo(), theXMLTypePackage.getString(), "releaseinfo", "", 1, 1, InfoType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(itemizedlistTypeEClass, ItemizedlistType.class, "ItemizedlistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getItemizedlistType_Listitem(), this.getListitemType(), null, "listitem", null, 0, -1, ItemizedlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(keywordsetTypeEClass, KeywordsetType.class, "KeywordsetType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getKeywordsetType_Keyword(), theXMLTypePackage.getNCName(), "keyword", null, 1, -1, KeywordsetType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(legalNoticeTypeEClass, LegalNoticeType.class, "LegalNoticeType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLegalNoticeType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, LegalNoticeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalNoticeType_Title(), this.getTitleType(), null, "title", null, 1, 1, LegalNoticeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalNoticeType_Revhistory(), this.getRevhistoryType(), null, "revhistory", null, 1, 1, LegalNoticeType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLegalNoticeType_Para(), this.getParaType(), null, "para", null, 0, -1, LegalNoticeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getLegalNoticeType_Orderedlist(), this.getOrderedlistType(), null, "orderedlist", null, 0, -1, LegalNoticeType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(linkTypeEClass, LinkType.class, "LinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLinkType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Value(), theXMLTypePackage.getNMTOKEN(), "value", null, 0, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLinkType_Linkend(), theXMLTypePackage.getNMTOKEN(), "linkend", null, 1, 1, LinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(listitemTypeEClass, ListitemType.class, "ListitemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getListitemType_Para(), this.getParaType(), null, "para", null, 0, -1, ListitemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getListitemType_Itemizedlist(), this.getItemizedlistType(), null, "itemizedlist", null, 0, 1, ListitemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(literalTypeEClass, LiteralType.class, "LiteralType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLiteralType_Value(), theXMLTypePackage.getAnyURI(), "value", null, 0, 1, LiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getLiteralType_Moreinfo(), theXMLTypePackage.getNCName(), "moreinfo", null, 1, 1, LiteralType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mediaobjectTypeEClass, MediaobjectType.class, "MediaobjectType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMediaobjectType_Imageobject(), this.getImageobjectType(), null, "imageobject", null, 0, 1, MediaobjectType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(noteTypeEClass, NoteType.class, "NoteType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNoteType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, NoteType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getNoteType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, NoteType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNoteType_Literal(), this.getLiteralType(), null, "literal", null, 0, -1, NoteType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getNoteType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, NoteType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(optionTypeEClass, OptionType.class, "OptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOptionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, OptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getOptionType_Replaceable(), this.getReplaceableType(), null, "replaceable", null, 0, -1, OptionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(orderedlistTypeEClass, OrderedlistType.class, "OrderedlistType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOrderedlistType_Continuation(), theXMLTypePackage.getNCName(), "continuation", null, 1, 1, OrderedlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getOrderedlistType_Inheritnum(), theXMLTypePackage.getNCName(), "inheritnum", null, 1, 1, OrderedlistType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(otheraddrTypeEClass, OtheraddrType.class, "OtheraddrType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getOtheraddrType_Ulink(), this.getUlinkType(), null, "ulink", null, 1, 1, OtheraddrType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(parameterTypeEClass, ParameterType.class, "ParameterType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParameterType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 1, 1, ParameterType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paramdefTypeEClass, ParamdefType.class, "ParamdefType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParamdefType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ParamdefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParamdefType_Parameter(), this.getParameterType(), null, "parameter", null, 1, 1, ParamdefType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(paraTypeEClass, ParaType.class, "ParaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getParaType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Literal(), this.getLiteralType(), null, "literal", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Footnote(), this.getFootnoteType(), null, "footnote", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Link(), this.getLinkType(), null, "link", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_Role(), theXMLTypePackage.getNCName(), "role", null, 0, 1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Itemizedlist(), this.getItemizedlistType(), null, "itemizedlist", null, 0, -1, ParaType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getParaType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getParaType_Variablelist(), this.getVariableListType(), null, "variablelist", null, 0, -1, ParaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(personnameTypeEClass, PersonnameType.class, "PersonnameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPersonnameType_Firstname(), this.getFirstnameType(), null, "firstname", null, 1, 1, PersonnameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPersonnameType_Surname(), this.getSurnameType(), null, "surname", null, 1, 1, PersonnameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(phraseTypeEClass, PhraseType.class, "PhraseType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPhraseType_Id(), theXMLTypePackage.getNMTOKEN(), "id", null, 1, 1, PhraseType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(prefaceTypeEClass, PrefaceType.class, "PrefaceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getPrefaceType_Title(), this.getTitleType(), null, "title", null, 1, 1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefaceType_Para(), this.getParaType(), null, "para", null, 1, -1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefaceType_Important(), this.getImportantType(), null, "important", null, 1, 1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPrefaceType_Tip(), this.getTipType(), null, "tip", null, 1, 1, PrefaceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(programlistingTypeEClass, ProgramlistingType.class, "ProgramlistingType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getProgramlistingType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ProgramlistingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProgramlistingType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getProgramlistingType_Phrase(), this.getPhraseType(), null, "phrase", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Superscript(), theXMLTypePackage.getNCName(), "superscript", null, 0, -1, ProgramlistingType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Format(), theXMLTypePackage.getNCName(), "format", null, 1, 1, ProgramlistingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Language(), ecorePackage.getEString(), "language", null, 1, 1, ProgramlistingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getProgramlistingType_Linenumbering(), ecorePackage.getEString(), "linenumbering", null, 1, 1, ProgramlistingType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(publisherTypeEClass, PublisherType.class, "PublisherType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPublisherType_Publishername(), theXMLTypePackage.getNCName(), "publishername", null, 1, 1, PublisherType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPublisherType_Address(), this.getAddressType(), null, "address", null, 1, 1, PublisherType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refEntryTypeEClass, RefEntryType.class, "RefEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefEntryType_Info(), this.getInfoType(), null, "info", null, 0, 1, RefEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefEntryType_Refmeta(), this.getRefMetaType(), null, "refmeta", null, 0, 1, RefEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefEntryType_Refnamediv(), this.getRefNameDivType(), null, "refnamediv", null, 0, 1, RefEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefEntryType_Refsynopsisdiv(), this.getRefSynopsisDivType(), null, "refsynopsisdiv", null, 0, 1, RefEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefEntryType_Refsect1(), this.getRefSect1Type(), null, "refsect1", null, 0, -1, RefEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefEntryType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, RefEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(refEntryTitleTypeEClass, RefEntryTitleType.class, "RefEntryTitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefEntryTitleType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, RefEntryTitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(referenceTypeEClass, ReferenceType.class, "ReferenceType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getReferenceType_Info(), this.getInfoType(), null, "info", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceType_Title(), this.getTitleType(), null, "title", null, 1, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getReferenceType_Version(), theXMLTypePackage.getString(), "version", null, 0, 1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getReferenceType_Refentry(), this.getRefEntryType(), null, "refentry", null, 0, -1, ReferenceType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refMetaTypeEClass, RefMetaType.class, "RefMetaType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefMetaType_Refentrytitle(), this.getRefEntryTitleType(), null, "refentrytitle", null, 1, 1, RefMetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefMetaType_Manvolnum(), theXMLTypePackage.getString(), "manvolnum", "", 1, 1, RefMetaType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refNameDivTypeEClass, RefNameDivType.class, "RefNameDivType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefNameDivType_Refname(), theXMLTypePackage.getString(), "refname", "", 1, 1, RefNameDivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefNameDivType_Refpurpose(), theXMLTypePackage.getString(), "refpurpose", "", 1, 1, RefNameDivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefNameDivType_Refclass(), theXMLTypePackage.getString(), "refclass", "", 1, 1, RefNameDivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refSect1TypeEClass, RefSect1Type.class, "RefSect1Type", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRefSect1Type_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, RefSect1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefSect1Type_Title(), this.getTitleType(), null, "title", null, 1, 1, RefSect1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRefSect1Type_Para(), this.getParaType(), null, "para", null, 0, -1, RefSect1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRefSect1Type_Variablelist(), this.getVariableListType(), null, "variablelist", null, 0, -1, RefSect1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getRefSect1Type_Segmentedlist(), this.getSegmentedListType(), null, "segmentedlist", null, 0, -1, RefSect1Type.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getRefSect1Type_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, RefSect1Type.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(refSynopsisDivTypeEClass, RefSynopsisDivType.class, "RefSynopsisDivType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRefSynopsisDivType_Cmdsynopsis(), this.getCmdsynopsisType(), null, "cmdsynopsis", null, 0, -1, RefSynopsisDivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRefSynopsisDivType_Funcsynopsis(), this.getFuncsynopsisType(), null, "funcsynopsis", null, 0, -1, RefSynopsisDivType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(replaceableTypeEClass, ReplaceableType.class, "ReplaceableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getReplaceableType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, ReplaceableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revdescriptionTypeEClass, RevdescriptionType.class, "RevdescriptionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevdescriptionType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, RevdescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevdescriptionType_Para(), this.getParaType(), null, "para", null, 0, -1, RevdescriptionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revhistoryTypeEClass, RevhistoryType.class, "RevhistoryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevhistoryType_Revision(), this.getRevisionType(), null, "revision", null, 0, -1, RevhistoryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revisionTypeEClass, RevisionType.class, "RevisionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRevisionType_Revnumber(), this.getRevnumberType(), null, "revnumber", null, 0, 1, RevisionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionType_Date(), this.getDateType(), null, "date", null, 0, 1, RevisionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionType_Authorinitials(), this.getAuthorinitialsType(), null, "authorinitials", null, 0, 1, RevisionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevisionType_Revdescription(), this.getRevdescriptionType(), null, "revdescription", null, 0, 1, RevisionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(revnumberTypeEClass, RevnumberType.class, "RevnumberType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRevnumberType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, RevnumberType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRevnumberType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, RevnumberType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(rowTypeEClass, RowType.class, "RowType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRowType_Entry(), this.getEntryType(), null, "entry", null, 1, -1, RowType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sectionTypeEClass, SectionType.class, "SectionType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSectionType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Itemizedlist(), this.getItemizedlistType(), null, "itemizedlist", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Mediaobject(), this.getMediaobjectType(), null, "mediaobject", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Note(), this.getNoteType(), null, "note", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Para(), this.getParaType(), null, "para", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Programlisting(), this.getProgramlistingType(), null, "programlisting", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Section(), this.getSectionType(), null, "section", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Title(), this.getTitleType(), null, "title", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Figure(), this.getFigureType(), null, "figure", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Informaltable(), this.getInformaltableType(), null, "informaltable", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Orderedlist(), this.getOrderedlistType(), null, "orderedlist", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Table(), this.getTableType(), null, "table", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionType_Warning(), theXMLTypePackage.getString(), "warning", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Tip(), this.getTipType(), null, "tip", null, 0, 1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Funcsynopsis(), this.getFuncsynopsisType(), null, "funcsynopsis", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionType_Caution(), theXMLTypePackage.getString(), "caution", null, 0, 1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Example(), this.getExampleType(), null, "example", null, 0, 1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSectionType_Cmdsynopsis(), this.getCmdsynopsisType(), null, "cmdsynopsis", null, 0, -1, SectionType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSectionType_Annotations(), theXMLTypePackage.getString(), "annotations", null, 0, 1, SectionType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segListItemTypeEClass, SegListItemType.class, "SegListItemType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSegListItemType_Seg(), this.getSegType(), null, "seg", null, 1, -1, SegListItemType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(segmentedListTypeEClass, SegmentedListType.class, "SegmentedListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegmentedListType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SegmentedListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegmentedListType_Segtitle(), theXMLTypePackage.getString(), "segtitle", null, 0, -1, SegmentedListType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSegmentedListType_Seglistitem(), this.getSegListItemType(), null, "seglistitem", null, 0, -1, SegmentedListType.class, !IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(segTypeEClass, SegType.class, "SegType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSegType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SegType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SegType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegType_Errorcode(), theXMLTypePackage.getString(), "errorcode", null, 0, -1, SegType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getSegType_Errortext(), theXMLTypePackage.getString(), "errortext", null, 0, -1, SegType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(subtitleTypeEClass, SubtitleType.class, "SubtitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSubtitleType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SubtitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSubtitleType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, SubtitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubtitleType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, SubtitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getSubtitleType_Phrase(), this.getPhraseType(), null, "phrase", null, 0, -1, SubtitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(surnameTypeEClass, SurnameType.class, "SurnameType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSurnameType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, SurnameType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tableTypeEClass, TableType.class, "TableType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableType_Title(), this.getTitleType(), null, "title", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTableType_Tgroup(), this.getTgroupType(), null, "tgroup", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTableType_Id(), theXMLTypePackage.getNCName(), "id", null, 1, 1, TableType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(termTypeEClass, TermType.class, "TermType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTermType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, TermType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTermType_Option(), this.getOptionType(), null, "option", null, 0, -1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermType_Filename(), this.getFileNameType(), null, "filename", null, 0, -1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTermType_Envar(), this.getEnvarType(), null, "envar", null, 0, -1, TermType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tbodyTypeEClass, TbodyType.class, "TbodyType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTbodyType_Row(), this.getRowType(), null, "row", null, 1, -1, TbodyType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tgroupTypeEClass, TgroupType.class, "TgroupType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTgroupType_Colspec(), this.getColspecType(), null, "colspec", null, 1, -1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTgroupType_Thead(), this.getTheadType(), null, "thead", null, 0, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTgroupType_Tbody(), this.getTbodyType(), null, "tbody", null, 1, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTgroupType_Cols(), theXMLTypePackage.getInteger(), "cols", null, 1, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTgroupType_Colseq(), theXMLTypePackage.getInteger(), "colseq", null, 1, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTgroupType_Rowseq(), theXMLTypePackage.getInteger(), "rowseq", null, 1, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTgroupType_Align(), theXMLTypePackage.getNMTOKEN(), "align", null, 1, 1, TgroupType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(theadTypeEClass, TheadType.class, "TheadType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTheadType_Row(), this.getRowType(), null, "row", null, 1, -1, TheadType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(tipTypeEClass, TipType.class, "TipType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTipType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TipType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTipType_Ulink(), this.getUlinkType(), null, "ulink", null, 0, -1, TipType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(titleTypeEClass, TitleType.class, "TitleType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTitleType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, TitleType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTitleType_Group(), ecorePackage.getEFeatureMapEntry(), "group", null, 0, -1, TitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTitleType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, TitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getTitleType_Phrase(), this.getPhraseType(), null, "phrase", null, 0, -1, TitleType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);

		initEClass(ulinkTypeEClass, UlinkType.class, "UlinkType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUlinkType_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, UlinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUlinkType_Emphasis(), this.getEmphasisType(), null, "emphasis", null, 0, -1, UlinkType.class, IS_TRANSIENT, IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlinkType_Type(), theXMLTypePackage.getAnySimpleType(), "type", null, 0, 1, UlinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getUlinkType_Url(), theXMLTypePackage.getAnyURI(), "url", null, 1, 1, UlinkType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(variableListTypeEClass, VariableListType.class, "VariableListType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getVariableListType_Varlistentry(), this.getVarListEntryType(), null, "varlistentry", null, 0, -1, VariableListType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(varListEntryTypeEClass, VarListEntryType.class, "VarListEntryType", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVarListEntryType_Spacing(), ecorePackage.getEString(), "spacing", null, 0, 1, VarListEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getVarListEntryType_Termlength(), ecorePackage.getEString(), "termlength", null, 0, 1, VarListEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarListEntryType_Term(), this.getTermType(), null, "term", null, 1, -1, VarListEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getVarListEntryType_Listitem(), this.getListitemType(), null, "listitem", null, 1, 1, VarListEntryType.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });		
		addAnnotation
		  (abstractTypeEClass, 
		   source, 
		   new String[] {
			 "name", "abstract_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAbstractType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (addressTypeEClass, 
		   source, 
		   new String[] {
			 "name", "address_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAddressType_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_Otheraddr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "otheraddr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAddressType_Email(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "email",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (argTypeEClass, 
		   source, 
		   new String[] {
			 "name", "arg_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getArgType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getArgType_Replaceable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "replaceable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getArgType_Choice(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "choice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getArgType_Rep(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rep",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (authorinitialsTypeEClass, 
		   source, 
		   new String[] {
			 "name", "authorinitials_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getAuthorinitialsType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (authorTypeEClass, 
		   source, 
		   new String[] {
			 "name", "author_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getAuthorType_Personname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "personname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthorType_Contrib(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "contrib",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getAuthorType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (bookTypeEClass, 
		   source, 
		   new String[] {
			 "name", "book_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getBookType_Info(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "info",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Preface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Chapter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chapter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Reference(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "reference",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Lang(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "lang",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getBookType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (chapterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "chapter_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getChapterType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChapterType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChapterType_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "note",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getChapterType_Section(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "section",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (colspecTypeEClass, 
		   source, 
		   new String[] {
			 "name", "colspec_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getColspecType_Colname(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getColspecType_Colwidth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colwidth",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (cmdsynopsisTypeEClass, 
		   source, 
		   new String[] {
			 "name", "cmdsynopsis_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCmdsynopsisType_Command(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "command",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getCmdsynopsisType_Arg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "arg",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (commandTypeEClass, 
		   source, 
		   new String[] {
			 "name", "arg_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getCommandType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (confgroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "confgroup_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getConfgroupType_Conftitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conftitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfgroupType_Confnum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confnum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getConfgroupType_Confsponsor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confsponsor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (copyrightTypeEClass, 
		   source, 
		   new String[] {
			 "name", "copyright_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getCopyrightType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });		
		addAnnotation
		  (getCopyrightType_Year(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "year",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getCopyrightType_Holder(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "holder",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (dateTypeEClass, 
		   source, 
		   new String[] {
			 "name", "date_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDateType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "name", "",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xmlns:prefix"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "xsi:schemaLocation"
		   });		
		addAnnotation
		  (getDocumentRoot_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Bibliomisc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bibliomisc",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Book(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "book",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Info(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "info",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Caution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Chapter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "chapter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Colspec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colspec",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Confgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Confnum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confnum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Confsponsor(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confsponsor",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Conftitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "conftitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Entry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Figure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "figure",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Firstname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Footnote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "footnote",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Imagedata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imagedata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Imageobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Important(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "important",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Informaltable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "informaltable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Itemizedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemizedlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Keyword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyword",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Keywordset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keywordset",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Listitem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listitem",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Literal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "note",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Orderedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orderedlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Otheraddr(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "otheraddr",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Phrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phrase",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Preface(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "preface",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Programlisting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programlisting",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Pubdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pubdate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Publisher(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publisher",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Publishername(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishername",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Section(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "section",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_State(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "state",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Subtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "subtitle",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Superscript(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "superscript",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tbody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tbody",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Thead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Tip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Warning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warning",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (emphasisTypeEClass, 
		   source, 
		   new String[] {
			 "name", "emphasis_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getEmphasisType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getEmphasisType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEmphasisType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (entryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "entry_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getEntryType_Programlisting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programlisting",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getEntryType_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Morerows(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "morerows",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Nameend(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "nameend",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Namest(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "namest",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getEntryType_Valign(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "valign",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (envarTypeEClass, 
		   source, 
		   new String[] {
			 "name", "envar_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getEnvarType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getEnvarType_Replaceable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "replaceable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (exampleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "example_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getExampleType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getExampleType_Programlisting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programlisting",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (figureTypeEClass, 
		   source, 
		   new String[] {
			 "name", "figure_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFigureType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFigureType_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFigureType_Float(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "float",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFigureType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (fileNameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "filename_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFileNameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getFileNameType_Replaceable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "replaceable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (firstnameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "firstname_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFirstnameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (footnoteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "footnote_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getFootnoteType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFootnoteType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (funcdefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "funcdef_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFuncdefType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getFuncdefType_Function(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "function",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (funcprototypeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "funcprototype_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFuncprototypeType_Funcdef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "funcdef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getFuncprototypeType_Paramdef(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "paramdef",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (funcsynopsisTypeEClass, 
		   source, 
		   new String[] {
			 "name", "funcsynopsis_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFuncsynopsisType_Funcprototype(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "funcprototype",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (functionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "function_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getFunctionType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (imagedataTypeEClass, 
		   source, 
		   new String[] {
			 "name", "imagedata_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getImagedataType_Depth(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "depth",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImagedataType_Fileref(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "fileref",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getImagedataType_Width(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "width",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (imageobjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "imageobject_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getImageobjectType_Imagedata(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imagedata",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (importantTypeEClass, 
		   source, 
		   new String[] {
			 "name", "important_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getImportantType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getImportantType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getImportantType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getImportantType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (informaltableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "informaltable_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInformaltableType_Tgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (infoTypeEClass, 
		   source, 
		   new String[] {
			 "name", "info_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getInfoType_Pubdate(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "pubdate",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Author(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "author",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Subtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:3"
		   });		
		addAnnotation
		  (getInfoType_Bibliomisc(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "bibliomisc",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getInfoType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getInfoType_Keywordset(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keywordset",
			 "namespace", "##targetNamespace",
			 "group", "group:3"
		   });		
		addAnnotation
		  (getInfoType_Abstract(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "abstract",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Publisher(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publisher",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Confgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "confgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Revhistory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "revhistory",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Copyright(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "copyright",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Legalnotice(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "legalnotice",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Productname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "productname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getInfoType_Releaseinfo(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "releaseinfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (itemizedlistTypeEClass, 
		   source, 
		   new String[] {
			 "name", "itemizedlist_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getItemizedlistType_Listitem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "listitem",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (keywordsetTypeEClass, 
		   source, 
		   new String[] {
			 "name", "keywordset_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getKeywordsetType_Keyword(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "keyword",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (legalNoticeTypeEClass, 
		   source, 
		   new String[] {
			 "name", "legalnotice_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getLegalNoticeType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getLegalNoticeType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getLegalNoticeType_Revhistory(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "revhistory",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getLegalNoticeType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getLegalNoticeType_Orderedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orderedlist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (linkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "link_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLinkType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getLinkType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLinkType_Linkend(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "linkend",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (listitemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "listitem_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getListitemType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getListitemType_Itemizedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemizedlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (literalTypeEClass, 
		   source, 
		   new String[] {
			 "name", "literal_._type",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLiteralType_Value(), 
		   source, 
		   new String[] {
			 "name", ":0",
			 "kind", "simple"
		   });		
		addAnnotation
		  (getLiteralType_Moreinfo(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "moreinfo",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (mediaobjectTypeEClass, 
		   source, 
		   new String[] {
			 "name", "mediaobject_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getMediaobjectType_Imageobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "imageobject",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (noteTypeEClass, 
		   source, 
		   new String[] {
			 "name", "note_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getNoteType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getNoteType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getNoteType_Literal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getNoteType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (optionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "option_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getOptionType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getOptionType_Replaceable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "replaceable",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (orderedlistTypeEClass, 
		   source, 
		   new String[] {
			 "name", "orderedlist_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOrderedlistType_Continuation(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "continuation",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getOrderedlistType_Inheritnum(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "inheritnum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (otheraddrTypeEClass, 
		   source, 
		   new String[] {
			 "name", "otheraddr_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getOtheraddrType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (parameterTypeEClass, 
		   source, 
		   new String[] {
			 "name", "parameter_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getParameterType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (paramdefTypeEClass, 
		   source, 
		   new String[] {
			 "name", "paramdef_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getParamdefType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getParamdefType_Parameter(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "parameter",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (paraTypeEClass, 
		   source, 
		   new String[] {
			 "name", "para_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getParaType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getParaType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getParaType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Literal(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "literal",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Footnote(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "footnote",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Link(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "link",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getParaType_Role(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "role",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParaType_Itemizedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemizedlist",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getParaType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "xml"
		   });		
		addAnnotation
		  (personnameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "personname_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPersonnameType_Firstname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "firstname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPersonnameType_Surname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "surname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (phraseTypeEClass, 
		   source, 
		   new String[] {
			 "name", "phrase_._type",
			 "kind", "empty"
		   });		
		addAnnotation
		  (getPhraseType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (prefaceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "preface_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPrefaceType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPrefaceType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPrefaceType_Important(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "important",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPrefaceType_Tip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (programlistingTypeEClass, 
		   source, 
		   new String[] {
			 "name", "programlisting_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getProgramlistingType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getProgramlistingType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Phrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phrase",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Superscript(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "superscript",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getProgramlistingType_Format(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "format",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (publisherTypeEClass, 
		   source, 
		   new String[] {
			 "name", "publisher_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getPublisherType_Publishername(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "publishername",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getPublisherType_Address(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "address",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (refEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "refentry_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRefEntryType_Info(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "info",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRefEntryType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (refEntryTitleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "refentrytitle_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getRefEntryTitleType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (referenceTypeEClass, 
		   source, 
		   new String[] {
			 "name", "reference_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getReferenceType_Info(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "info",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getReferenceType_Version(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "version"
		   });		
		addAnnotation
		  (getReferenceType_Refentry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refentry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (refMetaTypeEClass, 
		   source, 
		   new String[] {
			 "name", "refmeta_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRefMetaType_Manvolnum(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "manvolnum",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (refNameDivTypeEClass, 
		   source, 
		   new String[] {
			 "name", "refnamediv_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRefNameDivType_Refname(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refname",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRefNameDivType_Refpurpose(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refpurpose",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRefNameDivType_Refclass(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "refclass",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (refSect1TypeEClass, 
		   source, 
		   new String[] {
			 "name", "refsect1_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRefSect1Type_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getRefSect1Type_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getRefSect1Type_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getRefSect1Type_Variablelist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "variablelist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getRefSect1Type_Segmentedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "segmentedlist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getRefSect1Type_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (refSynopsisDivTypeEClass, 
		   source, 
		   new String[] {
			 "name", "refsynopsisdiv_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (replaceableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "arg_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getReplaceableType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (revdescriptionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "revdescription_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getRevdescriptionType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getRevdescriptionType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (revhistoryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "revhistory_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRevhistoryType_Revision(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "revision",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (revisionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "revision_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRevisionType_Revnumber(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "revnumber",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRevisionType_Date(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "date",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRevisionType_Authorinitials(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "authorinitials",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getRevisionType_Revdescription(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "revdescription",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (revnumberTypeEClass, 
		   source, 
		   new String[] {
			 "name", "revnumber_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getRevnumberType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getRevnumberType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (rowTypeEClass, 
		   source, 
		   new String[] {
			 "name", "row_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getRowType_Entry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "entry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (sectionTypeEClass, 
		   source, 
		   new String[] {
			 "name", "section_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSectionType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Itemizedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "itemizedlist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Mediaobject(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "mediaobject",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Note(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "note",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Para(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "para",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Programlisting(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "programlisting",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Section(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "section",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Figure(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "figure",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Informaltable(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "informaltable",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Orderedlist(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "orderedlist",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Table(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "table",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Warning(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "warning",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Tip(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tip",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSectionType_Funcsynopsis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "funcsynopsis",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Caution(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "caution",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getSectionType_Example(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "example",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSectionType_Cmdsynopsis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "cmdsynopsis",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (segListItemTypeEClass, 
		   source, 
		   new String[] {
			 "name", "seglistitem_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSegListItemType_Seg(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "seg",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (segmentedListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "segmentedlist_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSegmentedListType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSegmentedListType_Segtitle(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "segtitle",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSegmentedListType_Seglistitem(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "seglistitem",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (segTypeEClass, 
		   source, 
		   new String[] {
			 "name", "seg_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getSegType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:0"
		   });		
		addAnnotation
		  (getSegType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSegType_Errorcode(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "errorcode",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (getSegType_Errortext(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "errortext",
			 "namespace", "##targetNamespace",
			 "group", "group:0"
		   });		
		addAnnotation
		  (subtitleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "subtitle_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSubtitleType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getSubtitleType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getSubtitleType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getSubtitleType_Phrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phrase",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (surnameTypeEClass, 
		   source, 
		   new String[] {
			 "name", "surname_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getSurnameType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (tableTypeEClass, 
		   source, 
		   new String[] {
			 "name", "table_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTableType_Title(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "title",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Tgroup(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tgroup",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTableType_Id(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "id",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (termTypeEClass, 
		   source, 
		   new String[] {
			 "name", "term_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTermType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTermType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (tbodyTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tbody_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTbodyType_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tgroupTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tgroup_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTgroupType_Colspec(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "colspec",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Thead(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "thead",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Tbody(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "tbody",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Cols(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "cols",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Colseq(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "colseq",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Rowseq(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "rowseq",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTgroupType_Align(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "align",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (theadTypeEClass, 
		   source, 
		   new String[] {
			 "name", "thead_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getTheadType_Row(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "row",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (tipTypeEClass, 
		   source, 
		   new String[] {
			 "name", "tip_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTipType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTipType_Ulink(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "ulink",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (titleTypeEClass, 
		   source, 
		   new String[] {
			 "name", "title_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getTitleType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getTitleType_Group(), 
		   source, 
		   new String[] {
			 "kind", "group",
			 "name", "group:1"
		   });		
		addAnnotation
		  (getTitleType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (getTitleType_Phrase(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "phrase",
			 "namespace", "##targetNamespace",
			 "group", "group:1"
		   });		
		addAnnotation
		  (ulinkTypeEClass, 
		   source, 
		   new String[] {
			 "name", "ulink_._type",
			 "kind", "mixed"
		   });		
		addAnnotation
		  (getUlinkType_Mixed(), 
		   source, 
		   new String[] {
			 "kind", "elementWildcard",
			 "name", ":mixed"
		   });		
		addAnnotation
		  (getUlinkType_Emphasis(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "emphasis",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUlinkType_Type(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "type",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getUlinkType_Url(), 
		   source, 
		   new String[] {
			 "kind", "attribute",
			 "name", "url",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (variableListTypeEClass, 
		   source, 
		   new String[] {
			 "name", "variablelist_._type",
			 "kind", "elementOnly"
		   });		
		addAnnotation
		  (getVariableListType_Varlistentry(), 
		   source, 
		   new String[] {
			 "kind", "element",
			 "name", "varlistentry",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (varListEntryTypeEClass, 
		   source, 
		   new String[] {
			 "name", "varlistentry_._type",
			 "kind", "elementOnly"
		   });
	}

} //DocbookPackageImpl
