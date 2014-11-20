package edu.cmu.sei.alisa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.Category;
import edu.cmu.sei.alisa.alisa.ContractualElement;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationDecomposition;
import edu.cmu.sei.alisa.alisa.VerificationResult;
import edu.cmu.sei.alisa.alisa.XDocUri;
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
			case AlisaPackage.CATEGORY:
				if(context == grammarAccess.getCategoryRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRSALElementRule()) {
					sequence_Category(context, (Category) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.CONTRACTUAL_ELEMENT:
				if(context == grammarAccess.getContractualElementRule() ||
				   context == grammarAccess.getNamedElementRule()) {
					sequence_ContractualElement(context, (ContractualElement) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.EXTERNAL_DOCUMENT:
				if(context == grammarAccess.getExternalDocumentRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRSALElementRule()) {
					sequence_ExternalDocument(context, (ExternalDocument) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.GOAL:
				if(context == grammarAccess.getCRRule() ||
				   context == grammarAccess.getGoalRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRSALElementRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ORGANIZATION:
				if(context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getOrganizationRule()) {
					sequence_Organization(context, (Organization) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.RSAL_CONTAINER:
				if(context == grammarAccess.getNamedElementRule()) {
					sequence_NamedElement_RSALPackage_RSALSection(context, (RSALContainer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getRSALPackageRule()) {
					sequence_RSALPackage(context, (RSALContainer) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRSALElementRule() ||
				   context == grammarAccess.getRSALSectionRule()) {
					sequence_RSALSection(context, (RSALContainer) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT:
				if(context == grammarAccess.getCRRule() ||
				   context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRSALElementRule() ||
				   context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.STAKEHOLDER:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRSALElementRule() ||
				   context == grammarAccess.getStakeholderRule()) {
					sequence_Stakeholder(context, (Stakeholder) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_ACTIVITY:
				if(context == grammarAccess.getNamedElementRule() ||
				   context == grammarAccess.getRSALElementRule() ||
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
			case AlisaPackage.VERIFICATION_RESULT:
				if(context == grammarAccess.getNamedElementRule() ||
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
	 *     (name=ID extends=[Category|CATREF]?)
	 */
	protected void sequence_Category(EObject context, Category semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=[NamedElement|QNEREF]? 
	 *         (category+=[Category|CATREF] category+=[Category|CATREF]*)? 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         assert=ValueString? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)? 
	 *         (modelReference+=QCRELREF modelReference+=QCRELREF*)? 
	 *         (refinesReference+=[ContractualElement|REQREF] refinesReference+=[ContractualElement|REQREF]*)? 
	 *         (decomposesReference+=[ContractualElement|REQREF] decomposesReference+=[ContractualElement|REQREF]*)? 
	 *         (evolvesReference+=[ContractualElement|REQREF] evolvesReference+=[ContractualElement|REQREF]*)? 
	 *         (conflictsReference+=[ContractualElement|REQREF] conflictsReference+=[ContractualElement|REQREF]*)? 
	 *         (stakeholderReference+=[Stakeholder|RELREF] stakeholderReference+=[Stakeholder|RELREF]*)? 
	 *         (stakeholderRequirementReference+=[ContractualElement|REQREF] stakeholderRequirementReference+=[ContractualElement|REQREF]*)? 
	 *         (systemRequirementReference+=[ContractualElement|REQREF] systemRequirementReference+=[ContractualElement|REQREF]*)? 
	 *         (docReference+=XDocUri docReference+=XDocUri*)?
	 *     )
	 */
	protected void sequence_ContractualElement(EObject context, ContractualElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID externalReference=DOCPATH)
	 */
	protected void sequence_ExternalDocument(EObject context, ExternalDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=[NamedElement|QNEREF]? 
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
	 *         (docReference+=XDocUri docReference+=XDocUri*)?
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         (name=ID content+=RSALElement+ (issue+=ValueString issue+=ValueString*)?) | 
	 *         (
	 *             name=ID 
	 *             (importedNamespace+=[RSALContainer|ID] importedNamespace+=[RSALContainer|ID]*)? 
	 *             (importedNamespace+=[AadlPackage|QPREF] importedNamespace+=[AadlPackage|QPREF]*)? 
	 *             content+=RSALElement+ 
	 *             (issue+=ValueString issue+=ValueString*)?
	 *         )
	 *     )
	 */
	protected void sequence_NamedElement_RSALPackage_RSALSection(EObject context, RSALContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID stakeholder+=Stakeholder+)
	 */
	protected void sequence_Organization(EObject context, Organization semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         (importedNamespace+=[RSALContainer|ID] importedNamespace+=[RSALContainer|ID]*)? 
	 *         (importedNamespace+=[AadlPackage|QPREF] importedNamespace+=[AadlPackage|QPREF]*)? 
	 *         content+=RSALElement+ 
	 *         (issue+=ValueString issue+=ValueString*)?
	 *     )
	 */
	protected void sequence_RSALPackage(EObject context, RSALContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID content+=RSALElement+ (issue+=ValueString issue+=ValueString*)?)
	 */
	protected void sequence_RSALSection(EObject context, RSALContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=[NamedElement|QNEREF]? 
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
	 *         (stakeholderRequirementReference+=[Goal|REQREF] stakeholderRequirementReference+=[Goal|REQREF]*)? 
	 *         (systemRequirementReference+=[ContractualElement|REQREF] systemRequirementReference+=[ContractualElement|REQREF]*)? 
	 *         verifiedBy+=VerificationDecomposition* 
	 *         (docReference+=XDocUri docReference+=XDocUri*)?
	 *     )
	 */
	protected void sequence_Requirement(EObject context, Requirement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         role=ValueString? 
	 *         organziation=ValueString 
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
