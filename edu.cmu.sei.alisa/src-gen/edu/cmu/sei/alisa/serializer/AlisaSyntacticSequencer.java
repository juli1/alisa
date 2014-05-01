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
	protected AbstractElementAlias match_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q;
	protected AbstractElementAlias match_Requirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2__q;
	protected AbstractElementAlias match_Requirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2__q;
	protected AbstractElementAlias match_Requirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2__q;
	protected AbstractElementAlias match_Requirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2__q;
	protected AbstractElementAlias match_VerificationActivity___AssignedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlisaGrammarAccess) access;
		match_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getElementTypeAccess().getVersionKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getElementTypeAccess().getColonKeyword_7_1()));
		match_Requirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getAssignedKeyword_5_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getToKeyword_5_1()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getColonKeyword_5_2()));
		match_Requirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getDecomposedKeyword_8_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getByKeyword_8_1()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getColonKeyword_8_2()));
		match_Requirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getReferencedKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getByKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getColonKeyword_6_2()));
		match_Requirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getVerifiedKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getByKeyword_7_1()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getColonKeyword_7_2()));
		match_VerificationActivity___AssignedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getAssignedKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getToKeyword_6_1()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getColonKeyword_6_2()));
	}
	
	@Override
	protected String getUnassignedRuleCallToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if(ruleCall.getRule() == grammarAccess.getIDRule())
			return getIDToken(semanticObject, ruleCall, node);
		return "";
	}
	
	/**
	 * terminal ID  		: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	 */
	protected String getIDToken(EObject semanticObject, RuleCall ruleCall, INode node) {
		if (node != null)
			return getTokenText(node);
		return "";
	}
	
	@Override
	protected void emitUnassignedTokens(EObject semanticObject, ISynTransition transition, INode fromNode, INode toNode) {
		if (transition.getAmbiguousSyntaxes().isEmpty()) return;
		List<INode> transitionNodes = collectNodes(fromNode, toNode);
		for (AbstractElementAlias syntax : transition.getAmbiguousSyntaxes()) {
			List<INode> syntaxNodes = getNodesFor(transitionNodes, syntax);
			if(match_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q.equals(syntax))
				emit_ElementType___VersionKeyword_7_0_ColonKeyword_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2__q.equals(syntax))
				emit_Requirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2__q.equals(syntax))
				emit_Requirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2__q.equals(syntax))
				emit_Requirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2__q.equals(syntax))
				emit_Requirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity___AssignedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2__q.equals(syntax))
				emit_VerificationActivity___AssignedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
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
	 *     ('assigned' 'to' ':')?
	 */
	protected void emit_Requirement___AssignedKeyword_5_0_ToKeyword_5_1_ColonKeyword_5_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('decomposed' 'by' ':')?
	 */
	protected void emit_Requirement___DecomposedKeyword_8_0_ByKeyword_8_1_ColonKeyword_8_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('referenced' 'by' ':')?
	 */
	protected void emit_Requirement___ReferencedKeyword_6_0_ByKeyword_6_1_ColonKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('verified' 'by' ':')?
	 */
	protected void emit_Requirement___VerifiedKeyword_7_0_ByKeyword_7_1_ColonKeyword_7_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('assigned' 'to' ':')?
	 */
	protected void emit_VerificationActivity___AssignedKeyword_6_0_ToKeyword_6_1_ColonKeyword_6_2__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
