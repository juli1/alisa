/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getGoalTarget <em>Goal Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getModelReference <em>Model Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getStakeholderReference <em>Stakeholder Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goal#getDocReferences <em>Doc References</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal()
 * @model
 * @generated
 */
public interface Goal extends EObject
{
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goal#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

  /**
   * Returns the value of the '<em><b>Goal Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Target</em>' reference.
   * @see #setGoalTarget(NamedElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_GoalTarget()
   * @model
   * @generated
   */
  NamedElement getGoalTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goal#getGoalTarget <em>Goal Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal Target</em>' reference.
   * @see #getGoalTarget()
   * @generated
   */
  void setGoalTarget(NamedElement value);

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goal#getTitle <em>Title</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goal#getDescription <em>Description</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_Assert()
   * @model
   * @generated
   */
  String getAssert();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goal#getAssert <em>Assert</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_Rationale()
   * @model
   * @generated
   */
  String getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goal#getRationale <em>Rationale</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_Issue()
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_ModelReference()
   * @model unique="false"
   * @generated
   */
  EList<String> getModelReference();

  /**
   * Returns the value of the '<em><b>Refines Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_RefinesReference()
   * @model
   * @generated
   */
  EList<Goal> getRefinesReference();

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_DecomposesReference()
   * @model
   * @generated
   */
  EList<ReqSpec> getDecomposesReference();

  /**
   * Returns the value of the '<em><b>Evolves Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evolves Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evolves Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_EvolvesReference()
   * @model
   * @generated
   */
  EList<Goal> getEvolvesReference();

  /**
   * Returns the value of the '<em><b>Stakeholder Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholder Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholder Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_StakeholderReference()
   * @model
   * @generated
   */
  EList<Requirement> getStakeholderReference();

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoal_DocReferences()
   * @model
   * @generated
   */
  EList<ExternalDocument> getDocReferences();

} // Goal
