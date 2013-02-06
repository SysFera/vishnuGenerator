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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.FuncdefType;
import org.kermeta.Docbook.FuncprototypeType;
import org.kermeta.Docbook.ParamdefType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcprototype Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.FuncprototypeTypeImpl#getFuncdef <em>Funcdef</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.FuncprototypeTypeImpl#getParamdef <em>Paramdef</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuncprototypeTypeImpl extends EObjectImpl implements FuncprototypeType {
	/**
	 * The cached value of the '{@link #getFuncdef() <em>Funcdef</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncdef()
	 * @generated
	 * @ordered
	 */
	protected FuncdefType funcdef;

	/**
	 * The cached value of the '{@link #getParamdef() <em>Paramdef</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamdef()
	 * @generated
	 * @ordered
	 */
	protected EList<ParamdefType> paramdef;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuncprototypeTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.FUNCPROTOTYPE_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FuncdefType getFuncdef() {
		return funcdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFuncdef(FuncdefType newFuncdef, NotificationChain msgs) {
		FuncdefType oldFuncdef = funcdef;
		funcdef = newFuncdef;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF, oldFuncdef, newFuncdef);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFuncdef(FuncdefType newFuncdef) {
		if (newFuncdef != funcdef) {
			NotificationChain msgs = null;
			if (funcdef != null)
				msgs = ((InternalEObject)funcdef).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF, null, msgs);
			if (newFuncdef != null)
				msgs = ((InternalEObject)newFuncdef).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF, null, msgs);
			msgs = basicSetFuncdef(newFuncdef, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF, newFuncdef, newFuncdef));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParamdefType> getParamdef() {
		if (paramdef == null) {
			paramdef = new EObjectContainmentEList<ParamdefType>(ParamdefType.class, this, DocbookPackage.FUNCPROTOTYPE_TYPE__PARAMDEF);
		}
		return paramdef;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF:
				return basicSetFuncdef(null, msgs);
			case DocbookPackage.FUNCPROTOTYPE_TYPE__PARAMDEF:
				return ((InternalEList<?>)getParamdef()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF:
				return getFuncdef();
			case DocbookPackage.FUNCPROTOTYPE_TYPE__PARAMDEF:
				return getParamdef();
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
			case DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF:
				setFuncdef((FuncdefType)newValue);
				return;
			case DocbookPackage.FUNCPROTOTYPE_TYPE__PARAMDEF:
				getParamdef().clear();
				getParamdef().addAll((Collection<? extends ParamdefType>)newValue);
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
			case DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF:
				setFuncdef((FuncdefType)null);
				return;
			case DocbookPackage.FUNCPROTOTYPE_TYPE__PARAMDEF:
				getParamdef().clear();
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
			case DocbookPackage.FUNCPROTOTYPE_TYPE__FUNCDEF:
				return funcdef != null;
			case DocbookPackage.FUNCPROTOTYPE_TYPE__PARAMDEF:
				return paramdef != null && !paramdef.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuncprototypeTypeImpl
