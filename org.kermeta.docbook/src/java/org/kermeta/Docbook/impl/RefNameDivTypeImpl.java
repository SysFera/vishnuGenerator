/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.RefNameDivType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Name Div Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.RefNameDivTypeImpl#getRefname <em>Refname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefNameDivTypeImpl#getRefpurpose <em>Refpurpose</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefNameDivTypeImpl#getRefclass <em>Refclass</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefNameDivTypeImpl extends EObjectImpl implements RefNameDivType {
	/**
	 * The default value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected static final String REFNAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRefname() <em>Refname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefname()
	 * @generated
	 * @ordered
	 */
	protected String refname = REFNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefpurpose() <em>Refpurpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefpurpose()
	 * @generated
	 * @ordered
	 */
	protected static final String REFPURPOSE_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRefpurpose() <em>Refpurpose</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefpurpose()
	 * @generated
	 * @ordered
	 */
	protected String refpurpose = REFPURPOSE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefclass() <em>Refclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefclass()
	 * @generated
	 * @ordered
	 */
	protected static final String REFCLASS_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getRefclass() <em>Refclass</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefclass()
	 * @generated
	 * @ordered
	 */
	protected String refclass = REFCLASS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefNameDivTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.REF_NAME_DIV_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefname() {
		return refname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefname(String newRefname) {
		String oldRefname = refname;
		refname = newRefname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_NAME_DIV_TYPE__REFNAME, oldRefname, refname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefpurpose() {
		return refpurpose;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefpurpose(String newRefpurpose) {
		String oldRefpurpose = refpurpose;
		refpurpose = newRefpurpose;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_NAME_DIV_TYPE__REFPURPOSE, oldRefpurpose, refpurpose));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRefclass() {
		return refclass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefclass(String newRefclass) {
		String oldRefclass = refclass;
		refclass = newRefclass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_NAME_DIV_TYPE__REFCLASS, oldRefclass, refclass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case DocbookPackage.REF_NAME_DIV_TYPE__REFNAME:
				return getRefname();
			case DocbookPackage.REF_NAME_DIV_TYPE__REFPURPOSE:
				return getRefpurpose();
			case DocbookPackage.REF_NAME_DIV_TYPE__REFCLASS:
				return getRefclass();
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
			case DocbookPackage.REF_NAME_DIV_TYPE__REFNAME:
				setRefname((String)newValue);
				return;
			case DocbookPackage.REF_NAME_DIV_TYPE__REFPURPOSE:
				setRefpurpose((String)newValue);
				return;
			case DocbookPackage.REF_NAME_DIV_TYPE__REFCLASS:
				setRefclass((String)newValue);
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
			case DocbookPackage.REF_NAME_DIV_TYPE__REFNAME:
				setRefname(REFNAME_EDEFAULT);
				return;
			case DocbookPackage.REF_NAME_DIV_TYPE__REFPURPOSE:
				setRefpurpose(REFPURPOSE_EDEFAULT);
				return;
			case DocbookPackage.REF_NAME_DIV_TYPE__REFCLASS:
				setRefclass(REFCLASS_EDEFAULT);
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
			case DocbookPackage.REF_NAME_DIV_TYPE__REFNAME:
				return REFNAME_EDEFAULT == null ? refname != null : !REFNAME_EDEFAULT.equals(refname);
			case DocbookPackage.REF_NAME_DIV_TYPE__REFPURPOSE:
				return REFPURPOSE_EDEFAULT == null ? refpurpose != null : !REFPURPOSE_EDEFAULT.equals(refpurpose);
			case DocbookPackage.REF_NAME_DIV_TYPE__REFCLASS:
				return REFCLASS_EDEFAULT == null ? refclass != null : !REFCLASS_EDEFAULT.equals(refclass);
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
		result.append(" (refname: ");
		result.append(refname);
		result.append(", refpurpose: ");
		result.append(refpurpose);
		result.append(", refclass: ");
		result.append(refclass);
		result.append(')');
		return result.toString();
	}

} //RefNameDivTypeImpl
