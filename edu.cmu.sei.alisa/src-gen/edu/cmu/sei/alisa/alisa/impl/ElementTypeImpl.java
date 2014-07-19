/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ElementType;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl#getElementType <em>Element Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl#getModelType <em>Model Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl#getDetails <em>Details</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ElementTypeImpl extends MinimalEObjectImpl.Container implements ElementType
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
   * The default value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected static final String REFERENCE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getReference() <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReference()
   * @generated
   * @ordered
   */
  protected String reference = REFERENCE_EDEFAULT;

  /**
   * The default value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected static final String ELEMENT_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getElementType() <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getElementType()
   * @generated
   * @ordered
   */
  protected String elementType = ELEMENT_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelType()
   * @generated
   * @ordered
   */
  protected static final String MODEL_TYPE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getModelType() <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getModelType()
   * @generated
   * @ordered
   */
  protected String modelType = MODEL_TYPE_EDEFAULT;

  /**
   * The default value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected static final String DETAILS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getDetails() <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDetails()
   * @generated
   * @ordered
   */
  protected String details = DETAILS_EDEFAULT;

  /**
   * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getVersion()
   * @generated
   * @ordered
   */
  protected EList<String> version;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ElementTypeImpl()
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
    return AlisaPackage.Literals.ELEMENT_TYPE;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_TYPE__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getReference()
  {
    return reference;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setReference(String newReference)
  {
    String oldReference = reference;
    reference = newReference;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_TYPE__REFERENCE, oldReference, reference));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getElementType()
  {
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setElementType(String newElementType)
  {
    String oldElementType = elementType;
    elementType = newElementType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_TYPE__ELEMENT_TYPE, oldElementType, elementType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getModelType()
  {
    return modelType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setModelType(String newModelType)
  {
    String oldModelType = modelType;
    modelType = newModelType;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_TYPE__MODEL_TYPE, oldModelType, modelType));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getDetails()
  {
    return details;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setDetails(String newDetails)
  {
    String oldDetails = details;
    details = newDetails;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ELEMENT_TYPE__DETAILS, oldDetails, details));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getVersion()
  {
    if (version == null)
    {
      version = new EDataTypeEList<String>(String.class, this, AlisaPackage.ELEMENT_TYPE__VERSION);
    }
    return version;
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
      case AlisaPackage.ELEMENT_TYPE__NAME:
        return getName();
      case AlisaPackage.ELEMENT_TYPE__REFERENCE:
        return getReference();
      case AlisaPackage.ELEMENT_TYPE__ELEMENT_TYPE:
        return getElementType();
      case AlisaPackage.ELEMENT_TYPE__MODEL_TYPE:
        return getModelType();
      case AlisaPackage.ELEMENT_TYPE__DETAILS:
        return getDetails();
      case AlisaPackage.ELEMENT_TYPE__VERSION:
        return getVersion();
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
      case AlisaPackage.ELEMENT_TYPE__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.ELEMENT_TYPE__REFERENCE:
        setReference((String)newValue);
        return;
      case AlisaPackage.ELEMENT_TYPE__ELEMENT_TYPE:
        setElementType((String)newValue);
        return;
      case AlisaPackage.ELEMENT_TYPE__MODEL_TYPE:
        setModelType((String)newValue);
        return;
      case AlisaPackage.ELEMENT_TYPE__DETAILS:
        setDetails((String)newValue);
        return;
      case AlisaPackage.ELEMENT_TYPE__VERSION:
        getVersion().clear();
        getVersion().addAll((Collection<? extends String>)newValue);
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
      case AlisaPackage.ELEMENT_TYPE__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_TYPE__REFERENCE:
        setReference(REFERENCE_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_TYPE__ELEMENT_TYPE:
        setElementType(ELEMENT_TYPE_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_TYPE__MODEL_TYPE:
        setModelType(MODEL_TYPE_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_TYPE__DETAILS:
        setDetails(DETAILS_EDEFAULT);
        return;
      case AlisaPackage.ELEMENT_TYPE__VERSION:
        getVersion().clear();
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
      case AlisaPackage.ELEMENT_TYPE__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.ELEMENT_TYPE__REFERENCE:
        return REFERENCE_EDEFAULT == null ? reference != null : !REFERENCE_EDEFAULT.equals(reference);
      case AlisaPackage.ELEMENT_TYPE__ELEMENT_TYPE:
        return ELEMENT_TYPE_EDEFAULT == null ? elementType != null : !ELEMENT_TYPE_EDEFAULT.equals(elementType);
      case AlisaPackage.ELEMENT_TYPE__MODEL_TYPE:
        return MODEL_TYPE_EDEFAULT == null ? modelType != null : !MODEL_TYPE_EDEFAULT.equals(modelType);
      case AlisaPackage.ELEMENT_TYPE__DETAILS:
        return DETAILS_EDEFAULT == null ? details != null : !DETAILS_EDEFAULT.equals(details);
      case AlisaPackage.ELEMENT_TYPE__VERSION:
        return version != null && !version.isEmpty();
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
    result.append(", reference: ");
    result.append(reference);
    result.append(", elementType: ");
    result.append(elementType);
    result.append(", modelType: ");
    result.append(modelType);
    result.append(", details: ");
    result.append(details);
    result.append(", version: ");
    result.append(version);
    result.append(')');
    return result.toString();
  }

} //ElementTypeImpl
