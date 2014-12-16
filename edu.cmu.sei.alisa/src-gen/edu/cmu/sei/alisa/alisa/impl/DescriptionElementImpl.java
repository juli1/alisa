/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.DescriptionElement;
import edu.cmu.sei.alisa.alisa.RSALVariable;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Description Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.DescriptionElementImpl#getTest <em>Test</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.DescriptionElementImpl#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DescriptionElementImpl extends MinimalEObjectImpl.Container implements DescriptionElement
{
  /**
   * The default value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected static final String TEST_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getTest() <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getTest()
   * @generated
   * @ordered
   */
  protected String test = TEST_EDEFAULT;

  /**
   * The cached value of the '{@link #getRef() <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getRef()
   * @generated
   * @ordered
   */
  protected RSALVariable ref;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected DescriptionElementImpl()
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
    return AlisaPackage.Literals.DESCRIPTION_ELEMENT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getTest()
  {
    return test;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setTest(String newTest)
  {
    String oldTest = test;
    test = newTest;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.DESCRIPTION_ELEMENT__TEST, oldTest, test));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSALVariable getRef()
  {
    if (ref != null && ref.eIsProxy())
    {
      InternalEObject oldRef = (InternalEObject)ref;
      ref = (RSALVariable)eResolveProxy(oldRef);
      if (ref != oldRef)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.DESCRIPTION_ELEMENT__REF, oldRef, ref));
      }
    }
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RSALVariable basicGetRef()
  {
    return ref;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setRef(RSALVariable newRef)
  {
    RSALVariable oldRef = ref;
    ref = newRef;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.DESCRIPTION_ELEMENT__REF, oldRef, ref));
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
      case AlisaPackage.DESCRIPTION_ELEMENT__TEST:
        return getTest();
      case AlisaPackage.DESCRIPTION_ELEMENT__REF:
        if (resolve) return getRef();
        return basicGetRef();
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
      case AlisaPackage.DESCRIPTION_ELEMENT__TEST:
        setTest((String)newValue);
        return;
      case AlisaPackage.DESCRIPTION_ELEMENT__REF:
        setRef((RSALVariable)newValue);
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
      case AlisaPackage.DESCRIPTION_ELEMENT__TEST:
        setTest(TEST_EDEFAULT);
        return;
      case AlisaPackage.DESCRIPTION_ELEMENT__REF:
        setRef((RSALVariable)null);
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
      case AlisaPackage.DESCRIPTION_ELEMENT__TEST:
        return TEST_EDEFAULT == null ? test != null : !TEST_EDEFAULT.equals(test);
      case AlisaPackage.DESCRIPTION_ELEMENT__REF:
        return ref != null;
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
    result.append(" (test: ");
    result.append(test);
    result.append(')');
    return result.toString();
  }

} //DescriptionElementImpl
