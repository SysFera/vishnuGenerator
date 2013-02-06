/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import java.math.BigInteger;

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

import org.kermeta.Docbook.ColspecType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.TbodyType;
import org.kermeta.Docbook.TgroupType;
import org.kermeta.Docbook.TheadType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tgroup Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.TgroupTypeImpl#getColspec <em>Colspec</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TgroupTypeImpl#getThead <em>Thead</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TgroupTypeImpl#getTbody <em>Tbody</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TgroupTypeImpl#getCols <em>Cols</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TgroupTypeImpl#getColseq <em>Colseq</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TgroupTypeImpl#getRowseq <em>Rowseq</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.TgroupTypeImpl#getAlign <em>Align</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TgroupTypeImpl extends EObjectImpl implements TgroupType {
	/**
	 * The cached value of the '{@link #getColspec() <em>Colspec</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColspec()
	 * @generated
	 * @ordered
	 */
	protected EList<ColspecType> colspec;

	/**
	 * The cached value of the '{@link #getThead() <em>Thead</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getThead()
	 * @generated
	 * @ordered
	 */
	protected TheadType thead;

	/**
	 * The cached value of the '{@link #getTbody() <em>Tbody</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTbody()
	 * @generated
	 * @ordered
	 */
	protected TbodyType tbody;

	/**
	 * The default value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCols() <em>Cols</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCols()
	 * @generated
	 * @ordered
	 */
	protected BigInteger cols = COLS_EDEFAULT;

	/**
	 * The default value of the '{@link #getColseq() <em>Colseq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColseq()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger COLSEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getColseq() <em>Colseq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getColseq()
	 * @generated
	 * @ordered
	 */
	protected BigInteger colseq = COLSEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getRowseq() <em>Rowseq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowseq()
	 * @generated
	 * @ordered
	 */
	protected static final BigInteger ROWSEQ_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRowseq() <em>Rowseq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRowseq()
	 * @generated
	 * @ordered
	 */
	protected BigInteger rowseq = ROWSEQ_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected static final String ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAlign() <em>Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlign()
	 * @generated
	 * @ordered
	 */
	protected String align = ALIGN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TgroupTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.TGROUP_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ColspecType> getColspec() {
		if (colspec == null) {
			colspec = new EObjectContainmentEList<ColspecType>(ColspecType.class, this, DocbookPackage.TGROUP_TYPE__COLSPEC);
		}
		return colspec;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TheadType getThead() {
		return thead;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetThead(TheadType newThead, NotificationChain msgs) {
		TheadType oldThead = thead;
		thead = newThead;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__THEAD, oldThead, newThead);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setThead(TheadType newThead) {
		if (newThead != thead) {
			NotificationChain msgs = null;
			if (thead != null)
				msgs = ((InternalEObject)thead).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TGROUP_TYPE__THEAD, null, msgs);
			if (newThead != null)
				msgs = ((InternalEObject)newThead).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TGROUP_TYPE__THEAD, null, msgs);
			msgs = basicSetThead(newThead, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__THEAD, newThead, newThead));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TbodyType getTbody() {
		return tbody;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTbody(TbodyType newTbody, NotificationChain msgs) {
		TbodyType oldTbody = tbody;
		tbody = newTbody;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__TBODY, oldTbody, newTbody);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTbody(TbodyType newTbody) {
		if (newTbody != tbody) {
			NotificationChain msgs = null;
			if (tbody != null)
				msgs = ((InternalEObject)tbody).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TGROUP_TYPE__TBODY, null, msgs);
			if (newTbody != null)
				msgs = ((InternalEObject)newTbody).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.TGROUP_TYPE__TBODY, null, msgs);
			msgs = basicSetTbody(newTbody, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__TBODY, newTbody, newTbody));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getCols() {
		return cols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCols(BigInteger newCols) {
		BigInteger oldCols = cols;
		cols = newCols;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__COLS, oldCols, cols));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getColseq() {
		return colseq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setColseq(BigInteger newColseq) {
		BigInteger oldColseq = colseq;
		colseq = newColseq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__COLSEQ, oldColseq, colseq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BigInteger getRowseq() {
		return rowseq;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRowseq(BigInteger newRowseq) {
		BigInteger oldRowseq = rowseq;
		rowseq = newRowseq;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__ROWSEQ, oldRowseq, rowseq));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getAlign() {
		return align;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlign(String newAlign) {
		String oldAlign = align;
		align = newAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.TGROUP_TYPE__ALIGN, oldAlign, align));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.TGROUP_TYPE__COLSPEC:
				return ((InternalEList<?>)getColspec()).basicRemove(otherEnd, msgs);
			case DocbookPackage.TGROUP_TYPE__THEAD:
				return basicSetThead(null, msgs);
			case DocbookPackage.TGROUP_TYPE__TBODY:
				return basicSetTbody(null, msgs);
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
			case DocbookPackage.TGROUP_TYPE__COLSPEC:
				return getColspec();
			case DocbookPackage.TGROUP_TYPE__THEAD:
				return getThead();
			case DocbookPackage.TGROUP_TYPE__TBODY:
				return getTbody();
			case DocbookPackage.TGROUP_TYPE__COLS:
				return getCols();
			case DocbookPackage.TGROUP_TYPE__COLSEQ:
				return getColseq();
			case DocbookPackage.TGROUP_TYPE__ROWSEQ:
				return getRowseq();
			case DocbookPackage.TGROUP_TYPE__ALIGN:
				return getAlign();
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
			case DocbookPackage.TGROUP_TYPE__COLSPEC:
				getColspec().clear();
				getColspec().addAll((Collection<? extends ColspecType>)newValue);
				return;
			case DocbookPackage.TGROUP_TYPE__THEAD:
				setThead((TheadType)newValue);
				return;
			case DocbookPackage.TGROUP_TYPE__TBODY:
				setTbody((TbodyType)newValue);
				return;
			case DocbookPackage.TGROUP_TYPE__COLS:
				setCols((BigInteger)newValue);
				return;
			case DocbookPackage.TGROUP_TYPE__COLSEQ:
				setColseq((BigInteger)newValue);
				return;
			case DocbookPackage.TGROUP_TYPE__ROWSEQ:
				setRowseq((BigInteger)newValue);
				return;
			case DocbookPackage.TGROUP_TYPE__ALIGN:
				setAlign((String)newValue);
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
			case DocbookPackage.TGROUP_TYPE__COLSPEC:
				getColspec().clear();
				return;
			case DocbookPackage.TGROUP_TYPE__THEAD:
				setThead((TheadType)null);
				return;
			case DocbookPackage.TGROUP_TYPE__TBODY:
				setTbody((TbodyType)null);
				return;
			case DocbookPackage.TGROUP_TYPE__COLS:
				setCols(COLS_EDEFAULT);
				return;
			case DocbookPackage.TGROUP_TYPE__COLSEQ:
				setColseq(COLSEQ_EDEFAULT);
				return;
			case DocbookPackage.TGROUP_TYPE__ROWSEQ:
				setRowseq(ROWSEQ_EDEFAULT);
				return;
			case DocbookPackage.TGROUP_TYPE__ALIGN:
				setAlign(ALIGN_EDEFAULT);
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
			case DocbookPackage.TGROUP_TYPE__COLSPEC:
				return colspec != null && !colspec.isEmpty();
			case DocbookPackage.TGROUP_TYPE__THEAD:
				return thead != null;
			case DocbookPackage.TGROUP_TYPE__TBODY:
				return tbody != null;
			case DocbookPackage.TGROUP_TYPE__COLS:
				return COLS_EDEFAULT == null ? cols != null : !COLS_EDEFAULT.equals(cols);
			case DocbookPackage.TGROUP_TYPE__COLSEQ:
				return COLSEQ_EDEFAULT == null ? colseq != null : !COLSEQ_EDEFAULT.equals(colseq);
			case DocbookPackage.TGROUP_TYPE__ROWSEQ:
				return ROWSEQ_EDEFAULT == null ? rowseq != null : !ROWSEQ_EDEFAULT.equals(rowseq);
			case DocbookPackage.TGROUP_TYPE__ALIGN:
				return ALIGN_EDEFAULT == null ? align != null : !ALIGN_EDEFAULT.equals(align);
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
		result.append(" (cols: ");
		result.append(cols);
		result.append(", colseq: ");
		result.append(colseq);
		result.append(", rowseq: ");
		result.append(rowseq);
		result.append(", align: ");
		result.append(align);
		result.append(')');
		return result.toString();
	}

} //TgroupTypeImpl
