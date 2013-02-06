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
import org.kermeta.Docbook.SegListItemType;
import org.kermeta.Docbook.SegType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Seg List Item Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.SegListItemTypeImpl#getSeg <em>Seg</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegListItemTypeImpl extends EObjectImpl implements SegListItemType {
	/**
	 * The cached value of the '{@link #getSeg() <em>Seg</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSeg()
	 * @generated
	 * @ordered
	 */
	protected EList<SegType> seg;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegListItemTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.SEG_LIST_ITEM_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegType> getSeg() {
		if (seg == null) {
			seg = new EObjectContainmentEList<SegType>(SegType.class, this, DocbookPackage.SEG_LIST_ITEM_TYPE__SEG);
		}
		return seg;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.SEG_LIST_ITEM_TYPE__SEG:
				return ((InternalEList<?>)getSeg()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.SEG_LIST_ITEM_TYPE__SEG:
				return getSeg();
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
			case DocbookPackage.SEG_LIST_ITEM_TYPE__SEG:
				getSeg().clear();
				getSeg().addAll((Collection<? extends SegType>)newValue);
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
			case DocbookPackage.SEG_LIST_ITEM_TYPE__SEG:
				getSeg().clear();
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
			case DocbookPackage.SEG_LIST_ITEM_TYPE__SEG:
				return seg != null && !seg.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //SegListItemTypeImpl
