/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.alisa.RSALElement;

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
 * An implementation of the model object '<em><b>RSAL Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl#getContent <em>Content</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl#getTarget <em>Target</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RSALContainerImpl extends AlisaModelImpl implements RSALContainer
{
  /**
   * The cached value of the '{@link #getImportedNamespace() <em>Imported Namespace</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getImportedNamespace()
   * @generated
   * @ordered
   */
  protected EList<NamedElement> importedNamespace;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected EList<RSALElement> content;

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
   * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTarget()
   * @generated
   * @ordered
   */
  protected NamedElement target;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RSALContainerImpl()
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
    return AlisaPackage.Literals.RSAL_CONTAINER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<NamedElement> getImportedNamespace()
  {
    if (importedNamespace == null)
    {
      importedNamespace = new EObjectResolvingEList<NamedElement>(NamedElement.class, this, AlisaPackage.RSAL_CONTAINER__IMPORTED_NAMESPACE);
    }
    return importedNamespace;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<RSALElement> getContent()
  {
    if (content == null)
    {
      content = new EObjectContainmentEList<RSALElement>(RSALElement.class, this, AlisaPackage.RSAL_CONTAINER__CONTENT);
    }
    return content;
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
      issue = new EDataTypeEList<String>(String.class, this, AlisaPackage.RSAL_CONTAINER__ISSUE);
    }
    return issue;
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
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.RSAL_CONTAINER__TARGET, oldTarget, target));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.RSAL_CONTAINER__TARGET, oldTarget, target));
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
      case AlisaPackage.RSAL_CONTAINER__CONTENT:
        return ((InternalEList<?>)getContent()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.RSAL_CONTAINER__IMPORTED_NAMESPACE:
        return getImportedNamespace();
      case AlisaPackage.RSAL_CONTAINER__CONTENT:
        return getContent();
      case AlisaPackage.RSAL_CONTAINER__ISSUE:
        return getIssue();
      case AlisaPackage.RSAL_CONTAINER__TARGET:
        if (resolve) return getTarget();
        return basicGetTarget();
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
      case AlisaPackage.RSAL_CONTAINER__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
        getImportedNamespace().addAll((Collection<? extends NamedElement>)newValue);
        return;
      case AlisaPackage.RSAL_CONTAINER__CONTENT:
        getContent().clear();
        getContent().addAll((Collection<? extends RSALElement>)newValue);
        return;
      case AlisaPackage.RSAL_CONTAINER__ISSUE:
        getIssue().clear();
        getIssue().addAll((Collection<? extends String>)newValue);
        return;
      case AlisaPackage.RSAL_CONTAINER__TARGET:
        setTarget((NamedElement)newValue);
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
      case AlisaPackage.RSAL_CONTAINER__IMPORTED_NAMESPACE:
        getImportedNamespace().clear();
        return;
      case AlisaPackage.RSAL_CONTAINER__CONTENT:
        getContent().clear();
        return;
      case AlisaPackage.RSAL_CONTAINER__ISSUE:
        getIssue().clear();
        return;
      case AlisaPackage.RSAL_CONTAINER__TARGET:
        setTarget((NamedElement)null);
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
      case AlisaPackage.RSAL_CONTAINER__IMPORTED_NAMESPACE:
        return importedNamespace != null && !importedNamespace.isEmpty();
      case AlisaPackage.RSAL_CONTAINER__CONTENT:
        return content != null && !content.isEmpty();
      case AlisaPackage.RSAL_CONTAINER__ISSUE:
        return issue != null && !issue.isEmpty();
      case AlisaPackage.RSAL_CONTAINER__TARGET:
        return target != null;
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
    result.append(" (issue: ");
    result.append(issue);
    result.append(')');
    return result.toString();
  }

} //RSALContainerImpl
