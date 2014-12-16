/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Categories</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Categories#getCategory <em>Category</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getCategories()
 * @model
 * @generated
 */
public interface Categories extends AlisaModel
{
  /**
   * Returns the value of the '<em><b>Category</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Category}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Category</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Category</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getCategories_Category()
   * @model containment="true"
   * @generated
   */
  EList<Category> getCategory();

} // Categories
