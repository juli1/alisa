/**
 */
package edu.cmu.sei.alisa.alisa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Ref Expr</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.RefExpr#getId <em>Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRefExpr()
 * @model
 * @generated
 */
public interface RefExpr extends ArgumentExpr
{
  /**
   * Returns the value of the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Id</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Id</em>' containment reference.
   * @see #setId(ArgumentReference)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRefExpr_Id()
   * @model containment="true"
   * @generated
   */
  ArgumentReference getId();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.RefExpr#getId <em>Id</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Id</em>' containment reference.
   * @see #getId()
   * @generated
   */
  void setId(ArgumentReference value);

} // RefExpr
