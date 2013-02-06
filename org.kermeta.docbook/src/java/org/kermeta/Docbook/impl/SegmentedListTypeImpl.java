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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.SegListItemType;
import org.kermeta.Docbook.SegmentedListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segmented List Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.SegmentedListTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SegmentedListTypeImpl#getSegtitle <em>Segtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.SegmentedListTypeImpl#getSeglistitem <em>Seglistitem</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentedListTypeImpl extends EObjectImpl implements SegmentedListType {
	/**
	 * The cached value of the '{@link #getGroup() <em>Group</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroup()
	 * @generated
	 * @ordered
	 */
	protected FeatureMap group;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SegmentedListTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.SEGMENTED_LIST_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.SEGMENTED_LIST_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegtitle() {
		return getGroup().list(DocbookPackage.Literals.SEGMENTED_LIST_TYPE__SEGTITLE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegListItemType> getSeglistitem() {
		return getGroup().list(DocbookPackage.Literals.SEGMENTED_LIST_TYPE__SEGLISTITEM);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.SEGMENTED_LIST_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGLISTITEM:
				return ((InternalEList<?>)getSeglistitem()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.SEGMENTED_LIST_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGTITLE:
				return getSegtitle();
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGLISTITEM:
				return getSeglistitem();
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
			case DocbookPackage.SEGMENTED_LIST_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGTITLE:
				getSegtitle().clear();
				getSegtitle().addAll((Collection<? extends String>)newValue);
				return;
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGLISTITEM:
				getSeglistitem().clear();
				getSeglistitem().addAll((Collection<? extends SegListItemType>)newValue);
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
			case DocbookPackage.SEGMENTED_LIST_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGTITLE:
				getSegtitle().clear();
				return;
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGLISTITEM:
				getSeglistitem().clear();
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
			case DocbookPackage.SEGMENTED_LIST_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGTITLE:
				return !getSegtitle().isEmpty();
			case DocbookPackage.SEGMENTED_LIST_TYPE__SEGLISTITEM:
				return !getSeglistitem().isEmpty();
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
		result.append(" (group: ");
		result.append(group);
		result.append(')');
		return result.toString();
	}

} //SegmentedListTypeImpl
