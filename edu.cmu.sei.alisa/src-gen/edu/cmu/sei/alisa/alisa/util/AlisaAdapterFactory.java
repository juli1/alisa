/**
 */
package edu.cmu.sei.alisa.alisa.util;

import edu.cmu.sei.alisa.alisa.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see edu.cmu.sei.alisa.alisa.AlisaPackage
 * @generated
 */
public class AlisaAdapterFactory extends AdapterFactoryImpl
{
  /**
   * The cached model package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static AlisaPackage modelPackage;

  /**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AlisaAdapterFactory()
  {
    if (modelPackage == null)
    {
      modelPackage = AlisaPackage.eINSTANCE;
    }
  }

  /**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
   * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
   * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
  @Override
  public boolean isFactoryForType(Object object)
  {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

  /**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AlisaSwitch<Adapter> modelSwitch =
    new AlisaSwitch<Adapter>()
    {
      @Override
      public Adapter caseAlisaModel(AlisaModel object)
      {
        return createAlisaModelAdapter();
      }
      @Override
      public Adapter caseDocument(Document object)
      {
        return createDocumentAdapter();
      }
      @Override
      public Adapter caseRequirementDocument(RequirementDocument object)
      {
        return createRequirementDocumentAdapter();
      }
      @Override
      public Adapter caseVerificationLibrary(VerificationLibrary object)
      {
        return createVerificationLibraryAdapter();
      }
      @Override
      public Adapter caseGoals(Goals object)
      {
        return createGoalsAdapter();
      }
      @Override
      public Adapter caseGoal(Goal object)
      {
        return createGoalAdapter();
      }
      @Override
      public Adapter caseReqSpecifications(ReqSpecifications object)
      {
        return createReqSpecificationsAdapter();
      }
      @Override
      public Adapter caseReqSpec(ReqSpec object)
      {
        return createReqSpecAdapter();
      }
      @Override
      public Adapter caseExternalDocuments(ExternalDocuments object)
      {
        return createExternalDocumentsAdapter();
      }
      @Override
      public Adapter caseExternalDocument(ExternalDocument object)
      {
        return createExternalDocumentAdapter();
      }
      @Override
      public Adapter caseAliases(Aliases object)
      {
        return createAliasesAdapter();
      }
      @Override
      public Adapter caseAlias(Alias object)
      {
        return createAliasAdapter();
      }
      @Override
      public Adapter caseNotes(Notes object)
      {
        return createNotesAdapter();
      }
      @Override
      public Adapter caseStakeholder(Stakeholder object)
      {
        return createStakeholderAdapter();
      }
      @Override
      public Adapter caseDocumentedRequirement(DocumentedRequirement object)
      {
        return createDocumentedRequirementAdapter();
      }
      @Override
      public Adapter caseDocumentedRequirementDecomposition(DocumentedRequirementDecomposition object)
      {
        return createDocumentedRequirementDecompositionAdapter();
      }
      @Override
      public Adapter caseVerificationDecomposition(VerificationDecomposition object)
      {
        return createVerificationDecompositionAdapter();
      }
      @Override
      public Adapter caseElementType(ElementType object)
      {
        return createElementTypeAdapter();
      }
      @Override
      public Adapter caseElementReference(ElementReference object)
      {
        return createElementReferenceAdapter();
      }
      @Override
      public Adapter caseVerificationActivity(VerificationActivity object)
      {
        return createVerificationActivityAdapter();
      }
      @Override
      public Adapter caseVerificationResult(VerificationResult object)
      {
        return createVerificationResultAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

  /**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
  @Override
  public Adapter createAdapter(Notifier target)
  {
    return modelSwitch.doSwitch((EObject)target);
  }


  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.AlisaModel <em>Model</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.AlisaModel
   * @generated
   */
  public Adapter createAlisaModelAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.Document <em>Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.Document
   * @generated
   */
  public Adapter createDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.RequirementDocument <em>Requirement Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.RequirementDocument
   * @generated
   */
  public Adapter createRequirementDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.VerificationLibrary <em>Verification Library</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.VerificationLibrary
   * @generated
   */
  public Adapter createVerificationLibraryAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.Goals <em>Goals</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.Goals
   * @generated
   */
  public Adapter createGoalsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.Goal <em>Goal</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.Goal
   * @generated
   */
  public Adapter createGoalAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.ReqSpecifications <em>Req Specifications</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.ReqSpecifications
   * @generated
   */
  public Adapter createReqSpecificationsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.ReqSpec <em>Req Spec</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.ReqSpec
   * @generated
   */
  public Adapter createReqSpecAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.ExternalDocuments <em>External Documents</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocuments
   * @generated
   */
  public Adapter createExternalDocumentsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.ExternalDocument <em>External Document</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.ExternalDocument
   * @generated
   */
  public Adapter createExternalDocumentAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.Aliases <em>Aliases</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.Aliases
   * @generated
   */
  public Adapter createAliasesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.Alias <em>Alias</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.Alias
   * @generated
   */
  public Adapter createAliasAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.Notes <em>Notes</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.Notes
   * @generated
   */
  public Adapter createNotesAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.Stakeholder <em>Stakeholder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.Stakeholder
   * @generated
   */
  public Adapter createStakeholderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirement <em>Documented Requirement</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirement
   * @generated
   */
  public Adapter createDocumentedRequirementAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition <em>Documented Requirement Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.DocumentedRequirementDecomposition
   * @generated
   */
  public Adapter createDocumentedRequirementDecompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.VerificationDecomposition <em>Verification Decomposition</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.VerificationDecomposition
   * @generated
   */
  public Adapter createVerificationDecompositionAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.ElementType <em>Element Type</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.ElementType
   * @generated
   */
  public Adapter createElementTypeAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.ElementReference <em>Element Reference</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.ElementReference
   * @generated
   */
  public Adapter createElementReferenceAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.VerificationActivity <em>Verification Activity</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.VerificationActivity
   * @generated
   */
  public Adapter createVerificationActivityAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link edu.cmu.sei.alisa.alisa.VerificationResult <em>Verification Result</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see edu.cmu.sei.alisa.alisa.VerificationResult
   * @generated
   */
  public Adapter createVerificationResultAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
   * This default implementation returns null.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
  public Adapter createEObjectAdapter()
  {
    return null;
  }

} //AlisaAdapterFactory
