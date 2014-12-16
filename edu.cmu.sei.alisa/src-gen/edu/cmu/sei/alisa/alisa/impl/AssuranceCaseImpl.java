/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.AssuranceCase;
import edu.cmu.sei.alisa.alisa.AssuranceResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.instance.SystemInstance;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Assurance Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceCaseImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AssuranceCaseImpl#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AssuranceCaseImpl extends AlisaModelImpl implements AssuranceCase
{
  /**
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected SystemInstance target;

  /**
   * The cached value of the '{@link #getResults() <em>Results</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getResults()
   * @generated
   * @ordered
   */
  protected EList<AssuranceResult> results;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AssuranceCaseImpl()
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
    return AlisaPackage.Literals.ASSURANCE_CASE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstance getTarget()
  {
    if (target != null && target.eIsProxy())
    {
      InternalEObject oldTarget = (InternalEObject)target;
      target = (SystemInstance)eResolveProxy(oldTarget);
      if (target != oldTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.ASSURANCE_CASE__TARGET, oldTarget, target));
      }
    }
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public SystemInstance basicGetTarget()
  {
    return target;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTarget(SystemInstance newTarget)
  {
    SystemInstance oldTarget = target;
    target = newTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ASSURANCE_CASE__TARGET, oldTarget, target));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<AssuranceResult> getResults()
  {
    if (results == null)
    {
      results = new EObjectContainmentEList<AssuranceResult>(AssuranceResult.class, this, AlisaPackage.ASSURANCE_CASE__RESULTS);
    }
    return results;
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
      case AlisaPackage.ASSURANCE_CASE__RESULTS:
        return ((InternalEList<?>)getResults()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.ASSURANCE_CASE__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
      case AlisaPackage.ASSURANCE_CASE__RESULTS:
        return getResults();
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
      case AlisaPackage.ASSURANCE_CASE__TARGET:
        setTarget((SystemInstance)newValue);
        return;
      case AlisaPackage.ASSURANCE_CASE__RESULTS:
        getResults().clear();
        getResults().addAll((Collection<? extends AssuranceResult>)newValue);
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
      case AlisaPackage.ASSURANCE_CASE__TARGET:
        setTarget((SystemInstance)null);
        return;
      case AlisaPackage.ASSURANCE_CASE__RESULTS:
        getResults().clear();
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
      case AlisaPackage.ASSURANCE_CASE__TARGET:
        return target != null;
      case AlisaPackage.ASSURANCE_CASE__RESULTS:
        return results != null && !results.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AssuranceCaseImpl
