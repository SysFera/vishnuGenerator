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
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.LegalNoticeType;
import org.kermeta.Docbook.OrderedlistType;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.RevhistoryType;
import org.kermeta.Docbook.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Legal Notice Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.LegalNoticeTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.LegalNoticeTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.LegalNoticeTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.LegalNoticeTypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.LegalNoticeTypeImpl#getOrderedlist <em>Orderedlist</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LegalNoticeTypeImpl extends EObjectImpl implements LegalNoticeType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getRevhistory() <em>Revhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevhistory()
	 * @generated
	 * @ordered
	 */
	protected RevhistoryType revhistory;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LegalNoticeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.LEGAL_NOTICE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.LEGAL_NOTICE_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.LEGAL_NOTICE_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.LEGAL_NOTICE_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.LEGAL_NOTICE_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.LEGAL_NOTICE_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevhistoryType getRevhistory() {
		return revhistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevhistory(RevhistoryType newRevhistory, NotificationChain msgs) {
		RevhistoryType oldRevhistory = revhistory;
		revhistory = newRevhistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY, oldRevhistory, newRevhistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevhistory(RevhistoryType newRevhistory) {
		if (newRevhistory != revhistory) {
			NotificationChain msgs = null;
			if (revhistory != null)
				msgs = ((InternalEObject)revhistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY, null, msgs);
			if (newRevhistory != null)
				msgs = ((InternalEObject)newRevhistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY, null, msgs);
			msgs = basicSetRevhistory(newRevhistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY, newRevhistory, newRevhistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParaType> getPara() {
		return getGroup().list(DocbookPackage.Literals.LEGAL_NOTICE_TYPE__PARA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OrderedlistType> getOrderedlist() {
		return getGroup().list(DocbookPackage.Literals.LEGAL_NOTICE_TYPE__ORDEREDLIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.LEGAL_NOTICE_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.LEGAL_NOTICE_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY:
				return basicSetRevhistory(null, msgs);
			case DocbookPackage.LEGAL_NOTICE_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.LEGAL_NOTICE_TYPE__ORDEREDLIST:
				return ((InternalEList<?>)getOrderedlist()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.LEGAL_NOTICE_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.LEGAL_NOTICE_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.LEGAL_NOTICE_TYPE__PARA:
				return getPara();
			case DocbookPackage.LEGAL_NOTICE_TYPE__ORDEREDLIST:
				return getOrderedlist();
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
			case DocbookPackage.LEGAL_NOTICE_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY:
				setRevhistory((RevhistoryType)newValue);
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
				getOrderedlist().addAll((Collection<? extends OrderedlistType>)newValue);
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
			case DocbookPackage.LEGAL_NOTICE_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY:
				setRevhistory((RevhistoryType)null);
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.LEGAL_NOTICE_TYPE__ORDEREDLIST:
				getOrderedlist().clear();
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
			case DocbookPackage.LEGAL_NOTICE_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.LEGAL_NOTICE_TYPE__TITLE:
				return title != null;
			case DocbookPackage.LEGAL_NOTICE_TYPE__REVHISTORY:
				return revhistory != null;
			case DocbookPackage.LEGAL_NOTICE_TYPE__PARA:
				return !getPara().isEmpty();
			case DocbookPackage.LEGAL_NOTICE_TYPE__ORDEREDLIST:
				return !getOrderedlist().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //LegalNoticeTypeImpl
