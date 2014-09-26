/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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
   * The feature id for the '<em><b>Imported Namespace</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__IMPORTED_NAMESPACE = 0;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL__CONTENT = 1;

  /**
   * The number of structural features of the '<em>Model</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALISA_MODEL_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.DocumentImpl <em>Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.DocumentImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDocument()
   * @generated
   */
  int DOCUMENT = 1;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT__NAME = 0;

  /**
   * The number of structural features of the '<em>Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENT_FEATURE_COUNT = 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementDocumentImpl <em>Requirement Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RequirementDocumentImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirementDocument()
   * @generated
   */
  int REQUIREMENT_DOCUMENT = 2;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_DOCUMENT__NAME = DOCUMENT__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_DOCUMENT__CONTENT = DOCUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Requirement Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_DOCUMENT_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationLibraryImpl <em>Verification Library</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationLibraryImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationLibrary()
   * @generated
   */
  int VERIFICATION_LIBRARY = 3;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY__NAME = DOCUMENT__NAME;

  /**
   * The feature id for the '<em><b>Content</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY__CONTENT = DOCUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>Verification Library</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_LIBRARY_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.GoalsImpl <em>Goals</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.GoalsImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getGoals()
   * @generated
   */
  int GOALS = 4;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__NAME = 0;

  /**
   * The feature id for the '<em><b>Goal Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__GOAL_TARGET = 1;

  /**
   * The feature id for the '<em><b>Goals</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS__GOALS = 2;

  /**
   * The number of structural features of the '<em>Goals</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOALS_FEATURE_COUNT = 3;

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
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__NAME = 0;

  /**
   * The feature id for the '<em><b>Element</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ELEMENT = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__TITLE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ASSERT = 4;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__RATIONALE = 5;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__ISSUE = 6;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__MODEL_REFERENCE = 7;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__REFINES_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Decomposes Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DECOMPOSES_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Evolves Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__EVOLVES_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Stakeholder Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__STAKEHOLDER_REQUIREMENT_REFERENCE = 12;

  /**
   * The feature id for the '<em><b>Doc References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL__DOC_REFERENCES = 13;

  /**
   * The number of structural features of the '<em>Goal</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int GOAL_FEATURE_COUNT = 14;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementsImpl <em>Requirements</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RequirementsImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirements()
   * @generated
   */
  int REQUIREMENTS = 6;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENTS__NAME = 0;

  /**
   * The feature id for the '<em><b>Req Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENTS__REQ_TARGET = 1;

  /**
   * The feature id for the '<em><b>Reqs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENTS__REQS = 2;

  /**
   * The number of structural features of the '<em>Requirements</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENTS_FEATURE_COUNT = 3;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementImpl <em>Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.RequirementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirement()
   * @generated
   */
  int REQUIREMENT = 7;

  /**
   * The feature id for the '<em><b>Reqkind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REQKIND = 0;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__NAME = 1;

  /**
   * The feature id for the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TARGET = 2;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__TITLE = 3;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DESCRIPTION = 4;

  /**
   * The feature id for the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ASSERT = 5;

  /**
   * The feature id for the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__RATIONALE = 6;

  /**
   * The feature id for the '<em><b>Issue</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__ISSUE = 7;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__MODEL_REFERENCE = 8;

  /**
   * The feature id for the '<em><b>Goal Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__GOAL_REFERENCE = 9;

  /**
   * The feature id for the '<em><b>Hazard Reference</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__HAZARD_REFERENCE = 10;

  /**
   * The feature id for the '<em><b>Refines Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__REFINES_REFERENCE = 11;

  /**
   * The feature id for the '<em><b>Decomposes Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DECOMPOSES_REFERENCE = 12;

  /**
   * The feature id for the '<em><b>Evolves Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__EVOLVES_REFERENCE = 13;

  /**
   * The feature id for the '<em><b>Verified By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__VERIFIED_BY = 14;

  /**
   * The feature id for the '<em><b>Stakeholderreq Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__STAKEHOLDERREQ_REFERENCE = 15;

  /**
   * The feature id for the '<em><b>Systemreq Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__SYSTEMREQ_REFERENCE = 16;

  /**
   * The feature id for the '<em><b>Doc References</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT__DOC_REFERENCES = 17;

  /**
   * The number of structural features of the '<em>Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REQUIREMENT_FEATURE_COUNT = 18;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentsImpl <em>External Documents</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ExternalDocumentsImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getExternalDocuments()
   * @generated
   */
  int EXTERNAL_DOCUMENTS = 8;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENTS__NAME = DOCUMENT__NAME;

  /**
   * The feature id for the '<em><b>Docs</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENTS__DOCS = DOCUMENT_FEATURE_COUNT + 0;

  /**
   * The number of structural features of the '<em>External Documents</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENTS_FEATURE_COUNT = DOCUMENT_FEATURE_COUNT + 1;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl <em>External Document</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ExternalDocumentImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getExternalDocument()
   * @generated
   */
  int EXTERNAL_DOCUMENT = 9;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Xternal Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT__XTERNAL_REFERENCE = 1;

  /**
   * The number of structural features of the '<em>External Document</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int EXTERNAL_DOCUMENT_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.AliasesImpl <em>Aliases</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.AliasesImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAliases()
   * @generated
   */
  int ALIASES = 10;

  /**
   * The feature id for the '<em><b>Aliases Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASES__ALIASES_TARGET = 0;

  /**
   * The feature id for the '<em><b>Aliases</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASES__ALIASES = 1;

  /**
   * The number of structural features of the '<em>Aliases</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIASES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.AliasImpl <em>Alias</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.AliasImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAlias()
   * @generated
   */
  int ALIAS = 11;

  /**
   * The feature id for the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__ALIAS = 0;

  /**
   * The feature id for the '<em><b>Doc Ref</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS__DOC_REF = 1;

  /**
   * The number of structural features of the '<em>Alias</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ALIAS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.NotesImpl <em>Notes</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.NotesImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getNotes()
   * @generated
   */
  int NOTES = 12;

  /**
   * The feature id for the '<em><b>Notes Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTES__NOTES_TARGET = 0;

  /**
   * The feature id for the '<em><b>Notes</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTES__NOTES = 1;

  /**
   * The number of structural features of the '<em>Notes</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int NOTES_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.StakeholderImpl <em>Stakeholder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.StakeholderImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getStakeholder()
   * @generated
   */
  int STAKEHOLDER = 13;

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
   * The number of structural features of the '<em>Stakeholder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDER_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.StakeholdersImpl <em>Stakeholders</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.StakeholdersImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getStakeholders()
   * @generated
   */
  int STAKEHOLDERS = 14;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDERS__NAME = 0;

  /**
   * The feature id for the '<em><b>Stakeholder</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDERS__STAKEHOLDER = 1;

  /**
   * The number of structural features of the '<em>Stakeholders</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int STAKEHOLDERS_FEATURE_COUNT = 2;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementImpl <em>Documented Requirement</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDocumentedRequirement()
   * @generated
   */
  int DOCUMENTED_REQUIREMENT = 15;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__NAME = 0;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__TITLE = 1;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__DESCRIPTION = 2;

  /**
   * The feature id for the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__COMMENT = 3;

  /**
   * The feature id for the '<em><b>Assigned To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__ASSIGNED_TO = 4;

  /**
   * The feature id for the '<em><b>Referenced By</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__REFERENCED_BY = 5;

  /**
   * The feature id for the '<em><b>Verified By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__VERIFIED_BY = 6;

  /**
   * The feature id for the '<em><b>Decomposed By</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT__DECOMPOSED_BY = 7;

  /**
   * The number of structural features of the '<em>Documented Requirement</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT_FEATURE_COUNT = 8;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl <em>Documented Requirement Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDocumentedRequirementDecomposition()
   * @generated
   */
  int DOCUMENTED_REQUIREMENT_DECOMPOSITION = 16;

  /**
   * The feature id for the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT = 0;

  /**
   * The feature id for the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT = 1;

  /**
   * The feature id for the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT_DECOMPOSITION__TYPE = 2;

  /**
   * The feature id for the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT = 3;

  /**
   * The number of structural features of the '<em>Documented Requirement Decomposition</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int DOCUMENTED_REQUIREMENT_DECOMPOSITION_FEATURE_COUNT = 4;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationDecompositionImpl <em>Verification Decomposition</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationDecompositionImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationDecomposition()
   * @generated
   */
  int VERIFICATION_DECOMPOSITION = 17;

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
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl <em>Element Type</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getElementType()
   * @generated
   */
  int ELEMENT_TYPE = 18;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__NAME = 0;

  /**
   * The feature id for the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__REFERENCE = 1;

  /**
   * The feature id for the '<em><b>Element Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__ELEMENT_TYPE = 2;

  /**
   * The feature id for the '<em><b>Model Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__MODEL_TYPE = 3;

  /**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__DETAILS = 4;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE__VERSION = 5;

  /**
   * The number of structural features of the '<em>Element Type</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_TYPE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getElementReference()
   * @generated
   */
  int ELEMENT_REFERENCE = 19;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__NAME = 0;

  /**
   * The feature id for the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__URL = 1;

  /**
   * The feature id for the '<em><b>Model Reference</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__MODEL_REFERENCE = 2;

  /**
   * The feature id for the '<em><b>Reference Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__REFERENCE_TYPE = 3;

  /**
   * The feature id for the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__DETAILS = 4;

  /**
   * The feature id for the '<em><b>Version</b></em>' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE__VERSION = 5;

  /**
   * The number of structural features of the '<em>Element Reference</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int ELEMENT_REFERENCE_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl <em>Verification Activity</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationActivityImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationActivity()
   * @generated
   */
  int VERIFICATION_ACTIVITY = 20;

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
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__METHOD = 3;

  /**
   * The feature id for the '<em><b>Decomposed To</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__DECOMPOSED_TO = 4;

  /**
   * The feature id for the '<em><b>Assigned To</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY__ASSIGNED_TO = 5;

  /**
   * The number of structural features of the '<em>Verification Activity</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_ACTIVITY_FEATURE_COUNT = 6;

  /**
   * The meta object id for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl <em>Verification Result</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see edu.cmu.sei.alisa.alisa.impl.VerificationResultImpl
   * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationResult()
   * @generated
   */
  int VERIFICATION_RESULT = 21;

  /**
   * The feature id for the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__NAME = 0;

  /**
   * The feature id for the '<em><b>Referenced Verification Method</b></em>' reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__REFERENCED_VERIFICATION_METHOD = 1;

  /**
   * The feature id for the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__TITLE = 2;

  /**
   * The feature id for the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__DESCRIPTION = 3;

  /**
   * The feature id for the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__METHOD = 4;

  /**
   * The feature id for the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATE = 5;

  /**
   * The feature id for the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT__STATUS = 6;

  /**
   * The number of structural features of the '<em>Verification Result</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int VERIFICATION_RESULT_FEATURE_COUNT = 7;


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
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.AlisaModel#getImportedNamespace <em>Imported Namespace</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Imported Namespace</em>'.
   * @see edu.cmu.sei.alisa.alisa.AlisaModel#getImportedNamespace()
   * @see #getAlisaModel()
   * @generated
   */
  EReference getAlisaModel_ImportedNamespace();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.AlisaModel#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see edu.cmu.sei.alisa.alisa.AlisaModel#getContent()
   * @see #getAlisaModel()
   * @generated
   */
  EReference getAlisaModel_Content();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Document</em>'.
   * @see edu.cmu.sei.alisa.alisa.Document
   * @generated
   */
  EClass getDocument();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Document#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Document#getName()
   * @see #getDocument()
   * @generated
   */
  EAttribute getDocument_Name();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.RequirementDocument <em>Requirement Document</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirement Document</em>'.
   * @see edu.cmu.sei.alisa.alisa.RequirementDocument
   * @generated
   */
  EClass getRequirementDocument();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.RequirementDocument#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see edu.cmu.sei.alisa.alisa.RequirementDocument#getContent()
   * @see #getRequirementDocument()
   * @generated
   */
  EReference getRequirementDocument_Content();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.VerificationLibrary <em>Verification Library</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Verification Library</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationLibrary
   * @generated
   */
  EClass getVerificationLibrary();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.VerificationLibrary#getContent <em>Content</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Content</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationLibrary#getContent()
   * @see #getVerificationLibrary()
   * @generated
   */
  EReference getVerificationLibrary_Content();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Goals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Goals</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goals
   * @generated
   */
  EClass getGoals();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Goals#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goals#getName()
   * @see #getGoals()
   * @generated
   */
  EAttribute getGoals_Name();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Goals#getGoalTarget <em>Goal Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Goal Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goals#getGoalTarget()
   * @see #getGoals()
   * @generated
   */
  EReference getGoals_GoalTarget();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Goals#getGoals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Goals</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goals#getGoals()
   * @see #getGoals()
   * @generated
   */
  EReference getGoals_Goals();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Goal#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getName()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Goal#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getElement()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Element();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Goal#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getTitle()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Goal#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getDescription()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Description();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Goal#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getRationale()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Rationale();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.Goal#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issue</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getIssue()
   * @see #getGoal()
   * @generated
   */
  EAttribute getGoal_Issue();

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
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Goal#getDocReferences <em>Doc References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Doc References</em>'.
   * @see edu.cmu.sei.alisa.alisa.Goal#getDocReferences()
   * @see #getGoal()
   * @generated
   */
  EReference getGoal_DocReferences();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Requirements <em>Requirements</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Requirements</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirements
   * @generated
   */
  EClass getRequirements();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirements#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirements#getName()
   * @see #getRequirements()
   * @generated
   */
  EAttribute getRequirements_Name();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Requirements#getReqTarget <em>Req Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Req Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirements#getReqTarget()
   * @see #getRequirements()
   * @generated
   */
  EReference getRequirements_ReqTarget();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Requirements#getReqs <em>Reqs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Reqs</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirements#getReqs()
   * @see #getRequirements()
   * @generated
   */
  EReference getRequirements_Reqs();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirement#getReqkind <em>Reqkind</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reqkind</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getReqkind()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Reqkind();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getName()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirement#getTarget <em>Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getTarget()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Target();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirement#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getTitle()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getDescription()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Description();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Requirement#getRationale <em>Rationale</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Rationale</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getRationale()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Rationale();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.Requirement#getIssue <em>Issue</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Issue</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getIssue()
   * @see #getRequirement()
   * @generated
   */
  EAttribute getRequirement_Issue();

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
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getStakeholderreqReference <em>Stakeholderreq Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Stakeholderreq Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getStakeholderreqReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_StakeholderreqReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getSystemreqReference <em>Systemreq Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Systemreq Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getSystemreqReference()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_SystemreqReference();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Requirement#getDocReferences <em>Doc References</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Doc References</em>'.
   * @see edu.cmu.sei.alisa.alisa.Requirement#getDocReferences()
   * @see #getRequirement()
   * @generated
   */
  EReference getRequirement_DocReferences();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ExternalDocuments <em>External Documents</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>External Documents</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocuments
   * @generated
   */
  EClass getExternalDocuments();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.ExternalDocuments#getDocs <em>Docs</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Docs</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocuments#getDocs()
   * @see #getExternalDocuments()
   * @generated
   */
  EReference getExternalDocuments_Docs();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument#getName()
   * @see #getExternalDocument()
   * @generated
   */
  EAttribute getExternalDocument_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getXternalReference <em>Xternal Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Xternal Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument#getXternalReference()
   * @see #getExternalDocument()
   * @generated
   */
  EAttribute getExternalDocument_XternalReference();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Aliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Aliases</em>'.
   * @see edu.cmu.sei.alisa.alisa.Aliases
   * @generated
   */
  EClass getAliases();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Aliases#getAliasesTarget <em>Aliases Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Aliases Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Aliases#getAliasesTarget()
   * @see #getAliases()
   * @generated
   */
  EReference getAliases_AliasesTarget();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Aliases#getAliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Aliases</em>'.
   * @see edu.cmu.sei.alisa.alisa.Aliases#getAliases()
   * @see #getAliases()
   * @generated
   */
  EReference getAliases_Aliases();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Alias</em>'.
   * @see edu.cmu.sei.alisa.alisa.Alias
   * @generated
   */
  EClass getAlias();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Alias#getAlias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Alias</em>'.
   * @see edu.cmu.sei.alisa.alisa.Alias#getAlias()
   * @see #getAlias()
   * @generated
   */
  EAttribute getAlias_Alias();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.Alias#getDocRef <em>Doc Ref</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Doc Ref</em>'.
   * @see edu.cmu.sei.alisa.alisa.Alias#getDocRef()
   * @see #getAlias()
   * @generated
   */
  EReference getAlias_DocRef();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Notes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Notes</em>'.
   * @see edu.cmu.sei.alisa.alisa.Notes
   * @generated
   */
  EClass getNotes();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.Notes#getNotesTarget <em>Notes Target</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Notes Target</em>'.
   * @see edu.cmu.sei.alisa.alisa.Notes#getNotesTarget()
   * @see #getNotes()
   * @generated
   */
  EReference getNotes_NotesTarget();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.Notes#getNotes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Notes</em>'.
   * @see edu.cmu.sei.alisa.alisa.Notes#getNotes()
   * @see #getNotes()
   * @generated
   */
  EAttribute getNotes_Notes();

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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.Stakeholders <em>Stakeholders</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Stakeholders</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholders
   * @generated
   */
  EClass getStakeholders();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.Stakeholders#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholders#getName()
   * @see #getStakeholders()
   * @generated
   */
  EAttribute getStakeholders_Name();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.Stakeholders#getStakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Stakeholder</em>'.
   * @see edu.cmu.sei.alisa.alisa.Stakeholders#getStakeholder()
   * @see #getStakeholders()
   * @generated
   */
  EReference getStakeholders_Stakeholder();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement <em>Documented Requirement</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documented Requirement</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement
   * @generated
   */
  EClass getDocumentedRequirement();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getName()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EAttribute getDocumentedRequirement_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getTitle <em>Title</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Title</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getTitle()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EAttribute getDocumentedRequirement_Title();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getDescription <em>Description</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Description</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getDescription()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EAttribute getDocumentedRequirement_Description();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getComment <em>Comment</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Comment</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getComment()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EAttribute getDocumentedRequirement_Comment();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getAssignedTo <em>Assigned To</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Assigned To</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getAssignedTo()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EReference getDocumentedRequirement_AssignedTo();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getReferencedBy <em>Referenced By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Referenced By</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getReferencedBy()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EReference getDocumentedRequirement_ReferencedBy();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getVerifiedBy <em>Verified By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Verified By</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getVerifiedBy()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EReference getDocumentedRequirement_VerifiedBy();

  /**
   * Returns the meta object for the containment reference list '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement#getDecomposedBy <em>Decomposed By</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference list '<em>Decomposed By</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement#getDecomposedBy()
   * @see #getDocumentedRequirement()
   * @generated
   */
  EReference getDocumentedRequirement_DecomposedBy();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition <em>Documented Requirement Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Documented Requirement Decomposition</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition
   * @generated
   */
  EClass getDocumentedRequirementDecomposition();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getElement <em>Element</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Element</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getElement()
   * @see #getDocumentedRequirementDecomposition()
   * @generated
   */
  EReference getDocumentedRequirementDecomposition_Element();

  /**
   * Returns the meta object for the reference '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getLeft <em>Left</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference '<em>Left</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getLeft()
   * @see #getDocumentedRequirementDecomposition()
   * @generated
   */
  EReference getDocumentedRequirementDecomposition_Left();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getType <em>Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Type</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getType()
   * @see #getDocumentedRequirementDecomposition()
   * @generated
   */
  EAttribute getDocumentedRequirementDecomposition_Type();

  /**
   * Returns the meta object for the containment reference '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getRight <em>Right</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the containment reference '<em>Right</em>'.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getRight()
   * @see #getDocumentedRequirementDecomposition()
   * @generated
   */
  EReference getDocumentedRequirementDecomposition_Right();

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
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Type</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementType
   * @generated
   */
  EClass getElementType();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementType#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementType#getName()
   * @see #getElementType()
   * @generated
   */
  EAttribute getElementType_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementType#getReference <em>Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementType#getReference()
   * @see #getElementType()
   * @generated
   */
  EAttribute getElementType_Reference();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementType#getElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Element Type</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementType#getElementType()
   * @see #getElementType()
   * @generated
   */
  EAttribute getElementType_ElementType();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementType#getModelType <em>Model Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Model Type</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementType#getModelType()
   * @see #getElementType()
   * @generated
   */
  EAttribute getElementType_ModelType();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementType#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Details</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementType#getDetails()
   * @see #getElementType()
   * @generated
   */
  EAttribute getElementType_Details();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.ElementType#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Version</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementType#getVersion()
   * @see #getElementType()
   * @generated
   */
  EAttribute getElementType_Version();

  /**
   * Returns the meta object for class '{@link edu.cmu.sei.alisa.alisa.ElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Element Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementReference
   * @generated
   */
  EClass getElementReference();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementReference#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementReference#getName()
   * @see #getElementReference()
   * @generated
   */
  EAttribute getElementReference_Name();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementReference#getUrl <em>Url</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Url</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementReference#getUrl()
   * @see #getElementReference()
   * @generated
   */
  EAttribute getElementReference_Url();

  /**
   * Returns the meta object for the reference list '{@link edu.cmu.sei.alisa.alisa.ElementReference#getModelReference <em>Model Reference</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the reference list '<em>Model Reference</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementReference#getModelReference()
   * @see #getElementReference()
   * @generated
   */
  EReference getElementReference_ModelReference();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementReference#getReferenceType <em>Reference Type</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Reference Type</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementReference#getReferenceType()
   * @see #getElementReference()
   * @generated
   */
  EAttribute getElementReference_ReferenceType();

  /**
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.ElementReference#getDetails <em>Details</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Details</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementReference#getDetails()
   * @see #getElementReference()
   * @generated
   */
  EAttribute getElementReference_Details();

  /**
   * Returns the meta object for the attribute list '{@link edu.cmu.sei.alisa.alisa.ElementReference#getVersion <em>Version</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute list '<em>Version</em>'.
   * @see edu.cmu.sei.alisa.alisa.ElementReference#getVersion()
   * @see #getElementReference()
   * @generated
   */
  EAttribute getElementReference_Version();

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
   * Returns the meta object for the attribute '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getName <em>Name</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for the attribute '<em>Name</em>'.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult#getName()
   * @see #getVerificationResult()
   * @generated
   */
  EAttribute getVerificationResult_Name();

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
     * The meta object literal for the '<em><b>Imported Namespace</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALISA_MODEL__IMPORTED_NAMESPACE = eINSTANCE.getAlisaModel_ImportedNamespace();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALISA_MODEL__CONTENT = eINSTANCE.getAlisaModel_Content();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.DocumentImpl <em>Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.DocumentImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDocument()
     * @generated
     */
    EClass DOCUMENT = eINSTANCE.getDocument();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENT__NAME = eINSTANCE.getDocument_Name();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementDocumentImpl <em>Requirement Document</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RequirementDocumentImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirementDocument()
     * @generated
     */
    EClass REQUIREMENT_DOCUMENT = eINSTANCE.getRequirementDocument();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT_DOCUMENT__CONTENT = eINSTANCE.getRequirementDocument_Content();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.VerificationLibraryImpl <em>Verification Library</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.VerificationLibraryImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getVerificationLibrary()
     * @generated
     */
    EClass VERIFICATION_LIBRARY = eINSTANCE.getVerificationLibrary();

    /**
     * The meta object literal for the '<em><b>Content</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference VERIFICATION_LIBRARY__CONTENT = eINSTANCE.getVerificationLibrary_Content();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.GoalsImpl <em>Goals</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.GoalsImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getGoals()
     * @generated
     */
    EClass GOALS = eINSTANCE.getGoals();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOALS__NAME = eINSTANCE.getGoals_Name();

    /**
     * The meta object literal for the '<em><b>Goal Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOALS__GOAL_TARGET = eINSTANCE.getGoals_GoalTarget();

    /**
     * The meta object literal for the '<em><b>Goals</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOALS__GOALS = eINSTANCE.getGoals_Goals();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__NAME = eINSTANCE.getGoal_Name();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__ELEMENT = eINSTANCE.getGoal_Element();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__TITLE = eINSTANCE.getGoal_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__DESCRIPTION = eINSTANCE.getGoal_Description();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__ASSERT = eINSTANCE.getGoal_Assert();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__RATIONALE = eINSTANCE.getGoal_Rationale();

    /**
     * The meta object literal for the '<em><b>Issue</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__ISSUE = eINSTANCE.getGoal_Issue();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute GOAL__MODEL_REFERENCE = eINSTANCE.getGoal_ModelReference();

    /**
     * The meta object literal for the '<em><b>Refines Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__REFINES_REFERENCE = eINSTANCE.getGoal_RefinesReference();

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
     * The meta object literal for the '<em><b>Doc References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference GOAL__DOC_REFERENCES = eINSTANCE.getGoal_DocReferences();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.RequirementsImpl <em>Requirements</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.RequirementsImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getRequirements()
     * @generated
     */
    EClass REQUIREMENTS = eINSTANCE.getRequirements();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENTS__NAME = eINSTANCE.getRequirements_Name();

    /**
     * The meta object literal for the '<em><b>Req Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENTS__REQ_TARGET = eINSTANCE.getRequirements_ReqTarget();

    /**
     * The meta object literal for the '<em><b>Reqs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENTS__REQS = eINSTANCE.getRequirements_Reqs();

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
     * The meta object literal for the '<em><b>Reqkind</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__REQKIND = eINSTANCE.getRequirement_Reqkind();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__NAME = eINSTANCE.getRequirement_Name();

    /**
     * The meta object literal for the '<em><b>Target</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__TARGET = eINSTANCE.getRequirement_Target();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__TITLE = eINSTANCE.getRequirement_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__DESCRIPTION = eINSTANCE.getRequirement_Description();

    /**
     * The meta object literal for the '<em><b>Assert</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__ASSERT = eINSTANCE.getRequirement_Assert();

    /**
     * The meta object literal for the '<em><b>Rationale</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__RATIONALE = eINSTANCE.getRequirement_Rationale();

    /**
     * The meta object literal for the '<em><b>Issue</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__ISSUE = eINSTANCE.getRequirement_Issue();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute REQUIREMENT__MODEL_REFERENCE = eINSTANCE.getRequirement_ModelReference();

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
     * The meta object literal for the '<em><b>Verified By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__VERIFIED_BY = eINSTANCE.getRequirement_VerifiedBy();

    /**
     * The meta object literal for the '<em><b>Stakeholderreq Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__STAKEHOLDERREQ_REFERENCE = eINSTANCE.getRequirement_StakeholderreqReference();

    /**
     * The meta object literal for the '<em><b>Systemreq Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__SYSTEMREQ_REFERENCE = eINSTANCE.getRequirement_SystemreqReference();

    /**
     * The meta object literal for the '<em><b>Doc References</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference REQUIREMENT__DOC_REFERENCES = eINSTANCE.getRequirement_DocReferences();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentsImpl <em>External Documents</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ExternalDocumentsImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getExternalDocuments()
     * @generated
     */
    EClass EXTERNAL_DOCUMENTS = eINSTANCE.getExternalDocuments();

    /**
     * The meta object literal for the '<em><b>Docs</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference EXTERNAL_DOCUMENTS__DOCS = eINSTANCE.getExternalDocuments_Docs();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DOCUMENT__NAME = eINSTANCE.getExternalDocument_Name();

    /**
     * The meta object literal for the '<em><b>Xternal Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute EXTERNAL_DOCUMENT__XTERNAL_REFERENCE = eINSTANCE.getExternalDocument_XternalReference();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.AliasesImpl <em>Aliases</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.AliasesImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAliases()
     * @generated
     */
    EClass ALIASES = eINSTANCE.getAliases();

    /**
     * The meta object literal for the '<em><b>Aliases Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIASES__ALIASES_TARGET = eINSTANCE.getAliases_AliasesTarget();

    /**
     * The meta object literal for the '<em><b>Aliases</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIASES__ALIASES = eINSTANCE.getAliases_Aliases();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.AliasImpl <em>Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.AliasImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getAlias()
     * @generated
     */
    EClass ALIAS = eINSTANCE.getAlias();

    /**
     * The meta object literal for the '<em><b>Alias</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ALIAS__ALIAS = eINSTANCE.getAlias_Alias();

    /**
     * The meta object literal for the '<em><b>Doc Ref</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ALIAS__DOC_REF = eINSTANCE.getAlias_DocRef();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.NotesImpl <em>Notes</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.NotesImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getNotes()
     * @generated
     */
    EClass NOTES = eINSTANCE.getNotes();

    /**
     * The meta object literal for the '<em><b>Notes Target</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference NOTES__NOTES_TARGET = eINSTANCE.getNotes_NotesTarget();

    /**
     * The meta object literal for the '<em><b>Notes</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute NOTES__NOTES = eINSTANCE.getNotes_Notes();

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
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.StakeholdersImpl <em>Stakeholders</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.StakeholdersImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getStakeholders()
     * @generated
     */
    EClass STAKEHOLDERS = eINSTANCE.getStakeholders();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute STAKEHOLDERS__NAME = eINSTANCE.getStakeholders_Name();

    /**
     * The meta object literal for the '<em><b>Stakeholder</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference STAKEHOLDERS__STAKEHOLDER = eINSTANCE.getStakeholders_Stakeholder();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementImpl <em>Documented Requirement</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDocumentedRequirement()
     * @generated
     */
    EClass DOCUMENTED_REQUIREMENT = eINSTANCE.getDocumentedRequirement();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTED_REQUIREMENT__NAME = eINSTANCE.getDocumentedRequirement_Name();

    /**
     * The meta object literal for the '<em><b>Title</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTED_REQUIREMENT__TITLE = eINSTANCE.getDocumentedRequirement_Title();

    /**
     * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTED_REQUIREMENT__DESCRIPTION = eINSTANCE.getDocumentedRequirement_Description();

    /**
     * The meta object literal for the '<em><b>Comment</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTED_REQUIREMENT__COMMENT = eINSTANCE.getDocumentedRequirement_Comment();

    /**
     * The meta object literal for the '<em><b>Assigned To</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_REQUIREMENT__ASSIGNED_TO = eINSTANCE.getDocumentedRequirement_AssignedTo();

    /**
     * The meta object literal for the '<em><b>Referenced By</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_REQUIREMENT__REFERENCED_BY = eINSTANCE.getDocumentedRequirement_ReferencedBy();

    /**
     * The meta object literal for the '<em><b>Verified By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_REQUIREMENT__VERIFIED_BY = eINSTANCE.getDocumentedRequirement_VerifiedBy();

    /**
     * The meta object literal for the '<em><b>Decomposed By</b></em>' containment reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_REQUIREMENT__DECOMPOSED_BY = eINSTANCE.getDocumentedRequirement_DecomposedBy();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl <em>Documented Requirement Decomposition</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.DocumentedRequirementDecompositionImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getDocumentedRequirementDecomposition()
     * @generated
     */
    EClass DOCUMENTED_REQUIREMENT_DECOMPOSITION = eINSTANCE.getDocumentedRequirementDecomposition();

    /**
     * The meta object literal for the '<em><b>Element</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_REQUIREMENT_DECOMPOSITION__ELEMENT = eINSTANCE.getDocumentedRequirementDecomposition_Element();

    /**
     * The meta object literal for the '<em><b>Left</b></em>' reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_REQUIREMENT_DECOMPOSITION__LEFT = eINSTANCE.getDocumentedRequirementDecomposition_Left();

    /**
     * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute DOCUMENTED_REQUIREMENT_DECOMPOSITION__TYPE = eINSTANCE.getDocumentedRequirementDecomposition_Type();

    /**
     * The meta object literal for the '<em><b>Right</b></em>' containment reference feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference DOCUMENTED_REQUIREMENT_DECOMPOSITION__RIGHT = eINSTANCE.getDocumentedRequirementDecomposition_Right();

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
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl <em>Element Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ElementTypeImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getElementType()
     * @generated
     */
    EClass ELEMENT_TYPE = eINSTANCE.getElementType();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__NAME = eINSTANCE.getElementType_Name();

    /**
     * The meta object literal for the '<em><b>Reference</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__REFERENCE = eINSTANCE.getElementType_Reference();

    /**
     * The meta object literal for the '<em><b>Element Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__ELEMENT_TYPE = eINSTANCE.getElementType_ElementType();

    /**
     * The meta object literal for the '<em><b>Model Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__MODEL_TYPE = eINSTANCE.getElementType_ModelType();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__DETAILS = eINSTANCE.getElementType_Details();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_TYPE__VERSION = eINSTANCE.getElementType_Version();

    /**
     * The meta object literal for the '{@link edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl <em>Element Reference</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see edu.cmu.sei.alisa.alisa.impl.ElementReferenceImpl
     * @see edu.cmu.sei.alisa.alisa.impl.AlisaPackageImpl#getElementReference()
     * @generated
     */
    EClass ELEMENT_REFERENCE = eINSTANCE.getElementReference();

    /**
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__NAME = eINSTANCE.getElementReference_Name();

    /**
     * The meta object literal for the '<em><b>Url</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__URL = eINSTANCE.getElementReference_Url();

    /**
     * The meta object literal for the '<em><b>Model Reference</b></em>' reference list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EReference ELEMENT_REFERENCE__MODEL_REFERENCE = eINSTANCE.getElementReference_ModelReference();

    /**
     * The meta object literal for the '<em><b>Reference Type</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__REFERENCE_TYPE = eINSTANCE.getElementReference_ReferenceType();

    /**
     * The meta object literal for the '<em><b>Details</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__DETAILS = eINSTANCE.getElementReference_Details();

    /**
     * The meta object literal for the '<em><b>Version</b></em>' attribute list feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute ELEMENT_REFERENCE__VERSION = eINSTANCE.getElementReference_Version();

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
     * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    EAttribute VERIFICATION_RESULT__NAME = eINSTANCE.getVerificationResult_Name();

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

  }

} //AlisaPackage
