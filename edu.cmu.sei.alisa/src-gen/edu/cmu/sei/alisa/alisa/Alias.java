/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Alias</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Alias#getAlias <em>Alias</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Alias#getDocRef <em>Doc Ref</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAlias()
 * @model
 * @generated
 */
public interface Alias extends EObject
{
  /**
   * Returns the value of the '<em><b>Alias</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Alias</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Alias</em>' attribute.
   * @see #setAlias(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAlias_Alias()
   * @model
   * @generated
   */
  String getAlias();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Alias#getAlias <em>Alias</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Alias</em>' attribute.
   * @see #getAlias()
   * @generated
   */
  void setAlias(String value);

  /**
   * Returns the value of the '<em><b>Doc Ref</b></em>' reference list.
   * The list contents are of type {@link edu.cmu.sei.alisa.alisa.Document}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Doc Ref</em>' reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Doc Ref</em>' reference list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getAlias_DocRef()
   * @model
   * @generated
   */
  EList<Document> getDocRef();

} // Alias
