/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contractual Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getCategory <em>Category</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getRationale <em>Rationale</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getIssue <em>Issue</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getSectionReference <em>Section Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getRefinesReference <em>Refines Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDecomposesReference <em>Decomposes Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getEvolvesReference <em>Evolves Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getConflictsReference <em>Conflicts Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getStakeholderReference <em>Stakeholder Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getStakeholderRequirementReference <em>Stakeholder Requirement Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getSystemRequirementReference <em>System Requirement Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDocReference <em>Doc Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement()
 * @model
 * @generated
 */
public interface ContractualElement extends NamedElement, RSALElement
{
  /**
   * Returns the value of the '<em><b>Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Target</em>' reference.
   * @see #setTarget(NamedElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_Target()
   * @model
   * @generated
   */
  NamedElement getTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(NamedElement value);

  /**
   * Returns the value of the '<em><b>Category</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Category}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_Category()
   * @model
   * @generated
   */
  EList<Category> getCategory();

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getTitle <em>Title</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getDescription <em>Description</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_Assert()
   * @model
   * @generated
   */
  String getAssert();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getAssert <em>Assert</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_Rationale()
   * @model
   * @generated
   */
  String getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ContractualElement#getRationale <em>Rationale</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_Issue()
   * @model unique="false"
   * @generated
   */
  EList<String> getIssue();

  /**
   * Returns the value of the '<em><b>Section Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.RSALContainer}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Section Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Section Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_SectionReference()
   * @model
   * @generated
   */
  EList<RSALContainer> getSectionReference();

  /**
   * Returns the value of the '<em><b>Refines Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ContractualElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Refines Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Refines Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_RefinesReference()
   * @model
   * @generated
   */
  EList<ContractualElement> getRefinesReference();

  /**
   * Returns the value of the '<em><b>Decomposes Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ContractualElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposes Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposes Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_DecomposesReference()
   * @model
   * @generated
   */
  EList<ContractualElement> getDecomposesReference();

  /**
   * Returns the value of the '<em><b>Evolves Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ContractualElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Evolves Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Evolves Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_EvolvesReference()
   * @model
   * @generated
   */
  EList<ContractualElement> getEvolvesReference();

  /**
   * Returns the value of the '<em><b>Conflicts Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ContractualElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Conflicts Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conflicts Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_ConflictsReference()
   * @model
   * @generated
   */
  EList<ContractualElement> getConflictsReference();

  /**
   * Returns the value of the '<em><b>Stakeholder Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Stakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholder Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholder Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_StakeholderReference()
   * @model
   * @generated
   */
  EList<Stakeholder> getStakeholderReference();

  /**
   * Returns the value of the '<em><b>Stakeholder Requirement Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ContractualElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholder Requirement Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholder Requirement Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_StakeholderRequirementReference()
   * @model
   * @generated
   */
  EList<ContractualElement> getStakeholderRequirementReference();

  /**
   * Returns the value of the '<em><b>System Requirement Reference</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ContractualElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>System Requirement Reference</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>System Requirement Reference</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_SystemRequirementReference()
   * @model
   * @generated
   */
  EList<ContractualElement> getSystemRequirementReference();

  /**
   * Returns the value of the '<em><b>Doc Reference</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.XDocUri}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc Reference</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Reference</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElement_DocReference()
   * @model containment="true"
   * @generated
   */
  EList<XDocUri> getDocReference();

} // ContractualElement
