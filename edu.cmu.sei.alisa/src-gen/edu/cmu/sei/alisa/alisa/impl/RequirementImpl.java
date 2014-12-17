/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.AssuranceArgument;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.RSALVariable;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.VerificationActivity;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getReqValue <em>Req Value</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getGoalReference <em>Goal Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getHazardReference <em>Hazard Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getSubrequirement <em>Subrequirement</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getSystemRequirementReference <em>System Requirement Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getArgument <em>Argument</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getDocReference <em>Doc Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getModelReference <em>Model Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends ContractualElementImpl implements Requirement
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected NamedElement target;

  /**
   * The default value of the '{@link #getAssert() <em>Assert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected static final String ASSERT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getAssert() <em>Assert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssert()
   * @generated
   * @ordered
   */
  protected String assert_ = ASSERT_EDEFAULT;

  /**
   * The cached value of the '{@link #getReqValue() <em>Req Value</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqValue()
   * @generated
   * @ordered
   */
  protected EList<RSALVariable> reqValue;

  /**
   * The cached value of the '{@link #getGoalReference() <em>Goal Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalReference()
   * @generated
   * @ordered
   */
  protected EList<Goal> goalReference;

  /**
   * The cached value of the '{@link #getHazardReference() <em>Hazard Reference</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHazardReference()
   * @generated
   * @ordered
   */
  protected EList<String> hazardReference;

  /**
   * The cached value of the '{@link #getRefinesReference() <em>Refines Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinesReference()
   * @generated
   * @ordered
   */
  protected EList<Requirement> refinesReference;

  /**
   * The cached value of the '{@link #getSubrequirement() <em>Subrequirement</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSubrequirement()
   * @generated
   * @ordered
   */
  protected EList<Requirement> subrequirement;

  /**
   * The cached value of the '{@link #getDecomposesReference() <em>Decomposes Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposesReference()
   * @generated
   * @ordered
   */
  protected EList<Requirement> decomposesReference;

  /**
   * The cached value of the '{@link #getEvolvesReference() <em>Evolves Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvolvesReference()
   * @generated
   * @ordered
   */
  protected EList<Requirement> evolvesReference;

  /**
   * The cached value of the '{@link #getStakeholderRequirementReference() <em>Stakeholder Requirement Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholderRequirementReference()
   * @generated
   * @ordered
   */
  protected EList<Goal> stakeholderRequirementReference;

  /**
   * The cached value of the '{@link #getSystemRequirementReference() <em>System Requirement Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemRequirementReference()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> systemRequirementReference;

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
   * The cached value of the '{@link #getDocReference() <em>Doc Reference</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReference()
   * @generated
   * @ordered
   */
  protected EList<ExternalDocument> docReference;

  /**
   * The cached value of the '{@link #getModelReference() <em>Model Reference</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelReference()
   * @generated
   * @ordered
   */
  protected EList<String> modelReference;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementImpl()
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
    return AlisaPackage.Literals.REQUIREMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getTarget()
  {
    if (target != null && ((EObject)target).eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (NamedElement)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.REQUIREMENT__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(NamedElement newTarget)
  {
    NamedElement oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getAssert()
  {
    return assert_;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAssert(String newAssert)
  {
    String oldAssert = assert_;
    assert_ = newAssert;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__ASSERT, oldAssert, assert_));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RSALVariable> getReqValue()
  {
    if (reqValue == null)
    {
      reqValue = new EObjectContainmentEList<RSALVariable>(RSALVariable.class, this, AlisaPackage.REQUIREMENT__REQ_VALUE);
    }
    return reqValue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getGoalReference()
  {
    if (goalReference == null)
    {
      goalReference = new EObjectResolvingEList<Goal>(Goal.class, this, AlisaPackage.REQUIREMENT__GOAL_REFERENCE);
    }
    return goalReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getHazardReference()
  {
    if (hazardReference == null)
    {
      hazardReference = new EDataTypeEList<String>(String.class, this, AlisaPackage.REQUIREMENT__HAZARD_REFERENCE);
    }
    return hazardReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getRefinesReference()
  {
    if (refinesReference == null)
    {
      refinesReference = new EObjectResolvingEList<Requirement>(Requirement.class, this, AlisaPackage.REQUIREMENT__REFINES_REFERENCE);
    }
    return refinesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getSubrequirement()
  {
    if (subrequirement == null)
    {
      subrequirement = new EObjectContainmentEList<Requirement>(Requirement.class, this, AlisaPackage.REQUIREMENT__SUBREQUIREMENT);
    }
    return subrequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getDecomposesReference()
  {
    if (decomposesReference == null)
    {
      decomposesReference = new EObjectResolvingEList<Requirement>(Requirement.class, this, AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE);
    }
    return decomposesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getEvolvesReference()
  {
    if (evolvesReference == null)
    {
      evolvesReference = new EObjectResolvingEList<Requirement>(Requirement.class, this, AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE);
    }
    return evolvesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getStakeholderRequirementReference()
  {
    if (stakeholderRequirementReference == null)
    {
      stakeholderRequirementReference = new EObjectResolvingEList<Goal>(Goal.class, this, AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE);
    }
    return stakeholderRequirementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getSystemRequirementReference()
  {
    if (systemRequirementReference == null)
    {
      systemRequirementReference = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE);
    }
    return systemRequirementReference;
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
      verifiedBy = new EObjectContainmentEList<VerificationActivity>(VerificationActivity.class, this, AlisaPackage.REQUIREMENT__VERIFIED_BY);
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
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__ARGUMENT, oldArgument, newArgument);
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
        msgs = ((InternalEObject)argument).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.REQUIREMENT__ARGUMENT, null, msgs);
      if (newArgument != null)
        msgs = ((InternalEObject)newArgument).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.REQUIREMENT__ARGUMENT, null, msgs);
      msgs = basicSetArgument(newArgument, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__ARGUMENT, newArgument, newArgument));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalDocument> getDocReference()
  {
    if (docReference == null)
    {
      docReference = new EObjectContainmentEList<ExternalDocument>(ExternalDocument.class, this, AlisaPackage.REQUIREMENT__DOC_REFERENCE);
    }
    return docReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getModelReference()
  {
    if (modelReference == null)
    {
      modelReference = new EDataTypeEList<String>(String.class, this, AlisaPackage.REQUIREMENT__MODEL_REFERENCE);
    }
    return modelReference;
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
      case AlisaPackage.REQUIREMENT__REQ_VALUE:
        return ((InternalEList<?>)getReqValue()).basicRemove(otherEnd, msgs);
      case AlisaPackage.REQUIREMENT__SUBREQUIREMENT:
        return ((InternalEList<?>)getSubrequirement()).basicRemove(otherEnd, msgs);
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
      case AlisaPackage.REQUIREMENT__ARGUMENT:
        return basicSetArgument(null, msgs);
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        return ((InternalEList<?>)getDocReference()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.REQUIREMENT__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case AlisaPackage.REQUIREMENT__ASSERT:
        return getAssert();
      case AlisaPackage.REQUIREMENT__REQ_VALUE:
        return getReqValue();
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        return getGoalReference();
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        return getHazardReference();
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        return getRefinesReference();
      case AlisaPackage.REQUIREMENT__SUBREQUIREMENT:
        return getSubrequirement();
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        return getDecomposesReference();
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        return getEvolvesReference();
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return getStakeholderRequirementReference();
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        return getSystemRequirementReference();
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return getVerifiedBy();
      case AlisaPackage.REQUIREMENT__ARGUMENT:
        return getArgument();
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        return getDocReference();
      case AlisaPackage.REQUIREMENT__MODEL_REFERENCE:
        return getModelReference();
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
      case AlisaPackage.REQUIREMENT__TARGET:
        setTarget((NamedElement)newValue);
        return;
      case AlisaPackage.REQUIREMENT__ASSERT:
        setAssert((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__REQ_VALUE:
        getReqValue().clear();
        getReqValue().addAll((Collection<? extends RSALVariable>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        getGoalReference().clear();
        getGoalReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        getHazardReference().clear();
        getHazardReference().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        getRefinesReference().clear();
        getRefinesReference().addAll((Collection<? extends Requirement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__SUBREQUIREMENT:
        getSubrequirement().clear();
        getSubrequirement().addAll((Collection<? extends Requirement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        getDecomposesReference().addAll((Collection<? extends Requirement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        getEvolvesReference().addAll((Collection<? extends Requirement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        getStakeholderRequirementReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        getSystemRequirementReference().clear();
        getSystemRequirementReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        getVerifiedBy().clear();
        getVerifiedBy().addAll((Collection<? extends VerificationActivity>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__ARGUMENT:
        setArgument((AssuranceArgument)newValue);
        return;
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        getDocReference().clear();
        getDocReference().addAll((Collection<? extends ExternalDocument>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__MODEL_REFERENCE:
        getModelReference().clear();
        getModelReference().addAll((Collection<? extends String>)newValue);
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
      case AlisaPackage.REQUIREMENT__TARGET:
        setTarget((NamedElement)null);
        return;
      case AlisaPackage.REQUIREMENT__ASSERT:
        setAssert(ASSERT_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__REQ_VALUE:
        getReqValue().clear();
        return;
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        getGoalReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        getHazardReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        getRefinesReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__SUBREQUIREMENT:
        getSubrequirement().clear();
        return;
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        getSystemRequirementReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        getVerifiedBy().clear();
        return;
      case AlisaPackage.REQUIREMENT__ARGUMENT:
        setArgument((AssuranceArgument)null);
        return;
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        getDocReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__MODEL_REFERENCE:
        getModelReference().clear();
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
      case AlisaPackage.REQUIREMENT__TARGET:
        return target != null;
      case AlisaPackage.REQUIREMENT__ASSERT:
        return ASSERT_EDEFAULT == null ? assert_ != null : !ASSERT_EDEFAULT.equals(assert_);
      case AlisaPackage.REQUIREMENT__REQ_VALUE:
        return reqValue != null && !reqValue.isEmpty();
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        return goalReference != null && !goalReference.isEmpty();
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        return hazardReference != null && !hazardReference.isEmpty();
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        return refinesReference != null && !refinesReference.isEmpty();
      case AlisaPackage.REQUIREMENT__SUBREQUIREMENT:
        return subrequirement != null && !subrequirement.isEmpty();
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        return decomposesReference != null && !decomposesReference.isEmpty();
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        return evolvesReference != null && !evolvesReference.isEmpty();
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return stakeholderRequirementReference != null && !stakeholderRequirementReference.isEmpty();
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        return systemRequirementReference != null && !systemRequirementReference.isEmpty();
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return verifiedBy != null && !verifiedBy.isEmpty();
      case AlisaPackage.REQUIREMENT__ARGUMENT:
        return argument != null;
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        return docReference != null && !docReference.isEmpty();
      case AlisaPackage.REQUIREMENT__MODEL_REFERENCE:
        return modelReference != null && !modelReference.isEmpty();
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
    result.append(" (assert: ");
    result.append(assert_);
    result.append(", hazardReference: ");
    result.append(hazardReference);
    result.append(", modelReference: ");
    result.append(modelReference);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl
