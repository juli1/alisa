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
					put(grammarAccess.getRSALPackageAccess().getContentAlternatives_4_0(), "rule__RSALPackage__ContentAlternatives_4_0");
					put(grammarAccess.getRSALSectionAccess().getContentAlternatives_3_0(), "rule__RSALSection__ContentAlternatives_3_0");
					put(grammarAccess.getDescriptionElementAccess().getAlternatives(), "rule__DescriptionElement__Alternatives");
					put(grammarAccess.getCategoryAccess().getAlternatives(), "rule__Category__Alternatives");
					put(grammarAccess.getAtomicExprAccess().getAlternatives(), "rule__AtomicExpr__Alternatives");
					put(grammarAccess.getSupportedLanguageAccess().getAlternatives(), "rule__SupportedLanguage__Alternatives");
					put(grammarAccess.getRSALResultAccess().getAlternatives(), "rule__RSALResult__Alternatives");
					put(grammarAccess.getQDOTTEDPAREFAccess().getAlternatives(), "rule__QDOTTEDPAREF__Alternatives");
					put(grammarAccess.getVerificationResultStateAccess().getAlternatives(), "rule__VerificationResultState__Alternatives");
					put(grammarAccess.getVerificationResultStatusAccess().getAlternatives(), "rule__VerificationResultStatus__Alternatives");
					put(grammarAccess.getRSALPackageAccess().getGroup(), "rule__RSALPackage__Group__0");
					put(grammarAccess.getRSALPackageAccess().getGroup_2(), "rule__RSALPackage__Group_2__0");
					put(grammarAccess.getRSALPackageAccess().getGroup_2_2(), "rule__RSALPackage__Group_2_2__0");
					put(grammarAccess.getRSALPackageAccess().getGroup_3(), "rule__RSALPackage__Group_3__0");
					put(grammarAccess.getRSALPackageAccess().getGroup_3_2(), "rule__RSALPackage__Group_3_2__0");
					put(grammarAccess.getRSALPackageAccess().getGroup_5(), "rule__RSALPackage__Group_5__0");
					put(grammarAccess.getRSALPackageAccess().getGroup_5_2(), "rule__RSALPackage__Group_5_2__0");
					put(grammarAccess.getRSALSectionAccess().getGroup(), "rule__RSALSection__Group__0");
					put(grammarAccess.getRSALSectionAccess().getGroup_2(), "rule__RSALSection__Group_2__0");
					put(grammarAccess.getRSALSectionAccess().getGroup_4(), "rule__RSALSection__Group_4__0");
					put(grammarAccess.getRSALSectionAccess().getGroup_4_2(), "rule__RSALSection__Group_4_2__0");
					put(grammarAccess.getOrganizationAccess().getGroup(), "rule__Organization__Group__0");
					put(grammarAccess.getRSALVariableAccess().getGroup(), "rule__RSALVariable__Group__0");
					put(grammarAccess.getContractualElementProxyAccess().getGroup(), "rule__ContractualElementProxy__Group__0");
					put(grammarAccess.getGoalAccess().getGroup(), "rule__Goal__Group__0");
					put(grammarAccess.getGoalAccess().getGroup_2_0(), "rule__Goal__Group_2_0__0");
					put(grammarAccess.getGoalAccess().getGroup_2_1(), "rule__Goal__Group_2_1__0");
					put(grammarAccess.getGoalAccess().getGroup_2_1_2(), "rule__Goal__Group_2_1_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_2(), "rule__Goal__Group_2_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_3(), "rule__Goal__Group_2_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_4(), "rule__Goal__Group_2_4__0");
					put(grammarAccess.getGoalAccess().getGroup_2_5(), "rule__Goal__Group_2_5__0");
					put(grammarAccess.getGoalAccess().getGroup_2_6(), "rule__Goal__Group_2_6__0");
					put(grammarAccess.getGoalAccess().getGroup_2_6_2(), "rule__Goal__Group_2_6_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_7(), "rule__Goal__Group_2_7__0");
					put(grammarAccess.getGoalAccess().getGroup_2_7_2(), "rule__Goal__Group_2_7_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_8(), "rule__Goal__Group_2_8__0");
					put(grammarAccess.getGoalAccess().getGroup_2_8_2(), "rule__Goal__Group_2_8_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_9(), "rule__Goal__Group_2_9__0");
					put(grammarAccess.getGoalAccess().getGroup_2_9_2(), "rule__Goal__Group_2_9_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_10(), "rule__Goal__Group_2_10__0");
					put(grammarAccess.getGoalAccess().getGroup_2_10_2(), "rule__Goal__Group_2_10_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_11(), "rule__Goal__Group_2_11__0");
					put(grammarAccess.getGoalAccess().getGroup_2_11_2(), "rule__Goal__Group_2_11_2__0");
					put(grammarAccess.getGoalAccess().getGroup_2_12(), "rule__Goal__Group_2_12__0");
					put(grammarAccess.getGoalAccess().getGroup_2_12_3(), "rule__Goal__Group_2_12_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_13(), "rule__Goal__Group_2_13__0");
					put(grammarAccess.getGoalAccess().getGroup_2_13_3(), "rule__Goal__Group_2_13_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_14(), "rule__Goal__Group_2_14__0");
					put(grammarAccess.getGoalAccess().getGroup_2_14_3(), "rule__Goal__Group_2_14_3__0");
					put(grammarAccess.getGoalAccess().getGroup_2_15(), "rule__Goal__Group_2_15__0");
					put(grammarAccess.getGoalAccess().getGroup_2_15_3(), "rule__Goal__Group_2_15_3__0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_0(), "rule__Requirement__Group_2_0__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_1(), "rule__Requirement__Group_2_1__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_1_2(), "rule__Requirement__Group_2_1_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_2(), "rule__Requirement__Group_2_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_3(), "rule__Requirement__Group_2_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_4(), "rule__Requirement__Group_2_4__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_5(), "rule__Requirement__Group_2_5__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_6(), "rule__Requirement__Group_2_6__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_6_2(), "rule__Requirement__Group_2_6_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_7(), "rule__Requirement__Group_2_7__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_7_3(), "rule__Requirement__Group_2_7_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_8(), "rule__Requirement__Group_2_8__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_8_3(), "rule__Requirement__Group_2_8_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_9(), "rule__Requirement__Group_2_9__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_9_2(), "rule__Requirement__Group_2_9_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_10(), "rule__Requirement__Group_2_10__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_10_2(), "rule__Requirement__Group_2_10_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_11(), "rule__Requirement__Group_2_11__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_11_2(), "rule__Requirement__Group_2_11_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_12(), "rule__Requirement__Group_2_12__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_12_3(), "rule__Requirement__Group_2_12_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_13(), "rule__Requirement__Group_2_13__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_13_3(), "rule__Requirement__Group_2_13_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_16(), "rule__Requirement__Group_2_16__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_16_3(), "rule__Requirement__Group_2_16_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_17(), "rule__Requirement__Group_2_17__0");
					put(grammarAccess.getRequirementAccess().getGroup_2_17_3(), "rule__Requirement__Group_2_17_3__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup(), "rule__VerificationAssumption__Group__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_0(), "rule__VerificationAssumption__Group_3_0__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_1(), "rule__VerificationAssumption__Group_3_1__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_1_2(), "rule__VerificationAssumption__Group_3_1_2__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_2(), "rule__VerificationAssumption__Group_3_2__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_3(), "rule__VerificationAssumption__Group_3_3__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_4(), "rule__VerificationAssumption__Group_3_4__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_7(), "rule__VerificationAssumption__Group_3_7__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_8(), "rule__VerificationAssumption__Group_3_8__0");
					put(grammarAccess.getVerificationAssumptionAccess().getGroup_3_8_2(), "rule__VerificationAssumption__Group_3_8_2__0");
					put(grammarAccess.getExternalDocumentAccess().getGroup(), "rule__ExternalDocument__Group__0");
					put(grammarAccess.getXDocUriAccess().getGroup(), "rule__XDocUri__Group__0");
					put(grammarAccess.getXDocUriAccess().getGroup_1(), "rule__XDocUri__Group_1__0");
					put(grammarAccess.getRequirementCategoriesAccess().getGroup(), "rule__RequirementCategories__Group__0");
					put(grammarAccess.getVerificationCategoriesAccess().getGroup(), "rule__VerificationCategories__Group__0");
					put(grammarAccess.getRequirementCategoryAccess().getGroup(), "rule__RequirementCategory__Group__0");
					put(grammarAccess.getRequirementCategoryAccess().getGroup_2(), "rule__RequirementCategory__Group_2__0");
					put(grammarAccess.getVerificationCategoryAccess().getGroup(), "rule__VerificationCategory__Group__0");
					put(grammarAccess.getVerificationCategoryAccess().getGroup_2(), "rule__VerificationCategory__Group_2__0");
					put(grammarAccess.getStakeholderAccess().getGroup(), "rule__Stakeholder__Group__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_0(), "rule__Stakeholder__Group_2_0__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_1(), "rule__Stakeholder__Group_2_1__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_2(), "rule__Stakeholder__Group_2_2__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_3(), "rule__Stakeholder__Group_2_3__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2_4(), "rule__Stakeholder__Group_2_4__0");
					put(grammarAccess.getAssuranceArgumentAccess().getGroup(), "rule__AssuranceArgument__Group__0");
					put(grammarAccess.getAssuranceArgumentAccess().getGroup_3(), "rule__AssuranceArgument__Group_3__0");
					put(grammarAccess.getImpliesExprAccess().getGroup(), "rule__ImpliesExpr__Group__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1(), "rule__ImpliesExpr__Group_1__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0(), "rule__ImpliesExpr__Group_1_0__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0_0(), "rule__ImpliesExpr__Group_1_0_0__0");
					put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
					put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0(), "rule__OrExpr__Group_1_0__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0_0(), "rule__OrExpr__Group_1_0_0__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0(), "rule__AndExpr__Group_1_0__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0_0(), "rule__AndExpr__Group_1_0_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_0(), "rule__AtomicExpr__Group_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_1(), "rule__AtomicExpr__Group_1__0");
					put(grammarAccess.getArgumentReferenceAccess().getGroup(), "rule__ArgumentReference__Group__0");
					put(grammarAccess.getArgumentReferenceAccess().getGroup_1(), "rule__ArgumentReference__Group_1__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup(), "rule__VerificationActivity__Group__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3_0(), "rule__VerificationActivity__Group_3_0__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3_1(), "rule__VerificationActivity__Group_3_1__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3_2(), "rule__VerificationActivity__Group_3_2__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3_2_2(), "rule__VerificationActivity__Group_3_2_2__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3_3(), "rule__VerificationActivity__Group_3_3__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup(), "rule__VerificationMethod__Group__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_6_0(), "rule__VerificationMethod__Group_6_0__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_6_1(), "rule__VerificationMethod__Group_6_1__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_6_2(), "rule__VerificationMethod__Group_6_2__0");
					put(grammarAccess.getVerificationMethodAccess().getGroup_6_2_2(), "rule__VerificationMethod__Group_6_2_2__0");
					put(grammarAccess.getAssuranceCaseAccess().getGroup(), "rule__AssuranceCase__Group__0");
					put(grammarAccess.getVerificationResultAccess().getGroup(), "rule__VerificationResult__Group__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_5_0(), "rule__VerificationResult__Group_5_0__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_5_1(), "rule__VerificationResult__Group_5_1__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_5_2(), "rule__VerificationResult__Group_5_2__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_5_3(), "rule__VerificationResult__Group_5_3__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_5_4(), "rule__VerificationResult__Group_5_4__0");
					put(grammarAccess.getAssuranceResultAccess().getGroup(), "rule__AssuranceResult__Group__0");
					put(grammarAccess.getAssuranceResultAccess().getGroup_5(), "rule__AssuranceResult__Group_5__0");
					put(grammarAccess.getAssuranceResultAccess().getGroup_6(), "rule__AssuranceResult__Group_6__0");
					put(grammarAccess.getAssuranceResultAccess().getGroup_7(), "rule__AssuranceResult__Group_7__0");
					put(grammarAccess.getAssuranceResultAccess().getGroup_8(), "rule__AssuranceResult__Group_8__0");
					put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
					put(grammarAccess.getQNEREFAccess().getGroup(), "rule__QNEREF__Group__0");
					put(grammarAccess.getQNEREFAccess().getGroup_0(), "rule__QNEREF__Group_0__0");
					put(grammarAccess.getQNEREFAccess().getGroup_2(), "rule__QNEREF__Group_2__0");
					put(grammarAccess.getQDOTTEDPAREFAccess().getGroup_0(), "rule__QDOTTEDPAREF__Group_0__0");
					put(grammarAccess.getDOTTEDREFAccess().getGroup(), "rule__DOTTEDREF__Group__0");
					put(grammarAccess.getDOTTEDREFAccess().getGroup_1(), "rule__DOTTEDREF__Group_1__0");
					put(grammarAccess.getCATREFAccess().getGroup(), "rule__CATREF__Group__0");
					put(grammarAccess.getPAREFAccess().getGroup(), "rule__PAREF__Group__0");
					put(grammarAccess.getPAREFAccess().getGroup_2(), "rule__PAREF__Group_2__0");
					put(grammarAccess.getDOCPATHAccess().getGroup(), "rule__DOCPATH__Group__0");
					put(grammarAccess.getDOCPATHAccess().getGroup_0(), "rule__DOCPATH__Group_0__0");
					put(grammarAccess.getDOCFRAGMENTAccess().getGroup(), "rule__DOCFRAGMENT__Group__0");
					put(grammarAccess.getDOCFRAGMENTAccess().getGroup_1(), "rule__DOCFRAGMENT__Group_1__0");
					put(grammarAccess.getRSALPackageAccess().getNameAssignment_1(), "rule__RSALPackage__NameAssignment_1");
					put(grammarAccess.getRSALPackageAccess().getImportedNamespaceAssignment_2_1(), "rule__RSALPackage__ImportedNamespaceAssignment_2_1");
					put(grammarAccess.getRSALPackageAccess().getImportedNamespaceAssignment_2_2_1(), "rule__RSALPackage__ImportedNamespaceAssignment_2_2_1");
					put(grammarAccess.getRSALPackageAccess().getImportedNamespaceAssignment_3_1(), "rule__RSALPackage__ImportedNamespaceAssignment_3_1");
					put(grammarAccess.getRSALPackageAccess().getImportedNamespaceAssignment_3_2_1(), "rule__RSALPackage__ImportedNamespaceAssignment_3_2_1");
					put(grammarAccess.getRSALPackageAccess().getContentAssignment_4(), "rule__RSALPackage__ContentAssignment_4");
					put(grammarAccess.getRSALPackageAccess().getIssueAssignment_5_1(), "rule__RSALPackage__IssueAssignment_5_1");
					put(grammarAccess.getRSALPackageAccess().getIssueAssignment_5_2_1(), "rule__RSALPackage__IssueAssignment_5_2_1");
					put(grammarAccess.getRSALSectionAccess().getNameAssignment_1(), "rule__RSALSection__NameAssignment_1");
					put(grammarAccess.getRSALSectionAccess().getTargetAssignment_2_1(), "rule__RSALSection__TargetAssignment_2_1");
					put(grammarAccess.getRSALSectionAccess().getContentAssignment_3(), "rule__RSALSection__ContentAssignment_3");
					put(grammarAccess.getRSALSectionAccess().getIssueAssignment_4_1(), "rule__RSALSection__IssueAssignment_4_1");
					put(grammarAccess.getRSALSectionAccess().getIssueAssignment_4_2_1(), "rule__RSALSection__IssueAssignment_4_2_1");
					put(grammarAccess.getOrganizationAccess().getNameAssignment_1(), "rule__Organization__NameAssignment_1");
					put(grammarAccess.getOrganizationAccess().getStakeholderAssignment_2(), "rule__Organization__StakeholderAssignment_2");
					put(grammarAccess.getDescriptionAccess().getDescriptionAssignment(), "rule__Description__DescriptionAssignment");
					put(grammarAccess.getDescriptionElementAccess().getTestAssignment_0(), "rule__DescriptionElement__TestAssignment_0");
					put(grammarAccess.getDescriptionElementAccess().getRefAssignment_1(), "rule__DescriptionElement__RefAssignment_1");
					put(grammarAccess.getRSALVariableAccess().getNameAssignment_0(), "rule__RSALVariable__NameAssignment_0");
					put(grammarAccess.getRSALVariableAccess().getValueAssignment_2(), "rule__RSALVariable__ValueAssignment_2");
					put(grammarAccess.getContractualElementProxyAccess().getProxyreferenceAssignment_1(), "rule__ContractualElementProxy__ProxyreferenceAssignment_1");
					put(grammarAccess.getGoalAccess().getNameAssignment_1(), "rule__Goal__NameAssignment_1");
					put(grammarAccess.getGoalAccess().getTargetAssignment_2_0_1(), "rule__Goal__TargetAssignment_2_0_1");
					put(grammarAccess.getGoalAccess().getCategoryAssignment_2_1_1(), "rule__Goal__CategoryAssignment_2_1_1");
					put(grammarAccess.getGoalAccess().getCategoryAssignment_2_1_2_1(), "rule__Goal__CategoryAssignment_2_1_2_1");
					put(grammarAccess.getGoalAccess().getTitleAssignment_2_2_1(), "rule__Goal__TitleAssignment_2_2_1");
					put(grammarAccess.getGoalAccess().getDescriptionAssignment_2_3_1(), "rule__Goal__DescriptionAssignment_2_3_1");
					put(grammarAccess.getGoalAccess().getAssertAssignment_2_4_1(), "rule__Goal__AssertAssignment_2_4_1");
					put(grammarAccess.getGoalAccess().getRationaleAssignment_2_5_1(), "rule__Goal__RationaleAssignment_2_5_1");
					put(grammarAccess.getGoalAccess().getIssueAssignment_2_6_1(), "rule__Goal__IssueAssignment_2_6_1");
					put(grammarAccess.getGoalAccess().getIssueAssignment_2_6_2_1(), "rule__Goal__IssueAssignment_2_6_2_1");
					put(grammarAccess.getGoalAccess().getRefinesReferenceAssignment_2_7_1(), "rule__Goal__RefinesReferenceAssignment_2_7_1");
					put(grammarAccess.getGoalAccess().getRefinesReferenceAssignment_2_7_2_1(), "rule__Goal__RefinesReferenceAssignment_2_7_2_1");
					put(grammarAccess.getGoalAccess().getDecomposesReferenceAssignment_2_8_1(), "rule__Goal__DecomposesReferenceAssignment_2_8_1");
					put(grammarAccess.getGoalAccess().getDecomposesReferenceAssignment_2_8_2_1(), "rule__Goal__DecomposesReferenceAssignment_2_8_2_1");
					put(grammarAccess.getGoalAccess().getEvolvesReferenceAssignment_2_9_1(), "rule__Goal__EvolvesReferenceAssignment_2_9_1");
					put(grammarAccess.getGoalAccess().getEvolvesReferenceAssignment_2_9_2_1(), "rule__Goal__EvolvesReferenceAssignment_2_9_2_1");
					put(grammarAccess.getGoalAccess().getConflictsReferenceAssignment_2_10_1(), "rule__Goal__ConflictsReferenceAssignment_2_10_1");
					put(grammarAccess.getGoalAccess().getConflictsReferenceAssignment_2_10_2_1(), "rule__Goal__ConflictsReferenceAssignment_2_10_2_1");
					put(grammarAccess.getGoalAccess().getStakeholderReferenceAssignment_2_11_1(), "rule__Goal__StakeholderReferenceAssignment_2_11_1");
					put(grammarAccess.getGoalAccess().getStakeholderReferenceAssignment_2_11_2_1(), "rule__Goal__StakeholderReferenceAssignment_2_11_2_1");
					put(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceAssignment_2_12_2(), "rule__Goal__StakeholderRequirementReferenceAssignment_2_12_2");
					put(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceAssignment_2_12_3_1(), "rule__Goal__StakeholderRequirementReferenceAssignment_2_12_3_1");
					put(grammarAccess.getGoalAccess().getSystemRequirementReferenceAssignment_2_13_2(), "rule__Goal__SystemRequirementReferenceAssignment_2_13_2");
					put(grammarAccess.getGoalAccess().getSystemRequirementReferenceAssignment_2_13_3_1(), "rule__Goal__SystemRequirementReferenceAssignment_2_13_3_1");
					put(grammarAccess.getGoalAccess().getDocReferenceAssignment_2_14_2(), "rule__Goal__DocReferenceAssignment_2_14_2");
					put(grammarAccess.getGoalAccess().getDocReferenceAssignment_2_14_3_1(), "rule__Goal__DocReferenceAssignment_2_14_3_1");
					put(grammarAccess.getGoalAccess().getModelReferenceAssignment_2_15_2(), "rule__Goal__ModelReferenceAssignment_2_15_2");
					put(grammarAccess.getGoalAccess().getModelReferenceAssignment_2_15_3_1(), "rule__Goal__ModelReferenceAssignment_2_15_3_1");
					put(grammarAccess.getRequirementAccess().getNameAssignment_1(), "rule__Requirement__NameAssignment_1");
					put(grammarAccess.getRequirementAccess().getTargetAssignment_2_0_1(), "rule__Requirement__TargetAssignment_2_0_1");
					put(grammarAccess.getRequirementAccess().getCategoryAssignment_2_1_1(), "rule__Requirement__CategoryAssignment_2_1_1");
					put(grammarAccess.getRequirementAccess().getCategoryAssignment_2_1_2_1(), "rule__Requirement__CategoryAssignment_2_1_2_1");
					put(grammarAccess.getRequirementAccess().getTitleAssignment_2_2_1(), "rule__Requirement__TitleAssignment_2_2_1");
					put(grammarAccess.getRequirementAccess().getDescriptionAssignment_2_3_1(), "rule__Requirement__DescriptionAssignment_2_3_1");
					put(grammarAccess.getRequirementAccess().getAssertAssignment_2_4_1(), "rule__Requirement__AssertAssignment_2_4_1");
					put(grammarAccess.getRequirementAccess().getRationaleAssignment_2_5_1(), "rule__Requirement__RationaleAssignment_2_5_1");
					put(grammarAccess.getRequirementAccess().getIssueAssignment_2_6_1(), "rule__Requirement__IssueAssignment_2_6_1");
					put(grammarAccess.getRequirementAccess().getIssueAssignment_2_6_2_1(), "rule__Requirement__IssueAssignment_2_6_2_1");
					put(grammarAccess.getRequirementAccess().getGoalReferenceAssignment_2_7_2(), "rule__Requirement__GoalReferenceAssignment_2_7_2");
					put(grammarAccess.getRequirementAccess().getGoalReferenceAssignment_2_7_3_1(), "rule__Requirement__GoalReferenceAssignment_2_7_3_1");
					put(grammarAccess.getRequirementAccess().getHazardReferenceAssignment_2_8_2(), "rule__Requirement__HazardReferenceAssignment_2_8_2");
					put(grammarAccess.getRequirementAccess().getHazardReferenceAssignment_2_8_3_1(), "rule__Requirement__HazardReferenceAssignment_2_8_3_1");
					put(grammarAccess.getRequirementAccess().getRefinesReferenceAssignment_2_9_1(), "rule__Requirement__RefinesReferenceAssignment_2_9_1");
					put(grammarAccess.getRequirementAccess().getRefinesReferenceAssignment_2_9_2_1(), "rule__Requirement__RefinesReferenceAssignment_2_9_2_1");
					put(grammarAccess.getRequirementAccess().getDecomposesReferenceAssignment_2_10_1(), "rule__Requirement__DecomposesReferenceAssignment_2_10_1");
					put(grammarAccess.getRequirementAccess().getDecomposesReferenceAssignment_2_10_2_1(), "rule__Requirement__DecomposesReferenceAssignment_2_10_2_1");
					put(grammarAccess.getRequirementAccess().getEvolvesReferenceAssignment_2_11_1(), "rule__Requirement__EvolvesReferenceAssignment_2_11_1");
					put(grammarAccess.getRequirementAccess().getEvolvesReferenceAssignment_2_11_2_1(), "rule__Requirement__EvolvesReferenceAssignment_2_11_2_1");
					put(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceAssignment_2_12_2(), "rule__Requirement__StakeholderRequirementReferenceAssignment_2_12_2");
					put(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceAssignment_2_12_3_1(), "rule__Requirement__StakeholderRequirementReferenceAssignment_2_12_3_1");
					put(grammarAccess.getRequirementAccess().getSystemRequirementReferenceAssignment_2_13_2(), "rule__Requirement__SystemRequirementReferenceAssignment_2_13_2");
					put(grammarAccess.getRequirementAccess().getSystemRequirementReferenceAssignment_2_13_3_1(), "rule__Requirement__SystemRequirementReferenceAssignment_2_13_3_1");
					put(grammarAccess.getRequirementAccess().getVerifiedByAssignment_2_14(), "rule__Requirement__VerifiedByAssignment_2_14");
					put(grammarAccess.getRequirementAccess().getArgumentAssignment_2_15(), "rule__Requirement__ArgumentAssignment_2_15");
					put(grammarAccess.getRequirementAccess().getDocReferenceAssignment_2_16_2(), "rule__Requirement__DocReferenceAssignment_2_16_2");
					put(grammarAccess.getRequirementAccess().getDocReferenceAssignment_2_16_3_1(), "rule__Requirement__DocReferenceAssignment_2_16_3_1");
					put(grammarAccess.getRequirementAccess().getModelReferenceAssignment_2_17_2(), "rule__Requirement__ModelReferenceAssignment_2_17_2");
					put(grammarAccess.getRequirementAccess().getModelReferenceAssignment_2_17_3_1(), "rule__Requirement__ModelReferenceAssignment_2_17_3_1");
					put(grammarAccess.getVerificationAssumptionAccess().getNameAssignment_2(), "rule__VerificationAssumption__NameAssignment_2");
					put(grammarAccess.getVerificationAssumptionAccess().getTargetAssignment_3_0_1(), "rule__VerificationAssumption__TargetAssignment_3_0_1");
					put(grammarAccess.getVerificationAssumptionAccess().getCategoryAssignment_3_1_1(), "rule__VerificationAssumption__CategoryAssignment_3_1_1");
					put(grammarAccess.getVerificationAssumptionAccess().getCategoryAssignment_3_1_2_1(), "rule__VerificationAssumption__CategoryAssignment_3_1_2_1");
					put(grammarAccess.getVerificationAssumptionAccess().getTitleAssignment_3_2_1(), "rule__VerificationAssumption__TitleAssignment_3_2_1");
					put(grammarAccess.getVerificationAssumptionAccess().getDescriptionAssignment_3_3_1(), "rule__VerificationAssumption__DescriptionAssignment_3_3_1");
					put(grammarAccess.getVerificationAssumptionAccess().getAssertAssignment_3_4_2(), "rule__VerificationAssumption__AssertAssignment_3_4_2");
					put(grammarAccess.getVerificationAssumptionAccess().getVerifiedByAssignment_3_5(), "rule__VerificationAssumption__VerifiedByAssignment_3_5");
					put(grammarAccess.getVerificationAssumptionAccess().getArgumentAssignment_3_6(), "rule__VerificationAssumption__ArgumentAssignment_3_6");
					put(grammarAccess.getVerificationAssumptionAccess().getRationaleAssignment_3_7_1(), "rule__VerificationAssumption__RationaleAssignment_3_7_1");
					put(grammarAccess.getVerificationAssumptionAccess().getIssueAssignment_3_8_1(), "rule__VerificationAssumption__IssueAssignment_3_8_1");
					put(grammarAccess.getVerificationAssumptionAccess().getIssueAssignment_3_8_2_1(), "rule__VerificationAssumption__IssueAssignment_3_8_2_1");
					put(grammarAccess.getExternalDocumentAccess().getNameAssignment_1(), "rule__ExternalDocument__NameAssignment_1");
					put(grammarAccess.getExternalDocumentAccess().getExternalReferenceAssignment_3(), "rule__ExternalDocument__ExternalReferenceAssignment_3");
					put(grammarAccess.getXDocUriAccess().getDocReferenceAssignment_0(), "rule__XDocUri__DocReferenceAssignment_0");
					put(grammarAccess.getXDocUriAccess().getDocFragmentAssignment_1_1(), "rule__XDocUri__DocFragmentAssignment_1_1");
					put(grammarAccess.getRequirementCategoriesAccess().getNameAssignment_2(), "rule__RequirementCategories__NameAssignment_2");
					put(grammarAccess.getRequirementCategoriesAccess().getCategoryAssignment_3(), "rule__RequirementCategories__CategoryAssignment_3");
					put(grammarAccess.getVerificationCategoriesAccess().getNameAssignment_2(), "rule__VerificationCategories__NameAssignment_2");
					put(grammarAccess.getVerificationCategoriesAccess().getCategoryAssignment_3(), "rule__VerificationCategories__CategoryAssignment_3");
					put(grammarAccess.getRequirementCategoryAccess().getNameAssignment_1(), "rule__RequirementCategory__NameAssignment_1");
					put(grammarAccess.getRequirementCategoryAccess().getExtendsAssignment_2_1(), "rule__RequirementCategory__ExtendsAssignment_2_1");
					put(grammarAccess.getVerificationCategoryAccess().getNameAssignment_1(), "rule__VerificationCategory__NameAssignment_1");
					put(grammarAccess.getVerificationCategoryAccess().getExtendsAssignment_2_1(), "rule__VerificationCategory__ExtendsAssignment_2_1");
					put(grammarAccess.getStakeholderAccess().getNameAssignment_1(), "rule__Stakeholder__NameAssignment_1");
					put(grammarAccess.getStakeholderAccess().getTitleAssignment_2_0_1(), "rule__Stakeholder__TitleAssignment_2_0_1");
					put(grammarAccess.getStakeholderAccess().getDescriptionAssignment_2_1_1(), "rule__Stakeholder__DescriptionAssignment_2_1_1");
					put(grammarAccess.getStakeholderAccess().getRoleAssignment_2_2_1(), "rule__Stakeholder__RoleAssignment_2_2_1");
					put(grammarAccess.getStakeholderAccess().getEmailAssignment_2_3_1(), "rule__Stakeholder__EmailAssignment_2_3_1");
					put(grammarAccess.getStakeholderAccess().getPhoneAssignment_2_4_1(), "rule__Stakeholder__PhoneAssignment_2_4_1");
					put(grammarAccess.getAssuranceArgumentAccess().getExpressionAssignment_1(), "rule__AssuranceArgument__ExpressionAssignment_1");
					put(grammarAccess.getAssuranceArgumentAccess().getRationaleAssignment_3_1(), "rule__AssuranceArgument__RationaleAssignment_3_1");
					put(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_0_1(), "rule__ImpliesExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getImpliesExprAccess().getRightAssignment_1_1(), "rule__ImpliesExpr__RightAssignment_1_1");
					put(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1(), "rule__OrExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getOrExprAccess().getRightAssignment_1_1(), "rule__OrExpr__RightAssignment_1_1");
					put(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1(), "rule__AndExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getAndExprAccess().getRightAssignment_1_1(), "rule__AndExpr__RightAssignment_1_1");
					put(grammarAccess.getAtomicExprAccess().getIdAssignment_0_1(), "rule__AtomicExpr__IdAssignment_0_1");
					put(grammarAccess.getArgumentReferenceAccess().getReferenceAssignment_0(), "rule__ArgumentReference__ReferenceAssignment_0");
					put(grammarAccess.getArgumentReferenceAccess().getWeightAssignment_1_1(), "rule__ArgumentReference__WeightAssignment_1_1");
					put(grammarAccess.getVerificationActivityAccess().getNameAssignment_2(), "rule__VerificationActivity__NameAssignment_2");
					put(grammarAccess.getVerificationActivityAccess().getTitleAssignment_3_0_1(), "rule__VerificationActivity__TitleAssignment_3_0_1");
					put(grammarAccess.getVerificationActivityAccess().getDescriptionAssignment_3_1_1(), "rule__VerificationActivity__DescriptionAssignment_3_1_1");
					put(grammarAccess.getVerificationActivityAccess().getCategoryAssignment_3_2_1(), "rule__VerificationActivity__CategoryAssignment_3_2_1");
					put(grammarAccess.getVerificationActivityAccess().getCategoryAssignment_3_2_2_1(), "rule__VerificationActivity__CategoryAssignment_3_2_2_1");
					put(grammarAccess.getVerificationActivityAccess().getMethodAssignment_3_3_1(), "rule__VerificationActivity__MethodAssignment_3_3_1");
					put(grammarAccess.getVerificationActivityAccess().getAssumptionAssignment_3_4(), "rule__VerificationActivity__AssumptionAssignment_3_4");
					put(grammarAccess.getVerificationMethodAccess().getNameAssignment_2(), "rule__VerificationMethod__NameAssignment_2");
					put(grammarAccess.getVerificationMethodAccess().getLanguageAssignment_4(), "rule__VerificationMethod__LanguageAssignment_4");
					put(grammarAccess.getVerificationMethodAccess().getMethodAssignment_5(), "rule__VerificationMethod__MethodAssignment_5");
					put(grammarAccess.getVerificationMethodAccess().getTitleAssignment_6_0_1(), "rule__VerificationMethod__TitleAssignment_6_0_1");
					put(grammarAccess.getVerificationMethodAccess().getDescriptionAssignment_6_1_1(), "rule__VerificationMethod__DescriptionAssignment_6_1_1");
					put(grammarAccess.getVerificationMethodAccess().getCategoryAssignment_6_2_1(), "rule__VerificationMethod__CategoryAssignment_6_2_1");
					put(grammarAccess.getVerificationMethodAccess().getCategoryAssignment_6_2_2_1(), "rule__VerificationMethod__CategoryAssignment_6_2_2_1");
					put(grammarAccess.getAssuranceCaseAccess().getNameAssignment_2(), "rule__AssuranceCase__NameAssignment_2");
					put(grammarAccess.getAssuranceCaseAccess().getTargetAssignment_4(), "rule__AssuranceCase__TargetAssignment_4");
					put(grammarAccess.getAssuranceCaseAccess().getResultsAssignment_5(), "rule__AssuranceCase__ResultsAssignment_5");
					put(grammarAccess.getVerificationResultAccess().getNameAssignment_2(), "rule__VerificationResult__NameAssignment_2");
					put(grammarAccess.getVerificationResultAccess().getVerificationActivityAssignment_4(), "rule__VerificationResult__VerificationActivityAssignment_4");
					put(grammarAccess.getVerificationResultAccess().getTitleAssignment_5_0_1(), "rule__VerificationResult__TitleAssignment_5_0_1");
					put(grammarAccess.getVerificationResultAccess().getDescriptionAssignment_5_1_1(), "rule__VerificationResult__DescriptionAssignment_5_1_1");
					put(grammarAccess.getVerificationResultAccess().getMethodAssignment_5_2_1(), "rule__VerificationResult__MethodAssignment_5_2_1");
					put(grammarAccess.getVerificationResultAccess().getStateAssignment_5_3_1(), "rule__VerificationResult__StateAssignment_5_3_1");
					put(grammarAccess.getVerificationResultAccess().getStatusAssignment_5_4_1(), "rule__VerificationResult__StatusAssignment_5_4_1");
					put(grammarAccess.getVerificationResultAccess().getAssumptionVerificationResultAssignment_6(), "rule__VerificationResult__AssumptionVerificationResultAssignment_6");
					put(grammarAccess.getAssuranceResultAccess().getNameAssignment_2(), "rule__AssuranceResult__NameAssignment_2");
					put(grammarAccess.getAssuranceResultAccess().getRequirementAssignment_4(), "rule__AssuranceResult__RequirementAssignment_4");
					put(grammarAccess.getAssuranceResultAccess().getPassCountAssignment_5_1(), "rule__AssuranceResult__PassCountAssignment_5_1");
					put(grammarAccess.getAssuranceResultAccess().getFailCountAssignment_6_1(), "rule__AssuranceResult__FailCountAssignment_6_1");
					put(grammarAccess.getAssuranceResultAccess().getNeutralCountAssignment_7_1(), "rule__AssuranceResult__NeutralCountAssignment_7_1");
					put(grammarAccess.getAssuranceResultAccess().getUnknownCountAssignment_8_1(), "rule__AssuranceResult__UnknownCountAssignment_8_1");
					put(grammarAccess.getAssuranceResultAccess().getSubClaimResultAssignment_9(), "rule__AssuranceResult__SubClaimResultAssignment_9");
					put(grammarAccess.getAssuranceResultAccess().getSubVAResultAssignment_10(), "rule__AssuranceResult__SubVAResultAssignment_10");
					put(grammarAccess.getGoalAccess().getUnorderedGroup_2(), "rule__Goal__UnorderedGroup_2");
					put(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), "rule__Requirement__UnorderedGroup_2");
					put(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), "rule__VerificationAssumption__UnorderedGroup_3");
					put(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), "rule__Stakeholder__UnorderedGroup_2");
					put(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), "rule__VerificationActivity__UnorderedGroup_3");
					put(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), "rule__VerificationMethod__UnorderedGroup_6");
					put(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), "rule__VerificationResult__UnorderedGroup_5");
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
