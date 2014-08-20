/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getXternalReference <em>Xternal Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocument()
 * @model
 * @generated
 */
public interface ExternalDocument extends EObject
{
  /**
   * Returns the value of the '<em><b>Fqn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn</em>' attribute.
   * @see #setFqn(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocument_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

  /**
   * Returns the value of the '<em><b>Xternal Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Xternal Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Xternal Reference</em>' attribute.
   * @see #setXternalReference(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocument_XternalReference()
   * @model
   * @generated
   */
  String getXternalReference();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getXternalReference <em>Xternal Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Xternal Reference</em>' attribute.
   * @see #getXternalReference()
   * @generated
   */
  void setXternalReference(String value);

} // ExternalDocument
