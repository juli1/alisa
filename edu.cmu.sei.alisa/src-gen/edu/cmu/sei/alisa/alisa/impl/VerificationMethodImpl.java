/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.VerificationMethod;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Verification Method</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl#getLanguage <em>Language</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl#getMethod <em>Method</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class VerificationMethodImpl extends MinimalEObjectImpl.Container implements VerificationMethod
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
   * The default value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected static final String LANGUAGE_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getLanguage() <em>Language</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getLanguage()
   * @generated
   * @ordered
   */
  protected String language = LANGUAGE_EDEFAULT;

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
   * The cached value of the '{@link #getCategory() <em>Category</em>}' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getCategory()
   * @generated
   * @ordered
   */
  protected EList<Category> category;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected VerificationMethodImpl()
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
    return AlisaPackage.Literals.VERIFICATION_METHOD;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_METHOD__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getLanguage()
  {
    return language;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setLanguage(String newLanguage)
  {
    String oldLanguage = language;
    language = newLanguage;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_METHOD__LANGUAGE, oldLanguage, language));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_METHOD__METHOD, oldMethod, method));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_METHOD__TITLE, oldTitle, title));
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.VERIFICATION_METHOD__DESCRIPTION, oldDescription, description));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Category> getCategory()
  {
    if (category == null)
    {
      category = new EObjectResolvingEList<Category>(Category.class, this, AlisaPackage.VERIFICATION_METHOD__CATEGORY);
    }
    return category;
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
      case AlisaPackage.VERIFICATION_METHOD__NAME:
        return getName();
      case AlisaPackage.VERIFICATION_METHOD__LANGUAGE:
        return getLanguage();
      case AlisaPackage.VERIFICATION_METHOD__METHOD:
        return getMethod();
      case AlisaPackage.VERIFICATION_METHOD__TITLE:
        return getTitle();
      case AlisaPackage.VERIFICATION_METHOD__DESCRIPTION:
        return getDescription();
      case AlisaPackage.VERIFICATION_METHOD__CATEGORY:
        return getCategory();
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
      case AlisaPackage.VERIFICATION_METHOD__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_METHOD__LANGUAGE:
        setLanguage((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_METHOD__METHOD:
        setMethod((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_METHOD__TITLE:
        setTitle((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_METHOD__DESCRIPTION:
        setDescription((String)newValue);
        return;
      case AlisaPackage.VERIFICATION_METHOD__CATEGORY:
        getCategory().clear();
        getCategory().addAll((Collection<? extends Category>)newValue);
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
      case AlisaPackage.VERIFICATION_METHOD__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_METHOD__LANGUAGE:
        setLanguage(LANGUAGE_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_METHOD__METHOD:
        setMethod(METHOD_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_METHOD__TITLE:
        setTitle(TITLE_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_METHOD__DESCRIPTION:
        setDescription(DESCRIPTION_EDEFAULT);
        return;
      case AlisaPackage.VERIFICATION_METHOD__CATEGORY:
        getCategory().clear();
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
      case AlisaPackage.VERIFICATION_METHOD__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.VERIFICATION_METHOD__LANGUAGE:
        return LANGUAGE_EDEFAULT == null ? language != null : !LANGUAGE_EDEFAULT.equals(language);
      case AlisaPackage.VERIFICATION_METHOD__METHOD:
        return METHOD_EDEFAULT == null ? method != null : !METHOD_EDEFAULT.equals(method);
      case AlisaPackage.VERIFICATION_METHOD__TITLE:
        return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
      case AlisaPackage.VERIFICATION_METHOD__DESCRIPTION:
        return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
      case AlisaPackage.VERIFICATION_METHOD__CATEGORY:
        return category != null && !category.isEmpty();
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
    result.append(", language: ");
    result.append(language);
    result.append(", method: ");
    result.append(method);
    result.append(", title: ");
    result.append(title);
    result.append(", description: ");
    result.append(description);
    result.append(')');
    return result.toString();
  }

} //VerificationMethodImpl
