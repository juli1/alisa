package edu.cmu.sei.alisa.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import edu.cmu.sei.alisa.services.AlisaGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalAlisaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Organization", "Verification", "Description", "Oranization", "Requirement", "Stakeholder", "Decomposed", "Decomposes", "Inprogress", "Assertion", "Automatic", "Completed", "Conflicts", "Rationale", "Scheduled", "Activity", "Analysis", "Assigned", "Category", "Document", "Verified", "Evolves", "Extends", "Imports", "Logfile", "Package", "Refines", "Section", "Testing", "Unknown", "Hazard", "Issues", "Manual", "Method", "Output", "Result", "Review", "Status", "System", "Email", "Phone", "State", "Title", "Date", "Fail", "Goal", "Pass", "Role", "With", "And", "End", "For", "Req", "See", "ColonColon", "By", "Cr", "Of", "Or", "To", "NumberSign", "Comma", "FullStop", "Solidus", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int End=54;
    public static final int RULE_ID=69;
    public static final int Method=37;
    public static final int Unknown=33;
    public static final int Organization=4;
    public static final int Output=38;
    public static final int RULE_ANY_OTHER=74;
    public static final int Issues=35;
    public static final int Logfile=28;
    public static final int Extends=26;
    public static final int Date=47;
    public static final int Requirement=8;
    public static final int Cr=60;
    public static final int Verification=5;
    public static final int Solidus=67;
    public static final int EOF=-1;
    public static final int Oranization=7;
    public static final int FullStop=66;
    public static final int Evolves=25;
    public static final int Result=39;
    public static final int To=63;
    public static final int Fail=48;
    public static final int Review=40;
    public static final int Assigned=21;
    public static final int Assertion=13;
    public static final int RULE_INT=71;
    public static final int Decomposes=11;
    public static final int Activity=19;
    public static final int Email=43;
    public static final int Analysis=20;
    public static final int Or=62;
    public static final int Refines=30;
    public static final int Conflicts=16;
    public static final int And=53;
    public static final int Scheduled=18;
    public static final int Phone=44;
    public static final int Hazard=34;
    public static final int Stakeholder=9;
    public static final int Decomposed=10;
    public static final int Testing=32;
    public static final int Inprogress=12;
    public static final int Imports=27;
    public static final int RULE_SL_COMMENT=73;
    public static final int Package=29;
    public static final int For=55;
    public static final int Verified=24;
    public static final int NumberSign=64;
    public static final int System=42;
    public static final int Rationale=17;
    public static final int With=52;
    public static final int Goal=49;
    public static final int RULE_ML_COMMENT=72;
    public static final int By=59;
    public static final int ColonColon=58;
    public static final int Document=23;
    public static final int Description=6;
    public static final int RULE_STRING=68;
    public static final int Manual=36;
    public static final int Completed=15;
    public static final int Automatic=14;
    public static final int Req=56;
    public static final int See=57;
    public static final int Title=46;
    public static final int Status=41;
    public static final int Section=31;
    public static final int Category=22;
    public static final int State=45;
    public static final int RULE_WS=70;
    public static final int Role=51;
    public static final int Comma=65;
    public static final int Of=61;
    public static final int Pass=50;

    // delegates
    // delegators


        public InternalAlisaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlisaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlisaParser.tokenNames; }
    public String getGrammarFileName() { return "../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g"; }




    	private AlisaGrammarAccess grammarAccess;
    	 	
    	public InternalAlisaParser(TokenStream input, AlisaGrammarAccess grammarAccess) {
    		this(input);
    		this.grammarAccess = grammarAccess;
    		registerRules(grammarAccess.getGrammar());
    	}
    	
    	@Override
    	protected String getFirstRuleName() {
    		return "AlisaModel";	
    	} 
    	   	   	
    	@Override
    	protected AlisaGrammarAccess getGrammarAccess() {
    		return grammarAccess;
    	}



    // $ANTLR start "entryRuleAlisaModel"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:62:1: entryRuleAlisaModel returns [EObject current=null] : iv_ruleAlisaModel= ruleAlisaModel EOF ;
    public final EObject entryRuleAlisaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlisaModel = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:63:2: (iv_ruleAlisaModel= ruleAlisaModel EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:64:2: iv_ruleAlisaModel= ruleAlisaModel EOF
            {
             newCompositeNode(grammarAccess.getAlisaModelRule()); 
            pushFollow(FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel67);
            iv_ruleAlisaModel=ruleAlisaModel();

            state._fsp--;

             current =iv_ruleAlisaModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlisaModel77); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlisaModel"


    // $ANTLR start "ruleAlisaModel"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:71:1: ruleAlisaModel returns [EObject current=null] : (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization ) ;
    public final EObject ruleAlisaModel() throws RecognitionException {
        EObject current = null;

        EObject this_RSALPackage_0 = null;

        EObject this_Organization_1 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:74:28: ( (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:75:1: (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:75:1: (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==Package) ) {
                alt1=1;
            }
            else if ( (LA1_0==Organization) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:76:5: this_RSALPackage_0= ruleRSALPackage
                    {
                     
                            newCompositeNode(grammarAccess.getAlisaModelAccess().getRSALPackageParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleRSALPackage_in_ruleAlisaModel124);
                    this_RSALPackage_0=ruleRSALPackage();

                    state._fsp--;


                            current = this_RSALPackage_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:86:5: this_Organization_1= ruleOrganization
                    {
                     
                            newCompositeNode(grammarAccess.getAlisaModelAccess().getOrganizationParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleOrganization_in_ruleAlisaModel151);
                    this_Organization_1=ruleOrganization();

                    state._fsp--;


                            current = this_Organization_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlisaModel"


    // $ANTLR start "entryRuleRSALPackage"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:104:1: entryRuleRSALPackage returns [EObject current=null] : iv_ruleRSALPackage= ruleRSALPackage EOF ;
    public final EObject entryRuleRSALPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSALPackage = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:105:2: (iv_ruleRSALPackage= ruleRSALPackage EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:106:2: iv_ruleRSALPackage= ruleRSALPackage EOF
            {
             newCompositeNode(grammarAccess.getRSALPackageRule()); 
            pushFollow(FOLLOW_ruleRSALPackage_in_entryRuleRSALPackage187);
            iv_ruleRSALPackage=ruleRSALPackage();

            state._fsp--;

             current =iv_ruleRSALPackage; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSALPackage197); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRSALPackage"


    // $ANTLR start "ruleRSALPackage"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:113:1: ruleRSALPackage returns [EObject current=null] : (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( (lv_content_10_0= ruleRSALElement ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End ) ;
    public final EObject ruleRSALPackage() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        EObject lv_content_10_0 = null;

        AntlrDatatypeRuleToken lv_issue_12_0 = null;

        AntlrDatatypeRuleToken lv_issue_14_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:116:28: ( (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( (lv_content_10_0= ruleRSALElement ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:117:1: (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( (lv_content_10_0= ruleRSALElement ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:117:1: (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( (lv_content_10_0= ruleRSALElement ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:118:2: otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( (lv_content_10_0= ruleRSALElement ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Package,FOLLOW_Package_in_ruleRSALPackage235); 

                	newLeafNode(otherlv_0, grammarAccess.getRSALPackageAccess().getPackageKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:122:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:123:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:123:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:124:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALPackage251); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRSALPackageAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRSALPackageRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:140:2: (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Imports) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:141:2: otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,Imports,FOLLOW_Imports_in_ruleRSALPackage270); 

                        	newLeafNode(otherlv_2, grammarAccess.getRSALPackageAccess().getImportsKeyword_2_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:145:1: ( (otherlv_3= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:146:1: (otherlv_3= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:146:1: (otherlv_3= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:147:3: otherlv_3= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRSALPackageRule());
                    	        }
                            
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALPackage289); 

                    		newLeafNode(otherlv_3, grammarAccess.getRSALPackageAccess().getImportedNamespaceRSALContainerCrossReference_2_1_0()); 
                    	

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:158:2: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Comma) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:159:2: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALPackage303); 

                    	        	newLeafNode(otherlv_4, grammarAccess.getRSALPackageAccess().getCommaKeyword_2_2_0());
                    	        
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:163:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:164:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:164:1: (otherlv_5= RULE_ID )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:165:3: otherlv_5= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRSALPackageRule());
                    	    	        }
                    	            
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALPackage322); 

                    	    		newLeafNode(otherlv_5, grammarAccess.getRSALPackageAccess().getImportedNamespaceRSALContainerCrossReference_2_2_1_0()); 
                    	    	

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop2;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:176:6: (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==With) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:177:2: otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )*
                    {
                    otherlv_6=(Token)match(input,With,FOLLOW_With_in_ruleRSALPackage340); 

                        	newLeafNode(otherlv_6, grammarAccess.getRSALPackageAccess().getWithKeyword_3_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:181:1: ( ( ruleQPREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:182:1: ( ruleQPREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:182:1: ( ruleQPREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:183:3: ruleQPREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRSALPackageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRSALPackageAccess().getImportedNamespaceAadlPackageCrossReference_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQPREF_in_ruleRSALPackage362);
                    ruleQPREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:196:2: (otherlv_8= Comma ( ( ruleQPREF ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:197:2: otherlv_8= Comma ( ( ruleQPREF ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALPackage376); 

                    	        	newLeafNode(otherlv_8, grammarAccess.getRSALPackageAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:201:1: ( ( ruleQPREF ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:202:1: ( ruleQPREF )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:202:1: ( ruleQPREF )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:203:3: ruleQPREF
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRSALPackageRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getRSALPackageAccess().getImportedNamespaceAadlPackageCrossReference_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleQPREF_in_ruleRSALPackage398);
                    	    ruleQPREF();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:216:6: ( (lv_content_10_0= ruleRSALElement ) )+
            int cnt6=0;
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==Verification||(LA6_0>=Requirement && LA6_0<=Stakeholder)||(LA6_0>=Category && LA6_0<=Document)||LA6_0==Section||LA6_0==Goal||LA6_0==Cr) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:217:1: (lv_content_10_0= ruleRSALElement )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:217:1: (lv_content_10_0= ruleRSALElement )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:218:3: lv_content_10_0= ruleRSALElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRSALPackageAccess().getContentRSALElementParserRuleCall_4_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRSALElement_in_ruleRSALPackage423);
            	    lv_content_10_0=ruleRSALElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_10_0, 
            	            		"RSALElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt6 >= 1 ) break loop6;
                        EarlyExitException eee =
                            new EarlyExitException(6, input);
                        throw eee;
                }
                cnt6++;
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:234:3: (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==Issues) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:235:2: otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )*
                    {
                    otherlv_11=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRSALPackage438); 

                        	newLeafNode(otherlv_11, grammarAccess.getRSALPackageAccess().getIssuesKeyword_5_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:239:1: ( (lv_issue_12_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:240:1: (lv_issue_12_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:240:1: (lv_issue_12_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:241:3: lv_issue_12_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRSALPackageAccess().getIssueValueStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleRSALPackage458);
                    lv_issue_12_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
                    	        }
                           		add(
                           			current, 
                           			"issue",
                            		lv_issue_12_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:257:2: (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )*
                    loop7:
                    do {
                        int alt7=2;
                        int LA7_0 = input.LA(1);

                        if ( (LA7_0==Comma) ) {
                            alt7=1;
                        }


                        switch (alt7) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:258:2: otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALPackage472); 

                    	        	newLeafNode(otherlv_13, grammarAccess.getRSALPackageAccess().getCommaKeyword_5_2_0());
                    	        
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:262:1: ( (lv_issue_14_0= ruleValueString ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:263:1: (lv_issue_14_0= ruleValueString )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:263:1: (lv_issue_14_0= ruleValueString )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:264:3: lv_issue_14_0= ruleValueString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRSALPackageAccess().getIssueValueStringParserRuleCall_5_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueString_in_ruleRSALPackage492);
                    	    lv_issue_14_0=ruleValueString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"issue",
                    	            		lv_issue_14_0, 
                    	            		"ValueString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop7;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleRSALPackage509); 

                	newLeafNode(otherlv_15, grammarAccess.getRSALPackageAccess().getEndKeyword_6());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSALPackage"


    // $ANTLR start "entryRuleRSALElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:293:1: entryRuleRSALElement returns [EObject current=null] : iv_ruleRSALElement= ruleRSALElement EOF ;
    public final EObject entryRuleRSALElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSALElement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:294:2: (iv_ruleRSALElement= ruleRSALElement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:295:2: iv_ruleRSALElement= ruleRSALElement EOF
            {
             newCompositeNode(grammarAccess.getRSALElementRule()); 
            pushFollow(FOLLOW_ruleRSALElement_in_entryRuleRSALElement543);
            iv_ruleRSALElement=ruleRSALElement();

            state._fsp--;

             current =iv_ruleRSALElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSALElement553); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRSALElement"


    // $ANTLR start "ruleRSALElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:302:1: ruleRSALElement returns [EObject current=null] : (this_ContractualElement_0= ruleContractualElement | this_Goal_1= ruleGoal | this_Requirement_2= ruleRequirement | this_RSALSection_3= ruleRSALSection | this_Stakeholder_4= ruleStakeholder | this_VerificationActivity_5= ruleVerificationActivity | this_Category_6= ruleCategory | this_ExternalDocument_7= ruleExternalDocument ) ;
    public final EObject ruleRSALElement() throws RecognitionException {
        EObject current = null;

        EObject this_ContractualElement_0 = null;

        EObject this_Goal_1 = null;

        EObject this_Requirement_2 = null;

        EObject this_RSALSection_3 = null;

        EObject this_Stakeholder_4 = null;

        EObject this_VerificationActivity_5 = null;

        EObject this_Category_6 = null;

        EObject this_ExternalDocument_7 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:305:28: ( (this_ContractualElement_0= ruleContractualElement | this_Goal_1= ruleGoal | this_Requirement_2= ruleRequirement | this_RSALSection_3= ruleRSALSection | this_Stakeholder_4= ruleStakeholder | this_VerificationActivity_5= ruleVerificationActivity | this_Category_6= ruleCategory | this_ExternalDocument_7= ruleExternalDocument ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:306:1: (this_ContractualElement_0= ruleContractualElement | this_Goal_1= ruleGoal | this_Requirement_2= ruleRequirement | this_RSALSection_3= ruleRSALSection | this_Stakeholder_4= ruleStakeholder | this_VerificationActivity_5= ruleVerificationActivity | this_Category_6= ruleCategory | this_ExternalDocument_7= ruleExternalDocument )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:306:1: (this_ContractualElement_0= ruleContractualElement | this_Goal_1= ruleGoal | this_Requirement_2= ruleRequirement | this_RSALSection_3= ruleRSALSection | this_Stakeholder_4= ruleStakeholder | this_VerificationActivity_5= ruleVerificationActivity | this_Category_6= ruleCategory | this_ExternalDocument_7= ruleExternalDocument )
            int alt9=8;
            switch ( input.LA(1) ) {
            case Cr:
                {
                alt9=1;
                }
                break;
            case Goal:
                {
                alt9=2;
                }
                break;
            case Requirement:
                {
                alt9=3;
                }
                break;
            case Section:
                {
                alt9=4;
                }
                break;
            case Stakeholder:
                {
                alt9=5;
                }
                break;
            case Verification:
                {
                alt9=6;
                }
                break;
            case Category:
                {
                alt9=7;
                }
                break;
            case Document:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:307:5: this_ContractualElement_0= ruleContractualElement
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getContractualElementParserRuleCall_0()); 
                        
                    pushFollow(FOLLOW_ruleContractualElement_in_ruleRSALElement600);
                    this_ContractualElement_0=ruleContractualElement();

                    state._fsp--;


                            current = this_ContractualElement_0;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:317:5: this_Goal_1= ruleGoal
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getGoalParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_ruleGoal_in_ruleRSALElement627);
                    this_Goal_1=ruleGoal();

                    state._fsp--;


                            current = this_Goal_1;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:327:5: this_Requirement_2= ruleRequirement
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getRequirementParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleRequirement_in_ruleRSALElement654);
                    this_Requirement_2=ruleRequirement();

                    state._fsp--;


                            current = this_Requirement_2;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 4 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:337:5: this_RSALSection_3= ruleRSALSection
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getRSALSectionParserRuleCall_3()); 
                        
                    pushFollow(FOLLOW_ruleRSALSection_in_ruleRSALElement681);
                    this_RSALSection_3=ruleRSALSection();

                    state._fsp--;


                            current = this_RSALSection_3;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 5 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:347:5: this_Stakeholder_4= ruleStakeholder
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getStakeholderParserRuleCall_4()); 
                        
                    pushFollow(FOLLOW_ruleStakeholder_in_ruleRSALElement708);
                    this_Stakeholder_4=ruleStakeholder();

                    state._fsp--;


                            current = this_Stakeholder_4;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 6 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:357:5: this_VerificationActivity_5= ruleVerificationActivity
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getVerificationActivityParserRuleCall_5()); 
                        
                    pushFollow(FOLLOW_ruleVerificationActivity_in_ruleRSALElement735);
                    this_VerificationActivity_5=ruleVerificationActivity();

                    state._fsp--;


                            current = this_VerificationActivity_5;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 7 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:367:5: this_Category_6= ruleCategory
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getCategoryParserRuleCall_6()); 
                        
                    pushFollow(FOLLOW_ruleCategory_in_ruleRSALElement762);
                    this_Category_6=ruleCategory();

                    state._fsp--;


                            current = this_Category_6;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;
                case 8 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:377:5: this_ExternalDocument_7= ruleExternalDocument
                    {
                     
                            newCompositeNode(grammarAccess.getRSALElementAccess().getExternalDocumentParserRuleCall_7()); 
                        
                    pushFollow(FOLLOW_ruleExternalDocument_in_ruleRSALElement789);
                    this_ExternalDocument_7=ruleExternalDocument();

                    state._fsp--;


                            current = this_ExternalDocument_7;
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSALElement"


    // $ANTLR start "entryRuleRSALSection"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:393:1: entryRuleRSALSection returns [EObject current=null] : iv_ruleRSALSection= ruleRSALSection EOF ;
    public final EObject entryRuleRSALSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSALSection = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:394:2: (iv_ruleRSALSection= ruleRSALSection EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:395:2: iv_ruleRSALSection= ruleRSALSection EOF
            {
             newCompositeNode(grammarAccess.getRSALSectionRule()); 
            pushFollow(FOLLOW_ruleRSALSection_in_entryRuleRSALSection823);
            iv_ruleRSALSection=ruleRSALSection();

            state._fsp--;

             current =iv_ruleRSALSection; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSALSection833); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRSALSection"


    // $ANTLR start "ruleRSALSection"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:402:1: ruleRSALSection returns [EObject current=null] : (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) ( (lv_content_2_0= ruleRSALElement ) )+ (otherlv_3= Issues ( (lv_issue_4_0= ruleValueString ) ) (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )* )? otherlv_7= End ) ;
    public final EObject ruleRSALSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        EObject lv_content_2_0 = null;

        AntlrDatatypeRuleToken lv_issue_4_0 = null;

        AntlrDatatypeRuleToken lv_issue_6_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:405:28: ( (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) ( (lv_content_2_0= ruleRSALElement ) )+ (otherlv_3= Issues ( (lv_issue_4_0= ruleValueString ) ) (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )* )? otherlv_7= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:406:1: (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) ( (lv_content_2_0= ruleRSALElement ) )+ (otherlv_3= Issues ( (lv_issue_4_0= ruleValueString ) ) (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )* )? otherlv_7= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:406:1: (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) ( (lv_content_2_0= ruleRSALElement ) )+ (otherlv_3= Issues ( (lv_issue_4_0= ruleValueString ) ) (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )* )? otherlv_7= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:407:2: otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) ( (lv_content_2_0= ruleRSALElement ) )+ (otherlv_3= Issues ( (lv_issue_4_0= ruleValueString ) ) (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )* )? otherlv_7= End
            {
            otherlv_0=(Token)match(input,Section,FOLLOW_Section_in_ruleRSALSection871); 

                	newLeafNode(otherlv_0, grammarAccess.getRSALSectionAccess().getSectionKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:411:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:412:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:412:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:413:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALSection887); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRSALSectionAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRSALSectionRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:429:2: ( (lv_content_2_0= ruleRSALElement ) )+
            int cnt10=0;
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==Verification||(LA10_0>=Requirement && LA10_0<=Stakeholder)||(LA10_0>=Category && LA10_0<=Document)||LA10_0==Section||LA10_0==Goal||LA10_0==Cr) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:430:1: (lv_content_2_0= ruleRSALElement )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:430:1: (lv_content_2_0= ruleRSALElement )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:431:3: lv_content_2_0= ruleRSALElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentRSALElementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRSALElement_in_ruleRSALSection913);
            	    lv_content_2_0=ruleRSALElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_2_0, 
            	            		"RSALElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt10 >= 1 ) break loop10;
                        EarlyExitException eee =
                            new EarlyExitException(10, input);
                        throw eee;
                }
                cnt10++;
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:447:3: (otherlv_3= Issues ( (lv_issue_4_0= ruleValueString ) ) (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==Issues) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:448:2: otherlv_3= Issues ( (lv_issue_4_0= ruleValueString ) ) (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )*
                    {
                    otherlv_3=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRSALSection928); 

                        	newLeafNode(otherlv_3, grammarAccess.getRSALSectionAccess().getIssuesKeyword_3_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:452:1: ( (lv_issue_4_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:453:1: (lv_issue_4_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:453:1: (lv_issue_4_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:454:3: lv_issue_4_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRSALSectionAccess().getIssueValueStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleRSALSection948);
                    lv_issue_4_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
                    	        }
                           		add(
                           			current, 
                           			"issue",
                            		lv_issue_4_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:470:2: (otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==Comma) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:471:2: otherlv_5= Comma ( (lv_issue_6_0= ruleValueString ) )
                    	    {
                    	    otherlv_5=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALSection962); 

                    	        	newLeafNode(otherlv_5, grammarAccess.getRSALSectionAccess().getCommaKeyword_3_2_0());
                    	        
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:475:1: ( (lv_issue_6_0= ruleValueString ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:476:1: (lv_issue_6_0= ruleValueString )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:476:1: (lv_issue_6_0= ruleValueString )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:477:3: lv_issue_6_0= ruleValueString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRSALSectionAccess().getIssueValueStringParserRuleCall_3_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueString_in_ruleRSALSection982);
                    	    lv_issue_6_0=ruleValueString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"issue",
                    	            		lv_issue_6_0, 
                    	            		"ValueString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop11;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_7=(Token)match(input,End,FOLLOW_End_in_ruleRSALSection999); 

                	newLeafNode(otherlv_7, grammarAccess.getRSALSectionAccess().getEndKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRSALSection"


    // $ANTLR start "entryRuleOrganization"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:506:1: entryRuleOrganization returns [EObject current=null] : iv_ruleOrganization= ruleOrganization EOF ;
    public final EObject entryRuleOrganization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganization = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:507:2: (iv_ruleOrganization= ruleOrganization EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:508:2: iv_ruleOrganization= ruleOrganization EOF
            {
             newCompositeNode(grammarAccess.getOrganizationRule()); 
            pushFollow(FOLLOW_ruleOrganization_in_entryRuleOrganization1033);
            iv_ruleOrganization=ruleOrganization();

            state._fsp--;

             current =iv_ruleOrganization; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganization1043); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOrganization"


    // $ANTLR start "ruleOrganization"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:515:1: ruleOrganization returns [EObject current=null] : (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End ) ;
    public final EObject ruleOrganization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_stakeholder_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:518:28: ( (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:519:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:519:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:520:2: otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End
            {
            otherlv_0=(Token)match(input,Organization,FOLLOW_Organization_in_ruleOrganization1081); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizationAccess().getOrganizationKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:524:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:525:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:525:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:526:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrganization1097); 

            			newLeafNode(lv_name_1_0, grammarAccess.getOrganizationAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getOrganizationRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:542:2: ( (lv_stakeholder_2_0= ruleStakeholder ) )+
            int cnt13=0;
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==Stakeholder) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:543:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:543:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:544:3: lv_stakeholder_2_0= ruleStakeholder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganizationAccess().getStakeholderStakeholderParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStakeholder_in_ruleOrganization1123);
            	    lv_stakeholder_2_0=ruleStakeholder();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getOrganizationRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"stakeholder",
            	            		lv_stakeholder_2_0, 
            	            		"Stakeholder");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt13 >= 1 ) break loop13;
                        EarlyExitException eee =
                            new EarlyExitException(13, input);
                        throw eee;
                }
                cnt13++;
            } while (true);

            otherlv_3=(Token)match(input,End,FOLLOW_End_in_ruleOrganization1137); 

                	newLeafNode(otherlv_3, grammarAccess.getOrganizationAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOrganization"


    // $ANTLR start "entryRuleContractualElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:575:1: entryRuleContractualElement returns [EObject current=null] : iv_ruleContractualElement= ruleContractualElement EOF ;
    public final EObject entryRuleContractualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractualElement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:576:2: (iv_ruleContractualElement= ruleContractualElement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:577:2: iv_ruleContractualElement= ruleContractualElement EOF
            {
             newCompositeNode(grammarAccess.getContractualElementRule()); 
            pushFollow(FOLLOW_ruleContractualElement_in_entryRuleContractualElement1173);
            iv_ruleContractualElement=ruleContractualElement();

            state._fsp--;

             current =iv_ruleContractualElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContractualElement1183); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleContractualElement"


    // $ANTLR start "ruleContractualElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:584:1: ruleContractualElement returns [EObject current=null] : (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_62= End ) ;
    public final EObject ruleContractualElement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_57=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_62=null;
        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_assert_14_0 = null;

        AntlrDatatypeRuleToken lv_rationale_16_0 = null;

        AntlrDatatypeRuleToken lv_issue_18_0 = null;

        AntlrDatatypeRuleToken lv_issue_20_0 = null;

        EObject lv_docReference_59_0 = null;

        EObject lv_docReference_61_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:587:28: ( (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_62= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:588:1: (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_62= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:588:1: (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_62= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:589:2: otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_62= End
            {
            otherlv_0=(Token)match(input,Cr,FOLLOW_Cr_in_ruleContractualElement1221); 

                	newLeafNode(otherlv_0, grammarAccess.getContractualElementAccess().getCrKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:593:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:594:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:594:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:595:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContractualElement1237); 

            			newLeafNode(lv_name_1_0, grammarAccess.getContractualElementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getContractualElementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:611:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:613:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:613:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:614:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:617:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:618:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:618:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )*
            loop25:
            do {
                int alt25=17;
                alt25 = dfa25.predict(input);
                switch (alt25) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:620:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:620:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:621:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:621:115: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:622:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:625:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:625:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:625:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:626:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleContractualElement1301); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContractualElementAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:630:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:631:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:631:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:632:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleContractualElement1323);
            	    ruleQNEREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:652:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:652:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:653:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:653:115: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:654:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:657:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:657:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:657:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:658:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleContractualElement1392); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContractualElementAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:662:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:663:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:663:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:664:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1414);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:677:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop14:
            	    do {
            	        int alt14=2;
            	        int LA14_0 = input.LA(1);

            	        if ( (LA14_0==Comma) ) {
            	            alt14=1;
            	        }


            	        switch (alt14) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:678:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement1428); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getContractualElementAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:682:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:683:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:683:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:684:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1450);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop14;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:704:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:704:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:705:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:705:115: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:706:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:709:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:709:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:709:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:710:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleContractualElement1521); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContractualElementAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:714:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:715:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:715:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:716:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1541);
            	    lv_title_10_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_10_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:739:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:739:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:740:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:740:115: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:741:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:744:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:744:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:744:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:745:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleContractualElement1610); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContractualElementAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:749:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:750:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:750:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:751:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1630);
            	    lv_description_12_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_12_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:774:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:774:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:775:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:775:115: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:776:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:779:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:779:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:779:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:780:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleContractualElement1699); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContractualElementAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:784:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:785:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:785:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:786:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1719);
            	    lv_assert_14_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"assert",
            	            		lv_assert_14_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:809:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:809:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:810:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:810:115: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:811:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:814:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:814:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:814:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:815:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleContractualElement1788); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContractualElementAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:819:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:820:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:820:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:821:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1808);
            	    lv_rationale_16_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rationale",
            	            		lv_rationale_16_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:844:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:844:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:845:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:845:115: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:846:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:849:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:849:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:849:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:850:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleContractualElement1877); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContractualElementAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:854:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:855:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:855:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:856:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1897);
            	    lv_issue_18_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"issue",
            	            		lv_issue_18_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:872:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==Comma) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:873:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement1911); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getContractualElementAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:877:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:878:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:878:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:879:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1931);
            	    	    lv_issue_20_0=ruleValueString();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"issue",
            	    	            		lv_issue_20_0, 
            	    	            		"ValueString");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop15;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:902:4: ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:902:4: ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:903:5: {...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:903:115: ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:904:6: ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:907:6: ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:907:7: {...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:907:16: (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:908:2: otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Section,FOLLOW_Section_in_ruleContractualElement2002); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContractualElementAccess().getSectionKeyword_2_7_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:912:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:913:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:913:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:914:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSectionReferenceRSALContainerCrossReference_2_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2024);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:927:2: (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==Comma) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:928:2: otherlv_23= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2038); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getContractualElementAccess().getCommaKeyword_2_7_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:932:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:933:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:933:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:934:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSectionReferenceRSALContainerCrossReference_2_7_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2060);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop16;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:954:4: ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:954:4: ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:955:5: {...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:955:115: ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:956:6: ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:959:6: ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:959:7: {...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:959:16: (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:960:2: otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,Refines,FOLLOW_Refines_in_ruleContractualElement2131); 

            	        	newLeafNode(otherlv_25, grammarAccess.getContractualElementAccess().getRefinesKeyword_2_8_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:964:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:965:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:965:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:966:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRefinesReferenceContractualElementCrossReference_2_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2153);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:979:2: (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==Comma) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:980:2: otherlv_27= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2167); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getContractualElementAccess().getCommaKeyword_2_8_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:984:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:985:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:985:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:986:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRefinesReferenceContractualElementCrossReference_2_8_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2189);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop17;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1006:4: ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1006:4: ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1007:5: {...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1007:115: ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1008:6: ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1011:6: ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1011:7: {...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1011:16: (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1012:2: otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleContractualElement2260); 

            	        	newLeafNode(otherlv_29, grammarAccess.getContractualElementAccess().getDecomposesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1016:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1017:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1017:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1018:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDecomposesReferenceContractualElementCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2282);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1031:2: (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==Comma) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1032:2: otherlv_31= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2296); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getContractualElementAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1036:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1037:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1037:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1038:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDecomposesReferenceContractualElementCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2318);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1058:4: ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1058:4: ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1059:5: {...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1059:116: ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1060:6: ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1063:6: ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1063:7: {...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1063:16: (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1064:2: otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleContractualElement2389); 

            	        	newLeafNode(otherlv_33, grammarAccess.getContractualElementAccess().getEvolvesKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1068:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1069:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1069:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1070:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getEvolvesReferenceContractualElementCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2411);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1083:2: (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==Comma) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1084:2: otherlv_35= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2425); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getContractualElementAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1088:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1089:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1089:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1090:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getEvolvesReferenceContractualElementCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2447);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop19;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1110:4: ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1110:4: ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1111:5: {...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1111:116: ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1112:6: ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1115:6: ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1115:7: {...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1115:16: (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1116:2: otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,Conflicts,FOLLOW_Conflicts_in_ruleContractualElement2518); 

            	        	newLeafNode(otherlv_37, grammarAccess.getContractualElementAccess().getConflictsKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1120:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1121:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1121:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1122:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getConflictsReferenceContractualElementCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2540);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:2: (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==Comma) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1136:2: otherlv_39= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2554); 

            	    	        	newLeafNode(otherlv_39, grammarAccess.getContractualElementAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1140:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1141:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1141:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1142:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getConflictsReferenceContractualElementCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2576);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop20;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1162:4: ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1162:4: ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1163:5: {...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1163:116: ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1164:6: ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1167:6: ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1167:7: {...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1167:16: (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1168:2: otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleContractualElement2647); 

            	        	newLeafNode(otherlv_41, grammarAccess.getContractualElementAccess().getStakeholderKeyword_2_12_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1172:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1173:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1173:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1174:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderReferenceStakeholderCrossReference_2_12_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2669);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:2: (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==Comma) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1188:2: otherlv_43= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2683); 

            	    	        	newLeafNode(otherlv_43, grammarAccess.getContractualElementAccess().getCommaKeyword_2_12_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1192:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1193:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1193:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1194:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderReferenceStakeholderCrossReference_2_12_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2705);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop21;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1214:4: ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1214:4: ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1215:5: {...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1215:116: ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1216:6: ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1219:6: ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1219:7: {...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1219:16: (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1220:2: otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_45=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement2776); 

            	        	newLeafNode(otherlv_45, grammarAccess.getContractualElementAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_46=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleContractualElement2788); 

            	        	newLeafNode(otherlv_46, grammarAccess.getContractualElementAccess().getStakeholderKeyword_2_13_1());
            	        
            	    otherlv_47=(Token)match(input,Req,FOLLOW_Req_in_ruleContractualElement2800); 

            	        	newLeafNode(otherlv_47, grammarAccess.getContractualElementAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1234:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1235:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1235:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1236:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2822);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1249:2: (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==Comma) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1250:2: otherlv_49= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_49=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2836); 

            	    	        	newLeafNode(otherlv_49, grammarAccess.getContractualElementAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1254:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1255:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1255:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1256:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2858);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop22;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1276:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1276:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1277:5: {...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1277:116: ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1278:6: ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1281:6: ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1281:7: {...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1281:16: (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1282:2: otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_51=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement2929); 

            	        	newLeafNode(otherlv_51, grammarAccess.getContractualElementAccess().getSeeKeyword_2_14_0());
            	        
            	    otherlv_52=(Token)match(input,System,FOLLOW_System_in_ruleContractualElement2941); 

            	        	newLeafNode(otherlv_52, grammarAccess.getContractualElementAccess().getSystemKeyword_2_14_1());
            	        
            	    otherlv_53=(Token)match(input,Req,FOLLOW_Req_in_ruleContractualElement2953); 

            	        	newLeafNode(otherlv_53, grammarAccess.getContractualElementAccess().getReqKeyword_2_14_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1296:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1297:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1297:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1298:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_14_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2975);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1311:2: (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==Comma) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1312:2: otherlv_55= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_55=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2989); 

            	    	        	newLeafNode(otherlv_55, grammarAccess.getContractualElementAccess().getCommaKeyword_2_14_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1316:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1317:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1317:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1318:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_14_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3011);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop23;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1338:4: ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1338:4: ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1339:5: {...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1339:116: ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1340:6: ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1343:6: ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1343:7: {...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1343:16: (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1344:2: otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_57=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement3082); 

            	        	newLeafNode(otherlv_57, grammarAccess.getContractualElementAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_58=(Token)match(input,Document,FOLLOW_Document_in_ruleContractualElement3094); 

            	        	newLeafNode(otherlv_58, grammarAccess.getContractualElementAccess().getDocumentKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1353:1: ( (lv_docReference_59_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1354:1: (lv_docReference_59_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1354:1: (lv_docReference_59_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1355:3: lv_docReference_59_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDocReferenceXDocUriParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleContractualElement3114);
            	    lv_docReference_59_0=ruleXDocUri();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"docReference",
            	            		lv_docReference_59_0, 
            	            		"XDocUri");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1371:2: (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==Comma) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1372:2: otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_60=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement3128); 

            	    	        	newLeafNode(otherlv_60, grammarAccess.getContractualElementAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1376:1: ( (lv_docReference_61_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1377:1: (lv_docReference_61_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1377:1: (lv_docReference_61_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1378:3: lv_docReference_61_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDocReferenceXDocUriParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleContractualElement3148);
            	    	    lv_docReference_61_0=ruleXDocUri();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"docReference",
            	    	            		lv_docReference_61_0, 
            	    	            		"XDocUri");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop24;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	

            }

            otherlv_62=(Token)match(input,End,FOLLOW_End_in_ruleContractualElement3204); 

                	newLeafNode(otherlv_62, grammarAccess.getContractualElementAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleContractualElement"


    // $ANTLR start "entryRuleGoal"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1421:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1422:2: (iv_ruleGoal= ruleGoal EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1423:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal3238);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal3248); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleGoal"


    // $ANTLR start "ruleGoal"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1430:1: ruleGoal returns [EObject current=null] : (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_58= End ) ;
    public final EObject ruleGoal() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_42=null;
        Token otherlv_43=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_assert_14_0 = null;

        AntlrDatatypeRuleToken lv_rationale_16_0 = null;

        AntlrDatatypeRuleToken lv_issue_18_0 = null;

        AntlrDatatypeRuleToken lv_issue_20_0 = null;

        EObject lv_docReference_55_0 = null;

        EObject lv_docReference_57_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1433:28: ( (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_58= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1434:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_58= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1434:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_58= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1435:2: otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_58= End
            {
            otherlv_0=(Token)match(input,Goal,FOLLOW_Goal_in_ruleGoal3286); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1439:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1440:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1440:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1441:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3302); 

            			newLeafNode(lv_name_1_0, grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getGoalRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1457:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1459:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1459:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1460:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1463:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1464:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1464:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )*
            loop36:
            do {
                int alt36=16;
                alt36 = dfa36.predict(input);
                switch (alt36) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1466:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1466:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1467:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1467:101: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1468:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1471:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1471:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1471:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1472:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleGoal3366); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1476:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1477:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1477:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1478:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleGoal3388);
            	    ruleQNEREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1498:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1498:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1499:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1499:101: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1500:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1503:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1503:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1503:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1504:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleGoal3457); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1508:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1509:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1509:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1510:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3479);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1523:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==Comma) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1524:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal3493); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1528:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1529:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1529:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1530:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3515);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop26;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1550:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1550:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1551:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1551:101: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1552:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1555:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1555:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1555:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1556:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleGoal3586); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1560:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1561:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1561:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1562:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3606);
            	    lv_title_10_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_10_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1585:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1585:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1586:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1586:101: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1587:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1590:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1590:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1590:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1591:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleGoal3675); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1595:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1596:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1596:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1597:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3695);
            	    lv_description_12_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_12_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1620:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1620:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1621:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1621:101: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1622:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1625:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1625:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1625:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1626:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleGoal3764); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1630:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1631:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1631:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1632:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3784);
            	    lv_assert_14_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"assert",
            	            		lv_assert_14_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1655:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1655:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1656:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1656:101: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1657:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1660:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1660:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1660:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1661:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleGoal3853); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1665:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1666:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1666:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1667:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3873);
            	    lv_rationale_16_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rationale",
            	            		lv_rationale_16_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1690:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1690:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1691:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1691:101: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1692:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1695:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1695:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1695:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1696:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleGoal3942); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1700:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1701:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1701:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1702:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3962);
            	    lv_issue_18_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"issue",
            	            		lv_issue_18_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1718:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==Comma) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1719:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal3976); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1723:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1724:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1724:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1725:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3996);
            	    	    lv_issue_20_0=ruleValueString();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"issue",
            	    	            		lv_issue_20_0, 
            	    	            		"ValueString");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop27;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1748:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1748:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1749:5: {...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1749:101: ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1750:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1753:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1753:7: {...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1753:16: (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1754:2: otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Refines,FOLLOW_Refines_in_ruleGoal4067); 

            	        	newLeafNode(otherlv_21, grammarAccess.getGoalAccess().getRefinesKeyword_2_7_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1758:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1759:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1759:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1760:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4089);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1773:2: (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==Comma) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1774:2: otherlv_23= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4103); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getGoalAccess().getCommaKeyword_2_7_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1778:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1779:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1779:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1780:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4125);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop28;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1800:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1800:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1801:5: {...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1801:101: ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1802:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1805:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1805:7: {...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1805:16: (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1806:2: otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleGoal4196); 

            	        	newLeafNode(otherlv_25, grammarAccess.getGoalAccess().getDecomposesKeyword_2_8_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1810:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1811:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1811:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1812:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4218);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1825:2: (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==Comma) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1826:2: otherlv_27= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4232); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getGoalAccess().getCommaKeyword_2_8_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1830:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1831:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1831:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1832:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4254);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop29;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1852:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1852:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1853:5: {...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1853:101: ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1854:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1857:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1857:7: {...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1857:16: (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1858:2: otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleGoal4325); 

            	        	newLeafNode(otherlv_29, grammarAccess.getGoalAccess().getEvolvesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1862:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1863:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1863:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1864:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4347);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1877:2: (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==Comma) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1878:2: otherlv_31= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4361); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getGoalAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1882:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1883:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1883:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1884:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4383);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1904:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1904:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1905:5: {...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1905:102: ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1906:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1909:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1909:7: {...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1909:16: (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1910:2: otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Conflicts,FOLLOW_Conflicts_in_ruleGoal4454); 

            	        	newLeafNode(otherlv_33, grammarAccess.getGoalAccess().getConflictsKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1914:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1915:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1915:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1916:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4476);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1929:2: (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==Comma) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1930:2: otherlv_35= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4490); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getGoalAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1934:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1935:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1935:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1936:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4512);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop31;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1956:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1956:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1957:5: {...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1957:102: ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1958:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1961:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1961:7: {...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1961:16: (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1962:2: otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleGoal4583); 

            	        	newLeafNode(otherlv_37, grammarAccess.getGoalAccess().getStakeholderKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1966:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1967:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1967:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1968:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4605);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1981:2: (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==Comma) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1982:2: otherlv_39= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4619); 

            	    	        	newLeafNode(otherlv_39, grammarAccess.getGoalAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1986:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1987:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1987:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1988:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4641);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2008:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2008:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2009:5: {...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2009:102: ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2010:6: ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2013:6: ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2013:7: {...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2013:16: (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2014:2: otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,See,FOLLOW_See_in_ruleGoal4712); 

            	        	newLeafNode(otherlv_41, grammarAccess.getGoalAccess().getSeeKeyword_2_12_0());
            	        
            	    otherlv_42=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleGoal4724); 

            	        	newLeafNode(otherlv_42, grammarAccess.getGoalAccess().getStakeholderKeyword_2_12_1());
            	        
            	    otherlv_43=(Token)match(input,Req,FOLLOW_Req_in_ruleGoal4736); 

            	        	newLeafNode(otherlv_43, grammarAccess.getGoalAccess().getReqKeyword_2_12_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2028:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2029:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2029:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2030:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4758);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2043:2: (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==Comma) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2044:2: otherlv_45= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_45=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4772); 

            	    	        	newLeafNode(otherlv_45, grammarAccess.getGoalAccess().getCommaKeyword_2_12_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2048:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2049:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2049:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2050:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4794);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop33;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2070:4: ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2070:4: ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2071:5: {...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2071:102: ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2072:6: ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2075:6: ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2075:7: {...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2075:16: (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2076:2: otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_47=(Token)match(input,See,FOLLOW_See_in_ruleGoal4865); 

            	        	newLeafNode(otherlv_47, grammarAccess.getGoalAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_48=(Token)match(input,System,FOLLOW_System_in_ruleGoal4877); 

            	        	newLeafNode(otherlv_48, grammarAccess.getGoalAccess().getSystemKeyword_2_13_1());
            	        
            	    otherlv_49=(Token)match(input,Req,FOLLOW_Req_in_ruleGoal4889); 

            	        	newLeafNode(otherlv_49, grammarAccess.getGoalAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2090:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2091:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2091:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2092:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4911);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2105:2: (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==Comma) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2106:2: otherlv_51= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4925); 

            	    	        	newLeafNode(otherlv_51, grammarAccess.getGoalAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2110:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2111:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2111:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2112:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4947);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop34;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2132:4: ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2132:4: ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2133:5: {...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2133:102: ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2134:6: ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2137:6: ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2137:7: {...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2137:16: (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2138:2: otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_53=(Token)match(input,See,FOLLOW_See_in_ruleGoal5018); 

            	        	newLeafNode(otherlv_53, grammarAccess.getGoalAccess().getSeeKeyword_2_14_0());
            	        
            	    otherlv_54=(Token)match(input,Document,FOLLOW_Document_in_ruleGoal5030); 

            	        	newLeafNode(otherlv_54, grammarAccess.getGoalAccess().getDocumentKeyword_2_14_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2147:1: ( (lv_docReference_55_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2148:1: (lv_docReference_55_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2148:1: (lv_docReference_55_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2149:3: lv_docReference_55_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal5050);
            	    lv_docReference_55_0=ruleXDocUri();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"docReference",
            	            		lv_docReference_55_0, 
            	            		"XDocUri");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2165:2: (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==Comma) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2166:2: otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_56=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5064); 

            	    	        	newLeafNode(otherlv_56, grammarAccess.getGoalAccess().getCommaKeyword_2_14_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2170:1: ( (lv_docReference_57_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2171:1: (lv_docReference_57_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2171:1: (lv_docReference_57_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2172:3: lv_docReference_57_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal5084);
            	    	    lv_docReference_57_0=ruleXDocUri();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"docReference",
            	    	            		lv_docReference_57_0, 
            	    	            		"XDocUri");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop35;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	

            }

            otherlv_58=(Token)match(input,End,FOLLOW_End_in_ruleGoal5140); 

                	newLeafNode(otherlv_58, grammarAccess.getGoalAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleRequirement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2215:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2216:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2217:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement5174);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement5184); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRequirement"


    // $ANTLR start "ruleRequirement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2224:1: ruleRequirement returns [EObject current=null] : (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        Token otherlv_29=null;
        Token otherlv_31=null;
        Token otherlv_33=null;
        Token otherlv_35=null;
        Token otherlv_37=null;
        Token otherlv_39=null;
        Token otherlv_41=null;
        Token otherlv_43=null;
        Token otherlv_44=null;
        Token otherlv_45=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_50=null;
        Token otherlv_51=null;
        Token otherlv_53=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_assert_14_0 = null;

        AntlrDatatypeRuleToken lv_rationale_16_0 = null;

        AntlrDatatypeRuleToken lv_issue_18_0 = null;

        AntlrDatatypeRuleToken lv_issue_20_0 = null;

        AntlrDatatypeRuleToken lv_hazardReference_28_0 = null;

        AntlrDatatypeRuleToken lv_hazardReference_30_0 = null;

        EObject lv_verifiedBy_57_0 = null;

        EObject lv_docReference_60_0 = null;

        EObject lv_docReference_62_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2227:28: ( (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2228:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2228:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2229:2: otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End
            {
            otherlv_0=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleRequirement5222); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2233:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2234:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2234:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2235:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement5238); 

            			newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getRequirementRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2251:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2253:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2253:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2254:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2257:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2258:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2258:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )*
            loop48:
            do {
                int alt48=17;
                alt48 = dfa48.predict(input);
                switch (alt48) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2260:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2260:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2261:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2261:108: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2262:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2265:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2265:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2265:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2266:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleRequirement5302); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2270:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2271:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2271:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2272:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement5324);
            	    ruleQNEREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2292:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2292:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2293:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2293:108: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2294:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2297:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2297:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2297:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2298:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleRequirement5393); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2302:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2303:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2303:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2304:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5415);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2317:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==Comma) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2318:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5429); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2322:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2323:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2323:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2324:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5451);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop37;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2344:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2344:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2345:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2345:108: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2346:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2349:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2349:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2349:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2350:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleRequirement5522); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2354:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2355:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2355:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2356:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5542);
            	    lv_title_10_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_10_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2379:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2379:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2380:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2380:108: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2381:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2384:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2384:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2384:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2385:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleRequirement5611); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2389:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2390:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2390:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2391:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5631);
            	    lv_description_12_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_12_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2414:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2414:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2415:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2415:108: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2416:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2419:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2419:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2419:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2420:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleRequirement5700); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2424:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2425:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2425:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2426:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5720);
            	    lv_assert_14_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"assert",
            	            		lv_assert_14_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2449:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2449:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2450:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2450:108: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2451:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2454:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2454:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2454:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2455:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleRequirement5789); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2459:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2460:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2460:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2461:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5809);
            	    lv_rationale_16_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"rationale",
            	            		lv_rationale_16_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2484:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2484:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2485:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2485:108: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2486:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2489:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2489:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2489:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2490:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRequirement5878); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2494:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2495:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2495:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2496:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5898);
            	    lv_issue_18_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"issue",
            	            		lv_issue_18_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2512:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==Comma) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2513:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5912); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2517:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2518:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2518:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2519:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5932);
            	    	    lv_issue_20_0=ruleValueString();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"issue",
            	    	            		lv_issue_20_0, 
            	    	            		"ValueString");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop38;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2542:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2542:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2543:5: {...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2543:108: ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2544:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2547:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2547:7: {...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2547:16: (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2548:2: otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6003); 

            	        	newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getSeeKeyword_2_7_0());
            	        
            	    otherlv_22=(Token)match(input,Goal,FOLLOW_Goal_in_ruleRequirement6015); 

            	        	newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getGoalKeyword_2_7_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2557:1: ( (otherlv_23= RULE_ID ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2558:1: (otherlv_23= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2558:1: (otherlv_23= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2559:3: otherlv_23= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement6034); 

            	    		newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_2_0()); 
            	    	

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2570:2: (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==Comma) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2571:2: otherlv_24= Comma ( (otherlv_25= RULE_ID ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6048); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getCommaKeyword_2_7_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2575:1: ( (otherlv_25= RULE_ID ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2576:1: (otherlv_25= RULE_ID )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2576:1: (otherlv_25= RULE_ID )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2577:3: otherlv_25= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement6067); 

            	    	    		newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_3_1_0()); 
            	    	    	

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop39;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2595:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2595:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2596:5: {...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2596:108: ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2597:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2600:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2600:7: {...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2600:16: (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2601:2: otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    {
            	    otherlv_26=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6138); 

            	        	newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getSeeKeyword_2_8_0());
            	        
            	    otherlv_27=(Token)match(input,Hazard,FOLLOW_Hazard_in_ruleRequirement6150); 

            	        	newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getHazardKeyword_2_8_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2610:1: ( (lv_hazardReference_28_0= ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2611:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2611:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2612:3: lv_hazardReference_28_0= ruleQNEREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement6170);
            	    lv_hazardReference_28_0=ruleQNEREF();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"hazardReference",
            	            		lv_hazardReference_28_0, 
            	            		"QNEREF");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2628:2: (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==Comma) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2629:2: otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6184); 

            	    	        	newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getCommaKeyword_2_8_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2633:1: ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2634:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2634:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2635:3: lv_hazardReference_30_0= ruleQNEREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement6204);
            	    	    lv_hazardReference_30_0=ruleQNEREF();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"hazardReference",
            	    	            		lv_hazardReference_30_0, 
            	    	            		"QNEREF");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop40;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2658:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2658:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2659:5: {...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2659:108: ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2660:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2663:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2663:7: {...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2663:16: (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2664:2: otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_31=(Token)match(input,Refines,FOLLOW_Refines_in_ruleRequirement6275); 

            	        	newLeafNode(otherlv_31, grammarAccess.getRequirementAccess().getRefinesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2668:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2669:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2669:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2670:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6297);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2683:2: (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==Comma) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2684:2: otherlv_33= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_33=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6311); 

            	    	        	newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2688:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2689:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2689:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2690:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6333);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop41;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2710:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2710:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2711:5: {...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2711:109: ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2712:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2715:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2715:7: {...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2715:16: (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2716:2: otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_35=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleRequirement6404); 

            	        	newLeafNode(otherlv_35, grammarAccess.getRequirementAccess().getDecomposesKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2720:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2721:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2721:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2722:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6426);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2735:2: (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==Comma) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2736:2: otherlv_37= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6440); 

            	    	        	newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2740:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2741:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2741:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2742:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6462);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop42;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2762:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2762:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2763:5: {...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2763:109: ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2764:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2767:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2767:7: {...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2767:16: (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2768:2: otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_39=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleRequirement6533); 

            	        	newLeafNode(otherlv_39, grammarAccess.getRequirementAccess().getEvolvesKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2772:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2773:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2773:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2774:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6555);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2787:2: (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==Comma) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2788:2: otherlv_41= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6569); 

            	    	        	newLeafNode(otherlv_41, grammarAccess.getRequirementAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2792:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2793:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2793:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2794:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6591);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop43;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2814:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2814:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2815:5: {...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2815:109: ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2816:6: ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2819:6: ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2819:7: {...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2819:16: (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2820:2: otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_43=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6662); 

            	        	newLeafNode(otherlv_43, grammarAccess.getRequirementAccess().getSeeKeyword_2_12_0());
            	        
            	    otherlv_44=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleRequirement6674); 

            	        	newLeafNode(otherlv_44, grammarAccess.getRequirementAccess().getStakeholderKeyword_2_12_1());
            	        
            	    otherlv_45=(Token)match(input,Req,FOLLOW_Req_in_ruleRequirement6686); 

            	        	newLeafNode(otherlv_45, grammarAccess.getRequirementAccess().getReqKeyword_2_12_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2834:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2835:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2835:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2836:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6708);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2849:2: (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==Comma) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2850:2: otherlv_47= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_47=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6722); 

            	    	        	newLeafNode(otherlv_47, grammarAccess.getRequirementAccess().getCommaKeyword_2_12_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2854:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2855:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2855:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2856:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6744);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop44;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2876:4: ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2876:4: ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2877:5: {...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2877:109: ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2878:6: ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2881:6: ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2881:7: {...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2881:16: (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2882:2: otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_49=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6815); 

            	        	newLeafNode(otherlv_49, grammarAccess.getRequirementAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_50=(Token)match(input,System,FOLLOW_System_in_ruleRequirement6827); 

            	        	newLeafNode(otherlv_50, grammarAccess.getRequirementAccess().getSystemKeyword_2_13_1());
            	        
            	    otherlv_51=(Token)match(input,Req,FOLLOW_Req_in_ruleRequirement6839); 

            	        	newLeafNode(otherlv_51, grammarAccess.getRequirementAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2896:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2897:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2897:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2898:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6861);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2911:2: (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==Comma) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2912:2: otherlv_53= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_53=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6875); 

            	    	        	newLeafNode(otherlv_53, grammarAccess.getRequirementAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2916:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2917:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2917:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2918:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6897);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop45;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2938:4: ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2938:4: ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2939:5: {...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2939:109: ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2940:6: ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2943:6: ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2943:7: {...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2943:16: (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2944:2: otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )*
            	    {
            	    otherlv_55=(Token)match(input,Verified,FOLLOW_Verified_in_ruleRequirement6968); 

            	        	newLeafNode(otherlv_55, grammarAccess.getRequirementAccess().getVerifiedKeyword_2_14_0());
            	        
            	    otherlv_56=(Token)match(input,By,FOLLOW_By_in_ruleRequirement6980); 

            	        	newLeafNode(otherlv_56, grammarAccess.getRequirementAccess().getByKeyword_2_14_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2953:1: ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==RULE_ID) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2954:1: (lv_verifiedBy_57_0= ruleVerificationDecomposition )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2954:1: (lv_verifiedBy_57_0= ruleVerificationDecomposition )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2955:3: lv_verifiedBy_57_0= ruleVerificationDecomposition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getVerifiedByVerificationDecompositionParserRuleCall_2_14_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleRequirement7000);
            	    	    lv_verifiedBy_57_0=ruleVerificationDecomposition();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"verifiedBy",
            	    	            		lv_verifiedBy_57_0, 
            	    	            		"VerificationDecomposition");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop46;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2978:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2978:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2979:5: {...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2979:109: ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2980:6: ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2983:6: ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2983:7: {...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2983:16: (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2984:2: otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_58=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7070); 

            	        	newLeafNode(otherlv_58, grammarAccess.getRequirementAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_59=(Token)match(input,Document,FOLLOW_Document_in_ruleRequirement7082); 

            	        	newLeafNode(otherlv_59, grammarAccess.getRequirementAccess().getDocumentKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2993:1: ( (lv_docReference_60_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2994:1: (lv_docReference_60_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2994:1: (lv_docReference_60_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2995:3: lv_docReference_60_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement7102);
            	    lv_docReference_60_0=ruleXDocUri();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"docReference",
            	            		lv_docReference_60_0, 
            	            		"XDocUri");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3011:2: (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==Comma) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3012:2: otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_61=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7116); 

            	    	        	newLeafNode(otherlv_61, grammarAccess.getRequirementAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3016:1: ( (lv_docReference_62_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3017:1: (lv_docReference_62_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3017:1: (lv_docReference_62_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3018:3: lv_docReference_62_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement7136);
            	    	    lv_docReference_62_0=ruleXDocUri();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"docReference",
            	    	            		lv_docReference_62_0, 
            	    	            		"XDocUri");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop47;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop48;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	

            }

            otherlv_63=(Token)match(input,End,FOLLOW_End_in_ruleRequirement7192); 

                	newLeafNode(otherlv_63, grammarAccess.getRequirementAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleExternalDocument"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3061:1: entryRuleExternalDocument returns [EObject current=null] : iv_ruleExternalDocument= ruleExternalDocument EOF ;
    public final EObject entryRuleExternalDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDocument = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3062:2: (iv_ruleExternalDocument= ruleExternalDocument EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3063:2: iv_ruleExternalDocument= ruleExternalDocument EOF
            {
             newCompositeNode(grammarAccess.getExternalDocumentRule()); 
            pushFollow(FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument7226);
            iv_ruleExternalDocument=ruleExternalDocument();

            state._fsp--;

             current =iv_ruleExternalDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalDocument7236); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleExternalDocument"


    // $ANTLR start "ruleExternalDocument"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3070:1: ruleExternalDocument returns [EObject current=null] : (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) ;
    public final EObject ruleExternalDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_externalReference_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3073:28: ( (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3074:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3074:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3075:2: otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End
            {
            otherlv_0=(Token)match(input,Document,FOLLOW_Document_in_ruleExternalDocument7274); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalDocumentAccess().getDocumentKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3079:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3080:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3080:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3081:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalDocument7290); 

            			newLeafNode(lv_name_1_0, grammarAccess.getExternalDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getExternalDocumentRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            otherlv_2=(Token)match(input,See,FOLLOW_See_in_ruleExternalDocument7308); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalDocumentAccess().getSeeKeyword_2());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3102:1: ( (lv_externalReference_3_0= ruleDOCPATH ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3103:1: (lv_externalReference_3_0= ruleDOCPATH )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3103:1: (lv_externalReference_3_0= ruleDOCPATH )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3104:3: lv_externalReference_3_0= ruleDOCPATH
            {
             
            	        newCompositeNode(grammarAccess.getExternalDocumentAccess().getExternalReferenceDOCPATHParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOCPATH_in_ruleExternalDocument7328);
            lv_externalReference_3_0=ruleDOCPATH();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getExternalDocumentRule());
            	        }
                   		set(
                   			current, 
                   			"externalReference",
                    		lv_externalReference_3_0, 
                    		"DOCPATH");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleExternalDocument7341); 

                	newLeafNode(otherlv_4, grammarAccess.getExternalDocumentAccess().getEndKeyword_4());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleExternalDocument"


    // $ANTLR start "entryRuleXDocUri"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3133:1: entryRuleXDocUri returns [EObject current=null] : iv_ruleXDocUri= ruleXDocUri EOF ;
    public final EObject entryRuleXDocUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDocUri = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3134:2: (iv_ruleXDocUri= ruleXDocUri EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3135:2: iv_ruleXDocUri= ruleXDocUri EOF
            {
             newCompositeNode(grammarAccess.getXDocUriRule()); 
            pushFollow(FOLLOW_ruleXDocUri_in_entryRuleXDocUri7375);
            iv_ruleXDocUri=ruleXDocUri();

            state._fsp--;

             current =iv_ruleXDocUri; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDocUri7385); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleXDocUri"


    // $ANTLR start "ruleXDocUri"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3142:1: ruleXDocUri returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) ;
    public final EObject ruleXDocUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_docFragment_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3145:28: ( ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3146:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3146:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3146:2: ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3146:2: ( ( ruleDOTTEDREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3147:1: ( ruleDOTTEDREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3147:1: ( ruleDOTTEDREF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3148:3: ruleDOTTEDREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getXDocUriRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocReferenceExternalDocumentCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleXDocUri7433);
            ruleDOTTEDREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3161:2: (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==NumberSign) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3162:2: otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    {
                    otherlv_1=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_ruleXDocUri7447); 

                        	newLeafNode(otherlv_1, grammarAccess.getXDocUriAccess().getNumberSignKeyword_1_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3166:1: ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3167:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3167:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3168:3: lv_docFragment_2_0= ruleDOCFRAGMENT
                    {
                     
                    	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocFragmentDOCFRAGMENTParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri7467);
                    lv_docFragment_2_0=ruleDOCFRAGMENT();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getXDocUriRule());
                    	        }
                           		set(
                           			current, 
                           			"docFragment",
                            		lv_docFragment_2_0, 
                            		"DOCFRAGMENT");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }


            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleXDocUri"


    // $ANTLR start "entryRuleCategory"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3192:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3193:2: (iv_ruleCategory= ruleCategory EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3194:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory7504);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory7514); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategory"


    // $ANTLR start "ruleCategory"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3201:1: ruleCategory returns [EObject current=null] : (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3204:28: ( (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3205:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3205:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3206:2: otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End
            {
            otherlv_0=(Token)match(input,Category,FOLLOW_Category_in_ruleCategory7552); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3210:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3211:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3211:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3212:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCategory7568); 

            			newLeafNode(lv_name_1_0, grammarAccess.getCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getCategoryRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3228:2: (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Extends) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3229:2: otherlv_2= Extends ( ( ruleDOTTEDREF ) )
                    {
                    otherlv_2=(Token)match(input,Extends,FOLLOW_Extends_in_ruleCategory7587); 

                        	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3233:1: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3234:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3234:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3235:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCategoryAccess().getExtendsCategoryCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleCategory7609);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleCategory7624); 

                	newLeafNode(otherlv_4, grammarAccess.getCategoryAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategory"


    // $ANTLR start "entryRuleValueString"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3261:1: entryRuleValueString returns [String current=null] : iv_ruleValueString= ruleValueString EOF ;
    public final String entryRuleValueString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueString = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3262:1: (iv_ruleValueString= ruleValueString EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3263:2: iv_ruleValueString= ruleValueString EOF
            {
             newCompositeNode(grammarAccess.getValueStringRule()); 
            pushFollow(FOLLOW_ruleValueString_in_entryRuleValueString7659);
            iv_ruleValueString=ruleValueString();

            state._fsp--;

             current =iv_ruleValueString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueString7670); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValueString"


    // $ANTLR start "ruleValueString"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3270:1: ruleValueString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleValueString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3274:6: (this_STRING_0= RULE_STRING )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3275:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueString7709); 

            		current.merge(this_STRING_0);
                
             
                newLeafNode(this_STRING_0, grammarAccess.getValueStringAccess().getSTRINGTerminalRuleCall()); 
                

            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleValueString"


    // $ANTLR start "entryRuleStakeholder"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3290:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3291:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3292:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder7752);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder7762); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStakeholder"


    // $ANTLR start "ruleStakeholder"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3299:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_role_8_0 = null;

        AntlrDatatypeRuleToken lv_organziation_10_0 = null;

        AntlrDatatypeRuleToken lv_email_12_0 = null;

        AntlrDatatypeRuleToken lv_phone_14_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3302:28: ( (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3303:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3303:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3304:2: otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End
            {
            otherlv_0=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleStakeholder7800); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3308:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3309:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3309:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3310:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder7816); 

            			newLeafNode(lv_name_1_0, grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getStakeholderRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3326:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3328:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3328:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3329:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3332:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?)
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3333:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3333:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+
            int cnt51=0;
            loop51:
            do {
                int alt51=7;
                int LA51_0 = input.LA(1);

                if ( LA51_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0) ) {
                    alt51=1;
                }
                else if ( LA51_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1) ) {
                    alt51=2;
                }
                else if ( LA51_0 ==Role && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2) ) {
                    alt51=3;
                }
                else if ( LA51_0 ==Oranization && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
                    alt51=4;
                }
                else if ( LA51_0 ==Email && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
                    alt51=5;
                }
                else if ( LA51_0 ==Phone && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5) ) {
                    alt51=6;
                }


                switch (alt51) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3335:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3335:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3336:5: {...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3336:108: ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3337:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3340:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3340:7: {...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3340:16: (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3341:2: otherlv_3= Title ( (lv_title_4_0= ruleValueString ) )
            	    {
            	    otherlv_3=(Token)match(input,Title,FOLLOW_Title_in_ruleStakeholder7880); 

            	        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3345:1: ( (lv_title_4_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3346:1: (lv_title_4_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3346:1: (lv_title_4_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3347:3: lv_title_4_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getTitleValueStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder7900);
            	    lv_title_4_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"title",
            	            		lv_title_4_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3370:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3370:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3371:5: {...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3371:108: ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3372:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3375:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3375:7: {...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3375:16: (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3376:2: otherlv_5= Description ( (lv_description_6_0= ruleValueString ) )
            	    {
            	    otherlv_5=(Token)match(input,Description,FOLLOW_Description_in_ruleStakeholder7969); 

            	        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3380:1: ( (lv_description_6_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3381:1: (lv_description_6_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3381:1: (lv_description_6_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3382:3: lv_description_6_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getDescriptionValueStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder7989);
            	    lv_description_6_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"description",
            	            		lv_description_6_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3405:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3405:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3406:5: {...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3406:108: ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3407:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3410:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3410:7: {...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3410:16: (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3411:2: otherlv_7= Role ( (lv_role_8_0= ruleValueString ) )
            	    {
            	    otherlv_7=(Token)match(input,Role,FOLLOW_Role_in_ruleStakeholder8058); 

            	        	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getRoleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3415:1: ( (lv_role_8_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3416:1: (lv_role_8_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3416:1: (lv_role_8_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3417:3: lv_role_8_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getRoleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8078);
            	    lv_role_8_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"role",
            	            		lv_role_8_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3440:4: ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3440:4: ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3441:5: {...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3441:108: ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3442:6: ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3445:6: ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3445:7: {...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3445:16: (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3446:2: otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Oranization,FOLLOW_Oranization_in_ruleStakeholder8147); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getOranizationKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3450:1: ( (lv_organziation_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3451:1: (lv_organziation_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3451:1: (lv_organziation_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3452:3: lv_organziation_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getOrganziationValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8167);
            	    lv_organziation_10_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"organziation",
            	            		lv_organziation_10_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3475:4: ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3475:4: ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3476:5: {...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3476:108: ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3477:6: ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3480:6: ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3480:7: {...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3480:16: (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3481:2: otherlv_11= Email ( (lv_email_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Email,FOLLOW_Email_in_ruleStakeholder8236); 

            	        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getEmailKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3485:1: ( (lv_email_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3486:1: (lv_email_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3486:1: (lv_email_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3487:3: lv_email_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getEmailValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8256);
            	    lv_email_12_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"email",
            	            		lv_email_12_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3510:4: ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3510:4: ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3511:5: {...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3511:108: ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3512:6: ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3515:6: ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3515:7: {...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3515:16: (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3516:2: otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Phone,FOLLOW_Phone_in_ruleStakeholder8325); 

            	        	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getPhoneKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3520:1: ( (lv_phone_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3521:1: (lv_phone_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3521:1: (lv_phone_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3522:3: lv_phone_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getPhoneValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8345);
            	    lv_phone_14_0=ruleValueString();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"phone",
            	            		lv_phone_14_0, 
            	            		"ValueString");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt51 >= 1 ) break loop51;
                        EarlyExitException eee =
                            new EarlyExitException(51, input);
                        throw eee;
                }
                cnt51++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleStakeholder8405); 

                	newLeafNode(otherlv_15, grammarAccess.getStakeholderAccess().getEndKeyword_3());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStakeholder"


    // $ANTLR start "entryRuleVerificationDecomposition"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3566:1: entryRuleVerificationDecomposition returns [EObject current=null] : iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF ;
    public final EObject entryRuleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationDecomposition = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3567:2: (iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3568:2: iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF
            {
             newCompositeNode(grammarAccess.getVerificationDecompositionRule()); 
            pushFollow(FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition8439);
            iv_ruleVerificationDecomposition=ruleVerificationDecomposition();

            state._fsp--;

             current =iv_ruleVerificationDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationDecomposition8449); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationDecomposition"


    // $ANTLR start "ruleVerificationDecomposition"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3575:1: ruleVerificationDecomposition returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) ;
    public final EObject ruleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3578:28: ( ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3579:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3579:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            int alt53=2;
            alt53 = dfa53.predict(input);
            switch (alt53) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3579:2: ( ( ruleDOTTEDREF ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3579:2: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3580:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3580:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3581:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getElementVerificationActivityCrossReference_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8497);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3595:6: ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3595:6: ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3595:7: ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3595:7: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3596:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3596:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3597:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getLeftVerificationActivityCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8527);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3610:2: ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3611:1: ( (lv_type_2_1= And | lv_type_2_2= Or ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3611:1: ( (lv_type_2_1= And | lv_type_2_2= Or ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3612:1: (lv_type_2_1= And | lv_type_2_2= Or )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3612:1: (lv_type_2_1= And | lv_type_2_2= Or )
                    int alt52=2;
                    int LA52_0 = input.LA(1);

                    if ( (LA52_0==And) ) {
                        alt52=1;
                    }
                    else if ( (LA52_0==Or) ) {
                        alt52=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 52, 0, input);

                        throw nvae;
                    }
                    switch (alt52) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3613:3: lv_type_2_1= And
                            {
                            lv_type_2_1=(Token)match(input,And,FOLLOW_And_in_ruleVerificationDecomposition8548); 

                                    newLeafNode(lv_type_2_1, grammarAccess.getVerificationDecompositionAccess().getTypeAndKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3626:8: lv_type_2_2= Or
                            {
                            lv_type_2_2=(Token)match(input,Or,FOLLOW_Or_in_ruleVerificationDecomposition8576); 

                                    newLeafNode(lv_type_2_2, grammarAccess.getVerificationDecompositionAccess().getTypeOrKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3642:2: ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3643:1: (lv_right_3_0= ruleVerificationDecomposition )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3643:1: (lv_right_3_0= ruleVerificationDecomposition )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3644:3: lv_right_3_0= ruleVerificationDecomposition
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getRightVerificationDecompositionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition8611);
                    lv_right_3_0=ruleVerificationDecomposition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationDecompositionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"VerificationDecomposition");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationDecomposition"


    // $ANTLR start "entryRuleVerificationActivity"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3668:1: entryRuleVerificationActivity returns [EObject current=null] : iv_ruleVerificationActivity= ruleVerificationActivity EOF ;
    public final EObject entryRuleVerificationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationActivity = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3669:2: (iv_ruleVerificationActivity= ruleVerificationActivity EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3670:2: iv_ruleVerificationActivity= ruleVerificationActivity EOF
            {
             newCompositeNode(grammarAccess.getVerificationActivityRule()); 
            pushFollow(FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity8647);
            iv_ruleVerificationActivity=ruleVerificationActivity();

            state._fsp--;

             current =iv_ruleVerificationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationActivity8657); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationActivity"


    // $ANTLR start "ruleVerificationActivity"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3677:1: ruleVerificationActivity returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End ) ;
    public final EObject ruleVerificationActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_method_8_0 = null;

        EObject lv_decomposedTo_11_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3680:28: ( (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3681:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3681:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3682:2: otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationActivity8695); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationActivityAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,Activity,FOLLOW_Activity_in_ruleVerificationActivity8707); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationActivityAccess().getActivityKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3691:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3692:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3692:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3693:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity8723); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVerificationActivityAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVerificationActivityRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3709:2: (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Title) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3710:2: otherlv_3= Title ( (lv_title_4_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,Title,FOLLOW_Title_in_ruleVerificationActivity8742); 

                        	newLeafNode(otherlv_3, grammarAccess.getVerificationActivityAccess().getTitleKeyword_3_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3714:1: ( (lv_title_4_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3715:1: (lv_title_4_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3715:1: (lv_title_4_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3716:3: lv_title_4_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getTitleValueStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity8762);
                    lv_title_4_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_4_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3732:4: (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Description) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3733:2: otherlv_5= Description ( (lv_description_6_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,Description,FOLLOW_Description_in_ruleVerificationActivity8778); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationActivityAccess().getDescriptionKeyword_4_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3737:1: ( (lv_description_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3738:1: (lv_description_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3738:1: (lv_description_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3739:3: lv_description_6_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDescriptionValueStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity8798);
                    lv_description_6_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_6_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3755:4: (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )?
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==Method) ) {
                alt56=1;
            }
            switch (alt56) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3756:2: otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) )
                    {
                    otherlv_7=(Token)match(input,Method,FOLLOW_Method_in_ruleVerificationActivity8814); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationActivityAccess().getMethodKeyword_5_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:1: ( (lv_method_8_0= ruleVerificationMethod ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3761:1: (lv_method_8_0= ruleVerificationMethod )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3761:1: (lv_method_8_0= ruleVerificationMethod )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3762:3: lv_method_8_0= ruleVerificationMethod
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getMethodVerificationMethodParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity8834);
                    lv_method_8_0=ruleVerificationMethod();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"method",
                            		lv_method_8_0, 
                            		"VerificationMethod");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3778:4: (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Decomposed) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3779:2: otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )*
                    {
                    otherlv_9=(Token)match(input,Decomposed,FOLLOW_Decomposed_in_ruleVerificationActivity8850); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationActivityAccess().getDecomposedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,To,FOLLOW_To_in_ruleVerificationActivity8862); 

                        	newLeafNode(otherlv_10, grammarAccess.getVerificationActivityAccess().getToKeyword_6_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3788:1: ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )*
                    loop57:
                    do {
                        int alt57=2;
                        int LA57_0 = input.LA(1);

                        if ( (LA57_0==RULE_ID) ) {
                            alt57=1;
                        }


                        switch (alt57) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3789:1: (lv_decomposedTo_11_0= ruleVerificationDecomposition )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3789:1: (lv_decomposedTo_11_0= ruleVerificationDecomposition )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3790:3: lv_decomposedTo_11_0= ruleVerificationDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDecomposedToVerificationDecompositionParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleVerificationActivity8882);
                    	    lv_decomposedTo_11_0=ruleVerificationDecomposition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decomposedTo",
                    	            		lv_decomposedTo_11_0, 
                    	            		"VerificationDecomposition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop57;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3806:5: (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Assigned) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3807:2: otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )*
                    {
                    otherlv_12=(Token)match(input,Assigned,FOLLOW_Assigned_in_ruleVerificationActivity8899); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerificationActivityAccess().getAssignedKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,To,FOLLOW_To_in_ruleVerificationActivity8911); 

                        	newLeafNode(otherlv_13, grammarAccess.getVerificationActivityAccess().getToKeyword_7_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3816:1: ( ( ruleDOTTEDREF ) )*
                    loop59:
                    do {
                        int alt59=2;
                        int LA59_0 = input.LA(1);

                        if ( (LA59_0==RULE_ID) ) {
                            alt59=1;
                        }


                        switch (alt59) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3817:1: ( ruleDOTTEDREF )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3817:1: ( ruleDOTTEDREF )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3818:3: ruleDOTTEDREF
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getVerificationActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getAssignedToStakeholderCrossReference_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity8933);
                    	    ruleDOTTEDREF();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop59;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleVerificationActivity8949); 

                	newLeafNode(otherlv_15, grammarAccess.getVerificationActivityAccess().getEndKeyword_8());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationActivity"


    // $ANTLR start "entryRuleVerificationMethod"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3844:1: entryRuleVerificationMethod returns [String current=null] : iv_ruleVerificationMethod= ruleVerificationMethod EOF ;
    public final String entryRuleVerificationMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationMethod = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3845:1: (iv_ruleVerificationMethod= ruleVerificationMethod EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3846:2: iv_ruleVerificationMethod= ruleVerificationMethod EOF
            {
             newCompositeNode(grammarAccess.getVerificationMethodRule()); 
            pushFollow(FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod8984);
            iv_ruleVerificationMethod=ruleVerificationMethod();

            state._fsp--;

             current =iv_ruleVerificationMethod.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationMethod8995); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationMethod"


    // $ANTLR start "ruleVerificationMethod"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3853:1: ruleVerificationMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification ) ;
    public final AntlrDatatypeRuleToken ruleVerificationMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3857:6: ( (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3858:1: (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3858:1: (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification )
            int alt61=6;
            switch ( input.LA(1) ) {
            case Manual:
                {
                alt61=1;
                }
                break;
            case Automatic:
                {
                alt61=2;
                }
                break;
            case Review:
                {
                alt61=3;
                }
                break;
            case Testing:
                {
                alt61=4;
                }
                break;
            case Analysis:
                {
                alt61=5;
                }
                break;
            case Verification:
                {
                alt61=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 61, 0, input);

                throw nvae;
            }

            switch (alt61) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3859:2: kw= Manual
                    {
                    kw=(Token)match(input,Manual,FOLLOW_Manual_in_ruleVerificationMethod9033); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getManualKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3866:2: kw= Automatic
                    {
                    kw=(Token)match(input,Automatic,FOLLOW_Automatic_in_ruleVerificationMethod9052); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getAutomaticKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3873:2: kw= Review
                    {
                    kw=(Token)match(input,Review,FOLLOW_Review_in_ruleVerificationMethod9071); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getReviewKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3880:2: kw= Testing
                    {
                    kw=(Token)match(input,Testing,FOLLOW_Testing_in_ruleVerificationMethod9090); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getTestingKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3887:2: kw= Analysis
                    {
                    kw=(Token)match(input,Analysis,FOLLOW_Analysis_in_ruleVerificationMethod9109); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getAnalysisKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3894:2: kw= Verification
                    {
                    kw=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationMethod9128); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getVerificationKeyword_5()); 
                        

                    }
                    break;

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationMethod"


    // $ANTLR start "entryRuleVerificationResult"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3907:1: entryRuleVerificationResult returns [EObject current=null] : iv_ruleVerificationResult= ruleVerificationResult EOF ;
    public final EObject entryRuleVerificationResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationResult = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3908:2: (iv_ruleVerificationResult= ruleVerificationResult EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3909:2: iv_ruleVerificationResult= ruleVerificationResult EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultRule()); 
            pushFollow(FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult9167);
            iv_ruleVerificationResult=ruleVerificationResult();

            state._fsp--;

             current =iv_ruleVerificationResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResult9177); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVerificationResult"


    // $ANTLR start "ruleVerificationResult"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:1: ruleVerificationResult returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End ) ;
    public final EObject ruleVerificationResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_title_6_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_method_10_0 = null;

        Enumerator lv_state_12_0 = null;

        Enumerator lv_status_14_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3919:28: ( (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3920:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3920:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3921:2: otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationResult9215); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationResultAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,Result,FOLLOW_Result_in_ruleVerificationResult9227); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationResultAccess().getResultKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3930:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3931:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3931:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3932:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult9243); 

            			newLeafNode(lv_name_2_0, grammarAccess.getVerificationResultAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getVerificationResultRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_ruleVerificationResult9261); 

                	newLeafNode(otherlv_3, grammarAccess.getVerificationResultAccess().getOfKeyword_3());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3953:1: ( (otherlv_4= RULE_ID ) )*
            loop62:
            do {
                int alt62=2;
                int LA62_0 = input.LA(1);

                if ( (LA62_0==RULE_ID) ) {
                    alt62=1;
                }


                switch (alt62) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3954:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3954:1: (otherlv_4= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3955:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVerificationResultRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult9280); 

            	    		newLeafNode(otherlv_4, grammarAccess.getVerificationResultAccess().getReferencedVerificationMethodVerificationActivityCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3966:3: (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Output) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3967:2: otherlv_5= Output ( (lv_title_6_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,Output,FOLLOW_Output_in_ruleVerificationResult9295); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationResultAccess().getOutputKeyword_5_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3971:1: ( (lv_title_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3972:1: (lv_title_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3972:1: (lv_title_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3973:3: lv_title_6_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getTitleValueStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9315);
                    lv_title_6_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"title",
                            		lv_title_6_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3989:4: (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Logfile) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3990:2: otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) )
                    {
                    otherlv_7=(Token)match(input,Logfile,FOLLOW_Logfile_in_ruleVerificationResult9331); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationResultAccess().getLogfileKeyword_6_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3994:1: ( (lv_description_8_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3995:1: (lv_description_8_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3995:1: (lv_description_8_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3996:3: lv_description_8_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getDescriptionValueStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9351);
                    lv_description_8_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"description",
                            		lv_description_8_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4012:4: (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Date) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4013:2: otherlv_9= Date ( (lv_method_10_0= ruleValueString ) )
                    {
                    otherlv_9=(Token)match(input,Date,FOLLOW_Date_in_ruleVerificationResult9367); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationResultAccess().getDateKeyword_7_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4017:1: ( (lv_method_10_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4018:1: (lv_method_10_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4018:1: (lv_method_10_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4019:3: lv_method_10_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getMethodValueStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9387);
                    lv_method_10_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"method",
                            		lv_method_10_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4035:4: (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )?
            int alt66=2;
            int LA66_0 = input.LA(1);

            if ( (LA66_0==State) ) {
                alt66=1;
            }
            switch (alt66) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4036:2: otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) )
                    {
                    otherlv_11=(Token)match(input,State,FOLLOW_State_in_ruleVerificationResult9403); 

                        	newLeafNode(otherlv_11, grammarAccess.getVerificationResultAccess().getStateKeyword_8_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4040:1: ( (lv_state_12_0= ruleVerificationResultState ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4041:1: (lv_state_12_0= ruleVerificationResultState )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4041:1: (lv_state_12_0= ruleVerificationResultState )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4042:3: lv_state_12_0= ruleVerificationResultState
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStateVerificationResultStateEnumRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultState_in_ruleVerificationResult9423);
                    lv_state_12_0=ruleVerificationResultState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"state",
                            		lv_state_12_0, 
                            		"VerificationResultState");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4058:4: (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Status) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4059:2: otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) )
                    {
                    otherlv_13=(Token)match(input,Status,FOLLOW_Status_in_ruleVerificationResult9439); 

                        	newLeafNode(otherlv_13, grammarAccess.getVerificationResultAccess().getStatusKeyword_9_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4063:1: ( (lv_status_14_0= ruleVerificationResultStatus ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4064:1: (lv_status_14_0= ruleVerificationResultStatus )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4064:1: (lv_status_14_0= ruleVerificationResultStatus )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4065:3: lv_status_14_0= ruleVerificationResultStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStatusVerificationResultStatusEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult9459);
                    lv_status_14_0=ruleVerificationResultStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"status",
                            		lv_status_14_0, 
                            		"VerificationResultStatus");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleVerificationResult9474); 

                	newLeafNode(otherlv_15, grammarAccess.getVerificationResultAccess().getEndKeyword_10());
                

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationResult"


    // $ANTLR start "entryRuleQPREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4094:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4095:1: (iv_ruleQPREF= ruleQPREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4096:2: iv_ruleQPREF= ruleQPREF EOF
            {
             newCompositeNode(grammarAccess.getQPREFRule()); 
            pushFollow(FOLLOW_ruleQPREF_in_entryRuleQPREF9509);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;

             current =iv_ruleQPREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQPREF9520); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQPREF"


    // $ANTLR start "ruleQPREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4103:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4107:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4108:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4108:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4108:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF9560); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4115:1: (kw= ColonColon this_ID_2= RULE_ID )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==ColonColon) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4116:2: kw= ColonColon this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQPREF9579); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF9594); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQNEREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4136:1: entryRuleQNEREF returns [String current=null] : iv_ruleQNEREF= ruleQNEREF EOF ;
    public final String entryRuleQNEREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNEREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4137:1: (iv_ruleQNEREF= ruleQNEREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4138:2: iv_ruleQNEREF= ruleQNEREF EOF
            {
             newCompositeNode(grammarAccess.getQNEREFRule()); 
            pushFollow(FOLLOW_ruleQNEREF_in_entryRuleQNEREF9641);
            iv_ruleQNEREF=ruleQNEREF();

            state._fsp--;

             current =iv_ruleQNEREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNEREF9652); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleQNEREF"


    // $ANTLR start "ruleQNEREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4145:1: ruleQNEREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQNEREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4149:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4150:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4150:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4150:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4150:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==RULE_ID) ) {
                    int LA69_1 = input.LA(2);

                    if ( (LA69_1==ColonColon) ) {
                        alt69=1;
                    }


                }


                switch (alt69) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4150:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF9693); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQNEREF9711); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNEREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF9728); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4170:1: (kw= FullStop this_ID_4= RULE_ID )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==FullStop) ) {
                    alt70=1;
                }


                switch (alt70) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4171:2: kw= FullStop this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQNEREF9747); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNEREFAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF9762); 

            	    		current.merge(this_ID_4);
            	        
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleQNEREF"


    // $ANTLR start "entryRuleDOTTEDREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4193:1: entryRuleDOTTEDREF returns [String current=null] : iv_ruleDOTTEDREF= ruleDOTTEDREF EOF ;
    public final String entryRuleDOTTEDREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOTTEDREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4194:1: (iv_ruleDOTTEDREF= ruleDOTTEDREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4195:2: iv_ruleDOTTEDREF= ruleDOTTEDREF EOF
            {
             newCompositeNode(grammarAccess.getDOTTEDREFRule()); 
            pushFollow(FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF9811);
            iv_ruleDOTTEDREF=ruleDOTTEDREF();

            state._fsp--;

             current =iv_ruleDOTTEDREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOTTEDREF9822); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOTTEDREF"


    // $ANTLR start "ruleDOTTEDREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4202:1: ruleDOTTEDREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOTTEDREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4206:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4207:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4207:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4207:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF9862); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4214:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==FullStop) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4215:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOTTEDREF9881); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOTTEDREFAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF9896); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOTTEDREF"


    // $ANTLR start "entryRulePAREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4235:1: entryRulePAREF returns [String current=null] : iv_rulePAREF= rulePAREF EOF ;
    public final String entryRulePAREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePAREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4236:1: (iv_rulePAREF= rulePAREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4237:2: iv_rulePAREF= rulePAREF EOF
            {
             newCompositeNode(grammarAccess.getPAREFRule()); 
            pushFollow(FOLLOW_rulePAREF_in_entryRulePAREF9943);
            iv_rulePAREF=rulePAREF();

            state._fsp--;

             current =iv_rulePAREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePAREF9954); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePAREF"


    // $ANTLR start "rulePAREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4244:1: rulePAREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken rulePAREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4248:6: ( (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4249:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4249:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4250:2: kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )?
            {
            kw=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_rulePAREF9992); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPAREFAccess().getNumberSignKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF10007); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getPAREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4262:1: (kw= ColonColon this_ID_3= RULE_ID )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==ColonColon) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4263:2: kw= ColonColon this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_rulePAREF10026); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPAREFAccess().getColonColonKeyword_2_0()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF10041); 

                    		current.merge(this_ID_3);
                        
                     
                        newLeafNode(this_ID_3, grammarAccess.getPAREFAccess().getIDTerminalRuleCall_2_1()); 
                        

                    }
                    break;

            }


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePAREF"


    // $ANTLR start "entryRuleDOCPATH"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4283:1: entryRuleDOCPATH returns [String current=null] : iv_ruleDOCPATH= ruleDOCPATH EOF ;
    public final String entryRuleDOCPATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCPATH = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4284:1: (iv_ruleDOCPATH= ruleDOCPATH EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4285:2: iv_ruleDOCPATH= ruleDOCPATH EOF
            {
             newCompositeNode(grammarAccess.getDOCPATHRule()); 
            pushFollow(FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH10088);
            iv_ruleDOCPATH=ruleDOCPATH();

            state._fsp--;

             current =iv_ruleDOCPATH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCPATH10099); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOCPATH"


    // $ANTLR start "ruleDOCPATH"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4292:1: ruleDOCPATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDOCPATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4296:6: ( ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4297:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4297:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4297:2: (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4297:2: (this_ID_0= RULE_ID kw= Solidus )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    int LA73_1 = input.LA(2);

                    if ( (LA73_1==Solidus) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4297:7: this_ID_0= RULE_ID kw= Solidus
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10140); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleDOCPATH10158); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOCPATHAccess().getSolidusKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10175); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCPATH10193); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOCPATHAccess().getFullStopKeyword_2()); 
                
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10208); 

            		current.merge(this_ID_4);
                
             
                newLeafNode(this_ID_4, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_3()); 
                

            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOCPATH"


    // $ANTLR start "entryRuleDOCFRAGMENT"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4338:1: entryRuleDOCFRAGMENT returns [String current=null] : iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF ;
    public final String entryRuleDOCFRAGMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCFRAGMENT = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4339:1: (iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4340:2: iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF
            {
             newCompositeNode(grammarAccess.getDOCFRAGMENTRule()); 
            pushFollow(FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT10253);
            iv_ruleDOCFRAGMENT=ruleDOCFRAGMENT();

            state._fsp--;

             current =iv_ruleDOCFRAGMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCFRAGMENT10264); 

            }

        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDOCFRAGMENT"


    // $ANTLR start "ruleDOCFRAGMENT"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4347:1: ruleDOCFRAGMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOCFRAGMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4351:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4352:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4352:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4352:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10304); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4359:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==FullStop) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4360:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCFRAGMENT10323); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOCFRAGMENTAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10338); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

             leaveRule();
                
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleDOCFRAGMENT"


    // $ANTLR start "ruleVerificationResultState"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4380:1: ruleVerificationResultState returns [Enumerator current=null] : ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) ;
    public final Enumerator ruleVerificationResultState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4382:28: ( ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4383:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4383:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            int alt75=3;
            switch ( input.LA(1) ) {
            case Scheduled:
                {
                alt75=1;
                }
                break;
            case Completed:
                {
                alt75=2;
                }
                break;
            case Inprogress:
                {
                alt75=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 75, 0, input);

                throw nvae;
            }

            switch (alt75) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4383:2: (enumLiteral_0= Scheduled )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4383:2: (enumLiteral_0= Scheduled )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4383:7: enumLiteral_0= Scheduled
                    {
                    enumLiteral_0=(Token)match(input,Scheduled,FOLLOW_Scheduled_in_ruleVerificationResultState10402); 

                            current = grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4389:6: (enumLiteral_1= Completed )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4389:6: (enumLiteral_1= Completed )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4389:11: enumLiteral_1= Completed
                    {
                    enumLiteral_1=(Token)match(input,Completed,FOLLOW_Completed_in_ruleVerificationResultState10424); 

                            current = grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4395:6: (enumLiteral_2= Inprogress )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4395:6: (enumLiteral_2= Inprogress )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4395:11: enumLiteral_2= Inprogress
                    {
                    enumLiteral_2=(Token)match(input,Inprogress,FOLLOW_Inprogress_in_ruleVerificationResultState10446); 

                            current = grammarAccess.getVerificationResultStateAccess().getINPROGRESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVerificationResultStateAccess().getINPROGRESSEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationResultState"


    // $ANTLR start "ruleVerificationResultStatus"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4405:1: ruleVerificationResultStatus returns [Enumerator current=null] : ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) ) ;
    public final Enumerator ruleVerificationResultStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4407:28: ( ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4408:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4408:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) )
            int alt76=3;
            switch ( input.LA(1) ) {
            case Pass:
                {
                alt76=1;
                }
                break;
            case Fail:
                {
                alt76=2;
                }
                break;
            case Unknown:
                {
                alt76=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }

            switch (alt76) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4408:2: (enumLiteral_0= Pass )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4408:2: (enumLiteral_0= Pass )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4408:7: enumLiteral_0= Pass
                    {
                    enumLiteral_0=(Token)match(input,Pass,FOLLOW_Pass_in_ruleVerificationResultStatus10496); 

                            current = grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4414:6: (enumLiteral_1= Fail )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4414:6: (enumLiteral_1= Fail )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4414:11: enumLiteral_1= Fail
                    {
                    enumLiteral_1=(Token)match(input,Fail,FOLLOW_Fail_in_ruleVerificationResultStatus10518); 

                            current = grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4420:6: (enumLiteral_2= Unknown )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4420:6: (enumLiteral_2= Unknown )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4420:11: enumLiteral_2= Unknown
                    {
                    enumLiteral_2=(Token)match(input,Unknown,FOLLOW_Unknown_in_ruleVerificationResultStatus10540); 

                            current = grammarAccess.getVerificationResultStatusAccess().getUNKNOWNEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getVerificationResultStatusAccess().getUNKNOWNEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
        	catch (RecognitionException re) { 
        	    recover(input,re); 
        	    appendSkippedTokens();
        	}
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVerificationResultStatus"

    // Delegated rules


    protected DFA25 dfa25 = new DFA25(this);
    protected DFA36 dfa36 = new DFA36(this);
    protected DFA48 dfa48 = new DFA48(this);
    protected DFA53 dfa53 = new DFA53(this);
    static final String DFA25_eotS =
        "\23\uffff";
    static final String DFA25_eofS =
        "\23\uffff";
    static final String DFA25_minS =
        "\1\6\16\uffff\1\11\3\uffff";
    static final String DFA25_maxS =
        "\1\71\16\uffff\1\52\3\uffff";
    static final String DFA25_acceptS =
        "\1\uffff\1\21\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\uffff\1\16\1\20\1\17";
    static final String DFA25_specialS =
        "\1\1\16\uffff\1\0\3\uffff}>";
    static final String[] DFA25_transitionS = {
            "\1\5\2\uffff\1\16\1\uffff\1\13\1\uffff\1\6\2\uffff\1\15\1\7"+
            "\4\uffff\1\3\2\uffff\1\14\4\uffff\1\12\1\11\3\uffff\1\10\12"+
            "\uffff\1\4\7\uffff\1\1\1\2\1\uffff\1\17",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\20\15\uffff\1\21\22\uffff\1\22",
            "",
            "",
            ""
    };

    static final short[] DFA25_eot = DFA.unpackEncodedString(DFA25_eotS);
    static final short[] DFA25_eof = DFA.unpackEncodedString(DFA25_eofS);
    static final char[] DFA25_min = DFA.unpackEncodedStringToUnsignedChars(DFA25_minS);
    static final char[] DFA25_max = DFA.unpackEncodedStringToUnsignedChars(DFA25_maxS);
    static final short[] DFA25_accept = DFA.unpackEncodedString(DFA25_acceptS);
    static final short[] DFA25_special = DFA.unpackEncodedString(DFA25_specialS);
    static final short[][] DFA25_transition;

    static {
        int numStates = DFA25_transitionS.length;
        DFA25_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA25_transition[i] = DFA.unpackEncodedString(DFA25_transitionS[i]);
        }
    }

    class DFA25 extends DFA {

        public DFA25(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 25;
            this.eot = DFA25_eot;
            this.eof = DFA25_eof;
            this.min = DFA25_min;
            this.max = DFA25_max;
            this.accept = DFA25_accept;
            this.special = DFA25_special;
            this.transition = DFA25_transition;
        }
        public String getDescription() {
            return "()* loopback of 618:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA25_15 = input.LA(1);

                         
                        int index25_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA25_15 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) {s = 16;}

                        else if ( LA25_15 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA25_15 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) ) {s = 18;}

                         
                        input.seek(index25_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA25_0 = input.LA(1);

                         
                        int index25_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA25_0==End) ) {s = 1;}

                        else if ( LA25_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA25_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA25_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA25_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA25_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA25_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA25_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA25_0 ==Section && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA25_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA25_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA25_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA25_0 ==Conflicts && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA25_0 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA25_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) ) {s = 15;}

                         
                        input.seek(index25_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 25, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA36_eotS =
        "\22\uffff";
    static final String DFA36_eofS =
        "\22\uffff";
    static final String DFA36_minS =
        "\1\6\15\uffff\1\11\3\uffff";
    static final String DFA36_maxS =
        "\1\71\15\uffff\1\52\3\uffff";
    static final String DFA36_acceptS =
        "\1\uffff\1\20\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\uffff\1\17\1\16\1\15";
    static final String DFA36_specialS =
        "\1\1\15\uffff\1\0\3\uffff}>";
    static final String[] DFA36_transitionS = {
            "\1\5\2\uffff\1\15\1\uffff\1\12\1\uffff\1\6\2\uffff\1\14\1\7"+
            "\4\uffff\1\3\2\uffff\1\13\4\uffff\1\11\4\uffff\1\10\12\uffff"+
            "\1\4\7\uffff\1\1\1\2\1\uffff\1\16",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\21\15\uffff\1\17\22\uffff\1\20",
            "",
            "",
            ""
    };

    static final short[] DFA36_eot = DFA.unpackEncodedString(DFA36_eotS);
    static final short[] DFA36_eof = DFA.unpackEncodedString(DFA36_eofS);
    static final char[] DFA36_min = DFA.unpackEncodedStringToUnsignedChars(DFA36_minS);
    static final char[] DFA36_max = DFA.unpackEncodedStringToUnsignedChars(DFA36_maxS);
    static final short[] DFA36_accept = DFA.unpackEncodedString(DFA36_acceptS);
    static final short[] DFA36_special = DFA.unpackEncodedString(DFA36_specialS);
    static final short[][] DFA36_transition;

    static {
        int numStates = DFA36_transitionS.length;
        DFA36_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA36_transition[i] = DFA.unpackEncodedString(DFA36_transitionS[i]);
        }
    }

    class DFA36 extends DFA {

        public DFA36(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 36;
            this.eot = DFA36_eot;
            this.eof = DFA36_eof;
            this.min = DFA36_min;
            this.max = DFA36_max;
            this.accept = DFA36_accept;
            this.special = DFA36_special;
            this.transition = DFA36_transition;
        }
        public String getDescription() {
            return "()* loopback of 1464:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA36_14 = input.LA(1);

                         
                        int index36_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA36_14 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {s = 15;}

                        else if ( LA36_14 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {s = 16;}

                        else if ( LA36_14 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {s = 17;}

                         
                        input.seek(index36_14);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA36_0 = input.LA(1);

                         
                        int index36_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA36_0==End) ) {s = 1;}

                        else if ( LA36_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA36_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA36_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA36_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA36_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA36_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA36_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA36_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA36_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA36_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA36_0 ==Conflicts && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA36_0 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA36_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) ) {s = 14;}

                         
                        input.seek(index36_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 36, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA48_eotS =
        "\23\uffff";
    static final String DFA48_eofS =
        "\23\uffff";
    static final String DFA48_minS =
        "\1\6\10\uffff\1\11\11\uffff";
    static final String DFA48_maxS =
        "\1\71\10\uffff\1\61\11\uffff";
    static final String DFA48_acceptS =
        "\1\uffff\1\21\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14"+
        "\1\17\1\11\1\20\1\10\1\16\1\15";
    static final String DFA48_specialS =
        "\1\1\10\uffff\1\0\11\uffff}>";
    static final String[] DFA48_transitionS = {
            "\1\5\4\uffff\1\13\1\uffff\1\6\3\uffff\1\7\4\uffff\1\3\1\uffff"+
            "\1\15\1\14\4\uffff\1\12\4\uffff\1\10\12\uffff\1\4\7\uffff\1"+
            "\1\1\2\1\uffff\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\15\uffff\1\17\12\uffff\1\16\7\uffff\1\21\6\uffff\1\20",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA48_eot = DFA.unpackEncodedString(DFA48_eotS);
    static final short[] DFA48_eof = DFA.unpackEncodedString(DFA48_eofS);
    static final char[] DFA48_min = DFA.unpackEncodedStringToUnsignedChars(DFA48_minS);
    static final char[] DFA48_max = DFA.unpackEncodedStringToUnsignedChars(DFA48_maxS);
    static final short[] DFA48_accept = DFA.unpackEncodedString(DFA48_acceptS);
    static final short[] DFA48_special = DFA.unpackEncodedString(DFA48_specialS);
    static final short[][] DFA48_transition;

    static {
        int numStates = DFA48_transitionS.length;
        DFA48_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA48_transition[i] = DFA.unpackEncodedString(DFA48_transitionS[i]);
        }
    }

    class DFA48 extends DFA {

        public DFA48(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 48;
            this.eot = DFA48_eot;
            this.eof = DFA48_eof;
            this.min = DFA48_min;
            this.max = DFA48_max;
            this.accept = DFA48_accept;
            this.special = DFA48_special;
            this.transition = DFA48_transition;
        }
        public String getDescription() {
            return "()* loopback of 2258:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA48_9 = input.LA(1);

                         
                        int index48_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA48_9 ==Hazard && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {s = 14;}

                        else if ( LA48_9 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {s = 15;}

                        else if ( LA48_9 ==Goal && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {s = 16;}

                        else if ( LA48_9 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {s = 17;}

                        else if ( LA48_9 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {s = 18;}

                         
                        input.seek(index48_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA48_0 = input.LA(1);

                         
                        int index48_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA48_0==End) ) {s = 1;}

                        else if ( LA48_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA48_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA48_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA48_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA48_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA48_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA48_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA48_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) ) {s = 9;}

                        else if ( LA48_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {s = 10;}

                        else if ( LA48_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {s = 11;}

                        else if ( LA48_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {s = 12;}

                        else if ( LA48_0 ==Verified && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {s = 13;}

                         
                        input.seek(index48_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 48, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\6\uffff";
    static final String DFA53_eofS =
        "\1\uffff\1\4\3\uffff\1\4";
    static final String DFA53_minS =
        "\1\105\1\6\1\105\2\uffff\1\6";
    static final String DFA53_maxS =
        "\3\105\2\uffff\1\105";
    static final String DFA53_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA53_specialS =
        "\6\uffff}>";
    static final String[] DFA53_transitionS = {
            "\1\1",
            "\1\4\4\uffff\1\4\1\uffff\1\4\3\uffff\1\4\3\uffff\2\4\1\uffff"+
            "\2\4\4\uffff\1\4\4\uffff\1\4\12\uffff\1\4\6\uffff\1\3\2\4\1"+
            "\uffff\1\4\4\uffff\1\3\3\uffff\1\2\2\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\4\4\uffff\1\4\1\uffff\1\4\3\uffff\1\4\3\uffff\2\4\1\uffff"+
            "\2\4\4\uffff\1\4\4\uffff\1\4\12\uffff\1\4\6\uffff\1\3\2\4\1"+
            "\uffff\1\4\4\uffff\1\3\3\uffff\1\2\2\uffff\1\4"
    };

    static final short[] DFA53_eot = DFA.unpackEncodedString(DFA53_eotS);
    static final short[] DFA53_eof = DFA.unpackEncodedString(DFA53_eofS);
    static final char[] DFA53_min = DFA.unpackEncodedStringToUnsignedChars(DFA53_minS);
    static final char[] DFA53_max = DFA.unpackEncodedStringToUnsignedChars(DFA53_maxS);
    static final short[] DFA53_accept = DFA.unpackEncodedString(DFA53_acceptS);
    static final short[] DFA53_special = DFA.unpackEncodedString(DFA53_specialS);
    static final short[][] DFA53_transition;

    static {
        int numStates = DFA53_transitionS.length;
        DFA53_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA53_transition[i] = DFA.unpackEncodedString(DFA53_transitionS[i]);
        }
    }

    class DFA53 extends DFA {

        public DFA53(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 53;
            this.eot = DFA53_eot;
            this.eof = DFA53_eof;
            this.min = DFA53_min;
            this.max = DFA53_max;
            this.accept = DFA53_accept;
            this.special = DFA53_special;
            this.transition = DFA53_transition;
        }
        public String getDescription() {
            return "3579:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlisaModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_ruleAlisaModel124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_ruleAlisaModel151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_entryRuleRSALPackage187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSALPackage197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_ruleRSALPackage235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage251 = new BitSet(new long[]{0x1012000088C00320L});
    public static final BitSet FOLLOW_Imports_in_ruleRSALPackage270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage289 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage322 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_ruleRSALPackage340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage362 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage398 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALElement_in_ruleRSALPackage423 = new BitSet(new long[]{0x1052000888C00320L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALPackage438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALPackage458 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALPackage492 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRSALPackage509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALElement_in_entryRuleRSALElement543 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSALElement553 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractualElement_in_ruleRSALElement600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleRSALElement627 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleRSALElement654 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALSection_in_ruleRSALElement681 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleRSALElement708 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_ruleRSALElement735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_ruleRSALElement762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalDocument_in_ruleRSALElement789 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALSection_in_entryRuleRSALSection823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSALSection833 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Section_in_ruleRSALSection871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALSection887 = new BitSet(new long[]{0x1012000088C00320L});
    public static final BitSet FOLLOW_ruleRSALElement_in_ruleRSALSection913 = new BitSet(new long[]{0x1052000888C00320L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALSection928 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection948 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALSection962 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection982 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRSALSection999 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_entryRuleOrganization1033 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganization1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Organization_in_ruleOrganization1081 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrganization1097 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleOrganization1123 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_End_in_ruleOrganization1137 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractualElement_in_entryRuleContractualElement1173 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContractualElement1183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Cr_in_ruleContractualElement1221 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContractualElement1237 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_For_in_ruleContractualElement1301 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleContractualElement1323 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Category_in_ruleContractualElement1392 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1414 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement1428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1450 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleContractualElement1521 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1541 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Description_in_ruleContractualElement1610 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1630 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Assertion_in_ruleContractualElement1699 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1719 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Rationale_in_ruleContractualElement1788 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1808 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Issues_in_ruleContractualElement1877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1897 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement1911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1931 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Section_in_ruleContractualElement2002 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2024 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2038 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2060 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleContractualElement2131 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2153 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2189 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleContractualElement2260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2282 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2296 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2318 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleContractualElement2389 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2411 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2447 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Conflicts_in_ruleContractualElement2518 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2540 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2554 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2576 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleContractualElement2647 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2669 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2683 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2705 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement2776 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleContractualElement2788 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleContractualElement2800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2822 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2836 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2858 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement2929 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleContractualElement2941 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleContractualElement2953 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2975 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3011 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement3082 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleContractualElement3094 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleContractualElement3114 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement3128 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleContractualElement3148 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleContractualElement3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal3238 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal3248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goal_in_ruleGoal3286 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3302 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_For_in_ruleGoal3366 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleGoal3388 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Category_in_ruleGoal3457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3479 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal3493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3515 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleGoal3586 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3606 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Description_in_ruleGoal3675 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3695 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Assertion_in_ruleGoal3764 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3784 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Rationale_in_ruleGoal3853 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3873 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Issues_in_ruleGoal3942 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3962 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal3976 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3996 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleGoal4067 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4089 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4103 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4125 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleGoal4196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4218 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4232 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4254 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleGoal4325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4347 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4383 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Conflicts_in_ruleGoal4454 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4476 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4490 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4512 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleGoal4583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4605 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4641 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal4712 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleGoal4724 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleGoal4736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4758 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4794 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal4865 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleGoal4877 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleGoal4889 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4911 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4925 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4947 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5018 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleGoal5030 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal5050 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal5084 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleGoal5140 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement5174 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement5184 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Requirement_in_ruleRequirement5222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement5238 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_For_in_ruleRequirement5302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement5324 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Category_in_ruleRequirement5393 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5415 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5429 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5451 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleRequirement5522 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5542 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Description_in_ruleRequirement5611 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5631 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Assertion_in_ruleRequirement5700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5720 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Rationale_in_ruleRequirement5789 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5809 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Issues_in_ruleRequirement5878 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5898 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5932 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6003 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Goal_in_ruleRequirement6015 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement6034 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6048 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement6067 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6138 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_Hazard_in_ruleRequirement6150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement6170 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6184 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement6204 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleRequirement6275 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6297 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6311 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6333 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleRequirement6404 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6426 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6440 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6462 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleRequirement6533 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6555 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6569 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6591 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6662 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleRequirement6674 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleRequirement6686 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6708 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6722 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6744 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6815 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleRequirement6827 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleRequirement6839 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6861 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6875 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6897 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Verified_in_ruleRequirement6968 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_By_in_ruleRequirement6980 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleRequirement7000 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000020L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7070 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleRequirement7082 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement7102 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7116 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement7136 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRequirement7192 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument7226 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalDocument7236 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Document_in_ruleExternalDocument7274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalDocument7290 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_See_in_ruleExternalDocument7308 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_ruleExternalDocument7328 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleExternalDocument7341 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDocUri_in_entryRuleXDocUri7375 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDocUri7385 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleXDocUri7433 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_NumberSign_in_ruleXDocUri7447 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri7467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory7504 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory7514 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Category_in_ruleCategory7552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCategory7568 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_Extends_in_ruleCategory7587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleCategory7609 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleCategory7624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueString_in_entryRuleValueString7659 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueString7670 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueString7709 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder7752 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder7762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleStakeholder7800 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder7816 = new BitSet(new long[]{0x00085800000000C0L});
    public static final BitSet FOLLOW_Title_in_ruleStakeholder7880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder7900 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Description_in_ruleStakeholder7969 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder7989 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Role_in_ruleStakeholder8058 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8078 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Oranization_in_ruleStakeholder8147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8167 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Email_in_ruleStakeholder8236 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8256 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Phone_in_ruleStakeholder8325 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8345 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_End_in_ruleStakeholder8405 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition8439 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationDecomposition8449 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8527 = new BitSet(new long[]{0x4020000000000000L});
    public static final BitSet FOLLOW_And_in_ruleVerificationDecomposition8548 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_Or_in_ruleVerificationDecomposition8576 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition8611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity8647 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationActivity8657 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationActivity8695 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Activity_in_ruleVerificationActivity8707 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity8723 = new BitSet(new long[]{0x0040402000200440L});
    public static final BitSet FOLLOW_Title_in_ruleVerificationActivity8742 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity8762 = new BitSet(new long[]{0x0040002000200440L});
    public static final BitSet FOLLOW_Description_in_ruleVerificationActivity8778 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity8798 = new BitSet(new long[]{0x0040002000200400L});
    public static final BitSet FOLLOW_Method_in_ruleVerificationActivity8814 = new BitSet(new long[]{0x0000011100104020L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity8834 = new BitSet(new long[]{0x0040000000200400L});
    public static final BitSet FOLLOW_Decomposed_in_ruleVerificationActivity8850 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_To_in_ruleVerificationActivity8862 = new BitSet(new long[]{0x0040000000200000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleVerificationActivity8882 = new BitSet(new long[]{0x0040000000200000L,0x0000000000000020L});
    public static final BitSet FOLLOW_Assigned_in_ruleVerificationActivity8899 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_To_in_ruleVerificationActivity8911 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity8933 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_End_in_ruleVerificationActivity8949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod8984 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationMethod8995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Manual_in_ruleVerificationMethod9033 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Automatic_in_ruleVerificationMethod9052 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Review_in_ruleVerificationMethod9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Testing_in_ruleVerificationMethod9090 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Analysis_in_ruleVerificationMethod9109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationMethod9128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult9167 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResult9177 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationResult9215 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_Result_in_ruleVerificationResult9227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult9243 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_Of_in_ruleVerificationResult9261 = new BitSet(new long[]{0x0040A24010000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult9280 = new BitSet(new long[]{0x0040A24010000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_Output_in_ruleVerificationResult9295 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9315 = new BitSet(new long[]{0x0040A20010000000L});
    public static final BitSet FOLLOW_Logfile_in_ruleVerificationResult9331 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9351 = new BitSet(new long[]{0x0040A20000000000L});
    public static final BitSet FOLLOW_Date_in_ruleVerificationResult9367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9387 = new BitSet(new long[]{0x0040220000000000L});
    public static final BitSet FOLLOW_State_in_ruleVerificationResult9403 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_ruleVerificationResult9423 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_Status_in_ruleVerificationResult9439 = new BitSet(new long[]{0x0005000200000000L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult9459 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleVerificationResult9474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_entryRuleQPREF9509 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQPREF9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF9560 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQPREF9579 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF9594 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleQNEREF_in_entryRuleQNEREF9641 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNEREF9652 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF9693 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQNEREF9711 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF9728 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleQNEREF9747 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF9762 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF9811 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOTTEDREF9822 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF9862 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOTTEDREF9881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF9896 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePAREF_in_entryRulePAREF9943 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePAREF9954 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumberSign_in_rulePAREF9992 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF10007 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_rulePAREF10026 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF10041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH10088 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCPATH10099 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10140 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Solidus_in_ruleDOCPATH10158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCPATH10193 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10208 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT10253 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCFRAGMENT10264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10304 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCFRAGMENT10323 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10338 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_Scheduled_in_ruleVerificationResultState10402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Completed_in_ruleVerificationResultState10424 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Inprogress_in_ruleVerificationResultState10446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pass_in_ruleVerificationResultStatus10496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fail_in_ruleVerificationResultStatus10518 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unknown_in_ruleVerificationResultStatus10540 = new BitSet(new long[]{0x0000000000000002L});

}
