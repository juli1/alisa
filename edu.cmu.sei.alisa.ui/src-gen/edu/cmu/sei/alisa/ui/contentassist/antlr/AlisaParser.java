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
					put(grammarAccess.getAlisaModelAccess().getContentAlternatives_0(), "rule__AlisaModel__ContentAlternatives_0");
					put(grammarAccess.getRequirementDecompositionAccess().getAlternatives(), "rule__RequirementDecomposition__Alternatives");
					put(grammarAccess.getRequirementDecompositionAccess().getTypeAlternatives_1_1_0(), "rule__RequirementDecomposition__TypeAlternatives_1_1_0");
					put(grammarAccess.getVerificationDecompositionAccess().getAlternatives(), "rule__VerificationDecomposition__Alternatives");
					put(grammarAccess.getVerificationDecompositionAccess().getTypeAlternatives_1_1_0(), "rule__VerificationDecomposition__TypeAlternatives_1_1_0");
					put(grammarAccess.getVerificationMethodAccess().getAlternatives(), "rule__VerificationMethod__Alternatives");
					put(grammarAccess.getVerificationResultStateAccess().getAlternatives(), "rule__VerificationResultState__Alternatives");
					put(grammarAccess.getVerificationResultStatusAccess().getAlternatives(), "rule__VerificationResultStatus__Alternatives");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAlternatives_1(), "rule__ContainedPropertyAssociation__Alternatives_1");
					put(grammarAccess.getPropertyAssociationAccess().getAlternatives_1(), "rule__PropertyAssociation__Alternatives_1");
					put(grammarAccess.getPropertyExpressionAccess().getAlternatives(), "rule__PropertyExpression__Alternatives");
					put(grammarAccess.getBooleanLiteralAccess().getAlternatives_1(), "rule__BooleanLiteral__Alternatives_1");
					put(grammarAccess.getPlusMinusAccess().getAlternatives(), "rule__PlusMinus__Alternatives");
					put(grammarAccess.getSignedIntAccess().getAlternatives_0(), "rule__SignedInt__Alternatives_0");
					put(grammarAccess.getSignedRealAccess().getAlternatives_0(), "rule__SignedReal__Alternatives_0");
					put(grammarAccess.getNumAltAccess().getAlternatives(), "rule__NumAlt__Alternatives");
					put(grammarAccess.getStakeholderAccess().getGroup(), "rule__Stakeholder__Group__0");
					put(grammarAccess.getStakeholderAccess().getGroup_2(), "rule__Stakeholder__Group_2__0");
					put(grammarAccess.getStakeholderAccess().getGroup_3(), "rule__Stakeholder__Group_3__0");
					put(grammarAccess.getStakeholderAccess().getGroup_4(), "rule__Stakeholder__Group_4__0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup_2(), "rule__Requirement__Group_2__0");
					put(grammarAccess.getRequirementAccess().getGroup_3(), "rule__Requirement__Group_3__0");
					put(grammarAccess.getRequirementAccess().getGroup_4(), "rule__Requirement__Group_4__0");
					put(grammarAccess.getRequirementAccess().getGroup_5(), "rule__Requirement__Group_5__0");
					put(grammarAccess.getRequirementAccess().getGroup_6(), "rule__Requirement__Group_6__0");
					put(grammarAccess.getRequirementAccess().getGroup_7(), "rule__Requirement__Group_7__0");
					put(grammarAccess.getRequirementAccess().getGroup_8(), "rule__Requirement__Group_8__0");
					put(grammarAccess.getRequirementDecompositionAccess().getGroup_1(), "rule__RequirementDecomposition__Group_1__0");
					put(grammarAccess.getVerificationDecompositionAccess().getGroup_1(), "rule__VerificationDecomposition__Group_1__0");
					put(grammarAccess.getElementTypeAccess().getGroup(), "rule__ElementType__Group__0");
					put(grammarAccess.getElementTypeAccess().getGroup_3(), "rule__ElementType__Group_3__0");
					put(grammarAccess.getElementTypeAccess().getGroup_4(), "rule__ElementType__Group_4__0");
					put(grammarAccess.getElementReferenceAccess().getGroup(), "rule__ElementReference__Group__0");
					put(grammarAccess.getElementReferenceAccess().getGroup_3(), "rule__ElementReference__Group_3__0");
					put(grammarAccess.getElementReferenceAccess().getGroup_4(), "rule__ElementReference__Group_4__0");
					put(grammarAccess.getElementReferenceAccess().getGroup_5(), "rule__ElementReference__Group_5__0");
					put(grammarAccess.getElementReferenceAccess().getGroup_6(), "rule__ElementReference__Group_6__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup(), "rule__VerificationActivity__Group__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_3(), "rule__VerificationActivity__Group_3__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_4(), "rule__VerificationActivity__Group_4__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_5(), "rule__VerificationActivity__Group_5__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_6(), "rule__VerificationActivity__Group_6__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_7(), "rule__VerificationActivity__Group_7__0");
					put(grammarAccess.getVerificationActivityAccess().getGroup_8(), "rule__VerificationActivity__Group_8__0");
					put(grammarAccess.getVerificationResultAccess().getGroup(), "rule__VerificationResult__Group__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_5(), "rule__VerificationResult__Group_5__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_6(), "rule__VerificationResult__Group_6__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_7(), "rule__VerificationResult__Group_7__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_8(), "rule__VerificationResult__Group_8__0");
					put(grammarAccess.getVerificationResultAccess().getGroup_9(), "rule__VerificationResult__Group_9__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup(), "rule__ContainedPropertyAssociation__Group__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3(), "rule__ContainedPropertyAssociation__Group_3__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_3_1(), "rule__ContainedPropertyAssociation__Group_3_1__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4(), "rule__ContainedPropertyAssociation__Group_4__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_4_3(), "rule__ContainedPropertyAssociation__Group_4_3__0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getGroup_5(), "rule__ContainedPropertyAssociation__Group_5__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup(), "rule__PropertyAssociation__Group__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3(), "rule__PropertyAssociation__Group_3__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_3_1(), "rule__PropertyAssociation__Group_3_1__0");
					put(grammarAccess.getPropertyAssociationAccess().getGroup_4(), "rule__PropertyAssociation__Group_4__0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getGroup(), "rule__BasicPropertyAssociation__Group__0");
					put(grammarAccess.getContainmentPathAccess().getGroup(), "rule__ContainmentPath__Group__0");
					put(grammarAccess.getContainmentPathAccess().getGroup_2(), "rule__ContainmentPath__Group_2__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup(), "rule__ModalPropertyValue__Group__0");
					put(grammarAccess.getModalPropertyValueAccess().getGroup_5(), "rule__ModalPropertyValue__Group_5__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup(), "rule__OptionalModalPropertyValue__Group__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1(), "rule__OptionalModalPropertyValue__Group_1__0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getGroup_1_4(), "rule__OptionalModalPropertyValue__Group_1_4__0");
					put(grammarAccess.getBooleanLiteralAccess().getGroup(), "rule__BooleanLiteral__Group__0");
					put(grammarAccess.getReferenceTermAccess().getGroup(), "rule__ReferenceTerm__Group__0");
					put(grammarAccess.getReferenceTermAccess().getGroup_2(), "rule__ReferenceTerm__Group_2__0");
					put(grammarAccess.getReferenceTermAccess().getGroup_4(), "rule__ReferenceTerm__Group_4__0");
					put(grammarAccess.getRecordTermAccess().getGroup(), "rule__RecordTerm__Group__0");
					put(grammarAccess.getOldRecordTermAccess().getGroup(), "rule__OldRecordTerm__Group__0");
					put(grammarAccess.getComputedTermAccess().getGroup(), "rule__ComputedTerm__Group__0");
					put(grammarAccess.getComponentClassifierTermAccess().getGroup(), "rule__ComponentClassifierTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup(), "rule__ListTerm__Group__0");
					put(grammarAccess.getListTermAccess().getGroup_2(), "rule__ListTerm__Group_2__0");
					put(grammarAccess.getListTermAccess().getGroup_2_1(), "rule__ListTerm__Group_2_1__0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getGroup(), "rule__FieldPropertyAssociation__Group__0");
					put(grammarAccess.getContainmentPathElementAccess().getGroup(), "rule__ContainmentPathElement__Group__0");
					put(grammarAccess.getANNEXREFAccess().getGroup(), "rule__ANNEXREF__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup(), "rule__ArrayRange__Group__0");
					put(grammarAccess.getArrayRangeAccess().getGroup_3(), "rule__ArrayRange__Group_3__0");
					put(grammarAccess.getSignedConstantAccess().getGroup(), "rule__SignedConstant__Group__0");
					put(grammarAccess.getIntegerTermAccess().getGroup(), "rule__IntegerTerm__Group__0");
					put(grammarAccess.getSignedIntAccess().getGroup(), "rule__SignedInt__Group__0");
					put(grammarAccess.getRealTermAccess().getGroup(), "rule__RealTerm__Group__0");
					put(grammarAccess.getSignedRealAccess().getGroup(), "rule__SignedReal__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup(), "rule__NumericRangeTerm__Group__0");
					put(grammarAccess.getNumericRangeTermAccess().getGroup_3(), "rule__NumericRangeTerm__Group_3__0");
					put(grammarAccess.getQCLREFAccess().getGroup(), "rule__QCLREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup(), "rule__QPREF__Group__0");
					put(grammarAccess.getQPREFAccess().getGroup_1(), "rule__QPREF__Group_1__0");
					put(grammarAccess.getQCREFAccess().getGroup(), "rule__QCREF__Group__0");
					put(grammarAccess.getQCREFAccess().getGroup_0(), "rule__QCREF__Group_0__0");
					put(grammarAccess.getQCREFAccess().getGroup_2(), "rule__QCREF__Group_2__0");
					put(grammarAccess.getAlisaModelAccess().getContentAssignment(), "rule__AlisaModel__ContentAssignment");
					put(grammarAccess.getStakeholderAccess().getNameAssignment_1(), "rule__Stakeholder__NameAssignment_1");
					put(grammarAccess.getStakeholderAccess().getTitleAssignment_2_2(), "rule__Stakeholder__TitleAssignment_2_2");
					put(grammarAccess.getStakeholderAccess().getDescriptionAssignment_3_2(), "rule__Stakeholder__DescriptionAssignment_3_2");
					put(grammarAccess.getStakeholderAccess().getRoleAssignment_4_2(), "rule__Stakeholder__RoleAssignment_4_2");
					put(grammarAccess.getRequirementAccess().getNameAssignment_1(), "rule__Requirement__NameAssignment_1");
					put(grammarAccess.getRequirementAccess().getTitleAssignment_2_2(), "rule__Requirement__TitleAssignment_2_2");
					put(grammarAccess.getRequirementAccess().getDescriptionAssignment_3_2(), "rule__Requirement__DescriptionAssignment_3_2");
					put(grammarAccess.getRequirementAccess().getCommentAssignment_4_2(), "rule__Requirement__CommentAssignment_4_2");
					put(grammarAccess.getRequirementAccess().getAssignedToAssignment_5_3(), "rule__Requirement__AssignedToAssignment_5_3");
					put(grammarAccess.getRequirementAccess().getReferencedByAssignment_6_3(), "rule__Requirement__ReferencedByAssignment_6_3");
					put(grammarAccess.getRequirementAccess().getVerifiedByAssignment_7_3(), "rule__Requirement__VerifiedByAssignment_7_3");
					put(grammarAccess.getRequirementAccess().getDecomposedByAssignment_8_3(), "rule__Requirement__DecomposedByAssignment_8_3");
					put(grammarAccess.getRequirementDecompositionAccess().getElementAssignment_0(), "rule__RequirementDecomposition__ElementAssignment_0");
					put(grammarAccess.getRequirementDecompositionAccess().getLeftAssignment_1_0(), "rule__RequirementDecomposition__LeftAssignment_1_0");
					put(grammarAccess.getRequirementDecompositionAccess().getTypeAssignment_1_1(), "rule__RequirementDecomposition__TypeAssignment_1_1");
					put(grammarAccess.getRequirementDecompositionAccess().getRightAssignment_1_2(), "rule__RequirementDecomposition__RightAssignment_1_2");
					put(grammarAccess.getVerificationDecompositionAccess().getElementAssignment_0(), "rule__VerificationDecomposition__ElementAssignment_0");
					put(grammarAccess.getVerificationDecompositionAccess().getLeftAssignment_1_0(), "rule__VerificationDecomposition__LeftAssignment_1_0");
					put(grammarAccess.getVerificationDecompositionAccess().getTypeAssignment_1_1(), "rule__VerificationDecomposition__TypeAssignment_1_1");
					put(grammarAccess.getVerificationDecompositionAccess().getRightAssignment_1_2(), "rule__VerificationDecomposition__RightAssignment_1_2");
					put(grammarAccess.getElementTypeAccess().getNameAssignment_2(), "rule__ElementType__NameAssignment_2");
					put(grammarAccess.getElementTypeAccess().getElementNameAssignment_3_2(), "rule__ElementType__ElementNameAssignment_3_2");
					put(grammarAccess.getElementTypeAccess().getReferencesAssignment_4_2(), "rule__ElementType__ReferencesAssignment_4_2");
					put(grammarAccess.getElementReferenceAccess().getNameAssignment_2(), "rule__ElementReference__NameAssignment_2");
					put(grammarAccess.getElementReferenceAccess().getUrlAssignment_3_2(), "rule__ElementReference__UrlAssignment_3_2");
					put(grammarAccess.getElementReferenceAccess().getReferenceTypeAssignment_4_2(), "rule__ElementReference__ReferenceTypeAssignment_4_2");
					put(grammarAccess.getElementReferenceAccess().getDetailsAssignment_5_2(), "rule__ElementReference__DetailsAssignment_5_2");
					put(grammarAccess.getElementReferenceAccess().getVersionAssignment_6_2(), "rule__ElementReference__VersionAssignment_6_2");
					put(grammarAccess.getVerificationActivityAccess().getNameAssignment_2(), "rule__VerificationActivity__NameAssignment_2");
					put(grammarAccess.getVerificationActivityAccess().getTitleAssignment_3_2(), "rule__VerificationActivity__TitleAssignment_3_2");
					put(grammarAccess.getVerificationActivityAccess().getDescriptionAssignment_4_2(), "rule__VerificationActivity__DescriptionAssignment_4_2");
					put(grammarAccess.getVerificationActivityAccess().getMethodAssignment_5_2(), "rule__VerificationActivity__MethodAssignment_5_2");
					put(grammarAccess.getVerificationActivityAccess().getVerificationParametersAssignment_6_2(), "rule__VerificationActivity__VerificationParametersAssignment_6_2");
					put(grammarAccess.getVerificationActivityAccess().getDecomposedToAssignment_7_3(), "rule__VerificationActivity__DecomposedToAssignment_7_3");
					put(grammarAccess.getVerificationActivityAccess().getAssignedToAssignment_8_3(), "rule__VerificationActivity__AssignedToAssignment_8_3");
					put(grammarAccess.getVerificationResultAccess().getNameAssignment_2(), "rule__VerificationResult__NameAssignment_2");
					put(grammarAccess.getVerificationResultAccess().getReferencedVerificationMethodAssignment_4(), "rule__VerificationResult__ReferencedVerificationMethodAssignment_4");
					put(grammarAccess.getVerificationResultAccess().getTitleAssignment_5_2(), "rule__VerificationResult__TitleAssignment_5_2");
					put(grammarAccess.getVerificationResultAccess().getDescriptionAssignment_6_2(), "rule__VerificationResult__DescriptionAssignment_6_2");
					put(grammarAccess.getVerificationResultAccess().getMethodAssignment_7_2(), "rule__VerificationResult__MethodAssignment_7_2");
					put(grammarAccess.getVerificationResultAccess().getStateAssignment_8_2(), "rule__VerificationResult__StateAssignment_8_2");
					put(grammarAccess.getVerificationResultAccess().getStatusAssignment_9_2(), "rule__VerificationResult__StatusAssignment_9_2");
					put(grammarAccess.getContainedPropertyAssociationAccess().getPropertyAssignment_0(), "rule__ContainedPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__ContainedPropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getConstantAssignment_2(), "rule__ContainedPropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_0");
					put(grammarAccess.getContainedPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__ContainedPropertyAssociation__OwnedValueAssignment_3_1_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_2(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_2");
					put(grammarAccess.getContainedPropertyAssociationAccess().getAppliesToAssignment_4_3_1(), "rule__ContainedPropertyAssociation__AppliesToAssignment_4_3_1");
					put(grammarAccess.getContainedPropertyAssociationAccess().getInBindingAssignment_5_3(), "rule__ContainedPropertyAssociation__InBindingAssignment_5_3");
					put(grammarAccess.getPropertyAssociationAccess().getPropertyAssignment_0(), "rule__PropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getPropertyAssociationAccess().getAppendAssignment_1_1(), "rule__PropertyAssociation__AppendAssignment_1_1");
					put(grammarAccess.getPropertyAssociationAccess().getConstantAssignment_2(), "rule__PropertyAssociation__ConstantAssignment_2");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_0(), "rule__PropertyAssociation__OwnedValueAssignment_3_0");
					put(grammarAccess.getPropertyAssociationAccess().getOwnedValueAssignment_3_1_1(), "rule__PropertyAssociation__OwnedValueAssignment_3_1_1");
					put(grammarAccess.getPropertyAssociationAccess().getInBindingAssignment_4_3(), "rule__PropertyAssociation__InBindingAssignment_4_3");
					put(grammarAccess.getBasicPropertyAssociationAccess().getPropertyAssignment_0(), "rule__BasicPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getBasicPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__BasicPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathAccess().getContainmentPathElementAssignment_1(), "rule__ContainmentPath__ContainmentPathElementAssignment_1");
					put(grammarAccess.getContainmentPathAccess().getContainmentPathElementAssignment_2_1(), "rule__ContainmentPath__ContainmentPathElementAssignment_2_1");
					put(grammarAccess.getModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__ModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_4(), "rule__ModalPropertyValue__InModeAssignment_4");
					put(grammarAccess.getModalPropertyValueAccess().getInModeAssignment_5_1(), "rule__ModalPropertyValue__InModeAssignment_5_1");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getOwnedValueAssignment_0(), "rule__OptionalModalPropertyValue__OwnedValueAssignment_0");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_3(), "rule__OptionalModalPropertyValue__InModeAssignment_1_3");
					put(grammarAccess.getOptionalModalPropertyValueAccess().getInModeAssignment_1_4_1(), "rule__OptionalModalPropertyValue__InModeAssignment_1_4_1");
					put(grammarAccess.getPropertyValueAccess().getOwnedValueAssignment(), "rule__PropertyValue__OwnedValueAssignment");
					put(grammarAccess.getLiteralorReferenceTermAccess().getNamedValueAssignment(), "rule__LiteralorReferenceTerm__NamedValueAssignment");
					put(grammarAccess.getBooleanLiteralAccess().getValueAssignment_1_0(), "rule__BooleanLiteral__ValueAssignment_1_0");
					put(grammarAccess.getConstantValueAccess().getNamedValueAssignment(), "rule__ConstantValue__NamedValueAssignment");
					put(grammarAccess.getReferenceTermAccess().getContainmentPathElementAssignment_2_0(), "rule__ReferenceTerm__ContainmentPathElementAssignment_2_0");
					put(grammarAccess.getReferenceTermAccess().getContainmentPathElementAssignment_3(), "rule__ReferenceTerm__ContainmentPathElementAssignment_3");
					put(grammarAccess.getReferenceTermAccess().getContainmentPathElementAssignment_4_1(), "rule__ReferenceTerm__ContainmentPathElementAssignment_4_1");
					put(grammarAccess.getRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__RecordTerm__OwnedFieldValueAssignment_1");
					put(grammarAccess.getOldRecordTermAccess().getOwnedFieldValueAssignment_1(), "rule__OldRecordTerm__OwnedFieldValueAssignment_1");
					put(grammarAccess.getComputedTermAccess().getFunctionAssignment_2(), "rule__ComputedTerm__FunctionAssignment_2");
					put(grammarAccess.getComponentClassifierTermAccess().getClassifierAssignment_2(), "rule__ComponentClassifierTerm__ClassifierAssignment_2");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_0(), "rule__ListTerm__OwnedListElementAssignment_2_0");
					put(grammarAccess.getListTermAccess().getOwnedListElementAssignment_2_1_1(), "rule__ListTerm__OwnedListElementAssignment_2_1_1");
					put(grammarAccess.getFieldPropertyAssociationAccess().getPropertyAssignment_0(), "rule__FieldPropertyAssociation__PropertyAssignment_0");
					put(grammarAccess.getFieldPropertyAssociationAccess().getOwnedValueAssignment_2(), "rule__FieldPropertyAssociation__OwnedValueAssignment_2");
					put(grammarAccess.getContainmentPathElementAccess().getNamedElementAssignment_0(), "rule__ContainmentPathElement__NamedElementAssignment_0");
					put(grammarAccess.getContainmentPathElementAccess().getArrayRangeAssignment_1(), "rule__ContainmentPathElement__ArrayRangeAssignment_1");
					put(grammarAccess.getQualifiedContainmentPathElementAccess().getNamedElementAssignment(), "rule__QualifiedContainmentPathElement__NamedElementAssignment");
					put(grammarAccess.getStringTermAccess().getValueAssignment(), "rule__StringTerm__ValueAssignment");
					put(grammarAccess.getArrayRangeAccess().getLowerBoundAssignment_2(), "rule__ArrayRange__LowerBoundAssignment_2");
					put(grammarAccess.getArrayRangeAccess().getUpperBoundAssignment_3_1(), "rule__ArrayRange__UpperBoundAssignment_3_1");
					put(grammarAccess.getSignedConstantAccess().getOpAssignment_0(), "rule__SignedConstant__OpAssignment_0");
					put(grammarAccess.getSignedConstantAccess().getOwnedPropertyExpressionAssignment_1(), "rule__SignedConstant__OwnedPropertyExpressionAssignment_1");
					put(grammarAccess.getIntegerTermAccess().getValueAssignment_0(), "rule__IntegerTerm__ValueAssignment_0");
					put(grammarAccess.getIntegerTermAccess().getUnitAssignment_1(), "rule__IntegerTerm__UnitAssignment_1");
					put(grammarAccess.getRealTermAccess().getValueAssignment_0(), "rule__RealTerm__ValueAssignment_0");
					put(grammarAccess.getRealTermAccess().getUnitAssignment_1(), "rule__RealTerm__UnitAssignment_1");
					put(grammarAccess.getNumericRangeTermAccess().getMinimumAssignment_0(), "rule__NumericRangeTerm__MinimumAssignment_0");
					put(grammarAccess.getNumericRangeTermAccess().getMaximumAssignment_2(), "rule__NumericRangeTerm__MaximumAssignment_2");
					put(grammarAccess.getNumericRangeTermAccess().getDeltaAssignment_3_1(), "rule__NumericRangeTerm__DeltaAssignment_3_1");
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
