/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Goals</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goals#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goals#getGoalTarget <em>Goal Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Goals#getGoals <em>Goals</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoals()
 * @model
 * @generated
 */
public interface Goals extends AlisaElement, AlisaNameSpace
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoals_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goals#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Goal Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goal Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goal Target</em>' reference.
   * @see #setGoalTarget(NamedElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoals_GoalTarget()
   * @model
   * @generated
   */
  NamedElement getGoalTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Goals#getGoalTarget <em>Goal Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Goal Target</em>' reference.
   * @see #getGoalTarget()
   * @generated
   */
  void setGoalTarget(NamedElement value);

  /**
   * Returns the value of the '<em><b>Goals</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Goal}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Goals</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Goals</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getGoals_Goals()
   * @model containment="true"
   * @generated
   */
  EList<Goal> getGoals();

} // Goals
