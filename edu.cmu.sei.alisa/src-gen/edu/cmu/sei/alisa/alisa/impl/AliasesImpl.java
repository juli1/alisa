/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.Alias;
import edu.cmu.sei.alisa.alisa.Aliases;
import edu.cmu.sei.alisa.alisa.AlisaPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Aliases</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AliasesImpl#getAliasesTarget <em>Aliases Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.AliasesImpl#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AliasesImpl extends MinimalEObjectImpl.Container implements Aliases
{
  /**
   * The cached value of the '{@link #getAliasesTarget() <em>Aliases Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliasesTarget()
   * @generated
   * @ordered
   */
  protected NamedElement aliasesTarget;

  /**
   * The cached value of the '{@link #getAliases() <em>Aliases</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getAliases()
   * @generated
   * @ordered
   */
  protected EList<Alias> aliases;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AliasesImpl()
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
    return AlisaPackage.Literals.ALIASES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getAliasesTarget()
  {
    if (aliasesTarget != null && ((EObject)aliasesTarget).eIsProxy())
    {
      InternalEObject oldAliasesTarget = (InternalEObject)aliasesTarget;
      aliasesTarget = (NamedElement)eResolveProxy(oldAliasesTarget);
      if (aliasesTarget != oldAliasesTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.ALIASES__ALIASES_TARGET, oldAliasesTarget, aliasesTarget));
      }
    }
    return aliasesTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetAliasesTarget()
  {
    return aliasesTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setAliasesTarget(NamedElement newAliasesTarget)
  {
    NamedElement oldAliasesTarget = aliasesTarget;
    aliasesTarget = newAliasesTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ALIASES__ALIASES_TARGET, oldAliasesTarget, aliasesTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Alias> getAliases()
  {
    if (aliases == null)
    {
      aliases = new EObjectContainmentEList<Alias>(Alias.class, this, AlisaPackage.ALIASES__ALIASES);
    }
    return aliases;
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
      case AlisaPackage.ALIASES__ALIASES:
        return ((InternalEList<?>)getAliases()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.ALIASES__ALIASES_TARGET:
        if (resolve) return getAliasesTarget();
        return basicGetAliasesTarget();
      case AlisaPackage.ALIASES__ALIASES:
        return getAliases();
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
      case AlisaPackage.ALIASES__ALIASES_TARGET:
        setAliasesTarget((NamedElement)newValue);
        return;
      case AlisaPackage.ALIASES__ALIASES:
        getAliases().clear();
        getAliases().addAll((Collection<? extends Alias>)newValue);
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
      case AlisaPackage.ALIASES__ALIASES_TARGET:
        setAliasesTarget((NamedElement)null);
        return;
      case AlisaPackage.ALIASES__ALIASES:
        getAliases().clear();
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
      case AlisaPackage.ALIASES__ALIASES_TARGET:
        return aliasesTarget != null;
      case AlisaPackage.ALIASES__ALIASES:
        return aliases != null && !aliases.isEmpty();
    }
    return super.eIsSet(featureID);
  }

} //AliasesImpl
