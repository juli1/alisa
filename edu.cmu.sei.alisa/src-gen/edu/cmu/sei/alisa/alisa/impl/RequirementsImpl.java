/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Requirements;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementsImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementsImpl#getReqTarget <em>Req Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementsImpl#getReqs <em>Reqs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementsImpl extends AlisaElementImpl implements Requirements
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
  protected EList<Requirement> reqs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementsImpl()
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
    return AlisaPackage.Literals.REQUIREMENTS;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENTS__NAME, oldName, name));
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.REQUIREMENTS__REQ_TARGET, oldReqTarget, reqTarget));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENTS__REQ_TARGET, oldReqTarget, reqTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Requirement> getReqs()
  {
    if (reqs == null)
    {
      reqs = new EObjectContainmentEList<Requirement>(Requirement.class, this, AlisaPackage.REQUIREMENTS__REQS);
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
      case AlisaPackage.REQUIREMENTS__REQS:
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
      case AlisaPackage.REQUIREMENTS__NAME:
        return getName();
      case AlisaPackage.REQUIREMENTS__REQ_TARGET:
        if (resolve) return getReqTarget();
        return basicGetReqTarget();
      case AlisaPackage.REQUIREMENTS__REQS:
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
      case AlisaPackage.REQUIREMENTS__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.REQUIREMENTS__REQ_TARGET:
        setReqTarget((NamedElement)newValue);
        return;
      case AlisaPackage.REQUIREMENTS__REQS:
        getReqs().clear();
        getReqs().addAll((Collection<? extends Requirement>)newValue);
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
      case AlisaPackage.REQUIREMENTS__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENTS__REQ_TARGET:
        setReqTarget((NamedElement)null);
        return;
      case AlisaPackage.REQUIREMENTS__REQS:
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
      case AlisaPackage.REQUIREMENTS__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.REQUIREMENTS__REQ_TARGET:
        return reqTarget != null;
      case AlisaPackage.REQUIREMENTS__REQS:
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
    result.append(" (name: ");
    result.append(name);
    result.append(')');
    return result.toString();
  }

} //RequirementsImpl
