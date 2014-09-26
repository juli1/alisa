/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getReqkind <em>Reqkind</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getGoalReference <em>Goal Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getHazardReference <em>Hazard Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getStakeholderreqReference <em>Stakeholderreq Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getSystemreqReference <em>Systemreq Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getDocReferences <em>Doc References</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement()
 * @model
 * @generated
 */
public interface Requirement extends EObject
{
  /**
   * Returns the value of the '<em><b>Reqkind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reqkind</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reqkind</em>' attribute.
   * @see #setReqkind(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Reqkind()
   * @model
   * @generated
   */
  String getReqkind();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getReqkind <em>Reqkind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reqkind</em>' attribute.
   * @see #getReqkind()
   * @generated
   */
  void setReqkind(String value);

  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Target</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' attribute.
   * @see #setTarget(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Target()
   * @model
   * @generated
   */
  String getTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getTarget <em>Target</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' attribute.
   * @see #getTarget()
   * @generated
   */
  void setTarget(String value);

  /**
   * Returns the value of the '<em><b>Title</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Title</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Title</em>' attribute.
   * @see #setTitle(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getTitle <em>Title</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Title</em>' attribute.
   * @see #getTitle()
   * @generated
   */
  void setTitle(String value);

  /**
   * Returns the value of the '<em><b>Description</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' attribute.
   * @see #setDescription(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Assert</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert</em>' attribute.
   * @see #setAssert(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Assert()
   * @model
   * @generated
   */
  String getAssert();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getAssert <em>Assert</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert</em>' attribute.
   * @see #getAssert()
   * @generated
   */
  void setAssert(String value);

  /**
   * Returns the value of the '<em><b>Rationale</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rationale</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rationale</em>' attribute.
   * @see #setRationale(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Rationale()
   * @model
   * @generated
   */
  String getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getRationale <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' attribute.
   * @see #getRationale()
   * @generated
   */
  void setRationale(String value);

  /**
   * Returns the value of the '<em><b>Issue</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Issue</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issue</em>' attribute list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Issue()
   * @model unique="false"
   * @generated
   */
  EList<String> getIssue();

  /**
   * Returns the value of the '<em><b>Model Reference</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Reference</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Reference</em>' attribute list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_ModelReference()
   * @model unique="false"
   * @generated
   */
  EList<String> getModelReference();

  /**
   * Returns the value of the '<em><b>Goal Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_GoalReference()
   * @model
   * @generated
   */
  EList<Goal> getGoalReference();

  /**
   * Returns the value of the '<em><b>Hazard Reference</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Hazard Reference</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Hazard Reference</em>' attribute list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_HazardReference()
   * @model unique="false"
   * @generated
   */
  EList<String> getHazardReference();

  /**
   * Returns the value of the '<em><b>Refines Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_RefinesReference()
   * @model
   * @generated
   */
  EList<Requirement> getRefinesReference();

  /**
   * Returns the value of the '<em><b>Decomposes Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposes Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposes Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_DecomposesReference()
   * @model
   * @generated
   */
  EList<Requirement> getDecomposesReference();

  /**
   * Returns the value of the '<em><b>Evolves Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evolves Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evolves Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_EvolvesReference()
   * @model
   * @generated
   */
  EList<Requirement> getEvolvesReference();

  /**
   * Returns the value of the '<em><b>Verified By</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.VerificationDecomposition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verified By</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verified By</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_VerifiedBy()
   * @model containment="true"
   * @generated
   */
  EList<VerificationDecomposition> getVerifiedBy();

  /**
   * Returns the value of the '<em><b>Stakeholderreq Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.DocumentedRequirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholderreq Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholderreq Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_StakeholderreqReference()
   * @model
   * @generated
   */
  EList<DocumentedRequirement> getStakeholderreqReference();

  /**
   * Returns the value of the '<em><b>Systemreq Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.DocumentedRequirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Systemreq Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systemreq Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_SystemreqReference()
   * @model
   * @generated
   */
  EList<DocumentedRequirement> getSystemreqReference();

  /**
   * Returns the value of the '<em><b>Doc References</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ExternalDocument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc References</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc References</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_DocReferences()
   * @model
   * @generated
   */
  EList<ExternalDocument> getDocReferences();

} // Requirement
