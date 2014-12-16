/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Assumption</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getAssert <em>Assert</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getVerifiedBy <em>Verified By</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getArgument <em>Argument</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationAssumption()
 * @model
 * @generated
 */
public interface VerificationAssumption extends ContractualElement
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
   * @see #setTarget(VerificationActivity)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationAssumption_Target()
   * @model
   * @generated
   */
  VerificationActivity getTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(VerificationActivity value);

  /**
   * Returns the value of the '<em><b>Assert</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Assert</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Assert</em>' reference.
   * @see #setAssert(Requirement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationAssumption_Assert()
   * @model
   * @generated
   */
  Requirement getAssert();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getAssert <em>Assert</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Assert</em>' reference.
   * @see #getAssert()
   * @generated
   */
  void setAssert(Requirement value);

  /**
   * Returns the value of the '<em><b>Verified By</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.VerificationActivity}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Verified By</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Verified By</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationAssumption_VerifiedBy()
   * @model containment="true"
   * @generated
   */
  EList<VerificationActivity> getVerifiedBy();

  /**
   * Returns the value of the '<em><b>Argument</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Argument</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Argument</em>' containment reference.
   * @see #setArgument(AssuranceArgument)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationAssumption_Argument()
   * @model containment="true"
   * @generated
   */
  AssuranceArgument getArgument();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationAssumption#getArgument <em>Argument</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Argument</em>' containment reference.
   * @see #getArgument()
   * @generated
   */
  void setArgument(AssuranceArgument value);

} // VerificationAssumption
