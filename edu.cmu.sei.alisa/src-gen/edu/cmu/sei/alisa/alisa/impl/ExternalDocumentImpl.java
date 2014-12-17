/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ExternalDocument;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Document</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl#getDocReference <em>Doc Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl#getDocFragment <em>Doc Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDocumentImpl extends MinimalEObjectImpl.Container implements ExternalDocument
{
  /**
   * The default value of the '{@link #getDocReference() <em>Doc Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReference()
   * @generated
   * @ordered
   */
  protected static final String DOC_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDocReference() <em>Doc Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReference()
   * @generated
   * @ordered
   */
  protected String docReference = DOC_REFERENCE_EDEFAULT;

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
  protected ExternalDocumentImpl()
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
    return AlisaPackage.Literals.EXTERNAL_DOCUMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDocReference()
  {
    return docReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDocReference(String newDocReference)
  {
    String oldDocReference = docReference;
    docReference = newDocReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.EXTERNAL_DOCUMENT__DOC_REFERENCE, oldDocReference, docReference));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.EXTERNAL_DOCUMENT__DOC_FRAGMENT, oldDocFragment, docFragment));
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
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_REFERENCE:
        return getDocReference();
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_FRAGMENT:
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
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_REFERENCE:
        setDocReference((String)newValue);
        return;
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_FRAGMENT:
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
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_REFERENCE:
        setDocReference(DOC_REFERENCE_EDEFAULT);
        return;
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_FRAGMENT:
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
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_REFERENCE:
        return DOC_REFERENCE_EDEFAULT == null ? docReference != null : !DOC_REFERENCE_EDEFAULT.equals(docReference);
      case AlisaPackage.EXTERNAL_DOCUMENT__DOC_FRAGMENT:
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
    result.append(" (docReference: ");
    result.append(docReference);
    result.append(", docFragment: ");
    result.append(docFragment);
    result.append(')');
    return result.toString();
  }

} //ExternalDocumentImpl
