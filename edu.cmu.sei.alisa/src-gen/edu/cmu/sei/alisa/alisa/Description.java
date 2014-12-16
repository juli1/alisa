/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Description</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Description#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDescription()
 * @model
 * @generated
 */
public interface Description extends EObject
{
  /**
   * Returns the value of the '<em><b>Description</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.DescriptionElement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Description</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Description</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDescription_Description()
   * @model containment="true"
   * @generated
   */
  EList<DescriptionElement> getDescription();

} // Description
