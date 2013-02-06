/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel.impl;

import com.sysfera.codegen.api.apimodel.API;
import com.sysfera.codegen.api.apimodel.ApimodelPackage;
import com.sysfera.codegen.api.apimodel.EnvVariable;
import com.sysfera.codegen.api.apimodel.Module;
import com.sysfera.codegen.api.apimodel.ResultCodeList;
import com.sysfera.codegen.api.apimodel.ResultCode;
import com.sysfera.codegen.api.apimodel.Service;

import com.sysfera.codegen.api.apimodel.TypeList;
import com.sysfera.codegen.api.apimodel.Type;
import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Module</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ModuleImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ModuleImpl#getApi <em>Api</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ModuleImpl#getServices <em>Services</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ModuleImpl#getTypeList <em>Type List</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ModuleImpl#getResultCodeList <em>Result Code List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ModuleImpl extends EObjectImpl implements Module {
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
	 * The cached value of the '{@link #getServices() <em>Services</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> services;

	/**
	 * The cached value of the '{@link #getTypeList() <em>Type List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypeList()
	 * @generated
	 * @ordered
	 */
	protected TypeList typeList;

	/**
	 * The cached value of the '{@link #getResultCodeList() <em>Result Code List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCodeList()
	 * @generated
	 * @ordered
	 */
	protected ResultCodeList resultCodeList;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApimodelPackage.Literals.MODULE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.MODULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public API getApi() {
		if (eContainerFeatureID() != ApimodelPackage.MODULE__API) return null;
		return (API)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetApi(API newApi, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newApi, ApimodelPackage.MODULE__API, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setApi(API newApi) {
		if (newApi != eInternalContainer() || (eContainerFeatureID() != ApimodelPackage.MODULE__API && newApi != null)) {
			if (EcoreUtil.isAncestor(this, newApi))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newApi != null)
				msgs = ((InternalEObject)newApi).eInverseAdd(this, ApimodelPackage.API__MODULES, API.class, msgs);
			msgs = basicSetApi(newApi, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.MODULE__API, newApi, newApi));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getServices() {
		if (services == null) {
			services = new EObjectContainmentWithInverseEList<Service>(Service.class, this, ApimodelPackage.MODULE__SERVICES, ApimodelPackage.SERVICE__MODULE);
		}
		return services;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeList getTypeList() {
		return typeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTypeList(TypeList newTypeList, NotificationChain msgs) {
		TypeList oldTypeList = typeList;
		typeList = newTypeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApimodelPackage.MODULE__TYPE_LIST, oldTypeList, newTypeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTypeList(TypeList newTypeList) {
		if (newTypeList != typeList) {
			NotificationChain msgs = null;
			if (typeList != null)
				msgs = ((InternalEObject)typeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.MODULE__TYPE_LIST, null, msgs);
			if (newTypeList != null)
				msgs = ((InternalEObject)newTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.MODULE__TYPE_LIST, null, msgs);
			msgs = basicSetTypeList(newTypeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.MODULE__TYPE_LIST, newTypeList, newTypeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultCodeList getResultCodeList() {
		return resultCodeList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResultCodeList(ResultCodeList newResultCodeList, NotificationChain msgs) {
		ResultCodeList oldResultCodeList = resultCodeList;
		resultCodeList = newResultCodeList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApimodelPackage.MODULE__RESULT_CODE_LIST, oldResultCodeList, newResultCodeList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResultCodeList(ResultCodeList newResultCodeList) {
		if (newResultCodeList != resultCodeList) {
			NotificationChain msgs = null;
			if (resultCodeList != null)
				msgs = ((InternalEObject)resultCodeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.MODULE__RESULT_CODE_LIST, null, msgs);
			if (newResultCodeList != null)
				msgs = ((InternalEObject)newResultCodeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.MODULE__RESULT_CODE_LIST, null, msgs);
			msgs = basicSetResultCodeList(newResultCodeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.MODULE__RESULT_CODE_LIST, newResultCodeList, newResultCodeList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApimodelPackage.MODULE__API:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetApi((API)otherEnd, msgs);
			case ApimodelPackage.MODULE__SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getServices()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApimodelPackage.MODULE__API:
				return basicSetApi(null, msgs);
			case ApimodelPackage.MODULE__SERVICES:
				return ((InternalEList<?>)getServices()).basicRemove(otherEnd, msgs);
			case ApimodelPackage.MODULE__TYPE_LIST:
				return basicSetTypeList(null, msgs);
			case ApimodelPackage.MODULE__RESULT_CODE_LIST:
				return basicSetResultCodeList(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case ApimodelPackage.MODULE__API:
				return eInternalContainer().eInverseRemove(this, ApimodelPackage.API__MODULES, API.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ApimodelPackage.MODULE__NAME:
				return getName();
			case ApimodelPackage.MODULE__API:
				return getApi();
			case ApimodelPackage.MODULE__SERVICES:
				return getServices();
			case ApimodelPackage.MODULE__TYPE_LIST:
				return getTypeList();
			case ApimodelPackage.MODULE__RESULT_CODE_LIST:
				return getResultCodeList();
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
			case ApimodelPackage.MODULE__NAME:
				setName((String)newValue);
				return;
			case ApimodelPackage.MODULE__API:
				setApi((API)newValue);
				return;
			case ApimodelPackage.MODULE__SERVICES:
				getServices().clear();
				getServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ApimodelPackage.MODULE__TYPE_LIST:
				setTypeList((TypeList)newValue);
				return;
			case ApimodelPackage.MODULE__RESULT_CODE_LIST:
				setResultCodeList((ResultCodeList)newValue);
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
			case ApimodelPackage.MODULE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApimodelPackage.MODULE__API:
				setApi((API)null);
				return;
			case ApimodelPackage.MODULE__SERVICES:
				getServices().clear();
				return;
			case ApimodelPackage.MODULE__TYPE_LIST:
				setTypeList((TypeList)null);
				return;
			case ApimodelPackage.MODULE__RESULT_CODE_LIST:
				setResultCodeList((ResultCodeList)null);
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
			case ApimodelPackage.MODULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApimodelPackage.MODULE__API:
				return getApi() != null;
			case ApimodelPackage.MODULE__SERVICES:
				return services != null && !services.isEmpty();
			case ApimodelPackage.MODULE__TYPE_LIST:
				return typeList != null;
			case ApimodelPackage.MODULE__RESULT_CODE_LIST:
				return resultCodeList != null;
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
		result.append(')');
		return result.toString();
	}

} //ModuleImpl
