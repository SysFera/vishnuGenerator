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
import org.kermeta.Docbook.InfoType;
import org.kermeta.Docbook.RefEntryType;
import org.kermeta.Docbook.RefMetaType;
import org.kermeta.Docbook.RefNameDivType;
import org.kermeta.Docbook.RefSect1Type;
import org.kermeta.Docbook.RefSynopsisDivType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Entry Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.RefEntryTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefEntryTypeImpl#getRefmeta <em>Refmeta</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefEntryTypeImpl#getRefnamediv <em>Refnamediv</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefEntryTypeImpl#getRefsynopsisdiv <em>Refsynopsisdiv</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefEntryTypeImpl#getRefsect1 <em>Refsect1</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefEntryTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefEntryTypeImpl extends EObjectImpl implements RefEntryType {
	/**
	 * The cached value of the '{@link #getInfo() <em>Info</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfo()
	 * @generated
	 * @ordered
	 */
	protected InfoType info;

	/**
	 * The cached value of the '{@link #getRefmeta() <em>Refmeta</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefmeta()
	 * @generated
	 * @ordered
	 */
	protected RefMetaType refmeta;

	/**
	 * The cached value of the '{@link #getRefnamediv() <em>Refnamediv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefnamediv()
	 * @generated
	 * @ordered
	 */
	protected RefNameDivType refnamediv;

	/**
	 * The cached value of the '{@link #getRefsynopsisdiv() <em>Refsynopsisdiv</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefsynopsisdiv()
	 * @generated
	 * @ordered
	 */
	protected RefSynopsisDivType refsynopsisdiv;

	/**
	 * The cached value of the '{@link #getRefsect1() <em>Refsect1</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefsect1()
	 * @generated
	 * @ordered
	 */
	protected EList<RefSect1Type> refsect1;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefEntryTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.REF_ENTRY_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InfoType getInfo() {
		return info;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInfo(InfoType newInfo, NotificationChain msgs) {
		InfoType oldInfo = info;
		info = newInfo;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__INFO, oldInfo, newInfo);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInfo(InfoType newInfo) {
		if (newInfo != info) {
			NotificationChain msgs = null;
			if (info != null)
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefMetaType getRefmeta() {
		return refmeta;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefmeta(RefMetaType newRefmeta, NotificationChain msgs) {
		RefMetaType oldRefmeta = refmeta;
		refmeta = newRefmeta;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__REFMETA, oldRefmeta, newRefmeta);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefmeta(RefMetaType newRefmeta) {
		if (newRefmeta != refmeta) {
			NotificationChain msgs = null;
			if (refmeta != null)
				msgs = ((InternalEObject)refmeta).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__REFMETA, null, msgs);
			if (newRefmeta != null)
				msgs = ((InternalEObject)newRefmeta).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__REFMETA, null, msgs);
			msgs = basicSetRefmeta(newRefmeta, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__REFMETA, newRefmeta, newRefmeta));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefNameDivType getRefnamediv() {
		return refnamediv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefnamediv(RefNameDivType newRefnamediv, NotificationChain msgs) {
		RefNameDivType oldRefnamediv = refnamediv;
		refnamediv = newRefnamediv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV, oldRefnamediv, newRefnamediv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefnamediv(RefNameDivType newRefnamediv) {
		if (newRefnamediv != refnamediv) {
			NotificationChain msgs = null;
			if (refnamediv != null)
				msgs = ((InternalEObject)refnamediv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV, null, msgs);
			if (newRefnamediv != null)
				msgs = ((InternalEObject)newRefnamediv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV, null, msgs);
			msgs = basicSetRefnamediv(newRefnamediv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV, newRefnamediv, newRefnamediv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RefSynopsisDivType getRefsynopsisdiv() {
		return refsynopsisdiv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRefsynopsisdiv(RefSynopsisDivType newRefsynopsisdiv, NotificationChain msgs) {
		RefSynopsisDivType oldRefsynopsisdiv = refsynopsisdiv;
		refsynopsisdiv = newRefsynopsisdiv;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV, oldRefsynopsisdiv, newRefsynopsisdiv);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefsynopsisdiv(RefSynopsisDivType newRefsynopsisdiv) {
		if (newRefsynopsisdiv != refsynopsisdiv) {
			NotificationChain msgs = null;
			if (refsynopsisdiv != null)
				msgs = ((InternalEObject)refsynopsisdiv).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV, null, msgs);
			if (newRefsynopsisdiv != null)
				msgs = ((InternalEObject)newRefsynopsisdiv).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV, null, msgs);
			msgs = basicSetRefsynopsisdiv(newRefsynopsisdiv, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV, newRefsynopsisdiv, newRefsynopsisdiv));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RefSect1Type> getRefsect1() {
		if (refsect1 == null) {
			refsect1 = new EObjectContainmentEList<RefSect1Type>(RefSect1Type.class, this, DocbookPackage.REF_ENTRY_TYPE__REFSECT1);
		}
		return refsect1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_ENTRY_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.REF_ENTRY_TYPE__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.REF_ENTRY_TYPE__REFMETA:
				return basicSetRefmeta(null, msgs);
			case DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV:
				return basicSetRefnamediv(null, msgs);
			case DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV:
				return basicSetRefsynopsisdiv(null, msgs);
			case DocbookPackage.REF_ENTRY_TYPE__REFSECT1:
				return ((InternalEList<?>)getRefsect1()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.REF_ENTRY_TYPE__INFO:
				return getInfo();
			case DocbookPackage.REF_ENTRY_TYPE__REFMETA:
				return getRefmeta();
			case DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV:
				return getRefnamediv();
			case DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV:
				return getRefsynopsisdiv();
			case DocbookPackage.REF_ENTRY_TYPE__REFSECT1:
				return getRefsect1();
			case DocbookPackage.REF_ENTRY_TYPE__VERSION:
				return getVersion();
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
			case DocbookPackage.REF_ENTRY_TYPE__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFMETA:
				setRefmeta((RefMetaType)newValue);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV:
				setRefnamediv((RefNameDivType)newValue);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV:
				setRefsynopsisdiv((RefSynopsisDivType)newValue);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFSECT1:
				getRefsect1().clear();
				getRefsect1().addAll((Collection<? extends RefSect1Type>)newValue);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__VERSION:
				setVersion((String)newValue);
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
			case DocbookPackage.REF_ENTRY_TYPE__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFMETA:
				setRefmeta((RefMetaType)null);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV:
				setRefnamediv((RefNameDivType)null);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV:
				setRefsynopsisdiv((RefSynopsisDivType)null);
				return;
			case DocbookPackage.REF_ENTRY_TYPE__REFSECT1:
				getRefsect1().clear();
				return;
			case DocbookPackage.REF_ENTRY_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
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
			case DocbookPackage.REF_ENTRY_TYPE__INFO:
				return info != null;
			case DocbookPackage.REF_ENTRY_TYPE__REFMETA:
				return refmeta != null;
			case DocbookPackage.REF_ENTRY_TYPE__REFNAMEDIV:
				return refnamediv != null;
			case DocbookPackage.REF_ENTRY_TYPE__REFSYNOPSISDIV:
				return refsynopsisdiv != null;
			case DocbookPackage.REF_ENTRY_TYPE__REFSECT1:
				return refsect1 != null && !refsect1.isEmpty();
			case DocbookPackage.REF_ENTRY_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
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
		result.append(" (version: ");
		result.append(version);
		result.append(')');
		return result.toString();
	}

} //RefEntryTypeImpl
