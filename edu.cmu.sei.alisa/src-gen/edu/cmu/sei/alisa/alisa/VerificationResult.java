/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationResult#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationResult#getReferencedVerificationMethod <em>Referenced Verification Method</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationResult#getTitle <em>Title</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationResult#getDescription <em>Description</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationResult#getMethod <em>Method</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationResult#getState <em>State</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationResult#getStatus <em>Status</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult()
 * @model
 * @generated
 */
public interface VerificationResult extends EObject
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Referenced Verification Method</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.VerificationActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Referenced Verification Method</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Referenced Verification Method</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult_ReferencedVerificationMethod()
   * @model
   * @generated
   */
  EList<VerificationActivity> getReferencedVerificationMethod();

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult_Title()
   * @model
   * @generated
   */
  String getTitle();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getTitle <em>Title</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult_Description()
   * @model
   * @generated
   */
  String getDescription();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getDescription <em>Description</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult_Method()
   * @model
   * @generated
   */
  String getMethod();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getMethod <em>Method</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Method</em>' attribute.
   * @see #getMethod()
   * @generated
   */
  void setMethod(String value);

  /**
   * Returns the value of the '<em><b>State</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>State</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>State</em>' attribute.
   * @see #setState(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult_State()
   * @model
   * @generated
   */
  String getState();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getState <em>State</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>State</em>' attribute.
   * @see #getState()
   * @generated
   */
  void setState(String value);

  /**
   * Returns the value of the '<em><b>Status</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Status</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Status</em>' attribute.
   * @see #setStatus(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationResult_Status()
   * @model
   * @generated
   */
  String getStatus();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationResult#getStatus <em>Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Status</em>' attribute.
   * @see #getStatus()
   * @generated
   */
  void setStatus(String value);

} // VerificationResult
