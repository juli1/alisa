/**
 */
package edu.cmu.sei.alisa.alisa;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Document</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getExternalReference <em>External Reference</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocument()
 * @model
 * @generated
 */
public interface ExternalDocument extends NamedElement, RSALElement
{
  /**
   * Returns the value of the '<em><b>External Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>External Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>External Reference</em>' attribute.
   * @see #setExternalReference(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocument_ExternalReference()
   * @model
   * @generated
   */
  String getExternalReference();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ExternalDocument#getExternalReference <em>External Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>External Reference</em>' attribute.
   * @see #getExternalReference()
   * @generated
   */
  void setExternalReference(String value);

} // ExternalDocument
