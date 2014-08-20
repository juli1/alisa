package edu.cmu.sei.alisa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.cmu.sei.alisa.alisa.Alias;
import edu.cmu.sei.alisa.alisa.Aliases;
import edu.cmu.sei.alisa.alisa.AlisaModel;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ElementReference;
import edu.cmu.sei.alisa.alisa.ElementType;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Goals;
import edu.cmu.sei.alisa.alisa.Notes;
import edu.cmu.sei.alisa.alisa.ReqSpec;
import edu.cmu.sei.alisa.alisa.ReqSpecifications;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDecomposition;
import edu.cmu.sei.alisa.alisa.RequirementDocument;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;
import edu.cmu.sei.alisa.alisa.VerificationLibrary;
import edu.cmu.sei.alisa.alisa.VerificationResult;
import edu.cmu.sei.alisa.services.AlisaGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AlisaSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AlisaGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AlisaPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AlisaPackage.ALIAS:
				if(context == grammarAccess.getAliasRule()) {
					sequence_Alias(context, (Alias) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ALIASES:
				if(context == grammarAccess.getAliasesRule()) {
					sequence_Aliases(context, (Aliases) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ALISA_MODEL:
				if(context == grammarAccess.getAlisaModelRule()) {
					sequence_AlisaModel(context, (AlisaModel) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ELEMENT_REFERENCE:
				if(context == grammarAccess.getElementReferenceRule()) {
					sequence_ElementReference(context, (ElementReference) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ELEMENT_TYPE:
				if(context == grammarAccess.getElementTypeRule()) {
					sequence_ElementType(context, (ElementType) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.EXTERNAL_DOCUMENT:
				if(context == grammarAccess.getExternalDocumentRule()) {
					sequence_ExternalDocument(context, (ExternalDocument) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.EXTERNAL_DOCUMENTS:
				if(context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getExternalDocumentsRule()) {
					sequence_ExternalDocuments(context, (ExternalDocuments) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.GOAL:
				if(context == grammarAccess.getGoalRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.GOALS:
				if(context == grammarAccess.getGoalsRule()) {
					sequence_Goals(context, (Goals) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.NOTES:
				if(context == grammarAccess.getNotesRule()) {
					sequence_Notes(context, (Notes) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQ_SPEC:
				if(context == grammarAccess.getReqSpecRule()) {
					sequence_ReqSpec(context, (ReqSpec) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQ_SPECIFICATIONS:
				if(context == grammarAccess.getReqSpecificationsRule()) {
					sequence_ReqSpecifications(context, (ReqSpecifications) semanticObject); 
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
			case AlisaPackage.REQUIREMENT_DOCUMENT:
				if(context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getRequirementDocumentRule()) {
					sequence_RequirementDocument(context, (RequirementDocument) semanticObject); 
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
			case AlisaPackage.VERIFICATION_LIBRARY:
				if(context == grammarAccess.getDocumentRule() ||
				   context == grammarAccess.getVerificationLibraryRule()) {
					sequence_VerificationLibrary(context, (VerificationLibrary) semanticObject); 
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
	 *     (alias=ValueString docRef+=[Document|ID] docRef+=[Document|ID]*)
	 */
	protected void sequence_Alias(EObject context, Alias semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (aliasesTarget=[NamedElement|QCLREF] aliases+=Alias aliases+=Alias*)
	 */
	protected void sequence_Aliases(EObject context, Aliases semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (importedNamespace+=[Document|ID] importedNamespace+=[Document|ID]*)? 
	 *         (importedNamespace+=[AadlPackage|QPREF] importedNamespace+=[AadlPackage|QPREF]*)? 
	 *         (
	 *             content+=Goals | 
	 *             content+=ReqSpecifications | 
	 *             content+=VerificationLibrary | 
	 *             content+=RequirementDocument | 
	 *             content+=ExternalDocuments | 
	 *             content+=VerificationActivity | 
	 *             content+=VerificationResult | 
	 *             content+=ElementType | 
	 *             content+=Aliases | 
	 *             content+=Notes
	 *         )*
	 *     )
	 */
	protected void sequence_AlisaModel(EObject context, AlisaModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         url=ValueString? 
	 *         modelReference+=[NamedElement|RELREF]? 
	 *         referenceType=ValueString? 
	 *         details=ValueString? 
	 *         version+=ValueString*
	 *     )
	 */
	protected void sequence_ElementReference(EObject context, ElementReference semanticObject) {
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
	 *     (fqn=ID xternalReference=STRING)
	 */
	protected void sequence_ExternalDocument(EObject context, ExternalDocument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__FQN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__FQN));
			if(transientValues.isValueTransient(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__XTERNAL_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__XTERNAL_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalDocumentAccess().getFqnIDTerminalRuleCall_1_0(), semanticObject.getFqn());
		feeder.accept(grammarAccess.getExternalDocumentAccess().getXternalReferenceSTRINGTerminalRuleCall_4_0(), semanticObject.getXternalReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (fqn=ID docs+=ExternalDocument docs+=ExternalDocument*)
	 */
	protected void sequence_ExternalDocuments(EObject context, ExternalDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         fqn=ID 
	 *         goalTarget=[NamedElement|RELREF]? 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         assert=ValueString? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)? 
	 *         (modelReference+=QCRELREF modelReference+=QCRELREF*)? 
	 *         (refinesReference+=[Goal|REQREF] refinesReference+=[Goal|REQREF]*)? 
	 *         (decomposesReference+=[ReqSpec|REQREF] decomposesReference+=[ReqSpec|REQREF]*)? 
	 *         (evolvesReference+=[Goal|REQREF] evolvesReference+=[Goal|REQREF]*)? 
	 *         (stakeholderReference+=[Requirement|REQREF] stakeholderReference+=[Requirement|REQREF]*)? 
	 *         (docReferences+=[ExternalDocument|RELREF] docReferences+=[ExternalDocument|RELREF]*)?
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fqn=ID classifier=[Classifier|QCLREF] goals+=Goal*)
	 */
	protected void sequence_Goals(EObject context, Goals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (notesTarget=[NamedElement|QCLREF] notes+=ValueString notes+=ValueString*)
	 */
	protected void sequence_Notes(EObject context, Notes semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         reqkind=ReqKind 
	 *         fqn=ID 
	 *         reqTarget=[NamedElement|RELREF]? 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         assert=ValueString? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)? 
	 *         (modelReference+=QCRELREF modelReference+=QCRELREF*)? 
	 *         (goalReference+=[Goal|ID] goalReference+=[Goal|ID]*)? 
	 *         (hazardReference+=QNEREF hazardReference+=QNEREF*)? 
	 *         (refinesReference+=[ReqSpec|REQREF] refinesReference+=[ReqSpec|REQREF]*)? 
	 *         (decomposesReference+=[ReqSpec|REQREF] decomposesReference+=[ReqSpec|REQREF]*)? 
	 *         (evolvesReference+=[ReqSpec|REQREF] evolvesReference+=[ReqSpec|REQREF]*)? 
	 *         (stakeholderreqReference+=[Requirement|REQREF] stakeholderreqReference+=[Requirement|REQREF]*)? 
	 *         (systemreqReference+=[Requirement|REQREF] systemreqReference+=[Requirement|REQREF]*)? 
	 *         (docReferences+=[ExternalDocument|RELREF] docReferences+=[ExternalDocument|RELREF]*)?
	 *     )
	 */
	protected void sequence_ReqSpec(EObject context, ReqSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (fqn=ID reqTarget=[NamedElement|QCLREF] reqs+=ReqSpec*)
	 */
	protected void sequence_ReqSpecifications(EObject context, ReqSpecifications semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=[Requirement|RELREF] | (left=[Requirement|RELREF] (type='and' | type='or') right=RequirementDecomposition))
	 */
	protected void sequence_RequirementDecomposition(EObject context, RequirementDecomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID (content+=Requirement | content+=Stakeholder | content+=ElementType | content+=ElementReference)*)
	 */
	protected void sequence_RequirementDocument(EObject context, RequirementDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         comment=ValueString? 
	 *         assignedTo+=[Stakeholder|RELREF]* 
	 *         referencedBy+=[ElementType|RELREF]* 
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
	 *     (
	 *         name=ID 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         method=VerificationMethod? 
	 *         decomposedTo+=VerificationDecomposition* 
	 *         assignedTo+=[Stakeholder|RELREF]*
	 *     )
	 */
	protected void sequence_VerificationActivity(EObject context, VerificationActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (element=[VerificationActivity|RELREF] | (left=[VerificationActivity|RELREF] (type='and' | type='or') right=VerificationDecomposition))
	 */
	protected void sequence_VerificationDecomposition(EObject context, VerificationDecomposition semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (content+=VerificationActivity | content+=Stakeholder | content+=VerificationResult | content+=ElementType | content+=ElementReference)*
	 *     )
	 */
	protected void sequence_VerificationLibrary(EObject context, VerificationLibrary semanticObject) {
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
