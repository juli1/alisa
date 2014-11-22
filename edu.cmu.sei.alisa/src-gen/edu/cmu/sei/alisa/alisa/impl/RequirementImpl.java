/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;
import edu.cmu.sei.alisa.alisa.XDocUri;

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
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getCategory <em>Category</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getSectionReference <em>Section Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getConflictsReference <em>Conflicts Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getStakeholderReference <em>Stakeholder Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getSystemRequirementReference <em>System Requirement Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getDocReference <em>Doc Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getGoalReference <em>Goal Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getHazardReference <em>Hazard Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends RSALElementImpl implements Requirement
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
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected EList<Category> category;

  /**
   * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected static final String TITLE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTitle()
   * @generated
   * @ordered
   */
  protected String title = TITLE_EDEFAULT;

  /**
   * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected static final String DESCRIPTION_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDescription()
   * @generated
   * @ordered
   */
  protected String description = DESCRIPTION_EDEFAULT;

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
   * The default value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected static final String RATIONALE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getRationale() <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRationale()
   * @generated
   * @ordered
   */
  protected String rationale = RATIONALE_EDEFAULT;

  /**
   * The cached value of the '{@link #getIssue() <em>Issue</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIssue()
   * @generated
   * @ordered
   */
  protected EList<String> issue;

  /**
   * The cached value of the '{@link #getSectionReference() <em>Section Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSectionReference()
   * @generated
   * @ordered
   */
  protected EList<RSALContainer> sectionReference;

  /**
   * The cached value of the '{@link #getRefinesReference() <em>Refines Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinesReference()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> refinesReference;

  /**
   * The cached value of the '{@link #getDecomposesReference() <em>Decomposes Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposesReference()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> decomposesReference;

  /**
   * The cached value of the '{@link #getEvolvesReference() <em>Evolves Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvolvesReference()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> evolvesReference;

  /**
   * The cached value of the '{@link #getConflictsReference() <em>Conflicts Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getConflictsReference()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> conflictsReference;

  /**
   * The cached value of the '{@link #getStakeholderReference() <em>Stakeholder Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholderReference()
   * @generated
   * @ordered
   */
  protected EList<Stakeholder> stakeholderReference;

  /**
   * The cached value of the '{@link #getStakeholderRequirementReference() <em>Stakeholder Requirement Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholderRequirementReference()
   * @generated
   * @ordered
   */
  protected EList<ContractualElement> stakeholderRequirementReference;

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
   * The cached value of the '{@link #getDocReference() <em>Doc Reference</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReference()
   * @generated
   * @ordered
   */
  protected EList<XDocUri> docReference;

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
   * The cached value of the '{@link #getVerifiedBy() <em>Verified By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVerifiedBy()
   * @generated
   * @ordered
   */
  protected EList<VerificationDecomposition> verifiedBy;

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
  public EList<Category> getCategory()
  {
    if (category == null)
    {
      category = new EObjectResolvingEList<Category>(Category.class, this, AlisaPackage.REQUIREMENT__CATEGORY);
    }
    return category;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTitle()
  {
    return title;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTitle(String newTitle)
  {
    String oldTitle = title;
    title = newTitle;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__TITLE, oldTitle, title));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDescription()
  {
    return description;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDescription(String newDescription)
  {
    String oldDescription = description;
    description = newDescription;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__DESCRIPTION, oldDescription, description));
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
  public String getRationale()
  {
    return rationale;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRationale(String newRationale)
  {
    String oldRationale = rationale;
    rationale = newRationale;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__RATIONALE, oldRationale, rationale));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getIssue()
  {
    if (issue == null)
    {
      issue = new EDataTypeEList<String>(String.class, this, AlisaPackage.REQUIREMENT__ISSUE);
    }
    return issue;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RSALContainer> getSectionReference()
  {
    if (sectionReference == null)
    {
      sectionReference = new EObjectResolvingEList<RSALContainer>(RSALContainer.class, this, AlisaPackage.REQUIREMENT__SECTION_REFERENCE);
    }
    return sectionReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getRefinesReference()
  {
    if (refinesReference == null)
    {
      refinesReference = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, AlisaPackage.REQUIREMENT__REFINES_REFERENCE);
    }
    return refinesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getDecomposesReference()
  {
    if (decomposesReference == null)
    {
      decomposesReference = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE);
    }
    return decomposesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getEvolvesReference()
  {
    if (evolvesReference == null)
    {
      evolvesReference = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE);
    }
    return evolvesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getConflictsReference()
  {
    if (conflictsReference == null)
    {
      conflictsReference = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, AlisaPackage.REQUIREMENT__CONFLICTS_REFERENCE);
    }
    return conflictsReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stakeholder> getStakeholderReference()
  {
    if (stakeholderReference == null)
    {
      stakeholderReference = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, AlisaPackage.REQUIREMENT__STAKEHOLDER_REFERENCE);
    }
    return stakeholderReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ContractualElement> getStakeholderRequirementReference()
  {
    if (stakeholderRequirementReference == null)
    {
      stakeholderRequirementReference = new EObjectResolvingEList<ContractualElement>(ContractualElement.class, this, AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE);
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
  public EList<XDocUri> getDocReference()
  {
    if (docReference == null)
    {
      docReference = new EObjectContainmentEList<XDocUri>(XDocUri.class, this, AlisaPackage.REQUIREMENT__DOC_REFERENCE);
    }
    return docReference;
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
  public EList<VerificationDecomposition> getVerifiedBy()
  {
    if (verifiedBy == null)
    {
      verifiedBy = new EObjectContainmentEList<VerificationDecomposition>(VerificationDecomposition.class, this, AlisaPackage.REQUIREMENT__VERIFIED_BY);
    }
    return verifiedBy;
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
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        return ((InternalEList<?>)getDocReference()).basicRemove(otherEnd, msgs);
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.REQUIREMENT__CATEGORY:
        return getCategory();
      case AlisaPackage.REQUIREMENT__TITLE:
        return getTitle();
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        return getDescription();
      case AlisaPackage.REQUIREMENT__ASSERT:
        return getAssert();
      case AlisaPackage.REQUIREMENT__RATIONALE:
        return getRationale();
      case AlisaPackage.REQUIREMENT__ISSUE:
        return getIssue();
      case AlisaPackage.REQUIREMENT__SECTION_REFERENCE:
        return getSectionReference();
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        return getRefinesReference();
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        return getDecomposesReference();
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        return getEvolvesReference();
      case AlisaPackage.REQUIREMENT__CONFLICTS_REFERENCE:
        return getConflictsReference();
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REFERENCE:
        return getStakeholderReference();
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return getStakeholderRequirementReference();
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        return getSystemRequirementReference();
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        return getDocReference();
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        return getGoalReference();
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        return getHazardReference();
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return getVerifiedBy();
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
      case AlisaPackage.REQUIREMENT__CATEGORY:
        getCategory().clear();
        getCategory().addAll((Collection<? extends Category>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__TITLE:
        setTitle((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__ASSERT:
        setAssert((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__RATIONALE:
        setRationale((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__ISSUE:
        getIssue().clear();
        getIssue().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__SECTION_REFERENCE:
        getSectionReference().clear();
        getSectionReference().addAll((Collection<? extends RSALContainer>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        getRefinesReference().clear();
        getRefinesReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        getDecomposesReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        getEvolvesReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__CONFLICTS_REFERENCE:
        getConflictsReference().clear();
        getConflictsReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REFERENCE:
        getStakeholderReference().clear();
        getStakeholderReference().addAll((Collection<? extends Stakeholder>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        getStakeholderRequirementReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        getSystemRequirementReference().clear();
        getSystemRequirementReference().addAll((Collection<? extends ContractualElement>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        getDocReference().clear();
        getDocReference().addAll((Collection<? extends XDocUri>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        getGoalReference().clear();
        getGoalReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        getHazardReference().clear();
        getHazardReference().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        getVerifiedBy().clear();
        getVerifiedBy().addAll((Collection<? extends VerificationDecomposition>)newValue);
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
      case AlisaPackage.REQUIREMENT__CATEGORY:
        getCategory().clear();
        return;
      case AlisaPackage.REQUIREMENT__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__ASSERT:
        setAssert(ASSERT_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__RATIONALE:
        setRationale(RATIONALE_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__ISSUE:
        getIssue().clear();
        return;
      case AlisaPackage.REQUIREMENT__SECTION_REFERENCE:
        getSectionReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        getRefinesReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__CONFLICTS_REFERENCE:
        getConflictsReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REFERENCE:
        getStakeholderReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        getSystemRequirementReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        getDocReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        getGoalReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        getHazardReference().clear();
        return;
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        getVerifiedBy().clear();
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
      case AlisaPackage.REQUIREMENT__CATEGORY:
        return category != null && !category.isEmpty();
      case AlisaPackage.REQUIREMENT__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlisaPackage.REQUIREMENT__ASSERT:
        return ASSERT_EDEFAULT == null ? assert_ != null : !ASSERT_EDEFAULT.equals(assert_);
      case AlisaPackage.REQUIREMENT__RATIONALE:
        return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
      case AlisaPackage.REQUIREMENT__ISSUE:
        return issue != null && !issue.isEmpty();
      case AlisaPackage.REQUIREMENT__SECTION_REFERENCE:
        return sectionReference != null && !sectionReference.isEmpty();
      case AlisaPackage.REQUIREMENT__REFINES_REFERENCE:
        return refinesReference != null && !refinesReference.isEmpty();
      case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE:
        return decomposesReference != null && !decomposesReference.isEmpty();
      case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE:
        return evolvesReference != null && !evolvesReference.isEmpty();
      case AlisaPackage.REQUIREMENT__CONFLICTS_REFERENCE:
        return conflictsReference != null && !conflictsReference.isEmpty();
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REFERENCE:
        return stakeholderReference != null && !stakeholderReference.isEmpty();
      case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return stakeholderRequirementReference != null && !stakeholderRequirementReference.isEmpty();
      case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE:
        return systemRequirementReference != null && !systemRequirementReference.isEmpty();
      case AlisaPackage.REQUIREMENT__DOC_REFERENCE:
        return docReference != null && !docReference.isEmpty();
      case AlisaPackage.REQUIREMENT__GOAL_REFERENCE:
        return goalReference != null && !goalReference.isEmpty();
      case AlisaPackage.REQUIREMENT__HAZARD_REFERENCE:
        return hazardReference != null && !hazardReference.isEmpty();
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return verifiedBy != null && !verifiedBy.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == ContractualElement.class)
    {
      switch (derivedFeatureID)
      {
        case AlisaPackage.REQUIREMENT__TARGET: return AlisaPackage.CONTRACTUAL_ELEMENT__TARGET;
        case AlisaPackage.REQUIREMENT__CATEGORY: return AlisaPackage.CONTRACTUAL_ELEMENT__CATEGORY;
        case AlisaPackage.REQUIREMENT__TITLE: return AlisaPackage.CONTRACTUAL_ELEMENT__TITLE;
        case AlisaPackage.REQUIREMENT__DESCRIPTION: return AlisaPackage.CONTRACTUAL_ELEMENT__DESCRIPTION;
        case AlisaPackage.REQUIREMENT__ASSERT: return AlisaPackage.CONTRACTUAL_ELEMENT__ASSERT;
        case AlisaPackage.REQUIREMENT__RATIONALE: return AlisaPackage.CONTRACTUAL_ELEMENT__RATIONALE;
        case AlisaPackage.REQUIREMENT__ISSUE: return AlisaPackage.CONTRACTUAL_ELEMENT__ISSUE;
        case AlisaPackage.REQUIREMENT__SECTION_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__SECTION_REFERENCE;
        case AlisaPackage.REQUIREMENT__REFINES_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__REFINES_REFERENCE;
        case AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__DECOMPOSES_REFERENCE;
        case AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__EVOLVES_REFERENCE;
        case AlisaPackage.REQUIREMENT__CONFLICTS_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__CONFLICTS_REFERENCE;
        case AlisaPackage.REQUIREMENT__STAKEHOLDER_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__STAKEHOLDER_REFERENCE;
        case AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__STAKEHOLDER_REQUIREMENT_REFERENCE;
        case AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__SYSTEM_REQUIREMENT_REFERENCE;
        case AlisaPackage.REQUIREMENT__DOC_REFERENCE: return AlisaPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == ContractualElement.class)
    {
      switch (baseFeatureID)
      {
        case AlisaPackage.CONTRACTUAL_ELEMENT__TARGET: return AlisaPackage.REQUIREMENT__TARGET;
        case AlisaPackage.CONTRACTUAL_ELEMENT__CATEGORY: return AlisaPackage.REQUIREMENT__CATEGORY;
        case AlisaPackage.CONTRACTUAL_ELEMENT__TITLE: return AlisaPackage.REQUIREMENT__TITLE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__DESCRIPTION: return AlisaPackage.REQUIREMENT__DESCRIPTION;
        case AlisaPackage.CONTRACTUAL_ELEMENT__ASSERT: return AlisaPackage.REQUIREMENT__ASSERT;
        case AlisaPackage.CONTRACTUAL_ELEMENT__RATIONALE: return AlisaPackage.REQUIREMENT__RATIONALE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__ISSUE: return AlisaPackage.REQUIREMENT__ISSUE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__SECTION_REFERENCE: return AlisaPackage.REQUIREMENT__SECTION_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__REFINES_REFERENCE: return AlisaPackage.REQUIREMENT__REFINES_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__DECOMPOSES_REFERENCE: return AlisaPackage.REQUIREMENT__DECOMPOSES_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__EVOLVES_REFERENCE: return AlisaPackage.REQUIREMENT__EVOLVES_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__CONFLICTS_REFERENCE: return AlisaPackage.REQUIREMENT__CONFLICTS_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__STAKEHOLDER_REFERENCE: return AlisaPackage.REQUIREMENT__STAKEHOLDER_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__STAKEHOLDER_REQUIREMENT_REFERENCE: return AlisaPackage.REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__SYSTEM_REQUIREMENT_REFERENCE: return AlisaPackage.REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE;
        case AlisaPackage.CONTRACTUAL_ELEMENT__DOC_REFERENCE: return AlisaPackage.REQUIREMENT__DOC_REFERENCE;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
    result.append(" (title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(", assert: ");
    result.append(assert_);
    result.append(", rationale: ");
    result.append(rationale);
    result.append(", issue: ");
    result.append(issue);
    result.append(", hazardReference: ");
    result.append(hazardReference);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl
