/**
 */
package edu.cmu.sei.alisa.alisa;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Hazard Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.HazardCategory#getExtends <em>Extends</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getHazardCategory()
 * @model
 * @generated
 */
public interface HazardCategory extends Category
{
  /**
   * Returns the value of the '<em><b>Extends</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Extends</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Extends</em>' reference.
   * @see #setExtends(HazardCategory)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getHazardCategory_Extends()
   * @model
   * @generated
   */
  HazardCategory getExtends();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.HazardCategory#getExtends <em>Extends</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Extends</em>' reference.
   * @see #getExtends()
   * @generated
   */
  void setExtends(HazardCategory value);

} // HazardCategory
