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
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl#getXternalReference <em>Xternal Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDocumentImpl extends MinimalEObjectImpl.Container implements ExternalDocument
{
  /**
   * The default value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected static final String FQN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected String fqn = FQN_EDEFAULT;

  /**
   * The default value of the '{@link #getXternalReference() <em>Xternal Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXternalReference()
   * @generated
   * @ordered
   */
  protected static final String XTERNAL_REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getXternalReference() <em>Xternal Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getXternalReference()
   * @generated
   * @ordered
   */
  protected String xternalReference = XTERNAL_REFERENCE_EDEFAULT;

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
  public String getFqn()
  {
    return fqn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFqn(String newFqn)
  {
    String oldFqn = fqn;
    fqn = newFqn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.EXTERNAL_DOCUMENT__FQN, oldFqn, fqn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getXternalReference()
  {
    return xternalReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setXternalReference(String newXternalReference)
  {
    String oldXternalReference = xternalReference;
    xternalReference = newXternalReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.EXTERNAL_DOCUMENT__XTERNAL_REFERENCE, oldXternalReference, xternalReference));
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
      case AlisaPackage.EXTERNAL_DOCUMENT__FQN:
        return getFqn();
      case AlisaPackage.EXTERNAL_DOCUMENT__XTERNAL_REFERENCE:
        return getXternalReference();
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
      case AlisaPackage.EXTERNAL_DOCUMENT__FQN:
        setFqn((String)newValue);
        return;
      case AlisaPackage.EXTERNAL_DOCUMENT__XTERNAL_REFERENCE:
        setXternalReference((String)newValue);
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
      case AlisaPackage.EXTERNAL_DOCUMENT__FQN:
        setFqn(FQN_EDEFAULT);
        return;
      case AlisaPackage.EXTERNAL_DOCUMENT__XTERNAL_REFERENCE:
        setXternalReference(XTERNAL_REFERENCE_EDEFAULT);
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
      case AlisaPackage.EXTERNAL_DOCUMENT__FQN:
        return FQN_EDEFAULT == null ? fqn != null : !FQN_EDEFAULT.equals(fqn);
      case AlisaPackage.EXTERNAL_DOCUMENT__XTERNAL_REFERENCE:
        return XTERNAL_REFERENCE_EDEFAULT == null ? xternalReference != null : !XTERNAL_REFERENCE_EDEFAULT.equals(xternalReference);
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
    result.append(" (fqn: ");
    result.append(fqn);
    result.append(", xternalReference: ");
    result.append(xternalReference);
    result.append(')');
    return result.toString();
  }

} //ExternalDocumentImpl
