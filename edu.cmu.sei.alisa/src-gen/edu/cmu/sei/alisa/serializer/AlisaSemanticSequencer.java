package edu.cmu.sei.alisa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ElementType;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;
import edu.cmu.sei.alisa.alisa.VerificationResult;
import edu.cmu.sei.alisa.services.AlisaGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;

@SuppressWarnings("all")
public class AlisaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AlisaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AlisaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AlisaPackage.ALISA_MODEL:
				if(context == grammarAccess.getAlisaModelRule()) {
					sequence_AlisaModel(context, (AlisaModel) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ELEMENT_TYPE:
				if(context == grammarAccess.getElementTypeRule()) {
					sequence_ElementType(context, (ElementType) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT:
				if(context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT_DECOMPOSITION:
				if(context == grammarAccess.getRequirementDecompositionRule()) {
					sequence_RequirementDecomposition(context, (RequirementDecomposition) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.STAKEHOLDER:
				if(context == grammarAccess.getStakeholderRule()) {
					sequence_Stakeholder(context, (Stakeholder) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_ACTIVITY:
				if(context == grammarAccess.getVerificationActivityRule()) {
					sequence_VerificationActivity(context, (VerificationActivity) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_DECOMPOSITION:
				if(context == grammarAccess.getVerificationDecompositionRule()) {
					sequence_VerificationDecomposition(context, (VerificationDecomposition) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_RESULT:
				if(context == grammarAccess.getVerificationResultRule()) {
					sequence_VerificationResult(context, (VerificationResult) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (content+=Stakeholder | content+=Requirement | content+=VerificationActivity | content+=VerificationResult | content+=ElementType)*
	 */
	protected void sequence_AlisaModel(EObject context, AlisaModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         reference=ValueString? 
	 *         elementType=ValueString? 
	 *         modelType=ValueString? 
	 *         details=ValueString? 
	 *         version+=ValueString*
	 *     )
	 */
	protected void sequence_ElementType(EObject context, ElementType semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements=[Requirement|ID] | (left=[Requirement|ID] (type='and' | type='or') right=RequirementDecomposition))
	 */
	protected void sequence_RequirementDecomposition(EObject context, RequirementDecomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         comment=ValueString? 
	 *         assignedTo+=[Stakeholder|ID]* 
	 *         referencedBy+=[ElementType|ID]* 
	 *         verifiedBy+=VerificationDecomposition* 
	 *         decomposedBy+=RequirementDecomposition*
	 *     )
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=ValueString? description=ValueString? role=ValueString?)
	 */
	protected void sequence_Stakeholder(EObject context, Stakeholder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID title=ValueString? description=ValueString? method=VerificationMethod? assignedTo+=[Stakeholder|ID]*)
	 */
	protected void sequence_VerificationActivity(EObject context, VerificationActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (elements=[VerificationActivity|ID] | (left=[VerificationActivity|ID] (type='and' | type='or') right=VerificationDecomposition))
	 */
	protected void sequence_VerificationDecomposition(EObject context, VerificationDecomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         referencedVerificationMethod+=[VerificationActivity|ID]* 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         method=ValueString? 
	 *         state=VerificationResultState? 
	 *         status=VerificationResultStatus?
	 *     )
	 */
	protected void sequence_VerificationResult(EObject context, VerificationResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
