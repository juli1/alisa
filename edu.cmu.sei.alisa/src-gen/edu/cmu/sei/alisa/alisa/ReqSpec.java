/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Spec</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getReqkind <em>Reqkind</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getReqTarget <em>Req Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getGoalReference <em>Goal Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getHazardReference <em>Hazard Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getStakeholderreqReference <em>Stakeholderreq Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getSystemreqReference <em>Systemreq Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpec#getDocReferences <em>Doc References</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec()
 * @model
 * @generated
 */
public interface ReqSpec extends EObject
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_Reqkind()
   * @model
   * @generated
   */
  String getReqkind();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpec#getReqkind <em>Reqkind</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reqkind</em>' attribute.
   * @see #getReqkind()
   * @generated
   */
  void setReqkind(String value);

  /**
   * Returns the value of the '<em><b>Fqn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn</em>' attribute.
   * @see #setFqn(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpec#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

  /**
   * Returns the value of the '<em><b>Req Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Req Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req Target</em>' reference.
   * @see #setReqTarget(NamedElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_ReqTarget()
   * @model
   * @generated
   */
  NamedElement getReqTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpec#getReqTarget <em>Req Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req Target</em>' reference.
   * @see #getReqTarget()
   * @generated
   */
  void setReqTarget(NamedElement value);

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpec#getTitle <em>Title</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpec#getDescription <em>Description</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_Assert()
   * @model
   * @generated
   */
  String getAssert();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpec#getAssert <em>Assert</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_Rationale()
   * @model
   * @generated
   */
  String getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpec#getRationale <em>Rationale</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_Issue()
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_ModelReference()
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_GoalReference()
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_HazardReference()
   * @model unique="false"
   * @generated
   */
  EList<String> getHazardReference();

  /**
   * Returns the value of the '<em><b>Refines Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ReqSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_RefinesReference()
   * @model
   * @generated
   */
  EList<ReqSpec> getRefinesReference();

  /**
   * Returns the value of the '<em><b>Decomposes Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ReqSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposes Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposes Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_DecomposesReference()
   * @model
   * @generated
   */
  EList<ReqSpec> getDecomposesReference();

  /**
   * Returns the value of the '<em><b>Evolves Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ReqSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evolves Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evolves Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_EvolvesReference()
   * @model
   * @generated
   */
  EList<ReqSpec> getEvolvesReference();

  /**
   * Returns the value of the '<em><b>Stakeholderreq Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholderreq Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholderreq Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_StakeholderreqReference()
   * @model
   * @generated
   */
  EList<Requirement> getStakeholderreqReference();

  /**
   * Returns the value of the '<em><b>Systemreq Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Systemreq Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Systemreq Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_SystemreqReference()
   * @model
   * @generated
   */
  EList<Requirement> getSystemreqReference();

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpec_DocReferences()
   * @model
   * @generated
   */
  EList<ExternalDocument> getDocReferences();

} // ReqSpec
