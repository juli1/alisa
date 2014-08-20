/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Aliases</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Aliases#getAliasesTarget <em>Aliases Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Aliases#getAliases <em>Aliases</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAliases()
 * @model
 * @generated
 */
public interface Aliases extends EObject
{
  /**
   * Returns the value of the '<em><b>Aliases Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliases Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliases Target</em>' reference.
   * @see #setAliasesTarget(NamedElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAliases_AliasesTarget()
   * @model
   * @generated
   */
  NamedElement getAliasesTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Aliases#getAliasesTarget <em>Aliases Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Aliases Target</em>' reference.
   * @see #getAliasesTarget()
   * @generated
   */
  void setAliasesTarget(NamedElement value);

  /**
   * Returns the value of the '<em><b>Aliases</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Alias}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Aliases</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Aliases</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAliases_Aliases()
   * @model containment="true"
   * @generated
   */
  EList<Alias> getAliases();

} // Aliases
