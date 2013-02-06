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

import org.kermeta.Docbook.BookType;
import org.kermeta.Docbook.ChapterType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.InfoType;
import org.kermeta.Docbook.PrefaceType;
import org.kermeta.Docbook.ReferenceType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Book Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.BookTypeImpl#getInfo <em>Info</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookTypeImpl#getPreface <em>Preface</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookTypeImpl#getChapter <em>Chapter</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookTypeImpl#getLang <em>Lang</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookTypeImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.BookTypeImpl#getLabel <em>Label</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BookTypeImpl extends EObjectImpl implements BookType {
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
	 * The cached value of the '{@link #getPreface() <em>Preface</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreface()
	 * @generated
	 * @ordered
	 */
	protected PrefaceType preface;

	/**
	 * The cached value of the '{@link #getChapter() <em>Chapter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChapter()
	 * @generated
	 * @ordered
	 */
	protected EList<ChapterType> chapter;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<ReferenceType> reference;

	/**
	 * The default value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLang() <em>Lang</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLang()
	 * @generated
	 * @ordered
	 */
	protected String lang = LANG_EDEFAULT;

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
	 * The default value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected static final String LABEL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLabel() <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLabel()
	 * @generated
	 * @ordered
	 */
	protected String label = LABEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected BookTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.BOOK_TYPE;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOK_TYPE__INFO, oldInfo, newInfo);
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
				msgs = ((InternalEObject)info).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOK_TYPE__INFO, null, msgs);
			if (newInfo != null)
				msgs = ((InternalEObject)newInfo).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOK_TYPE__INFO, null, msgs);
			msgs = basicSetInfo(newInfo, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOK_TYPE__INFO, newInfo, newInfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrefaceType getPreface() {
		return preface;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPreface(PrefaceType newPreface, NotificationChain msgs) {
		PrefaceType oldPreface = preface;
		preface = newPreface;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOK_TYPE__PREFACE, oldPreface, newPreface);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPreface(PrefaceType newPreface) {
		if (newPreface != preface) {
			NotificationChain msgs = null;
			if (preface != null)
				msgs = ((InternalEObject)preface).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOK_TYPE__PREFACE, null, msgs);
			if (newPreface != null)
				msgs = ((InternalEObject)newPreface).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.BOOK_TYPE__PREFACE, null, msgs);
			msgs = basicSetPreface(newPreface, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOK_TYPE__PREFACE, newPreface, newPreface));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ChapterType> getChapter() {
		if (chapter == null) {
			chapter = new EObjectContainmentEList<ChapterType>(ChapterType.class, this, DocbookPackage.BOOK_TYPE__CHAPTER);
		}
		return chapter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReferenceType> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<ReferenceType>(ReferenceType.class, this, DocbookPackage.BOOK_TYPE__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLang() {
		return lang;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLang(String newLang) {
		String oldLang = lang;
		lang = newLang;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOK_TYPE__LANG, oldLang, lang));
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOK_TYPE__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLabel(String newLabel) {
		String oldLabel = label;
		label = newLabel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.BOOK_TYPE__LABEL, oldLabel, label));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.BOOK_TYPE__INFO:
				return basicSetInfo(null, msgs);
			case DocbookPackage.BOOK_TYPE__PREFACE:
				return basicSetPreface(null, msgs);
			case DocbookPackage.BOOK_TYPE__CHAPTER:
				return ((InternalEList<?>)getChapter()).basicRemove(otherEnd, msgs);
			case DocbookPackage.BOOK_TYPE__REFERENCE:
				return ((InternalEList<?>)getReference()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.BOOK_TYPE__INFO:
				return getInfo();
			case DocbookPackage.BOOK_TYPE__PREFACE:
				return getPreface();
			case DocbookPackage.BOOK_TYPE__CHAPTER:
				return getChapter();
			case DocbookPackage.BOOK_TYPE__REFERENCE:
				return getReference();
			case DocbookPackage.BOOK_TYPE__LANG:
				return getLang();
			case DocbookPackage.BOOK_TYPE__VERSION:
				return getVersion();
			case DocbookPackage.BOOK_TYPE__LABEL:
				return getLabel();
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
			case DocbookPackage.BOOK_TYPE__INFO:
				setInfo((InfoType)newValue);
				return;
			case DocbookPackage.BOOK_TYPE__PREFACE:
				setPreface((PrefaceType)newValue);
				return;
			case DocbookPackage.BOOK_TYPE__CHAPTER:
				getChapter().clear();
				getChapter().addAll((Collection<? extends ChapterType>)newValue);
				return;
			case DocbookPackage.BOOK_TYPE__REFERENCE:
				getReference().clear();
				getReference().addAll((Collection<? extends ReferenceType>)newValue);
				return;
			case DocbookPackage.BOOK_TYPE__LANG:
				setLang((String)newValue);
				return;
			case DocbookPackage.BOOK_TYPE__VERSION:
				setVersion((String)newValue);
				return;
			case DocbookPackage.BOOK_TYPE__LABEL:
				setLabel((String)newValue);
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
			case DocbookPackage.BOOK_TYPE__INFO:
				setInfo((InfoType)null);
				return;
			case DocbookPackage.BOOK_TYPE__PREFACE:
				setPreface((PrefaceType)null);
				return;
			case DocbookPackage.BOOK_TYPE__CHAPTER:
				getChapter().clear();
				return;
			case DocbookPackage.BOOK_TYPE__REFERENCE:
				getReference().clear();
				return;
			case DocbookPackage.BOOK_TYPE__LANG:
				setLang(LANG_EDEFAULT);
				return;
			case DocbookPackage.BOOK_TYPE__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case DocbookPackage.BOOK_TYPE__LABEL:
				setLabel(LABEL_EDEFAULT);
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
			case DocbookPackage.BOOK_TYPE__INFO:
				return info != null;
			case DocbookPackage.BOOK_TYPE__PREFACE:
				return preface != null;
			case DocbookPackage.BOOK_TYPE__CHAPTER:
				return chapter != null && !chapter.isEmpty();
			case DocbookPackage.BOOK_TYPE__REFERENCE:
				return reference != null && !reference.isEmpty();
			case DocbookPackage.BOOK_TYPE__LANG:
				return LANG_EDEFAULT == null ? lang != null : !LANG_EDEFAULT.equals(lang);
			case DocbookPackage.BOOK_TYPE__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case DocbookPackage.BOOK_TYPE__LABEL:
				return LABEL_EDEFAULT == null ? label != null : !LABEL_EDEFAULT.equals(label);
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
		result.append(" (lang: ");
		result.append(lang);
		result.append(", version: ");
		result.append(version);
		result.append(", label: ");
		result.append(label);
		result.append(')');
		return result.toString();
	}

} //BookTypeImpl
