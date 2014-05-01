/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Requirement Decomposition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementDecompositionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementDecompositionImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementDecompositionImpl#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.RequirementDecompositionImpl#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RequirementDecompositionImpl extends MinimalEObjectImpl.Container implements RequirementDecomposition
{
  /**
   * The cached value of the '{@link #getElements() <em>Elements</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElements()
   * @generated
   * @ordered
   */
  protected Requirement elements;

  /**
   * The cached value of the '{@link #getLeft() <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLeft()
   * @generated
   * @ordered
   */
  protected Requirement left;

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
  protected RequirementDecomposition right;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected RequirementDecompositionImpl()
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
    return AlisaPackage.Literals.REQUIREMENT_DECOMPOSITION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement getElements()
  {
    if (elements != null && elements.eIsProxy())
    {
      InternalEObject oldElements = (InternalEObject)elements;
      elements = (Requirement)eResolveProxy(oldElements);
      if (elements != oldElements)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.REQUIREMENT_DECOMPOSITION__ELEMENTS, oldElements, elements));
      }
    }
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement basicGetElements()
  {
    return elements;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElements(Requirement newElements)
  {
    Requirement oldElements = elements;
    elements = newElements;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT_DECOMPOSITION__ELEMENTS, oldElements, elements));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement getLeft()
  {
    if (left != null && left.eIsProxy())
    {
      InternalEObject oldLeft = (InternalEObject)left;
      left = (Requirement)eResolveProxy(oldLeft);
      if (left != oldLeft)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.REQUIREMENT_DECOMPOSITION__LEFT, oldLeft, left));
      }
    }
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement basicGetLeft()
  {
    return left;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLeft(Requirement newLeft)
  {
    Requirement oldLeft = left;
    left = newLeft;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT_DECOMPOSITION__LEFT, oldLeft, left));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT_DECOMPOSITION__TYPE, oldType, type));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementDecomposition getRight()
  {
    return right;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetRight(RequirementDecomposition newRight, NotificationChain msgs)
  {
    RequirementDecomposition oldRight = right;
    right = newRight;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT, oldRight, newRight);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRight(RequirementDecomposition newRight)
  {
    if (newRight != right)
    {
      NotificationChain msgs = null;
      if (right != null)
        msgs = ((InternalEObject)right).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT, null, msgs);
      if (newRight != null)
        msgs = ((InternalEObject)newRight).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT, null, msgs);
      msgs = basicSetRight(newRight, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT, newRight, newRight));
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
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT:
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
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__ELEMENTS:
        if (resolve) return getElements();
        return basicGetElements();
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__LEFT:
        if (resolve) return getLeft();
        return basicGetLeft();
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__TYPE:
        return getType();
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT:
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
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__ELEMENTS:
        setElements((Requirement)newValue);
        return;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__LEFT:
        setLeft((Requirement)newValue);
        return;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__TYPE:
        setType((String)newValue);
        return;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT:
        setRight((RequirementDecomposition)newValue);
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
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__ELEMENTS:
        setElements((Requirement)null);
        return;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__LEFT:
        setLeft((Requirement)null);
        return;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__TYPE:
        setType(TYPE_EDEFAULT);
        return;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT:
        setRight((RequirementDecomposition)null);
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
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__ELEMENTS:
        return elements != null;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__LEFT:
        return left != null;
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__TYPE:
        return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
      case AlisaPackage.REQUIREMENT_DECOMPOSITION__RIGHT:
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

} //RequirementDecompositionImpl
