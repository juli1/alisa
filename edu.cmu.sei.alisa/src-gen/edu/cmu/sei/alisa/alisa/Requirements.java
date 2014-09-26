/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirements</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirements#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirements#getReqTarget <em>Req Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Requirements#getReqs <em>Reqs</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirements()
 * @model
 * @generated
 */
public interface Requirements extends EObject
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirements_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirements#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Req Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Req Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Req Target</em>' reference.
   * @see #setReqTarget(NamedElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirements_ReqTarget()
   * @model
   * @generated
   */
  NamedElement getReqTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Requirements#getReqTarget <em>Req Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req Target</em>' reference.
   * @see #getReqTarget()
   * @generated
   */
  void setReqTarget(NamedElement value);

  /**
   * Returns the value of the '<em><b>Reqs</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Requirement}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reqs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reqs</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getRequirements_Reqs()
   * @model containment="true"
   * @generated
   */
  EList<Requirement> getReqs();

} // Requirements
