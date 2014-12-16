/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Argument Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ArgumentReference#getReference <em>Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ArgumentReference#getWeight <em>Weight</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getArgumentReference()
 * @model
 * @generated
 */
public interface ArgumentReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' reference.
   * @see #setReference(VerificationActivity)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getArgumentReference_Reference()
   * @model
   * @generated
   */
  VerificationActivity getReference();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ArgumentReference#getReference <em>Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' reference.
   * @see #getReference()
   * @generated
   */
  void setReference(VerificationActivity value);

  /**
   * Returns the value of the '<em><b>Weight</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Weight</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Weight</em>' attribute.
   * @see #setWeight(int)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getArgumentReference_Weight()
   * @model
   * @generated
   */
  int getWeight();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ArgumentReference#getWeight <em>Weight</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Weight</em>' attribute.
   * @see #getWeight()
   * @generated
   */
  void setWeight(int value);

} // ArgumentReference
