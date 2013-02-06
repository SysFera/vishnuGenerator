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

import org.kermeta.Docbook.AddressType;
import org.kermeta.Docbook.AuthorType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.PersonnameType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Author Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.AuthorTypeImpl#getPersonname <em>Personname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.AuthorTypeImpl#getContrib <em>Contrib</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.AuthorTypeImpl#getAddress <em>Address</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AuthorTypeImpl extends EObjectImpl implements AuthorType {
	/**
	 * The cached value of the '{@link #getPersonname() <em>Personname</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonname()
	 * @generated
	 * @ordered
	 */
	protected PersonnameType personname;
	/**
	 * The default value of the '{@link #getContrib() <em>Contrib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrib()
	 * @generated
	 * @ordered
	 */
	protected static final String CONTRIB_EDEFAULT = "";
	/**
	 * The cached value of the '{@link #getContrib() <em>Contrib</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContrib()
	 * @generated
	 * @ordered
	 */
	protected String contrib = CONTRIB_EDEFAULT;
	/**
	 * The cached value of the '{@link #getAddress() <em>Address</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAddress()
	 * @generated
	 * @ordered
	 */
	protected AddressType address;
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AuthorTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.AUTHOR_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersonnameType getPersonname() {
		return personname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPersonname(PersonnameType newPersonname, NotificationChain msgs) {
		PersonnameType oldPersonname = personname;
		personname = newPersonname;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.AUTHOR_TYPE__PERSONNAME, oldPersonname, newPersonname);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPersonname(PersonnameType newPersonname) {
		if (newPersonname != personname) {
			NotificationChain msgs = null;
			if (personname != null)
				msgs = ((InternalEObject)personname).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.AUTHOR_TYPE__PERSONNAME, null, msgs);
			if (newPersonname != null)
				msgs = ((InternalEObject)newPersonname).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.AUTHOR_TYPE__PERSONNAME, null, msgs);
			msgs = basicSetPersonname(newPersonname, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.AUTHOR_TYPE__PERSONNAME, newPersonname, newPersonname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getContrib() {
		return contrib;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContrib(String newContrib) {
		String oldContrib = contrib;
		contrib = newContrib;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.AUTHOR_TYPE__CONTRIB, oldContrib, contrib));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressType getAddress() {
		return address;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAddress(AddressType newAddress, NotificationChain msgs) {
		AddressType oldAddress = address;
		address = newAddress;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.AUTHOR_TYPE__ADDRESS, oldAddress, newAddress);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAddress(AddressType newAddress) {
		if (newAddress != address) {
			NotificationChain msgs = null;
			if (address != null)
				msgs = ((InternalEObject)address).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.AUTHOR_TYPE__ADDRESS, null, msgs);
			if (newAddress != null)
				msgs = ((InternalEObject)newAddress).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.AUTHOR_TYPE__ADDRESS, null, msgs);
			msgs = basicSetAddress(newAddress, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.AUTHOR_TYPE__ADDRESS, newAddress, newAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.AUTHOR_TYPE__PERSONNAME:
				return basicSetPersonname(null, msgs);
			case DocbookPackage.AUTHOR_TYPE__ADDRESS:
				return basicSetAddress(null, msgs);
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
			case DocbookPackage.AUTHOR_TYPE__PERSONNAME:
				return getPersonname();
			case DocbookPackage.AUTHOR_TYPE__CONTRIB:
				return getContrib();
			case DocbookPackage.AUTHOR_TYPE__ADDRESS:
				return getAddress();
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
			case DocbookPackage.AUTHOR_TYPE__PERSONNAME:
				setPersonname((PersonnameType)newValue);
				return;
			case DocbookPackage.AUTHOR_TYPE__CONTRIB:
				setContrib((String)newValue);
				return;
			case DocbookPackage.AUTHOR_TYPE__ADDRESS:
				setAddress((AddressType)newValue);
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
			case DocbookPackage.AUTHOR_TYPE__PERSONNAME:
				setPersonname((PersonnameType)null);
				return;
			case DocbookPackage.AUTHOR_TYPE__CONTRIB:
				setContrib(CONTRIB_EDEFAULT);
				return;
			case DocbookPackage.AUTHOR_TYPE__ADDRESS:
				setAddress((AddressType)null);
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
			case DocbookPackage.AUTHOR_TYPE__PERSONNAME:
				return personname != null;
			case DocbookPackage.AUTHOR_TYPE__CONTRIB:
				return CONTRIB_EDEFAULT == null ? contrib != null : !CONTRIB_EDEFAULT.equals(contrib);
			case DocbookPackage.AUTHOR_TYPE__ADDRESS:
				return address != null;
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
		result.append(" (contrib: ");
		result.append(contrib);
		result.append(')');
		return result.toString();
	}

} //AuthorTypeImpl
