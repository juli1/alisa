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
      case AlisaPackage.DOCUMENT: return createDocument();
      case AlisaPackage.REQUIREMENT_DOCUMENT: return createRequirementDocument();
      case AlisaPackage.VERIFICATION_LIBRARY: return createVerificationLibrary();
      case AlisaPackage.GOALS: return createGoals();
      case AlisaPackage.GOAL: return createGoal();
      case AlisaPackage.REQ_SPECIFICATIONS: return createReqSpecifications();
      case AlisaPackage.REQ_SPEC: return createReqSpec();
      case AlisaPackage.EXTERNAL_DOCUMENTS: return createExternalDocuments();
      case AlisaPackage.EXTERNAL_DOCUMENT: return createExternalDocument();
      case AlisaPackage.ALIASES: return createAliases();
      case AlisaPackage.ALIAS: return createAlias();
      case AlisaPackage.NOTES: return createNotes();
      case AlisaPackage.STAKEHOLDER: return createStakeholder();
      case AlisaPackage.STAKEHOLDERS: return createStakeholders();
      case AlisaPackage.DOCUMENTED_REQUIREMENT: return createDocumentedRequirement();
      case AlisaPackage.DOCUMENTED_REQUIREMENT_DECOMPOSITION: return createDocumentedRequirementDecomposition();
      case AlisaPackage.VERIFICATION_DECOMPOSITION: return createVerificationDecomposition();
      case AlisaPackage.ELEMENT_TYPE: return createElementType();
      case AlisaPackage.ELEMENT_REFERENCE: return createElementReference();
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
  public Document createDocument()
  {
    DocumentImpl document = new DocumentImpl();
    return document;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public RequirementDocument createRequirementDocument()
  {
    RequirementDocumentImpl requirementDocument = new RequirementDocumentImpl();
    return requirementDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public VerificationLibrary createVerificationLibrary()
  {
    VerificationLibraryImpl verificationLibrary = new VerificationLibraryImpl();
    return verificationLibrary;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goals createGoals()
  {
    GoalsImpl goals = new GoalsImpl();
    return goals;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Goal createGoal()
  {
    GoalImpl goal = new GoalImpl();
    return goal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpecifications createReqSpecifications()
  {
    ReqSpecificationsImpl reqSpecifications = new ReqSpecificationsImpl();
    return reqSpecifications;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ReqSpec createReqSpec()
  {
    ReqSpecImpl reqSpec = new ReqSpecImpl();
    return reqSpec;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDocuments createExternalDocuments()
  {
    ExternalDocumentsImpl externalDocuments = new ExternalDocumentsImpl();
    return externalDocuments;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public ExternalDocument createExternalDocument()
  {
    ExternalDocumentImpl externalDocument = new ExternalDocumentImpl();
    return externalDocument;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Aliases createAliases()
  {
    AliasesImpl aliases = new AliasesImpl();
    return aliases;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Alias createAlias()
  {
    AliasImpl alias = new AliasImpl();
    return alias;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Notes createNotes()
  {
    NotesImpl notes = new NotesImpl();
    return notes;
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
  public Stakeholders createStakeholders()
  {
    StakeholdersImpl stakeholders = new StakeholdersImpl();
    return stakeholders;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentedRequirement createDocumentedRequirement()
  {
    DocumentedRequirementImpl documentedRequirement = new DocumentedRequirementImpl();
    return documentedRequirement;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public DocumentedRequirementDecomposition createDocumentedRequirementDecomposition()
  {
    DocumentedRequirementDecompositionImpl documentedRequirementDecomposition = new DocumentedRequirementDecompositionImpl();
    return documentedRequirementDecomposition;
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
  public ElementReference createElementReference()
  {
    ElementReferenceImpl elementReference = new ElementReferenceImpl();
    return elementReference;
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
