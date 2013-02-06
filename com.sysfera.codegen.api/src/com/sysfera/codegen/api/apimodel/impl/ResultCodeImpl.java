/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel.impl;

import com.sysfera.codegen.api.apimodel.APIUsage;
import com.sysfera.codegen.api.apimodel.ApimodelPackage;
import com.sysfera.codegen.api.apimodel.ResultCode;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Result Code</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl#getValue <em>Value</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ResultCodeImpl#getDiagnostic <em>Diagnostic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResultCodeImpl extends EObjectImpl implements ResultCode {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final int VALUE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected int value = VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected static final APIUsage USAGE_EDEFAULT = APIUsage.ALL;

	/**
	 * The cached value of the '{@link #getUsage() <em>Usage</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsage()
	 * @generated
	 * @ordered
	 */
	protected APIUsage usage = USAGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDiagnostic() <em>Diagnostic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostic()
	 * @generated
	 * @ordered
	 */
	protected static final String DIAGNOSTIC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDiagnostic() <em>Diagnostic</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnostic()
	 * @generated
	 * @ordered
	 */
	protected String diagnostic = DIAGNOSTIC_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResultCodeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApimodelPackage.Literals.RESULT_CODE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.RESULT_CODE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.RESULT_CODE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(int newValue) {
		int oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.RESULT_CODE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public APIUsage getUsage() {
		return usage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsage(APIUsage newUsage) {
		APIUsage oldUsage = usage;
		usage = newUsage == null ? USAGE_EDEFAULT : newUsage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.RESULT_CODE__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDiagnostic() {
		return diagnostic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiagnostic(String newDiagnostic) {
		String oldDiagnostic = diagnostic;
		diagnostic = newDiagnostic;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.RESULT_CODE__DIAGNOSTIC, oldDiagnostic, diagnostic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApimodelPackage.RESULT_CODE__NAME:
				return getName();
			case ApimodelPackage.RESULT_CODE__DESCRIPTION:
				return getDescription();
			case ApimodelPackage.RESULT_CODE__VALUE:
				return getValue();
			case ApimodelPackage.RESULT_CODE__USAGE:
				return getUsage();
			case ApimodelPackage.RESULT_CODE__DIAGNOSTIC:
				return getDiagnostic();
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
			case ApimodelPackage.RESULT_CODE__NAME:
				setName((String)newValue);
				return;
			case ApimodelPackage.RESULT_CODE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApimodelPackage.RESULT_CODE__VALUE:
				setValue((Integer)newValue);
				return;
			case ApimodelPackage.RESULT_CODE__USAGE:
				setUsage((APIUsage)newValue);
				return;
			case ApimodelPackage.RESULT_CODE__DIAGNOSTIC:
				setDiagnostic((String)newValue);
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
			case ApimodelPackage.RESULT_CODE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApimodelPackage.RESULT_CODE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApimodelPackage.RESULT_CODE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case ApimodelPackage.RESULT_CODE__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case ApimodelPackage.RESULT_CODE__DIAGNOSTIC:
				setDiagnostic(DIAGNOSTIC_EDEFAULT);
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
			case ApimodelPackage.RESULT_CODE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApimodelPackage.RESULT_CODE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApimodelPackage.RESULT_CODE__VALUE:
				return value != VALUE_EDEFAULT;
			case ApimodelPackage.RESULT_CODE__USAGE:
				return usage != USAGE_EDEFAULT;
			case ApimodelPackage.RESULT_CODE__DIAGNOSTIC:
				return DIAGNOSTIC_EDEFAULT == null ? diagnostic != null : !DIAGNOSTIC_EDEFAULT.equals(diagnostic);
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", value: ");
		result.append(value);
		result.append(", usage: ");
		result.append(usage);
		result.append(", diagnostic: ");
		result.append(diagnostic);
		result.append(')');
		return result.toString();
	}

} //ResultCodeImpl
