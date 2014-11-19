/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.Stakeholder;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;

import org.osate.aadl2.Aadl2Package;
import org.osate.aadl2.Comment;
import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;
import org.osate.aadl2.Namespace;
import org.osate.aadl2.PropertyAssociation;
import org.osate.aadl2.PropertyExpression;

import org.osate.aadl2.util.Aadl2Validator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl#getOwnedElements <em>Owned Element</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl#getOwnedComments <em>Owned Comment</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl#getQualifiedName <em>Qualified Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl#getOwnedPropertyAssociations <em>Owned Property Association</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl#getStakeholder <em>Stakeholder</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OrganizationImpl extends ToplevelImpl implements Organization
{
  /**
   * The cached value of the '{@link #getOwnedComments() <em>Owned Comment</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedComments()
   * @generated
   * @ordered
   */
  protected EList<Comment> ownedComments;

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
   * The default value of the '{@link #getQualifiedName() <em>Qualified Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getQualifiedName()
   * @generated
   * @ordered
   */
  protected static final String QUALIFIED_NAME_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getOwnedPropertyAssociations() <em>Owned Property Association</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getOwnedPropertyAssociations()
   * @generated
   * @ordered
   */
  protected EList<PropertyAssociation> ownedPropertyAssociations;

  /**
   * The cached value of the '{@link #getStakeholder() <em>Stakeholder</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStakeholder()
   * @generated
   * @ordered
   */
  protected EList<Stakeholder> stakeholder;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OrganizationImpl()
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
    return AlisaPackage.Literals.ORGANIZATION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> getOwnedElements()
  {
    // TODO: implement this method to return the 'Owned Element' reference list
    // Ensure that you remove @generated or mark it @generated NOT
    // The list is expected to implement org.eclipse.emf.ecore.util.InternalEList and org.eclipse.emf.ecore.EStructuralFeature.Setting
    // so it's likely that an appropriate subclass of org.eclipse.emf.ecore.util.EcoreEList should be used.
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Comment> getOwnedComments()
  {
    if (ownedComments == null)
    {
      ownedComments = new EObjectContainmentEList<Comment>(Comment.class, this, AlisaPackage.ORGANIZATION__OWNED_COMMENT);
    }
    return ownedComments;
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
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.ORGANIZATION__NAME, oldName, name));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getQualifiedName()
  {
    // TODO: implement this method to return the 'Qualified Name' attribute
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyAssociation> getOwnedPropertyAssociations()
  {
    if (ownedPropertyAssociations == null)
    {
      ownedPropertyAssociations = new EObjectContainmentEList<PropertyAssociation>(PropertyAssociation.class, this, AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION);
    }
    return ownedPropertyAssociations;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Stakeholder> getStakeholder()
  {
    if (stakeholder == null)
    {
      stakeholder = new EObjectContainmentEList<Stakeholder>(Stakeholder.class, this, AlisaPackage.ORGANIZATION__STAKEHOLDER);
    }
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean has_no_qualified_name(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO: implement this method
    // -> specify the condition that violates the invariant
    // -> verify the details of the diagnostic, including severity and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Aadl2Validator.DIAGNOSTIC_SOURCE,
             Aadl2Validator.NAMED_ELEMENT__HAS_NO_QUALIFIED_NAME,
             EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "has_no_qualified_name", EObjectValidator.getObjectLabel(this, context) }),
             new Object [] { this }));
      }
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean has_qualified_name(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO: implement this method
    // -> specify the condition that violates the invariant
    // -> verify the details of the diagnostic, including severity and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Aadl2Validator.DIAGNOSTIC_SOURCE,
             Aadl2Validator.NAMED_ELEMENT__HAS_QUALIFIED_NAME,
             EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "has_qualified_name", EObjectValidator.getObjectLabel(this, context) }),
             new Object [] { this }));
      }
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Namespace getNamespace()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Namespace> allNamespaces()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean isDistinguishableFrom(NamedElement n, Namespace ns)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String separator()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String qualifiedName()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<PropertyExpression> getPropertyValues(String propertySetName, String propertyName)
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean not_own_self(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO: implement this method
    // -> specify the condition that violates the invariant
    // -> verify the details of the diagnostic, including severity and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Aadl2Validator.DIAGNOSTIC_SOURCE,
             Aadl2Validator.ELEMENT__NOT_OWN_SELF,
             EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "not_own_self", EObjectValidator.getObjectLabel(this, context) }),
             new Object [] { this }));
      }
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean has_owner(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    // TODO: implement this method
    // -> specify the condition that violates the invariant
    // -> verify the details of the diagnostic, including severity and message
    // Ensure that you remove @generated or mark it @generated NOT
    if (false)
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             Aadl2Validator.DIAGNOSTIC_SOURCE,
             Aadl2Validator.ELEMENT__HAS_OWNER,
             EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "has_owner", EObjectValidator.getObjectLabel(this, context) }),
             new Object [] { this }));
      }
      return false;
    }
    return true;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Element getOwner()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Element> allOwnedElements()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean mustBeOwned()
  {
    // TODO: implement this method
    // Ensure that you remove @generated or mark it @generated NOT
    throw new UnsupportedOperationException();
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
      case AlisaPackage.ORGANIZATION__OWNED_COMMENT:
        return ((InternalEList<?>)getOwnedComments()).basicRemove(otherEnd, msgs);
      case AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION:
        return ((InternalEList<?>)getOwnedPropertyAssociations()).basicRemove(otherEnd, msgs);
      case AlisaPackage.ORGANIZATION__STAKEHOLDER:
        return ((InternalEList<?>)getStakeholder()).basicRemove(otherEnd, msgs);
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
      case AlisaPackage.ORGANIZATION__OWNED_ELEMENT:
        return getOwnedElements();
      case AlisaPackage.ORGANIZATION__OWNED_COMMENT:
        return getOwnedComments();
      case AlisaPackage.ORGANIZATION__NAME:
        return getName();
      case AlisaPackage.ORGANIZATION__QUALIFIED_NAME:
        return getQualifiedName();
      case AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION:
        return getOwnedPropertyAssociations();
      case AlisaPackage.ORGANIZATION__STAKEHOLDER:
        return getStakeholder();
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
      case AlisaPackage.ORGANIZATION__OWNED_COMMENT:
        getOwnedComments().clear();
        getOwnedComments().addAll((Collection<? extends Comment>)newValue);
        return;
      case AlisaPackage.ORGANIZATION__NAME:
        setName((String)newValue);
        return;
      case AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION:
        getOwnedPropertyAssociations().clear();
        getOwnedPropertyAssociations().addAll((Collection<? extends PropertyAssociation>)newValue);
        return;
      case AlisaPackage.ORGANIZATION__STAKEHOLDER:
        getStakeholder().clear();
        getStakeholder().addAll((Collection<? extends Stakeholder>)newValue);
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
      case AlisaPackage.ORGANIZATION__OWNED_COMMENT:
        getOwnedComments().clear();
        return;
      case AlisaPackage.ORGANIZATION__NAME:
        setName(NAME_EDEFAULT);
        return;
      case AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION:
        getOwnedPropertyAssociations().clear();
        return;
      case AlisaPackage.ORGANIZATION__STAKEHOLDER:
        getStakeholder().clear();
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
      case AlisaPackage.ORGANIZATION__OWNED_ELEMENT:
        return !getOwnedElements().isEmpty();
      case AlisaPackage.ORGANIZATION__OWNED_COMMENT:
        return ownedComments != null && !ownedComments.isEmpty();
      case AlisaPackage.ORGANIZATION__NAME:
        return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
      case AlisaPackage.ORGANIZATION__QUALIFIED_NAME:
        return QUALIFIED_NAME_EDEFAULT == null ? getQualifiedName() != null : !QUALIFIED_NAME_EDEFAULT.equals(getQualifiedName());
      case AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION:
        return ownedPropertyAssociations != null && !ownedPropertyAssociations.isEmpty();
      case AlisaPackage.ORGANIZATION__STAKEHOLDER:
        return stakeholder != null && !stakeholder.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (derivedFeatureID)
      {
        case AlisaPackage.ORGANIZATION__OWNED_ELEMENT: return Aadl2Package.ELEMENT__OWNED_ELEMENT;
        case AlisaPackage.ORGANIZATION__OWNED_COMMENT: return Aadl2Package.ELEMENT__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (derivedFeatureID)
      {
        case AlisaPackage.ORGANIZATION__NAME: return Aadl2Package.NAMED_ELEMENT__NAME;
        case AlisaPackage.ORGANIZATION__QUALIFIED_NAME: return Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;
        case AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION: return Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;
        default: return -1;
      }
    }
    return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass)
  {
    if (baseClass == Element.class)
    {
      switch (baseFeatureID)
      {
        case Aadl2Package.ELEMENT__OWNED_ELEMENT: return AlisaPackage.ORGANIZATION__OWNED_ELEMENT;
        case Aadl2Package.ELEMENT__OWNED_COMMENT: return AlisaPackage.ORGANIZATION__OWNED_COMMENT;
        default: return -1;
      }
    }
    if (baseClass == NamedElement.class)
    {
      switch (baseFeatureID)
      {
        case Aadl2Package.NAMED_ELEMENT__NAME: return AlisaPackage.ORGANIZATION__NAME;
        case Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME: return AlisaPackage.ORGANIZATION__QUALIFIED_NAME;
        case Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION: return AlisaPackage.ORGANIZATION__OWNED_PROPERTY_ASSOCIATION;
        default: return -1;
      }
    }
    return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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

} //OrganizationImpl
