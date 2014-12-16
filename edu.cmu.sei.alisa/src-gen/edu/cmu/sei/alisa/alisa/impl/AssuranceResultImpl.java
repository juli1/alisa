/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.AssuranceResult;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.VerificationResult;

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
 * An implementation of the model object '<em><b>Assurance Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl#getPassCount <em>Pass Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl#getFailCount <em>Fail Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl#getNeutralCount <em>Neutral Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl#getUnknownCount <em>Unknown Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl#getSubClaimResult <em>Sub Claim Result</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl#getSubVAResult <em>Sub VA Result</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssuranceResultImpl extends RSALResultImpl implements AssuranceResult
{
  /**
   * The cached value of the '{@link #getRequirement() <em>Requirement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRequirement()
   * @generated
   * @ordered
   */
  protected Requirement requirement;

  /**
   * The default value of the '{@link #getPassCount() <em>Pass Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassCount()
   * @generated
   * @ordered
   */
  protected static final int PASS_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getPassCount() <em>Pass Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPassCount()
   * @generated
   * @ordered
   */
  protected int passCount = PASS_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getFailCount() <em>Fail Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailCount()
   * @generated
   * @ordered
   */
  protected static final int FAIL_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getFailCount() <em>Fail Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFailCount()
   * @generated
   * @ordered
   */
  protected int failCount = FAIL_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getNeutralCount() <em>Neutral Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeutralCount()
   * @generated
   * @ordered
   */
  protected static final int NEUTRAL_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getNeutralCount() <em>Neutral Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNeutralCount()
   * @generated
   * @ordered
   */
  protected int neutralCount = NEUTRAL_COUNT_EDEFAULT;

  /**
   * The default value of the '{@link #getUnknownCount() <em>Unknown Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnknownCount()
   * @generated
   * @ordered
   */
  protected static final int UNKNOWN_COUNT_EDEFAULT = 0;

  /**
   * The cached value of the '{@link #getUnknownCount() <em>Unknown Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getUnknownCount()
   * @generated
   * @ordered
   */
  protected int unknownCount = UNKNOWN_COUNT_EDEFAULT;

  /**
   * The cached value of the '{@link #getSubClaimResult() <em>Sub Claim Result</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubClaimResult()
   * @generated
   * @ordered
   */
  protected EList<AssuranceResult> subClaimResult;

  /**
   * The cached value of the '{@link #getSubVAResult() <em>Sub VA Result</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubVAResult()
   * @generated
   * @ordered
   */
  protected EList<VerificationResult> subVAResult;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssuranceResultImpl()
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
    return AlisaPackage.Literals.ASSURANCE_RESULT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement getRequirement()
  {
    if (requirement != null && requirement.eIsProxy())
    {
      InternalEObject oldRequirement = (InternalEObject)requirement;
      requirement = (Requirement)eResolveProxy(oldRequirement);
      if (requirement != oldRequirement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.ASSURANCE_RESULT__REQUIREMENT, oldRequirement, requirement));
      }
    }
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement basicGetRequirement()
  {
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRequirement(Requirement newRequirement)
  {
    Requirement oldRequirement = requirement;
    requirement = newRequirement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ASSURANCE_RESULT__REQUIREMENT, oldRequirement, requirement));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getPassCount()
  {
    return passCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPassCount(int newPassCount)
  {
    int oldPassCount = passCount;
    passCount = newPassCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ASSURANCE_RESULT__PASS_COUNT, oldPassCount, passCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getFailCount()
  {
    return failCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFailCount(int newFailCount)
  {
    int oldFailCount = failCount;
    failCount = newFailCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ASSURANCE_RESULT__FAIL_COUNT, oldFailCount, failCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getNeutralCount()
  {
    return neutralCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNeutralCount(int newNeutralCount)
  {
    int oldNeutralCount = neutralCount;
    neutralCount = newNeutralCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ASSURANCE_RESULT__NEUTRAL_COUNT, oldNeutralCount, neutralCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public int getUnknownCount()
  {
    return unknownCount;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setUnknownCount(int newUnknownCount)
  {
    int oldUnknownCount = unknownCount;
    unknownCount = newUnknownCount;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ASSURANCE_RESULT__UNKNOWN_COUNT, oldUnknownCount, unknownCount));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssuranceResult> getSubClaimResult()
  {
    if (subClaimResult == null)
    {
      subClaimResult = new EObjectContainmentEList<AssuranceResult>(AssuranceResult.class, this, AlisaPackage.ASSURANCE_RESULT__SUB_CLAIM_RESULT);
    }
    return subClaimResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VerificationResult> getSubVAResult()
  {
    if (subVAResult == null)
    {
      subVAResult = new EObjectContainmentEList<VerificationResult>(VerificationResult.class, this, AlisaPackage.ASSURANCE_RESULT__SUB_VA_RESULT);
    }
    return subVAResult;
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
      case AlisaPackage.ASSURANCE_RESULT__SUB_CLAIM_RESULT:
        return ((InternalEList<?>)getSubClaimResult()).basicRemove(otherEnd, msgs);
      case AlisaPackage.ASSURANCE_RESULT__SUB_VA_RESULT:
        return ((InternalEList<?>)getSubVAResult()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.ASSURANCE_RESULT__REQUIREMENT:
        if (resolve) return getRequirement();
        return basicGetRequirement();
      case AlisaPackage.ASSURANCE_RESULT__PASS_COUNT:
        return getPassCount();
      case AlisaPackage.ASSURANCE_RESULT__FAIL_COUNT:
        return getFailCount();
      case AlisaPackage.ASSURANCE_RESULT__NEUTRAL_COUNT:
        return getNeutralCount();
      case AlisaPackage.ASSURANCE_RESULT__UNKNOWN_COUNT:
        return getUnknownCount();
      case AlisaPackage.ASSURANCE_RESULT__SUB_CLAIM_RESULT:
        return getSubClaimResult();
      case AlisaPackage.ASSURANCE_RESULT__SUB_VA_RESULT:
        return getSubVAResult();
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
      case AlisaPackage.ASSURANCE_RESULT__REQUIREMENT:
        setRequirement((Requirement)newValue);
        return;
      case AlisaPackage.ASSURANCE_RESULT__PASS_COUNT:
        setPassCount((Integer)newValue);
        return;
      case AlisaPackage.ASSURANCE_RESULT__FAIL_COUNT:
        setFailCount((Integer)newValue);
        return;
      case AlisaPackage.ASSURANCE_RESULT__NEUTRAL_COUNT:
        setNeutralCount((Integer)newValue);
        return;
      case AlisaPackage.ASSURANCE_RESULT__UNKNOWN_COUNT:
        setUnknownCount((Integer)newValue);
        return;
      case AlisaPackage.ASSURANCE_RESULT__SUB_CLAIM_RESULT:
        getSubClaimResult().clear();
        getSubClaimResult().addAll((Collection<? extends AssuranceResult>)newValue);
        return;
      case AlisaPackage.ASSURANCE_RESULT__SUB_VA_RESULT:
        getSubVAResult().clear();
        getSubVAResult().addAll((Collection<? extends VerificationResult>)newValue);
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
      case AlisaPackage.ASSURANCE_RESULT__REQUIREMENT:
        setRequirement((Requirement)null);
        return;
      case AlisaPackage.ASSURANCE_RESULT__PASS_COUNT:
        setPassCount(PASS_COUNT_EDEFAULT);
        return;
      case AlisaPackage.ASSURANCE_RESULT__FAIL_COUNT:
        setFailCount(FAIL_COUNT_EDEFAULT);
        return;
      case AlisaPackage.ASSURANCE_RESULT__NEUTRAL_COUNT:
        setNeutralCount(NEUTRAL_COUNT_EDEFAULT);
        return;
      case AlisaPackage.ASSURANCE_RESULT__UNKNOWN_COUNT:
        setUnknownCount(UNKNOWN_COUNT_EDEFAULT);
        return;
      case AlisaPackage.ASSURANCE_RESULT__SUB_CLAIM_RESULT:
        getSubClaimResult().clear();
        return;
      case AlisaPackage.ASSURANCE_RESULT__SUB_VA_RESULT:
        getSubVAResult().clear();
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
      case AlisaPackage.ASSURANCE_RESULT__REQUIREMENT:
        return requirement != null;
      case AlisaPackage.ASSURANCE_RESULT__PASS_COUNT:
        return passCount != PASS_COUNT_EDEFAULT;
      case AlisaPackage.ASSURANCE_RESULT__FAIL_COUNT:
        return failCount != FAIL_COUNT_EDEFAULT;
      case AlisaPackage.ASSURANCE_RESULT__NEUTRAL_COUNT:
        return neutralCount != NEUTRAL_COUNT_EDEFAULT;
      case AlisaPackage.ASSURANCE_RESULT__UNKNOWN_COUNT:
        return unknownCount != UNKNOWN_COUNT_EDEFAULT;
      case AlisaPackage.ASSURANCE_RESULT__SUB_CLAIM_RESULT:
        return subClaimResult != null && !subClaimResult.isEmpty();
      case AlisaPackage.ASSURANCE_RESULT__SUB_VA_RESULT:
        return subVAResult != null && !subVAResult.isEmpty();
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
    result.append(" (passCount: ");
    result.append(passCount);
    result.append(", failCount: ");
    result.append(failCount);
    result.append(", neutralCount: ");
    result.append(neutralCount);
    result.append(", unknownCount: ");
    result.append(unknownCount);
    result.append(')');
    return result.toString();
  }

} //AssuranceResultImpl
