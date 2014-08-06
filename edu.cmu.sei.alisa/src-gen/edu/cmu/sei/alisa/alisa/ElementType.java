/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementType#getName <em>Name</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementType#getReference <em>Reference</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementType#getElementType <em>Element Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementType#getModelType <em>Model Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementType#getDetails <em>Details</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.ElementType#getVersion <em>Version</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementType()
 * @model
 * @generated
 */
public interface ElementType extends EObject
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementType_Name()
   * @model
   * @generated
   */
  String getName();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementType#getName <em>Name</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' attribute.
   * @see #getName()
   * @generated
   */
  void setName(String value);

  /**
   * Returns the value of the '<em><b>Reference</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Reference</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Reference</em>' attribute.
   * @see #setReference(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementType_Reference()
   * @model
   * @generated
   */
  String getReference();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementType#getReference <em>Reference</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Reference</em>' attribute.
   * @see #getReference()
   * @generated
   */
  void setReference(String value);

  /**
   * Returns the value of the '<em><b>Element Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element Type</em>' attribute.
   * @see #setElementType(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementType_ElementType()
   * @model
   * @generated
   */
  String getElementType();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementType#getElementType <em>Element Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element Type</em>' attribute.
   * @see #getElementType()
   * @generated
   */
  void setElementType(String value);

  /**
   * Returns the value of the '<em><b>Model Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Model Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Model Type</em>' attribute.
   * @see #setModelType(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementType_ModelType()
   * @model
   * @generated
   */
  String getModelType();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementType#getModelType <em>Model Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Model Type</em>' attribute.
   * @see #getModelType()
   * @generated
   */
  void setModelType(String value);

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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementType_Details()
   * @model
   * @generated
   */
  String getDetails();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.ElementType#getDetails <em>Details</em>}' attribute.
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
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getElementType_Version()
   * @model unique="false"
   * @generated
   */
  EList<String> getVersion();

} // ElementType
