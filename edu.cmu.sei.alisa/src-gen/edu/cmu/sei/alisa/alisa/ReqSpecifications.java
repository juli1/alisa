/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Req Specifications</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpecifications#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpecifications#getReqTarget <em>Req Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ReqSpecifications#getReqs <em>Reqs</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpecifications()
 * @model
 * @generated
 */
public interface ReqSpecifications extends EObject
{
  /**
   * Returns the value of the '<em><b>Fqn</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Fqn</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Fqn</em>' attribute.
   * @see #setFqn(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpecifications_Fqn()
   * @model
   * @generated
   */
  String getFqn();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpecifications#getFqn <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Fqn</em>' attribute.
   * @see #getFqn()
   * @generated
   */
  void setFqn(String value);

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpecifications_ReqTarget()
   * @model
   * @generated
   */
  NamedElement getReqTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ReqSpecifications#getReqTarget <em>Req Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Req Target</em>' reference.
   * @see #getReqTarget()
   * @generated
   */
  void setReqTarget(NamedElement value);

  /**
   * Returns the value of the '<em><b>Reqs</b></em>' containment reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.ReqSpec}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reqs</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reqs</em>' containment reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getReqSpecifications_Reqs()
   * @model containment="true"
   * @generated
   */
  EList<ReqSpec> getReqs();

} // ReqSpecifications
