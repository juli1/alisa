/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaConfiguration;
import edu.cmu.sei.alisa.alisa.AlisaDocument;
import edu.cmu.sei.alisa.alisa.AlisaElement;
import edu.cmu.sei.alisa.alisa.AlisaFactory;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.AlisaNameSpace;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.DocumentSection;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Goals;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.RDAPackage;
import edu.cmu.sei.alisa.alisa.ReqDocContent;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDocument;
import edu.cmu.sei.alisa.alisa.Requirements;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;
import edu.cmu.sei.alisa.alisa.VerificationLibrary;
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
  private EClass contractualElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reqDocContentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alisaDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alisaElementEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass alisaNameSpaceEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass requirementDocumentEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass documentSectionEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass verificationLibraryEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass rdaPackageEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass goalsEClass = null;

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
  private EClass requirementsEClass = null;

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
  private EClass externalDocumentsEClass = null;

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
  private EClass alisaConfigurationEClass = null;

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
  private EClass organizationEClass = null;

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
  public EClass getContractualElement()
  {
    return contractualElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReqDocContent()
  {
    return reqDocContentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlisaDocument()
  {
    return alisaDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlisaElement()
  {
    return alisaElementEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getAlisaNameSpace()
  {
    return alisaNameSpaceEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirementDocument()
  {
    return requirementDocumentEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirementDocument_Name()
  {
    return (EAttribute)requirementDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirementDocument_Content()
  {
    return (EReference)requirementDocumentEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getDocumentSection()
  {
    return documentSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getDocumentSection_Name()
  {
    return (EAttribute)documentSectionEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getDocumentSection_Content()
  {
    return (EReference)documentSectionEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getVerificationLibrary()
  {
    return verificationLibraryEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationLibrary_Name()
  {
    return (EAttribute)verificationLibraryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationLibrary_Content()
  {
    return (EReference)verificationLibraryEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRDAPackage()
  {
    return rdaPackageEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRDAPackage_Name()
  {
    return (EAttribute)rdaPackageEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDAPackage_ImportedNamespace()
  {
    return (EReference)rdaPackageEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRDAPackage_Content()
  {
    return (EReference)rdaPackageEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getGoals()
  {
    return goalsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoals_Name()
  {
    return (EAttribute)goalsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoals_Target()
  {
    return (EReference)goalsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoals_Goals()
  {
    return (EReference)goalsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoals_Issue()
  {
    return (EAttribute)goalsEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getGoal_Name()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Target()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_Category()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Title()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Description()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Assert()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Rationale()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_Issue()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getGoal_ModelReference()
  {
    return (EAttribute)goalEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_RefinesReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_DecomposesReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_EvolvesReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_ConflictsReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_StakeholderReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_StakeholderRequirementReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_SystemRequirementReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getGoal_DocReference()
  {
    return (EReference)goalEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getRequirements()
  {
    return requirementsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirements_Name()
  {
    return (EAttribute)requirementsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirements_Target()
  {
    return (EReference)requirementsEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirements_Reqs()
  {
    return (EReference)requirementsEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirements_Issue()
  {
    return (EAttribute)requirementsEClass.getEStructuralFeatures().get(3);
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
  public EAttribute getRequirement_Name()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Target()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_Category()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Title()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Description()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Assert()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Rationale()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(6);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_Issue()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(7);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_ModelReference()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(8);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_GoalReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(9);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getRequirement_HazardReference()
  {
    return (EAttribute)requirementEClass.getEStructuralFeatures().get(10);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_RefinesReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(11);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_DecomposesReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(12);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_EvolvesReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(13);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_VerifiedBy()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(14);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_StakeholderRequirementReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(15);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_SystemRequirementReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(16);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getRequirement_DocReference()
  {
    return (EReference)requirementEClass.getEStructuralFeatures().get(17);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getExternalDocuments()
  {
    return externalDocumentsEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalDocuments_Name()
  {
    return (EAttribute)externalDocumentsEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getExternalDocuments_Docs()
  {
    return (EReference)externalDocumentsEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getExternalDocument_Name()
  {
    return (EAttribute)externalDocumentEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getExternalDocument_ExternalReference()
  {
    return (EAttribute)externalDocumentEClass.getEStructuralFeatures().get(1);
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
  public EReference getXDocUri_DocPath()
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
  public EClass getAlisaConfiguration()
  {
    return alisaConfigurationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getAlisaConfiguration_Name()
  {
    return (EAttribute)alisaConfigurationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getAlisaConfiguration_Category()
  {
    return (EReference)alisaConfigurationEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getCategory_Name()
  {
    return (EAttribute)categoryEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getCategory_Extends()
  {
    return (EReference)categoryEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getStakeholder_Name()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Title()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Description()
  {
    return (EAttribute)stakeholderEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getStakeholder_Role()
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
  public EClass getOrganization()
  {
    return organizationEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getOrganization_Name()
  {
    return (EAttribute)organizationEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getOrganization_Stakeholder()
  {
    return (EReference)organizationEClass.getEStructuralFeatures().get(1);
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
  public EAttribute getVerificationActivity_Name()
  {
    return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationActivity_Title()
  {
    return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationActivity_Description()
  {
    return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationActivity_Method()
  {
    return (EAttribute)verificationActivityEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationActivity_DecomposedTo()
  {
    return (EReference)verificationActivityEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationActivity_AssignedTo()
  {
    return (EReference)verificationActivityEClass.getEStructuralFeatures().get(5);
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
  public EAttribute getVerificationResult_Name()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(0);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EReference getVerificationResult_ReferencedVerificationMethod()
  {
    return (EReference)verificationResultEClass.getEStructuralFeatures().get(1);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Title()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(2);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Description()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(3);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Method()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(4);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_State()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(5);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EAttribute getVerificationResult_Status()
  {
    return (EAttribute)verificationResultEClass.getEStructuralFeatures().get(6);
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

    contractualElementEClass = createEClass(CONTRACTUAL_ELEMENT);

    reqDocContentEClass = createEClass(REQ_DOC_CONTENT);

    alisaDocumentEClass = createEClass(ALISA_DOCUMENT);

    alisaElementEClass = createEClass(ALISA_ELEMENT);

    alisaNameSpaceEClass = createEClass(ALISA_NAME_SPACE);

    requirementDocumentEClass = createEClass(REQUIREMENT_DOCUMENT);
    createEAttribute(requirementDocumentEClass, REQUIREMENT_DOCUMENT__NAME);
    createEReference(requirementDocumentEClass, REQUIREMENT_DOCUMENT__CONTENT);

    documentSectionEClass = createEClass(DOCUMENT_SECTION);
    createEAttribute(documentSectionEClass, DOCUMENT_SECTION__NAME);
    createEReference(documentSectionEClass, DOCUMENT_SECTION__CONTENT);

    verificationLibraryEClass = createEClass(VERIFICATION_LIBRARY);
    createEAttribute(verificationLibraryEClass, VERIFICATION_LIBRARY__NAME);
    createEReference(verificationLibraryEClass, VERIFICATION_LIBRARY__CONTENT);

    rdaPackageEClass = createEClass(RDA_PACKAGE);
    createEAttribute(rdaPackageEClass, RDA_PACKAGE__NAME);
    createEReference(rdaPackageEClass, RDA_PACKAGE__IMPORTED_NAMESPACE);
    createEReference(rdaPackageEClass, RDA_PACKAGE__CONTENT);

    goalsEClass = createEClass(GOALS);
    createEAttribute(goalsEClass, GOALS__NAME);
    createEReference(goalsEClass, GOALS__TARGET);
    createEReference(goalsEClass, GOALS__GOALS);
    createEAttribute(goalsEClass, GOALS__ISSUE);

    goalEClass = createEClass(GOAL);
    createEAttribute(goalEClass, GOAL__NAME);
    createEAttribute(goalEClass, GOAL__TARGET);
    createEReference(goalEClass, GOAL__CATEGORY);
    createEAttribute(goalEClass, GOAL__TITLE);
    createEAttribute(goalEClass, GOAL__DESCRIPTION);
    createEAttribute(goalEClass, GOAL__ASSERT);
    createEAttribute(goalEClass, GOAL__RATIONALE);
    createEAttribute(goalEClass, GOAL__ISSUE);
    createEAttribute(goalEClass, GOAL__MODEL_REFERENCE);
    createEReference(goalEClass, GOAL__REFINES_REFERENCE);
    createEReference(goalEClass, GOAL__DECOMPOSES_REFERENCE);
    createEReference(goalEClass, GOAL__EVOLVES_REFERENCE);
    createEReference(goalEClass, GOAL__CONFLICTS_REFERENCE);
    createEReference(goalEClass, GOAL__STAKEHOLDER_REFERENCE);
    createEReference(goalEClass, GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE);
    createEReference(goalEClass, GOAL__SYSTEM_REQUIREMENT_REFERENCE);
    createEReference(goalEClass, GOAL__DOC_REFERENCE);

    requirementsEClass = createEClass(REQUIREMENTS);
    createEAttribute(requirementsEClass, REQUIREMENTS__NAME);
    createEReference(requirementsEClass, REQUIREMENTS__TARGET);
    createEReference(requirementsEClass, REQUIREMENTS__REQS);
    createEAttribute(requirementsEClass, REQUIREMENTS__ISSUE);

    requirementEClass = createEClass(REQUIREMENT);
    createEAttribute(requirementEClass, REQUIREMENT__NAME);
    createEAttribute(requirementEClass, REQUIREMENT__TARGET);
    createEReference(requirementEClass, REQUIREMENT__CATEGORY);
    createEAttribute(requirementEClass, REQUIREMENT__TITLE);
    createEAttribute(requirementEClass, REQUIREMENT__DESCRIPTION);
    createEAttribute(requirementEClass, REQUIREMENT__ASSERT);
    createEAttribute(requirementEClass, REQUIREMENT__RATIONALE);
    createEAttribute(requirementEClass, REQUIREMENT__ISSUE);
    createEAttribute(requirementEClass, REQUIREMENT__MODEL_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__GOAL_REFERENCE);
    createEAttribute(requirementEClass, REQUIREMENT__HAZARD_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__REFINES_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__DECOMPOSES_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__EVOLVES_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__VERIFIED_BY);
    createEReference(requirementEClass, REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE);
    createEReference(requirementEClass, REQUIREMENT__DOC_REFERENCE);

    externalDocumentsEClass = createEClass(EXTERNAL_DOCUMENTS);
    createEAttribute(externalDocumentsEClass, EXTERNAL_DOCUMENTS__NAME);
    createEReference(externalDocumentsEClass, EXTERNAL_DOCUMENTS__DOCS);

    externalDocumentEClass = createEClass(EXTERNAL_DOCUMENT);
    createEAttribute(externalDocumentEClass, EXTERNAL_DOCUMENT__NAME);
    createEAttribute(externalDocumentEClass, EXTERNAL_DOCUMENT__EXTERNAL_REFERENCE);

    xDocUriEClass = createEClass(XDOC_URI);
    createEReference(xDocUriEClass, XDOC_URI__DOC_PATH);
    createEAttribute(xDocUriEClass, XDOC_URI__DOC_FRAGMENT);

    alisaConfigurationEClass = createEClass(ALISA_CONFIGURATION);
    createEAttribute(alisaConfigurationEClass, ALISA_CONFIGURATION__NAME);
    createEReference(alisaConfigurationEClass, ALISA_CONFIGURATION__CATEGORY);

    categoryEClass = createEClass(CATEGORY);
    createEAttribute(categoryEClass, CATEGORY__NAME);
    createEReference(categoryEClass, CATEGORY__EXTENDS);

    stakeholderEClass = createEClass(STAKEHOLDER);
    createEAttribute(stakeholderEClass, STAKEHOLDER__NAME);
    createEAttribute(stakeholderEClass, STAKEHOLDER__TITLE);
    createEAttribute(stakeholderEClass, STAKEHOLDER__DESCRIPTION);
    createEAttribute(stakeholderEClass, STAKEHOLDER__ROLE);
    createEAttribute(stakeholderEClass, STAKEHOLDER__EMAIL);
    createEAttribute(stakeholderEClass, STAKEHOLDER__PHONE);

    organizationEClass = createEClass(ORGANIZATION);
    createEAttribute(organizationEClass, ORGANIZATION__NAME);
    createEReference(organizationEClass, ORGANIZATION__STAKEHOLDER);

    verificationDecompositionEClass = createEClass(VERIFICATION_DECOMPOSITION);
    createEReference(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__ELEMENT);
    createEReference(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__LEFT);
    createEAttribute(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__TYPE);
    createEReference(verificationDecompositionEClass, VERIFICATION_DECOMPOSITION__RIGHT);

    verificationActivityEClass = createEClass(VERIFICATION_ACTIVITY);
    createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__NAME);
    createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__TITLE);
    createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__DESCRIPTION);
    createEAttribute(verificationActivityEClass, VERIFICATION_ACTIVITY__METHOD);
    createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__DECOMPOSED_TO);
    createEReference(verificationActivityEClass, VERIFICATION_ACTIVITY__ASSIGNED_TO);

    verificationResultEClass = createEClass(VERIFICATION_RESULT);
    createEAttribute(verificationResultEClass, VERIFICATION_RESULT__NAME);
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
    EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);
    Aadl2Package theAadl2Package = (Aadl2Package)EPackage.Registry.INSTANCE.getEPackage(Aadl2Package.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    contractualElementEClass.getESuperTypes().add(this.getReqDocContent());
    requirementDocumentEClass.getESuperTypes().add(this.getAlisaModel());
    requirementDocumentEClass.getESuperTypes().add(this.getAlisaDocument());
    requirementDocumentEClass.getESuperTypes().add(this.getAlisaElement());
    requirementDocumentEClass.getESuperTypes().add(this.getAlisaNameSpace());
    documentSectionEClass.getESuperTypes().add(this.getReqDocContent());
    verificationLibraryEClass.getESuperTypes().add(this.getAlisaModel());
    verificationLibraryEClass.getESuperTypes().add(this.getAlisaElement());
    verificationLibraryEClass.getESuperTypes().add(this.getAlisaNameSpace());
    rdaPackageEClass.getESuperTypes().add(this.getAlisaModel());
    rdaPackageEClass.getESuperTypes().add(this.getAlisaDocument());
    rdaPackageEClass.getESuperTypes().add(this.getAlisaElement());
    rdaPackageEClass.getESuperTypes().add(this.getAlisaNameSpace());
    goalsEClass.getESuperTypes().add(this.getAlisaElement());
    goalsEClass.getESuperTypes().add(this.getAlisaNameSpace());
    goalEClass.getESuperTypes().add(this.getContractualElement());
    goalEClass.getESuperTypes().add(this.getAlisaElement());
    requirementsEClass.getESuperTypes().add(this.getAlisaElement());
    requirementsEClass.getESuperTypes().add(this.getAlisaNameSpace());
    requirementEClass.getESuperTypes().add(this.getContractualElement());
    requirementEClass.getESuperTypes().add(this.getAlisaElement());
    externalDocumentsEClass.getESuperTypes().add(this.getAlisaModel());
    externalDocumentsEClass.getESuperTypes().add(this.getAlisaElement());
    externalDocumentsEClass.getESuperTypes().add(this.getAlisaNameSpace());
    alisaConfigurationEClass.getESuperTypes().add(this.getAlisaModel());
    alisaConfigurationEClass.getESuperTypes().add(this.getAlisaElement());
    alisaConfigurationEClass.getESuperTypes().add(this.getAlisaNameSpace());
    categoryEClass.getESuperTypes().add(this.getAlisaElement());
    stakeholderEClass.getESuperTypes().add(this.getAlisaElement());
    organizationEClass.getESuperTypes().add(this.getAlisaModel());
    organizationEClass.getESuperTypes().add(this.getAlisaElement());
    organizationEClass.getESuperTypes().add(this.getAlisaNameSpace());
    verificationActivityEClass.getESuperTypes().add(this.getAlisaElement());
    verificationResultEClass.getESuperTypes().add(this.getAlisaElement());

    // Initialize classes and features; add operations and parameters
    initEClass(alisaModelEClass, AlisaModel.class, "AlisaModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(contractualElementEClass, ContractualElement.class, "ContractualElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(reqDocContentEClass, ReqDocContent.class, "ReqDocContent", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alisaDocumentEClass, AlisaDocument.class, "AlisaDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alisaElementEClass, AlisaElement.class, "AlisaElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(alisaNameSpaceEClass, AlisaNameSpace.class, "AlisaNameSpace", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    initEClass(requirementDocumentEClass, RequirementDocument.class, "RequirementDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirementDocument_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirementDocument_Content(), this.getReqDocContent(), null, "content", null, 0, -1, RequirementDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(documentSectionEClass, DocumentSection.class, "DocumentSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getDocumentSection_Name(), theEcorePackage.getEString(), "name", null, 0, 1, DocumentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getDocumentSection_Content(), this.getReqDocContent(), null, "content", null, 0, -1, DocumentSection.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationLibraryEClass, VerificationLibrary.class, "VerificationLibrary", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVerificationLibrary_Name(), theEcorePackage.getEString(), "name", null, 0, 1, VerificationLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationLibrary_Content(), this.getAlisaElement(), null, "content", null, 0, -1, VerificationLibrary.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(rdaPackageEClass, RDAPackage.class, "RDAPackage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRDAPackage_Name(), theEcorePackage.getEString(), "name", null, 0, 1, RDAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDAPackage_ImportedNamespace(), theEcorePackage.getEObject(), null, "importedNamespace", null, 0, -1, RDAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRDAPackage_Content(), theEcorePackage.getEObject(), null, "content", null, 0, -1, RDAPackage.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalsEClass, Goals.class, "Goals", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoals_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoals_Target(), theAadl2Package.getNamedElement(), null, "target", null, 0, 1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoals_Goals(), this.getGoal(), null, "goals", null, 0, -1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoals_Issue(), theEcorePackage.getEString(), "issue", null, 0, -1, Goals.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(goalEClass, Goal.class, "Goal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getGoal_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Target(), theEcorePackage.getEString(), "target", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_Category(), this.getCategory(), null, "category", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Assert(), theEcorePackage.getEString(), "assert", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Rationale(), theEcorePackage.getEString(), "rationale", null, 0, 1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_Issue(), theEcorePackage.getEString(), "issue", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getGoal_ModelReference(), theEcorePackage.getEString(), "modelReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_RefinesReference(), this.getGoal(), null, "refinesReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_DecomposesReference(), this.getGoal(), null, "decomposesReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_EvolvesReference(), this.getGoal(), null, "evolvesReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_ConflictsReference(), this.getGoal(), null, "conflictsReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_StakeholderReference(), this.getStakeholder(), null, "stakeholderReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_StakeholderRequirementReference(), this.getGoal(), null, "stakeholderRequirementReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_SystemRequirementReference(), this.getContractualElement(), null, "systemRequirementReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getGoal_DocReference(), this.getExternalDocument(), null, "docReference", null, 0, -1, Goal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementsEClass, Requirements.class, "Requirements", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirements_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirements_Target(), theAadl2Package.getNamedElement(), null, "target", null, 0, 1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirements_Reqs(), this.getRequirement(), null, "reqs", null, 0, -1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirements_Issue(), theEcorePackage.getEString(), "issue", null, 0, -1, Requirements.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(requirementEClass, Requirement.class, "Requirement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getRequirement_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Target(), theEcorePackage.getEString(), "target", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_Category(), this.getCategory(), null, "category", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Assert(), theEcorePackage.getEString(), "assert", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Rationale(), theEcorePackage.getEString(), "rationale", null, 0, 1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_Issue(), theEcorePackage.getEString(), "issue", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_ModelReference(), theEcorePackage.getEString(), "modelReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_GoalReference(), this.getGoal(), null, "goalReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getRequirement_HazardReference(), theEcorePackage.getEString(), "hazardReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_RefinesReference(), this.getRequirement(), null, "refinesReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_DecomposesReference(), this.getRequirement(), null, "decomposesReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_EvolvesReference(), this.getRequirement(), null, "evolvesReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_VerifiedBy(), this.getVerificationDecomposition(), null, "verifiedBy", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_StakeholderRequirementReference(), this.getGoal(), null, "stakeholderRequirementReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_SystemRequirementReference(), this.getContractualElement(), null, "systemRequirementReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getRequirement_DocReference(), this.getXDocUri(), null, "docReference", null, 0, -1, Requirement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalDocumentsEClass, ExternalDocuments.class, "ExternalDocuments", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalDocuments_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ExternalDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getExternalDocuments_Docs(), this.getExternalDocument(), null, "docs", null, 0, -1, ExternalDocuments.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(externalDocumentEClass, ExternalDocument.class, "ExternalDocument", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getExternalDocument_Name(), theEcorePackage.getEString(), "name", null, 0, 1, ExternalDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getExternalDocument_ExternalReference(), theEcorePackage.getEString(), "externalReference", null, 0, 1, ExternalDocument.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(xDocUriEClass, XDocUri.class, "XDocUri", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getXDocUri_DocPath(), this.getExternalDocument(), null, "docPath", null, 0, 1, XDocUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getXDocUri_DocFragment(), theEcorePackage.getEString(), "docFragment", null, 0, 1, XDocUri.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(alisaConfigurationEClass, AlisaConfiguration.class, "AlisaConfiguration", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getAlisaConfiguration_Name(), theEcorePackage.getEString(), "name", null, 0, 1, AlisaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getAlisaConfiguration_Category(), this.getCategory(), null, "category", null, 0, -1, AlisaConfiguration.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(categoryEClass, Category.class, "Category", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getCategory_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getCategory_Extends(), this.getCategory(), null, "extends", null, 0, 1, Category.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(stakeholderEClass, Stakeholder.class, "Stakeholder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getStakeholder_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Title(), theEcorePackage.getEString(), "title", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Description(), theEcorePackage.getEString(), "description", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Role(), theEcorePackage.getEString(), "role", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Email(), theEcorePackage.getEString(), "email", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getStakeholder_Phone(), theEcorePackage.getEString(), "phone", null, 0, 1, Stakeholder.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(organizationEClass, Organization.class, "Organization", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getOrganization_Name(), theEcorePackage.getEString(), "name", null, 0, 1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getOrganization_Stakeholder(), this.getStakeholder(), null, "stakeholder", null, 0, -1, Organization.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationDecompositionEClass, VerificationDecomposition.class, "VerificationDecomposition", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEReference(getVerificationDecomposition_Element(), this.getVerificationActivity(), null, "element", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationDecomposition_Left(), this.getVerificationActivity(), null, "left", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationDecomposition_Type(), theEcorePackage.getEString(), "type", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationDecomposition_Right(), this.getVerificationDecomposition(), null, "right", null, 0, 1, VerificationDecomposition.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationActivityEClass, VerificationActivity.class, "VerificationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVerificationActivity_Name(), theEcorePackage.getEString(), "name", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationActivity_Title(), theEcorePackage.getEString(), "title", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationActivity_Description(), theEcorePackage.getEString(), "description", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEAttribute(getVerificationActivity_Method(), theEcorePackage.getEString(), "method", null, 0, 1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationActivity_DecomposedTo(), this.getVerificationDecomposition(), null, "decomposedTo", null, 0, -1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
    initEReference(getVerificationActivity_AssignedTo(), this.getStakeholder(), null, "assignedTo", null, 0, -1, VerificationActivity.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

    initEClass(verificationResultEClass, VerificationResult.class, "VerificationResult", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
    initEAttribute(getVerificationResult_Name(), theEcorePackage.getEString(), "name", null, 0, 1, VerificationResult.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
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
