/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Verification Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getElement <em>Element</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationDecomposition()
 * @model
 * @generated
 */
public interface VerificationDecomposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(VerificationActivity)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationDecomposition_Element()
   * @model
   * @generated
   */
  VerificationActivity getElement();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(VerificationActivity value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' reference.
   * @see #setLeft(VerificationActivity)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationDecomposition_Left()
   * @model
   * @generated
   */
  VerificationActivity getLeft();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(VerificationActivity value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationDecomposition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(VerificationDecomposition)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getVerificationDecomposition_Right()
   * @model containment="true"
   * @generated
   */
  VerificationDecomposition getRight();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(VerificationDecomposition value);

} // VerificationDecomposition
