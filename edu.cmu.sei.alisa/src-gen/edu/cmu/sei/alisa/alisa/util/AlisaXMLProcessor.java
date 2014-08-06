/**
 */
package edu.cmu.sei.alisa.alisa.util;

import edu.cmu.sei.alisa.alisa.AlisaPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.util.XMLProcessor;

/**
 * This class contains helper methods to serialize and deserialize XML documents
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AlisaXMLProcessor extends XMLProcessor
{

  /**
   * Public constructor to instantiate the helper.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaXMLProcessor()
  {
    super((EPackage.Registry.INSTANCE));
    AlisaPackage.eINSTANCE.eClass();
  }
  
  /**
   * Register for "*" and "xml" file extensions the AlisaResourceFactoryImpl factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected Map<String, Resource.Factory> getRegistrations()
  {
    if (registrations == null)
    {
      super.getRegistrations();
      registrations.put(XML_EXTENSION, new AlisaResourceFactoryImpl());
      registrations.put(STAR_EXTENSION, new AlisaResourceFactoryImpl());
    }
    return registrations;
  }

} //AlisaXMLProcessor
