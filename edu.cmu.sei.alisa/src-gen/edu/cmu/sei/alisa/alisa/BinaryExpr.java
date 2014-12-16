/**
 */
package edu.cmu.sei.alisa.alisa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Binary Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getOp <em>Op</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getBinaryExpr()
 * @model
 * @generated
 */
public interface BinaryExpr extends ArgumentExpr
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(ArgumentExpr)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getBinaryExpr_Left()
   * @model containment="true"
   * @generated
   */
  ArgumentExpr getLeft();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(ArgumentExpr value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Op</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see #setOp(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getBinaryExpr_Op()
   * @model
   * @generated
   */
  String getOp();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see #getOp()
   * @generated
   */
  void setOp(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(ArgumentExpr)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getBinaryExpr_Right()
   * @model containment="true"
   * @generated
   */
  ArgumentExpr getRight();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.BinaryExpr#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(ArgumentExpr value);

} // BinaryExpr
