/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.instance.SystemInstance;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceCase#getTarget <em>Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceCase#getResults <em>Results</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceCase()
 * @model
 * @generated
 */
public interface AssuranceCase extends AlisaModel
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
   * @see #setTarget(SystemInstance)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceCase_Target()
   * @model
   * @generated
   */
  SystemInstance getTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceCase#getTarget <em>Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target</em>' reference.
   * @see #getTarget()
   * @generated
   */
  void setTarget(SystemInstance value);

  /**
   * Returns the value of the '<em><b>Results</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.AssuranceResult}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Results</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Results</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceCase_Results()
   * @model containment="true"
   * @generated
   */
  EList<AssuranceResult> getResults();

} // AssuranceCase
