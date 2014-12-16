/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contractual Element Proxy</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ContractualElementProxy#getProxyreference <em>Proxyreference</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElementProxy()
 * @model
 * @generated
 */
public interface ContractualElementProxy extends EObject
{
  /**
   * Returns the value of the '<em><b>Proxyreference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Proxyreference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxyreference</em>' reference.
   * @see #setProxyreference(ContractualElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getContractualElementProxy_Proxyreference()
   * @model
   * @generated
   */
  ContractualElement getProxyreference();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ContractualElementProxy#getProxyreference <em>Proxyreference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxyreference</em>' reference.
   * @see #getProxyreference()
   * @generated
   */
  void setProxyreference(ContractualElement value);

} // ContractualElementProxy
