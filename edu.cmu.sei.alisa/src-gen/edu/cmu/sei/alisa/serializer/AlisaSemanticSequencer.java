package edu.cmu.sei.alisa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.cmu.sei.alisa.alisa.AlisaConfiguration;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.DocumentSection;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.ExternalDocuments;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Goals;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.RDAPackage;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementDocument;
import edu.cmu.sei.alisa.alisa.Requirements;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;
import edu.cmu.sei.alisa.alisa.VerificationLibrary;
import edu.cmu.sei.alisa.alisa.VerificationResult;
import edu.cmu.sei.alisa.alisa.XDocUri;
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
			case AlisaPackage.ALISA_CONFIGURATION:
				if(context == grammarAccess.getAlisaConfigurationRule() ||
				   context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule()) {
					sequence_AlisaConfiguration(context, (AlisaConfiguration) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.CATEGORY:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getCategoryRule()) {
					sequence_Category(context, (Category) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.DOCUMENT_SECTION:
				if(context == grammarAccess.getDocumentSectionRule() ||
				   context == grammarAccess.getReqDocContentRule()) {
					sequence_DocumentSection(context, (DocumentSection) semanticObject); 
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
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule() ||
				   context == grammarAccess.getExternalDocumentsRule()) {
					sequence_ExternalDocuments(context, (ExternalDocuments) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.GOAL:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getContractualElementRule() ||
				   context == grammarAccess.getGoalRule() ||
				   context == grammarAccess.getReqDocContentRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.GOALS:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule() ||
				   context == grammarAccess.getGoalsRule()) {
					sequence_Goals(context, (Goals) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ORGANIZATION:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule() ||
				   context == grammarAccess.getOrganizationRule()) {
					sequence_Organization(context, (Organization) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.RDA_PACKAGE:
				if(context == grammarAccess.getAlisaDocumentRule() ||
				   context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule() ||
				   context == grammarAccess.getRDAPackageRule()) {
					sequence_RDAPackage(context, (RDAPackage) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getContractualElementRule() ||
				   context == grammarAccess.getReqDocContentRule() ||
				   context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT_DOCUMENT:
				if(context == grammarAccess.getAlisaDocumentRule() ||
				   context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule() ||
				   context == grammarAccess.getRequirementDocumentRule()) {
					sequence_RequirementDocument(context, (RequirementDocument) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENTS:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule() ||
				   context == grammarAccess.getRequirementsRule()) {
					sequence_Requirements(context, (Requirements) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.STAKEHOLDER:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getStakeholderRule()) {
					sequence_Stakeholder(context, (Stakeholder) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_ACTIVITY:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getVerificationActivityRule()) {
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
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getAlisaNameSpaceRule() ||
				   context == grammarAccess.getVerificationLibraryRule()) {
					sequence_VerificationLibrary(context, (VerificationLibrary) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_RESULT:
				if(context == grammarAccess.getAlisaElementRule() ||
				   context == grammarAccess.getVerificationResultRule()) {
					sequence_VerificationResult(context, (VerificationResult) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.XDOC_URI:
				if(context == grammarAccess.getXDocUriRule()) {
					sequence_XDocUri(context, (XDocUri) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (name=ID category+=Category*)
	 */
	protected void sequence_AlisaConfiguration(EObject context, AlisaConfiguration semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID extends=[Category|CATREF]?)
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content+=ReqDocContent*)
	 */
	protected void sequence_DocumentSection(EObject context, DocumentSection semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID externalReference=DOCPATH)
	 */
	protected void sequence_ExternalDocument(EObject context, ExternalDocument semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__EXTERNAL_REFERENCE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlisaPackage.Literals.EXTERNAL_DOCUMENT__EXTERNAL_REFERENCE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExternalDocumentAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getExternalDocumentAccess().getExternalReferenceDOCPATHParserRuleCall_4_0(), semanticObject.getExternalReference());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID docs+=ExternalDocument docs+=ExternalDocument*)
	 */
	protected void sequence_ExternalDocuments(EObject context, ExternalDocuments semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=RELREF? 
	 *         (category+=[Category|CATREF] category+=[Category|CATREF]*)? 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         assert=ValueString? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)? 
	 *         (modelReference+=QCRELREF modelReference+=QCRELREF*)? 
	 *         (refinesReference+=[Goal|REQREF] refinesReference+=[Goal|REQREF]*)? 
	 *         (decomposesReference+=[Goal|REQREF] decomposesReference+=[Goal|REQREF]*)? 
	 *         (evolvesReference+=[Goal|REQREF] evolvesReference+=[Goal|REQREF]*)? 
	 *         (conflictsReference+=[Goal|REQREF] conflictsReference+=[Goal|REQREF]*)? 
	 *         (stakeholderReference+=[Stakeholder|RELREF] stakeholderReference+=[Stakeholder|RELREF]*)? 
	 *         (stakeholderRequirementReference+=[Goal|REQREF] stakeholderRequirementReference+=[Goal|REQREF]*)? 
	 *         (systemRequirementReference+=[ContractualElement|REQREF] systemRequirementReference+=[ContractualElement|REQREF]*)? 
	 *         (docReference+=[ExternalDocument|RELREF] docReference+=[ExternalDocument|RELREF]*)?
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID target=[NamedElement|QCLREF] goals+=Goal* (issue+=ValueString issue+=ValueString*)?)
	 */
	protected void sequence_Goals(EObject context, Goals semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID stakeholder+=Stakeholder*)
	 */
	protected void sequence_Organization(EObject context, Organization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (importedNamespace+=[AlisaNameSpace|ID] importedNamespace+=[AlisaNameSpace|ID]*)? 
	 *         (importedNamespace+=[AadlPackage|QPREF] importedNamespace+=[AadlPackage|QPREF]*)? 
	 *         (content+=Goals | content+=Requirements)*
	 *     )
	 */
	protected void sequence_RDAPackage(EObject context, RDAPackage semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content+=ReqDocContent*)
	 */
	protected void sequence_RequirementDocument(EObject context, RequirementDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=RELREF? 
	 *         (category+=[Category|CATREF] category+=[Category|CATREF]*)? 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         assert=ValueString? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)? 
	 *         (modelReference+=QCRELREF modelReference+=QCRELREF*)? 
	 *         (goalReference+=[Goal|ID] goalReference+=[Goal|ID]*)? 
	 *         (hazardReference+=QNEREF hazardReference+=QNEREF*)? 
	 *         (refinesReference+=[Requirement|REQREF] refinesReference+=[Requirement|REQREF]*)? 
	 *         (decomposesReference+=[Requirement|REQREF] decomposesReference+=[Requirement|REQREF]*)? 
	 *         (evolvesReference+=[Requirement|REQREF] evolvesReference+=[Requirement|REQREF]*)? 
	 *         verifiedBy+=VerificationDecomposition* 
	 *         (stakeholderRequirementReference+=[Goal|REQREF] stakeholderRequirementReference+=[Goal|REQREF]*)? 
	 *         (systemRequirementReference+=[ContractualElement|REQREF] systemRequirementReference+=[ContractualElement|REQREF]*)? 
	 *         (docReference+=XDocUri docReference+=XDocUri*)?
	 *     )
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID target=[NamedElement|QCLREF] reqs+=Requirement* (issue+=ValueString issue+=ValueString*)?)
	 */
	protected void sequence_Requirements(EObject context, Requirements semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         role=ValueString? 
	 *         email=ValueString? 
	 *         phone=ValueString?
	 *     )
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
	 *     (name=ID (content+=VerificationActivity | content+=VerificationResult)*)
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
	
	
	/**
	 * Constraint:
	 *     (docPath=[ExternalDocument|RELREF] docFragment=DOCFRAGMENT?)
	 */
	protected void sequence_XDocUri(EObject context, XDocUri semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
