/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.AssuranceArgument;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationAssumption;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Assumption</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationAssumptionImpl extends ContractualElementImpl implements VerificationAssumption
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected VerificationActivity target;

  /**
   * The cached value of the '{@link #getAssert() <em>Assert</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected Requirement assert_;

  /**
   * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerifiedBy()
   * @generated
   * @ordered
   */
  protected EList<VerificationActivity> verifiedBy;

  /**
   * The cached value of the '{@link #getArgument() <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getArgument()
   * @generated
   * @ordered
   */
  protected AssuranceArgument argument;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerificationAssumptionImpl()
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
    return AlisaPackage.Literals.VERIFICATION_ASSUMPTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationActivity getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (VerificationActivity)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.VERIFICATION_ASSUMPTION__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationActivity basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(VerificationActivity newTarget)
  {
    VerificationActivity oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ASSUMPTION__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement getAssert()
  {
    if (assert_ != null && assert_.eIsProxy())
    {
      InternalEObject oldAssert = (InternalEObject)assert_;
      assert_ = (Requirement)eResolveProxy(oldAssert);
      if (assert_ != oldAssert)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.VERIFICATION_ASSUMPTION__ASSERT, oldAssert, assert_));
      }
    }
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement basicGetAssert()
  {
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssert(Requirement newAssert)
  {
    Requirement oldAssert = assert_;
    assert_ = newAssert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ASSUMPTION__ASSERT, oldAssert, assert_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VerificationActivity> getVerifiedBy()
  {
    if (verifiedBy == null)
    {
      verifiedBy = new EObjectContainmentEList<VerificationActivity>(VerificationActivity.class, this, AlisaPackage.VERIFICATION_ASSUMPTION__VERIFIED_BY);
    }
    return verifiedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AssuranceArgument getArgument()
  {
    return argument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetArgument(AssuranceArgument newArgument, NotificationChain msgs)
  {
    AssuranceArgument oldArgument = argument;
    argument = newArgument;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT, oldArgument, newArgument);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setArgument(AssuranceArgument newArgument)
  {
    if (newArgument != argument)
    {
      NotificationChain msgs = null;
      if (argument != null)
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT, newArgument, newArgument));
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
      case AlisaPackage.VERIFICATION_ASSUMPTION__VERIFIED_BY:
        return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
      case AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT:
        return basicSetArgument(null, msgs);
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
      case AlisaPackage.VERIFICATION_ASSUMPTION__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case AlisaPackage.VERIFICATION_ASSUMPTION__ASSERT:
        if (resolve) return getAssert();
        return basicGetAssert();
      case AlisaPackage.VERIFICATION_ASSUMPTION__VERIFIED_BY:
        return getVerifiedBy();
      case AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT:
        return getArgument();
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
      case AlisaPackage.VERIFICATION_ASSUMPTION__TARGET:
        setTarget((VerificationActivity)newValue);
        return;
      case AlisaPackage.VERIFICATION_ASSUMPTION__ASSERT:
        setAssert((Requirement)newValue);
        return;
      case AlisaPackage.VERIFICATION_ASSUMPTION__VERIFIED_BY:
        getVerifiedBy().clear();
        getVerifiedBy().addAll((Collection<? extends VerificationActivity>)newValue);
        return;
      case AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT:
        setArgument((AssuranceArgument)newValue);
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
      case AlisaPackage.VERIFICATION_ASSUMPTION__TARGET:
        setTarget((VerificationActivity)null);
        return;
      case AlisaPackage.VERIFICATION_ASSUMPTION__ASSERT:
        setAssert((Requirement)null);
        return;
      case AlisaPackage.VERIFICATION_ASSUMPTION__VERIFIED_BY:
        getVerifiedBy().clear();
        return;
      case AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT:
        setArgument((AssuranceArgument)null);
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
      case AlisaPackage.VERIFICATION_ASSUMPTION__TARGET:
        return target != null;
      case AlisaPackage.VERIFICATION_ASSUMPTION__ASSERT:
        return assert_ != null;
      case AlisaPackage.VERIFICATION_ASSUMPTION__VERIFIED_BY:
        return verifiedBy != null && !verifiedBy.isEmpty();
      case AlisaPackage.VERIFICATION_ASSUMPTION__ARGUMENT:
        return argument != null;
    }
    return super.eIsSet(featureID);
  }

} //VerificationAssumptionImpl
