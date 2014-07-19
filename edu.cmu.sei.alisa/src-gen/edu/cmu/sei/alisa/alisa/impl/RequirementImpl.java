/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ElementType;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getComment <em>Comment</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl#getDecomposedBy <em>Decomposed By</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementImpl extends MinimalEObjectImpl.Container implements Requirement
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
   * The default value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected static final String COMMENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getComment() <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getComment()
   * @generated
   * @ordered
   */
  protected String comment = COMMENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getAssignedTo() <em>Assigned To</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAssignedTo()
   * @generated
   * @ordered
   */
  protected EList<Stakeholder> assignedTo;

  /**
   * The cached value of the '{@link #getReferencedBy() <em>Referenced By</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedBy()
   * @generated
   * @ordered
   */
  protected EList<ElementType> referencedBy;

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
   * The cached value of the '{@link #getDecomposedBy() <em>Decomposed By</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposedBy()
   * @generated
   * @ordered
   */
  protected EList<RequirementDecomposition> decomposedBy;

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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__NAME, oldName, name));
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
  public String getComment()
  {
    return comment;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setComment(String newComment)
  {
    String oldComment = comment;
    comment = newComment;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT__COMMENT, oldComment, comment));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stakeholder> getAssignedTo()
  {
    if (assignedTo == null)
    {
      assignedTo = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, AlisaPackage.REQUIREMENT__ASSIGNED_TO);
    }
    return assignedTo;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ElementType> getReferencedBy()
  {
    if (referencedBy == null)
    {
      referencedBy = new EObjectResolvingEList<ElementType>(ElementType.class, this, AlisaPackage.REQUIREMENT__REFERENCED_BY);
    }
    return referencedBy;
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
  public EList<RequirementDecomposition> getDecomposedBy()
  {
    if (decomposedBy == null)
    {
      decomposedBy = new EObjectContainmentEList<RequirementDecomposition>(RequirementDecomposition.class, this, AlisaPackage.REQUIREMENT__DECOMPOSED_BY);
    }
    return decomposedBy;
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
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return ((InternalEList<?>)getVerifiedBy()).basicRemove(otherEnd, msgs);
      case AlisaPackage.REQUIREMENT__DECOMPOSED_BY:
        return ((InternalEList<?>)getDecomposedBy()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.REQUIREMENT__NAME:
        return getName();
      case AlisaPackage.REQUIREMENT__TITLE:
        return getTitle();
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        return getDescription();
      case AlisaPackage.REQUIREMENT__COMMENT:
        return getComment();
      case AlisaPackage.REQUIREMENT__ASSIGNED_TO:
        return getAssignedTo();
      case AlisaPackage.REQUIREMENT__REFERENCED_BY:
        return getReferencedBy();
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return getVerifiedBy();
      case AlisaPackage.REQUIREMENT__DECOMPOSED_BY:
        return getDecomposedBy();
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
      case AlisaPackage.REQUIREMENT__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__TITLE:
        setTitle((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__COMMENT:
        setComment((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT__ASSIGNED_TO:
        getAssignedTo().clear();
        getAssignedTo().addAll((Collection<? extends Stakeholder>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__REFERENCED_BY:
        getReferencedBy().clear();
        getReferencedBy().addAll((Collection<? extends ElementType>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        getVerifiedBy().clear();
        getVerifiedBy().addAll((Collection<? extends VerificationDecomposition>)newValue);
        return;
      case AlisaPackage.REQUIREMENT__DECOMPOSED_BY:
        getDecomposedBy().clear();
        getDecomposedBy().addAll((Collection<? extends RequirementDecomposition>)newValue);
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
      case AlisaPackage.REQUIREMENT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__COMMENT:
        setComment(COMMENT_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT__ASSIGNED_TO:
        getAssignedTo().clear();
        return;
      case AlisaPackage.REQUIREMENT__REFERENCED_BY:
        getReferencedBy().clear();
        return;
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        getVerifiedBy().clear();
        return;
      case AlisaPackage.REQUIREMENT__DECOMPOSED_BY:
        getDecomposedBy().clear();
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
      case AlisaPackage.REQUIREMENT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.REQUIREMENT__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AlisaPackage.REQUIREMENT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlisaPackage.REQUIREMENT__COMMENT:
        return COMMENT_EDEFAULT == null ? comment != null : !COMMENT_EDEFAULT.equals(comment);
      case AlisaPackage.REQUIREMENT__ASSIGNED_TO:
        return assignedTo != null && !assignedTo.isEmpty();
      case AlisaPackage.REQUIREMENT__REFERENCED_BY:
        return referencedBy != null && !referencedBy.isEmpty();
      case AlisaPackage.REQUIREMENT__VERIFIED_BY:
        return verifiedBy != null && !verifiedBy.isEmpty();
      case AlisaPackage.REQUIREMENT__DECOMPOSED_BY:
        return decomposedBy != null && !decomposedBy.isEmpty();
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
    result.append(", title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(", comment: ");
    result.append(comment);
    result.append(')');
    return result.toString();
  }

} //RequirementImpl
