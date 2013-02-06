/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.kermeta.Docbook.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.kermeta.Docbook.DocbookPackage
 * @generated
 */
public class DocbookSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static DocbookPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocbookSwitch() {
		if (modelPackage == null) {
			modelPackage = DocbookPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case DocbookPackage.ABSTRACT_TYPE: {
				AbstractType abstractType = (AbstractType)theEObject;
				T result = caseAbstractType(abstractType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ADDRESS_TYPE: {
				AddressType addressType = (AddressType)theEObject;
				T result = caseAddressType(addressType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ARG_TYPE: {
				ArgType argType = (ArgType)theEObject;
				T result = caseArgType(argType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AUTHORINITIALS_TYPE: {
				AuthorinitialsType authorinitialsType = (AuthorinitialsType)theEObject;
				T result = caseAuthorinitialsType(authorinitialsType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.AUTHOR_TYPE: {
				AuthorType authorType = (AuthorType)theEObject;
				T result = caseAuthorType(authorType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.BOOK_TYPE: {
				BookType bookType = (BookType)theEObject;
				T result = caseBookType(bookType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CHAPTER_TYPE: {
				ChapterType chapterType = (ChapterType)theEObject;
				T result = caseChapterType(chapterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COLSPEC_TYPE: {
				ColspecType colspecType = (ColspecType)theEObject;
				T result = caseColspecType(colspecType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CMDSYNOPSIS_TYPE: {
				CmdsynopsisType cmdsynopsisType = (CmdsynopsisType)theEObject;
				T result = caseCmdsynopsisType(cmdsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COMMAND_TYPE: {
				CommandType commandType = (CommandType)theEObject;
				T result = caseCommandType(commandType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.CONFGROUP_TYPE: {
				ConfgroupType confgroupType = (ConfgroupType)theEObject;
				T result = caseConfgroupType(confgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.COPYRIGHT_TYPE: {
				CopyrightType copyrightType = (CopyrightType)theEObject;
				T result = caseCopyrightType(copyrightType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.DATE_TYPE: {
				DateType dateType = (DateType)theEObject;
				T result = caseDateType(dateType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EMPHASIS_TYPE: {
				EmphasisType emphasisType = (EmphasisType)theEObject;
				T result = caseEmphasisType(emphasisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ENTRY_TYPE: {
				EntryType entryType = (EntryType)theEObject;
				T result = caseEntryType(entryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ENVAR_TYPE: {
				EnvarType envarType = (EnvarType)theEObject;
				T result = caseEnvarType(envarType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.EXAMPLE_TYPE: {
				ExampleType exampleType = (ExampleType)theEObject;
				T result = caseExampleType(exampleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FIGURE_TYPE: {
				FigureType figureType = (FigureType)theEObject;
				T result = caseFigureType(figureType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FILE_NAME_TYPE: {
				FileNameType fileNameType = (FileNameType)theEObject;
				T result = caseFileNameType(fileNameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FIRSTNAME_TYPE: {
				FirstnameType firstnameType = (FirstnameType)theEObject;
				T result = caseFirstnameType(firstnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FOOTNOTE_TYPE: {
				FootnoteType footnoteType = (FootnoteType)theEObject;
				T result = caseFootnoteType(footnoteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCDEF_TYPE: {
				FuncdefType funcdefType = (FuncdefType)theEObject;
				T result = caseFuncdefType(funcdefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCPROTOTYPE_TYPE: {
				FuncprototypeType funcprototypeType = (FuncprototypeType)theEObject;
				T result = caseFuncprototypeType(funcprototypeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCSYNOPSIS_TYPE: {
				FuncsynopsisType funcsynopsisType = (FuncsynopsisType)theEObject;
				T result = caseFuncsynopsisType(funcsynopsisType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.FUNCTION_TYPE: {
				FunctionType functionType = (FunctionType)theEObject;
				T result = caseFunctionType(functionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.IMAGEDATA_TYPE: {
				ImagedataType imagedataType = (ImagedataType)theEObject;
				T result = caseImagedataType(imagedataType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.IMAGEOBJECT_TYPE: {
				ImageobjectType imageobjectType = (ImageobjectType)theEObject;
				T result = caseImageobjectType(imageobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.IMPORTANT_TYPE: {
				ImportantType importantType = (ImportantType)theEObject;
				T result = caseImportantType(importantType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INFORMALTABLE_TYPE: {
				InformaltableType informaltableType = (InformaltableType)theEObject;
				T result = caseInformaltableType(informaltableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.INFO_TYPE: {
				InfoType infoType = (InfoType)theEObject;
				T result = caseInfoType(infoType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ITEMIZEDLIST_TYPE: {
				ItemizedlistType itemizedlistType = (ItemizedlistType)theEObject;
				T result = caseItemizedlistType(itemizedlistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.KEYWORDSET_TYPE: {
				KeywordsetType keywordsetType = (KeywordsetType)theEObject;
				T result = caseKeywordsetType(keywordsetType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LEGAL_NOTICE_TYPE: {
				LegalNoticeType legalNoticeType = (LegalNoticeType)theEObject;
				T result = caseLegalNoticeType(legalNoticeType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LINK_TYPE: {
				LinkType linkType = (LinkType)theEObject;
				T result = caseLinkType(linkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LISTITEM_TYPE: {
				ListitemType listitemType = (ListitemType)theEObject;
				T result = caseListitemType(listitemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.LITERAL_TYPE: {
				LiteralType literalType = (LiteralType)theEObject;
				T result = caseLiteralType(literalType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.MEDIAOBJECT_TYPE: {
				MediaobjectType mediaobjectType = (MediaobjectType)theEObject;
				T result = caseMediaobjectType(mediaobjectType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.NOTE_TYPE: {
				NoteType noteType = (NoteType)theEObject;
				T result = caseNoteType(noteType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OPTION_TYPE: {
				OptionType optionType = (OptionType)theEObject;
				T result = caseOptionType(optionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ORDEREDLIST_TYPE: {
				OrderedlistType orderedlistType = (OrderedlistType)theEObject;
				T result = caseOrderedlistType(orderedlistType);
				if (result == null) result = caseItemizedlistType(orderedlistType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.OTHERADDR_TYPE: {
				OtheraddrType otheraddrType = (OtheraddrType)theEObject;
				T result = caseOtheraddrType(otheraddrType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PARAMETER_TYPE: {
				ParameterType parameterType = (ParameterType)theEObject;
				T result = caseParameterType(parameterType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PARAMDEF_TYPE: {
				ParamdefType paramdefType = (ParamdefType)theEObject;
				T result = caseParamdefType(paramdefType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PARA_TYPE: {
				ParaType paraType = (ParaType)theEObject;
				T result = caseParaType(paraType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PERSONNAME_TYPE: {
				PersonnameType personnameType = (PersonnameType)theEObject;
				T result = casePersonnameType(personnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PHRASE_TYPE: {
				PhraseType phraseType = (PhraseType)theEObject;
				T result = casePhraseType(phraseType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PREFACE_TYPE: {
				PrefaceType prefaceType = (PrefaceType)theEObject;
				T result = casePrefaceType(prefaceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PROGRAMLISTING_TYPE: {
				ProgramlistingType programlistingType = (ProgramlistingType)theEObject;
				T result = caseProgramlistingType(programlistingType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.PUBLISHER_TYPE: {
				PublisherType publisherType = (PublisherType)theEObject;
				T result = casePublisherType(publisherType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REF_ENTRY_TYPE: {
				RefEntryType refEntryType = (RefEntryType)theEObject;
				T result = caseRefEntryType(refEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REF_ENTRY_TITLE_TYPE: {
				RefEntryTitleType refEntryTitleType = (RefEntryTitleType)theEObject;
				T result = caseRefEntryTitleType(refEntryTitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REFERENCE_TYPE: {
				ReferenceType referenceType = (ReferenceType)theEObject;
				T result = caseReferenceType(referenceType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REF_META_TYPE: {
				RefMetaType refMetaType = (RefMetaType)theEObject;
				T result = caseRefMetaType(refMetaType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REF_NAME_DIV_TYPE: {
				RefNameDivType refNameDivType = (RefNameDivType)theEObject;
				T result = caseRefNameDivType(refNameDivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REF_SECT1_TYPE: {
				RefSect1Type refSect1Type = (RefSect1Type)theEObject;
				T result = caseRefSect1Type(refSect1Type);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE: {
				RefSynopsisDivType refSynopsisDivType = (RefSynopsisDivType)theEObject;
				T result = caseRefSynopsisDivType(refSynopsisDivType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REPLACEABLE_TYPE: {
				ReplaceableType replaceableType = (ReplaceableType)theEObject;
				T result = caseReplaceableType(replaceableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVDESCRIPTION_TYPE: {
				RevdescriptionType revdescriptionType = (RevdescriptionType)theEObject;
				T result = caseRevdescriptionType(revdescriptionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVHISTORY_TYPE: {
				RevhistoryType revhistoryType = (RevhistoryType)theEObject;
				T result = caseRevhistoryType(revhistoryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVISION_TYPE: {
				RevisionType revisionType = (RevisionType)theEObject;
				T result = caseRevisionType(revisionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.REVNUMBER_TYPE: {
				RevnumberType revnumberType = (RevnumberType)theEObject;
				T result = caseRevnumberType(revnumberType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ROW_TYPE: {
				RowType rowType = (RowType)theEObject;
				T result = caseRowType(rowType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SECTION_TYPE: {
				SectionType sectionType = (SectionType)theEObject;
				T result = caseSectionType(sectionType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEG_LIST_ITEM_TYPE: {
				SegListItemType segListItemType = (SegListItemType)theEObject;
				T result = caseSegListItemType(segListItemType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEGMENTED_LIST_TYPE: {
				SegmentedListType segmentedListType = (SegmentedListType)theEObject;
				T result = caseSegmentedListType(segmentedListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SEG_TYPE: {
				SegType segType = (SegType)theEObject;
				T result = caseSegType(segType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SUBTITLE_TYPE: {
				SubtitleType subtitleType = (SubtitleType)theEObject;
				T result = caseSubtitleType(subtitleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.SURNAME_TYPE: {
				SurnameType surnameType = (SurnameType)theEObject;
				T result = caseSurnameType(surnameType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TABLE_TYPE: {
				TableType tableType = (TableType)theEObject;
				T result = caseTableType(tableType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TERM_TYPE: {
				TermType termType = (TermType)theEObject;
				T result = caseTermType(termType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TBODY_TYPE: {
				TbodyType tbodyType = (TbodyType)theEObject;
				T result = caseTbodyType(tbodyType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TGROUP_TYPE: {
				TgroupType tgroupType = (TgroupType)theEObject;
				T result = caseTgroupType(tgroupType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.THEAD_TYPE: {
				TheadType theadType = (TheadType)theEObject;
				T result = caseTheadType(theadType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TIP_TYPE: {
				TipType tipType = (TipType)theEObject;
				T result = caseTipType(tipType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.TITLE_TYPE: {
				TitleType titleType = (TitleType)theEObject;
				T result = caseTitleType(titleType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.ULINK_TYPE: {
				UlinkType ulinkType = (UlinkType)theEObject;
				T result = caseUlinkType(ulinkType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VARIABLE_LIST_TYPE: {
				VariableListType variableListType = (VariableListType)theEObject;
				T result = caseVariableListType(variableListType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case DocbookPackage.VAR_LIST_ENTRY_TYPE: {
				VarListEntryType varListEntryType = (VarListEntryType)theEObject;
				T result = caseVarListEntryType(varListEntryType);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Abstract Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAbstractType(AbstractType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Address Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAddressType(AddressType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Authorinitials Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Authorinitials Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorinitialsType(AuthorinitialsType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Author Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Author Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAuthorType(AuthorType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Book Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Book Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBookType(BookType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chapter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chapter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChapterType(ChapterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Colspec Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Colspec Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseColspecType(ColspecType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Confgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Confgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConfgroupType(ConfgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Copyright Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCopyrightType(CopyrightType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Date Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDateType(DateType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Emphasis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Emphasis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEmphasisType(EmphasisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntryType(EntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Envar Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Envar Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEnvarType(EnvarType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Figure Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Figure Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFigureType(FigureType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>File Name Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>File Name Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFileNameType(FileNameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Firstname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Firstname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFirstnameType(FirstnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Footnote Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Footnote Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFootnoteType(FootnoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imagedata Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imagedata Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImagedataType(ImagedataType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Imageobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Imageobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImageobjectType(ImageobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Important Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Important Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseImportantType(ImportantType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Informaltable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Informaltable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInformaltableType(InformaltableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Info Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Info Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInfoType(InfoType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Itemizedlist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Itemizedlist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseItemizedlistType(ItemizedlistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Keywordset Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Keywordset Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseKeywordsetType(KeywordsetType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Legal Notice Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Legal Notice Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLegalNoticeType(LegalNoticeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Link Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLinkType(LinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Listitem Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Listitem Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseListitemType(ListitemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Literal Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLiteralType(LiteralType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Mediaobject Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Mediaobject Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMediaobjectType(MediaobjectType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Note Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNoteType(NoteType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Option Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOptionType(OptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Orderedlist Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Orderedlist Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOrderedlistType(OrderedlistType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Otheraddr Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Otheraddr Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOtheraddrType(OtheraddrType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Para Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Para Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParaType(ParaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Personname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Personname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePersonnameType(PersonnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Phrase Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Phrase Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePhraseType(PhraseType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Preface Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Preface Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrefaceType(PrefaceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Programlisting Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Programlisting Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProgramlistingType(ProgramlistingType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Publisher Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Publisher Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePublisherType(PublisherType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefEntryType(RefEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Entry Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Entry Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefEntryTitleType(RefEntryTitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReferenceType(ReferenceType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Meta Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Meta Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefMetaType(RefMetaType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Name Div Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Name Div Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefNameDivType(RefNameDivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Sect1 Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Sect1 Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSect1Type(RefSect1Type object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ref Synopsis Div Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ref Synopsis Div Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRefSynopsisDivType(RefSynopsisDivType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revdescription Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revdescription Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevdescriptionType(RevdescriptionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revhistory Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revhistory Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevhistoryType(RevhistoryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revision Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revision Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevisionType(RevisionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Revnumber Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Revnumber Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRevnumberType(RevnumberType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Row Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRowType(RowType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Section Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSectionType(SectionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seg List Item Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seg List Item Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegListItemType(SegListItemType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Segmented List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Segmented List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegmentedListType(SegmentedListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Seg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Seg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSegType(SegType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subtitle Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubtitleType(SubtitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Surname Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Surname Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSurnameType(SurnameType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableType(TableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Term Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTermType(TermType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tbody Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTbodyType(TbodyType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tgroup Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tgroup Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTgroupType(TgroupType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Thead Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTheadType(TheadType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Tip Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Tip Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTipType(TipType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Title Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTitleType(TitleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Ulink Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Ulink Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUlinkType(UlinkType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Variable List Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Variable List Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVariableListType(VariableListType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Var List Entry Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Var List Entry Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVarListEntryType(VarListEntryType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncsynopsisType(FuncsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcprototype Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcprototype Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncprototypeType(FuncprototypeType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Paramdef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Paramdef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParamdefType(ParamdefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Funcdef Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Funcdef Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFuncdefType(FuncdefType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Parameter Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseParameterType(ParameterType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunctionType(FunctionType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Example Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Example Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseExampleType(ExampleType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Cmdsynopsis Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Cmdsynopsis Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCmdsynopsisType(CmdsynopsisType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Command Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandType(CommandType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Arg Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseArgType(ArgType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Replaceable Type</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Replaceable Type</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReplaceableType(ReplaceableType object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //DocbookSwitch
