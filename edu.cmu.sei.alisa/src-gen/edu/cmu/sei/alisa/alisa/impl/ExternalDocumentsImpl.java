/**
 */
package edu.cmu.sei.alisa.alisa.impl;

import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>External Documents</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentsImpl#getFqn <em>Fqn</em>}</li>
 *   <li>{@link edu.cmu.sei.alisa.alisa.impl.ExternalDocumentsImpl#getDocs <em>Docs</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ExternalDocumentsImpl extends DocumentImpl implements ExternalDocuments
{
  /**
   * The default value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected static final String FQN_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFqn() <em>Fqn</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFqn()
   * @generated
   * @ordered
   */
  protected String fqn = FQN_EDEFAULT;

  /**
   * The cached value of the '{@link #getDocs() <em>Docs</em>}' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getDocs()
   * @generated
   * @ordered
   */
  protected EList<ExternalDocument> docs;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ExternalDocumentsImpl()
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
    return AlisaPackage.Literals.EXTERNAL_DOCUMENTS;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public String getFqn()
  {
    return fqn;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setFqn(String newFqn)
  {
    String oldFqn = fqn;
    fqn = newFqn;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, AlisaPackage.EXTERNAL_DOCUMENTS__FQN, oldFqn, fqn));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<ExternalDocument> getDocs()
  {
    if (docs == null)
    {
      docs = new EObjectContainmentEList<ExternalDocument>(ExternalDocument.class, this, AlisaPackage.EXTERNAL_DOCUMENTS__DOCS);
    }
    return docs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case AlisaPackage.EXTERNAL_DOCUMENTS__DOCS:
        return ((InternalEList<?>)getDocs()).basicRemove(otherEnd, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
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
      case AlisaPackage.EXTERNAL_DOCUMENTS__FQN:
        return getFqn();
      case AlisaPackage.EXTERNAL_DOCUMENTS__DOCS:
        return getDocs();
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
      case AlisaPackage.EXTERNAL_DOCUMENTS__FQN:
        setFqn((String)newValue);
        return;
      case AlisaPackage.EXTERNAL_DOCUMENTS__DOCS:
        getDocs().clear();
        getDocs().addAll((Collection<? extends ExternalDocument>)newValue);
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
      case AlisaPackage.EXTERNAL_DOCUMENTS__FQN:
        setFqn(FQN_EDEFAULT);
        return;
      case AlisaPackage.EXTERNAL_DOCUMENTS__DOCS:
        getDocs().clear();
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
      case AlisaPackage.EXTERNAL_DOCUMENTS__FQN:
        return FQN_EDEFAULT == null ? fqn != null : !FQN_EDEFAULT.equals(fqn);
      case AlisaPackage.EXTERNAL_DOCUMENTS__DOCS:
        return docs != null && !docs.isEmpty();
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
    result.append(" (fqn: ");
    result.append(fqn);
    result.append(')');
    return result.toString();
  }

} //ExternalDocumentsImpl