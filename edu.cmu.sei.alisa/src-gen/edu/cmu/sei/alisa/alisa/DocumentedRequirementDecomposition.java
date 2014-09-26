/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Documented Requirement Decomposition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getElement <em>Element</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getLeft <em>Left</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getType <em>Type</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getRight <em>Right</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDocumentedRequirementDecomposition()
 * @model
 * @generated
 */
public interface DocumentedRequirementDecomposition extends EObject
{
  /**
   * Returns the value of the '<em><b>Element</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Element</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Element</em>' reference.
   * @see #setElement(DocumentedRequirement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDocumentedRequirementDecomposition_Element()
   * @model
   * @generated
   */
  DocumentedRequirement getElement();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getElement <em>Element</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Element</em>' reference.
   * @see #getElement()
   * @generated
   */
  void setElement(DocumentedRequirement value);

  /**
   * Returns the value of the '<em><b>Left</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Left</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' reference.
   * @see #setLeft(DocumentedRequirement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDocumentedRequirementDecomposition_Left()
   * @model
   * @generated
   */
  DocumentedRequirement getLeft();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getLeft <em>Left</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(DocumentedRequirement value);

  /**
   * Returns the value of the '<em><b>Type</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Type</em>' attribute.
   * @see #setType(String)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDocumentedRequirementDecomposition_Type()
   * @model
   * @generated
   */
  String getType();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getType <em>Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Type</em>' attribute.
   * @see #getType()
   * @generated
   */
  void setType(String value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Right</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(DocumentedRequirementDecomposition)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getDocumentedRequirementDecomposition_Right()
   * @model containment="true"
   * @generated
   */
  DocumentedRequirementDecomposition getRight();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(DocumentedRequirementDecomposition value);

} // DocumentedRequirementDecomposition
