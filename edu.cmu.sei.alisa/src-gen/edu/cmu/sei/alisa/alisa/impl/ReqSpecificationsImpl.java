/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ReqSpec;
import edu.cmu.sei.alisa.alisa.ReqSpecifications;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Specifications</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecificationsImpl#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecificationsImpl#getReqTarget <em>Req Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecificationsImpl#getReqs <em>Reqs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqSpecificationsImpl extends MinimalEObjectImpl.Container implements ReqSpecifications
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
   * The cached value of the '{@link #getReqTarget() <em>Req Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqTarget()
   * @generated
   * @ordered
   */
  protected NamedElement reqTarget;

  /**
   * The cached value of the '{@link #getReqs() <em>Reqs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqs()
   * @generated
   * @ordered
   */
  protected EList<ReqSpec> reqs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ReqSpecificationsImpl()
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
    return AlisaPackage.Literals.REQ_SPECIFICATIONS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPECIFICATIONS__FQN, oldFqn, fqn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getReqTarget()
  {
    if (reqTarget != null && ((EObject)reqTarget).eIsProxy())
    {
      InternalEObject oldReqTarget = (InternalEObject)reqTarget;
      reqTarget = (NamedElement)eResolveProxy(oldReqTarget);
      if (reqTarget != oldReqTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.REQ_SPECIFICATIONS__REQ_TARGET, oldReqTarget, reqTarget));
      }
    }
    return reqTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetReqTarget()
  {
    return reqTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReqTarget(NamedElement newReqTarget)
  {
    NamedElement oldReqTarget = reqTarget;
    reqTarget = newReqTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPECIFICATIONS__REQ_TARGET, oldReqTarget, reqTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReqSpec> getReqs()
  {
    if (reqs == null)
    {
      reqs = new EObjectContainmentEList<ReqSpec>(ReqSpec.class, this, AlisaPackage.REQ_SPECIFICATIONS__REQS);
    }
    return reqs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlisaPackage.REQ_SPECIFICATIONS__REQS:
        return ((InternalEList<?>)getReqs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AlisaPackage.REQ_SPECIFICATIONS__FQN:
        return getFqn();
      case AlisaPackage.REQ_SPECIFICATIONS__REQ_TARGET:
        if (resolve) return getReqTarget();
        return basicGetReqTarget();
      case AlisaPackage.REQ_SPECIFICATIONS__REQS:
        return getReqs();
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
      case AlisaPackage.REQ_SPECIFICATIONS__FQN:
        setFqn((String)newValue);
        return;
      case AlisaPackage.REQ_SPECIFICATIONS__REQ_TARGET:
        setReqTarget((NamedElement)newValue);
        return;
      case AlisaPackage.REQ_SPECIFICATIONS__REQS:
        getReqs().clear();
        getReqs().addAll((Collection<? extends ReqSpec>)newValue);
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
      case AlisaPackage.REQ_SPECIFICATIONS__FQN:
        setFqn(FQN_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPECIFICATIONS__REQ_TARGET:
        setReqTarget((NamedElement)null);
        return;
      case AlisaPackage.REQ_SPECIFICATIONS__REQS:
        getReqs().clear();
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
      case AlisaPackage.REQ_SPECIFICATIONS__FQN:
        return FQN_EDEFAULT == null ? fqn != null : !FQN_EDEFAULT.equals(fqn);
      case AlisaPackage.REQ_SPECIFICATIONS__REQ_TARGET:
        return reqTarget != null;
      case AlisaPackage.REQ_SPECIFICATIONS__REQS:
        return reqs != null && !reqs.isEmpty();
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
    result.append(')');
    return result.toString();
  }

} //ReqSpecificationsImpl
