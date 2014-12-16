/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Result</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getRequirement <em>Requirement</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getPassCount <em>Pass Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getFailCount <em>Fail Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getNeutralCount <em>Neutral Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getUnknownCount <em>Unknown Count</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getSubClaimResult <em>Sub Claim Result</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getSubVAResult <em>Sub VA Result</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult()
 * @model
 * @generated
 */
public interface AssuranceResult extends RSALResult
{
  /**
   * Returns the value of the '<em><b>Requirement</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Requirement</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Requirement</em>' reference.
   * @see #setRequirement(Requirement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult_Requirement()
   * @model
   * @generated
   */
  Requirement getRequirement();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getRequirement <em>Requirement</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Requirement</em>' reference.
   * @see #getRequirement()
   * @generated
   */
  void setRequirement(Requirement value);

  /**
   * Returns the value of the '<em><b>Pass Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pass Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pass Count</em>' attribute.
   * @see #setPassCount(int)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult_PassCount()
   * @model
   * @generated
   */
  int getPassCount();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getPassCount <em>Pass Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pass Count</em>' attribute.
   * @see #getPassCount()
   * @generated
   */
  void setPassCount(int value);

  /**
   * Returns the value of the '<em><b>Fail Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fail Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fail Count</em>' attribute.
   * @see #setFailCount(int)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult_FailCount()
   * @model
   * @generated
   */
  int getFailCount();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getFailCount <em>Fail Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fail Count</em>' attribute.
   * @see #getFailCount()
   * @generated
   */
  void setFailCount(int value);

  /**
   * Returns the value of the '<em><b>Neutral Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Neutral Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Neutral Count</em>' attribute.
   * @see #setNeutralCount(int)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult_NeutralCount()
   * @model
   * @generated
   */
  int getNeutralCount();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getNeutralCount <em>Neutral Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Neutral Count</em>' attribute.
   * @see #getNeutralCount()
   * @generated
   */
  void setNeutralCount(int value);

  /**
   * Returns the value of the '<em><b>Unknown Count</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Unknown Count</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Unknown Count</em>' attribute.
   * @see #setUnknownCount(int)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult_UnknownCount()
   * @model
   * @generated
   */
  int getUnknownCount();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceResult#getUnknownCount <em>Unknown Count</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Unknown Count</em>' attribute.
   * @see #getUnknownCount()
   * @generated
   */
  void setUnknownCount(int value);

  /**
   * Returns the value of the '<em><b>Sub Claim Result</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.AssuranceResult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Claim Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Claim Result</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult_SubClaimResult()
   * @model containment="true"
   * @generated
   */
  EList<AssuranceResult> getSubClaimResult();

  /**
   * Returns the value of the '<em><b>Sub VA Result</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.VerificationResult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub VA Result</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub VA Result</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceResult_SubVAResult()
   * @model containment="true"
   * @generated
   */
  EList<VerificationResult> getSubVAResult();

} // AssuranceResult
