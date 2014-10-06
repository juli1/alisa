/**
 */
package edu.cmu.sei.alisa.alisa.util;

import edu.cmu.sei.alisa.alisa.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

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
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.CONTRACTUAL_ELEMENT:
      {
        ContractualElement contractualElement = (ContractualElement)theEObject;
        T result = caseContractualElement(contractualElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.ALISA_DOCUMENT:
      {
        AlisaDocument alisaDocument = (AlisaDocument)theEObject;
        T result = caseAlisaDocument(alisaDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.ALISA_ELEMENT:
      {
        AlisaElement alisaElement = (AlisaElement)theEObject;
        T result = caseAlisaElement(alisaElement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.ALISA_NAME_SPACE:
      {
        AlisaNameSpace alisaNameSpace = (AlisaNameSpace)theEObject;
        T result = caseAlisaNameSpace(alisaNameSpace);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.REQUIREMENT_DOCUMENT:
      {
        RequirementDocument requirementDocument = (RequirementDocument)theEObject;
        T result = caseRequirementDocument(requirementDocument);
        if (result == null) result = caseAlisaModel(requirementDocument);
        if (result == null) result = caseAlisaDocument(requirementDocument);
        if (result == null) result = caseAlisaElement(requirementDocument);
        if (result == null) result = caseAlisaNameSpace(requirementDocument);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.VERIFICATION_LIBRARY:
      {
        VerificationLibrary verificationLibrary = (VerificationLibrary)theEObject;
        T result = caseVerificationLibrary(verificationLibrary);
        if (result == null) result = caseAlisaModel(verificationLibrary);
        if (result == null) result = caseAlisaElement(verificationLibrary);
        if (result == null) result = caseAlisaNameSpace(verificationLibrary);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.RDA_PACKAGE:
      {
        RDAPackage rdaPackage = (RDAPackage)theEObject;
        T result = caseRDAPackage(rdaPackage);
        if (result == null) result = caseAlisaModel(rdaPackage);
        if (result == null) result = caseAlisaDocument(rdaPackage);
        if (result == null) result = caseAlisaElement(rdaPackage);
        if (result == null) result = caseAlisaNameSpace(rdaPackage);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.GOALS:
      {
        Goals goals = (Goals)theEObject;
        T result = caseGoals(goals);
        if (result == null) result = caseAlisaElement(goals);
        if (result == null) result = caseAlisaNameSpace(goals);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.GOAL:
      {
        Goal goal = (Goal)theEObject;
        T result = caseGoal(goal);
        if (result == null) result = caseContractualElement(goal);
        if (result == null) result = caseAlisaElement(goal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.REQUIREMENTS:
      {
        Requirements requirements = (Requirements)theEObject;
        T result = caseRequirements(requirements);
        if (result == null) result = caseAlisaElement(requirements);
        if (result == null) result = caseAlisaNameSpace(requirements);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = caseContractualElement(requirement);
        if (result == null) result = caseAlisaElement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.EXTERNAL_DOCUMENTS:
      {
        ExternalDocuments externalDocuments = (ExternalDocuments)theEObject;
        T result = caseExternalDocuments(externalDocuments);
        if (result == null) result = caseAlisaModel(externalDocuments);
        if (result == null) result = caseAlisaElement(externalDocuments);
        if (result == null) result = caseAlisaNameSpace(externalDocuments);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.EXTERNAL_DOCUMENT:
      {
        ExternalDocument externalDocument = (ExternalDocument)theEObject;
        T result = caseExternalDocument(externalDocument);
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
      case AlisaPackage.ALISA_CONFIGURATION:
      {
        AlisaConfiguration alisaConfiguration = (AlisaConfiguration)theEObject;
        T result = caseAlisaConfiguration(alisaConfiguration);
        if (result == null) result = caseAlisaModel(alisaConfiguration);
        if (result == null) result = caseAlisaElement(alisaConfiguration);
        if (result == null) result = caseAlisaNameSpace(alisaConfiguration);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.CATEGORY:
      {
        Category category = (Category)theEObject;
        T result = caseCategory(category);
        if (result == null) result = caseAlisaElement(category);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.STAKEHOLDER:
      {
        Stakeholder stakeholder = (Stakeholder)theEObject;
        T result = caseStakeholder(stakeholder);
        if (result == null) result = caseAlisaElement(stakeholder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.ORGANIZATION:
      {
        Organization organization = (Organization)theEObject;
        T result = caseOrganization(organization);
        if (result == null) result = caseAlisaModel(organization);
        if (result == null) result = caseAlisaElement(organization);
        if (result == null) result = caseAlisaNameSpace(organization);
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
        if (result == null) result = caseAlisaElement(verificationActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.VERIFICATION_RESULT:
      {
        VerificationResult verificationResult = (VerificationResult)theEObject;
        T result = caseVerificationResult(verificationResult);
        if (result == null) result = caseAlisaElement(verificationResult);
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
   * Returns the result of interpreting the object as an instance of '<em>Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlisaDocument(AlisaDocument object)
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
  public T caseAlisaElement(AlisaElement object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Name Space</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Name Space</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlisaNameSpace(AlisaNameSpace object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Requirement Document</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementDocument(RequirementDocument object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Verification Library</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Verification Library</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseVerificationLibrary(VerificationLibrary object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>RDA Package</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>RDA Package</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRDAPackage(RDAPackage object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Goals</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Goals</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseGoals(Goals object)
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
   * Returns the result of interpreting the object as an instance of '<em>Requirements</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirements</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirements(Requirements object)
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
   * Returns the result of interpreting the object as an instance of '<em>External Documents</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>External Documents</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseExternalDocuments(ExternalDocuments object)
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
   * Returns the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Configuration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAlisaConfiguration(AlisaConfiguration object)
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
