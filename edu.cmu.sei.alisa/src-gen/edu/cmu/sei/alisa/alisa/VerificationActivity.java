/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getMethod <em>Method</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getAssignedTo <em>Assigned To</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationActivity()
 * @model
 * @generated
 */
public interface VerificationActivity extends EObject
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationActivity_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getName <em>Name</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationActivity_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getTitle <em>Title</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationActivity_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getDescription <em>Description</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Description</em>' attribute.
   * @see #getDescription()
   * @generated
   */
  void setDescription(String value);

  /**
   * Returns the value of the '<em><b>Method</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Method</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Method</em>' attribute.
   * @see #setMethod(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationActivity_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationActivity#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationActivity_AssignedTo()
   * @model
   * @generated
   */
  EList<Stakeholder> getAssignedTo();

} // VerificationActivity
