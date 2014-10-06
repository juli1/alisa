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
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.XDocUriImpl#getDocPath <em>Doc Path</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.XDocUriImpl#getDocFragment <em>Doc Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class XDocUriImpl extends MinimalEObjectImpl.Container implements XDocUri
{
  /**
   * The cached value of the '{@link #getDocPath() <em>Doc Path</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocPath()
   * @generated
   * @ordered
   */
  protected ExternalDocument docPath;

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
  public ExternalDocument getDocPath()
  {
    if (docPath != null && docPath.eIsProxy())
    {
      InternalEObject oldDocPath = (InternalEObject)docPath;
      docPath = (ExternalDocument)eResolveProxy(oldDocPath);
      if (docPath != oldDocPath)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.XDOC_URI__DOC_PATH, oldDocPath, docPath));
      }
    }
    return docPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDocument basicGetDocPath()
  {
    return docPath;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocPath(ExternalDocument newDocPath)
  {
    ExternalDocument oldDocPath = docPath;
    docPath = newDocPath;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.XDOC_URI__DOC_PATH, oldDocPath, docPath));
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
      case AlisaPackage.XDOC_URI__DOC_PATH:
        if (resolve) return getDocPath();
        return basicGetDocPath();
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
      case AlisaPackage.XDOC_URI__DOC_PATH:
        setDocPath((ExternalDocument)newValue);
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
      case AlisaPackage.XDOC_URI__DOC_PATH:
        setDocPath((ExternalDocument)null);
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
      case AlisaPackage.XDOC_URI__DOC_PATH:
        return docPath != null;
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
