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
      case AlisaPackage.STAKEHOLDER:
      {
        Stakeholder stakeholder = (Stakeholder)theEObject;
        T result = caseStakeholder(stakeholder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.REQUIREMENT:
      {
        Requirement requirement = (Requirement)theEObject;
        T result = caseRequirement(requirement);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.REQUIREMENT_DECOMPOSITION:
      {
        RequirementDecomposition requirementDecomposition = (RequirementDecomposition)theEObject;
        T result = caseRequirementDecomposition(requirementDecomposition);
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
      case AlisaPackage.ELEMENT_TYPE:
      {
        ElementType elementType = (ElementType)theEObject;
        T result = caseElementType(elementType);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.VERIFICATION_ACTIVITY:
      {
        VerificationActivity verificationActivity = (VerificationActivity)theEObject;
        T result = caseVerificationActivity(verificationActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case AlisaPackage.VERIFICATION_RESULT:
      {
        VerificationResult verificationResult = (VerificationResult)theEObject;
        T result = caseVerificationResult(verificationResult);
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
   * Returns the result of interpreting the object as an instance of '<em>Requirement Decomposition</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Requirement Decomposition</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseRequirementDecomposition(RequirementDecomposition object)
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
   * Returns the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Element Type</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseElementType(ElementType object)
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
