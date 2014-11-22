/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.XDocUri;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>XDoc Uri</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.XDocUriImpl#getDocReference <em>Doc Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.XDocUriImpl#getDocFragment <em>Doc Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XDocUriImpl extends MinimalEObjectImpl.Container implements XDocUri
{
  /**
   * The cached value of the '{@link #getDocReference() <em>Doc Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReference()
   * @generated
   * @ordered
   */
  protected ExternalDocument docReference;

  /**
   * The default value of the '{@link #getDocFragment() <em>Doc Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocFragment()
   * @generated
   * @ordered
   */
  protected static final String DOC_FRAGMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocFragment() <em>Doc Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocFragment()
   * @generated
   * @ordered
   */
  protected String docFragment = DOC_FRAGMENT_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected XDocUriImpl()
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
    return AlisaPackage.Literals.XDOC_URI;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDocument getDocReference()
  {
    if (docReference != null && docReference.eIsProxy())
    {
      InternalEObject oldDocReference = (InternalEObject)docReference;
      docReference = (ExternalDocument)eResolveProxy(oldDocReference);
      if (docReference != oldDocReference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.XDOC_URI__DOC_REFERENCE, oldDocReference, docReference));
      }
    }
    return docReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDocument basicGetDocReference()
  {
    return docReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocReference(ExternalDocument newDocReference)
  {
    ExternalDocument oldDocReference = docReference;
    docReference = newDocReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.XDOC_URI__DOC_REFERENCE, oldDocReference, docReference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocFragment()
  {
    return docFragment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocFragment(String newDocFragment)
  {
    String oldDocFragment = docFragment;
    docFragment = newDocFragment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.XDOC_URI__DOC_FRAGMENT, oldDocFragment, docFragment));
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
      case AlisaPackage.XDOC_URI__DOC_REFERENCE:
        if (resolve) return getDocReference();
        return basicGetDocReference();
      case AlisaPackage.XDOC_URI__DOC_FRAGMENT:
        return getDocFragment();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlisaPackage.XDOC_URI__DOC_REFERENCE:
        setDocReference((ExternalDocument)newValue);
        return;
      case AlisaPackage.XDOC_URI__DOC_FRAGMENT:
        setDocFragment((String)newValue);
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
      case AlisaPackage.XDOC_URI__DOC_REFERENCE:
        setDocReference((ExternalDocument)null);
        return;
      case AlisaPackage.XDOC_URI__DOC_FRAGMENT:
        setDocFragment(DOC_FRAGMENT_EDEFAULT);
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
      case AlisaPackage.XDOC_URI__DOC_REFERENCE:
        return docReference != null;
      case AlisaPackage.XDOC_URI__DOC_FRAGMENT:
        return DOC_FRAGMENT_EDEFAULT == null ? docFragment != null : !DOC_FRAGMENT_EDEFAULT.equals(docFragment);
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
    result.append(" (docFragment: ");
    result.append(docFragment);
    result.append(')');
    return result.toString();
  }

} //XDocUriImpl
