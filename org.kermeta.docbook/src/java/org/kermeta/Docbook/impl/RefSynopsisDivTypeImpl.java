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

import org.kermeta.Docbook.CmdsynopsisType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.FuncsynopsisType;
import org.kermeta.Docbook.RefSynopsisDivType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Ref Synopsis Div Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.RefSynopsisDivTypeImpl#getCmdsynopsis <em>Cmdsynopsis</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.RefSynopsisDivTypeImpl#getFuncsynopsis <em>Funcsynopsis</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RefSynopsisDivTypeImpl extends EObjectImpl implements RefSynopsisDivType {
	/**
	 * The cached value of the '{@link #getCmdsynopsis() <em>Cmdsynopsis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmdsynopsis()
	 * @generated
	 * @ordered
	 */
	protected EList<CmdsynopsisType> cmdsynopsis;

	/**
	 * The cached value of the '{@link #getFuncsynopsis() <em>Funcsynopsis</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFuncsynopsis()
	 * @generated
	 * @ordered
	 */
	protected EList<FuncsynopsisType> funcsynopsis;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RefSynopsisDivTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.REF_SYNOPSIS_DIV_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CmdsynopsisType> getCmdsynopsis() {
		if (cmdsynopsis == null) {
			cmdsynopsis = new EObjectContainmentEList<CmdsynopsisType>(CmdsynopsisType.class, this, DocbookPackage.REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS);
		}
		return cmdsynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FuncsynopsisType> getFuncsynopsis() {
		if (funcsynopsis == null) {
			funcsynopsis = new EObjectContainmentEList<FuncsynopsisType>(FuncsynopsisType.class, this, DocbookPackage.REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS);
		}
		return funcsynopsis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS:
				return ((InternalEList<?>)getCmdsynopsis()).basicRemove(otherEnd, msgs);
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS:
				return ((InternalEList<?>)getFuncsynopsis()).basicRemove(otherEnd, msgs);
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
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS:
				return getCmdsynopsis();
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS:
				return getFuncsynopsis();
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
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				getCmdsynopsis().addAll((Collection<? extends CmdsynopsisType>)newValue);
				return;
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
				getFuncsynopsis().addAll((Collection<? extends FuncsynopsisType>)newValue);
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
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS:
				getCmdsynopsis().clear();
				return;
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS:
				getFuncsynopsis().clear();
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
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__CMDSYNOPSIS:
				return cmdsynopsis != null && !cmdsynopsis.isEmpty();
			case DocbookPackage.REF_SYNOPSIS_DIV_TYPE__FUNCSYNOPSIS:
				return funcsynopsis != null && !funcsynopsis.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //RefSynopsisDivTypeImpl
