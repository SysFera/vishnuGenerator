/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel.impl;

import com.sysfera.codegen.api.apimodel.ApimodelPackage;
import com.sysfera.codegen.api.apimodel.Module;
import com.sysfera.codegen.api.apimodel.Port;
import com.sysfera.codegen.api.apimodel.ResultCode;
import com.sysfera.codegen.api.apimodel.Service;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getModule <em>Module</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getPorts <em>Ports</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#isAdminOnly <em>Admin Only</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#isIsCommand <em>Is Command</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#isIsFunction <em>Is Function</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getResultCodes <em>Result Codes</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getUsedServices <em>Used Services</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getUsedByServices <em>Used By Services</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.ServiceImpl#isUseJobEnv <em>Use Job Env</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ServiceImpl extends EObjectImpl implements Service {
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
	 * The cached value of the '{@link #getPorts() <em>Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ports;

	/**
	 * The default value of the '{@link #isAdminOnly() <em>Admin Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminOnly()
	 * @generated
	 * @ordered
	 */
	protected static final boolean ADMIN_ONLY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isAdminOnly() <em>Admin Only</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isAdminOnly()
	 * @generated
	 * @ordered
	 */
	protected boolean adminOnly = ADMIN_ONLY_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsCommand() <em>Is Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCommand()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMMAND_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsCommand() <em>Is Command</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCommand()
	 * @generated
	 * @ordered
	 */
	protected boolean isCommand = IS_COMMAND_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsFunction() <em>Is Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFunction()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_FUNCTION_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isIsFunction() <em>Is Function</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsFunction()
	 * @generated
	 * @ordered
	 */
	protected boolean isFunction = IS_FUNCTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getResultCodes() <em>Result Codes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<ResultCode> resultCodes;

	/**
	 * The cached value of the '{@link #getUsedServices() <em>Used Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> usedServices;

	/**
	 * The cached value of the '{@link #getUsedByServices() <em>Used By Services</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsedByServices()
	 * @generated
	 * @ordered
	 */
	protected EList<Service> usedByServices;

	/**
	 * The cached value of the '{@link #getDetails() <em>Details</em>}' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDetails()
	 * @generated
	 * @ordered
	 */
	protected EMap<String, String> details;

	/**
	 * The default value of the '{@link #isUseJobEnv() <em>Use Job Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseJobEnv()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_JOB_ENV_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseJobEnv() <em>Use Job Env</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseJobEnv()
	 * @generated
	 * @ordered
	 */
	protected boolean useJobEnv = USE_JOB_ENV_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApimodelPackage.Literals.SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.SERVICE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.SERVICE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Module getModule() {
		if (eContainerFeatureID() != ApimodelPackage.SERVICE__MODULE) return null;
		return (Module)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetModule(Module newModule, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newModule, ApimodelPackage.SERVICE__MODULE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setModule(Module newModule) {
		if (newModule != eInternalContainer() || (eContainerFeatureID() != ApimodelPackage.SERVICE__MODULE && newModule != null)) {
			if (EcoreUtil.isAncestor(this, newModule))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newModule != null)
				msgs = ((InternalEObject)newModule).eInverseAdd(this, ApimodelPackage.MODULE__SERVICES, Module.class, msgs);
			msgs = basicSetModule(newModule, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.SERVICE__MODULE, newModule, newModule));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getPorts() {
		if (ports == null) {
			ports = new EObjectContainmentWithInverseEList<Port>(Port.class, this, ApimodelPackage.SERVICE__PORTS, ApimodelPackage.PORT__SERVICE);
		}
		return ports;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isAdminOnly() {
		return adminOnly;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdminOnly(boolean newAdminOnly) {
		boolean oldAdminOnly = adminOnly;
		adminOnly = newAdminOnly;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.SERVICE__ADMIN_ONLY, oldAdminOnly, adminOnly));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCommand() {
		return isCommand;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCommand(boolean newIsCommand) {
		boolean oldIsCommand = isCommand;
		isCommand = newIsCommand;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.SERVICE__IS_COMMAND, oldIsCommand, isCommand));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsFunction() {
		return isFunction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsFunction(boolean newIsFunction) {
		boolean oldIsFunction = isFunction;
		isFunction = newIsFunction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.SERVICE__IS_FUNCTION, oldIsFunction, isFunction));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ResultCode> getResultCodes() {
		if (resultCodes == null) {
			resultCodes = new EObjectResolvingEList<ResultCode>(ResultCode.class, this, ApimodelPackage.SERVICE__RESULT_CODES);
		}
		return resultCodes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getUsedServices() {
		if (usedServices == null) {
			usedServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ApimodelPackage.SERVICE__USED_SERVICES, ApimodelPackage.SERVICE__USED_BY_SERVICES);
		}
		return usedServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Service> getUsedByServices() {
		if (usedByServices == null) {
			usedByServices = new EObjectWithInverseResolvingEList.ManyInverse<Service>(Service.class, this, ApimodelPackage.SERVICE__USED_BY_SERVICES, ApimodelPackage.SERVICE__USED_SERVICES);
		}
		return usedByServices;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getDetails() {
		if (details == null) {
			details = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ApimodelPackage.SERVICE__DETAILS);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseJobEnv() {
		return useJobEnv;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseJobEnv(boolean newUseJobEnv) {
		boolean oldUseJobEnv = useJobEnv;
		useJobEnv = newUseJobEnv;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.SERVICE__USE_JOB_ENV, oldUseJobEnv, useJobEnv));
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
			case ApimodelPackage.SERVICE__MODULE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetModule((Module)otherEnd, msgs);
			case ApimodelPackage.SERVICE__PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getPorts()).basicAdd(otherEnd, msgs);
			case ApimodelPackage.SERVICE__USED_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedServices()).basicAdd(otherEnd, msgs);
			case ApimodelPackage.SERVICE__USED_BY_SERVICES:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getUsedByServices()).basicAdd(otherEnd, msgs);
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
			case ApimodelPackage.SERVICE__MODULE:
				return basicSetModule(null, msgs);
			case ApimodelPackage.SERVICE__PORTS:
				return ((InternalEList<?>)getPorts()).basicRemove(otherEnd, msgs);
			case ApimodelPackage.SERVICE__USED_SERVICES:
				return ((InternalEList<?>)getUsedServices()).basicRemove(otherEnd, msgs);
			case ApimodelPackage.SERVICE__USED_BY_SERVICES:
				return ((InternalEList<?>)getUsedByServices()).basicRemove(otherEnd, msgs);
			case ApimodelPackage.SERVICE__DETAILS:
				return ((InternalEList<?>)getDetails()).basicRemove(otherEnd, msgs);
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
			case ApimodelPackage.SERVICE__MODULE:
				return eInternalContainer().eInverseRemove(this, ApimodelPackage.MODULE__SERVICES, Module.class, msgs);
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
			case ApimodelPackage.SERVICE__NAME:
				return getName();
			case ApimodelPackage.SERVICE__DESCRIPTION:
				return getDescription();
			case ApimodelPackage.SERVICE__MODULE:
				return getModule();
			case ApimodelPackage.SERVICE__PORTS:
				return getPorts();
			case ApimodelPackage.SERVICE__ADMIN_ONLY:
				return isAdminOnly();
			case ApimodelPackage.SERVICE__IS_COMMAND:
				return isIsCommand();
			case ApimodelPackage.SERVICE__IS_FUNCTION:
				return isIsFunction();
			case ApimodelPackage.SERVICE__RESULT_CODES:
				return getResultCodes();
			case ApimodelPackage.SERVICE__USED_SERVICES:
				return getUsedServices();
			case ApimodelPackage.SERVICE__USED_BY_SERVICES:
				return getUsedByServices();
			case ApimodelPackage.SERVICE__DETAILS:
				if (coreType) return getDetails();
				else return getDetails().map();
			case ApimodelPackage.SERVICE__USE_JOB_ENV:
				return isUseJobEnv();
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
			case ApimodelPackage.SERVICE__NAME:
				setName((String)newValue);
				return;
			case ApimodelPackage.SERVICE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApimodelPackage.SERVICE__MODULE:
				setModule((Module)newValue);
				return;
			case ApimodelPackage.SERVICE__PORTS:
				getPorts().clear();
				getPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case ApimodelPackage.SERVICE__ADMIN_ONLY:
				setAdminOnly((Boolean)newValue);
				return;
			case ApimodelPackage.SERVICE__IS_COMMAND:
				setIsCommand((Boolean)newValue);
				return;
			case ApimodelPackage.SERVICE__IS_FUNCTION:
				setIsFunction((Boolean)newValue);
				return;
			case ApimodelPackage.SERVICE__RESULT_CODES:
				getResultCodes().clear();
				getResultCodes().addAll((Collection<? extends ResultCode>)newValue);
				return;
			case ApimodelPackage.SERVICE__USED_SERVICES:
				getUsedServices().clear();
				getUsedServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ApimodelPackage.SERVICE__USED_BY_SERVICES:
				getUsedByServices().clear();
				getUsedByServices().addAll((Collection<? extends Service>)newValue);
				return;
			case ApimodelPackage.SERVICE__DETAILS:
				((EStructuralFeature.Setting)getDetails()).set(newValue);
				return;
			case ApimodelPackage.SERVICE__USE_JOB_ENV:
				setUseJobEnv((Boolean)newValue);
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
			case ApimodelPackage.SERVICE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApimodelPackage.SERVICE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApimodelPackage.SERVICE__MODULE:
				setModule((Module)null);
				return;
			case ApimodelPackage.SERVICE__PORTS:
				getPorts().clear();
				return;
			case ApimodelPackage.SERVICE__ADMIN_ONLY:
				setAdminOnly(ADMIN_ONLY_EDEFAULT);
				return;
			case ApimodelPackage.SERVICE__IS_COMMAND:
				setIsCommand(IS_COMMAND_EDEFAULT);
				return;
			case ApimodelPackage.SERVICE__IS_FUNCTION:
				setIsFunction(IS_FUNCTION_EDEFAULT);
				return;
			case ApimodelPackage.SERVICE__RESULT_CODES:
				getResultCodes().clear();
				return;
			case ApimodelPackage.SERVICE__USED_SERVICES:
				getUsedServices().clear();
				return;
			case ApimodelPackage.SERVICE__USED_BY_SERVICES:
				getUsedByServices().clear();
				return;
			case ApimodelPackage.SERVICE__DETAILS:
				getDetails().clear();
				return;
			case ApimodelPackage.SERVICE__USE_JOB_ENV:
				setUseJobEnv(USE_JOB_ENV_EDEFAULT);
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
			case ApimodelPackage.SERVICE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApimodelPackage.SERVICE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApimodelPackage.SERVICE__MODULE:
				return getModule() != null;
			case ApimodelPackage.SERVICE__PORTS:
				return ports != null && !ports.isEmpty();
			case ApimodelPackage.SERVICE__ADMIN_ONLY:
				return adminOnly != ADMIN_ONLY_EDEFAULT;
			case ApimodelPackage.SERVICE__IS_COMMAND:
				return isCommand != IS_COMMAND_EDEFAULT;
			case ApimodelPackage.SERVICE__IS_FUNCTION:
				return isFunction != IS_FUNCTION_EDEFAULT;
			case ApimodelPackage.SERVICE__RESULT_CODES:
				return resultCodes != null && !resultCodes.isEmpty();
			case ApimodelPackage.SERVICE__USED_SERVICES:
				return usedServices != null && !usedServices.isEmpty();
			case ApimodelPackage.SERVICE__USED_BY_SERVICES:
				return usedByServices != null && !usedByServices.isEmpty();
			case ApimodelPackage.SERVICE__DETAILS:
				return details != null && !details.isEmpty();
			case ApimodelPackage.SERVICE__USE_JOB_ENV:
				return useJobEnv != USE_JOB_ENV_EDEFAULT;
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
		result.append(", adminOnly: ");
		result.append(adminOnly);
		result.append(", isCommand: ");
		result.append(isCommand);
		result.append(", isFunction: ");
		result.append(isFunction);
		result.append(", useJobEnv: ");
		result.append(useJobEnv);
		result.append(')');
		return result.toString();
	}

} //ServiceImpl
