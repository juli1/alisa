/*
* generated by Xtext
*/
package edu.cmu.sei.alisa.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class AlisaAntlrTokenFileProvider implements IAntlrTokenFileProvider {
	
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
    	return classLoader.getResourceAsStream("edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.tokens");
	}
}
