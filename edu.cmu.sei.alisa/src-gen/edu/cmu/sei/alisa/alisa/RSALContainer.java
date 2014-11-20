/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RSAL Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.RSALContainer#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.RSALContainer#getContent <em>Content</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.RSALContainer#getIssue <em>Issue</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALContainer()
 * @model
 * @generated
 */
public interface RSALContainer extends AlisaModel, NamedElement, RSALElement
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' reference list.
   * The list contents are of type {@link org.osate.aadl2.NamedElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALContainer_ImportedNamespace()
   * @model
   * @generated
   */
  EList<NamedElement> getImportedNamespace();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.RSALElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALContainer_Content()
   * @model containment="true"
   * @generated
   */
  EList<RSALElement> getContent();

  /**
   * Returns the value of the '<em><b>Issue</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Issue</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Issue</em>' attribute list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALContainer_Issue()
   * @model unique="false"
   * @generated
   */
  EList<String> getIssue();

} // RSALContainer
