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
import org.kermeta.Docbook.VarListEntryType;
import org.kermeta.Docbook.VariableListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Variable List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.VariableListTypeImpl#getVarlistentry <em>Varlistentry</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VariableListTypeImpl extends EObjectImpl implements VariableListType {
	/**
	 * The cached value of the '{@link #getVarlistentry() <em>Varlistentry</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarlistentry()
	 * @generated
	 * @ordered
	 */
	protected EList<VarListEntryType> varlistentry;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected VariableListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.VARIABLE_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VarListEntryType> getVarlistentry() {
		if (varlistentry == null) {
			varlistentry = new EObjectContainmentEList<VarListEntryType>(VarListEntryType.class, this, DocbookPackage.VARIABLE_LIST_TYPE__VARLISTENTRY);
		}
		return varlistentry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.VARIABLE_LIST_TYPE__VARLISTENTRY:
				return ((InternalEList<?>)getVarlistentry()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.VARIABLE_LIST_TYPE__VARLISTENTRY:
				return getVarlistentry();
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
			case DocbookPackage.VARIABLE_LIST_TYPE__VARLISTENTRY:
				getVarlistentry().clear();
				getVarlistentry().addAll((Collection<? extends VarListEntryType>)newValue);
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
			case DocbookPackage.VARIABLE_LIST_TYPE__VARLISTENTRY:
				getVarlistentry().clear();
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
			case DocbookPackage.VARIABLE_LIST_TYPE__VARLISTENTRY:
				return varlistentry != null && !varlistentry.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //VariableListTypeImpl
