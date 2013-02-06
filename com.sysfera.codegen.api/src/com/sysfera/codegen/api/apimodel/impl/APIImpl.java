/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel.impl;

import com.sysfera.codegen.api.apimodel.API;
import com.sysfera.codegen.api.apimodel.ApimodelPackage;
import com.sysfera.codegen.api.apimodel.EnvVariableList;
import com.sysfera.codegen.api.apimodel.JobEnvVariableList;
import com.sysfera.codegen.api.apimodel.EnvVariable;
import com.sysfera.codegen.api.apimodel.Module;
import com.sysfera.codegen.api.apimodel.TypeList;
import com.sysfera.codegen.api.apimodel.ResultCode;
import com.sysfera.codegen.api.apimodel.Type;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>API</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.APIImpl#getModules <em>Modules</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.APIImpl#getEnvVariableList <em>Env Variable List</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.APIImpl#getJobEnvVariableList <em>Job Env Variable List</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.APIImpl#getTypeList <em>Type List</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class APIImpl extends EObjectImpl implements API {
	/**
	 * The cached value of the '{@link #getModules() <em>Modules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getModules()
	 * @generated
	 * @ordered
	 */
	protected EList<Module> modules;

	/**
	 * The cached value of the '{@link #getEnvVariableList() <em>Env Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvVariableList()
	 * @generated
	 * @ordered
	 */
	protected EnvVariableList envVariableList;

	/**
	 * The cached value of the '{@link #getJobEnvVariableList() <em>Job Env Variable List</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getJobEnvVariableList()
	 * @generated
	 * @ordered
	 */
	protected JobEnvVariableList jobEnvVariableList;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected APIImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApimodelPackage.Literals.API;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Module> getModules() {
		if (modules == null) {
			modules = new EObjectContainmentWithInverseEList<Module>(Module.class, this, ApimodelPackage.API__MODULES, ApimodelPackage.MODULE__API);
		}
		return modules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVariableList getEnvVariableList() {
		return envVariableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetEnvVariableList(EnvVariableList newEnvVariableList, NotificationChain msgs) {
		EnvVariableList oldEnvVariableList = envVariableList;
		envVariableList = newEnvVariableList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApimodelPackage.API__ENV_VARIABLE_LIST, oldEnvVariableList, newEnvVariableList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvVariableList(EnvVariableList newEnvVariableList) {
		if (newEnvVariableList != envVariableList) {
			NotificationChain msgs = null;
			if (envVariableList != null)
				msgs = ((InternalEObject)envVariableList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.API__ENV_VARIABLE_LIST, null, msgs);
			if (newEnvVariableList != null)
				msgs = ((InternalEObject)newEnvVariableList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.API__ENV_VARIABLE_LIST, null, msgs);
			msgs = basicSetEnvVariableList(newEnvVariableList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.API__ENV_VARIABLE_LIST, newEnvVariableList, newEnvVariableList));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JobEnvVariableList getJobEnvVariableList() {
		return jobEnvVariableList;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetJobEnvVariableList(JobEnvVariableList newJobEnvVariableList, NotificationChain msgs) {
		JobEnvVariableList oldJobEnvVariableList = jobEnvVariableList;
		jobEnvVariableList = newJobEnvVariableList;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApimodelPackage.API__JOB_ENV_VARIABLE_LIST, oldJobEnvVariableList, newJobEnvVariableList);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setJobEnvVariableList(JobEnvVariableList newJobEnvVariableList) {
		if (newJobEnvVariableList != jobEnvVariableList) {
			NotificationChain msgs = null;
			if (jobEnvVariableList != null)
				msgs = ((InternalEObject)jobEnvVariableList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.API__JOB_ENV_VARIABLE_LIST, null, msgs);
			if (newJobEnvVariableList != null)
				msgs = ((InternalEObject)newJobEnvVariableList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.API__JOB_ENV_VARIABLE_LIST, null, msgs);
			msgs = basicSetJobEnvVariableList(newJobEnvVariableList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.API__JOB_ENV_VARIABLE_LIST, newJobEnvVariableList, newJobEnvVariableList));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, ApimodelPackage.API__TYPE_LIST, oldTypeList, newTypeList);
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
				msgs = ((InternalEObject)typeList).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.API__TYPE_LIST, null, msgs);
			if (newTypeList != null)
				msgs = ((InternalEObject)newTypeList).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - ApimodelPackage.API__TYPE_LIST, null, msgs);
			msgs = basicSetTypeList(newTypeList, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.API__TYPE_LIST, newTypeList, newTypeList));
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
			case ApimodelPackage.API__MODULES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getModules()).basicAdd(otherEnd, msgs);
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
			case ApimodelPackage.API__MODULES:
				return ((InternalEList<?>)getModules()).basicRemove(otherEnd, msgs);
			case ApimodelPackage.API__ENV_VARIABLE_LIST:
				return basicSetEnvVariableList(null, msgs);
			case ApimodelPackage.API__JOB_ENV_VARIABLE_LIST:
				return basicSetJobEnvVariableList(null, msgs);
			case ApimodelPackage.API__TYPE_LIST:
				return basicSetTypeList(null, msgs);
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
			case ApimodelPackage.API__MODULES:
				return getModules();
			case ApimodelPackage.API__ENV_VARIABLE_LIST:
				return getEnvVariableList();
			case ApimodelPackage.API__JOB_ENV_VARIABLE_LIST:
				return getJobEnvVariableList();
			case ApimodelPackage.API__TYPE_LIST:
				return getTypeList();
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
			case ApimodelPackage.API__MODULES:
				getModules().clear();
				getModules().addAll((Collection<? extends Module>)newValue);
				return;
			case ApimodelPackage.API__ENV_VARIABLE_LIST:
				setEnvVariableList((EnvVariableList)newValue);
				return;
			case ApimodelPackage.API__JOB_ENV_VARIABLE_LIST:
				setJobEnvVariableList((JobEnvVariableList)newValue);
				return;
			case ApimodelPackage.API__TYPE_LIST:
				setTypeList((TypeList)newValue);
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
			case ApimodelPackage.API__MODULES:
				getModules().clear();
				return;
			case ApimodelPackage.API__ENV_VARIABLE_LIST:
				setEnvVariableList((EnvVariableList)null);
				return;
			case ApimodelPackage.API__JOB_ENV_VARIABLE_LIST:
				setJobEnvVariableList((JobEnvVariableList)null);
				return;
			case ApimodelPackage.API__TYPE_LIST:
				setTypeList((TypeList)null);
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
			case ApimodelPackage.API__MODULES:
				return modules != null && !modules.isEmpty();
			case ApimodelPackage.API__ENV_VARIABLE_LIST:
				return envVariableList != null;
			case ApimodelPackage.API__JOB_ENV_VARIABLE_LIST:
				return jobEnvVariableList != null;
			case ApimodelPackage.API__TYPE_LIST:
				return typeList != null;
		}
		return super.eIsSet(featureID);
	}

} //APIImpl
