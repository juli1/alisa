/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AlisaModel#getImportedNamespace <em>Imported Namespace</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.AlisaModel#getContent <em>Content</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAlisaModel()
 * @model
 * @generated
 */
public interface AlisaModel extends EObject
{
  /**
   * Returns the value of the '<em><b>Imported Namespace</b></em>' reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Imported Namespace</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Imported Namespace</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAlisaModel_ImportedNamespace()
   * @model
   * @generated
   */
  EList<EObject> getImportedNamespace();

  /**
   * Returns the value of the '<em><b>Content</b></em>' containment reference list.
   * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Content</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Content</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAlisaModel_Content()
   * @model containment="true"
   * @generated
   */
  EList<EObject> getContent();

} // AlisaModel
