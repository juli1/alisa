/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.DocumentedRequirement;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.ReqSpec;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Req Spec</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getReqkind <em>Reqkind</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getGoalReference <em>Goal Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getHazardReference <em>Hazard Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getStakeholderreqReference <em>Stakeholderreq Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getSystemreqReference <em>Systemreq Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ReqSpecImpl#getDocReferences <em>Doc References</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ReqSpecImpl extends MinimalEObjectImpl.Container implements ReqSpec
{
  /**
   * The default value of the '{@link #getReqkind() <em>Reqkind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqkind()
   * @generated
   * @ordered
   */
  protected static final String REQKIND_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReqkind() <em>Reqkind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReqkind()
   * @generated
   * @ordered
   */
  protected String reqkind = REQKIND_EDEFAULT;

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
   * The default value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected static final String TARGET_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected String target = TARGET_EDEFAULT;

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
  protected EList<ReqSpec> refinesReference;

  /**
   * The cached value of the '{@link #getDecomposesReference() <em>Decomposes Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposesReference()
   * @generated
   * @ordered
   */
  protected EList<ReqSpec> decomposesReference;

  /**
   * The cached value of the '{@link #getEvolvesReference() <em>Evolves Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getEvolvesReference()
   * @generated
   * @ordered
   */
  protected EList<ReqSpec> evolvesReference;

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
   * The cached value of the '{@link #getStakeholderreqReference() <em>Stakeholderreq Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholderreqReference()
   * @generated
   * @ordered
   */
  protected EList<DocumentedRequirement> stakeholderreqReference;

  /**
   * The cached value of the '{@link #getSystemreqReference() <em>Systemreq Reference</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getSystemreqReference()
   * @generated
   * @ordered
   */
  protected EList<DocumentedRequirement> systemreqReference;

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
  protected ReqSpecImpl()
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
    return AlisaPackage.Literals.REQ_SPEC;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReqkind()
  {
    return reqkind;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReqkind(String newReqkind)
  {
    String oldReqkind = reqkind;
    reqkind = newReqkind;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPEC__REQKIND, oldReqkind, reqkind));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPEC__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(String newTarget)
  {
    String oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPEC__TARGET, oldTarget, target));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPEC__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPEC__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPEC__ASSERT, oldAssert, assert_));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQ_SPEC__RATIONALE, oldRationale, rationale));
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
      issue = new EDataTypeEList<String>(String.class, this, AlisaPackage.REQ_SPEC__ISSUE);
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
      modelReference = new EDataTypeEList<String>(String.class, this, AlisaPackage.REQ_SPEC__MODEL_REFERENCE);
    }
    return modelReference;
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
      goalReference = new EObjectResolvingEList<Goal>(Goal.class, this, AlisaPackage.REQ_SPEC__GOAL_REFERENCE);
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
      hazardReference = new EDataTypeEList<String>(String.class, this, AlisaPackage.REQ_SPEC__HAZARD_REFERENCE);
    }
    return hazardReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReqSpec> getRefinesReference()
  {
    if (refinesReference == null)
    {
      refinesReference = new EObjectResolvingEList<ReqSpec>(ReqSpec.class, this, AlisaPackage.REQ_SPEC__REFINES_REFERENCE);
    }
    return refinesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReqSpec> getDecomposesReference()
  {
    if (decomposesReference == null)
    {
      decomposesReference = new EObjectResolvingEList<ReqSpec>(ReqSpec.class, this, AlisaPackage.REQ_SPEC__DECOMPOSES_REFERENCE);
    }
    return decomposesReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ReqSpec> getEvolvesReference()
  {
    if (evolvesReference == null)
    {
      evolvesReference = new EObjectResolvingEList<ReqSpec>(ReqSpec.class, this, AlisaPackage.REQ_SPEC__EVOLVES_REFERENCE);
    }
    return evolvesReference;
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
      verifiedBy = new EObjectContainmentEList<VerificationDecomposition>(VerificationDecomposition.class, this, AlisaPackage.REQ_SPEC__VERIFIED_BY);
    }
    return verifiedBy;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DocumentedRequirement> getStakeholderreqReference()
  {
    if (stakeholderreqReference == null)
    {
      stakeholderreqReference = new EObjectResolvingEList<DocumentedRequirement>(DocumentedRequirement.class, this, AlisaPackage.REQ_SPEC__STAKEHOLDERREQ_REFERENCE);
    }
    return stakeholderreqReference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<DocumentedRequirement> getSystemreqReference()
  {
    if (systemreqReference == null)
    {
      systemreqReference = new EObjectResolvingEList<DocumentedRequirement>(DocumentedRequirement.class, this, AlisaPackage.REQ_SPEC__SYSTEMREQ_REFERENCE);
    }
    return systemreqReference;
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
      docReferences = new EObjectResolvingEList<ExternalDocument>(ExternalDocument.class, this, AlisaPackage.REQ_SPEC__DOC_REFERENCES);
    }
    return docReferences;
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
      case AlisaPackage.REQ_SPEC__VERIFIED_BY:
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
      case AlisaPackage.REQ_SPEC__REQKIND:
        return getReqkind();
      case AlisaPackage.REQ_SPEC__NAME:
        return getName();
      case AlisaPackage.REQ_SPEC__TARGET:
        return getTarget();
      case AlisaPackage.REQ_SPEC__TITLE:
        return getTitle();
      case AlisaPackage.REQ_SPEC__DESCRIPTION:
        return getDescription();
      case AlisaPackage.REQ_SPEC__ASSERT:
        return getAssert();
      case AlisaPackage.REQ_SPEC__RATIONALE:
        return getRationale();
      case AlisaPackage.REQ_SPEC__ISSUE:
        return getIssue();
      case AlisaPackage.REQ_SPEC__MODEL_REFERENCE:
        return getModelReference();
      case AlisaPackage.REQ_SPEC__GOAL_REFERENCE:
        return getGoalReference();
      case AlisaPackage.REQ_SPEC__HAZARD_REFERENCE:
        return getHazardReference();
      case AlisaPackage.REQ_SPEC__REFINES_REFERENCE:
        return getRefinesReference();
      case AlisaPackage.REQ_SPEC__DECOMPOSES_REFERENCE:
        return getDecomposesReference();
      case AlisaPackage.REQ_SPEC__EVOLVES_REFERENCE:
        return getEvolvesReference();
      case AlisaPackage.REQ_SPEC__VERIFIED_BY:
        return getVerifiedBy();
      case AlisaPackage.REQ_SPEC__STAKEHOLDERREQ_REFERENCE:
        return getStakeholderreqReference();
      case AlisaPackage.REQ_SPEC__SYSTEMREQ_REFERENCE:
        return getSystemreqReference();
      case AlisaPackage.REQ_SPEC__DOC_REFERENCES:
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
      case AlisaPackage.REQ_SPEC__REQKIND:
        setReqkind((String)newValue);
        return;
      case AlisaPackage.REQ_SPEC__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.REQ_SPEC__TARGET:
        setTarget((String)newValue);
        return;
      case AlisaPackage.REQ_SPEC__TITLE:
        setTitle((String)newValue);
        return;
      case AlisaPackage.REQ_SPEC__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlisaPackage.REQ_SPEC__ASSERT:
        setAssert((String)newValue);
        return;
      case AlisaPackage.REQ_SPEC__RATIONALE:
        setRationale((String)newValue);
        return;
      case AlisaPackage.REQ_SPEC__ISSUE:
        getIssue().clear();
        getIssue().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__MODEL_REFERENCE:
        getModelReference().clear();
        getModelReference().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__GOAL_REFERENCE:
        getGoalReference().clear();
        getGoalReference().addAll((Collection<? extends Goal>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__HAZARD_REFERENCE:
        getHazardReference().clear();
        getHazardReference().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__REFINES_REFERENCE:
        getRefinesReference().clear();
        getRefinesReference().addAll((Collection<? extends ReqSpec>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        getDecomposesReference().addAll((Collection<? extends ReqSpec>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        getEvolvesReference().addAll((Collection<? extends ReqSpec>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__VERIFIED_BY:
        getVerifiedBy().clear();
        getVerifiedBy().addAll((Collection<? extends VerificationDecomposition>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__STAKEHOLDERREQ_REFERENCE:
        getStakeholderreqReference().clear();
        getStakeholderreqReference().addAll((Collection<? extends DocumentedRequirement>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__SYSTEMREQ_REFERENCE:
        getSystemreqReference().clear();
        getSystemreqReference().addAll((Collection<? extends DocumentedRequirement>)newValue);
        return;
      case AlisaPackage.REQ_SPEC__DOC_REFERENCES:
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
      case AlisaPackage.REQ_SPEC__REQKIND:
        setReqkind(REQKIND_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPEC__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPEC__TARGET:
        setTarget(TARGET_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPEC__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPEC__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPEC__ASSERT:
        setAssert(ASSERT_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPEC__RATIONALE:
        setRationale(RATIONALE_EDEFAULT);
        return;
      case AlisaPackage.REQ_SPEC__ISSUE:
        getIssue().clear();
        return;
      case AlisaPackage.REQ_SPEC__MODEL_REFERENCE:
        getModelReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__GOAL_REFERENCE:
        getGoalReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__HAZARD_REFERENCE:
        getHazardReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__REFINES_REFERENCE:
        getRefinesReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__DECOMPOSES_REFERENCE:
        getDecomposesReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__EVOLVES_REFERENCE:
        getEvolvesReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__VERIFIED_BY:
        getVerifiedBy().clear();
        return;
      case AlisaPackage.REQ_SPEC__STAKEHOLDERREQ_REFERENCE:
        getStakeholderreqReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__SYSTEMREQ_REFERENCE:
        getSystemreqReference().clear();
        return;
      case AlisaPackage.REQ_SPEC__DOC_REFERENCES:
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
      case AlisaPackage.REQ_SPEC__REQKIND:
        return REQKIND_EDEFAULT == null ? reqkind != null : !REQKIND_EDEFAULT.equals(reqkind);
      case AlisaPackage.REQ_SPEC__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.REQ_SPEC__TARGET:
        return TARGET_EDEFAULT == null ? target != null : !TARGET_EDEFAULT.equals(target);
      case AlisaPackage.REQ_SPEC__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AlisaPackage.REQ_SPEC__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlisaPackage.REQ_SPEC__ASSERT:
        return ASSERT_EDEFAULT == null ? assert_ != null : !ASSERT_EDEFAULT.equals(assert_);
      case AlisaPackage.REQ_SPEC__RATIONALE:
        return RATIONALE_EDEFAULT == null ? rationale != null : !RATIONALE_EDEFAULT.equals(rationale);
      case AlisaPackage.REQ_SPEC__ISSUE:
        return issue != null && !issue.isEmpty();
      case AlisaPackage.REQ_SPEC__MODEL_REFERENCE:
        return modelReference != null && !modelReference.isEmpty();
      case AlisaPackage.REQ_SPEC__GOAL_REFERENCE:
        return goalReference != null && !goalReference.isEmpty();
      case AlisaPackage.REQ_SPEC__HAZARD_REFERENCE:
        return hazardReference != null && !hazardReference.isEmpty();
      case AlisaPackage.REQ_SPEC__REFINES_REFERENCE:
        return refinesReference != null && !refinesReference.isEmpty();
      case AlisaPackage.REQ_SPEC__DECOMPOSES_REFERENCE:
        return decomposesReference != null && !decomposesReference.isEmpty();
      case AlisaPackage.REQ_SPEC__EVOLVES_REFERENCE:
        return evolvesReference != null && !evolvesReference.isEmpty();
      case AlisaPackage.REQ_SPEC__VERIFIED_BY:
        return verifiedBy != null && !verifiedBy.isEmpty();
      case AlisaPackage.REQ_SPEC__STAKEHOLDERREQ_REFERENCE:
        return stakeholderreqReference != null && !stakeholderreqReference.isEmpty();
      case AlisaPackage.REQ_SPEC__SYSTEMREQ_REFERENCE:
        return systemreqReference != null && !systemreqReference.isEmpty();
      case AlisaPackage.REQ_SPEC__DOC_REFERENCES:
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
    result.append(" (reqkind: ");
    result.append(reqkind);
    result.append(", name: ");
    result.append(name);
    result.append(", target: ");
    result.append(target);
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
    result.append(", hazardReference: ");
    result.append(hazardReference);
    result.append(')');
    return result.toString();
  }

} //ReqSpecImpl
