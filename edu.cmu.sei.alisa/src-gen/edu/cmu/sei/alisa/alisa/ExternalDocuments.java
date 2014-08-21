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
