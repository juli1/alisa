/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl#getDecomposedTo <em>Decomposed To</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl#getAssignedTo <em>Assigned To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationActivityImpl extends AlisaElementImpl implements VerificationActivity
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
   * The default value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected static final String METHOD_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getMethod() <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMethod()
   * @generated
   * @ordered
   */
  protected String method = METHOD_EDEFAULT;

  /**
   * The cached value of the '{@link #getDecomposedTo() <em>Decomposed To</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDecomposedTo()
   * @generated
   * @ordered
   */
  protected EList<VerificationDecomposition> decomposedTo;

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
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerificationActivityImpl()
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
    return AlisaPackage.Literals.VERIFICATION_ACTIVITY;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ACTIVITY__NAME, oldName, name));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ACTIVITY__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ACTIVITY__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getMethod()
  {
    return method;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setMethod(String newMethod)
  {
    String oldMethod = method;
    method = newMethod;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_ACTIVITY__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VerificationDecomposition> getDecomposedTo()
  {
    if (decomposedTo == null)
    {
      decomposedTo = new EObjectContainmentEList<VerificationDecomposition>(VerificationDecomposition.class, this, AlisaPackage.VERIFICATION_ACTIVITY__DECOMPOSED_TO);
    }
    return decomposedTo;
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
      assignedTo = new EObjectResolvingEList<Stakeholder>(Stakeholder.class, this, AlisaPackage.VERIFICATION_ACTIVITY__ASSIGNED_TO);
    }
    return assignedTo;
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
      case AlisaPackage.VERIFICATION_ACTIVITY__DECOMPOSED_TO:
        return ((InternalEList<?>)getDecomposedTo()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.VERIFICATION_ACTIVITY__NAME:
        return getName();
      case AlisaPackage.VERIFICATION_ACTIVITY__TITLE:
        return getTitle();
      case AlisaPackage.VERIFICATION_ACTIVITY__DESCRIPTION:
        return getDescription();
      case AlisaPackage.VERIFICATION_ACTIVITY__METHOD:
        return getMethod();
      case AlisaPackage.VERIFICATION_ACTIVITY__DECOMPOSED_TO:
        return getDecomposedTo();
      case AlisaPackage.VERIFICATION_ACTIVITY__ASSIGNED_TO:
        return getAssignedTo();
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
      case AlisaPackage.VERIFICATION_ACTIVITY__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__TITLE:
        setTitle((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__METHOD:
        setMethod((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__DECOMPOSED_TO:
        getDecomposedTo().clear();
        getDecomposedTo().addAll((Collection<? extends VerificationDecomposition>)newValue);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__ASSIGNED_TO:
        getAssignedTo().clear();
        getAssignedTo().addAll((Collection<? extends Stakeholder>)newValue);
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
      case AlisaPackage.VERIFICATION_ACTIVITY__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__DECOMPOSED_TO:
        getDecomposedTo().clear();
        return;
      case AlisaPackage.VERIFICATION_ACTIVITY__ASSIGNED_TO:
        getAssignedTo().clear();
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
      case AlisaPackage.VERIFICATION_ACTIVITY__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.VERIFICATION_ACTIVITY__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AlisaPackage.VERIFICATION_ACTIVITY__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlisaPackage.VERIFICATION_ACTIVITY__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case AlisaPackage.VERIFICATION_ACTIVITY__DECOMPOSED_TO:
        return decomposedTo != null && !decomposedTo.isEmpty();
      case AlisaPackage.VERIFICATION_ACTIVITY__ASSIGNED_TO:
        return assignedTo != null && !assignedTo.isEmpty();
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
    result.append(", method: ");
    result.append(method);
    result.append(')');
    return result.toString();
  }

} //VerificationActivityImpl
