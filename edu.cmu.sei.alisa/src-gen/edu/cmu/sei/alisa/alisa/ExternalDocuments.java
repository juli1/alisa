/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Documents</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ExternalDocuments#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ExternalDocuments#getDocs <em>Docs</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocuments()
 * @model
 * @generated
 */
public interface ExternalDocuments extends Document
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocuments_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ExternalDocuments#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

  /**
   * Returns the value of the '<em><b>Docs</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ExternalDocument}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Docs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Docs</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocuments_Docs()
   * @model containment="true"
   * @generated
   */
  EList<ExternalDocument> getDocs();

} // ExternalDocuments
