/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.DocumentedRequirement;
import edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documented Requirement Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl#getElement <em>Element</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DocumentedRequirementDecompositionImpl extends MinimalEObjectImpl.Container implements DocumentedRequirementDecomposition
{
  /**
   * The cached value of the '{@link #getElement() <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElement()
   * @generated
   * @ordered
   */
  protected DocumentedRequirement element;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected DocumentedRequirement left;

  /**
   * The default value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected static final String TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getType()
   * @generated
   * @ordered
   */
  protected String type = TYPE_EDEFAULT;

  /**
   * The cached value of the '{@link #getRight() <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRight()
   * @generated
   * @ordered
   */
  protected DocumentedRequirementDecomposition right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DocumentedRequirementDecompositionImpl()
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
    return AlisaPackage.Literals.DOCUMENTED_REQUIREMENT_DECOMPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentedRequirement getElement()
  {
    if (element != null && element.eIsProxy())
    {
      InternalEObject oldElement = (InternalEObject)element;
      element = (DocumentedRequirement)eResolveProxy(oldElement);
      if (element != oldElement)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT, oldElement, element));
      }
    }
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentedRequirement basicGetElement()
  {
    return element;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElement(DocumentedRequirement newElement)
  {
    DocumentedRequirement oldElement = element;
    element = newElement;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT, oldElement, element));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentedRequirement getLeft()
  {
    if (left != null && left.eIsProxy())
    {
      InternalEObject oldLeft = (InternalEObject)left;
      left = (DocumentedRequirement)eResolveProxy(oldLeft);
      if (left != oldLeft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT, oldLeft, left));
      }
    }
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentedRequirement basicGetLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(DocumentedRequirement newLeft)
  {
    DocumentedRequirement oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT, oldLeft, left));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getType()
  {
    return type;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setType(String newType)
  {
    String oldType = type;
    type = newType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentedRequirementDecomposition getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(DocumentedRequirementDecomposition newRight, NotificationChain msgs)
  {
    DocumentedRequirementDecomposition oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(DocumentedRequirementDecomposition newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT, newRight, newRight));
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
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT:
        return basicSetRight(null, msgs);
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
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT:
        if (resolve) return getElement();
        return basicGetElement();
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT:
        if (resolve) return getLeft();
        return basicGetLeft();
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__TYPE:
        return getType();
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT:
        return getRight();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT:
        setElement((DocumentedRequirement)newValue);
        return;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT:
        setLeft((DocumentedRequirement)newValue);
        return;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__TYPE:
        setType((String)newValue);
        return;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT:
        setRight((DocumentedRequirementDecomposition)newValue);
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
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT:
        setElement((DocumentedRequirement)null);
        return;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT:
        setLeft((DocumentedRequirement)null);
        return;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT:
        setRight((DocumentedRequirementDecomposition)null);
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
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT:
        return element != null;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT:
        return left != null;
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT:
        return right != null;
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
    result.append(" (type: ");
    result.append(type);
    result.append(')');
    return result.toString();
  }

} //DocumentedRequirementDecompositionImpl