/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.DescriptionElement#getTest <em>Test</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.DescriptionElement#getRef <em>Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDescriptionElement()
 * @model
 * @generated
 */
public interface DescriptionElement extends EObject
{
  /**
   * Returns the value of the '<em><b>Test</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Test</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Test</em>' attribute.
   * @see #setTest(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDescriptionElement_Test()
   * @model
   * @generated
   */
  String getTest();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.DescriptionElement#getTest <em>Test</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Test</em>' attribute.
   * @see #getTest()
   * @generated
   */
  void setTest(String value);

  /**
   * Returns the value of the '<em><b>Ref</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref</em>' reference.
   * @see #setRef(RSALVariable)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDescriptionElement_Ref()
   * @model
   * @generated
   */
  RSALVariable getRef();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.DescriptionElement#getRef <em>Ref</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref</em>' reference.
   * @see #getRef()
   * @generated
   */
  void setRef(RSALVariable value);

} // DescriptionElement
