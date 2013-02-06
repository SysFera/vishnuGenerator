/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.FuncprototypeType;
import org.kermeta.Docbook.FuncsynopsisType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Funcsynopsis Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.FuncsynopsisTypeImpl#getFuncprototype <em>Funcprototype</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FuncsynopsisTypeImpl extends EObjectImpl implements FuncsynopsisType {
	/**
	 * The cached value of the '{@link #getFuncprototype() <em>Funcprototype</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncprototype()
	 * @generated
	 * @ordered
	 */
	protected EList<FuncprototypeType> funcprototype;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FuncsynopsisTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.FUNCSYNOPSIS_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuncprototypeType> getFuncprototype() {
		if (funcprototype == null) {
			funcprototype = new EObjectContainmentEList<FuncprototypeType>(FuncprototypeType.class, this, DocbookPackage.FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE);
		}
		return funcprototype;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE:
				return ((InternalEList<?>)getFuncprototype()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE:
				return getFuncprototype();
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
			case DocbookPackage.FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE:
				getFuncprototype().clear();
				getFuncprototype().addAll((Collection<? extends FuncprototypeType>)newValue);
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
			case DocbookPackage.FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE:
				getFuncprototype().clear();
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
			case DocbookPackage.FUNCSYNOPSIS_TYPE__FUNCPROTOTYPE:
				return funcprototype != null && !funcprototype.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //FuncsynopsisTypeImpl
