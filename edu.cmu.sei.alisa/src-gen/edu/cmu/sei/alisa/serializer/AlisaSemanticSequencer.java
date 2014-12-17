package edu.cmu.sei.alisa.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import edu.cmu.sei.alisa.alisa.AlisaPackage;
import edu.cmu.sei.alisa.alisa.ArgumentReference;
import edu.cmu.sei.alisa.alisa.AssuranceArgument;
import edu.cmu.sei.alisa.alisa.AssuranceCase;
import edu.cmu.sei.alisa.alisa.AssuranceResult;
import edu.cmu.sei.alisa.alisa.BinaryExpr;
import edu.cmu.sei.alisa.alisa.Description;
import edu.cmu.sei.alisa.alisa.DescriptionElement;
import edu.cmu.sei.alisa.alisa.ExternalDocument;
import edu.cmu.sei.alisa.alisa.Goal;
import edu.cmu.sei.alisa.alisa.Hazard;
import edu.cmu.sei.alisa.alisa.HazardCategories;
import edu.cmu.sei.alisa.alisa.HazardCategory;
import edu.cmu.sei.alisa.alisa.Organization;
import edu.cmu.sei.alisa.alisa.RSALContainer;
import edu.cmu.sei.alisa.alisa.RSALVariable;
import edu.cmu.sei.alisa.alisa.RefExpr;
import edu.cmu.sei.alisa.alisa.Requirement;
import edu.cmu.sei.alisa.alisa.RequirementCategories;
import edu.cmu.sei.alisa.alisa.RequirementCategory;
import edu.cmu.sei.alisa.alisa.Stakeholder;
import edu.cmu.sei.alisa.alisa.VerificationActivity;
import edu.cmu.sei.alisa.alisa.VerificationAssumption;
import edu.cmu.sei.alisa.alisa.VerificationCategories;
import edu.cmu.sei.alisa.alisa.VerificationCategory;
import edu.cmu.sei.alisa.alisa.VerificationMethod;
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
			case AlisaPackage.ARGUMENT_REFERENCE:
				if(context == grammarAccess.getArgumentReferenceRule()) {
					sequence_ArgumentReference(context, (ArgumentReference) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ASSURANCE_ARGUMENT:
				if(context == grammarAccess.getAssuranceArgumentRule()) {
					sequence_AssuranceArgument(context, (AssuranceArgument) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ASSURANCE_CASE:
				if(context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getAssuranceCaseRule()) {
					sequence_AssuranceCase(context, (AssuranceCase) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ASSURANCE_RESULT:
				if(context == grammarAccess.getAssuranceResultRule() ||
				   context == grammarAccess.getRSALResultRule()) {
					sequence_AssuranceResult(context, (AssuranceResult) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.BINARY_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArgumentExprRule() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AndExpr_ImpliesExpr_OrExpr(context, (BinaryExpr) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.DESCRIPTION:
				if(context == grammarAccess.getDescriptionRule()) {
					sequence_Description(context, (Description) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.DESCRIPTION_ELEMENT:
				if(context == grammarAccess.getDescriptionElementRule()) {
					sequence_DescriptionElement(context, (DescriptionElement) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.EXTERNAL_DOCUMENT:
				if(context == grammarAccess.getExternalDocumentRule()) {
					sequence_ExternalDocument(context, (ExternalDocument) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.GOAL:
				if(context == grammarAccess.getContractualElementRule() ||
				   context == grammarAccess.getGoalRule()) {
					sequence_Goal(context, (Goal) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.HAZARD:
				if(context == grammarAccess.getHazardRule()) {
					sequence_Hazard(context, (Hazard) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.HAZARD_CATEGORIES:
				if(context == grammarAccess.getCategoriesRule() ||
				   context == grammarAccess.getHazardCategoriesRule()) {
					sequence_HazardCategories(context, (HazardCategories) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.HAZARD_CATEGORY:
				if(context == grammarAccess.getCategoryRule() ||
				   context == grammarAccess.getHazardCategoryRule()) {
					sequence_HazardCategory(context, (HazardCategory) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.ORGANIZATION:
				if(context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getOrganizationRule()) {
					sequence_Organization(context, (Organization) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.RSAL_CONTAINER:
				if(context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getRSALContainerRule()) {
					sequence_RSALContainer(context, (RSALContainer) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.RSAL_VARIABLE:
				if(context == grammarAccess.getRSALVariableRule()) {
					sequence_RSALVariable(context, (RSALVariable) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REF_EXPR:
				if(context == grammarAccess.getAndExprRule() ||
				   context == grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getArgumentExprRule() ||
				   context == grammarAccess.getAtomicExprRule() ||
				   context == grammarAccess.getImpliesExprRule() ||
				   context == grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0() ||
				   context == grammarAccess.getOrExprRule() ||
				   context == grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0()) {
					sequence_AtomicExpr(context, (RefExpr) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT:
				if(context == grammarAccess.getContractualElementRule() ||
				   context == grammarAccess.getRequirementRule()) {
					sequence_Requirement(context, (Requirement) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT_CATEGORIES:
				if(context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getCategoriesRule() ||
				   context == grammarAccess.getRequirementCategoriesRule()) {
					sequence_RequirementCategories(context, (RequirementCategories) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.REQUIREMENT_CATEGORY:
				if(context == grammarAccess.getCategoryRule() ||
				   context == grammarAccess.getRequirementCategoryRule()) {
					sequence_RequirementCategory(context, (RequirementCategory) semanticObject); 
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
			case AlisaPackage.VERIFICATION_ASSUMPTION:
				if(context == grammarAccess.getContractualElementRule() ||
				   context == grammarAccess.getVerificationAssumptionRule()) {
					sequence_VerificationAssumption(context, (VerificationAssumption) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_CATEGORIES:
				if(context == grammarAccess.getAlisaModelRule() ||
				   context == grammarAccess.getCategoriesRule() ||
				   context == grammarAccess.getVerificationCategoriesRule()) {
					sequence_VerificationCategories(context, (VerificationCategories) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_CATEGORY:
				if(context == grammarAccess.getCategoryRule() ||
				   context == grammarAccess.getVerificationCategoryRule()) {
					sequence_VerificationCategory(context, (VerificationCategory) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_METHOD:
				if(context == grammarAccess.getVerificationMethodRule()) {
					sequence_VerificationMethod(context, (VerificationMethod) semanticObject); 
					return; 
				}
				else break;
			case AlisaPackage.VERIFICATION_RESULT:
				if(context == grammarAccess.getRSALResultRule() ||
				   context == grammarAccess.getVerificationResultRule()) {
					sequence_VerificationResult(context, (VerificationResult) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (
	 *         (left=OrExpr_BinaryExpr_1_0_0_0 op='or' right=AndExpr) | 
	 *         (left=AndExpr_BinaryExpr_1_0_0_0 op='and' right=AtomicExpr) | 
	 *         (left=ImpliesExpr_BinaryExpr_1_0_0_0 op='=>' right=ImpliesExpr)
	 *     )
	 */
	protected void sequence_AndExpr_ImpliesExpr_OrExpr(EObject context, BinaryExpr semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (reference=[VerificationActivity|DOTTEDREF] weight=INT?)
	 */
	protected void sequence_ArgumentReference(EObject context, ArgumentReference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (expression=ArgumentExpr rationale=ValueString?)
	 */
	protected void sequence_AssuranceArgument(EObject context, AssuranceArgument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID target=[SystemInstance|ID] results+=AssuranceResult+)
	 */
	protected void sequence_AssuranceCase(EObject context, AssuranceCase semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         requirement=[Requirement|ID] 
	 *         passCount=INT 
	 *         failCount=INT 
	 *         neutralCount=INT 
	 *         unknownCount=INT 
	 *         subClaimResult+=AssuranceResult* 
	 *         subVAResult+=VerificationResult*
	 *     )
	 */
	protected void sequence_AssuranceResult(EObject context, AssuranceResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     id=ArgumentReference
	 */
	protected void sequence_AtomicExpr(EObject context, RefExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlisaPackage.Literals.REF_EXPR__ID) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlisaPackage.Literals.REF_EXPR__ID));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtomicExprAccess().getIdArgumentReferenceParserRuleCall_0_1_0(), semanticObject.getId());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (text=STRING | ref=[RSALVariable|ID])
	 */
	protected void sequence_DescriptionElement(EObject context, DescriptionElement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     description+=DescriptionElement+
	 */
	protected void sequence_Description(EObject context, Description semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (docReference=DOCPATH docFragment=DOCFRAGMENT?)
	 */
	protected void sequence_ExternalDocument(EObject context, ExternalDocument semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=[NamedElement|QNEREF]? 
	 *         (category+=[RequirementCategory|CATREF] category+=[RequirementCategory|CATREF]*)? 
	 *         title=ValueString? 
	 *         description=Description? 
	 *         assert=ValueString? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)? 
	 *         (refinesReference+=[Goal|DOTTEDREF] refinesReference+=[Goal|DOTTEDREF]*)? 
	 *         subgoal+=Goal* 
	 *         (decomposesReference+=[Goal|DOTTEDREF] decomposesReference+=[Goal|DOTTEDREF]*)? 
	 *         (evolvesReference+=[Goal|DOTTEDREF] evolvesReference+=[Goal|DOTTEDREF]*)? 
	 *         (conflictsReference+=[Goal|DOTTEDREF] conflictsReference+=[Goal|DOTTEDREF]*)? 
	 *         (stakeholderReference+=[Stakeholder|DOTTEDREF] stakeholderReference+=[Stakeholder|DOTTEDREF]*)? 
	 *         (stakeholderRequirementReference+=[Goal|DOTTEDREF] stakeholderRequirementReference+=[Goal|DOTTEDREF]*)? 
	 *         (systemRequirementReference+=[ContractualElement|DOTTEDREF] systemRequirementReference+=[ContractualElement|DOTTEDREF]*)? 
	 *         (docReference+=ExternalDocument docReference+=ExternalDocument*)? 
	 *         (modelReference+=QDOTTEDPAREF modelReference+=QDOTTEDPAREF*)?
	 *     )
	 */
	protected void sequence_Goal(EObject context, Goal semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID category+=HazardCategory+)
	 */
	protected void sequence_HazardCategories(EObject context, HazardCategories semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID extends=[HazardCategory|DOTTEDREF]?)
	 */
	protected void sequence_HazardCategory(EObject context, HazardCategory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=[VerificationActivity|DOTTEDREF]? 
	 *         (category+=[HazardCategory|CATREF] category+=[HazardCategory|CATREF]*)? 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         mitigated=[Requirement|DOTTEDREF]? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)?
	 *     )
	 */
	protected void sequence_Hazard(EObject context, Hazard semanticObject) {
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
	 *         target=[NamedElement|QNEREF]? 
	 *         (content+=Goal | content+=Requirement | content+=VerificationActivity | content+=RSALContainer) 
	 *         (issue+=ValueString issue+=ValueString*)?
	 *     )
	 */
	protected void sequence_RSALContainer(EObject context, RSALContainer semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID value=ValueString)
	 */
	protected void sequence_RSALVariable(EObject context, RSALVariable semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AlisaPackage.Literals.RSAL_VARIABLE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlisaPackage.Literals.RSAL_VARIABLE__NAME));
			if(transientValues.isValueTransient(semanticObject, AlisaPackage.Literals.RSAL_VARIABLE__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AlisaPackage.Literals.RSAL_VARIABLE__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRSALVariableAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getRSALVariableAccess().getValueValueStringParserRuleCall_3_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID category+=RequirementCategory+)
	 */
	protected void sequence_RequirementCategories(EObject context, RequirementCategories semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID extends=[RequirementCategory|DOTTEDREF]?)
	 */
	protected void sequence_RequirementCategory(EObject context, RequirementCategory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=[NamedElement|QNEREF]? 
	 *         (category+=[RequirementCategory|CATREF] category+=[RequirementCategory|CATREF]*)? 
	 *         title=ValueString? 
	 *         description=Description? 
	 *         assert=ValueString? 
	 *         rationale=ValueString? 
	 *         reqValue+=RSALVariable* 
	 *         (issue+=ValueString issue+=ValueString*)? 
	 *         (goalReference+=[Goal|ID] goalReference+=[Goal|ID]*)? 
	 *         (hazardReference+=QNEREF hazardReference+=QNEREF*)? 
	 *         (refinesReference+=[Requirement|DOTTEDREF] refinesReference+=[Requirement|DOTTEDREF]*)? 
	 *         subrequirement+=Requirement* 
	 *         (decomposesReference+=[Requirement|DOTTEDREF] decomposesReference+=[Requirement|DOTTEDREF]*)? 
	 *         (evolvesReference+=[Requirement|DOTTEDREF] evolvesReference+=[Requirement|DOTTEDREF]*)? 
	 *         (stakeholderRequirementReference+=[Goal|DOTTEDREF] stakeholderRequirementReference+=[Goal|DOTTEDREF]*)? 
	 *         (systemRequirementReference+=[ContractualElement|DOTTEDREF] systemRequirementReference+=[ContractualElement|DOTTEDREF]*)? 
	 *         verifiedBy+=VerificationActivity* 
	 *         argument=AssuranceArgument? 
	 *         (docReference+=ExternalDocument docReference+=ExternalDocument*)? 
	 *         (modelReference+=QDOTTEDPAREF modelReference+=QDOTTEDPAREF*)?
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
	 *         (category+=[Category|DOTTEDREF] category+=[Category|DOTTEDREF]*)? 
	 *         method=VerificationMethod? 
	 *         assumption+=VerificationAssumption*
	 *     )
	 */
	protected void sequence_VerificationActivity(EObject context, VerificationActivity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         target=[VerificationActivity|DOTTEDREF]? 
	 *         (category+=[RequirementCategory|CATREF] category+=[RequirementCategory|CATREF]*)? 
	 *         title=ValueString? 
	 *         description=Description? 
	 *         assert=[Requirement|DOTTEDREF]? 
	 *         verifiedBy+=VerificationActivity* 
	 *         argument=AssuranceArgument? 
	 *         rationale=ValueString? 
	 *         (issue+=ValueString issue+=ValueString*)?
	 *     )
	 */
	protected void sequence_VerificationAssumption(EObject context, VerificationAssumption semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID category+=VerificationCategory+)
	 */
	protected void sequence_VerificationCategories(EObject context, VerificationCategories semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID extends=[VerificationCategory|DOTTEDREF]?)
	 */
	protected void sequence_VerificationCategory(EObject context, VerificationCategory semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         language=SupportedLanguage 
	 *         method=ValueString 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         (category+=[Category|DOTTEDREF] category+=[Category|DOTTEDREF]*)?
	 *     )
	 */
	protected void sequence_VerificationMethod(EObject context, VerificationMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         name=ID 
	 *         verificationActivity=[VerificationActivity|ID] 
	 *         title=ValueString? 
	 *         description=ValueString? 
	 *         method=ValueString? 
	 *         state=VerificationResultState? 
	 *         status=VerificationResultStatus? 
	 *         assumptionVerificationResult+=VerificationResult*
	 *     )
	 */
	protected void sequence_VerificationResult(EObject context, VerificationResult semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
