/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.ContractualElementProxy;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Contractual Element Proxy</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ContractualElementProxyImpl#getProxyreference <em>Proxyreference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ContractualElementProxyImpl extends MinimalEObjectImpl.Container implements ContractualElementProxy
{
  /**
   * The cached value of the '{@link #getProxyreference() <em>Proxyreference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxyreference()
   * @generated
   * @ordered
   */
  protected ContractualElement proxyreference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ContractualElementProxyImpl()
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
    return AlisaPackage.Literals.CONTRACTUAL_ELEMENT_PROXY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractualElement getProxyreference()
  {
    if (proxyreference != null && proxyreference.eIsProxy())
    {
      InternalEObject oldProxyreference = (InternalEObject)proxyreference;
      proxyreference = (ContractualElement)eResolveProxy(oldProxyreference);
      if (proxyreference != oldProxyreference)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.CONTRACTUAL_ELEMENT_PROXY__PROXYREFERENCE, oldProxyreference, proxyreference));
      }
    }
    return proxyreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ContractualElement basicGetProxyreference()
  {
    return proxyreference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setProxyreference(ContractualElement newProxyreference)
  {
    ContractualElement oldProxyreference = proxyreference;
    proxyreference = newProxyreference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.CONTRACTUAL_ELEMENT_PROXY__PROXYREFERENCE, oldProxyreference, proxyreference));
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
      case AlisaPackage.CONTRACTUAL_ELEMENT_PROXY__PROXYREFERENCE:
        if (resolve) return getProxyreference();
        return basicGetProxyreference();
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
      case AlisaPackage.CONTRACTUAL_ELEMENT_PROXY__PROXYREFERENCE:
        setProxyreference((ContractualElement)newValue);
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
      case AlisaPackage.CONTRACTUAL_ELEMENT_PROXY__PROXYREFERENCE:
        setProxyreference((ContractualElement)null);
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
      case AlisaPackage.CONTRACTUAL_ELEMENT_PROXY__PROXYREFERENCE:
        return proxyreference != null;
    }
    return super.eIsSet(featureID);
  }

} //ContractualElementProxyImpl
