/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package com.sysfera.codegen.api.apimodel.impl;

import com.sysfera.codegen.api.apimodel.ApimodelPackage;
import com.sysfera.codegen.api.apimodel.Type;
import com.sysfera.codegen.api.apimodel.TypeList;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.TypeListImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.sysfera.codegen.api.apimodel.impl.TypeListImpl#getETypes <em>ETypes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeListImpl extends EObjectImpl implements TypeList {
	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<Type> types;

	/**
	 * The cached value of the '{@link #getETypes() <em>ETypes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getETypes()
	 * @generated
	 * @ordered
	 */
	protected EList<EClassifier> eTypes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TypeListImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ApimodelPackage.Literals.TYPE_LIST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Type> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<Type>(Type.class, this, ApimodelPackage.TYPE_LIST__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EClassifier> getETypes() {
		if (eTypes == null) {
			eTypes = new EObjectContainmentEList<EClassifier>(EClassifier.class, this, ApimodelPackage.TYPE_LIST__ETYPES);
		}
		return eTypes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case ApimodelPackage.TYPE_LIST__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case ApimodelPackage.TYPE_LIST__ETYPES:
				return ((InternalEList<?>)getETypes()).basicRemove(otherEnd, msgs);
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
			case ApimodelPackage.TYPE_LIST__TYPES:
				return getTypes();
			case ApimodelPackage.TYPE_LIST__ETYPES:
				return getETypes();
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
			case ApimodelPackage.TYPE_LIST__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends Type>)newValue);
				return;
			case ApimodelPackage.TYPE_LIST__ETYPES:
				getETypes().clear();
				getETypes().addAll((Collection<? extends EClassifier>)newValue);
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
			case ApimodelPackage.TYPE_LIST__TYPES:
				getTypes().clear();
				return;
			case ApimodelPackage.TYPE_LIST__ETYPES:
				getETypes().clear();
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
			case ApimodelPackage.TYPE_LIST__TYPES:
				return types != null && !types.isEmpty();
			case ApimodelPackage.TYPE_LIST__ETYPES:
				return eTypes != null && !eTypes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TypeListImpl
