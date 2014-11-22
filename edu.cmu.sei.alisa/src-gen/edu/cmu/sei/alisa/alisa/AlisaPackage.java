/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.osate.aadl2.Aadl2Package;

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
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl <em>RSAL Container</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALContainer()
   * @generated
   */
  int RSAL_CONTAINER = 1;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__OWNED_ELEMENT = ALISA_MODEL__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__OWNED_COMMENT = ALISA_MODEL__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__NAME = ALISA_MODEL__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__QUALIFIED_NAME = ALISA_MODEL__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__OWNED_PROPERTY_ASSOCIATION = ALISA_MODEL__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Imported Namespace</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_CONTAINER__IMPORTED_NAMESPACE = ALISA_MODEL_FEATURE_COUNT + 0;

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
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALElementImpl <em>RSAL Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RSALElementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALElement()
   * @generated
   */
  int RSAL_ELEMENT = 2;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_ELEMENT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_ELEMENT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_ELEMENT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_ELEMENT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_ELEMENT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The number of structural features of the '<em>RSAL Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int RSAL_ELEMENT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

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
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__OWNED_ELEMENT = ALISA_MODEL__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__OWNED_COMMENT = ALISA_MODEL__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__NAME = ALISA_MODEL__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__QUALIFIED_NAME = ALISA_MODEL__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ORGANIZATION__OWNED_PROPERTY_ASSOCIATION = ALISA_MODEL__OWNED_PROPERTY_ASSOCIATION;

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
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getContractualElement()
   * @generated
   */
  int CONTRACTUAL_ELEMENT = 4;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__TARGET = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__CATEGORY = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__TITLE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__DESCRIPTION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__ASSERT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__RATIONALE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__ISSUE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Section Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__SECTION_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__REFINES_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Decomposes Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__DECOMPOSES_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Evolves Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__EVOLVES_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Conflicts Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__CONFLICTS_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Stakeholder Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__STAKEHOLDER_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__STAKEHOLDER_REQUIREMENT_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>System Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__SYSTEM_REQUIREMENT_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT__DOC_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 15;

  /**
   * The number of structural features of the '<em>Contractual Element</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CONTRACTUAL_ELEMENT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 16;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.GoalImpl <em>Goal</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.GoalImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getGoal()
   * @generated
   */
  int GOAL = 5;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__OWNED_ELEMENT = RSAL_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__OWNED_COMMENT = RSAL_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = RSAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__QUALIFIED_NAME = RSAL_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__OWNED_PROPERTY_ASSOCIATION = RSAL_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TARGET = RSAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CATEGORY = RSAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TITLE = RSAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = RSAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ASSERT = RSAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__RATIONALE = RSAL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ISSUE = RSAL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Section Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__SECTION_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__REFINES_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Decomposes Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DECOMPOSES_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Evolves Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__EVOLVES_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Conflicts Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__CONFLICTS_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Stakeholder Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>System Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__SYSTEM_REQUIREMENT_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DOC_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 15;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = RSAL_ELEMENT_FEATURE_COUNT + 16;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RequirementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 6;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__OWNED_ELEMENT = RSAL_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__OWNED_COMMENT = RSAL_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = RSAL_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__QUALIFIED_NAME = RSAL_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__OWNED_PROPERTY_ASSOCIATION = RSAL_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TARGET = RSAL_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Category</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__CATEGORY = RSAL_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TITLE = RSAL_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = RSAL_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ASSERT = RSAL_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RATIONALE = RSAL_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ISSUE = RSAL_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The feature id for the '<em><b>Section Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__SECTION_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 7;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REFINES_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 8;

  /**
   * The feature id for the '<em><b>Decomposes Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DECOMPOSES_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 9;

  /**
   * The feature id for the '<em><b>Evolves Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__EVOLVES_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 10;

  /**
   * The feature id for the '<em><b>Conflicts Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__CONFLICTS_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 11;

  /**
   * The feature id for the '<em><b>Stakeholder Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STAKEHOLDER_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 12;

  /**
   * The feature id for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STAKEHOLDER_REQUIREMENT_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 13;

  /**
   * The feature id for the '<em><b>System Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__SYSTEM_REQUIREMENT_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 14;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DOC_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 15;

  /**
   * The feature id for the '<em><b>Goal Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__GOAL_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 16;

  /**
   * The feature id for the '<em><b>Hazard Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__HAZARD_REFERENCE = RSAL_ELEMENT_FEATURE_COUNT + 17;

  /**
   * The feature id for the '<em><b>Verified By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__VERIFIED_BY = RSAL_ELEMENT_FEATURE_COUNT + 18;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = RSAL_ELEMENT_FEATURE_COUNT + 19;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl <em>External Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getExternalDocument()
   * @generated
   */
  int EXTERNAL_DOCUMENT = 7;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>External Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__EXTERNAL_REFERENCE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.XDocUriImpl <em>XDoc Uri</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.XDocUriImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getXDocUri()
   * @generated
   */
  int XDOC_URI = 8;

  /**
   * The feature id for the '<em><b>Doc Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOC_URI__DOC_REFERENCE = 0;

  /**
   * The feature id for the '<em><b>Doc Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOC_URI__DOC_FRAGMENT = 1;

  /**
   * The number of structural features of the '<em>XDoc Uri</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int XDOC_URI_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.CategoryImpl <em>Category</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.CategoryImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getCategory()
   * @generated
   */
  int CATEGORY = 9;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY__EXTENDS = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Category</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int CATEGORY_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.StakeholderImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 10;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__TITLE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__DESCRIPTION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Role</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__ROLE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Organziation</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__ORGANZIATION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Email</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__EMAIL = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Phone</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER__PHONE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationDecompositionImpl <em>Verification Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationDecompositionImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationDecomposition()
   * @generated
   */
  int VERIFICATION_DECOMPOSITION = 11;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_DECOMPOSITION__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_DECOMPOSITION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_DECOMPOSITION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_DECOMPOSITION__RIGHT = 3;

  /**
   * The number of structural features of the '<em>Verification Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_DECOMPOSITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationActivity()
   * @generated
   */
  int VERIFICATION_ACTIVITY = 12;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__TITLE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__DESCRIPTION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__METHOD = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Decomposed To</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__DECOMPOSED_TO = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>Assigned To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__ASSIGNED_TO = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The number of structural features of the '<em>Verification Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl <em>Verification Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResult()
   * @generated
   */
  int VERIFICATION_RESULT = 13;

  /**
   * The feature id for the '<em><b>Owned Element</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__OWNED_ELEMENT = Aadl2Package.NAMED_ELEMENT__OWNED_ELEMENT;

  /**
   * The feature id for the '<em><b>Owned Comment</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__OWNED_COMMENT = Aadl2Package.NAMED_ELEMENT__OWNED_COMMENT;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__NAME = Aadl2Package.NAMED_ELEMENT__NAME;

  /**
   * The feature id for the '<em><b>Qualified Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__QUALIFIED_NAME = Aadl2Package.NAMED_ELEMENT__QUALIFIED_NAME;

  /**
   * The feature id for the '<em><b>Owned Property Association</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__OWNED_PROPERTY_ASSOCIATION = Aadl2Package.NAMED_ELEMENT__OWNED_PROPERTY_ASSOCIATION;

  /**
   * The feature id for the '<em><b>Referenced Verification Method</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__TITLE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__DESCRIPTION = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 2;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__METHOD = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 3;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATE = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 4;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATUS = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 5;

  /**
   * The number of structural features of the '<em>Verification Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT_FEATURE_COUNT = Aadl2Package.NAMED_ELEMENT_FEATURE_COUNT + 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.VerificationResultState <em>Verification Result State</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.VerificationResultState
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResultState()
   * @generated
   */
  int VERIFICATION_RESULT_STATE = 14;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.VerificationResultStatus <em>Verification Result Status</em>}' enum.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.VerificationResultStatus
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResultStatus()
   * @generated
   */
  int VERIFICATION_RESULT_STATUS = 15;


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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RSALContainer <em>RSAL Container</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RSAL Container</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALContainer
   * @generated
   */
  EClass getRSALContainer();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.RSALContainer#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Namespace</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALContainer#getImportedNamespace()
   * @see #getRSALContainer()
   * @generated
   */
  EReference getRSALContainer_ImportedNamespace();

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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RSALElement <em>RSAL Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>RSAL Element</em>'.
   * @see edu.cmu.sei.alisa.alisa.RSALElement
   * @generated
   */
  EClass getRSALElement();

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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ContractualElement <em>Contractual Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Contractual Element</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement
   * @generated
   */
  EClass getContractualElement();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getTarget()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_Target();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getDescription()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Description();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getAssert <em>Assert</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Assert</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getAssert()
   * @see #getContractualElement()
   * @generated
   */
  EAttribute getContractualElement_Assert();

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
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getSectionReference <em>Section Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Section Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getSectionReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_SectionReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getRefinesReference <em>Refines Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Refines Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getRefinesReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_RefinesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDecomposesReference <em>Decomposes Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Decomposes Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getDecomposesReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_DecomposesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getEvolvesReference <em>Evolves Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Evolves Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getEvolvesReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_EvolvesReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getConflictsReference <em>Conflicts Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Conflicts Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getConflictsReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_ConflictsReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getStakeholderReference <em>Stakeholder Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholder Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getStakeholderReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_StakeholderReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholder Requirement Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getStakeholderRequirementReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_StakeholderRequirementReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getSystemRequirementReference <em>System Requirement Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>System Requirement Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getSystemRequirementReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_SystemRequirementReference();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Doc Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ContractualElement#getDocReference()
   * @see #getContractualElement()
   * @generated
   */
  EReference getContractualElement_DocReference();

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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Requirement <em>Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement
   * @generated
   */
  EClass getRequirement();

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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ExternalDocument <em>External Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Document</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument
   * @generated
   */
  EClass getExternalDocument();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getExternalReference <em>External Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>External Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument#getExternalReference()
   * @see #getExternalDocument()
   * @generated
   */
  EAttribute getExternalDocument_ExternalReference();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.XDocUri <em>XDoc Uri</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>XDoc Uri</em>'.
   * @see edu.cmu.sei.alisa.alisa.XDocUri
   * @generated
   */
  EClass getXDocUri();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.XDocUri#getDocReference <em>Doc Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Doc Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.XDocUri#getDocReference()
   * @see #getXDocUri()
   * @generated
   */
  EReference getXDocUri_DocReference();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.XDocUri#getDocFragment <em>Doc Fragment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Doc Fragment</em>'.
   * @see edu.cmu.sei.alisa.alisa.XDocUri#getDocFragment()
   * @see #getXDocUri()
   * @generated
   */
  EAttribute getXDocUri_DocFragment();

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
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Category#getExtends <em>Extends</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Extends</em>'.
   * @see edu.cmu.sei.alisa.alisa.Category#getExtends()
   * @see #getCategory()
   * @generated
   */
  EReference getCategory_Extends();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholder#getOrganziation <em>Organziation</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Organziation</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder#getOrganziation()
   * @see #getStakeholder()
   * @generated
   */
  EAttribute getStakeholder_Organziation();

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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition <em>Verification Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Decomposition</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationDecomposition
   * @generated
   */
  EClass getVerificationDecomposition();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationDecomposition#getElement()
   * @see #getVerificationDecomposition()
   * @generated
   */
  EReference getVerificationDecomposition_Element();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationDecomposition#getLeft()
   * @see #getVerificationDecomposition()
   * @generated
   */
  EReference getVerificationDecomposition_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationDecomposition#getType()
   * @see #getVerificationDecomposition()
   * @generated
   */
  EAttribute getVerificationDecomposition_Type();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationDecomposition#getRight()
   * @see #getVerificationDecomposition()
   * @generated
   */
  EReference getVerificationDecomposition_Right();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getMethod <em>Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Method</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getMethod()
   * @see #getVerificationActivity()
   * @generated
   */
  EAttribute getVerificationActivity_Method();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getDecomposedTo <em>Decomposed To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decomposed To</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getDecomposedTo()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_DecomposedTo();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getAssignedTo <em>Assigned To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assigned To</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity#getAssignedTo()
   * @see #getVerificationActivity()
   * @generated
   */
  EReference getVerificationActivity_AssignedTo();

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
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getReferencedVerificationMethod <em>Referenced Verification Method</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Referenced Verification Method</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getReferencedVerificationMethod()
   * @see #getVerificationResult()
   * @generated
   */
  EReference getVerificationResult_ReferencedVerificationMethod();

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
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl <em>RSAL Container</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RSALContainerImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALContainer()
     * @generated
     */
    EClass RSAL_CONTAINER = eINSTANCE.getRSALContainer();

    /**
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference RSAL_CONTAINER__IMPORTED_NAMESPACE = eINSTANCE.getRSALContainer_ImportedNamespace();

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
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RSALElementImpl <em>RSAL Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RSALElementImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRSALElement()
     * @generated
     */
    EClass RSAL_ELEMENT = eINSTANCE.getRSALElement();

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
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl <em>Contractual Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ContractualElementImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getContractualElement()
     * @generated
     */
    EClass CONTRACTUAL_ELEMENT = eINSTANCE.getContractualElement();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__TARGET = eINSTANCE.getContractualElement_Target();

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
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__DESCRIPTION = eINSTANCE.getContractualElement_Description();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute CONTRACTUAL_ELEMENT__ASSERT = eINSTANCE.getContractualElement_Assert();

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
     * The meta object literal for the '<em><b>Section Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__SECTION_REFERENCE = eINSTANCE.getContractualElement_SectionReference();

    /**
     * The meta object literal for the '<em><b>Refines Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__REFINES_REFERENCE = eINSTANCE.getContractualElement_RefinesReference();

    /**
     * The meta object literal for the '<em><b>Decomposes Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__DECOMPOSES_REFERENCE = eINSTANCE.getContractualElement_DecomposesReference();

    /**
     * The meta object literal for the '<em><b>Evolves Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__EVOLVES_REFERENCE = eINSTANCE.getContractualElement_EvolvesReference();

    /**
     * The meta object literal for the '<em><b>Conflicts Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__CONFLICTS_REFERENCE = eINSTANCE.getContractualElement_ConflictsReference();

    /**
     * The meta object literal for the '<em><b>Stakeholder Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__STAKEHOLDER_REFERENCE = eINSTANCE.getContractualElement_StakeholderReference();

    /**
     * The meta object literal for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__STAKEHOLDER_REQUIREMENT_REFERENCE = eINSTANCE.getContractualElement_StakeholderRequirementReference();

    /**
     * The meta object literal for the '<em><b>System Requirement Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__SYSTEM_REQUIREMENT_REFERENCE = eINSTANCE.getContractualElement_SystemRequirementReference();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CONTRACTUAL_ELEMENT__DOC_REFERENCE = eINSTANCE.getContractualElement_DocReference();

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
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl <em>Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RequirementImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirement()
     * @generated
     */
    EClass REQUIREMENT = eINSTANCE.getRequirement();

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
     * The meta object literal for the '<em><b>Verified By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__VERIFIED_BY = eINSTANCE.getRequirement_VerifiedBy();

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
     * The meta object literal for the '<em><b>External Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DOCUMENT__EXTERNAL_REFERENCE = eINSTANCE.getExternalDocument_ExternalReference();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.XDocUriImpl <em>XDoc Uri</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.XDocUriImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getXDocUri()
     * @generated
     */
    EClass XDOC_URI = eINSTANCE.getXDocUri();

    /**
     * The meta object literal for the '<em><b>Doc Reference</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference XDOC_URI__DOC_REFERENCE = eINSTANCE.getXDocUri_DocReference();

    /**
     * The meta object literal for the '<em><b>Doc Fragment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute XDOC_URI__DOC_FRAGMENT = eINSTANCE.getXDocUri_DocFragment();

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
     * The meta object literal for the '<em><b>Extends</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference CATEGORY__EXTENDS = eINSTANCE.getCategory_Extends();

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
     * The meta object literal for the '<em><b>Organziation</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDER__ORGANZIATION = eINSTANCE.getStakeholder_Organziation();

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
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationDecompositionImpl <em>Verification Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationDecompositionImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationDecomposition()
     * @generated
     */
    EClass VERIFICATION_DECOMPOSITION = eINSTANCE.getVerificationDecomposition();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_DECOMPOSITION__ELEMENT = eINSTANCE.getVerificationDecomposition_Element();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_DECOMPOSITION__LEFT = eINSTANCE.getVerificationDecomposition_Left();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_DECOMPOSITION__TYPE = eINSTANCE.getVerificationDecomposition_Type();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_DECOMPOSITION__RIGHT = eINSTANCE.getVerificationDecomposition_Right();

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
     * The meta object literal for the '<em><b>Method</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_ACTIVITY__METHOD = eINSTANCE.getVerificationActivity_Method();

    /**
     * The meta object literal for the '<em><b>Decomposed To</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__DECOMPOSED_TO = eINSTANCE.getVerificationActivity_DecomposedTo();

    /**
     * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_ACTIVITY__ASSIGNED_TO = eINSTANCE.getVerificationActivity_AssignedTo();

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
     * The meta object literal for the '<em><b>Referenced Verification Method</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD = eINSTANCE.getVerificationResult_ReferencedVerificationMethod();

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
