/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Notes;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeEList;

import org.osate.aadl2.NamedElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Notes</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.NotesImpl#getNotesTarget <em>Notes Target</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.NotesImpl#getNotes <em>Notes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NotesImpl extends MinimalEObjectImpl.Container implements Notes
{
  /**
   * The cached value of the '{@link #getNotesTarget() <em>Notes Target</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotesTarget()
   * @generated
   * @ordered
   */
  protected NamedElement notesTarget;

  /**
   * The cached value of the '{@link #getNotes() <em>Notes</em>}' attribute list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getNotes()
   * @generated
   * @ordered
   */
  protected EList<String> notes;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected NotesImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return AlisaPackage.Literals.NOTES;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement getNotesTarget()
  {
    if (notesTarget != null && ((EObject)notesTarget).eIsProxy())
    {
      InternalEObject oldNotesTarget = (InternalEObject)notesTarget;
      notesTarget = (NamedElement)eResolveProxy(oldNotesTarget);
      if (notesTarget != oldNotesTarget)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, AlisaPackage.NOTES__NOTES_TARGET, oldNotesTarget, notesTarget));
      }
    }
    return notesTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NamedElement basicGetNotesTarget()
  {
    return notesTarget;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setNotesTarget(NamedElement newNotesTarget)
  {
    NamedElement oldNotesTarget = notesTarget;
    notesTarget = newNotesTarget;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.NOTES__NOTES_TARGET, oldNotesTarget, notesTarget));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<String> getNotes()
  {
    if (notes == null)
    {
      notes = new EDataTypeEList<String>(String.class, this, AlisaPackage.NOTES__NOTES);
    }
    return notes;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case AlisaPackage.NOTES__NOTES_TARGET:
        if (resolve) return getNotesTarget();
        return basicGetNotesTarget();
      case AlisaPackage.NOTES__NOTES:
        return getNotes();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @SuppressWarnings("unchecked")
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case AlisaPackage.NOTES__NOTES_TARGET:
        setNotesTarget((NamedElement)newValue);
        return;
      case AlisaPackage.NOTES__NOTES:
        getNotes().clear();
        getNotes().addAll((Collection<? extends String>)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case AlisaPackage.NOTES__NOTES_TARGET:
        setNotesTarget((NamedElement)null);
        return;
      case AlisaPackage.NOTES__NOTES:
        getNotes().clear();
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case AlisaPackage.NOTES__NOTES_TARGET:
        return notesTarget != null;
      case AlisaPackage.NOTES__NOTES:
        return notes != null && !notes.isEmpty();
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuffer result = new StringBuffer(super.toString());
    result.append(" (notes: ");
    result.append(notes);
    result.append(')');
    return result.toString();
  }

} //NotesImpl
