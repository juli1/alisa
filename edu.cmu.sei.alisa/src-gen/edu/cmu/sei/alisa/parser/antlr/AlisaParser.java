/*
* generated by Xtext
*/
package edu.cmu.sei.alisa.parser.antlr;

import com.google.inject.Inject;

import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import edu.cmu.sei.alisa.services.AlisaGrammarAccess;

public class AlisaParser extends org.eclipse.xtext.parser.antlr.AbstractAntlrParser {
	
	@Inject
	private AlisaGrammarAccess grammarAccess;
	
	@Override
	protected void setInitialHiddenTokens(XtextTokenStream tokenStream) {
		tokenStream.setInitialHiddenTokens("RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT");
	}
	
	@Override
	protected edu.cmu.sei.alisa.parser.antlr.internal.InternalAlisaParser createParser(XtextTokenStream stream) {
		return new edu.cmu.sei.alisa.parser.antlr.internal.InternalAlisaParser(stream, getGrammarAccess());
	}
	
	@Override 
	protected String getDefaultRuleName() {
		return "RSALPackage";
	}
	
	public AlisaGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(AlisaGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
	
}
