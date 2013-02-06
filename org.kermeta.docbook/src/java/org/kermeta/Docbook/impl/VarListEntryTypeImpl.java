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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.ListitemType;
import org.kermeta.Docbook.TermType;
import org.kermeta.Docbook.VarListEntryType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Var List Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.VarListEntryTypeImpl#getSpacing <em>Spacing</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.VarListEntryTypeImpl#getTermlength <em>Termlength</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.VarListEntryTypeImpl#getTerm <em>Term</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.VarListEntryTypeImpl#getListitem <em>Listitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VarListEntryTypeImpl extends EObjectImpl implements VarListEntryType {
	/**
	 * The default value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected static final String SPACING_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpacing() <em>Spacing</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpacing()
	 * @generated
	 * @ordered
	 */
	protected String spacing = SPACING_EDEFAULT;

	/**
	 * The default value of the '{@link #getTermlength() <em>Termlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermlength()
	 * @generated
	 * @ordered
	 */
	protected static final String TERMLENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTermlength() <em>Termlength</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTermlength()
	 * @generated
	 * @ordered
	 */
	protected String termlength = TERMLENGTH_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTerm() <em>Term</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTerm()
	 * @generated
	 * @ordered
	 */
	protected EList<TermType> term;

	/**
	 * The cached value of the '{@link #getListitem() <em>Listitem</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getListitem()
	 * @generated
	 * @ordered
	 */
	protected ListitemType listitem;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VarListEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.VAR_LIST_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSpacing() {
		return spacing;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpacing(String newSpacing) {
		String oldSpacing = spacing;
		spacing = newSpacing;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.VAR_LIST_ENTRY_TYPE__SPACING, oldSpacing, spacing));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTermlength() {
		return termlength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTermlength(String newTermlength) {
		String oldTermlength = termlength;
		termlength = newTermlength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.VAR_LIST_ENTRY_TYPE__TERMLENGTH, oldTermlength, termlength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TermType> getTerm() {
		if (term == null) {
			term = new EObjectContainmentEList<TermType>(TermType.class, this, DocbookPackage.VAR_LIST_ENTRY_TYPE__TERM);
		}
		return term;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListitemType getListitem() {
		return listitem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetListitem(ListitemType newListitem, NotificationChain msgs) {
		ListitemType oldListitem = listitem;
		listitem = newListitem;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM, oldListitem, newListitem);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setListitem(ListitemType newListitem) {
		if (newListitem != listitem) {
			NotificationChain msgs = null;
			if (listitem != null)
				msgs = ((InternalEObject)listitem).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM, null, msgs);
			if (newListitem != null)
				msgs = ((InternalEObject)newListitem).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM, null, msgs);
			msgs = basicSetListitem(newListitem, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM, newListitem, newListitem));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERM:
				return ((InternalEList<?>)getTerm()).basicRemove(otherEnd, msgs);
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM:
				return basicSetListitem(null, msgs);
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
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__SPACING:
				return getSpacing();
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERMLENGTH:
				return getTermlength();
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERM:
				return getTerm();
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM:
				return getListitem();
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
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__SPACING:
				setSpacing((String)newValue);
				return;
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERMLENGTH:
				setTermlength((String)newValue);
				return;
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERM:
				getTerm().clear();
				getTerm().addAll((Collection<? extends TermType>)newValue);
				return;
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM:
				setListitem((ListitemType)newValue);
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
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__SPACING:
				setSpacing(SPACING_EDEFAULT);
				return;
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERMLENGTH:
				setTermlength(TERMLENGTH_EDEFAULT);
				return;
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERM:
				getTerm().clear();
				return;
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM:
				setListitem((ListitemType)null);
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
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__SPACING:
				return SPACING_EDEFAULT == null ? spacing != null : !SPACING_EDEFAULT.equals(spacing);
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERMLENGTH:
				return TERMLENGTH_EDEFAULT == null ? termlength != null : !TERMLENGTH_EDEFAULT.equals(termlength);
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__TERM:
				return term != null && !term.isEmpty();
			case DocbookPackage.VAR_LIST_ENTRY_TYPE__LISTITEM:
				return listitem != null;
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
		result.append(" (spacing: ");
		result.append(spacing);
		result.append(", termlength: ");
		result.append(termlength);
		result.append(')');
		return result.toString();
	}

} //VarListEntryTypeImpl
