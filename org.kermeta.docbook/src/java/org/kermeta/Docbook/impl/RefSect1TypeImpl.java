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

import org.eclipse.emf.ecore.util.BasicFeatureMap;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.InternalEList;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.ParaType;
import org.kermeta.Docbook.RefSect1Type;
import org.kermeta.Docbook.SegmentedListType;
import org.kermeta.Docbook.TitleType;
import org.kermeta.Docbook.VariableListType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Sect1 Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.RefSect1TypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefSect1TypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefSect1TypeImpl#getPara <em>Para</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefSect1TypeImpl#getVariablelist <em>Variablelist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefSect1TypeImpl#getSegmentedlist <em>Segmentedlist</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefSect1TypeImpl#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefSect1TypeImpl extends EObjectImpl implements RefSect1Type {
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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefSect1TypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.REF_SECT1_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.REF_SECT1_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return (TitleType)getGroup().get(DocbookPackage.Literals.REF_SECT1_TYPE__TITLE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		return ((FeatureMap.Internal)getGroup()).basicAdd(DocbookPackage.Literals.REF_SECT1_TYPE__TITLE, newTitle, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		((FeatureMap.Internal)getGroup()).set(DocbookPackage.Literals.REF_SECT1_TYPE__TITLE, newTitle);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ParaType> getPara() {
		return getGroup().list(DocbookPackage.Literals.REF_SECT1_TYPE__PARA);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<VariableListType> getVariablelist() {
		return getGroup().list(DocbookPackage.Literals.REF_SECT1_TYPE__VARIABLELIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<SegmentedListType> getSegmentedlist() {
		return getGroup().list(DocbookPackage.Literals.REF_SECT1_TYPE__SEGMENTEDLIST);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.REF_SECT1_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.REF_SECT1_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.REF_SECT1_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.REF_SECT1_TYPE__PARA:
				return ((InternalEList<?>)getPara()).basicRemove(otherEnd, msgs);
			case DocbookPackage.REF_SECT1_TYPE__VARIABLELIST:
				return ((InternalEList<?>)getVariablelist()).basicRemove(otherEnd, msgs);
			case DocbookPackage.REF_SECT1_TYPE__SEGMENTEDLIST:
				return ((InternalEList<?>)getSegmentedlist()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.REF_SECT1_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.REF_SECT1_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.REF_SECT1_TYPE__PARA:
				return getPara();
			case DocbookPackage.REF_SECT1_TYPE__VARIABLELIST:
				return getVariablelist();
			case DocbookPackage.REF_SECT1_TYPE__SEGMENTEDLIST:
				return getSegmentedlist();
			case DocbookPackage.REF_SECT1_TYPE__ID:
				return getId();
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
			case DocbookPackage.REF_SECT1_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.REF_SECT1_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.REF_SECT1_TYPE__PARA:
				getPara().clear();
				getPara().addAll((Collection<? extends ParaType>)newValue);
				return;
			case DocbookPackage.REF_SECT1_TYPE__VARIABLELIST:
				getVariablelist().clear();
				getVariablelist().addAll((Collection<? extends VariableListType>)newValue);
				return;
			case DocbookPackage.REF_SECT1_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				getSegmentedlist().addAll((Collection<? extends SegmentedListType>)newValue);
				return;
			case DocbookPackage.REF_SECT1_TYPE__ID:
				setId((String)newValue);
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
			case DocbookPackage.REF_SECT1_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.REF_SECT1_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.REF_SECT1_TYPE__PARA:
				getPara().clear();
				return;
			case DocbookPackage.REF_SECT1_TYPE__VARIABLELIST:
				getVariablelist().clear();
				return;
			case DocbookPackage.REF_SECT1_TYPE__SEGMENTEDLIST:
				getSegmentedlist().clear();
				return;
			case DocbookPackage.REF_SECT1_TYPE__ID:
				setId(ID_EDEFAULT);
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
			case DocbookPackage.REF_SECT1_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.REF_SECT1_TYPE__TITLE:
				return getTitle() != null;
			case DocbookPackage.REF_SECT1_TYPE__PARA:
				return !getPara().isEmpty();
			case DocbookPackage.REF_SECT1_TYPE__VARIABLELIST:
				return !getVariablelist().isEmpty();
			case DocbookPackage.REF_SECT1_TYPE__SEGMENTEDLIST:
				return !getSegmentedlist().isEmpty();
			case DocbookPackage.REF_SECT1_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //RefSect1TypeImpl
