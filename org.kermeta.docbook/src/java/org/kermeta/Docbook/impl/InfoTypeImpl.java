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

import org.kermeta.Docbook.AbstractType;
import org.kermeta.Docbook.AuthorType;
import org.kermeta.Docbook.ConfgroupType;
import org.kermeta.Docbook.CopyrightType;
import org.kermeta.Docbook.DocbookPackage;
import org.kermeta.Docbook.InfoType;
import org.kermeta.Docbook.KeywordsetType;
import org.kermeta.Docbook.LegalNoticeType;
import org.kermeta.Docbook.PublisherType;
import org.kermeta.Docbook.RevhistoryType;
import org.kermeta.Docbook.SubtitleType;
import org.kermeta.Docbook.TitleType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Info Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getPubdate <em>Pubdate</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getAuthor <em>Author</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getSubtitle <em>Subtitle</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getGroup <em>Group</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getBibliomisc <em>Bibliomisc</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getDate <em>Date</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getKeywordset <em>Keywordset</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getAbstract <em>Abstract</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getPublisher <em>Publisher</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getConfgroup <em>Confgroup</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getRevhistory <em>Revhistory</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getCopyright <em>Copyright</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getLegalnotice <em>Legalnotice</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getProductname <em>Productname</em>}</li>
 *   <li>{@link org.kermeta.Docbook.impl.InfoTypeImpl#getReleaseinfo <em>Releaseinfo</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InfoTypeImpl extends EObjectImpl implements InfoType {
	/**
	 * The default value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected static final String PUBDATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPubdate() <em>Pubdate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPubdate()
	 * @generated
	 * @ordered
	 */
	protected String pubdate = PUBDATE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAuthor() <em>Author</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthor()
	 * @generated
	 * @ordered
	 */
	protected EList<AuthorType> author;

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
	 * The cached value of the '{@link #getSubtitle() <em>Subtitle</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubtitle()
	 * @generated
	 * @ordered
	 */
	protected SubtitleType subtitle;

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
	 * The cached value of the '{@link #getAbstract() <em>Abstract</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbstract()
	 * @generated
	 * @ordered
	 */
	protected AbstractType abstract_;

	/**
	 * The cached value of the '{@link #getPublisher() <em>Publisher</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPublisher()
	 * @generated
	 * @ordered
	 */
	protected PublisherType publisher;

	/**
	 * The cached value of the '{@link #getConfgroup() <em>Confgroup</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConfgroup()
	 * @generated
	 * @ordered
	 */
	protected ConfgroupType confgroup;

	/**
	 * The cached value of the '{@link #getRevhistory() <em>Revhistory</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRevhistory()
	 * @generated
	 * @ordered
	 */
	protected RevhistoryType revhistory;

	/**
	 * The cached value of the '{@link #getCopyright() <em>Copyright</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCopyright()
	 * @generated
	 * @ordered
	 */
	protected CopyrightType copyright;

	/**
	 * The cached value of the '{@link #getLegalnotice() <em>Legalnotice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLegalnotice()
	 * @generated
	 * @ordered
	 */
	protected LegalNoticeType legalnotice;

	/**
	 * The default value of the '{@link #getProductname() <em>Productname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductname()
	 * @generated
	 * @ordered
	 */
	protected static final String PRODUCTNAME_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getProductname() <em>Productname</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductname()
	 * @generated
	 * @ordered
	 */
	protected String productname = PRODUCTNAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getReleaseinfo() <em>Releaseinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseinfo()
	 * @generated
	 * @ordered
	 */
	protected static final String RELEASEINFO_EDEFAULT = "";

	/**
	 * The cached value of the '{@link #getReleaseinfo() <em>Releaseinfo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReleaseinfo()
	 * @generated
	 * @ordered
	 */
	protected String releaseinfo = RELEASEINFO_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InfoTypeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return DocbookPackage.Literals.INFO_TYPE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPubdate() {
		return pubdate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPubdate(String newPubdate) {
		String oldPubdate = pubdate;
		pubdate = newPubdate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__PUBDATE, oldPubdate, pubdate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AuthorType> getAuthor() {
		if (author == null) {
			author = new EObjectContainmentEList<AuthorType>(AuthorType.class, this, DocbookPackage.INFO_TYPE__AUTHOR);
		}
		return author;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__TITLE, oldTitle, newTitle);
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
				msgs = ((InternalEObject)title).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__TITLE, null, msgs);
			if (newTitle != null)
				msgs = ((InternalEObject)newTitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__TITLE, null, msgs);
			msgs = basicSetTitle(newTitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__TITLE, newTitle, newTitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubtitleType getSubtitle() {
		return subtitle;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSubtitle(SubtitleType newSubtitle, NotificationChain msgs) {
		SubtitleType oldSubtitle = subtitle;
		subtitle = newSubtitle;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__SUBTITLE, oldSubtitle, newSubtitle);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubtitle(SubtitleType newSubtitle) {
		if (newSubtitle != subtitle) {
			NotificationChain msgs = null;
			if (subtitle != null)
				msgs = ((InternalEObject)subtitle).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__SUBTITLE, null, msgs);
			if (newSubtitle != null)
				msgs = ((InternalEObject)newSubtitle).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__SUBTITLE, null, msgs);
			msgs = basicSetSubtitle(newSubtitle, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__SUBTITLE, newSubtitle, newSubtitle));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FeatureMap getGroup() {
		if (group == null) {
			group = new BasicFeatureMap(this, DocbookPackage.INFO_TYPE__GROUP);
		}
		return group;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getBibliomisc() {
		return getGroup().list(DocbookPackage.Literals.INFO_TYPE__BIBLIOMISC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getDate() {
		return getGroup().list(DocbookPackage.Literals.INFO_TYPE__DATE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<KeywordsetType> getKeywordset() {
		return getGroup().list(DocbookPackage.Literals.INFO_TYPE__KEYWORDSET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AbstractType getAbstract() {
		return abstract_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAbstract(AbstractType newAbstract, NotificationChain msgs) {
		AbstractType oldAbstract = abstract_;
		abstract_ = newAbstract;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__ABSTRACT, oldAbstract, newAbstract);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAbstract(AbstractType newAbstract) {
		if (newAbstract != abstract_) {
			NotificationChain msgs = null;
			if (abstract_ != null)
				msgs = ((InternalEObject)abstract_).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__ABSTRACT, null, msgs);
			if (newAbstract != null)
				msgs = ((InternalEObject)newAbstract).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__ABSTRACT, null, msgs);
			msgs = basicSetAbstract(newAbstract, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__ABSTRACT, newAbstract, newAbstract));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PublisherType getPublisher() {
		return publisher;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPublisher(PublisherType newPublisher, NotificationChain msgs) {
		PublisherType oldPublisher = publisher;
		publisher = newPublisher;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__PUBLISHER, oldPublisher, newPublisher);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublisher(PublisherType newPublisher) {
		if (newPublisher != publisher) {
			NotificationChain msgs = null;
			if (publisher != null)
				msgs = ((InternalEObject)publisher).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__PUBLISHER, null, msgs);
			if (newPublisher != null)
				msgs = ((InternalEObject)newPublisher).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__PUBLISHER, null, msgs);
			msgs = basicSetPublisher(newPublisher, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__PUBLISHER, newPublisher, newPublisher));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConfgroupType getConfgroup() {
		return confgroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConfgroup(ConfgroupType newConfgroup, NotificationChain msgs) {
		ConfgroupType oldConfgroup = confgroup;
		confgroup = newConfgroup;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__CONFGROUP, oldConfgroup, newConfgroup);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConfgroup(ConfgroupType newConfgroup) {
		if (newConfgroup != confgroup) {
			NotificationChain msgs = null;
			if (confgroup != null)
				msgs = ((InternalEObject)confgroup).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__CONFGROUP, null, msgs);
			if (newConfgroup != null)
				msgs = ((InternalEObject)newConfgroup).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__CONFGROUP, null, msgs);
			msgs = basicSetConfgroup(newConfgroup, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__CONFGROUP, newConfgroup, newConfgroup));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RevhistoryType getRevhistory() {
		return revhistory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRevhistory(RevhistoryType newRevhistory, NotificationChain msgs) {
		RevhistoryType oldRevhistory = revhistory;
		revhistory = newRevhistory;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__REVHISTORY, oldRevhistory, newRevhistory);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRevhistory(RevhistoryType newRevhistory) {
		if (newRevhistory != revhistory) {
			NotificationChain msgs = null;
			if (revhistory != null)
				msgs = ((InternalEObject)revhistory).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__REVHISTORY, null, msgs);
			if (newRevhistory != null)
				msgs = ((InternalEObject)newRevhistory).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__REVHISTORY, null, msgs);
			msgs = basicSetRevhistory(newRevhistory, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__REVHISTORY, newRevhistory, newRevhistory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopyrightType getCopyright() {
		return copyright;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCopyright(CopyrightType newCopyright, NotificationChain msgs) {
		CopyrightType oldCopyright = copyright;
		copyright = newCopyright;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__COPYRIGHT, oldCopyright, newCopyright);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCopyright(CopyrightType newCopyright) {
		if (newCopyright != copyright) {
			NotificationChain msgs = null;
			if (copyright != null)
				msgs = ((InternalEObject)copyright).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__COPYRIGHT, null, msgs);
			if (newCopyright != null)
				msgs = ((InternalEObject)newCopyright).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__COPYRIGHT, null, msgs);
			msgs = basicSetCopyright(newCopyright, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__COPYRIGHT, newCopyright, newCopyright));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LegalNoticeType getLegalnotice() {
		return legalnotice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetLegalnotice(LegalNoticeType newLegalnotice, NotificationChain msgs) {
		LegalNoticeType oldLegalnotice = legalnotice;
		legalnotice = newLegalnotice;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__LEGALNOTICE, oldLegalnotice, newLegalnotice);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLegalnotice(LegalNoticeType newLegalnotice) {
		if (newLegalnotice != legalnotice) {
			NotificationChain msgs = null;
			if (legalnotice != null)
				msgs = ((InternalEObject)legalnotice).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__LEGALNOTICE, null, msgs);
			if (newLegalnotice != null)
				msgs = ((InternalEObject)newLegalnotice).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DocbookPackage.INFO_TYPE__LEGALNOTICE, null, msgs);
			msgs = basicSetLegalnotice(newLegalnotice, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__LEGALNOTICE, newLegalnotice, newLegalnotice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getProductname() {
		return productname;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProductname(String newProductname) {
		String oldProductname = productname;
		productname = newProductname;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__PRODUCTNAME, oldProductname, productname));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getReleaseinfo() {
		return releaseinfo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReleaseinfo(String newReleaseinfo) {
		String oldReleaseinfo = releaseinfo;
		releaseinfo = newReleaseinfo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, DocbookPackage.INFO_TYPE__RELEASEINFO, oldReleaseinfo, releaseinfo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case DocbookPackage.INFO_TYPE__AUTHOR:
				return ((InternalEList<?>)getAuthor()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__TITLE:
				return basicSetTitle(null, msgs);
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				return basicSetSubtitle(null, msgs);
			case DocbookPackage.INFO_TYPE__GROUP:
				return ((InternalEList<?>)getGroup()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				return ((InternalEList<?>)getKeywordset()).basicRemove(otherEnd, msgs);
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				return basicSetAbstract(null, msgs);
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				return basicSetPublisher(null, msgs);
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				return basicSetConfgroup(null, msgs);
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				return basicSetRevhistory(null, msgs);
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				return basicSetCopyright(null, msgs);
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				return basicSetLegalnotice(null, msgs);
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
			case DocbookPackage.INFO_TYPE__PUBDATE:
				return getPubdate();
			case DocbookPackage.INFO_TYPE__AUTHOR:
				return getAuthor();
			case DocbookPackage.INFO_TYPE__TITLE:
				return getTitle();
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				return getSubtitle();
			case DocbookPackage.INFO_TYPE__GROUP:
				if (coreType) return getGroup();
				return ((FeatureMap.Internal)getGroup()).getWrapper();
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				return getBibliomisc();
			case DocbookPackage.INFO_TYPE__DATE:
				return getDate();
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				return getKeywordset();
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				return getAbstract();
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				return getPublisher();
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				return getConfgroup();
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				return getRevhistory();
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				return getCopyright();
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				return getLegalnotice();
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				return getProductname();
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				return getReleaseinfo();
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
			case DocbookPackage.INFO_TYPE__PUBDATE:
				setPubdate((String)newValue);
				return;
			case DocbookPackage.INFO_TYPE__AUTHOR:
				getAuthor().clear();
				getAuthor().addAll((Collection<? extends AuthorType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__TITLE:
				setTitle((TitleType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__GROUP:
				((FeatureMap.Internal)getGroup()).set(newValue);
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				getBibliomisc().addAll((Collection<? extends String>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__DATE:
				getDate().clear();
				getDate().addAll((Collection<? extends String>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				getKeywordset().clear();
				getKeywordset().addAll((Collection<? extends KeywordsetType>)newValue);
				return;
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				setAbstract((AbstractType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				setPublisher((PublisherType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				setConfgroup((ConfgroupType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				setRevhistory((RevhistoryType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				setCopyright((CopyrightType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				setLegalnotice((LegalNoticeType)newValue);
				return;
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				setProductname((String)newValue);
				return;
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				setReleaseinfo((String)newValue);
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
			case DocbookPackage.INFO_TYPE__PUBDATE:
				setPubdate(PUBDATE_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__AUTHOR:
				getAuthor().clear();
				return;
			case DocbookPackage.INFO_TYPE__TITLE:
				setTitle((TitleType)null);
				return;
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				setSubtitle((SubtitleType)null);
				return;
			case DocbookPackage.INFO_TYPE__GROUP:
				getGroup().clear();
				return;
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				getBibliomisc().clear();
				return;
			case DocbookPackage.INFO_TYPE__DATE:
				getDate().clear();
				return;
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				getKeywordset().clear();
				return;
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				setAbstract((AbstractType)null);
				return;
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				setPublisher((PublisherType)null);
				return;
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				setConfgroup((ConfgroupType)null);
				return;
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				setRevhistory((RevhistoryType)null);
				return;
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				setCopyright((CopyrightType)null);
				return;
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				setLegalnotice((LegalNoticeType)null);
				return;
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				setProductname(PRODUCTNAME_EDEFAULT);
				return;
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				setReleaseinfo(RELEASEINFO_EDEFAULT);
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
			case DocbookPackage.INFO_TYPE__PUBDATE:
				return PUBDATE_EDEFAULT == null ? pubdate != null : !PUBDATE_EDEFAULT.equals(pubdate);
			case DocbookPackage.INFO_TYPE__AUTHOR:
				return author != null && !author.isEmpty();
			case DocbookPackage.INFO_TYPE__TITLE:
				return title != null;
			case DocbookPackage.INFO_TYPE__SUBTITLE:
				return subtitle != null;
			case DocbookPackage.INFO_TYPE__GROUP:
				return group != null && !group.isEmpty();
			case DocbookPackage.INFO_TYPE__BIBLIOMISC:
				return !getBibliomisc().isEmpty();
			case DocbookPackage.INFO_TYPE__DATE:
				return !getDate().isEmpty();
			case DocbookPackage.INFO_TYPE__KEYWORDSET:
				return !getKeywordset().isEmpty();
			case DocbookPackage.INFO_TYPE__ABSTRACT:
				return abstract_ != null;
			case DocbookPackage.INFO_TYPE__PUBLISHER:
				return publisher != null;
			case DocbookPackage.INFO_TYPE__CONFGROUP:
				return confgroup != null;
			case DocbookPackage.INFO_TYPE__REVHISTORY:
				return revhistory != null;
			case DocbookPackage.INFO_TYPE__COPYRIGHT:
				return copyright != null;
			case DocbookPackage.INFO_TYPE__LEGALNOTICE:
				return legalnotice != null;
			case DocbookPackage.INFO_TYPE__PRODUCTNAME:
				return PRODUCTNAME_EDEFAULT == null ? productname != null : !PRODUCTNAME_EDEFAULT.equals(productname);
			case DocbookPackage.INFO_TYPE__RELEASEINFO:
				return RELEASEINFO_EDEFAULT == null ? releaseinfo != null : !RELEASEINFO_EDEFAULT.equals(releaseinfo);
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
		result.append(" (pubdate: ");
		result.append(pubdate);
		result.append(", group: ");
		result.append(group);
		result.append(", productname: ");
		result.append(productname);
		result.append(", releaseinfo: ");
		result.append(releaseinfo);
		result.append(')');
		return result.toString();
	}

} //InfoTypeImpl
