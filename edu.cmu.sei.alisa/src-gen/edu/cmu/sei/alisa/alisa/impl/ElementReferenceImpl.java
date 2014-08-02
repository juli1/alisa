/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ElementReference;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl#getUrl <em>Url</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementReferenceImpl extends MinimalEObjectImpl.Container implements ElementReference
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected static final String URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getUrl() <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUrl()
   * @generated
   * @ordered
   */
  protected String url = URL_EDEFAULT;

  /**
   * The default value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReferenceType() <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferenceType()
   * @generated
   * @ordered
   */
  protected String referenceType = REFERENCE_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected static final String DETAILS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected String details = DETAILS_EDEFAULT;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected EList<String> version;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementReferenceImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlisaPackage.Literals.ELEMENT_REFERENCE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_REFERENCE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getUrl()
  {
    return url;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUrl(String newUrl)
  {
    String oldUrl = url;
    url = newUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_REFERENCE__URL, oldUrl, url));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReferenceType()
  {
    return referenceType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReferenceType(String newReferenceType)
  {
    String oldReferenceType = referenceType;
    referenceType = newReferenceType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_REFERENCE__REFERENCE_TYPE, oldReferenceType, referenceType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDetails()
  {
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetails(String newDetails)
  {
    String oldDetails = details;
    details = newDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_REFERENCE__DETAILS, oldDetails, details));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVersion()
  {
    if (version == null)
    {
      version = new EDataTypeEList<String>(String.class, this, AlisaPackage.ELEMENT_REFERENCE__VERSION);
    }
    return version;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlisaPackage.ELEMENT_REFERENCE__NAME:
        return getName();
      case AlisaPackage.ELEMENT_REFERENCE__URL:
        return getUrl();
      case AlisaPackage.ELEMENT_REFERENCE__REFERENCE_TYPE:
        return getReferenceType();
      case AlisaPackage.ELEMENT_REFERENCE__DETAILS:
        return getDetails();
      case AlisaPackage.ELEMENT_REFERENCE__VERSION:
        return getVersion();
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
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlisaPackage.ELEMENT_REFERENCE__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__URL:
        setUrl((String)newValue);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__REFERENCE_TYPE:
        setReferenceType((String)newValue);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__DETAILS:
        setDetails((String)newValue);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__VERSION:
        getVersion().clear();
        getVersion().addAll((Collection<? extends String>)newValue);
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
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlisaPackage.ELEMENT_REFERENCE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__URL:
        setUrl(URL_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__REFERENCE_TYPE:
        setReferenceType(REFERENCE_TYPE_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__DETAILS:
        setDetails(DETAILS_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_REFERENCE__VERSION:
        getVersion().clear();
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
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlisaPackage.ELEMENT_REFERENCE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.ELEMENT_REFERENCE__URL:
        return URL_EDEFAULT == null ? url != null : !URL_EDEFAULT.equals(url);
      case AlisaPackage.ELEMENT_REFERENCE__REFERENCE_TYPE:
        return REFERENCE_TYPE_EDEFAULT == null ? referenceType != null : !REFERENCE_TYPE_EDEFAULT.equals(referenceType);
      case AlisaPackage.ELEMENT_REFERENCE__DETAILS:
        return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
      case AlisaPackage.ELEMENT_REFERENCE__VERSION:
        return version != null && !version.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (name: ");
    result.append(name);
    result.append(", url: ");
    result.append(url);
    result.append(", referenceType: ");
    result.append(referenceType);
    result.append(", details: ");
    result.append(details);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ElementReferenceImpl
