/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.alisa.alisa.AlisaFactory
 * @model kind="package"
 * @generated
 */
public interface AlisaPackage extends EPackage
{
  /**
   * The package name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNAME = "alisa";

  /**
   * The package namespace URI.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_URI = "http://www.cmu.edu/sei/alisa/Alisa";

  /**
   * The package namespace name.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  String eNS_PREFIX = "alisa";

  /**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  AlisaPackage eINSTANCE = edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl.init();

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.AlisaModelImpl <em>Model</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaModelImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAlisaModel()
   * @generated
   */
  int ALISA_MODEL = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__NAME = 0;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getContractualElement()
   * @generated
   */
  int CONTRACTUAL_ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__CATEGORY = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__TITLE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__RATIONALE = 4;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__ISSUE = 5;

  /**
   * The number of structural features of the '<em>Contractual Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl <em>RSAL Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALContainer()
   * @generated
   */
  int RSAL_CONTAINER = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__NAME = ALISA_MODEL__NAME;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__TARGET = ALISA_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__CONTENT = ALISA_MODEL_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__ISSUE = ALISA_MODEL_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>RSAL Container</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER_FEATURE_COUNT = ALISA_MODEL_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl <em>Organization</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.OrganizationImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getOrganization()
   * @generated
   */
  int ORGANIZATION = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__NAME = ALISA_MODEL__NAME;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__STAKEHOLDER = ALISA_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Organization</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION_FEATURE_COUNT = ALISA_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.DescriptionImpl <em>Description</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.DescriptionImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDescription()
   * @generated
   */
  int DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION__DESCRIPTION = 0;

  /**
   * The number of structural features of the '<em>Description</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.DescriptionElementImpl <em>Description Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.DescriptionElementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDescriptionElement()
   * @generated
   */
  int DESCRIPTION_ELEMENT = 5;

  /**
   * The feature id for the '<em><b>Text</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT__TEXT = 0;

  /**
   * The feature id for the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT__REF = 1;

  /**
   * The number of structural features of the '<em>Description Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DESCRIPTION_ELEMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALVariableImpl <em>RSAL Variable</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RSALVariableImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALVariable()
   * @generated
   */
  int RSAL_VARIABLE = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_VARIABLE__NAME = 0;

  /**
   * The feature id for the '<em><b>Value</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_VARIABLE__VALUE = 1;

  /**
   * The number of structural features of the '<em>RSAL Variable</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_VARIABLE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.GoalImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 7;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = CONTRACTUAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TITLE = CONTRACTUAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__RATIONALE = CONTRACTUAL_ELEMENT__RATIONALE;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ISSUE = CONTRACTUAL_ELEMENT__ISSUE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TARGET = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ASSERT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__REFINES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Subgoal</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__SUBGOAL = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Decomposes Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DECOMPOSES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Evolves Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__EVOLVES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Conflicts Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CONFLICTS_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Stakeholder Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>System Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__SYSTEM_REQUIREMENT_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DOC_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__MODEL_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RequirementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = CONTRACTUAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TITLE = CONTRACTUAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RATIONALE = CONTRACTUAL_ELEMENT__RATIONALE;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ISSUE = CONTRACTUAL_ELEMENT__ISSUE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TARGET = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ASSERT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Req Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REQ_VALUE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Goal Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__GOAL_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Hazard Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__HAZARD_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REFINES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Subrequirement</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__SUBREQUIREMENT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Decomposes Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DECOMPOSES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Evolves Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__EVOLVES_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>System Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Verified By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__VERIFIED_BY = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ARGUMENT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DOC_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__MODEL_REFERENCE = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 14;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 15;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl <em>Verification Assumption</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationAssumption()
   * @generated
   */
  int VERIFICATION_ASSUMPTION = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__NAME = CONTRACTUAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__CATEGORY = CONTRACTUAL_ELEMENT__CATEGORY;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__TITLE = CONTRACTUAL_ELEMENT__TITLE;

  /**
   * The feature id for the '<em><b>Description</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__DESCRIPTION = CONTRACTUAL_ELEMENT__DESCRIPTION;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__RATIONALE = CONTRACTUAL_ELEMENT__RATIONALE;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__ISSUE = CONTRACTUAL_ELEMENT__ISSUE;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__TARGET = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Assert</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__ASSERT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Verified By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__VERIFIED_BY = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION__ARGUMENT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The number of structural features of the '<em>Verification Assumption</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ASSUMPTION_FEATURE_COUNT = CONTRACTUAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.HazardImpl <em>Hazard</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.HazardImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getHazard()
   * @generated
   */
  int HAZARD = 10;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__NAME = 0;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__TARGET = 1;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__CATEGORY = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__TITLE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Mitigated</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__MITIGATED = 5;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__RATIONALE = 6;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD__ISSUE = 7;

  /**
   * The number of structural features of the '<em>Hazard</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl <em>External Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getExternalDocument()
   * @generated
   */
  int EXTERNAL_DOCUMENT = 11;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__DOC_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Doc Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__DOC_FRAGMENT = 1;

  /**
   * The number of structural features of the '<em>External Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.CategoriesImpl <em>Categories</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.CategoriesImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getCategories()
   * @generated
   */
  int CATEGORIES = 12;

  /**
   * The number of structural features of the '<em>Categories</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORIES_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementCategoriesImpl <em>Requirement Categories</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RequirementCategoriesImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirementCategories()
   * @generated
   */
  int REQUIREMENT_CATEGORIES = 13;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_CATEGORIES__NAME = ALISA_MODEL__NAME;

  /**
   * The feature id for the '<em><b>Category</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_CATEGORIES__CATEGORY = ALISA_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Requirement Categories</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_CATEGORIES_FEATURE_COUNT = ALISA_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationCategoriesImpl <em>Verification Categories</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationCategoriesImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationCategories()
   * @generated
   */
  int VERIFICATION_CATEGORIES = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CATEGORIES__NAME = ALISA_MODEL__NAME;

  /**
   * The feature id for the '<em><b>Category</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CATEGORIES__CATEGORY = ALISA_MODEL_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verification Categories</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CATEGORIES_FEATURE_COUNT = ALISA_MODEL_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.HazardCategoriesImpl <em>Hazard Categories</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.HazardCategoriesImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getHazardCategories()
   * @generated
   */
  int HAZARD_CATEGORIES = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CATEGORIES__NAME = CATEGORIES_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CATEGORIES__CATEGORY = CATEGORIES_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Hazard Categories</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CATEGORIES_FEATURE_COUNT = CATEGORIES_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.CategoryImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 16;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = 0;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementCategoryImpl <em>Requirement Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RequirementCategoryImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirementCategory()
   * @generated
   */
  int REQUIREMENT_CATEGORY = 17;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_CATEGORY__NAME = CATEGORY__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_CATEGORY__EXTENDS = CATEGORY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Requirement Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationCategoryImpl <em>Verification Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationCategoryImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationCategory()
   * @generated
   */
  int VERIFICATION_CATEGORY = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CATEGORY__NAME = CATEGORY__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CATEGORY__EXTENDS = CATEGORY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verification Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.HazardCategoryImpl <em>Hazard Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.HazardCategoryImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getHazardCategory()
   * @generated
   */
  int HAZARD_CATEGORY = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CATEGORY__NAME = CATEGORY__NAME;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CATEGORY__EXTENDS = CATEGORY_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Hazard Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int HAZARD_CATEGORY_FEATURE_COUNT = CATEGORY_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.StakeholderImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 20;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__ROLE = 3;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__EMAIL = 4;

  /**
   * The feature id for the '<em><b>Phone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__PHONE = 5;

  /**
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.AssuranceArgumentImpl <em>Assurance Argument</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.AssuranceArgumentImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAssuranceArgument()
   * @generated
   */
  int ASSURANCE_ARGUMENT = 21;

  /**
   * The feature id for the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_ARGUMENT__EXPRESSION = 0;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_ARGUMENT__RATIONALE = 1;

  /**
   * The number of structural features of the '<em>Assurance Argument</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_ARGUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ArgumentExprImpl <em>Argument Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ArgumentExprImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getArgumentExpr()
   * @generated
   */
  int ARGUMENT_EXPR = 22;

  /**
   * The number of structural features of the '<em>Argument Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_EXPR_FEATURE_COUNT = 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ArgumentReferenceImpl <em>Argument Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ArgumentReferenceImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getArgumentReference()
   * @generated
   */
  int ARGUMENT_REFERENCE = 23;

  /**
   * The feature id for the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_REFERENCE__REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_REFERENCE__WEIGHT = 1;

  /**
   * The number of structural features of the '<em>Argument Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ARGUMENT_REFERENCE_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationActivity()
   * @generated
   */
  int VERIFICATION_ACTIVITY = 24;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__CATEGORY = 3;

  /**
   * The feature id for the '<em><b>Method</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__METHOD = 4;

  /**
   * The feature id for the '<em><b>Assumption</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__ASSUMPTION = 5;

  /**
   * The number of structural features of the '<em>Verification Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationMethod()
   * @generated
   */
  int VERIFICATION_METHOD = 25;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__NAME = 0;

  /**
   * The feature id for the '<em><b>Language</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__LANGUAGE = 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__METHOD = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__TITLE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD__CATEGORY = 5;

  /**
   * The number of structural features of the '<em>Verification Method</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_METHOD_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.AssuranceCaseImpl <em>Assurance Case</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.AssuranceCaseImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAssuranceCase()
   * @generated
   */
  int ASSURANCE_CASE = 26;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__NAME = ALISA_MODEL__NAME;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__TARGET = ALISA_MODEL_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Results</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE__RESULTS = ALISA_MODEL_FEATURE_COUNT + 1;

  /**
   * The number of structural features of the '<em>Assurance Case</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_CASE_FEATURE_COUNT = ALISA_MODEL_FEATURE_COUNT + 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALResultImpl <em>RSAL Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RSALResultImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALResult()
   * @generated
   */
  int RSAL_RESULT = 29;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_RESULT__NAME = 0;

  /**
   * The number of structural features of the '<em>RSAL Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_RESULT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl <em>Verification Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResult()
   * @generated
   */
  int VERIFICATION_RESULT = 27;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__NAME = RSAL_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Verification Activity</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__VERIFICATION_ACTIVITY = RSAL_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__TITLE = RSAL_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__DESCRIPTION = RSAL_RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__METHOD = RSAL_RESULT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATE = RSAL_RESULT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATUS = RSAL_RESULT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Assumption Verification Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__ASSUMPTION_VERIFICATION_RESULT = RSAL_RESULT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Verification Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT_FEATURE_COUNT = RSAL_RESULT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl <em>Assurance Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAssuranceResult()
   * @generated
   */
  int ASSURANCE_RESULT = 28;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__NAME = RSAL_RESULT__NAME;

  /**
   * The feature id for the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__REQUIREMENT = RSAL_RESULT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Pass Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__PASS_COUNT = RSAL_RESULT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Fail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__FAIL_COUNT = RSAL_RESULT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Neutral Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__NEUTRAL_COUNT = RSAL_RESULT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Unknown Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__UNKNOWN_COUNT = RSAL_RESULT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Sub Claim Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__SUB_CLAIM_RESULT = RSAL_RESULT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Sub VA Result</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT__SUB_VA_RESULT = RSAL_RESULT_FEATURE_COUNT + 6;

  /**
   * The number of structural features of the '<em>Assurance Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ASSURANCE_RESULT_FEATURE_COUNT = RSAL_RESULT_FEATURE_COUNT + 7;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.BinaryExprImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getBinaryExpr()
   * @generated
   */
  int BINARY_EXPR = 30;

  /**
   * The feature id for the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__LEFT = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__OP = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR__RIGHT = ARGUMENT_EXPR_FEATURE_COUNT + 2;

  /**
   * The number of structural features of the '<em>Binary Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int BINARY_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RefExprImpl <em>Ref Expr</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RefExprImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRefExpr()
   * @generated
   */
  int REF_EXPR = 31;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR__ID = ARGUMENT_EXPR_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Ref Expr</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REF_EXPR_FEATURE_COUNT = ARGUMENT_EXPR_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.VerificationResultState <em>Verification Result State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.VerificationResultState
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResultState()
   * @generated
   */
  int VERIFICATION_RESULT_STATE = 32;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.VerificationResultStatus <em>Verification Result Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.VerificationResultStatus
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResultStatus()
   * @generated
   */
  int VERIFICATION_RESULT_STATUS = 33;


  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.AlisaModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Model</em>'.
   * @see edu.cmu.sei.alisa.alisa.AlisaModel
   * @generated
   */
  EClass getAlisaModel();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.AlisaModel#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.AlisaModel#getName()
   * @see #getAlisaModel()
   * @generated
   */
  EAttribute getAlisaModel_Name();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ContractualElement <em>Contractual Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contractual Element</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement
   * @generated
   */
  EClass getContractualElement();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getName()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Name();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getCategory()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Category();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getTitle()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Title();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getDescription()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Description();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getRationale()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Rationale();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issue</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getIssue()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Issue();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RSALContainer <em>RSAL Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RSAL Container</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALContainer
   * @generated
   */
  EClass getRSALContainer();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.RSALContainer#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALContainer#getTarget()
   * @see #getRSALContainer()
   * @generated
   */
  EReference getRSALContainer_Target();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.RSALContainer#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALContainer#getContent()
   * @see #getRSALContainer()
   * @generated
   */
  EReference getRSALContainer_Content();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.RSALContainer#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issue</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALContainer#getIssue()
   * @see #getRSALContainer()
   * @generated
   */
  EAttribute getRSALContainer_Issue();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Organization <em>Organization</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Organization</em>'.
   * @see edu.cmu.sei.alisa.alisa.Organization
   * @generated
   */
  EClass getOrganization();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Organization#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stakeholder</em>'.
   * @see edu.cmu.sei.alisa.alisa.Organization#getStakeholder()
   * @see #getOrganization()
   * @generated
   */
  EReference getOrganization_Stakeholder();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Description <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.Description
   * @generated
   */
  EClass getDescription();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Description#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.Description#getDescription()
   * @see #getDescription()
   * @generated
   */
  EReference getDescription_Description();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.DescriptionElement <em>Description Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Description Element</em>'.
   * @see edu.cmu.sei.alisa.alisa.DescriptionElement
   * @generated
   */
  EClass getDescriptionElement();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.DescriptionElement#getText <em>Text</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Text</em>'.
   * @see edu.cmu.sei.alisa.alisa.DescriptionElement#getText()
   * @see #getDescriptionElement()
   * @generated
   */
  EAttribute getDescriptionElement_Text();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.DescriptionElement#getRef <em>Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Ref</em>'.
   * @see edu.cmu.sei.alisa.alisa.DescriptionElement#getRef()
   * @see #getDescriptionElement()
   * @generated
   */
  EReference getDescriptionElement_Ref();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RSALVariable <em>RSAL Variable</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RSAL Variable</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALVariable
   * @generated
   */
  EClass getRSALVariable();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.RSALVariable#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALVariable#getName()
   * @see #getRSALVariable()
   * @generated
   */
  EAttribute getRSALVariable_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.RSALVariable#getValue <em>Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Value</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALVariable#getValue()
   * @see #getRSALVariable()
   * @generated
   */
  EAttribute getRSALVariable_Value();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goal</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal
   * @generated
   */
  EClass getGoal();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Goal#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getTarget()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Target();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Goal#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assert</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getAssert()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Assert();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getRefinesReference <em>Refines Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refines Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getRefinesReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_RefinesReference();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getSubgoal <em>Subgoal</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subgoal</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getSubgoal()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_Subgoal();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getDecomposesReference <em>Decomposes Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Decomposes Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getDecomposesReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_DecomposesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getEvolvesReference <em>Evolves Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Evolves Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getEvolvesReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_EvolvesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getConflictsReference <em>Conflicts Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conflicts Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getConflictsReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_ConflictsReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getStakeholderReference <em>Stakeholder Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholder Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getStakeholderReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_StakeholderReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholder Requirement Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getStakeholderRequirementReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_StakeholderRequirementReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getSystemRequirementReference <em>System Requirement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>System Requirement Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getSystemRequirementReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_SystemRequirementReference();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Doc Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getDocReference()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_DocReference();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.Goal#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Model Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getModelReference()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_ModelReference();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement
   * @generated
   */
  EClass getRequirement();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Requirement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getTarget()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Target();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirement#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assert</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getAssert()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Assert();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getReqValue <em>Req Value</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Req Value</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getReqValue()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_ReqValue();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getGoalReference <em>Goal Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Goal Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getGoalReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_GoalReference();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.Requirement#getHazardReference <em>Hazard Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Hazard Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getHazardReference()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_HazardReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getRefinesReference <em>Refines Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refines Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getRefinesReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_RefinesReference();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getSubrequirement <em>Subrequirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Subrequirement</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getSubrequirement()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Subrequirement();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getDecomposesReference <em>Decomposes Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Decomposes Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getDecomposesReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_DecomposesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getEvolvesReference <em>Evolves Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Evolves Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getEvolvesReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_EvolvesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholder Requirement Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getStakeholderRequirementReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_StakeholderRequirementReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getSystemRequirementReference <em>System Requirement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>System Requirement Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getSystemRequirementReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_SystemRequirementReference();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getVerifiedBy <em>Verified By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Verified By</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getVerifiedBy()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_VerifiedBy();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.Requirement#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getArgument()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_Argument();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Doc Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getDocReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_DocReference();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.Requirement#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Model Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getModelReference()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_ModelReference();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption <em>Verification Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Assumption</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationAssumption
   * @generated
   */
  EClass getVerificationAssumption();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationAssumption#getTarget()
   * @see #getVerificationAssumption()
   * @generated
   */
  EReference getVerificationAssumption_Target();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Assert</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationAssumption#getAssert()
   * @see #getVerificationAssumption()
   * @generated
   */
  EReference getVerificationAssumption_Assert();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getVerifiedBy <em>Verified By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Verified By</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationAssumption#getVerifiedBy()
   * @see #getVerificationAssumption()
   * @generated
   */
  EReference getVerificationAssumption_VerifiedBy();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getArgument <em>Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Argument</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationAssumption#getArgument()
   * @see #getVerificationAssumption()
   * @generated
   */
  EReference getVerificationAssumption_Argument();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Hazard <em>Hazard</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard
   * @generated
   */
  EClass getHazard();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Hazard#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getName()
   * @see #getHazard()
   * @generated
   */
  EAttribute getHazard_Name();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Hazard#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getTarget()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_Target();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Hazard#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getCategory()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_Category();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Hazard#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getTitle()
   * @see #getHazard()
   * @generated
   */
  EAttribute getHazard_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Hazard#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getDescription()
   * @see #getHazard()
   * @generated
   */
  EAttribute getHazard_Description();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Hazard#getMitigated <em>Mitigated</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Mitigated</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getMitigated()
   * @see #getHazard()
   * @generated
   */
  EReference getHazard_Mitigated();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Hazard#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getRationale()
   * @see #getHazard()
   * @generated
   */
  EAttribute getHazard_Rationale();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.Hazard#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issue</em>'.
   * @see edu.cmu.sei.alisa.alisa.Hazard#getIssue()
   * @see #getHazard()
   * @generated
   */
  EAttribute getHazard_Issue();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ExternalDocument <em>External Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Document</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument
   * @generated
   */
  EClass getExternalDocument();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument#getDocReference()
   * @see #getExternalDocument()
   * @generated
   */
  EAttribute getExternalDocument_DocReference();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getDocFragment <em>Doc Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc Fragment</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument#getDocFragment()
   * @see #getExternalDocument()
   * @generated
   */
  EAttribute getExternalDocument_DocFragment();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Categories <em>Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Categories</em>'.
   * @see edu.cmu.sei.alisa.alisa.Categories
   * @generated
   */
  EClass getCategories();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RequirementCategories <em>Requirement Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement Categories</em>'.
   * @see edu.cmu.sei.alisa.alisa.RequirementCategories
   * @generated
   */
  EClass getRequirementCategories();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.RequirementCategories#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.RequirementCategories#getCategory()
   * @see #getRequirementCategories()
   * @generated
   */
  EReference getRequirementCategories_Category();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationCategories <em>Verification Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Categories</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationCategories
   * @generated
   */
  EClass getVerificationCategories();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.VerificationCategories#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationCategories#getCategory()
   * @see #getVerificationCategories()
   * @generated
   */
  EReference getVerificationCategories_Category();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.HazardCategories <em>Hazard Categories</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Categories</em>'.
   * @see edu.cmu.sei.alisa.alisa.HazardCategories
   * @generated
   */
  EClass getHazardCategories();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.HazardCategories#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.HazardCategories#getName()
   * @see #getHazardCategories()
   * @generated
   */
  EAttribute getHazardCategories_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.HazardCategories#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.HazardCategories#getCategory()
   * @see #getHazardCategories()
   * @generated
   */
  EReference getHazardCategories_Category();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Category <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.Category
   * @generated
   */
  EClass getCategory();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Category#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Category#getName()
   * @see #getCategory()
   * @generated
   */
  EAttribute getCategory_Name();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RequirementCategory <em>Requirement Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.RequirementCategory
   * @generated
   */
  EClass getRequirementCategory();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.RequirementCategory#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see edu.cmu.sei.alisa.alisa.RequirementCategory#getExtends()
   * @see #getRequirementCategory()
   * @generated
   */
  EReference getRequirementCategory_Extends();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationCategory <em>Verification Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationCategory
   * @generated
   */
  EClass getVerificationCategory();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.VerificationCategory#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationCategory#getExtends()
   * @see #getVerificationCategory()
   * @generated
   */
  EReference getVerificationCategory_Extends();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.HazardCategory <em>Hazard Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Hazard Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.HazardCategory
   * @generated
   */
  EClass getHazardCategory();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.HazardCategory#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see edu.cmu.sei.alisa.alisa.HazardCategory#getExtends()
   * @see #getHazardCategory()
   * @generated
   */
  EReference getHazardCategory_Extends();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholder</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder
   * @generated
   */
  EClass getStakeholder();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholder#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder#getName()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholder#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder#getTitle()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholder#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder#getDescription()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Description();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholder#getRole <em>Role</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Role</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder#getRole()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Role();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholder#getEmail <em>Email</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Email</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder#getEmail()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Email();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholder#getPhone <em>Phone</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Phone</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder#getPhone()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Phone();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.AssuranceArgument <em>Assurance Argument</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Argument</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceArgument
   * @generated
   */
  EClass getAssuranceArgument();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.AssuranceArgument#getExpression <em>Expression</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Expression</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceArgument#getExpression()
   * @see #getAssuranceArgument()
   * @generated
   */
  EReference getAssuranceArgument_Expression();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.AssuranceArgument#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceArgument#getRationale()
   * @see #getAssuranceArgument()
   * @generated
   */
  EAttribute getAssuranceArgument_Rationale();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ArgumentExpr <em>Argument Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Expr</em>'.
   * @see edu.cmu.sei.alisa.alisa.ArgumentExpr
   * @generated
   */
  EClass getArgumentExpr();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ArgumentReference <em>Argument Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Argument Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ArgumentReference
   * @generated
   */
  EClass getArgumentReference();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.ArgumentReference#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ArgumentReference#getReference()
   * @see #getArgumentReference()
   * @generated
   */
  EReference getArgumentReference_Reference();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ArgumentReference#getWeight <em>Weight</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Weight</em>'.
   * @see edu.cmu.sei.alisa.alisa.ArgumentReference#getWeight()
   * @see #getArgumentReference()
   * @generated
   */
  EAttribute getArgumentReference_Weight();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Activity</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity
   * @generated
   */
  EClass getVerificationActivity();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getName()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getTitle()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getDescription()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Description();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getCategory()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Category();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Method</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getMethod()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Method();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getAssumption <em>Assumption</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assumption</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getAssumption()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_Assumption();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationMethod <em>Verification Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Method</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationMethod
   * @generated
   */
  EClass getVerificationMethod();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationMethod#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationMethod#getName()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationMethod#getLanguage <em>Language</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Language</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationMethod#getLanguage()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Language();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationMethod#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationMethod#getMethod()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Method();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationMethod#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationMethod#getTitle()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationMethod#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationMethod#getDescription()
   * @see #getVerificationMethod()
   * @generated
   */
  EAttribute getVerificationMethod_Description();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.VerificationMethod#getCategory <em>Category</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Category</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationMethod#getCategory()
   * @see #getVerificationMethod()
   * @generated
   */
  EReference getVerificationMethod_Category();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.AssuranceCase <em>Assurance Case</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Case</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceCase
   * @generated
   */
  EClass getAssuranceCase();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.AssuranceCase#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceCase#getTarget()
   * @see #getAssuranceCase()
   * @generated
   */
  EReference getAssuranceCase_Target();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.AssuranceCase#getResults <em>Results</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Results</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceCase#getResults()
   * @see #getAssuranceCase()
   * @generated
   */
  EReference getAssuranceCase_Results();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationResult <em>Verification Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Result</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult
   * @generated
   */
  EClass getVerificationResult();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getVerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Verification Activity</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getVerificationActivity()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_VerificationActivity();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getTitle()
   * @see #getVerificationResult()
   * @generated
   */
  EAttribute getVerificationResult_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getDescription()
   * @see #getVerificationResult()
   * @generated
   */
  EAttribute getVerificationResult_Description();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getMethod()
   * @see #getVerificationResult()
   * @generated
   */
  EAttribute getVerificationResult_Method();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getState <em>State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>State</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getState()
   * @see #getVerificationResult()
   * @generated
   */
  EAttribute getVerificationResult_State();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getStatus <em>Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Status</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getStatus()
   * @see #getVerificationResult()
   * @generated
   */
  EAttribute getVerificationResult_Status();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getAssumptionVerificationResult <em>Assumption Verification Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Assumption Verification Result</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getAssumptionVerificationResult()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_AssumptionVerificationResult();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.AssuranceResult <em>Assurance Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Assurance Result</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult
   * @generated
   */
  EClass getAssuranceResult();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getRequirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Requirement</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult#getRequirement()
   * @see #getAssuranceResult()
   * @generated
   */
  EReference getAssuranceResult_Requirement();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getPassCount <em>Pass Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Pass Count</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult#getPassCount()
   * @see #getAssuranceResult()
   * @generated
   */
  EAttribute getAssuranceResult_PassCount();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getFailCount <em>Fail Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Fail Count</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult#getFailCount()
   * @see #getAssuranceResult()
   * @generated
   */
  EAttribute getAssuranceResult_FailCount();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getNeutralCount <em>Neutral Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Neutral Count</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult#getNeutralCount()
   * @see #getAssuranceResult()
   * @generated
   */
  EAttribute getAssuranceResult_NeutralCount();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getUnknownCount <em>Unknown Count</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Unknown Count</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult#getUnknownCount()
   * @see #getAssuranceResult()
   * @generated
   */
  EAttribute getAssuranceResult_UnknownCount();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getSubClaimResult <em>Sub Claim Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub Claim Result</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult#getSubClaimResult()
   * @see #getAssuranceResult()
   * @generated
   */
  EReference getAssuranceResult_SubClaimResult();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getSubVAResult <em>Sub VA Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Sub VA Result</em>'.
   * @see edu.cmu.sei.alisa.alisa.AssuranceResult#getSubVAResult()
   * @see #getAssuranceResult()
   * @generated
   */
  EReference getAssuranceResult_SubVAResult();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RSALResult <em>RSAL Result</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RSAL Result</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALResult
   * @generated
   */
  EClass getRSALResult();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.RSALResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALResult#getName()
   * @see #getRSALResult()
   * @generated
   */
  EAttribute getRSALResult_Name();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.BinaryExpr <em>Binary Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Binary Expr</em>'.
   * @see edu.cmu.sei.alisa.alisa.BinaryExpr
   * @generated
   */
  EClass getBinaryExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Left</em>'.
   * @see edu.cmu.sei.alisa.alisa.BinaryExpr#getLeft()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getOp <em>Op</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Op</em>'.
   * @see edu.cmu.sei.alisa.alisa.BinaryExpr#getOp()
   * @see #getBinaryExpr()
   * @generated
   */
  EAttribute getBinaryExpr_Op();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.alisa.alisa.BinaryExpr#getRight()
   * @see #getBinaryExpr()
   * @generated
   */
  EReference getBinaryExpr_Right();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RefExpr <em>Ref Expr</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Ref Expr</em>'.
   * @see edu.cmu.sei.alisa.alisa.RefExpr
   * @generated
   */
  EClass getRefExpr();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.RefExpr#getId <em>Id</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Id</em>'.
   * @see edu.cmu.sei.alisa.alisa.RefExpr#getId()
   * @see #getRefExpr()
   * @generated
   */
  EReference getRefExpr_Id();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.alisa.alisa.VerificationResultState <em>Verification Result State</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verification Result State</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResultState
   * @generated
   */
  EEnum getVerificationResultState();

  /**
   * Returns the meta object for enum '{@link edu.cmu.sei.alisa.alisa.VerificationResultStatus <em>Verification Result Status</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for enum '<em>Verification Result Status</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResultStatus
   * @generated
   */
  EEnum getVerificationResultStatus();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
  AlisaFactory getAlisaFactory();

  /**
   * <!-- begin-user-doc -->
   * Defines literals for the meta objects that represent
   * <ul>
   *   <li>each class,</li>
   *   <li>each feature of each class,</li>
   *   <li>each enum,</li>
   *   <li>and each data type</li>
   * </ul>
   * <!-- end-user-doc -->
   * @generated
   */
  interface Literals
  {
    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.AlisaModelImpl <em>Model</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaModelImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAlisaModel()
     * @generated
     */
    EClass ALISA_MODEL = eINSTANCE.getAlisaModel();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALISA_MODEL__NAME = eINSTANCE.getAlisaModel_Name();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getContractualElement()
     * @generated
     */
    EClass CONTRACTUAL_ELEMENT = eINSTANCE.getContractualElement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__NAME = eINSTANCE.getContractualElement_Name();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__CATEGORY = eINSTANCE.getContractualElement_Category();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__TITLE = eINSTANCE.getContractualElement_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__DESCRIPTION = eINSTANCE.getContractualElement_Description();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__RATIONALE = eINSTANCE.getContractualElement_Rationale();

    /**
     * The meta object literal for the '<em><b>Issue</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__ISSUE = eINSTANCE.getContractualElement_Issue();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl <em>RSAL Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALContainer()
     * @generated
     */
    EClass RSAL_CONTAINER = eINSTANCE.getRSALContainer();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RSAL_CONTAINER__TARGET = eINSTANCE.getRSALContainer_Target();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RSAL_CONTAINER__CONTENT = eINSTANCE.getRSALContainer_Content();

    /**
     * The meta object literal for the '<em><b>Issue</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RSAL_CONTAINER__ISSUE = eINSTANCE.getRSALContainer_Issue();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.OrganizationImpl <em>Organization</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.OrganizationImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getOrganization()
     * @generated
     */
    EClass ORGANIZATION = eINSTANCE.getOrganization();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ORGANIZATION__STAKEHOLDER = eINSTANCE.getOrganization_Stakeholder();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.DescriptionImpl <em>Description</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.DescriptionImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDescription()
     * @generated
     */
    EClass DESCRIPTION = eINSTANCE.getDescription();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION__DESCRIPTION = eINSTANCE.getDescription_Description();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.DescriptionElementImpl <em>Description Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.DescriptionElementImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDescriptionElement()
     * @generated
     */
    EClass DESCRIPTION_ELEMENT = eINSTANCE.getDescriptionElement();

    /**
     * The meta object literal for the '<em><b>Text</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DESCRIPTION_ELEMENT__TEXT = eINSTANCE.getDescriptionElement_Text();

    /**
     * The meta object literal for the '<em><b>Ref</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DESCRIPTION_ELEMENT__REF = eINSTANCE.getDescriptionElement_Ref();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALVariableImpl <em>RSAL Variable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RSALVariableImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALVariable()
     * @generated
     */
    EClass RSAL_VARIABLE = eINSTANCE.getRSALVariable();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RSAL_VARIABLE__NAME = eINSTANCE.getRSALVariable_Name();

    /**
     * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RSAL_VARIABLE__VALUE = eINSTANCE.getRSALVariable_Value();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl <em>Goal</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.GoalImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getGoal()
     * @generated
     */
    EClass GOAL = eINSTANCE.getGoal();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__TARGET = eINSTANCE.getGoal_Target();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__ASSERT = eINSTANCE.getGoal_Assert();

    /**
     * The meta object literal for the '<em><b>Refines Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__REFINES_REFERENCE = eINSTANCE.getGoal_RefinesReference();

    /**
     * The meta object literal for the '<em><b>Subgoal</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__SUBGOAL = eINSTANCE.getGoal_Subgoal();

    /**
     * The meta object literal for the '<em><b>Decomposes Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__DECOMPOSES_REFERENCE = eINSTANCE.getGoal_DecomposesReference();

    /**
     * The meta object literal for the '<em><b>Evolves Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__EVOLVES_REFERENCE = eINSTANCE.getGoal_EvolvesReference();

    /**
     * The meta object literal for the '<em><b>Conflicts Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__CONFLICTS_REFERENCE = eINSTANCE.getGoal_ConflictsReference();

    /**
     * The meta object literal for the '<em><b>Stakeholder Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__STAKEHOLDER_REFERENCE = eINSTANCE.getGoal_StakeholderReference();

    /**
     * The meta object literal for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE = eINSTANCE.getGoal_StakeholderRequirementReference();

    /**
     * The meta object literal for the '<em><b>System Requirement Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__SYSTEM_REQUIREMENT_REFERENCE = eINSTANCE.getGoal_SystemRequirementReference();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__DOC_REFERENCE = eINSTANCE.getGoal_DocReference();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__MODEL_REFERENCE = eINSTANCE.getGoal_ModelReference();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RequirementImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__TARGET = eINSTANCE.getRequirement_Target();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__ASSERT = eINSTANCE.getRequirement_Assert();

    /**
     * The meta object literal for the '<em><b>Req Value</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REQ_VALUE = eINSTANCE.getRequirement_ReqValue();

    /**
     * The meta object literal for the '<em><b>Goal Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__GOAL_REFERENCE = eINSTANCE.getRequirement_GoalReference();

    /**
     * The meta object literal for the '<em><b>Hazard Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__HAZARD_REFERENCE = eINSTANCE.getRequirement_HazardReference();

    /**
     * The meta object literal for the '<em><b>Refines Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__REFINES_REFERENCE = eINSTANCE.getRequirement_RefinesReference();

    /**
     * The meta object literal for the '<em><b>Subrequirement</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__SUBREQUIREMENT = eINSTANCE.getRequirement_Subrequirement();

    /**
     * The meta object literal for the '<em><b>Decomposes Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__DECOMPOSES_REFERENCE = eINSTANCE.getRequirement_DecomposesReference();

    /**
     * The meta object literal for the '<em><b>Evolves Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__EVOLVES_REFERENCE = eINSTANCE.getRequirement_EvolvesReference();

    /**
     * The meta object literal for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE = eINSTANCE.getRequirement_StakeholderRequirementReference();

    /**
     * The meta object literal for the '<em><b>System Requirement Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE = eINSTANCE.getRequirement_SystemRequirementReference();

    /**
     * The meta object literal for the '<em><b>Verified By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__VERIFIED_BY = eINSTANCE.getRequirement_VerifiedBy();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__ARGUMENT = eINSTANCE.getRequirement_Argument();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__DOC_REFERENCE = eINSTANCE.getRequirement_DocReference();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__MODEL_REFERENCE = eINSTANCE.getRequirement_ModelReference();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl <em>Verification Assumption</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationAssumptionImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationAssumption()
     * @generated
     */
    EClass VERIFICATION_ASSUMPTION = eINSTANCE.getVerificationAssumption();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ASSUMPTION__TARGET = eINSTANCE.getVerificationAssumption_Target();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ASSUMPTION__ASSERT = eINSTANCE.getVerificationAssumption_Assert();

    /**
     * The meta object literal for the '<em><b>Verified By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ASSUMPTION__VERIFIED_BY = eINSTANCE.getVerificationAssumption_VerifiedBy();

    /**
     * The meta object literal for the '<em><b>Argument</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ASSUMPTION__ARGUMENT = eINSTANCE.getVerificationAssumption_Argument();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.HazardImpl <em>Hazard</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.HazardImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getHazard()
     * @generated
     */
    EClass HAZARD = eINSTANCE.getHazard();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD__NAME = eINSTANCE.getHazard_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__TARGET = eINSTANCE.getHazard_Target();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__CATEGORY = eINSTANCE.getHazard_Category();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD__TITLE = eINSTANCE.getHazard_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD__DESCRIPTION = eINSTANCE.getHazard_Description();

    /**
     * The meta object literal for the '<em><b>Mitigated</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD__MITIGATED = eINSTANCE.getHazard_Mitigated();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD__RATIONALE = eINSTANCE.getHazard_Rationale();

    /**
     * The meta object literal for the '<em><b>Issue</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD__ISSUE = eINSTANCE.getHazard_Issue();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl <em>External Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getExternalDocument()
     * @generated
     */
    EClass EXTERNAL_DOCUMENT = eINSTANCE.getExternalDocument();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DOCUMENT__DOC_REFERENCE = eINSTANCE.getExternalDocument_DocReference();

    /**
     * The meta object literal for the '<em><b>Doc Fragment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DOCUMENT__DOC_FRAGMENT = eINSTANCE.getExternalDocument_DocFragment();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.CategoriesImpl <em>Categories</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.CategoriesImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getCategories()
     * @generated
     */
    EClass CATEGORIES = eINSTANCE.getCategories();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementCategoriesImpl <em>Requirement Categories</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RequirementCategoriesImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirementCategories()
     * @generated
     */
    EClass REQUIREMENT_CATEGORIES = eINSTANCE.getRequirementCategories();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT_CATEGORIES__CATEGORY = eINSTANCE.getRequirementCategories_Category();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationCategoriesImpl <em>Verification Categories</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationCategoriesImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationCategories()
     * @generated
     */
    EClass VERIFICATION_CATEGORIES = eINSTANCE.getVerificationCategories();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CATEGORIES__CATEGORY = eINSTANCE.getVerificationCategories_Category();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.HazardCategoriesImpl <em>Hazard Categories</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.HazardCategoriesImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getHazardCategories()
     * @generated
     */
    EClass HAZARD_CATEGORIES = eINSTANCE.getHazardCategories();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute HAZARD_CATEGORIES__NAME = eINSTANCE.getHazardCategories_Name();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_CATEGORIES__CATEGORY = eINSTANCE.getHazardCategories_Category();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.CategoryImpl <em>Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.CategoryImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getCategory()
     * @generated
     */
    EClass CATEGORY = eINSTANCE.getCategory();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CATEGORY__NAME = eINSTANCE.getCategory_Name();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementCategoryImpl <em>Requirement Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RequirementCategoryImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirementCategory()
     * @generated
     */
    EClass REQUIREMENT_CATEGORY = eINSTANCE.getRequirementCategory();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT_CATEGORY__EXTENDS = eINSTANCE.getRequirementCategory_Extends();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationCategoryImpl <em>Verification Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationCategoryImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationCategory()
     * @generated
     */
    EClass VERIFICATION_CATEGORY = eINSTANCE.getVerificationCategory();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_CATEGORY__EXTENDS = eINSTANCE.getVerificationCategory_Extends();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.HazardCategoryImpl <em>Hazard Category</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.HazardCategoryImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getHazardCategory()
     * @generated
     */
    EClass HAZARD_CATEGORY = eINSTANCE.getHazardCategory();

    /**
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference HAZARD_CATEGORY__EXTENDS = eINSTANCE.getHazardCategory_Extends();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.StakeholderImpl <em>Stakeholder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.StakeholderImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getStakeholder()
     * @generated
     */
    EClass STAKEHOLDER = eINSTANCE.getStakeholder();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__NAME = eINSTANCE.getStakeholder_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__TITLE = eINSTANCE.getStakeholder_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__DESCRIPTION = eINSTANCE.getStakeholder_Description();

    /**
     * The meta object literal for the '<em><b>Role</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__ROLE = eINSTANCE.getStakeholder_Role();

    /**
     * The meta object literal for the '<em><b>Email</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__EMAIL = eINSTANCE.getStakeholder_Email();

    /**
     * The meta object literal for the '<em><b>Phone</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__PHONE = eINSTANCE.getStakeholder_Phone();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.AssuranceArgumentImpl <em>Assurance Argument</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.AssuranceArgumentImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAssuranceArgument()
     * @generated
     */
    EClass ASSURANCE_ARGUMENT = eINSTANCE.getAssuranceArgument();

    /**
     * The meta object literal for the '<em><b>Expression</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_ARGUMENT__EXPRESSION = eINSTANCE.getAssuranceArgument_Expression();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_ARGUMENT__RATIONALE = eINSTANCE.getAssuranceArgument_Rationale();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ArgumentExprImpl <em>Argument Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ArgumentExprImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getArgumentExpr()
     * @generated
     */
    EClass ARGUMENT_EXPR = eINSTANCE.getArgumentExpr();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ArgumentReferenceImpl <em>Argument Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ArgumentReferenceImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getArgumentReference()
     * @generated
     */
    EClass ARGUMENT_REFERENCE = eINSTANCE.getArgumentReference();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ARGUMENT_REFERENCE__REFERENCE = eINSTANCE.getArgumentReference_Reference();

    /**
     * The meta object literal for the '<em><b>Weight</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ARGUMENT_REFERENCE__WEIGHT = eINSTANCE.getArgumentReference_Weight();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationActivity()
     * @generated
     */
    EClass VERIFICATION_ACTIVITY = eINSTANCE.getVerificationActivity();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__NAME = eINSTANCE.getVerificationActivity_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__TITLE = eINSTANCE.getVerificationActivity_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__DESCRIPTION = eINSTANCE.getVerificationActivity_Description();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__CATEGORY = eINSTANCE.getVerificationActivity_Category();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__METHOD = eINSTANCE.getVerificationActivity_Method();

    /**
     * The meta object literal for the '<em><b>Assumption</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__ASSUMPTION = eINSTANCE.getVerificationActivity_Assumption();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl <em>Verification Method</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationMethodImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationMethod()
     * @generated
     */
    EClass VERIFICATION_METHOD = eINSTANCE.getVerificationMethod();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__NAME = eINSTANCE.getVerificationMethod_Name();

    /**
     * The meta object literal for the '<em><b>Language</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__LANGUAGE = eINSTANCE.getVerificationMethod_Language();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__METHOD = eINSTANCE.getVerificationMethod_Method();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__TITLE = eINSTANCE.getVerificationMethod_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_METHOD__DESCRIPTION = eINSTANCE.getVerificationMethod_Description();

    /**
     * The meta object literal for the '<em><b>Category</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_METHOD__CATEGORY = eINSTANCE.getVerificationMethod_Category();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.AssuranceCaseImpl <em>Assurance Case</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.AssuranceCaseImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAssuranceCase()
     * @generated
     */
    EClass ASSURANCE_CASE = eINSTANCE.getAssuranceCase();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE__TARGET = eINSTANCE.getAssuranceCase_Target();

    /**
     * The meta object literal for the '<em><b>Results</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_CASE__RESULTS = eINSTANCE.getAssuranceCase_Results();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl <em>Verification Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResult()
     * @generated
     */
    EClass VERIFICATION_RESULT = eINSTANCE.getVerificationResult();

    /**
     * The meta object literal for the '<em><b>Verification Activity</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__VERIFICATION_ACTIVITY = eINSTANCE.getVerificationResult_VerificationActivity();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_RESULT__TITLE = eINSTANCE.getVerificationResult_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_RESULT__DESCRIPTION = eINSTANCE.getVerificationResult_Description();

    /**
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_RESULT__METHOD = eINSTANCE.getVerificationResult_Method();

    /**
     * The meta object literal for the '<em><b>State</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_RESULT__STATE = eINSTANCE.getVerificationResult_State();

    /**
     * The meta object literal for the '<em><b>Status</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_RESULT__STATUS = eINSTANCE.getVerificationResult_Status();

    /**
     * The meta object literal for the '<em><b>Assumption Verification Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__ASSUMPTION_VERIFICATION_RESULT = eINSTANCE.getVerificationResult_AssumptionVerificationResult();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl <em>Assurance Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.AssuranceResultImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAssuranceResult()
     * @generated
     */
    EClass ASSURANCE_RESULT = eINSTANCE.getAssuranceResult();

    /**
     * The meta object literal for the '<em><b>Requirement</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_RESULT__REQUIREMENT = eINSTANCE.getAssuranceResult_Requirement();

    /**
     * The meta object literal for the '<em><b>Pass Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_RESULT__PASS_COUNT = eINSTANCE.getAssuranceResult_PassCount();

    /**
     * The meta object literal for the '<em><b>Fail Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_RESULT__FAIL_COUNT = eINSTANCE.getAssuranceResult_FailCount();

    /**
     * The meta object literal for the '<em><b>Neutral Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_RESULT__NEUTRAL_COUNT = eINSTANCE.getAssuranceResult_NeutralCount();

    /**
     * The meta object literal for the '<em><b>Unknown Count</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ASSURANCE_RESULT__UNKNOWN_COUNT = eINSTANCE.getAssuranceResult_UnknownCount();

    /**
     * The meta object literal for the '<em><b>Sub Claim Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_RESULT__SUB_CLAIM_RESULT = eINSTANCE.getAssuranceResult_SubClaimResult();

    /**
     * The meta object literal for the '<em><b>Sub VA Result</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ASSURANCE_RESULT__SUB_VA_RESULT = eINSTANCE.getAssuranceResult_SubVAResult();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALResultImpl <em>RSAL Result</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RSALResultImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALResult()
     * @generated
     */
    EClass RSAL_RESULT = eINSTANCE.getRSALResult();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute RSAL_RESULT__NAME = eINSTANCE.getRSALResult_Name();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.BinaryExprImpl <em>Binary Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.BinaryExprImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getBinaryExpr()
     * @generated
     */
    EClass BINARY_EXPR = eINSTANCE.getBinaryExpr();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__LEFT = eINSTANCE.getBinaryExpr_Left();

    /**
     * The meta object literal for the '<em><b>Op</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute BINARY_EXPR__OP = eINSTANCE.getBinaryExpr_Op();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference BINARY_EXPR__RIGHT = eINSTANCE.getBinaryExpr_Right();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RefExprImpl <em>Ref Expr</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RefExprImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRefExpr()
     * @generated
     */
    EClass REF_EXPR = eINSTANCE.getRefExpr();

    /**
     * The meta object literal for the '<em><b>Id</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REF_EXPR__ID = eINSTANCE.getRefExpr_Id();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.VerificationResultState <em>Verification Result State</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.VerificationResultState
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResultState()
     * @generated
     */
    EEnum VERIFICATION_RESULT_STATE = eINSTANCE.getVerificationResultState();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.VerificationResultStatus <em>Verification Result Status</em>}' enum.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.VerificationResultStatus
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResultStatus()
     * @generated
     */
    EEnum VERIFICATION_RESULT_STATUS = eINSTANCE.getVerificationResultStatus();

  }

} //AlisaPackage
