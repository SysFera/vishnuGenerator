/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.kermeta.Docbook.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.ExampleType;
import org.kermeta.Docbook.ProgramlistingType;
import org.kermeta.Docbook.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Example Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.ExampleTypeImpl#getId <em>Id</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ExampleTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.ExampleTypeImpl#getProgramlisting <em>Programlisting</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExampleTypeImpl extends EObjectImpl implements ExampleType {
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
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected TitleType title;

	/**
	 * The cached value of the '{@link #getProgramlisting() <em>Programlisting</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProgramlisting()
	 * @generated
	 * @ordered
	 */
	protected ProgramlistingType programlisting;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ExampleTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.EXAMPLE_TYPE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.EXAMPLE_TYPE__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TitleType getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTitle(TitleType newTitle, NotificationChain msgs) {
		TitleType oldTitle = title;
		title = newTitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.EXAMPLE_TYPE__TITLE, oldTitle, newTitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(TitleType newTitle) {
		if (newTitle != title) {
			NotificationChain msgs = null;
			if (title != null)
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.EXAMPLE_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.EXAMPLE_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.EXAMPLE_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgramlistingType getProgramlisting() {
		return programlisting;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProgramlisting(ProgramlistingType newProgramlisting, NotificationChain msgs) {
		ProgramlistingType oldProgramlisting = programlisting;
		programlisting = newProgramlisting;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING, oldProgramlisting, newProgramlisting);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProgramlisting(ProgramlistingType newProgramlisting) {
		if (newProgramlisting != programlisting) {
			NotificationChain msgs = null;
			if (programlisting != null)
				msgs = ((InternalEObject)programlisting).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING, null, msgs);
			if (newProgramlisting != null)
				msgs = ((InternalEObject)newProgramlisting).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING, null, msgs);
			msgs = basicSetProgramlisting(newProgramlisting, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING, newProgramlisting, newProgramlisting));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.EXAMPLE_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING:
				return basicSetProgramlisting(null, msgs);
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
			case DocbookPackage.EXAMPLE_TYPE__ID:
				return getId();
			case DocbookPackage.EXAMPLE_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING:
				return getProgramlisting();
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
			case DocbookPackage.EXAMPLE_TYPE__ID:
				setId((String)newValue);
				return;
			case DocbookPackage.EXAMPLE_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING:
				setProgramlisting((ProgramlistingType)newValue);
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
			case DocbookPackage.EXAMPLE_TYPE__ID:
				setId(ID_EDEFAULT);
				return;
			case DocbookPackage.EXAMPLE_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING:
				setProgramlisting((ProgramlistingType)null);
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
			case DocbookPackage.EXAMPLE_TYPE__ID:
				return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
			case DocbookPackage.EXAMPLE_TYPE__TITLE:
				return title != null;
			case DocbookPackage.EXAMPLE_TYPE__PROGRAMLISTING:
				return programlisting != null;
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
		result.append(" (id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //ExampleTypeImpl
