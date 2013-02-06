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
import org.kermeta.Docbook.FirstnameType;
import org.kermeta.Docbook.PersonnameType;
import org.kermeta.Docbook.SurnameType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personname Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.PersonnameTypeImpl#getFirstname <em>Firstname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.PersonnameTypeImpl#getSurname <em>Surname</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonnameTypeImpl extends EObjectImpl implements PersonnameType {
	/**
	 * The cached value of the '{@link #getFirstname() <em>Firstname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFirstname()
	 * @generated
	 * @ordered
	 */
	protected FirstnameType firstname;

	/**
	 * The cached value of the '{@link #getSurname() <em>Surname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSurname()
	 * @generated
	 * @ordered
	 */
	protected SurnameType surname;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonnameTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.PERSONNAME_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstnameType getFirstname() {
		return firstname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFirstname(FirstnameType newFirstname, NotificationChain msgs) {
		FirstnameType oldFirstname = firstname;
		firstname = newFirstname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.PERSONNAME_TYPE__FIRSTNAME, oldFirstname, newFirstname);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstname(FirstnameType newFirstname) {
		if (newFirstname != firstname) {
			NotificationChain msgs = null;
			if (firstname != null)
				msgs = ((InternalEObject)firstname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PERSONNAME_TYPE__FIRSTNAME, null, msgs);
			if (newFirstname != null)
				msgs = ((InternalEObject)newFirstname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PERSONNAME_TYPE__FIRSTNAME, null, msgs);
			msgs = basicSetFirstname(newFirstname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PERSONNAME_TYPE__FIRSTNAME, newFirstname, newFirstname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SurnameType getSurname() {
		return surname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSurname(SurnameType newSurname, NotificationChain msgs) {
		SurnameType oldSurname = surname;
		surname = newSurname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.PERSONNAME_TYPE__SURNAME, oldSurname, newSurname);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSurname(SurnameType newSurname) {
		if (newSurname != surname) {
			NotificationChain msgs = null;
			if (surname != null)
				msgs = ((InternalEObject)surname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PERSONNAME_TYPE__SURNAME, null, msgs);
			if (newSurname != null)
				msgs = ((InternalEObject)newSurname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.PERSONNAME_TYPE__SURNAME, null, msgs);
			msgs = basicSetSurname(newSurname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.PERSONNAME_TYPE__SURNAME, newSurname, newSurname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.PERSONNAME_TYPE__FIRSTNAME:
				return basicSetFirstname(null, msgs);
			case DocbookPackage.PERSONNAME_TYPE__SURNAME:
				return basicSetSurname(null, msgs);
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
			case DocbookPackage.PERSONNAME_TYPE__FIRSTNAME:
				return getFirstname();
			case DocbookPackage.PERSONNAME_TYPE__SURNAME:
				return getSurname();
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
			case DocbookPackage.PERSONNAME_TYPE__FIRSTNAME:
				setFirstname((FirstnameType)newValue);
				return;
			case DocbookPackage.PERSONNAME_TYPE__SURNAME:
				setSurname((SurnameType)newValue);
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
			case DocbookPackage.PERSONNAME_TYPE__FIRSTNAME:
				setFirstname((FirstnameType)null);
				return;
			case DocbookPackage.PERSONNAME_TYPE__SURNAME:
				setSurname((SurnameType)null);
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
			case DocbookPackage.PERSONNAME_TYPE__FIRSTNAME:
				return firstname != null;
			case DocbookPackage.PERSONNAME_TYPE__SURNAME:
				return surname != null;
		}
		return super.eIsSet(featureID);
	}

} //PersonnameTypeImpl
