/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlisaFactoryImpl extends EFactoryImpl implements AlisaFactory
{
  /**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static AlisaFactory init()
  {
    try
    {
      AlisaFactory theAlisaFactory = (AlisaFactory)EPackage.Registry.INSTANCE.getEFactory(AlisaPackage.eNS_URI);
      if (theAlisaFactory != null)
      {
        return theAlisaFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new AlisaFactoryImpl();
  }

  /**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaFactoryImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public EObject create(EClass eClass)
  {
    switch (eClass.getClassifierID())
    {
      case AlisaPackage.ALISA_MODEL: return createAlisaModel();
      case AlisaPackage.STAKEHOLDER: return createStakeholder();
      case AlisaPackage.REQUIREMENT: return createRequirement();
      case AlisaPackage.REQUIREMENT_DECOMPOSITION: return createRequirementDecomposition();
      case AlisaPackage.VERIFICATION_DECOMPOSITION: return createVerificationDecomposition();
      case AlisaPackage.ELEMENT_TYPE: return createElementType();
      case AlisaPackage.VERIFICATION_ACTIVITY: return createVerificationActivity();
      case AlisaPackage.VERIFICATION_RESULT: return createVerificationResult();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaModel createAlisaModel()
  {
    AlisaModelImpl alisaModel = new AlisaModelImpl();
    return alisaModel;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Stakeholder createStakeholder()
  {
    StakeholderImpl stakeholder = new StakeholderImpl();
    return stakeholder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Requirement createRequirement()
  {
    RequirementImpl requirement = new RequirementImpl();
    return requirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementDecomposition createRequirementDecomposition()
  {
    RequirementDecompositionImpl requirementDecomposition = new RequirementDecompositionImpl();
    return requirementDecomposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationDecomposition createVerificationDecomposition()
  {
    VerificationDecompositionImpl verificationDecomposition = new VerificationDecompositionImpl();
    return verificationDecomposition;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ElementType createElementType()
  {
    ElementTypeImpl elementType = new ElementTypeImpl();
    return elementType;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationActivity createVerificationActivity()
  {
    VerificationActivityImpl verificationActivity = new VerificationActivityImpl();
    return verificationActivity;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationResult createVerificationResult()
  {
    VerificationResultImpl verificationResult = new VerificationResultImpl();
    return verificationResult;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaPackage getAlisaPackage()
  {
    return (AlisaPackage)getEPackage();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
  @Deprecated
  public static AlisaPackage getPackage()
  {
    return AlisaPackage.eINSTANCE;
  }

} //AlisaFactoryImpl
