/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.alisa.RSALElement;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;
import edu.cmu.sei.alisa.alisa.VerificationResult;
import edu.cmu.sei.alisa.alisa.VerificationResultState;
import edu.cmu.sei.alisa.alisa.VerificationResultStatus;
import edu.cmu.sei.alisa.alisa.XDocUri;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.osate.aadl2.Aadl2Package;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class AlisaPackageImpl extends EPackageImpl implements AlisaPackage
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alisaModelEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rsalContainerEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rsalElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass organizationEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass contractualElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass externalDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass xDocUriEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass categoryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass stakeholderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationDecompositionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationActivityEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationResultEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum verificationResultStateEEnum = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EEnum verificationResultStatusEEnum = null;

  /**
   * Creates an instance of the model <b>Package</b>, registered with
   * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
   * package URI value.
   * <p>Note: the correct way to create the package is via the static
   * factory method {@link #init init()}, which also performs
   * initialization of the package, or returns the registered package,
   * if one already exists.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.eclipse.emf.ecore.EPackage.Registry
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#eNS_URI
   * @see #init()
   * @generated
   */
  private AlisaPackageImpl()
  {
    super(eNS_URI, AlisaFactory.eINSTANCE);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private static boolean isInited = false;

  /**
   * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
   * 
   * <p>This method is used to initialize {@link AlisaPackage#eINSTANCE} when that field is accessed.
   * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #eNS_URI
   * @see #createPackageContents()
   * @see #initializePackageContents()
   * @generated
   */
  public static AlisaPackage init()
  {
    if (isInited) return (AlisaPackage)EPackage.Registry.INSTANCE.getEPackage(AlisaPackage.eNS_URI);

    // Obtain or create and register package
    AlisaPackageImpl theAlisaPackage = (AlisaPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof AlisaPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new AlisaPackageImpl());

    isInited = true;

    // Initialize simple dependencies
    Aadl2Package.eINSTANCE.eClass();

    // Create package meta-data objects
    theAlisaPackage.createPackageContents();

    // Initialize created meta-data
    theAlisaPackage.initializePackageContents();

    // Mark meta-data to indicate it can't be changed
    theAlisaPackage.freeze();

  
    // Update the registry and return the package
    EPackage.Registry.INSTANCE.put(AlisaPackage.eNS_URI, theAlisaPackage);
    return theAlisaPackage;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlisaModel()
  {
    return alisaModelEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRSALContainer()
  {
    return rsalContainerEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRSALContainer_ImportedNamespace()
  {
    return (EReference)rsalContainerEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRSALContainer_Content()
  {
    return (EReference)rsalContainerEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRSALContainer_Issue()
  {
    return (EAttribute)rsalContainerEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRSALElement()
  {
    return rsalElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOrganization()
  {
    return organizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_Stakeholder()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getContractualElement()
  {
    return contractualElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_Target()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_Category()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractualElement_Title()
  {
    return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractualElement_Description()
  {
    return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractualElement_Assert()
  {
    return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractualElement_Rationale()
  {
    return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getContractualElement_Issue()
  {
    return (EAttribute)contractualElementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_SectionReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_RefinesReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_DecomposesReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_EvolvesReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_ConflictsReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_StakeholderReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_StakeholderRequirementReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_SystemRequirementReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getContractualElement_DocReference()
  {
    return (EReference)contractualElementEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoal()
  {
    return goalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirement()
  {
    return requirementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_GoalReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_HazardReference()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_VerifiedBy()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalDocument()
  {
    return externalDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalDocument_ExternalReference()
  {
    return (EAttribute)externalDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getXDocUri()
  {
    return xDocUriEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getXDocUri_DocReference()
  {
    return (EReference)xDocUriEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getXDocUri_DocFragment()
  {
    return (EAttribute)xDocUriEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getCategory()
  {
    return categoryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_Extends()
  {
    return (EReference)categoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getStakeholder()
  {
    return stakeholderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Title()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Description()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Role()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Organziation()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Email()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Phone()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationDecomposition()
  {
    return verificationDecompositionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationDecomposition_Element()
  {
    return (EReference)verificationDecompositionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationDecomposition_Left()
  {
    return (EReference)verificationDecompositionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationDecomposition_Type()
  {
    return (EAttribute)verificationDecompositionEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationDecomposition_Right()
  {
    return (EReference)verificationDecompositionEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationActivity()
  {
    return verificationActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationActivity_Title()
  {
    return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationActivity_Description()
  {
    return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationActivity_Method()
  {
    return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationActivity_DecomposedTo()
  {
    return (EReference)verificationActivityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationActivity_AssignedTo()
  {
    return (EReference)verificationActivityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationResult()
  {
    return verificationResultEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationResult_ReferencedVerificationMethod()
  {
    return (EReference)verificationResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Title()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Description()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Method()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_State()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Status()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVerificationResultState()
  {
    return verificationResultStateEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EEnum getVerificationResultStatus()
  {
    return verificationResultStatusEEnum;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaFactory getAlisaFactory()
  {
    return (AlisaFactory)getEFactoryInstance();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isCreated = false;

  /**
   * Creates the meta-model objects for the package.  This method is
   * guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void createPackageContents()
  {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    alisaModelEClass = createEClass(ALISA_MODEL);

    rsalContainerEClass = createEClass(RSAL_CONTAINER);
    createEReference(rsalContainerEClass, RSAL_CONTAINER__IMPORTED_NAMESPACE);
    createEReference(rsalContainerEClass, RSAL_CONTAINER__CONTENT);
    createEAttribute(rsalContainerEClass, RSAL_CONTAINER__ISSUE);

    rsalElementEClass = createEClass(RSAL_ELEMENT);

    organizationEClass = createEClass(ORGANIZATION);
    createEReference(organizationEClass, ORGANIZATION__STAKEHOLDER);

    contractualElementEClass = createEClass(CONTRACTUAL_ELEMENT);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__TARGET);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__CATEGORY);
    createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__TITLE);
    createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__DESCRIPTION);
    createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__ASSERT);
    createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__RATIONALE);
    createEAttribute(contractualElementEClass, CONTRACTUAL_ELEMENT__ISSUE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__SECTION_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__REFINES_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__DECOMPOSES_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__EVOLVES_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__CONFLICTS_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__STAKEHOLDER_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__STAKEHOLDER_REQUIREMENT_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__SYSTEM_REQUIREMENT_REFERENCE);
    createEReference(contractualElementEClass, CONTRACTUAL_ELEMENT__DOC_REFERENCE);

    goalEClass = createEClass(GOAL);

    requirementEClass = createEClass(REQUIREMENT);
    createEReference(requirementEClass, REQUIREMENT__GOAL_REFERENCE);
    createEAttribute(requirementEClass, REQUIREMENT__HAZARD_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__VERIFIED_BY);

    externalDocumentEClass = createEClass(EXTERNAL_DOCUMENT);
    createEAttribute(externalDocumentEClass, EXTERNAL_DOCUMENT__EXTERNAL_REFERENCE);

    xDocUriEClass = createEClass(XDOC_URI);
    createEReference(xDocUriEClass, XDOC_URI__DOC_REFERENCE);
    createEAttribute(xDocUriEClass, XDOC_URI__DOC_FRAGMENT);

    categoryEClass = createEClass(CATEGORY);
    createEReference(categoryEClass, CATEGORY__EXTENDS);

    stakeholderEClass = createEClass(STAKEHOLDER);
    createEAttribute(stakeholderEClass, STAKEHOLDER__TITLE);
    createEAttribute(stakeholderEClass, STAKEHOLDER__DESCRIPTION);
    createEAttribute(stakeholderEClass, STAKEHOLDER__ROLE);
    createEAttribute(stakeholderEClass, STAKEHOLDER__ORGANZIATION);
    createEAttribute(stakeholderEClass, STAKEHOLDER__EMAIL);
    createEAttribute(stakeholderEClass, STAKEHOLDER__PHONE);

    verificationDecompositionEClass = createEClass(VERIFICATION_DECOMPOSITION);
    createEReference(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__ELEMENT);
    createEReference(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__LEFT);
    createEAttribute(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__TYPE);
    createEReference(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__RIGHT);

    verificationActivityEClass = createEClass(VERIFICATION_ACTIVITY);
    createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__TITLE);
    createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__DESCRIPTION);
    createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__METHOD);
    createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__DECOMPOSED_TO);
    createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__ASSIGNED_TO);

    verificationResultEClass = createEClass(VERIFICATION_RESULT);
    createEReference(verificationResultEClass, VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD);
    createEAttribute(verificationResultEClass, VERIFICATION_RESULT__TITLE);
    createEAttribute(verificationResultEClass, VERIFICATION_RESULT__DESCRIPTION);
    createEAttribute(verificationResultEClass, VERIFICATION_RESULT__METHOD);
    createEAttribute(verificationResultEClass, VERIFICATION_RESULT__STATE);
    createEAttribute(verificationResultEClass, VERIFICATION_RESULT__STATUS);

    // Create enums
    verificationResultStateEEnum = createEEnum(VERIFICATION_RESULT_STATE);
    verificationResultStatusEEnum = createEEnum(VERIFICATION_RESULT_STATUS);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private boolean isInitialized = false;

  /**
   * Complete the initialization of the package and its meta-model.  This
   * method is guarded to have no affect on any invocation but its first.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void initializePackageContents()
  {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    alisaModelEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    rsalContainerEClass.getESuperTypes().add(this.getAlisaModel());
    rsalContainerEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    rsalContainerEClass.getESuperTypes().add(this.getRSALElement());
    rsalElementEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    organizationEClass.getESuperTypes().add(this.getAlisaModel());
    organizationEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    contractualElementEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    contractualElementEClass.getESuperTypes().add(this.getRSALElement());
    goalEClass.getESuperTypes().add(this.getRSALElement());
    goalEClass.getESuperTypes().add(this.getContractualElement());
    requirementEClass.getESuperTypes().add(this.getRSALElement());
    requirementEClass.getESuperTypes().add(this.getContractualElement());
    externalDocumentEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    externalDocumentEClass.getESuperTypes().add(this.getRSALElement());
    categoryEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    categoryEClass.getESuperTypes().add(this.getRSALElement());
    stakeholderEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    stakeholderEClass.getESuperTypes().add(this.getRSALElement());
    verificationActivityEClass.getESuperTypes().add(theAadl2Package.getNamedElement());
    verificationActivityEClass.getESuperTypes().add(this.getRSALElement());
    verificationResultEClass.getESuperTypes().add(theAadl2Package.getNamedElement());

    // Initialize classes and features; add operations and parameters
    initEClass(alisaModelEClass, AlisaModel.class, "AlisaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(rsalContainerEClass, RSALContainer.class, "RSALContainer", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRSALContainer_ImportedNamespace(), theAadl2Package.getNamedElement(), null, "importedNamespace", null, 0, -1, RSALContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRSALContainer_Content(), this.getRSALElement(), null, "content", null, 0, -1, RSALContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRSALContainer_Issue(), theEcorePackage.getEString(), "issue", null, 0, -1, RSALContainer.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rsalElementEClass, RSALElement.class, "RSALElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getOrganization_Stakeholder(), this.getStakeholder(), null, "stakeholder", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(contractualElementEClass, ContractualElement.class, "ContractualElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getContractualElement_Target(), theAadl2Package.getNamedElement(), null, "target", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_Category(), this.getCategory(), null, "category", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractualElement_Title(), theEcorePackage.getEString(), "title", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractualElement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractualElement_Assert(), theEcorePackage.getEString(), "assert", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractualElement_Rationale(), theEcorePackage.getEString(), "rationale", null, 0, 1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getContractualElement_Issue(), theEcorePackage.getEString(), "issue", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_SectionReference(), this.getRSALContainer(), null, "sectionReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_RefinesReference(), this.getContractualElement(), null, "refinesReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_DecomposesReference(), this.getContractualElement(), null, "decomposesReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_EvolvesReference(), this.getContractualElement(), null, "evolvesReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_ConflictsReference(), this.getContractualElement(), null, "conflictsReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_StakeholderReference(), this.getStakeholder(), null, "stakeholderReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_StakeholderRequirementReference(), this.getContractualElement(), null, "stakeholderRequirementReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_SystemRequirementReference(), this.getContractualElement(), null, "systemRequirementReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getContractualElement_DocReference(), this.getXDocUri(), null, "docReference", null, 0, -1, ContractualElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getRequirement_GoalReference(), this.getGoal(), null, "goalReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_HazardReference(), theEcorePackage.getEString(), "hazardReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_VerifiedBy(), this.getVerificationDecomposition(), null, "verifiedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalDocumentEClass, ExternalDocument.class, "ExternalDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalDocument_ExternalReference(), theEcorePackage.getEString(), "externalReference", null, 0, 1, ExternalDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xDocUriEClass, XDocUri.class, "XDocUri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXDocUri_DocReference(), this.getExternalDocument(), null, "docReference", null, 0, 1, XDocUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXDocUri_DocFragment(), theEcorePackage.getEString(), "docFragment", null, 0, 1, XDocUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getCategory_Extends(), this.getCategory(), null, "extends", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStakeholder_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Role(), theEcorePackage.getEString(), "role", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Organziation(), theEcorePackage.getEString(), "organziation", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Email(), theEcorePackage.getEString(), "email", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Phone(), theEcorePackage.getEString(), "phone", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationDecompositionEClass, VerificationDecomposition.class, "VerificationDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerificationDecomposition_Element(), this.getVerificationActivity(), null, "element", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationDecomposition_Left(), this.getVerificationActivity(), null, "left", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationDecomposition_Type(), theEcorePackage.getEString(), "type", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationDecomposition_Right(), this.getVerificationDecomposition(), null, "right", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationActivityEClass, VerificationActivity.class, "VerificationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVerificationActivity_Title(), theEcorePackage.getEString(), "title", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationActivity_Description(), theEcorePackage.getEString(), "description", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationActivity_Method(), theEcorePackage.getEString(), "method", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationActivity_DecomposedTo(), this.getVerificationDecomposition(), null, "decomposedTo", null, 0, -1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationActivity_AssignedTo(), this.getStakeholder(), null, "assignedTo", null, 0, -1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationResultEClass, VerificationResult.class, "VerificationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerificationResult_ReferencedVerificationMethod(), this.getVerificationActivity(), null, "referencedVerificationMethod", null, 0, -1, VerificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationResult_Title(), theEcorePackage.getEString(), "title", null, 0, 1, VerificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationResult_Description(), theEcorePackage.getEString(), "description", null, 0, 1, VerificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationResult_Method(), theEcorePackage.getEString(), "method", null, 0, 1, VerificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationResult_State(), this.getVerificationResultState(), "state", null, 0, 1, VerificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationResult_Status(), this.getVerificationResultStatus(), "status", null, 0, 1, VerificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    // Initialize enums and add enum literals
    initEEnum(verificationResultStateEEnum, VerificationResultState.class, "VerificationResultState");
    addEEnumLiteral(verificationResultStateEEnum, VerificationResultState.SCHEDULED);
    addEEnumLiteral(verificationResultStateEEnum, VerificationResultState.COMPLETED);
    addEEnumLiteral(verificationResultStateEEnum, VerificationResultState.INPROGRESS);

    initEEnum(verificationResultStatusEEnum, VerificationResultStatus.class, "VerificationResultStatus");
    addEEnumLiteral(verificationResultStatusEEnum, VerificationResultStatus.PASS);
    addEEnumLiteral(verificationResultStatusEEnum, VerificationResultStatus.FAIL);
    addEEnumLiteral(verificationResultStatusEEnum, VerificationResultStatus.UNKNOWN);

    // Create resource
    createResource(eNS_URI);
  }

} //AlisaPackageImpl
