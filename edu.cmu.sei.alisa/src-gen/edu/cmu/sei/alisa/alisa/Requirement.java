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
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getComment <em>Comment</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getAssignedTo <em>Assigned To</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getReferencedBy <em>Referenced By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirement#getDecomposedBy <em>Decomposed By</em>}</li>
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
   * Returns the value of the '<em><b>Comment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Comment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Comment</em>' attribute.
   * @see #setComment(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_Comment()
   * @model
   * @generated
   */
  String getComment();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirement#getComment <em>Comment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Comment</em>' attribute.
   * @see #getComment()
   * @generated
   */
  void setComment(String value);

  /**
   * Returns the value of the '<em><b>Assigned To</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Stakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assigned To</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assigned To</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_AssignedTo()
   * @model
   * @generated
   */
  EList<Stakeholder> getAssignedTo();

  /**
   * Returns the value of the '<em><b>Referenced By</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ElementType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced By</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced By</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_ReferencedBy()
   * @model
   * @generated
   */
  EList<ElementType> getReferencedBy();

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
   * Returns the value of the '<em><b>Decomposed By</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.RequirementDecomposition}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Decomposed By</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Decomposed By</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirement_DecomposedBy()
   * @model containment="true"
   * @generated
   */
  EList<RequirementDecomposition> getDecomposedBy();

} // Requirement
