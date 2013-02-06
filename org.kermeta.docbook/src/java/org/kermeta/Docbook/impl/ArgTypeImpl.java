/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.ArgType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.OptionType;
import org.kermeta.Docbook.ReplaceableType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Arg Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ArgTypeImpl#getMixed <em>Mixed</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ArgTypeImpl#getOption <em>Option</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ArgTypeImpl#getReplaceable <em>Replaceable</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ArgTypeImpl#getChoice <em>Choice</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ArgTypeImpl#getRep <em>Rep</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ArgTypeImpl extends EObjectImpl implements ArgType {
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
	 * The default value of the '{@link #getChoice() <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected static final String CHOICE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChoice() <em>Choice</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChoice()
	 * @generated
	 * @ordered
	 */
	protected String choice = CHOICE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRep() <em>Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRep()
	 * @generated
	 * @ordered
	 */
	protected static final String REP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRep() <em>Rep</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRep()
	 * @generated
	 * @ordered
	 */
	protected String rep = REP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ArgTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.ARG_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getMixed() {
		if (mixed == null) {
			mixed = new BasicFeatureMap(this, DocbookPackage.ARG_TYPE__MIXED);
		}
		return mixed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OptionType> getOption() {
		if (option == null) {
			option = new EObjectContainmentEList<OptionType>(OptionType.class, this, DocbookPackage.ARG_TYPE__OPTION);
		}
		return option;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReplaceableType> getReplaceable() {
		return getMixed().list(DocbookPackage.Literals.ARG_TYPE__REPLACEABLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getChoice() {
		return choice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChoice(String newChoice) {
		String oldChoice = choice;
		choice = newChoice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ARG_TYPE__CHOICE, oldChoice, choice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRep() {
		return rep;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRep(String newRep) {
		String oldRep = rep;
		rep = newRep;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.ARG_TYPE__REP, oldRep, rep));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.ARG_TYPE__MIXED:
				return ((InternalEList<?>)getMixed()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ARG_TYPE__OPTION:
				return ((InternalEList<?>)getOption()).basicRemove(otherEnd, msgs);
			case DocbookPackage.ARG_TYPE__REPLACEABLE:
				return ((InternalEList<?>)getReplaceable()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.ARG_TYPE__MIXED:
				if (coreType) return getMixed();
				return ((FeatureMap.Internal)getMixed()).getWrapper();
			case DocbookPackage.ARG_TYPE__OPTION:
				return getOption();
			case DocbookPackage.ARG_TYPE__REPLACEABLE:
				return getReplaceable();
			case DocbookPackage.ARG_TYPE__CHOICE:
				return getChoice();
			case DocbookPackage.ARG_TYPE__REP:
				return getRep();
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
			case DocbookPackage.ARG_TYPE__MIXED:
				((FeatureMap.Internal)getMixed()).set(newValue);
				return;
			case DocbookPackage.ARG_TYPE__OPTION:
				getOption().clear();
				getOption().addAll((Collection<? extends OptionType>)newValue);
				return;
			case DocbookPackage.ARG_TYPE__REPLACEABLE:
				getReplaceable().clear();
				getReplaceable().addAll((Collection<? extends ReplaceableType>)newValue);
				return;
			case DocbookPackage.ARG_TYPE__CHOICE:
				setChoice((String)newValue);
				return;
			case DocbookPackage.ARG_TYPE__REP:
				setRep((String)newValue);
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
			case DocbookPackage.ARG_TYPE__MIXED:
				getMixed().clear();
				return;
			case DocbookPackage.ARG_TYPE__OPTION:
				getOption().clear();
				return;
			case DocbookPackage.ARG_TYPE__REPLACEABLE:
				getReplaceable().clear();
				return;
			case DocbookPackage.ARG_TYPE__CHOICE:
				setChoice(CHOICE_EDEFAULT);
				return;
			case DocbookPackage.ARG_TYPE__REP:
				setRep(REP_EDEFAULT);
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
			case DocbookPackage.ARG_TYPE__MIXED:
				return mixed != null && !mixed.isEmpty();
			case DocbookPackage.ARG_TYPE__OPTION:
				return option != null && !option.isEmpty();
			case DocbookPackage.ARG_TYPE__REPLACEABLE:
				return !getReplaceable().isEmpty();
			case DocbookPackage.ARG_TYPE__CHOICE:
				return CHOICE_EDEFAULT == null ? choice != null : !CHOICE_EDEFAULT.equals(choice);
			case DocbookPackage.ARG_TYPE__REP:
				return REP_EDEFAULT == null ? rep != null : !REP_EDEFAULT.equals(rep);
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
		result.append(", choice: ");
		result.append(choice);
		result.append(", rep: ");
		result.append(rep);
		result.append(')');
		return result.toString();
	}

} //ArgTypeImpl
