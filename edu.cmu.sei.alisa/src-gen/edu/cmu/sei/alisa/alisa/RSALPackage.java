/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RSAL Package</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.RSALPackage#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.RSALPackage#getContent <em>Content</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.RSALPackage#getIssue <em>Issue</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALPackage()
 * @model
 * @generated
 */
public interface RSALPackage extends EObject, NamedElement
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALPackage_ImportedNamespace()
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALPackage_Content()
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRSALPackage_Issue()
   * @model unique="false"
   * @generated
   */
  EList<String> getIssue();

} // RSALPackage
