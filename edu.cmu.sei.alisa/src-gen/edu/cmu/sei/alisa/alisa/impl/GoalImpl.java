/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.DocumentedRequirement;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Stakeholder;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getElement <em>Element</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getStakeholderReference <em>Stakeholder Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl#getDocReferences <em>Doc References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GoalImpl extends MinimalEObjectImpl.Container implements Goal
{
  /**
   * The default value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected static final String NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getName()
   * @generated
   * @ordered
   */
  protected String name = NAME_EDEFAULT;

  /**
   * The default value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected String element = ELEMENT_EDEFAULT;

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
   * The cached value of the '{@link #getModelReference() <em>Model Reference</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelReference()
   * @generated
   * @ordered
   */
  protected EList<String> modelReference;

  /**
   * The cached value of the '{@link #getRefinesReference() <em>Refines Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRefinesReference()
   * @generated
   * @ordered
   */
  protected EList<Goal> refinesReference;

  /**
   * The cached value of the '{@link #getDecomposesReference() <em>Decomposes Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposesReference()
   * @generated
   * @ordered
   */
  protected EList<Goal> decomposesReference;

  /**
   * The cached value of the '{@link #getEvolvesReference() <em>Evolves Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvolvesReference()
   * @generated
   * @ordered
   */
  protected EList<Goal> evolvesReference;

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
  protected EList<DocumentedRequirement> stakeholderRequirementReference;

  /**
   * The cached value of the '{@link #getDocReferences() <em>Doc References</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocReferences()
   * @generated
   * @ordered
   */
  protected EList<ExternalDocument> docReferences;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected GoalImpl()
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
    return AlisaPackage.Literals.GOAL;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getName()
  {
    return name;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setName(String newName)
  {
    String oldName = name;
    name = newName;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.GOAL__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(String newElement)
  {
    String oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.GOAL__ELEMENT, oldElement, element));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.GOAL__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.GOAL__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.GOAL__ASSERT, oldAssert, assert_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.GOAL__RATIONALE, oldRationale, rationale));
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
      issue = new EDataTypeEList<String>(String.class, this, AlisaPackage.GOAL__ISSUE);
    }
    return issue;
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
      modelReference = new EDataTypeEList<String>(String.class, this, AlisaPackage.GOAL__MODEL_REFERENCE);
    }
    return modelReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getRefinesReference()
  {
    if (refinesReference == null)
    {
      refinesReference = new EObjectResolvingEList<Goal>(Goal.class, this, AlisaPackage.GOAL__REFINES_REFERENCE);
    }
    return refinesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getDecomposesReference()
  {
    if (decomposesReference == null)
    {
      decomposesReference = new EObjectResolvingEList<Goal>(Goal.class, this, AlisaPackage.GOAL__DECOMPOSES_REFERENCE);
    }
    return decomposesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Goal> getEvolvesReference()
  {
    if (evolvesReference == null)
    {
      evolvesReference = new EObjectResolvingEList<Goal>(Goal.class, this, AlisaPackage.GOAL__EVOLVES_REFERENCE);
    }
    return evolvesReference;
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
      stakeholderReference = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, AlisaPackage.GOAL__STAKEHOLDER_REFERENCE);
    }
    return stakeholderReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DocumentedRequirement> getStakeholderRequirementReference()
  {
    if (stakeholderRequirementReference == null)
    {
      stakeholderRequirementReference = new EObjectResolvingEList<DocumentedRequirement>(DocumentedRequirement.class, this, AlisaPackage.GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE);
    }
    return stakeholderRequirementReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalDocument> getDocReferences()
  {
    if (docReferences == null)
    {
      docReferences = new EObjectResolvingEList<ExternalDocument>(ExternalDocument.class, this, AlisaPackage.GOAL__DOC_REFERENCES);
    }
    return docReferences;
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
      case AlisaPackage.GOAL__NAME:
        return getName();
      case AlisaPackage.GOAL__ELEMENT:
        return getElement();
      case AlisaPackage.GOAL__TITLE:
        return getTitle();
      case AlisaPackage.GOAL__DESCRIPTION:
        return getDescription();
      case AlisaPackage.GOAL__ASSERT:
        return getAssert();
      case AlisaPackage.GOAL__RATIONALE:
        return getRationale();
      case AlisaPackage.GOAL__ISSUE:
        return getIssue();
      case AlisaPackage.GOAL__MODEL_REFERENCE:
        return getModelReference();
      case AlisaPackage.GOAL__REFINES_REFERENCE:
        return getRefinesReference();
      case AlisaPackage.GOAL__DECOMPOSES_REFERENCE:
        return getDecomposesReference();
      case AlisaPackage.GOAL__EVOLVES_REFERENCE:
        return getEvolvesReference();
      case AlisaPackage.GOAL__STAKEHOLDER_REFERENCE:
        return getStakeholderReference();
      case AlisaPackage.GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return getStakeholderRequirementReference();
      case AlisaPackage.GOAL__DOC_REFERENCES:
        return getDocReferences();
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
      case AlisaPackage.GOAL__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.GOAL__ELEMENT:
        setElement((String)newValue);
        return;
      case AlisaPackage.GOAL__TITLE:
        setTitle((String)newValue);
        return;
      case AlisaPackage.GOAL__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlisaPackage.GOAL__ASSERT:
        setAssert((String)newValue);
        return;
      case AlisaPackage.GOAL__RATIONALE:
        setRationale((String)newValue);
        return;
      case AlisaPackage.GOAL__ISSUE:
        getIssue().clear();
        getIssue().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.GOAL__MODEL_REFERENCE:
        getModelReference().clear();
        getModelReference().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.GOAL__REFINES_REFERENCE:
        getRefinesReference().clear();
        getRefinesReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case AlisaPackage.GOAL__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        getDecomposesReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case AlisaPackage.GOAL__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        getEvolvesReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case AlisaPackage.GOAL__STAKEHOLDER_REFERENCE:
        getStakeholderReference().clear();
        getStakeholderReference().addAll((Collection<? extends Stakeholder>)newValue);
        return;
      case AlisaPackage.GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        getStakeholderRequirementReference().addAll((Collection<? extends DocumentedRequirement>)newValue);
        return;
      case AlisaPackage.GOAL__DOC_REFERENCES:
        getDocReferences().clear();
        getDocReferences().addAll((Collection<? extends ExternalDocument>)newValue);
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
      case AlisaPackage.GOAL__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.GOAL__ELEMENT:
        setElement(ELEMENT_EDEFAULT);
        return;
      case AlisaPackage.GOAL__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AlisaPackage.GOAL__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlisaPackage.GOAL__ASSERT:
        setAssert(ASSERT_EDEFAULT);
        return;
      case AlisaPackage.GOAL__RATIONALE:
        setRationale(RATIONALE_EDEFAULT);
        return;
      case AlisaPackage.GOAL__ISSUE:
        getIssue().clear();
        return;
      case AlisaPackage.GOAL__MODEL_REFERENCE:
        getModelReference().clear();
        return;
      case AlisaPackage.GOAL__REFINES_REFERENCE:
        getRefinesReference().clear();
        return;
      case AlisaPackage.GOAL__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        return;
      case AlisaPackage.GOAL__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        return;
      case AlisaPackage.GOAL__STAKEHOLDER_REFERENCE:
        getStakeholderReference().clear();
        return;
      case AlisaPackage.GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE:
        getStakeholderRequirementReference().clear();
        return;
      case AlisaPackage.GOAL__DOC_REFERENCES:
        getDocReferences().clear();
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
      case AlisaPackage.GOAL__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.GOAL__ELEMENT:
        return ELEMENT_EDEFAULT == null ? element != null : !ELEMENT_EDEFAULT.equals(element);
      case AlisaPackage.GOAL__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AlisaPackage.GOAL__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlisaPackage.GOAL__ASSERT:
        return ASSERT_EDEFAULT == null ? assert_ != null : !ASSERT_EDEFAULT.equals(assert_);
      case AlisaPackage.GOAL__RATIONALE:
        return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
      case AlisaPackage.GOAL__ISSUE:
        return issue != null && !issue.isEmpty();
      case AlisaPackage.GOAL__MODEL_REFERENCE:
        return modelReference != null && !modelReference.isEmpty();
      case AlisaPackage.GOAL__REFINES_REFERENCE:
        return refinesReference != null && !refinesReference.isEmpty();
      case AlisaPackage.GOAL__DECOMPOSES_REFERENCE:
        return decomposesReference != null && !decomposesReference.isEmpty();
      case AlisaPackage.GOAL__EVOLVES_REFERENCE:
        return evolvesReference != null && !evolvesReference.isEmpty();
      case AlisaPackage.GOAL__STAKEHOLDER_REFERENCE:
        return stakeholderReference != null && !stakeholderReference.isEmpty();
      case AlisaPackage.GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE:
        return stakeholderRequirementReference != null && !stakeholderRequirementReference.isEmpty();
      case AlisaPackage.GOAL__DOC_REFERENCES:
        return docReferences != null && !docReferences.isEmpty();
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
    result.append(" (name: ");
    result.append(name);
    result.append(", element: ");
    result.append(element);
    result.append(", title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(", assert: ");
    result.append(assert_);
    result.append(", rationale: ");
    result.append(rationale);
    result.append(", issue: ");
    result.append(issue);
    result.append(", modelReference: ");
    result.append(modelReference);
    result.append(')');
    return result.toString();
  }

} //GoalImpl
