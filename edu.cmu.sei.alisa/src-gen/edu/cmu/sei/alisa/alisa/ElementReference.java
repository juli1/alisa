/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementReference#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementReference#getUrl <em>Url</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementReference#getReferenceType <em>Reference Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementReference#getDetails <em>Details</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementReference#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementReference()
 * @model
 * @generated
 */
public interface ElementReference extends EObject
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementReference_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementReference#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Url</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Url</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Url</em>' attribute.
   * @see #setUrl(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementReference_Url()
   * @model
   * @generated
   */
  String getUrl();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementReference#getUrl <em>Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Url</em>' attribute.
   * @see #getUrl()
   * @generated
   */
  void setUrl(String value);

  /**
   * Returns the value of the '<em><b>Reference Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference Type</em>' attribute.
   * @see #setReferenceType(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementReference_ReferenceType()
   * @model
   * @generated
   */
  String getReferenceType();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementReference#getReferenceType <em>Reference Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference Type</em>' attribute.
   * @see #getReferenceType()
   * @generated
   */
  void setReferenceType(String value);

  /**
   * Returns the value of the '<em><b>Details</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Details</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Details</em>' attribute.
   * @see #setDetails(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementReference_Details()
   * @model
   * @generated
   */
  String getDetails();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementReference#getDetails <em>Details</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Details</em>' attribute.
   * @see #getDetails()
   * @generated
   */
  void setDetails(String value);

  /**
   * Returns the value of the '<em><b>Version</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Version</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Version</em>' attribute list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementReference_Version()
   * @model unique="false"
   * @generated
   */
  EList<String> getVersion();

} // ElementReference
