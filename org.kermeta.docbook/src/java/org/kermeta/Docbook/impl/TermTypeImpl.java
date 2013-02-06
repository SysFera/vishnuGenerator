/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.EmphasisType;
import org.kermeta.Docbook.EnvarType;
import org.kermeta.Docbook.FileNameType;
import org.kermeta.Docbook.OptionType;
import org.kermeta.Docbook.TermType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Term Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.TermTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TermTypeImpl#getEmphasis <em>Emphasis</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TermTypeImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TermTypeImpl#getFilename <em>Filename</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TermTypeImpl#getEnvar <em>Envar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TermTypeImpl extends EObjectImpl implements TermType {
	/**
	 * The cached value of the '{@link #getMixed() <em>Mixed</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMixed()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap mixed;

	/**
	 * The cached value of the '{@link #getOption() <em>Option</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOption()
	 * @generated
	 * @ordered
	 */
	protected EList<OptionType> option;

	/**
	 * The cached value of the '{@link #getFilename() <em>Filename</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFilename()
	 * @generated
	 * @ordered
	 */
	protected EList<FileNameType> filename;

	/**
	 * The cached value of the '{@link #getEnvar() <em>Envar</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvar()
	 * @generated
	 * @ordered
	 */
	protected EList<EnvarType> envar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TermTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.TERM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.TERM_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EmphasisType> getEmphasis() {
		return getMixed().list(DocbookPackage.Literals.TERM_TYPE__EMPHASIS);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionType> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<OptionType>(OptionType.class, this, DocbookPackage.TERM_TYPE__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FileNameType> getFilename() {
		if (filename == null) {
			filename = new EObjectContainmentEList<FileNameType>(FileNameType.class, this, DocbookPackage.TERM_TYPE__FILENAME);
		}
		return filename;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EnvarType> getEnvar() {
		if (envar == null) {
			envar = new EObjectContainmentEList<EnvarType>(EnvarType.class, this, DocbookPackage.TERM_TYPE__ENVAR);
		}
		return envar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.TERM_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TERM_TYPE__EMPHASIS:
				return ((InternalEList<?>)getEmphasis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TERM_TYPE__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TERM_TYPE__FILENAME:
				return ((InternalEList<?>)getFilename()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TERM_TYPE__ENVAR:
				return ((InternalEList<?>)getEnvar()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.TERM_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.TERM_TYPE__EMPHASIS:
				return getEmphasis();
			case DocbookPackage.TERM_TYPE__OPTION:
				return getOption();
			case DocbookPackage.TERM_TYPE__FILENAME:
				return getFilename();
			case DocbookPackage.TERM_TYPE__ENVAR:
				return getEnvar();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocbookPackage.TERM_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.TERM_TYPE__EMPHASIS:
				getEmphasis().clear();
				getEmphasis().addAll((Collection<? extends EmphasisType>)newValue);
				return;
			case DocbookPackage.TERM_TYPE__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends OptionType>)newValue);
				return;
			case DocbookPackage.TERM_TYPE__FILENAME:
				getFilename().clear();
				getFilename().addAll((Collection<? extends FileNameType>)newValue);
				return;
			case DocbookPackage.TERM_TYPE__ENVAR:
				getEnvar().clear();
				getEnvar().addAll((Collection<? extends EnvarType>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case DocbookPackage.TERM_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.TERM_TYPE__EMPHASIS:
				getEmphasis().clear();
				return;
			case DocbookPackage.TERM_TYPE__OPTION:
				getOption().clear();
				return;
			case DocbookPackage.TERM_TYPE__FILENAME:
				getFilename().clear();
				return;
			case DocbookPackage.TERM_TYPE__ENVAR:
				getEnvar().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case DocbookPackage.TERM_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.TERM_TYPE__EMPHASIS:
				return !getEmphasis().isEmpty();
			case DocbookPackage.TERM_TYPE__OPTION:
				return option != null && !option.isEmpty();
			case DocbookPackage.TERM_TYPE__FILENAME:
				return filename != null && !filename.isEmpty();
			case DocbookPackage.TERM_TYPE__ENVAR:
				return envar != null && !envar.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (mixed: ");
		result.append(mixed);
		result.append(')');
		return result.toString();
	}

} //TermTypeImpl
