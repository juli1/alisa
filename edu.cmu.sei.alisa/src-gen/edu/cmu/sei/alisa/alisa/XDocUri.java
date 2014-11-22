/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>XDoc Uri</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.XDocUri#getDocReference <em>Doc Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.XDocUri#getDocFragment <em>Doc Fragment</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getXDocUri()
 * @model
 * @generated
 */
public interface XDocUri extends EObject
{
  /**
   * Returns the value of the '<em><b>Doc Reference</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc Reference</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Reference</em>' reference.
   * @see #setDocReference(ExternalDocument)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getXDocUri_DocReference()
   * @model
   * @generated
   */
  ExternalDocument getDocReference();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.XDocUri#getDocReference <em>Doc Reference</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc Reference</em>' reference.
   * @see #getDocReference()
   * @generated
   */
  void setDocReference(ExternalDocument value);

  /**
   * Returns the value of the '<em><b>Doc Fragment</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc Fragment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Fragment</em>' attribute.
   * @see #setDocFragment(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getXDocUri_DocFragment()
   * @model
   * @generated
   */
  String getDocFragment();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.XDocUri#getDocFragment <em>Doc Fragment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Doc Fragment</em>' attribute.
   * @see #getDocFragment()
   * @generated
   */
  void setDocFragment(String value);

} // XDocUri
