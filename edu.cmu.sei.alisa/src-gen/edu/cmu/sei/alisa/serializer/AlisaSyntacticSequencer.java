package edu.cmu.sei.alisa.serializer;

import com.google.inject.Inject;
import edu.cmu.sei.alisa.services.AlisaGrammarAccess;
import java.util.List;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.IGrammarAccess;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.AbstractElementAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.GroupAlias;
import org.eclipse.xtext.serializer.analysis.GrammarAlias.TokenAlias;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynNavigable;
import org.eclipse.xtext.serializer.analysis.ISyntacticSequencerPDAProvider.ISynTransition;
import org.eclipse.xtext.serializer.sequencer.AbstractSyntacticSequencer;

@SuppressWarnings("all")
public class AlisaSyntacticSequencer extends AbstractSyntacticSequencer {

	protected AlisaGrammarAccess grammarAccess;
	protected AbstractElementAlias match_DocumentedRequirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2_SemicolonKeyword_5_4__q;
	protected AbstractElementAlias match_DocumentedRequirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2_SemicolonKeyword_8_4__q;
	protected AbstractElementAlias match_DocumentedRequirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q;
	protected AbstractElementAlias match_DocumentedRequirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q;
	protected AbstractElementAlias match_ElementReference___VersionKeyword_7_0_ColonKeyword_7_1__q;
	protected AbstractElementAlias match_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q;
	protected AbstractElementAlias match_Requirement___VerifiedKeyword_14_0_ByKeyword_14_1_ColonKeyword_14_2__q;
	protected AbstractElementAlias match_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q;
	protected AbstractElementAlias match_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlisaGrammarAccess) access;
		match_DocumentedRequirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2_SemicolonKeyword_5_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getAssignedKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getToKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getColonKeyword_5_2()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getSemicolonKeyword_5_4()));
		match_DocumentedRequirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2_SemicolonKeyword_8_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getDecomposedKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getByKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getColonKeyword_8_2()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getSemicolonKeyword_8_4()));
		match_DocumentedRequirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getReferencedKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getByKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getColonKeyword_6_2()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getSemicolonKeyword_6_4()));
		match_DocumentedRequirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getVerifiedKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getByKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getColonKeyword_7_2()), new TokenAlias(false, false, grammarAccess.getDocumentedRequirementAccess().getSemicolonKeyword_7_4()));
		match_ElementReference___VersionKeyword_7_0_ColonKeyword_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getElementReferenceAccess().getVersionKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getElementReferenceAccess().getColonKeyword_7_1()));
		match_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getElementTypeAccess().getVersionKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getElementTypeAccess().getColonKeyword_7_1()));
		match_Requirement___VerifiedKeyword_14_0_ByKeyword_14_1_ColonKeyword_14_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getVerifiedKeyword_14_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getByKeyword_14_1()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getColonKeyword_14_2()));
		match_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getAssignedKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getToKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getColonKeyword_7_2()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getSemicolonKeyword_7_4()));
		match_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getDecomposedKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getToKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getColonKeyword_6_2()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getSemicolonKeyword_6_4()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		return "";
	}
	
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_DocumentedRequirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2_SemicolonKeyword_5_4__q.equals(syntax))
				emit_DocumentedRequirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2_SemicolonKeyword_5_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DocumentedRequirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2_SemicolonKeyword_8_4__q.equals(syntax))
				emit_DocumentedRequirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2_SemicolonKeyword_8_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DocumentedRequirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q.equals(syntax))
				emit_DocumentedRequirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_DocumentedRequirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q.equals(syntax))
				emit_DocumentedRequirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElementReference___VersionKeyword_7_0_ColonKeyword_7_1__q.equals(syntax))
				emit_ElementReference___VersionKeyword_7_0_ColonKeyword_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q.equals(syntax))
				emit_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___VerifiedKeyword_14_0_ByKeyword_14_1_ColonKeyword_14_2__q.equals(syntax))
				emit_Requirement___VerifiedKeyword_14_0_ByKeyword_14_1_ColonKeyword_14_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q.equals(syntax))
				emit_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q.equals(syntax))
				emit_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('assigned' 'to' ':' ';')?
	 */
	protected void emit_DocumentedRequirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2_SemicolonKeyword_5_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('decomposed' 'by' ':' ';')?
	 */
	protected void emit_DocumentedRequirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2_SemicolonKeyword_8_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('referenced' 'by' ':' ';')?
	 */
	protected void emit_DocumentedRequirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('verified' 'by' ':' ';')?
	 */
	protected void emit_DocumentedRequirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('version' ':')?
	 */
	protected void emit_ElementReference___VersionKeyword_7_0_ColonKeyword_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('version' ':')?
	 */
	protected void emit_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('verified' 'by' ':')?
	 */
	protected void emit_Requirement___VerifiedKeyword_14_0_ByKeyword_14_1_ColonKeyword_14_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('assigned' 'to' ':' ';')?
	 */
	protected void emit_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1_ColonKeyword_7_2_SemicolonKeyword_7_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('decomposed' 'to' ':' ';')?
	 */
	protected void emit_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2_SemicolonKeyword_6_4__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
