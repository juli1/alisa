/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationResult;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Result</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl#getReferencedVerificationMethod <em>Referenced Verification Method</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl#getState <em>State</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationResultImpl extends MinimalEObjectImpl.Container implements VerificationResult
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
   * The cached value of the '{@link #getReferencedVerificationMethod() <em>Referenced Verification Method</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReferencedVerificationMethod()
   * @generated
   * @ordered
   */
  protected EList<VerificationActivity> referencedVerificationMethod;

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
   * The default value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected static final String STATE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getState() <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getState()
   * @generated
   * @ordered
   */
  protected String state = STATE_EDEFAULT;

  /**
   * The default value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected static final String STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStatus() <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStatus()
   * @generated
   * @ordered
   */
  protected String status = STATUS_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerificationResultImpl()
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
    return AlisaPackage.Literals.VERIFICATION_RESULT;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_RESULT__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<VerificationActivity> getReferencedVerificationMethod()
  {
    if (referencedVerificationMethod == null)
    {
      referencedVerificationMethod = new EObjectResolvingEList<VerificationActivity>(VerificationActivity.class, this, AlisaPackage.VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD);
    }
    return referencedVerificationMethod;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_RESULT__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_RESULT__DESCRIPTION, oldDescription, description));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_RESULT__METHOD, oldMethod, method));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getState()
  {
    return state;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setState(String newState)
  {
    String oldState = state;
    state = newState;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_RESULT__STATE, oldState, state));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getStatus()
  {
    return status;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setStatus(String newStatus)
  {
    String oldStatus = status;
    status = newStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_RESULT__STATUS, oldStatus, status));
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
      case AlisaPackage.VERIFICATION_RESULT__NAME:
        return getName();
      case AlisaPackage.VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD:
        return getReferencedVerificationMethod();
      case AlisaPackage.VERIFICATION_RESULT__TITLE:
        return getTitle();
      case AlisaPackage.VERIFICATION_RESULT__DESCRIPTION:
        return getDescription();
      case AlisaPackage.VERIFICATION_RESULT__METHOD:
        return getMethod();
      case AlisaPackage.VERIFICATION_RESULT__STATE:
        return getState();
      case AlisaPackage.VERIFICATION_RESULT__STATUS:
        return getStatus();
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
      case AlisaPackage.VERIFICATION_RESULT__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD:
        getReferencedVerificationMethod().clear();
        getReferencedVerificationMethod().addAll((Collection<? extends VerificationActivity>)newValue);
        return;
      case AlisaPackage.VERIFICATION_RESULT__TITLE:
        setTitle((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_RESULT__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_RESULT__METHOD:
        setMethod((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_RESULT__STATE:
        setState((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_RESULT__STATUS:
        setStatus((String)newValue);
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
      case AlisaPackage.VERIFICATION_RESULT__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD:
        getReferencedVerificationMethod().clear();
        return;
      case AlisaPackage.VERIFICATION_RESULT__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_RESULT__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_RESULT__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_RESULT__STATE:
        setState(STATE_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_RESULT__STATUS:
        setStatus(STATUS_EDEFAULT);
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
      case AlisaPackage.VERIFICATION_RESULT__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD:
        return referencedVerificationMethod != null && !referencedVerificationMethod.isEmpty();
      case AlisaPackage.VERIFICATION_RESULT__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AlisaPackage.VERIFICATION_RESULT__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlisaPackage.VERIFICATION_RESULT__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case AlisaPackage.VERIFICATION_RESULT__STATE:
        return STATE_EDEFAULT == null ? state != null : !STATE_EDEFAULT.equals(state);
      case AlisaPackage.VERIFICATION_RESULT__STATUS:
        return STATUS_EDEFAULT == null ? status != null : !STATUS_EDEFAULT.equals(status);
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
    result.append(", state: ");
    result.append(state);
    result.append(", status: ");
    result.append(status);
    result.append(')');
    return result.toString();
  }

} //VerificationResultImpl
