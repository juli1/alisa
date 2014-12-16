/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Assurance Argument</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceArgument#getExpression <em>Expression</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AssuranceArgument#getRationale <em>Rationale</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceArgument()
 * @model
 * @generated
 */
public interface AssuranceArgument extends EObject
{
  /**
   * Returns the value of the '<em><b>Expression</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Expression</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Expression</em>' containment reference.
   * @see #setExpression(ArgumentExpr)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceArgument_Expression()
   * @model containment="true"
   * @generated
   */
  ArgumentExpr getExpression();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceArgument#getExpression <em>Expression</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Expression</em>' containment reference.
   * @see #getExpression()
   * @generated
   */
  void setExpression(ArgumentExpr value);

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAssuranceArgument_Rationale()
   * @model
   * @generated
   */
  String getRationale();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.AssuranceArgument#getRationale <em>Rationale</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Rationale</em>' attribute.
   * @see #getRationale()
   * @generated
   */
  void setRationale(String value);

} // AssuranceArgument
