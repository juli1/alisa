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
 *   <li>{@link edu.cmu.sei.alisa.alisa.ExternalDocuments#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ExternalDocuments#getDocs <em>Docs</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocuments()
 * @model
 * @generated
 */
public interface ExternalDocuments extends AlisaElement, AlisaNameSpace, Document
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Name</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' attribute.
   * @see #setName(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getExternalDocuments_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ExternalDocuments#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

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
