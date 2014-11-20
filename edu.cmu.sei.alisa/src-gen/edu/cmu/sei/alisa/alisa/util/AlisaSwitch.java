/**
 */
package edu.cmu.sei.alisa.alisa.util;

import edu.cmu.sei.alisa.alisa.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import org.osate.aadl2.Element;
import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage
 * @generated
 */
public class AlisaSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlisaPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = AlisaPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @parameter ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case AlisaPackage.ALISA_MODEL:
      {
        AlisaModel alisaModel = (AlisaModel)theEObject;
        T result = caseAlisaModel(alisaModel);
        if (result == null) result = caseNamedElement(alisaModel);
        if (result == null) result = caseElement(alisaModel);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.RSAL_CONTAINER:
      {
        RSALContainer rsalContainer = (RSALContainer)theEObject;
        T result = caseRSALContainer(rsalContainer);
        if (result == null) result = caseAlisaModel(rsalContainer);
        if (result == null) result = caseRSALElement(rsalContainer);
        if (result == null) result = caseNamedElement(rsalContainer);
        if (result == null) result = caseElement(rsalContainer);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.RSAL_ELEMENT:
      {
        RSALElement rsalElement = (RSALElement)theEObject;
        T result = caseRSALElement(rsalElement);
        if (result == null) result = caseNamedElement(rsalElement);
        if (result == null) result = caseElement(rsalElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.ORGANIZATION:
      {
        Organization organization = (Organization)theEObject;
        T result = caseOrganization(organization);
        if (result == null) result = caseAlisaModel(organization);
        if (result == null) result = caseNamedElement(organization);
        if (result == null) result = caseElement(organization);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.CONTRACTUAL_ELEMENT:
      {
        ContractualElement contractualElement = (ContractualElement)theEObject;
        T result = caseContractualElement(contractualElement);
        if (result == null) result = caseNamedElement(contractualElement);
        if (result == null) result = caseElement(contractualElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = caseRSALElement(goal);
        if (result == null) result = caseContractualElement(goal);
        if (result == null) result = caseNamedElement(goal);
        if (result == null) result = caseElement(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = caseRSALElement(requirement);
        if (result == null) result = caseContractualElement(requirement);
        if (result == null) result = caseNamedElement(requirement);
        if (result == null) result = caseElement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.EXTERNAL_DOCUMENT:
      {
        ExternalDocument externalDocument = (ExternalDocument)theEObject;
        T result = caseExternalDocument(externalDocument);
        if (result == null) result = caseRSALElement(externalDocument);
        if (result == null) result = caseNamedElement(externalDocument);
        if (result == null) result = caseElement(externalDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.XDOC_URI:
      {
        XDocUri xDocUri = (XDocUri)theEObject;
        T result = caseXDocUri(xDocUri);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = caseRSALElement(category);
        if (result == null) result = caseNamedElement(category);
        if (result == null) result = caseElement(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.STAKEHOLDER:
      {
        Stakeholder stakeholder = (Stakeholder)theEObject;
        T result = caseStakeholder(stakeholder);
        if (result == null) result = caseRSALElement(stakeholder);
        if (result == null) result = caseNamedElement(stakeholder);
        if (result == null) result = caseElement(stakeholder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.VERIFICATION_DECOMPOSITION:
      {
        VerificationDecomposition verificationDecomposition = (VerificationDecomposition)theEObject;
        T result = caseVerificationDecomposition(verificationDecomposition);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.VERIFICATION_ACTIVITY:
      {
        VerificationActivity verificationActivity = (VerificationActivity)theEObject;
        T result = caseVerificationActivity(verificationActivity);
        if (result == null) result = caseRSALElement(verificationActivity);
        if (result == null) result = caseNamedElement(verificationActivity);
        if (result == null) result = caseElement(verificationActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.VERIFICATION_RESULT:
      {
        VerificationResult verificationResult = (VerificationResult)theEObject;
        T result = caseVerificationResult(verificationResult);
        if (result == null) result = caseNamedElement(verificationResult);
        if (result == null) result = caseElement(verificationResult);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlisaModel(AlisaModel object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RSAL Container</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RSAL Container</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRSALContainer(RSALContainer object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RSAL Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RSAL Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRSALElement(RSALElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Organization</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Organization</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrganization(Organization object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Contractual Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Contractual Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseContractualElement(ContractualElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoal(Goal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirement(Requirement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>External Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalDocument(ExternalDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>XDoc Uri</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>XDoc Uri</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseXDocUri(XDocUri object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Category</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Category</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseCategory(Category object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Stakeholder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseStakeholder(Stakeholder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verification Decomposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verification Decomposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerificationDecomposition(VerificationDecomposition object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verification Activity</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verification Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerificationActivity(VerificationActivity object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verification Result</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verification Result</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerificationResult(VerificationResult object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElement(Element object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseNamedElement(NamedElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //AlisaSwitch
