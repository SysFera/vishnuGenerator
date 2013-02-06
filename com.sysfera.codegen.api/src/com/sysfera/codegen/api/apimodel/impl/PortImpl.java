/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel.impl;

import com.sysfera.codegen.api.apimodel.APIUsage;
import com.sysfera.codegen.api.apimodel.ApimodelPackage;
import com.sysfera.codegen.api.apimodel.EnvVariable;
import com.sysfera.codegen.api.apimodel.Port;
import com.sysfera.codegen.api.apimodel.Service;
import com.sysfera.codegen.api.apimodel.Type;
import com.sysfera.codegen.api.apimodel.portDirection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.impl.EStringToStringMapEntryImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Port</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getService <em>Service</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getDirection <em>Direction</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getUsage <em>Usage</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#isOptional <em>Optional</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getShortOptionLetter <em>Short Option Letter</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getLongOptionName <em>Long Option Name</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getEnvOption <em>Env Option</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getDefaultValueLiteral <em>Default Value Literal</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.PortImpl#getDetails <em>Details</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortImpl extends EObjectImpl implements Port {
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
	 * The default value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected static final portDirection DIRECTION_EDEFAULT = portDirection.IN;

	/**
	 * The cached value of the '{@link #getDirection() <em>Direction</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDirection()
	 * @generated
	 * @ordered
	 */
	protected portDirection direction = DIRECTION_EDEFAULT;

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
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected Type dataType;

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
	 * The default value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected static final boolean OPTIONAL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isOptional() <em>Optional</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isOptional()
	 * @generated
	 * @ordered
	 */
	protected boolean optional = OPTIONAL_EDEFAULT;

	/**
	 * The default value of the '{@link #getShortOptionLetter() <em>Short Option Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortOptionLetter()
	 * @generated
	 * @ordered
	 */
	protected static final String SHORT_OPTION_LETTER_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getShortOptionLetter() <em>Short Option Letter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getShortOptionLetter()
	 * @generated
	 * @ordered
	 */
	protected String shortOptionLetter = SHORT_OPTION_LETTER_EDEFAULT;

	/**
	 * The default value of the '{@link #getLongOptionName() <em>Long Option Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongOptionName()
	 * @generated
	 * @ordered
	 */
	protected static final String LONG_OPTION_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLongOptionName() <em>Long Option Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLongOptionName()
	 * @generated
	 * @ordered
	 */
	protected String longOptionName = LONG_OPTION_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEnvOption() <em>Env Option</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnvOption()
	 * @generated
	 * @ordered
	 */
	protected EnvVariable envOption;

	/**
	 * The default value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_LITERAL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValueLiteral() <em>Default Value Literal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValueLiteral()
	 * @generated
	 * @ordered
	 */
	protected String defaultValueLiteral = DEFAULT_VALUE_LITERAL_EDEFAULT;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApimodelPackage.Literals.PORT;
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Service getService() {
		if (eContainerFeatureID() != ApimodelPackage.PORT__SERVICE) return null;
		return (Service)eContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetService(Service newService, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newService, ApimodelPackage.PORT__SERVICE, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setService(Service newService) {
		if (newService != eInternalContainer() || (eContainerFeatureID() != ApimodelPackage.PORT__SERVICE && newService != null)) {
			if (EcoreUtil.isAncestor(this, newService))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newService != null)
				msgs = ((InternalEObject)newService).eInverseAdd(this, ApimodelPackage.SERVICE__PORTS, Service.class, msgs);
			msgs = basicSetService(newService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__SERVICE, newService, newService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public portDirection getDirection() {
		return direction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDirection(portDirection newDirection) {
		portDirection oldDirection = direction;
		direction = newDirection == null ? DIRECTION_EDEFAULT : newDirection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__DIRECTION, oldDirection, direction));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__USAGE, oldUsage, usage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type getDataType() {
		if (dataType != null && dataType.eIsProxy()) {
			InternalEObject oldDataType = (InternalEObject)dataType;
			dataType = (Type)eResolveProxy(oldDataType);
			if (dataType != oldDataType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApimodelPackage.PORT__DATA_TYPE, oldDataType, dataType));
			}
		}
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Type basicGetDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(Type newDataType) {
		Type oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__DATA_TYPE, oldDataType, dataType));
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
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isOptional() {
		return optional;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOptional(boolean newOptional) {
		boolean oldOptional = optional;
		optional = newOptional;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__OPTIONAL, oldOptional, optional));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getShortOptionLetter() {
		return shortOptionLetter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setShortOptionLetter(String newShortOptionLetter) {
		String oldShortOptionLetter = shortOptionLetter;
		shortOptionLetter = newShortOptionLetter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__SHORT_OPTION_LETTER, oldShortOptionLetter, shortOptionLetter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLongOptionName() {
		return longOptionName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLongOptionName(String newLongOptionName) {
		String oldLongOptionName = longOptionName;
		longOptionName = newLongOptionName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__LONG_OPTION_NAME, oldLongOptionName, longOptionName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVariable getEnvOption() {
		if (envOption != null && envOption.eIsProxy()) {
			InternalEObject oldEnvOption = (InternalEObject)envOption;
			envOption = (EnvVariable)eResolveProxy(oldEnvOption);
			if (envOption != oldEnvOption) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ApimodelPackage.PORT__ENV_OPTION, oldEnvOption, envOption));
			}
		}
		return envOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EnvVariable basicGetEnvOption() {
		return envOption;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEnvOption(EnvVariable newEnvOption) {
		EnvVariable oldEnvOption = envOption;
		envOption = newEnvOption;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__ENV_OPTION, oldEnvOption, envOption));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValueLiteral() {
		return defaultValueLiteral;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValueLiteral(String newDefaultValueLiteral) {
		String oldDefaultValueLiteral = defaultValueLiteral;
		defaultValueLiteral = newDefaultValueLiteral;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ApimodelPackage.PORT__DEFAULT_VALUE_LITERAL, oldDefaultValueLiteral, defaultValueLiteral));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMap<String, String> getDetails() {
		if (details == null) {
			details = new EcoreEMap<String,String>(EcorePackage.Literals.ESTRING_TO_STRING_MAP_ENTRY, EStringToStringMapEntryImpl.class, this, ApimodelPackage.PORT__DETAILS);
		}
		return details;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApimodelPackage.PORT__SERVICE:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetService((Service)otherEnd, msgs);
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
			case ApimodelPackage.PORT__SERVICE:
				return basicSetService(null, msgs);
			case ApimodelPackage.PORT__DETAILS:
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
			case ApimodelPackage.PORT__SERVICE:
				return eInternalContainer().eInverseRemove(this, ApimodelPackage.SERVICE__PORTS, Service.class, msgs);
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
			case ApimodelPackage.PORT__NAME:
				return getName();
			case ApimodelPackage.PORT__SERVICE:
				return getService();
			case ApimodelPackage.PORT__DIRECTION:
				return getDirection();
			case ApimodelPackage.PORT__USAGE:
				return getUsage();
			case ApimodelPackage.PORT__DATA_TYPE:
				if (resolve) return getDataType();
				return basicGetDataType();
			case ApimodelPackage.PORT__DESCRIPTION:
				return getDescription();
			case ApimodelPackage.PORT__OPTIONAL:
				return isOptional();
			case ApimodelPackage.PORT__SHORT_OPTION_LETTER:
				return getShortOptionLetter();
			case ApimodelPackage.PORT__LONG_OPTION_NAME:
				return getLongOptionName();
			case ApimodelPackage.PORT__ENV_OPTION:
				if (resolve) return getEnvOption();
				return basicGetEnvOption();
			case ApimodelPackage.PORT__DEFAULT_VALUE_LITERAL:
				return getDefaultValueLiteral();
			case ApimodelPackage.PORT__DETAILS:
				if (coreType) return getDetails();
				else return getDetails().map();
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
			case ApimodelPackage.PORT__NAME:
				setName((String)newValue);
				return;
			case ApimodelPackage.PORT__SERVICE:
				setService((Service)newValue);
				return;
			case ApimodelPackage.PORT__DIRECTION:
				setDirection((portDirection)newValue);
				return;
			case ApimodelPackage.PORT__USAGE:
				setUsage((APIUsage)newValue);
				return;
			case ApimodelPackage.PORT__DATA_TYPE:
				setDataType((Type)newValue);
				return;
			case ApimodelPackage.PORT__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case ApimodelPackage.PORT__OPTIONAL:
				setOptional((Boolean)newValue);
				return;
			case ApimodelPackage.PORT__SHORT_OPTION_LETTER:
				setShortOptionLetter((String)newValue);
				return;
			case ApimodelPackage.PORT__LONG_OPTION_NAME:
				setLongOptionName((String)newValue);
				return;
			case ApimodelPackage.PORT__ENV_OPTION:
				setEnvOption((EnvVariable)newValue);
				return;
			case ApimodelPackage.PORT__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral((String)newValue);
				return;
			case ApimodelPackage.PORT__DETAILS:
				((EStructuralFeature.Setting)getDetails()).set(newValue);
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
			case ApimodelPackage.PORT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case ApimodelPackage.PORT__SERVICE:
				setService((Service)null);
				return;
			case ApimodelPackage.PORT__DIRECTION:
				setDirection(DIRECTION_EDEFAULT);
				return;
			case ApimodelPackage.PORT__USAGE:
				setUsage(USAGE_EDEFAULT);
				return;
			case ApimodelPackage.PORT__DATA_TYPE:
				setDataType((Type)null);
				return;
			case ApimodelPackage.PORT__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case ApimodelPackage.PORT__OPTIONAL:
				setOptional(OPTIONAL_EDEFAULT);
				return;
			case ApimodelPackage.PORT__SHORT_OPTION_LETTER:
				setShortOptionLetter(SHORT_OPTION_LETTER_EDEFAULT);
				return;
			case ApimodelPackage.PORT__LONG_OPTION_NAME:
				setLongOptionName(LONG_OPTION_NAME_EDEFAULT);
				return;
			case ApimodelPackage.PORT__ENV_OPTION:
				setEnvOption((EnvVariable)null);
				return;
			case ApimodelPackage.PORT__DEFAULT_VALUE_LITERAL:
				setDefaultValueLiteral(DEFAULT_VALUE_LITERAL_EDEFAULT);
				return;
			case ApimodelPackage.PORT__DETAILS:
				getDetails().clear();
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
			case ApimodelPackage.PORT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case ApimodelPackage.PORT__SERVICE:
				return getService() != null;
			case ApimodelPackage.PORT__DIRECTION:
				return direction != DIRECTION_EDEFAULT;
			case ApimodelPackage.PORT__USAGE:
				return usage != USAGE_EDEFAULT;
			case ApimodelPackage.PORT__DATA_TYPE:
				return dataType != null;
			case ApimodelPackage.PORT__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case ApimodelPackage.PORT__OPTIONAL:
				return optional != OPTIONAL_EDEFAULT;
			case ApimodelPackage.PORT__SHORT_OPTION_LETTER:
				return SHORT_OPTION_LETTER_EDEFAULT == null ? shortOptionLetter != null : !SHORT_OPTION_LETTER_EDEFAULT.equals(shortOptionLetter);
			case ApimodelPackage.PORT__LONG_OPTION_NAME:
				return LONG_OPTION_NAME_EDEFAULT == null ? longOptionName != null : !LONG_OPTION_NAME_EDEFAULT.equals(longOptionName);
			case ApimodelPackage.PORT__ENV_OPTION:
				return envOption != null;
			case ApimodelPackage.PORT__DEFAULT_VALUE_LITERAL:
				return DEFAULT_VALUE_LITERAL_EDEFAULT == null ? defaultValueLiteral != null : !DEFAULT_VALUE_LITERAL_EDEFAULT.equals(defaultValueLiteral);
			case ApimodelPackage.PORT__DETAILS:
				return details != null && !details.isEmpty();
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
		result.append(", direction: ");
		result.append(direction);
		result.append(", usage: ");
		result.append(usage);
		result.append(", description: ");
		result.append(description);
		result.append(", optional: ");
		result.append(optional);
		result.append(", shortOptionLetter: ");
		result.append(shortOptionLetter);
		result.append(", longOptionName: ");
		result.append(longOptionName);
		result.append(", defaultValueLiteral: ");
		result.append(defaultValueLiteral);
		result.append(')');
		return result.toString();
	}

} //PortImpl
