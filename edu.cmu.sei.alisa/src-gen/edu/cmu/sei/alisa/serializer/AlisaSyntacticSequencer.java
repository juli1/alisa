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
	protected AbstractElementAlias match_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__a;
	protected AbstractElementAlias match_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__p;
	protected AbstractElementAlias match_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1__q;
	protected AbstractElementAlias match_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1__q;
	
	@Inject
	protected void init(IGrammarAccess access) {
		grammarAccess = (AlisaGrammarAccess) access;
		match_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__a = new GroupAlias(true, true, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getVerifiedKeyword_2_14_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getByKeyword_2_14_1()));
		match_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__p = new GroupAlias(true, false, new TokenAlias(false, false, grammarAccess.getRequirementAccess().getVerifiedKeyword_2_14_0()), new TokenAlias(false, false, grammarAccess.getRequirementAccess().getByKeyword_2_14_1()));
		match_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getAssignedKeyword_7_0()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getToKeyword_7_1()));
		match_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1__q = new GroupAlias(false, true, new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getDecomposedKeyword_6_0()), new TokenAlias(false, false, grammarAccess.getVerificationActivityAccess().getToKeyword_6_1()));
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
			if(match_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__a.equals(syntax))
				emit_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__a(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__p.equals(syntax))
				emit_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__p(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1__q.equals(syntax))
				emit_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else if(match_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1__q.equals(syntax))
				emit_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1__q(semanticObject, getLastNavigableState(), syntaxNodes);
			else acceptNodes(getLastNavigableState(), syntaxNodes);
		}
	}

	/**
	 * Syntax:
	 *     ('verified' 'by')*
	 */
	protected void emit_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__a(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('verified' 'by')+
	 */
	protected void emit_Requirement___VerifiedKeyword_2_14_0_ByKeyword_2_14_1__p(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('assigned' 'to')?
	 */
	protected void emit_VerificationActivity___AssignedKeyword_7_0_ToKeyword_7_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
	/**
	 * Syntax:
	 *     ('decomposed' 'to')?
	 */
	protected void emit_VerificationActivity___DecomposedKeyword_6_0_ToKeyword_6_1__q(EObject semanticObject, ISynNavigable transition, List<INode> nodes) {
		acceptNodes(transition, nodes);
	}
	
}
