/*
* generated by Xtext
*/
package edu.cmu.sei.alisa.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import edu.cmu.sei.alisa.services.AlisaGrammarAccess;

public class AlisaParser extends AbstractContentAssistParser {
	
	@Inject
	private AlisaGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected edu.cmu.sei.alisa.ui.contentassist.antlr.internal.InternalAlisaParser createParser() {
		edu.cmu.sei.alisa.ui.contentassist.antlr.internal.InternalAlisaParser result = new edu.cmu.sei.alisa.ui.contentassist.antlr.internal.InternalAlisaParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getAlisaModelAccess().getAlternatives(), "rule__AlisaModel__Alternatives");
					put(grammarAccess.getContractualElementAccess().getAlternatives(), "rule__ContractualElement__Alternatives");
					put(grammarAccess.getReqDocContentAccess().getAlternatives(), "rule__ReqDocContent__Alternatives");
					put(grammarAccess.getAlisaDocumentAccess().getAlternatives(), "rule__AlisaDocument__Alternatives");
					put(grammarAccess.getAlisaElementAccess().getAlternatives(), "rule__AlisaElement__Alternatives");
					put(grammarAccess.getAlisaNameSpaceAccess().getAlternatives(), "rule__AlisaNameSpace__Alternatives");
					put(grammarAccess.getVerificationLibraryAccess().getContentAlternatives_3_0(), "rule__VerificationLibrary__ContentAlternatives_3_0");
					put(grammarAccess.getRDAPackageAccess().getContentAlternatives_4_0(), "rule__RDAPackage__ContentAlternatives_4_0");
					put(grammarAccess.getVerificationDecompositionAccess().getAlternatives(), "rule__VerificationDecomposition__Alternatives");
					put(grammarAccess.getVerificationDecompositionAccess().getTypeAlternatives_1_1_0(), "rule__VerificationDecomposition__TypeAlternatives_1_1_0");
					put(grammarAccess.getVerificationMethodAccess().getAlternatives(), "rule__VerificationMethod__Alternatives");
					put(grammarAccess.getQCRELREFAccess().getAlternatives(), "rule__QCRELREF__Alternatives");
					put(grammarAccess.getVerificationResultStateAccess().getAlternatives(), "rule__VerificationResultState__Alternatives");
					put(grammarAccess.getVerificationResultStatusAccess().getAlternatives(), "rule__VerificationResultStatus__Alternatives");
					put(grammarAccess.getRequirementDocumentAccess().getGroup(), "rule__RequirementDocument__Group__0");
					put(grammarAccess.getDocumentSectionAccess().getGroup(), "rule__DocumentSection__Group__0");
					put(grammarAccess.getVerificationLibraryAccess().getGroup(), "rule__VerificationLibrary__Group__0");
					put(grammarAccess.getRDAPackageAccess().getGroup(), "rule__RDAPackage__Group__0");
					put(grammarAccess.getRDAPackageAccess().getGroup_2(), "rule__RDAPackage__Group_2__0");
					put(grammarAccess.getRDAPackageAccess().getGroup_2_2(), "rule__RDAPackage__Group_2_2__0");
					put(grammarAccess.getRDAPackageAccess().getGroup_3(), "rule__RDAPackage__Group_3__0");
					put(grammarAccess.getRDAPackageAccess().getGroup_3_2(), "rule__RDAPackage__Group_3_2__0");
					put(grammarAccess.getGoalsAccess().getGroup(), "rule__Goals__Group__0");
					put(grammarAccess.getGoalsAccess().getGroup_5(), "rule__Goals__Group_5__0");
					put(grammarAccess.getGoalsAccess().getGroup_5_3(), "rule__Goals__Group_5_3__0");
					put(grammarAccess.getGoalAccess().getGroup(), "rule__Goal__Group__0");
					put(grammarAccess.getGoalAccess().getGroup_2_0(), "rule__Goal__Group_2_0__0");
					put(grammarAccess.getGoalAccess().getGroup_2_1(), "rule__Goal__Group_2_1__0");
					put(grammarAccess.getGoalAccess().getGroup_2_1_3(), "rule__Goal__Group_2_1_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_2(), "rule__Goal__Group_2_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_3(), "rule__Goal__Group_2_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_4(), "rule__Goal__Group_2_4__0");
					put(grammarAccess.getGoalAccess().getGroup_2_5(), "rule__Goal__Group_2_5__0");
					put(grammarAccess.getGoalAccess().getGroup_2_6(), "rule__Goal__Group_2_6__0");
					put(grammarAccess.getGoalAccess().getGroup_2_6_3(), "rule__Goal__Group_2_6_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_7(), "rule__Goal__Group_2_7__0");
					put(grammarAccess.getGoalAccess().getGroup_2_7_3(), "rule__Goal__Group_2_7_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_8(), "rule__Goal__Group_2_8__0");
					put(grammarAccess.getGoalAccess().getGroup_2_8_3(), "rule__Goal__Group_2_8_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_9(), "rule__Goal__Group_2_9__0");
					put(grammarAccess.getGoalAccess().getGroup_2_9_3(), "rule__Goal__Group_2_9_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_10(), "rule__Goal__Group_2_10__0");
					put(grammarAccess.getGoalAccess().getGroup_2_10_3(), "rule__Goal__Group_2_10_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_11(), "rule__Goal__Group_2_11__0");
					put(grammarAccess.getGoalAccess().getGroup_2_11_3(), "rule__Goal__Group_2_11_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_12(), "rule__Goal__Group_2_12__0");
					put(grammarAccess.getGoalAccess().getGroup_2_12_3(), "rule__Goal__Group_2_12_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_13(), "rule__Goal__Group_2_13__0");
					put(grammarAccess.getGoalAccess().getGroup_2_13_5(), "rule__Goal__Group_2_13_5__0");
					put(grammarAccess.getGoalAccess().getGroup_2_14(), "rule__Goal__Group_2_14__0");
					put(grammarAccess.getGoalAccess().getGroup_2_14_5(), "rule__Goal__Group_2_14_5__0");
					put(grammarAccess.getGoalAccess().getGroup_2_15(), "rule__Goal__Group_2_15__0");
					put(grammarAccess.getGoalAccess().getGroup_2_15_4(), "rule__Goal__Group_2_15_4__0");
					put(grammarAccess.getRequirementsAccess().getGroup(), "rule__Requirements__Group__0");
					put(grammarAccess.getRequirementsAccess().getGroup_5(), "rule__Requirements__Group_5__0");
					put(grammarAccess.getRequirementsAccess().getGroup_5_3(), "rule__Requirements__Group_5_3__0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_0(), "rule__Requirement__Group_2_0__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_1(), "rule__Requirement__Group_2_1__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_1_3(), "rule__Requirement__Group_2_1_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_2(), "rule__Requirement__Group_2_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_3(), "rule__Requirement__Group_2_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_4(), "rule__Requirement__Group_2_4__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_5(), "rule__Requirement__Group_2_5__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_6(), "rule__Requirement__Group_2_6__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_6_3(), "rule__Requirement__Group_2_6_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_7(), "rule__Requirement__Group_2_7__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_7_3(), "rule__Requirement__Group_2_7_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_8(), "rule__Requirement__Group_2_8__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_8_4(), "rule__Requirement__Group_2_8_4__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_9(), "rule__Requirement__Group_2_9__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_9_4(), "rule__Requirement__Group_2_9_4__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_10(), "rule__Requirement__Group_2_10__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_10_3(), "rule__Requirement__Group_2_10_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_11(), "rule__Requirement__Group_2_11__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_11_3(), "rule__Requirement__Group_2_11_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_12(), "rule__Requirement__Group_2_12__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_12_3(), "rule__Requirement__Group_2_12_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_13(), "rule__Requirement__Group_2_13__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_14(), "rule__Requirement__Group_2_14__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_14_5(), "rule__Requirement__Group_2_14_5__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_15(), "rule__Requirement__Group_2_15__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_15_5(), "rule__Requirement__Group_2_15_5__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_16(), "rule__Requirement__Group_2_16__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_16_4(), "rule__Requirement__Group_2_16_4__0");
					put(grammarAccess.getExternalDocumentsAccess().getGroup(), "rule__ExternalDocuments__Group__0");
					put(grammarAccess.getExternalDocumentAccess().getGroup(), "rule__ExternalDocument__Group__0");
					put(grammarAccess.getXDocUriAccess().getGroup(), "rule__XDocUri__Group__0");
					put(grammarAccess.getXDocUriAccess().getGroup_1(), "rule__XDocUri__Group_1__0");
					put(grammarAccess.getAlisaConfigurationAccess().getGroup(), "rule__AlisaConfiguration__Group__0");
					put(grammarAccess.getCategoryAccess().getGroup(), "rule__Category__Group__0");
					put(grammarAccess.getCategoryAccess().getGroup_2(), "rule__Category__Group_2__0");
					put(grammarAccess.getStakeholderAccess().getGroup(), "rule__Stakeholder__Group__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_0(), "rule__Stakeholder__Group_2_0__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_1(), "rule__Stakeholder__Group_2_1__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_2(), "rule__Stakeholder__Group_2_2__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_3(), "rule__Stakeholder__Group_2_3__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_4(), "rule__Stakeholder__Group_2_4__0");
					put(grammarAccess.getOrganizationAccess().getGroup(), "rule__Organization__Group__0");
					put(grammarAccess.getVerificationDecompositionAccess().getGroup_1(), "rule__VerificationDecomposition__Group_1__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup(), "rule__VerificationActivity__Group__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3(), "rule__VerificationActivity__Group_3__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_4(), "rule__VerificationActivity__Group_4__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_5(), "rule__VerificationActivity__Group_5__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_6(), "rule__VerificationActivity__Group_6__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_7(), "rule__VerificationActivity__Group_7__0");
					put(grammarAccess.getVerificationResultAccess().getGroup(), "rule__VerificationResult__Group__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_5(), "rule__VerificationResult__Group_5__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_6(), "rule__VerificationResult__Group_6__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_7(), "rule__VerificationResult__Group_7__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_8(), "rule__VerificationResult__Group_8__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_9(), "rule__VerificationResult__Group_9__0");
					put(grammarAccess.getQCLREFAccess().getGroup(), "rule__QCLREF__Group__0");
					put(grammarAccess.getQCLREFAccess().getGroup_0(), "rule__QCLREF__Group_0__0");
					put(grammarAccess.getQCLREFAccess().getGroup_2(), "rule__QCLREF__Group_2__0");
					put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
					put(grammarAccess.getQNEREFAccess().getGroup(), "rule__QNEREF__Group__0");
					put(grammarAccess.getQNEREFAccess().getGroup_0(), "rule__QNEREF__Group_0__0");
					put(grammarAccess.getQNEREFAccess().getGroup_2(), "rule__QNEREF__Group_2__0");
					put(grammarAccess.getQCRELREFAccess().getGroup_0(), "rule__QCRELREF__Group_0__0");
					put(grammarAccess.getRELREFAccess().getGroup(), "rule__RELREF__Group__0");
					put(grammarAccess.getRELREFAccess().getGroup_1(), "rule__RELREF__Group_1__0");
					put(grammarAccess.getCATREFAccess().getGroup(), "rule__CATREF__Group__0");
					put(grammarAccess.getPAREFAccess().getGroup(), "rule__PAREF__Group__0");
					put(grammarAccess.getPAREFAccess().getGroup_2(), "rule__PAREF__Group_2__0");
					put(grammarAccess.getREQREFAccess().getGroup(), "rule__REQREF__Group__0");
					put(grammarAccess.getREQREFAccess().getGroup_0(), "rule__REQREF__Group_0__0");
					put(grammarAccess.getDOCPATHAccess().getGroup(), "rule__DOCPATH__Group__0");
					put(grammarAccess.getDOCPATHAccess().getGroup_0(), "rule__DOCPATH__Group_0__0");
					put(grammarAccess.getDOCFRAGMENTAccess().getGroup(), "rule__DOCFRAGMENT__Group__0");
					put(grammarAccess.getDOCFRAGMENTAccess().getGroup_1(), "rule__DOCFRAGMENT__Group_1__0");
					put(grammarAccess.getRequirementDocumentAccess().getNameAssignment_2(), "rule__RequirementDocument__NameAssignment_2");
					put(grammarAccess.getRequirementDocumentAccess().getContentAssignment_3(), "rule__RequirementDocument__ContentAssignment_3");
					put(grammarAccess.getDocumentSectionAccess().getNameAssignment_1(), "rule__DocumentSection__NameAssignment_1");
					put(grammarAccess.getDocumentSectionAccess().getContentAssignment_2(), "rule__DocumentSection__ContentAssignment_2");
					put(grammarAccess.getVerificationLibraryAccess().getNameAssignment_2(), "rule__VerificationLibrary__NameAssignment_2");
					put(grammarAccess.getVerificationLibraryAccess().getContentAssignment_3(), "rule__VerificationLibrary__ContentAssignment_3");
					put(grammarAccess.getRDAPackageAccess().getNameAssignment_1(), "rule__RDAPackage__NameAssignment_1");
					put(grammarAccess.getRDAPackageAccess().getImportedNamespaceAssignment_2_1(), "rule__RDAPackage__ImportedNamespaceAssignment_2_1");
					put(grammarAccess.getRDAPackageAccess().getImportedNamespaceAssignment_2_2_1(), "rule__RDAPackage__ImportedNamespaceAssignment_2_2_1");
					put(grammarAccess.getRDAPackageAccess().getImportedNamespaceAssignment_3_1(), "rule__RDAPackage__ImportedNamespaceAssignment_3_1");
					put(grammarAccess.getRDAPackageAccess().getImportedNamespaceAssignment_3_2_1(), "rule__RDAPackage__ImportedNamespaceAssignment_3_2_1");
					put(grammarAccess.getRDAPackageAccess().getContentAssignment_4(), "rule__RDAPackage__ContentAssignment_4");
					put(grammarAccess.getGoalsAccess().getNameAssignment_1(), "rule__Goals__NameAssignment_1");
					put(grammarAccess.getGoalsAccess().getTargetAssignment_3(), "rule__Goals__TargetAssignment_3");
					put(grammarAccess.getGoalsAccess().getGoalsAssignment_4(), "rule__Goals__GoalsAssignment_4");
					put(grammarAccess.getGoalsAccess().getIssueAssignment_5_2(), "rule__Goals__IssueAssignment_5_2");
					put(grammarAccess.getGoalsAccess().getIssueAssignment_5_3_1(), "rule__Goals__IssueAssignment_5_3_1");
					put(grammarAccess.getGoalAccess().getNameAssignment_1(), "rule__Goal__NameAssignment_1");
					put(grammarAccess.getGoalAccess().getTargetAssignment_2_0_1(), "rule__Goal__TargetAssignment_2_0_1");
					put(grammarAccess.getGoalAccess().getCategoryAssignment_2_1_2(), "rule__Goal__CategoryAssignment_2_1_2");
					put(grammarAccess.getGoalAccess().getCategoryAssignment_2_1_3_1(), "rule__Goal__CategoryAssignment_2_1_3_1");
					put(grammarAccess.getGoalAccess().getTitleAssignment_2_2_2(), "rule__Goal__TitleAssignment_2_2_2");
					put(grammarAccess.getGoalAccess().getDescriptionAssignment_2_3_2(), "rule__Goal__DescriptionAssignment_2_3_2");
					put(grammarAccess.getGoalAccess().getAssertAssignment_2_4_2(), "rule__Goal__AssertAssignment_2_4_2");
					put(grammarAccess.getGoalAccess().getRationaleAssignment_2_5_2(), "rule__Goal__RationaleAssignment_2_5_2");
					put(grammarAccess.getGoalAccess().getIssueAssignment_2_6_2(), "rule__Goal__IssueAssignment_2_6_2");
					put(grammarAccess.getGoalAccess().getIssueAssignment_2_6_3_1(), "rule__Goal__IssueAssignment_2_6_3_1");
					put(grammarAccess.getGoalAccess().getModelReferenceAssignment_2_7_2(), "rule__Goal__ModelReferenceAssignment_2_7_2");
					put(grammarAccess.getGoalAccess().getModelReferenceAssignment_2_7_3_1(), "rule__Goal__ModelReferenceAssignment_2_7_3_1");
					put(grammarAccess.getGoalAccess().getRefinesReferenceAssignment_2_8_2(), "rule__Goal__RefinesReferenceAssignment_2_8_2");
					put(grammarAccess.getGoalAccess().getRefinesReferenceAssignment_2_8_3_1(), "rule__Goal__RefinesReferenceAssignment_2_8_3_1");
					put(grammarAccess.getGoalAccess().getDecomposesReferenceAssignment_2_9_2(), "rule__Goal__DecomposesReferenceAssignment_2_9_2");
					put(grammarAccess.getGoalAccess().getDecomposesReferenceAssignment_2_9_3_1(), "rule__Goal__DecomposesReferenceAssignment_2_9_3_1");
					put(grammarAccess.getGoalAccess().getEvolvesReferenceAssignment_2_10_2(), "rule__Goal__EvolvesReferenceAssignment_2_10_2");
					put(grammarAccess.getGoalAccess().getEvolvesReferenceAssignment_2_10_3_1(), "rule__Goal__EvolvesReferenceAssignment_2_10_3_1");
					put(grammarAccess.getGoalAccess().getConflictsReferenceAssignment_2_11_2(), "rule__Goal__ConflictsReferenceAssignment_2_11_2");
					put(grammarAccess.getGoalAccess().getConflictsReferenceAssignment_2_11_3_1(), "rule__Goal__ConflictsReferenceAssignment_2_11_3_1");
					put(grammarAccess.getGoalAccess().getStakeholderReferenceAssignment_2_12_2(), "rule__Goal__StakeholderReferenceAssignment_2_12_2");
					put(grammarAccess.getGoalAccess().getStakeholderReferenceAssignment_2_12_3_1(), "rule__Goal__StakeholderReferenceAssignment_2_12_3_1");
					put(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceAssignment_2_13_4(), "rule__Goal__StakeholderRequirementReferenceAssignment_2_13_4");
					put(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceAssignment_2_13_5_1(), "rule__Goal__StakeholderRequirementReferenceAssignment_2_13_5_1");
					put(grammarAccess.getGoalAccess().getSystemRequirementReferenceAssignment_2_14_4(), "rule__Goal__SystemRequirementReferenceAssignment_2_14_4");
					put(grammarAccess.getGoalAccess().getSystemRequirementReferenceAssignment_2_14_5_1(), "rule__Goal__SystemRequirementReferenceAssignment_2_14_5_1");
					put(grammarAccess.getGoalAccess().getDocReferenceAssignment_2_15_3(), "rule__Goal__DocReferenceAssignment_2_15_3");
					put(grammarAccess.getGoalAccess().getDocReferenceAssignment_2_15_4_1(), "rule__Goal__DocReferenceAssignment_2_15_4_1");
					put(grammarAccess.getRequirementsAccess().getNameAssignment_1(), "rule__Requirements__NameAssignment_1");
					put(grammarAccess.getRequirementsAccess().getTargetAssignment_3(), "rule__Requirements__TargetAssignment_3");
					put(grammarAccess.getRequirementsAccess().getReqsAssignment_4(), "rule__Requirements__ReqsAssignment_4");
					put(grammarAccess.getRequirementsAccess().getIssueAssignment_5_2(), "rule__Requirements__IssueAssignment_5_2");
					put(grammarAccess.getRequirementsAccess().getIssueAssignment_5_3_1(), "rule__Requirements__IssueAssignment_5_3_1");
					put(grammarAccess.getRequirementAccess().getNameAssignment_1(), "rule__Requirement__NameAssignment_1");
					put(grammarAccess.getRequirementAccess().getTargetAssignment_2_0_1(), "rule__Requirement__TargetAssignment_2_0_1");
					put(grammarAccess.getRequirementAccess().getCategoryAssignment_2_1_2(), "rule__Requirement__CategoryAssignment_2_1_2");
					put(grammarAccess.getRequirementAccess().getCategoryAssignment_2_1_3_1(), "rule__Requirement__CategoryAssignment_2_1_3_1");
					put(grammarAccess.getRequirementAccess().getTitleAssignment_2_2_2(), "rule__Requirement__TitleAssignment_2_2_2");
					put(grammarAccess.getRequirementAccess().getDescriptionAssignment_2_3_2(), "rule__Requirement__DescriptionAssignment_2_3_2");
					put(grammarAccess.getRequirementAccess().getAssertAssignment_2_4_2(), "rule__Requirement__AssertAssignment_2_4_2");
					put(grammarAccess.getRequirementAccess().getRationaleAssignment_2_5_2(), "rule__Requirement__RationaleAssignment_2_5_2");
					put(grammarAccess.getRequirementAccess().getIssueAssignment_2_6_2(), "rule__Requirement__IssueAssignment_2_6_2");
					put(grammarAccess.getRequirementAccess().getIssueAssignment_2_6_3_1(), "rule__Requirement__IssueAssignment_2_6_3_1");
					put(grammarAccess.getRequirementAccess().getModelReferenceAssignment_2_7_2(), "rule__Requirement__ModelReferenceAssignment_2_7_2");
					put(grammarAccess.getRequirementAccess().getModelReferenceAssignment_2_7_3_1(), "rule__Requirement__ModelReferenceAssignment_2_7_3_1");
					put(grammarAccess.getRequirementAccess().getGoalReferenceAssignment_2_8_3(), "rule__Requirement__GoalReferenceAssignment_2_8_3");
					put(grammarAccess.getRequirementAccess().getGoalReferenceAssignment_2_8_4_1(), "rule__Requirement__GoalReferenceAssignment_2_8_4_1");
					put(grammarAccess.getRequirementAccess().getHazardReferenceAssignment_2_9_3(), "rule__Requirement__HazardReferenceAssignment_2_9_3");
					put(grammarAccess.getRequirementAccess().getHazardReferenceAssignment_2_9_4_1(), "rule__Requirement__HazardReferenceAssignment_2_9_4_1");
					put(grammarAccess.getRequirementAccess().getRefinesReferenceAssignment_2_10_2(), "rule__Requirement__RefinesReferenceAssignment_2_10_2");
					put(grammarAccess.getRequirementAccess().getRefinesReferenceAssignment_2_10_3_1(), "rule__Requirement__RefinesReferenceAssignment_2_10_3_1");
					put(grammarAccess.getRequirementAccess().getDecomposesReferenceAssignment_2_11_2(), "rule__Requirement__DecomposesReferenceAssignment_2_11_2");
					put(grammarAccess.getRequirementAccess().getDecomposesReferenceAssignment_2_11_3_1(), "rule__Requirement__DecomposesReferenceAssignment_2_11_3_1");
					put(grammarAccess.getRequirementAccess().getEvolvesReferenceAssignment_2_12_2(), "rule__Requirement__EvolvesReferenceAssignment_2_12_2");
					put(grammarAccess.getRequirementAccess().getEvolvesReferenceAssignment_2_12_3_1(), "rule__Requirement__EvolvesReferenceAssignment_2_12_3_1");
					put(grammarAccess.getRequirementAccess().getVerifiedByAssignment_2_13_3(), "rule__Requirement__VerifiedByAssignment_2_13_3");
					put(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceAssignment_2_14_4(), "rule__Requirement__StakeholderRequirementReferenceAssignment_2_14_4");
					put(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceAssignment_2_14_5_1(), "rule__Requirement__StakeholderRequirementReferenceAssignment_2_14_5_1");
					put(grammarAccess.getRequirementAccess().getSystemRequirementReferenceAssignment_2_15_4(), "rule__Requirement__SystemRequirementReferenceAssignment_2_15_4");
					put(grammarAccess.getRequirementAccess().getSystemRequirementReferenceAssignment_2_15_5_1(), "rule__Requirement__SystemRequirementReferenceAssignment_2_15_5_1");
					put(grammarAccess.getRequirementAccess().getDocReferenceAssignment_2_16_3(), "rule__Requirement__DocReferenceAssignment_2_16_3");
					put(grammarAccess.getRequirementAccess().getDocReferenceAssignment_2_16_4_1(), "rule__Requirement__DocReferenceAssignment_2_16_4_1");
					put(grammarAccess.getExternalDocumentsAccess().getNameAssignment_1(), "rule__ExternalDocuments__NameAssignment_1");
					put(grammarAccess.getExternalDocumentsAccess().getDocsAssignment_2(), "rule__ExternalDocuments__DocsAssignment_2");
					put(grammarAccess.getExternalDocumentsAccess().getDocsAssignment_3(), "rule__ExternalDocuments__DocsAssignment_3");
					put(grammarAccess.getExternalDocumentAccess().getNameAssignment_1(), "rule__ExternalDocument__NameAssignment_1");
					put(grammarAccess.getExternalDocumentAccess().getExternalReferenceAssignment_4(), "rule__ExternalDocument__ExternalReferenceAssignment_4");
					put(grammarAccess.getXDocUriAccess().getDocPathAssignment_0(), "rule__XDocUri__DocPathAssignment_0");
					put(grammarAccess.getXDocUriAccess().getDocFragmentAssignment_1_1(), "rule__XDocUri__DocFragmentAssignment_1_1");
					put(grammarAccess.getAlisaConfigurationAccess().getNameAssignment_1(), "rule__AlisaConfiguration__NameAssignment_1");
					put(grammarAccess.getAlisaConfigurationAccess().getCategoryAssignment_3(), "rule__AlisaConfiguration__CategoryAssignment_3");
					put(grammarAccess.getCategoryAccess().getNameAssignment_1(), "rule__Category__NameAssignment_1");
					put(grammarAccess.getCategoryAccess().getExtendsAssignment_2_1(), "rule__Category__ExtendsAssignment_2_1");
					put(grammarAccess.getStakeholderAccess().getNameAssignment_1(), "rule__Stakeholder__NameAssignment_1");
					put(grammarAccess.getStakeholderAccess().getTitleAssignment_2_0_2(), "rule__Stakeholder__TitleAssignment_2_0_2");
					put(grammarAccess.getStakeholderAccess().getDescriptionAssignment_2_1_2(), "rule__Stakeholder__DescriptionAssignment_2_1_2");
					put(grammarAccess.getStakeholderAccess().getRoleAssignment_2_2_2(), "rule__Stakeholder__RoleAssignment_2_2_2");
					put(grammarAccess.getStakeholderAccess().getEmailAssignment_2_3_2(), "rule__Stakeholder__EmailAssignment_2_3_2");
					put(grammarAccess.getStakeholderAccess().getPhoneAssignment_2_4_2(), "rule__Stakeholder__PhoneAssignment_2_4_2");
					put(grammarAccess.getOrganizationAccess().getNameAssignment_1(), "rule__Organization__NameAssignment_1");
					put(grammarAccess.getOrganizationAccess().getStakeholderAssignment_2(), "rule__Organization__StakeholderAssignment_2");
					put(grammarAccess.getVerificationDecompositionAccess().getElementAssignment_0(), "rule__VerificationDecomposition__ElementAssignment_0");
					put(grammarAccess.getVerificationDecompositionAccess().getLeftAssignment_1_0(), "rule__VerificationDecomposition__LeftAssignment_1_0");
					put(grammarAccess.getVerificationDecompositionAccess().getTypeAssignment_1_1(), "rule__VerificationDecomposition__TypeAssignment_1_1");
					put(grammarAccess.getVerificationDecompositionAccess().getRightAssignment_1_2(), "rule__VerificationDecomposition__RightAssignment_1_2");
					put(grammarAccess.getVerificationActivityAccess().getNameAssignment_2(), "rule__VerificationActivity__NameAssignment_2");
					put(grammarAccess.getVerificationActivityAccess().getTitleAssignment_3_2(), "rule__VerificationActivity__TitleAssignment_3_2");
					put(grammarAccess.getVerificationActivityAccess().getDescriptionAssignment_4_2(), "rule__VerificationActivity__DescriptionAssignment_4_2");
					put(grammarAccess.getVerificationActivityAccess().getMethodAssignment_5_2(), "rule__VerificationActivity__MethodAssignment_5_2");
					put(grammarAccess.getVerificationActivityAccess().getDecomposedToAssignment_6_3(), "rule__VerificationActivity__DecomposedToAssignment_6_3");
					put(grammarAccess.getVerificationActivityAccess().getAssignedToAssignment_7_3(), "rule__VerificationActivity__AssignedToAssignment_7_3");
					put(grammarAccess.getVerificationResultAccess().getNameAssignment_2(), "rule__VerificationResult__NameAssignment_2");
					put(grammarAccess.getVerificationResultAccess().getReferencedVerificationMethodAssignment_4(), "rule__VerificationResult__ReferencedVerificationMethodAssignment_4");
					put(grammarAccess.getVerificationResultAccess().getTitleAssignment_5_2(), "rule__VerificationResult__TitleAssignment_5_2");
					put(grammarAccess.getVerificationResultAccess().getDescriptionAssignment_6_2(), "rule__VerificationResult__DescriptionAssignment_6_2");
					put(grammarAccess.getVerificationResultAccess().getMethodAssignment_7_2(), "rule__VerificationResult__MethodAssignment_7_2");
					put(grammarAccess.getVerificationResultAccess().getStateAssignment_8_2(), "rule__VerificationResult__StateAssignment_8_2");
					put(grammarAccess.getVerificationResultAccess().getStatusAssignment_9_2(), "rule__VerificationResult__StatusAssignment_9_2");
					put(grammarAccess.getGoalAccess().getUnorderedGroup_2(), "rule__Goal__UnorderedGroup_2");
					put(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), "rule__Requirement__UnorderedGroup_2");
					put(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), "rule__Stakeholder__UnorderedGroup_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			edu.cmu.sei.alisa.ui.contentassist.antlr.internal.InternalAlisaParser typedParser = (edu.cmu.sei.alisa.ui.contentassist.antlr.internal.InternalAlisaParser) parser;
			typedParser.entryRuleAlisaModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public AlisaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AlisaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
