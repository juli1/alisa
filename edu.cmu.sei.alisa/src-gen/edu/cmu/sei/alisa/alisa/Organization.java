/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Organization</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Organization#getStakeholder <em>Stakeholder</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getOrganization()
 * @model
 * @generated
 */
public interface Organization extends AlisaModel, NamedElement
{
  /**
   * Returns the value of the '<em><b>Stakeholder</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Stakeholder}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Stakeholder</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Stakeholder</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getOrganization_Stakeholder()
   * @model containment="true"
   * @generated
   */
  EList<Stakeholder> getStakeholder();

} // Organization
