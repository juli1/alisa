/**
 */
package edu.cmu.sei.alisa.alisa;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Notes</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Notes#getNotesTarget <em>Notes Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.Notes#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getNotes()
 * @model
 * @generated
 */
public interface Notes extends EObject
{
  /**
   * Returns the value of the '<em><b>Notes Target</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes Target</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes Target</em>' reference.
   * @see #setNotesTarget(NamedElement)
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getNotes_NotesTarget()
   * @model
   * @generated
   */
  NamedElement getNotesTarget();

  /**
   * Sets the value of the '{@link edu.cmu.sei.alisa.alisa.Notes#getNotesTarget <em>Notes Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Notes Target</em>' reference.
   * @see #getNotesTarget()
   * @generated
   */
  void setNotesTarget(NamedElement value);

  /**
   * Returns the value of the '<em><b>Notes</b></em>' attribute list.
   * The list contents are of type {@link java.lang.String}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Notes</em>' attribute list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Notes</em>' attribute list.
   * @see edu.cmu.sei.alisa.alisa.AlisaPackage#getNotes_Notes()
   * @model unique="false"
   * @generated
   */
  EList<String> getNotes();

} // Notes
