/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.RefEntryTitleType;
import org.kermeta.Docbook.RefMetaType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Meta Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.RefMetaTypeImpl#getRefentrytitle <em>Refentrytitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefMetaTypeImpl#getManvolnum <em>Manvolnum</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefMetaTypeImpl extends EObjectImpl implements RefMetaType {
	/**
	 * The cached value of the '{@link #getRefentrytitle() <em>Refentrytitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefentrytitle()
	 * @generated
	 * @ordered
	 */
	protected RefEntryTitleType refentrytitle;

	/**
	 * The default value of the '{@link #getManvolnum() <em>Manvolnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManvolnum()
	 * @generated
	 * @ordered
	 */
	protected static final String MANVOLNUM_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getManvolnum() <em>Manvolnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getManvolnum()
	 * @generated
	 * @ordered
	 */
	protected String manvolnum = MANVOLNUM_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefMetaTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.REF_META_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefEntryTitleType getRefentrytitle() {
		return refentrytitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefentrytitle(RefEntryTitleType newRefentrytitle, NotificationChain msgs) {
		RefEntryTitleType oldRefentrytitle = refentrytitle;
		refentrytitle = newRefentrytitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_META_TYPE__REFENTRYTITLE, oldRefentrytitle, newRefentrytitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefentrytitle(RefEntryTitleType newRefentrytitle) {
		if (newRefentrytitle != refentrytitle) {
			NotificationChain msgs = null;
			if (refentrytitle != null)
				msgs = ((InternalEObject)refentrytitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_META_TYPE__REFENTRYTITLE, null, msgs);
			if (newRefentrytitle != null)
				msgs = ((InternalEObject)newRefentrytitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_META_TYPE__REFENTRYTITLE, null, msgs);
			msgs = basicSetRefentrytitle(newRefentrytitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_META_TYPE__REFENTRYTITLE, newRefentrytitle, newRefentrytitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getManvolnum() {
		return manvolnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setManvolnum(String newManvolnum) {
		String oldManvolnum = manvolnum;
		manvolnum = newManvolnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_META_TYPE__MANVOLNUM, oldManvolnum, manvolnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.REF_META_TYPE__REFENTRYTITLE:
				return basicSetRefentrytitle(null, msgs);
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
			case DocbookPackage.REF_META_TYPE__REFENTRYTITLE:
				return getRefentrytitle();
			case DocbookPackage.REF_META_TYPE__MANVOLNUM:
				return getManvolnum();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case DocbookPackage.REF_META_TYPE__REFENTRYTITLE:
				setRefentrytitle((RefEntryTitleType)newValue);
				return;
			case DocbookPackage.REF_META_TYPE__MANVOLNUM:
				setManvolnum((String)newValue);
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
			case DocbookPackage.REF_META_TYPE__REFENTRYTITLE:
				setRefentrytitle((RefEntryTitleType)null);
				return;
			case DocbookPackage.REF_META_TYPE__MANVOLNUM:
				setManvolnum(MANVOLNUM_EDEFAULT);
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
			case DocbookPackage.REF_META_TYPE__REFENTRYTITLE:
				return refentrytitle != null;
			case DocbookPackage.REF_META_TYPE__MANVOLNUM:
				return MANVOLNUM_EDEFAULT == null ? manvolnum != null : !MANVOLNUM_EDEFAULT.equals(manvolnum);
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
		result.append(" (manvolnum: ");
		result.append(manvolnum);
		result.append(')');
		return result.toString();
	}

} //RefMetaTypeImpl
