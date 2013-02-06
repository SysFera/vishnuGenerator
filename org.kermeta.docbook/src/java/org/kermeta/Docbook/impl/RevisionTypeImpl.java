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

import org.kermeta.Docbook.AuthorinitialsType;
import org.kermeta.Docbook.DateType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.RevdescriptionType;
import org.kermeta.Docbook.RevisionType;
import org.kermeta.Docbook.RevnumberType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Revision Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.RevisionTypeImpl#getRevnumber <em>Revnumber</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RevisionTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RevisionTypeImpl#getAuthorinitials <em>Authorinitials</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RevisionTypeImpl#getRevdescription <em>Revdescription</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RevisionTypeImpl extends EObjectImpl implements RevisionType {
	/**
	 * The cached value of the '{@link #getRevnumber() <em>Revnumber</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevnumber()
	 * @generated
	 * @ordered
	 */
	protected RevnumberType revnumber;

	/**
	 * The cached value of the '{@link #getDate() <em>Date</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDate()
	 * @generated
	 * @ordered
	 */
	protected DateType date;

	/**
	 * The cached value of the '{@link #getAuthorinitials() <em>Authorinitials</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorinitials()
	 * @generated
	 * @ordered
	 */
	protected AuthorinitialsType authorinitials;

	/**
	 * The cached value of the '{@link #getRevdescription() <em>Revdescription</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevdescription()
	 * @generated
	 * @ordered
	 */
	protected RevdescriptionType revdescription;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RevisionTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.REVISION_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevnumberType getRevnumber() {
		return revnumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevnumber(RevnumberType newRevnumber, NotificationChain msgs) {
		RevnumberType oldRevnumber = revnumber;
		revnumber = newRevnumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__REVNUMBER, oldRevnumber, newRevnumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevnumber(RevnumberType newRevnumber) {
		if (newRevnumber != revnumber) {
			NotificationChain msgs = null;
			if (revnumber != null)
				msgs = ((InternalEObject)revnumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__REVNUMBER, null, msgs);
			if (newRevnumber != null)
				msgs = ((InternalEObject)newRevnumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__REVNUMBER, null, msgs);
			msgs = basicSetRevnumber(newRevnumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__REVNUMBER, newRevnumber, newRevnumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DateType getDate() {
		return date;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDate(DateType newDate, NotificationChain msgs) {
		DateType oldDate = date;
		date = newDate;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__DATE, oldDate, newDate);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDate(DateType newDate) {
		if (newDate != date) {
			NotificationChain msgs = null;
			if (date != null)
				msgs = ((InternalEObject)date).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__DATE, null, msgs);
			if (newDate != null)
				msgs = ((InternalEObject)newDate).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__DATE, null, msgs);
			msgs = basicSetDate(newDate, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__DATE, newDate, newDate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevdescriptionType getRevdescription() {
		return revdescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevdescription(RevdescriptionType newRevdescription, NotificationChain msgs) {
		RevdescriptionType oldRevdescription = revdescription;
		revdescription = newRevdescription;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__REVDESCRIPTION, oldRevdescription, newRevdescription);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevdescription(RevdescriptionType newRevdescription) {
		if (newRevdescription != revdescription) {
			NotificationChain msgs = null;
			if (revdescription != null)
				msgs = ((InternalEObject)revdescription).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__REVDESCRIPTION, null, msgs);
			if (newRevdescription != null)
				msgs = ((InternalEObject)newRevdescription).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__REVDESCRIPTION, null, msgs);
			msgs = basicSetRevdescription(newRevdescription, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__REVDESCRIPTION, newRevdescription, newRevdescription));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorinitialsType getAuthorinitials() {
		return authorinitials;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAuthorinitials(AuthorinitialsType newAuthorinitials, NotificationChain msgs) {
		AuthorinitialsType oldAuthorinitials = authorinitials;
		authorinitials = newAuthorinitials;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__AUTHORINITIALS, oldAuthorinitials, newAuthorinitials);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAuthorinitials(AuthorinitialsType newAuthorinitials) {
		if (newAuthorinitials != authorinitials) {
			NotificationChain msgs = null;
			if (authorinitials != null)
				msgs = ((InternalEObject)authorinitials).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__AUTHORINITIALS, null, msgs);
			if (newAuthorinitials != null)
				msgs = ((InternalEObject)newAuthorinitials).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.REVISION_TYPE__AUTHORINITIALS, null, msgs);
			msgs = basicSetAuthorinitials(newAuthorinitials, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REVISION_TYPE__AUTHORINITIALS, newAuthorinitials, newAuthorinitials));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.REVISION_TYPE__REVNUMBER:
				return basicSetRevnumber(null, msgs);
			case DocbookPackage.REVISION_TYPE__DATE:
				return basicSetDate(null, msgs);
			case DocbookPackage.REVISION_TYPE__AUTHORINITIALS:
				return basicSetAuthorinitials(null, msgs);
			case DocbookPackage.REVISION_TYPE__REVDESCRIPTION:
				return basicSetRevdescription(null, msgs);
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
			case DocbookPackage.REVISION_TYPE__REVNUMBER:
				return getRevnumber();
			case DocbookPackage.REVISION_TYPE__DATE:
				return getDate();
			case DocbookPackage.REVISION_TYPE__AUTHORINITIALS:
				return getAuthorinitials();
			case DocbookPackage.REVISION_TYPE__REVDESCRIPTION:
				return getRevdescription();
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
			case DocbookPackage.REVISION_TYPE__REVNUMBER:
				setRevnumber((RevnumberType)newValue);
				return;
			case DocbookPackage.REVISION_TYPE__DATE:
				setDate((DateType)newValue);
				return;
			case DocbookPackage.REVISION_TYPE__AUTHORINITIALS:
				setAuthorinitials((AuthorinitialsType)newValue);
				return;
			case DocbookPackage.REVISION_TYPE__REVDESCRIPTION:
				setRevdescription((RevdescriptionType)newValue);
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
			case DocbookPackage.REVISION_TYPE__REVNUMBER:
				setRevnumber((RevnumberType)null);
				return;
			case DocbookPackage.REVISION_TYPE__DATE:
				setDate((DateType)null);
				return;
			case DocbookPackage.REVISION_TYPE__AUTHORINITIALS:
				setAuthorinitials((AuthorinitialsType)null);
				return;
			case DocbookPackage.REVISION_TYPE__REVDESCRIPTION:
				setRevdescription((RevdescriptionType)null);
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
			case DocbookPackage.REVISION_TYPE__REVNUMBER:
				return revnumber != null;
			case DocbookPackage.REVISION_TYPE__DATE:
				return date != null;
			case DocbookPackage.REVISION_TYPE__AUTHORINITIALS:
				return authorinitials != null;
			case DocbookPackage.REVISION_TYPE__REVDESCRIPTION:
				return revdescription != null;
		}
		return super.eIsSet(featureID);
	}

} //RevisionTypeImpl
