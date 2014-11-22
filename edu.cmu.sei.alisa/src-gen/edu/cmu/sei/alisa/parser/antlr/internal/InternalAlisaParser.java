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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Organization", "Verification", "Description", "Oranization", "Requirement", "Stakeholder", "Decomposed", "Decomposes", "Inprogress", "Assertion", "Automatic", "Completed", "Conflicts", "Rationale", "Scheduled", "Activity", "Analysis", "Assigned", "Category", "Document", "Verified", "Evolves", "Extends", "Imports", "Logfile", "Package", "Refines", "Section", "Testing", "Unknown", "Hazard", "Issues", "Manual", "Method", "Output", "Result", "Review", "Status", "System", "Email", "Phone", "State", "Title", "Date", "Fail", "Goal", "Pass", "Role", "With", "And", "End", "For", "Req", "See", "ColonColon", "By", "Cr", "Of", "Or", "To", "NumberSign", "Comma", "FullStop", "Solidus", "Colon", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int End=54;
    public static final int RULE_ID=70;
    public static final int Method=37;
    public static final int Unknown=33;
    public static final int Organization=4;
    public static final int Output=38;
    public static final int RULE_ANY_OTHER=75;
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
    public static final int RULE_INT=72;
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
    public static final int Colon=68;
    public static final int Inprogress=12;
    public static final int Imports=27;
    public static final int RULE_SL_COMMENT=74;
    public static final int Package=29;
    public static final int For=55;
    public static final int Verified=24;
    public static final int NumberSign=64;
    public static final int System=42;
    public static final int Rationale=17;
    public static final int With=52;
    public static final int Goal=49;
    public static final int RULE_ML_COMMENT=73;
    public static final int By=59;
    public static final int ColonColon=58;
    public static final int Document=23;
    public static final int Description=6;
    public static final int RULE_STRING=69;
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
    public static final int RULE_WS=71;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:402:1: ruleRSALSection returns [EObject current=null] : (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( (lv_content_4_0= ruleRSALElement ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End ) ;
    public final EObject ruleRSALSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_content_4_0 = null;

        AntlrDatatypeRuleToken lv_issue_6_0 = null;

        AntlrDatatypeRuleToken lv_issue_8_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:405:28: ( (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( (lv_content_4_0= ruleRSALElement ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:406:1: (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( (lv_content_4_0= ruleRSALElement ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:406:1: (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( (lv_content_4_0= ruleRSALElement ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:407:2: otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( (lv_content_4_0= ruleRSALElement ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:429:2: (otherlv_2= For ( ( ruleQNEREF ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==For) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:430:2: otherlv_2= For ( ( ruleQNEREF ) )
                    {
                    otherlv_2=(Token)match(input,For,FOLLOW_For_in_ruleRSALSection906); 

                        	newLeafNode(otherlv_2, grammarAccess.getRSALSectionAccess().getForKeyword_2_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:434:1: ( ( ruleQNEREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:435:1: ( ruleQNEREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:435:1: ( ruleQNEREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:436:3: ruleQNEREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRSALSectionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getRSALSectionAccess().getTargetNamedElementCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleQNEREF_in_ruleRSALSection928);
                    ruleQNEREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:449:4: ( (lv_content_4_0= ruleRSALElement ) )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( (LA11_0==Verification||(LA11_0>=Requirement && LA11_0<=Stakeholder)||(LA11_0>=Category && LA11_0<=Document)||LA11_0==Section||LA11_0==Goal||LA11_0==Cr) ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:450:1: (lv_content_4_0= ruleRSALElement )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:450:1: (lv_content_4_0= ruleRSALElement )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:451:3: lv_content_4_0= ruleRSALElement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentRSALElementParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleRSALElement_in_ruleRSALSection951);
            	    lv_content_4_0=ruleRSALElement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"content",
            	            		lv_content_4_0, 
            	            		"RSALElement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:467:3: (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==Issues) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:468:2: otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )*
                    {
                    otherlv_5=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRSALSection966); 

                        	newLeafNode(otherlv_5, grammarAccess.getRSALSectionAccess().getIssuesKeyword_4_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:472:1: ( (lv_issue_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:473:1: (lv_issue_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:473:1: (lv_issue_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:474:3: lv_issue_6_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRSALSectionAccess().getIssueValueStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleRSALSection986);
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

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:490:2: (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==Comma) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:491:2: otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALSection1000); 

                    	        	newLeafNode(otherlv_7, grammarAccess.getRSALSectionAccess().getCommaKeyword_4_2_0());
                    	        
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:495:1: ( (lv_issue_8_0= ruleValueString ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:496:1: (lv_issue_8_0= ruleValueString )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:496:1: (lv_issue_8_0= ruleValueString )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:497:3: lv_issue_8_0= ruleValueString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRSALSectionAccess().getIssueValueStringParserRuleCall_4_2_1_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueString_in_ruleRSALSection1020);
                    	    lv_issue_8_0=ruleValueString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"issue",
                    	            		lv_issue_8_0, 
                    	            		"ValueString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,End,FOLLOW_End_in_ruleRSALSection1037); 

                	newLeafNode(otherlv_9, grammarAccess.getRSALSectionAccess().getEndKeyword_5());
                

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:526:1: entryRuleOrganization returns [EObject current=null] : iv_ruleOrganization= ruleOrganization EOF ;
    public final EObject entryRuleOrganization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganization = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:527:2: (iv_ruleOrganization= ruleOrganization EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:528:2: iv_ruleOrganization= ruleOrganization EOF
            {
             newCompositeNode(grammarAccess.getOrganizationRule()); 
            pushFollow(FOLLOW_ruleOrganization_in_entryRuleOrganization1071);
            iv_ruleOrganization=ruleOrganization();

            state._fsp--;

             current =iv_ruleOrganization; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganization1081); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:535:1: ruleOrganization returns [EObject current=null] : (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End ) ;
    public final EObject ruleOrganization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_stakeholder_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:538:28: ( (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:539:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:539:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:540:2: otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End
            {
            otherlv_0=(Token)match(input,Organization,FOLLOW_Organization_in_ruleOrganization1119); 

                	newLeafNode(otherlv_0, grammarAccess.getOrganizationAccess().getOrganizationKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:544:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:545:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:545:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:546:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrganization1135); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:562:2: ( (lv_stakeholder_2_0= ruleStakeholder ) )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==Stakeholder) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:563:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:563:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:564:3: lv_stakeholder_2_0= ruleStakeholder
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getOrganizationAccess().getStakeholderStakeholderParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStakeholder_in_ruleOrganization1161);
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
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);

            otherlv_3=(Token)match(input,End,FOLLOW_End_in_ruleOrganization1175); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:595:1: entryRuleContractualElement returns [EObject current=null] : iv_ruleContractualElement= ruleContractualElement EOF ;
    public final EObject entryRuleContractualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractualElement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:596:2: (iv_ruleContractualElement= ruleContractualElement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:597:2: iv_ruleContractualElement= ruleContractualElement EOF
            {
             newCompositeNode(grammarAccess.getContractualElementRule()); 
            pushFollow(FOLLOW_ruleContractualElement_in_entryRuleContractualElement1211);
            iv_ruleContractualElement=ruleContractualElement();

            state._fsp--;

             current =iv_ruleContractualElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContractualElement1221); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:604:1: ruleContractualElement returns [EObject current=null] : (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End ) ;
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
        Token otherlv_63=null;
        Token otherlv_65=null;
        Token otherlv_67=null;
        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_assert_14_0 = null;

        AntlrDatatypeRuleToken lv_rationale_16_0 = null;

        AntlrDatatypeRuleToken lv_issue_18_0 = null;

        AntlrDatatypeRuleToken lv_issue_20_0 = null;

        EObject lv_docReference_59_0 = null;

        EObject lv_docReference_61_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_64_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_66_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:607:28: ( (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:608:1: (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:608:1: (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:609:2: otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End
            {
            otherlv_0=(Token)match(input,Cr,FOLLOW_Cr_in_ruleContractualElement1259); 

                	newLeafNode(otherlv_0, grammarAccess.getContractualElementAccess().getCrKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:613:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:614:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:614:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:615:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContractualElement1275); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:631:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:633:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:633:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:634:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:637:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:638:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:638:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop27:
            do {
                int alt27=18;
                alt27 = dfa27.predict(input);
                switch (alt27) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:640:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:640:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:641:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:641:115: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:642:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:645:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:645:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:645:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:646:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleContractualElement1339); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContractualElementAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:650:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:651:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:651:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:652:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleContractualElement1361);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:672:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:672:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:673:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:673:115: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:674:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:677:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:677:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:677:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:678:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleContractualElement1430); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContractualElementAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:682:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:683:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:683:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:684:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1452);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:697:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop15:
            	    do {
            	        int alt15=2;
            	        int LA15_0 = input.LA(1);

            	        if ( (LA15_0==Comma) ) {
            	            alt15=1;
            	        }


            	        switch (alt15) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:698:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement1466); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getContractualElementAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:702:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:703:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:703:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:704:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1488);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
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
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:724:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:724:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:725:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:725:115: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:726:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:729:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:729:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:729:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:730:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleContractualElement1559); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContractualElementAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:734:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:735:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:735:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:736:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1579);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:759:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:759:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:760:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:760:115: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:761:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:764:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:764:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:764:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:765:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleContractualElement1648); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContractualElementAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:769:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:770:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:770:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:771:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1668);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:794:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:794:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:795:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:795:115: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:796:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:799:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:799:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:799:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:800:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleContractualElement1737); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContractualElementAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:804:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:805:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:805:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:806:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1757);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:829:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:829:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:830:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:830:115: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:831:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:834:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:834:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:834:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:835:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleContractualElement1826); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContractualElementAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:839:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:840:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:840:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:841:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1846);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:864:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:864:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:865:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:865:115: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:866:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:869:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:869:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:869:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:870:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleContractualElement1915); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContractualElementAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:874:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:875:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:875:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:876:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1935);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:892:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==Comma) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:893:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement1949); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getContractualElementAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:897:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:898:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:898:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:899:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1969);
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
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:922:4: ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:922:4: ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:923:5: {...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:923:115: ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:924:6: ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:927:6: ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:927:7: {...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:927:16: (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:928:2: otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Section,FOLLOW_Section_in_ruleContractualElement2040); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContractualElementAccess().getSectionKeyword_2_7_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:932:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:933:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:933:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:934:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSectionReferenceRSALContainerCrossReference_2_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2062);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:947:2: (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==Comma) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:948:2: otherlv_23= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2076); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getContractualElementAccess().getCommaKeyword_2_7_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:952:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:953:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:953:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:954:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSectionReferenceRSALContainerCrossReference_2_7_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2098);
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
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:974:4: ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:974:4: ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:975:5: {...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:975:115: ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:976:6: ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:979:6: ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:979:7: {...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:979:16: (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:980:2: otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,Refines,FOLLOW_Refines_in_ruleContractualElement2169); 

            	        	newLeafNode(otherlv_25, grammarAccess.getContractualElementAccess().getRefinesKeyword_2_8_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:984:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:985:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:985:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:986:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRefinesReferenceContractualElementCrossReference_2_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2191);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:999:2: (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==Comma) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1000:2: otherlv_27= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2205); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getContractualElementAccess().getCommaKeyword_2_8_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1004:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1005:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1005:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1006:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRefinesReferenceContractualElementCrossReference_2_8_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2227);
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
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1026:4: ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1026:4: ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1027:5: {...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1027:115: ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1028:6: ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1031:6: ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1031:7: {...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1031:16: (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1032:2: otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleContractualElement2298); 

            	        	newLeafNode(otherlv_29, grammarAccess.getContractualElementAccess().getDecomposesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1036:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1037:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1037:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1038:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDecomposesReferenceContractualElementCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2320);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1051:2: (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==Comma) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1052:2: otherlv_31= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2334); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getContractualElementAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1056:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1057:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1057:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1058:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDecomposesReferenceContractualElementCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2356);
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
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1078:4: ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1078:4: ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1079:5: {...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1079:116: ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1080:6: ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1083:6: ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1083:7: {...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1083:16: (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1084:2: otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleContractualElement2427); 

            	        	newLeafNode(otherlv_33, grammarAccess.getContractualElementAccess().getEvolvesKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1088:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1089:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1089:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1090:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getEvolvesReferenceContractualElementCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2449);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1103:2: (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==Comma) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1104:2: otherlv_35= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2463); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getContractualElementAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1108:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1109:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1109:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1110:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getEvolvesReferenceContractualElementCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2485);
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
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1130:4: ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1130:4: ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1131:5: {...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1131:116: ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1132:6: ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:6: ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:7: {...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:16: (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1136:2: otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,Conflicts,FOLLOW_Conflicts_in_ruleContractualElement2556); 

            	        	newLeafNode(otherlv_37, grammarAccess.getContractualElementAccess().getConflictsKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1140:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1141:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1141:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1142:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getConflictsReferenceContractualElementCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2578);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1155:2: (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==Comma) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1156:2: otherlv_39= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2592); 

            	    	        	newLeafNode(otherlv_39, grammarAccess.getContractualElementAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1160:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1161:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1161:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1162:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getConflictsReferenceContractualElementCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2614);
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
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1182:4: ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1182:4: ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1183:5: {...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1183:116: ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1184:6: ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:6: ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:7: {...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:16: (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1188:2: otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleContractualElement2685); 

            	        	newLeafNode(otherlv_41, grammarAccess.getContractualElementAccess().getStakeholderKeyword_2_12_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1192:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1193:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1193:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1194:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderReferenceStakeholderCrossReference_2_12_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2707);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1207:2: (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==Comma) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1208:2: otherlv_43= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2721); 

            	    	        	newLeafNode(otherlv_43, grammarAccess.getContractualElementAccess().getCommaKeyword_2_12_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1212:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1213:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1213:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1214:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderReferenceStakeholderCrossReference_2_12_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2743);
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
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1234:4: ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1234:4: ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1235:5: {...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1235:116: ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1236:6: ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1239:6: ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1239:7: {...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1239:16: (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1240:2: otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_45=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement2814); 

            	        	newLeafNode(otherlv_45, grammarAccess.getContractualElementAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_46=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleContractualElement2826); 

            	        	newLeafNode(otherlv_46, grammarAccess.getContractualElementAccess().getStakeholderKeyword_2_13_1());
            	        
            	    otherlv_47=(Token)match(input,Req,FOLLOW_Req_in_ruleContractualElement2838); 

            	        	newLeafNode(otherlv_47, grammarAccess.getContractualElementAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1254:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1255:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1255:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1256:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2860);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1269:2: (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==Comma) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1270:2: otherlv_49= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_49=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2874); 

            	    	        	newLeafNode(otherlv_49, grammarAccess.getContractualElementAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1274:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1275:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1275:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1276:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2896);
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
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1296:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1296:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1297:5: {...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1297:116: ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1298:6: ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1301:6: ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1301:7: {...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1301:16: (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1302:2: otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_51=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement2967); 

            	        	newLeafNode(otherlv_51, grammarAccess.getContractualElementAccess().getSeeKeyword_2_14_0());
            	        
            	    otherlv_52=(Token)match(input,System,FOLLOW_System_in_ruleContractualElement2979); 

            	        	newLeafNode(otherlv_52, grammarAccess.getContractualElementAccess().getSystemKeyword_2_14_1());
            	        
            	    otherlv_53=(Token)match(input,Req,FOLLOW_Req_in_ruleContractualElement2991); 

            	        	newLeafNode(otherlv_53, grammarAccess.getContractualElementAccess().getReqKeyword_2_14_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1316:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1317:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1317:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1318:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_14_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3013);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1331:2: (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==Comma) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1332:2: otherlv_55= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_55=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement3027); 

            	    	        	newLeafNode(otherlv_55, grammarAccess.getContractualElementAccess().getCommaKeyword_2_14_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1336:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1337:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1337:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1338:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_14_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3049);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
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
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1358:4: ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1358:4: ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1359:5: {...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1359:116: ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1360:6: ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1363:6: ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1363:7: {...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1363:16: (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1364:2: otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_57=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement3120); 

            	        	newLeafNode(otherlv_57, grammarAccess.getContractualElementAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_58=(Token)match(input,Document,FOLLOW_Document_in_ruleContractualElement3132); 

            	        	newLeafNode(otherlv_58, grammarAccess.getContractualElementAccess().getDocumentKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1373:1: ( (lv_docReference_59_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1374:1: (lv_docReference_59_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1374:1: (lv_docReference_59_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1375:3: lv_docReference_59_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDocReferenceXDocUriParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleContractualElement3152);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1391:2: (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==Comma) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1392:2: otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_60=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement3166); 

            	    	        	newLeafNode(otherlv_60, grammarAccess.getContractualElementAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1396:1: ( (lv_docReference_61_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1397:1: (lv_docReference_61_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1397:1: (lv_docReference_61_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1398:3: lv_docReference_61_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDocReferenceXDocUriParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleContractualElement3186);
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
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1421:4: ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1421:4: ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1422:5: {...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1422:116: ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1423:6: ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1426:6: ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1426:7: {...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1426:16: (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1427:2: otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_62=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement3257); 

            	        	newLeafNode(otherlv_62, grammarAccess.getContractualElementAccess().getSeeKeyword_2_16_0());
            	        
            	    otherlv_63=(Token)match(input,Colon,FOLLOW_Colon_in_ruleContractualElement3269); 

            	        	newLeafNode(otherlv_63, grammarAccess.getContractualElementAccess().getColonKeyword_2_16_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1436:1: ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1437:1: (lv_modelReference_64_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1437:1: (lv_modelReference_64_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1438:3: lv_modelReference_64_0= ruleQDOTTEDPAREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3289);
            	    lv_modelReference_64_0=ruleQDOTTEDPAREF();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modelReference",
            	            		lv_modelReference_64_0, 
            	            		"QDOTTEDPAREF");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1454:2: (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==Comma) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1455:2: otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_65=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement3303); 

            	    	        	newLeafNode(otherlv_65, grammarAccess.getContractualElementAccess().getCommaKeyword_2_16_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1459:1: ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1460:1: (lv_modelReference_66_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1460:1: (lv_modelReference_66_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1461:3: lv_modelReference_66_0= ruleQDOTTEDPAREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3323);
            	    	    lv_modelReference_66_0=ruleQDOTTEDPAREF();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"modelReference",
            	    	            		lv_modelReference_66_0, 
            	    	            		"QDOTTEDPAREF");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	

            }

            otherlv_67=(Token)match(input,End,FOLLOW_End_in_ruleContractualElement3379); 

                	newLeafNode(otherlv_67, grammarAccess.getContractualElementAccess().getEndKeyword_3());
                

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1504:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1505:2: (iv_ruleGoal= ruleGoal EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1506:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal3413);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal3423); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1513:1: ruleGoal returns [EObject current=null] : (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End ) ;
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
        Token otherlv_59=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_assert_14_0 = null;

        AntlrDatatypeRuleToken lv_rationale_16_0 = null;

        AntlrDatatypeRuleToken lv_issue_18_0 = null;

        AntlrDatatypeRuleToken lv_issue_20_0 = null;

        EObject lv_docReference_55_0 = null;

        EObject lv_docReference_57_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_60_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_62_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1516:28: ( (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1517:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1517:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1518:2: otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End
            {
            otherlv_0=(Token)match(input,Goal,FOLLOW_Goal_in_ruleGoal3461); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1522:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1523:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1523:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1524:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3477); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1540:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1542:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1542:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1543:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1546:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1547:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1547:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop39:
            do {
                int alt39=17;
                alt39 = dfa39.predict(input);
                switch (alt39) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1549:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1549:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1550:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1550:101: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1551:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1554:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1554:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1554:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1555:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleGoal3541); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1559:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1560:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1560:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1561:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleGoal3563);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1581:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1581:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1582:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1582:101: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1583:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1586:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1586:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1586:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1587:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleGoal3632); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1591:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1592:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1592:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1593:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3654);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1606:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop28:
            	    do {
            	        int alt28=2;
            	        int LA28_0 = input.LA(1);

            	        if ( (LA28_0==Comma) ) {
            	            alt28=1;
            	        }


            	        switch (alt28) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1607:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal3668); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1611:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1612:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1612:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1613:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3690);
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
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1633:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1633:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1634:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1634:101: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1635:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1638:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1638:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1638:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1639:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleGoal3761); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1643:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1644:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1644:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1645:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3781);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1668:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1668:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1669:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1669:101: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1670:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1673:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1673:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1673:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1674:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleGoal3850); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1678:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1679:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1679:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1680:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3870);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1703:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1703:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1704:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1704:101: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1705:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1708:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1708:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1708:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1709:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleGoal3939); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1713:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1714:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1714:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1715:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3959);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1738:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1738:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1739:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1739:101: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1740:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1743:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1743:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1743:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1744:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleGoal4028); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1748:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1749:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1749:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1750:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal4048);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1773:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1773:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1774:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1774:101: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1775:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1778:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1778:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1778:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1779:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleGoal4117); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1783:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1784:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1784:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1785:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal4137);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1801:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==Comma) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1802:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4151); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1806:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1807:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1807:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1808:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal4171);
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
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1831:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1831:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1832:5: {...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1832:101: ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1833:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1836:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1836:7: {...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1836:16: (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1837:2: otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Refines,FOLLOW_Refines_in_ruleGoal4242); 

            	        	newLeafNode(otherlv_21, grammarAccess.getGoalAccess().getRefinesKeyword_2_7_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1841:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1842:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1842:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1843:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4264);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1856:2: (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==Comma) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1857:2: otherlv_23= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4278); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getGoalAccess().getCommaKeyword_2_7_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1861:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1862:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1862:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1863:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4300);
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
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1883:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1883:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1884:5: {...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1884:101: ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1885:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1888:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1888:7: {...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1888:16: (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1889:2: otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleGoal4371); 

            	        	newLeafNode(otherlv_25, grammarAccess.getGoalAccess().getDecomposesKeyword_2_8_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1893:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1894:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1894:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1895:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4393);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1908:2: (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==Comma) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1909:2: otherlv_27= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4407); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getGoalAccess().getCommaKeyword_2_8_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1913:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1914:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1914:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1915:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4429);
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
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1935:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1935:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1936:5: {...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1936:101: ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1937:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1940:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1940:7: {...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1940:16: (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1941:2: otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleGoal4500); 

            	        	newLeafNode(otherlv_29, grammarAccess.getGoalAccess().getEvolvesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1945:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1946:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1946:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1947:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4522);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1960:2: (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==Comma) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1961:2: otherlv_31= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4536); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getGoalAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1965:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1966:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1966:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1967:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4558);
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
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1987:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1987:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1988:5: {...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1988:102: ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1989:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1992:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1992:7: {...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1992:16: (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1993:2: otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Conflicts,FOLLOW_Conflicts_in_ruleGoal4629); 

            	        	newLeafNode(otherlv_33, grammarAccess.getGoalAccess().getConflictsKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1997:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1998:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1998:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1999:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4651);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2012:2: (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==Comma) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2013:2: otherlv_35= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4665); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getGoalAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2017:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2018:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2018:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2019:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4687);
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
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2039:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2039:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2040:5: {...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2040:102: ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2041:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2044:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2044:7: {...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2044:16: (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2045:2: otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleGoal4758); 

            	        	newLeafNode(otherlv_37, grammarAccess.getGoalAccess().getStakeholderKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2049:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2050:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2050:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2051:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4780);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2064:2: (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==Comma) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2065:2: otherlv_39= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4794); 

            	    	        	newLeafNode(otherlv_39, grammarAccess.getGoalAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2069:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2070:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2070:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2071:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4816);
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
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2091:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2091:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2092:5: {...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2092:102: ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2093:6: ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2096:6: ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2096:7: {...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2096:16: (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2097:2: otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,See,FOLLOW_See_in_ruleGoal4887); 

            	        	newLeafNode(otherlv_41, grammarAccess.getGoalAccess().getSeeKeyword_2_12_0());
            	        
            	    otherlv_42=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleGoal4899); 

            	        	newLeafNode(otherlv_42, grammarAccess.getGoalAccess().getStakeholderKeyword_2_12_1());
            	        
            	    otherlv_43=(Token)match(input,Req,FOLLOW_Req_in_ruleGoal4911); 

            	        	newLeafNode(otherlv_43, grammarAccess.getGoalAccess().getReqKeyword_2_12_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2111:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2112:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2112:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2113:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4933);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2126:2: (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==Comma) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2127:2: otherlv_45= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_45=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4947); 

            	    	        	newLeafNode(otherlv_45, grammarAccess.getGoalAccess().getCommaKeyword_2_12_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2131:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2132:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2132:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2133:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4969);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
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
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2153:4: ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2153:4: ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2154:5: {...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2154:102: ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2155:6: ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2158:6: ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2158:7: {...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2158:16: (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2159:2: otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_47=(Token)match(input,See,FOLLOW_See_in_ruleGoal5040); 

            	        	newLeafNode(otherlv_47, grammarAccess.getGoalAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_48=(Token)match(input,System,FOLLOW_System_in_ruleGoal5052); 

            	        	newLeafNode(otherlv_48, grammarAccess.getGoalAccess().getSystemKeyword_2_13_1());
            	        
            	    otherlv_49=(Token)match(input,Req,FOLLOW_Req_in_ruleGoal5064); 

            	        	newLeafNode(otherlv_49, grammarAccess.getGoalAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2173:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2174:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2174:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2175:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal5086);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2188:2: (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==Comma) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2189:2: otherlv_51= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5100); 

            	    	        	newLeafNode(otherlv_51, grammarAccess.getGoalAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2193:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2194:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2194:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2195:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal5122);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2215:4: ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2215:4: ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2216:5: {...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2216:102: ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2217:6: ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2220:6: ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2220:7: {...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2220:16: (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2221:2: otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_53=(Token)match(input,See,FOLLOW_See_in_ruleGoal5193); 

            	        	newLeafNode(otherlv_53, grammarAccess.getGoalAccess().getSeeKeyword_2_14_0());
            	        
            	    otherlv_54=(Token)match(input,Document,FOLLOW_Document_in_ruleGoal5205); 

            	        	newLeafNode(otherlv_54, grammarAccess.getGoalAccess().getDocumentKeyword_2_14_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2230:1: ( (lv_docReference_55_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2231:1: (lv_docReference_55_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2231:1: (lv_docReference_55_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2232:3: lv_docReference_55_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal5225);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2248:2: (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==Comma) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2249:2: otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_56=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5239); 

            	    	        	newLeafNode(otherlv_56, grammarAccess.getGoalAccess().getCommaKeyword_2_14_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2253:1: ( (lv_docReference_57_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2254:1: (lv_docReference_57_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2254:1: (lv_docReference_57_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2255:3: lv_docReference_57_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal5259);
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
            	    	    break loop37;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2278:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2278:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2279:5: {...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2279:102: ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2280:6: ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2283:6: ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2283:7: {...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2283:16: (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2284:2: otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_58=(Token)match(input,See,FOLLOW_See_in_ruleGoal5330); 

            	        	newLeafNode(otherlv_58, grammarAccess.getGoalAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_59=(Token)match(input,Colon,FOLLOW_Colon_in_ruleGoal5342); 

            	        	newLeafNode(otherlv_59, grammarAccess.getGoalAccess().getColonKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2293:1: ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2294:1: (lv_modelReference_60_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2294:1: (lv_modelReference_60_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2295:3: lv_modelReference_60_0= ruleQDOTTEDPAREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5362);
            	    lv_modelReference_60_0=ruleQDOTTEDPAREF();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modelReference",
            	            		lv_modelReference_60_0, 
            	            		"QDOTTEDPAREF");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2311:2: (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==Comma) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2312:2: otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_61=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5376); 

            	    	        	newLeafNode(otherlv_61, grammarAccess.getGoalAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2316:1: ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2317:1: (lv_modelReference_62_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2317:1: (lv_modelReference_62_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2318:3: lv_modelReference_62_0= ruleQDOTTEDPAREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5396);
            	    	    lv_modelReference_62_0=ruleQDOTTEDPAREF();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"modelReference",
            	    	            		lv_modelReference_62_0, 
            	    	            		"QDOTTEDPAREF");
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

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

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	

            }

            otherlv_63=(Token)match(input,End,FOLLOW_End_in_ruleGoal5452); 

                	newLeafNode(otherlv_63, grammarAccess.getGoalAccess().getEndKeyword_3());
                

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2361:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2362:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2363:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement5486);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement5496); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2370:1: ruleRequirement returns [EObject current=null] : (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End ) ;
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
        Token otherlv_64=null;
        Token otherlv_66=null;
        Token otherlv_68=null;
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

        AntlrDatatypeRuleToken lv_modelReference_65_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_67_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2373:28: ( (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2374:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2374:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2375:2: otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End
            {
            otherlv_0=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleRequirement5534); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2379:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2380:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2380:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2381:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement5550); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2397:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2399:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2399:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2400:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2403:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2404:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2404:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop52:
            do {
                int alt52=18;
                alt52 = dfa52.predict(input);
                switch (alt52) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2406:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2406:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2407:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2407:108: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2408:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2411:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2411:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2411:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2412:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleRequirement5614); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2416:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2417:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2417:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2418:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement5636);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2438:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2438:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2439:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2439:108: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2440:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2443:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2443:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2443:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2444:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleRequirement5705); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2448:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2449:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2449:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2450:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5727);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2463:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==Comma) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2464:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5741); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2468:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2469:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2469:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2470:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5763);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
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
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2490:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2490:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2491:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2491:108: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2492:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2495:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2495:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2495:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2496:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleRequirement5834); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2500:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2501:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2501:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2502:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5854);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2525:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2525:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2526:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2526:108: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2527:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2530:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2530:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2530:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2531:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleRequirement5923); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2535:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2536:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2536:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2537:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5943);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2560:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2560:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2561:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2561:108: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2562:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2565:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2565:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2565:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2566:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleRequirement6012); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2570:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2571:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2571:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2572:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6032);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2595:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2595:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2596:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2596:108: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2597:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2600:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2600:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2600:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2601:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleRequirement6101); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2605:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2606:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2606:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2607:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6121);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2630:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2630:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2631:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2631:108: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2632:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2635:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2635:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2635:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2636:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRequirement6190); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2640:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2641:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2641:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2642:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6210);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2658:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==Comma) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2659:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6224); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2663:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2664:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2664:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2665:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6244);
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
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2688:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2688:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2689:5: {...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2689:108: ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2690:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2693:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2693:7: {...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2693:16: (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2694:2: otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6315); 

            	        	newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getSeeKeyword_2_7_0());
            	        
            	    otherlv_22=(Token)match(input,Goal,FOLLOW_Goal_in_ruleRequirement6327); 

            	        	newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getGoalKeyword_2_7_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2703:1: ( (otherlv_23= RULE_ID ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2704:1: (otherlv_23= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2704:1: (otherlv_23= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2705:3: otherlv_23= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement6346); 

            	    		newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_2_0()); 
            	    	

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2716:2: (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==Comma) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2717:2: otherlv_24= Comma ( (otherlv_25= RULE_ID ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6360); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getCommaKeyword_2_7_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2721:1: ( (otherlv_25= RULE_ID ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2722:1: (otherlv_25= RULE_ID )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2722:1: (otherlv_25= RULE_ID )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2723:3: otherlv_25= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement6379); 

            	    	    		newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_3_1_0()); 
            	    	    	

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
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2741:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2741:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2742:5: {...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2742:108: ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2743:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2746:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2746:7: {...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2746:16: (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2747:2: otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    {
            	    otherlv_26=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6450); 

            	        	newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getSeeKeyword_2_8_0());
            	        
            	    otherlv_27=(Token)match(input,Hazard,FOLLOW_Hazard_in_ruleRequirement6462); 

            	        	newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getHazardKeyword_2_8_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2756:1: ( (lv_hazardReference_28_0= ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2757:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2757:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2758:3: lv_hazardReference_28_0= ruleQNEREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement6482);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2774:2: (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==Comma) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2775:2: otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6496); 

            	    	        	newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getCommaKeyword_2_8_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2779:1: ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2780:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2780:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2781:3: lv_hazardReference_30_0= ruleQNEREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement6516);
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
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2804:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2804:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2805:5: {...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2805:108: ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2806:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2809:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2809:7: {...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2809:16: (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2810:2: otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_31=(Token)match(input,Refines,FOLLOW_Refines_in_ruleRequirement6587); 

            	        	newLeafNode(otherlv_31, grammarAccess.getRequirementAccess().getRefinesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2814:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2815:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2815:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2816:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6609);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2829:2: (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==Comma) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2830:2: otherlv_33= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_33=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6623); 

            	    	        	newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2834:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2835:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2835:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2836:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6645);
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
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2856:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2856:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2857:5: {...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2857:109: ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2858:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2861:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2861:7: {...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2861:16: (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2862:2: otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_35=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleRequirement6716); 

            	        	newLeafNode(otherlv_35, grammarAccess.getRequirementAccess().getDecomposesKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2866:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2867:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2867:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2868:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6738);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2881:2: (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==Comma) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2882:2: otherlv_37= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6752); 

            	    	        	newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2886:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2887:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2887:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2888:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6774);
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
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2908:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2908:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2909:5: {...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2909:109: ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2910:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2913:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2913:7: {...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2913:16: (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2914:2: otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_39=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleRequirement6845); 

            	        	newLeafNode(otherlv_39, grammarAccess.getRequirementAccess().getEvolvesKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2918:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2919:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2919:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2920:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6867);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2933:2: (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==Comma) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2934:2: otherlv_41= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6881); 

            	    	        	newLeafNode(otherlv_41, grammarAccess.getRequirementAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2938:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2939:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2939:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2940:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6903);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


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
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2960:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2960:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2961:5: {...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2961:109: ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2962:6: ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2965:6: ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2965:7: {...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2965:16: (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2966:2: otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_43=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6974); 

            	        	newLeafNode(otherlv_43, grammarAccess.getRequirementAccess().getSeeKeyword_2_12_0());
            	        
            	    otherlv_44=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleRequirement6986); 

            	        	newLeafNode(otherlv_44, grammarAccess.getRequirementAccess().getStakeholderKeyword_2_12_1());
            	        
            	    otherlv_45=(Token)match(input,Req,FOLLOW_Req_in_ruleRequirement6998); 

            	        	newLeafNode(otherlv_45, grammarAccess.getRequirementAccess().getReqKeyword_2_12_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2980:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2981:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2981:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2982:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7020);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2995:2: (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==Comma) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2996:2: otherlv_47= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_47=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7034); 

            	    	        	newLeafNode(otherlv_47, grammarAccess.getRequirementAccess().getCommaKeyword_2_12_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3000:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3001:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3001:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3002:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7056);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
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
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3022:4: ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3022:4: ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3023:5: {...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3023:109: ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3024:6: ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3027:6: ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3027:7: {...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3027:16: (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3028:2: otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_49=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7127); 

            	        	newLeafNode(otherlv_49, grammarAccess.getRequirementAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_50=(Token)match(input,System,FOLLOW_System_in_ruleRequirement7139); 

            	        	newLeafNode(otherlv_50, grammarAccess.getRequirementAccess().getSystemKeyword_2_13_1());
            	        
            	    otherlv_51=(Token)match(input,Req,FOLLOW_Req_in_ruleRequirement7151); 

            	        	newLeafNode(otherlv_51, grammarAccess.getRequirementAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3042:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3043:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3043:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3044:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7173);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3057:2: (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==Comma) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3058:2: otherlv_53= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_53=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7187); 

            	    	        	newLeafNode(otherlv_53, grammarAccess.getRequirementAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3062:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3063:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3063:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3064:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7209);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3084:4: ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3084:4: ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3085:5: {...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3085:109: ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3086:6: ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3089:6: ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3089:7: {...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3089:16: (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3090:2: otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )*
            	    {
            	    otherlv_55=(Token)match(input,Verified,FOLLOW_Verified_in_ruleRequirement7280); 

            	        	newLeafNode(otherlv_55, grammarAccess.getRequirementAccess().getVerifiedKeyword_2_14_0());
            	        
            	    otherlv_56=(Token)match(input,By,FOLLOW_By_in_ruleRequirement7292); 

            	        	newLeafNode(otherlv_56, grammarAccess.getRequirementAccess().getByKeyword_2_14_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3099:1: ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==RULE_ID) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3100:1: (lv_verifiedBy_57_0= ruleVerificationDecomposition )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3100:1: (lv_verifiedBy_57_0= ruleVerificationDecomposition )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3101:3: lv_verifiedBy_57_0= ruleVerificationDecomposition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getVerifiedByVerificationDecompositionParserRuleCall_2_14_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleRequirement7312);
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
            	    	    break loop49;
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3124:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3124:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3125:5: {...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3125:109: ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3126:6: ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3129:6: ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3129:7: {...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3129:16: (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3130:2: otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_58=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7382); 

            	        	newLeafNode(otherlv_58, grammarAccess.getRequirementAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_59=(Token)match(input,Document,FOLLOW_Document_in_ruleRequirement7394); 

            	        	newLeafNode(otherlv_59, grammarAccess.getRequirementAccess().getDocumentKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3139:1: ( (lv_docReference_60_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3140:1: (lv_docReference_60_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3140:1: (lv_docReference_60_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3141:3: lv_docReference_60_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement7414);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3157:2: (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==Comma) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3158:2: otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_61=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7428); 

            	    	        	newLeafNode(otherlv_61, grammarAccess.getRequirementAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3162:1: ( (lv_docReference_62_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3163:1: (lv_docReference_62_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3163:1: (lv_docReference_62_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3164:3: lv_docReference_62_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement7448);
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
            	    	    break loop50;
            	        }
            	    } while (true);


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 17 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3187:4: ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3187:4: ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3188:5: {...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3188:109: ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3189:6: ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3192:6: ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3192:7: {...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3192:16: (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3193:2: otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_63=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7519); 

            	        	newLeafNode(otherlv_63, grammarAccess.getRequirementAccess().getSeeKeyword_2_16_0());
            	        
            	    otherlv_64=(Token)match(input,Colon,FOLLOW_Colon_in_ruleRequirement7531); 

            	        	newLeafNode(otherlv_64, grammarAccess.getRequirementAccess().getColonKeyword_2_16_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3202:1: ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3203:1: (lv_modelReference_65_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3203:1: (lv_modelReference_65_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3204:3: lv_modelReference_65_0= ruleQDOTTEDPAREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7551);
            	    lv_modelReference_65_0=ruleQDOTTEDPAREF();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"modelReference",
            	            		lv_modelReference_65_0, 
            	            		"QDOTTEDPAREF");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3220:2: (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==Comma) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3221:2: otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_66=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7565); 

            	    	        	newLeafNode(otherlv_66, grammarAccess.getRequirementAccess().getCommaKeyword_2_16_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3225:1: ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3226:1: (lv_modelReference_67_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3226:1: (lv_modelReference_67_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3227:3: lv_modelReference_67_0= ruleQDOTTEDPAREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7585);
            	    	    lv_modelReference_67_0=ruleQDOTTEDPAREF();

            	    	    state._fsp--;


            	    	    	        if (current==null) {
            	    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	           		add(
            	    	           			current, 
            	    	           			"modelReference",
            	    	            		lv_modelReference_67_0, 
            	    	            		"QDOTTEDPAREF");
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop51;
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
            	    break loop52;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	

            }

            otherlv_68=(Token)match(input,End,FOLLOW_End_in_ruleRequirement7641); 

                	newLeafNode(otherlv_68, grammarAccess.getRequirementAccess().getEndKeyword_3());
                

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3270:1: entryRuleExternalDocument returns [EObject current=null] : iv_ruleExternalDocument= ruleExternalDocument EOF ;
    public final EObject entryRuleExternalDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDocument = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3271:2: (iv_ruleExternalDocument= ruleExternalDocument EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3272:2: iv_ruleExternalDocument= ruleExternalDocument EOF
            {
             newCompositeNode(grammarAccess.getExternalDocumentRule()); 
            pushFollow(FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument7675);
            iv_ruleExternalDocument=ruleExternalDocument();

            state._fsp--;

             current =iv_ruleExternalDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalDocument7685); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3279:1: ruleExternalDocument returns [EObject current=null] : (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) ;
    public final EObject ruleExternalDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_externalReference_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3282:28: ( (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3283:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3283:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3284:2: otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End
            {
            otherlv_0=(Token)match(input,Document,FOLLOW_Document_in_ruleExternalDocument7723); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalDocumentAccess().getDocumentKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3288:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3289:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3289:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3290:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalDocument7739); 

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

            otherlv_2=(Token)match(input,See,FOLLOW_See_in_ruleExternalDocument7757); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalDocumentAccess().getSeeKeyword_2());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3311:1: ( (lv_externalReference_3_0= ruleDOCPATH ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3312:1: (lv_externalReference_3_0= ruleDOCPATH )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3312:1: (lv_externalReference_3_0= ruleDOCPATH )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3313:3: lv_externalReference_3_0= ruleDOCPATH
            {
             
            	        newCompositeNode(grammarAccess.getExternalDocumentAccess().getExternalReferenceDOCPATHParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOCPATH_in_ruleExternalDocument7777);
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

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleExternalDocument7790); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3342:1: entryRuleXDocUri returns [EObject current=null] : iv_ruleXDocUri= ruleXDocUri EOF ;
    public final EObject entryRuleXDocUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDocUri = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3343:2: (iv_ruleXDocUri= ruleXDocUri EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3344:2: iv_ruleXDocUri= ruleXDocUri EOF
            {
             newCompositeNode(grammarAccess.getXDocUriRule()); 
            pushFollow(FOLLOW_ruleXDocUri_in_entryRuleXDocUri7824);
            iv_ruleXDocUri=ruleXDocUri();

            state._fsp--;

             current =iv_ruleXDocUri; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDocUri7834); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3351:1: ruleXDocUri returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) ;
    public final EObject ruleXDocUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_docFragment_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3354:28: ( ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3355:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3355:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3355:2: ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3355:2: ( ( ruleDOTTEDREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3356:1: ( ruleDOTTEDREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3356:1: ( ruleDOTTEDREF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3357:3: ruleDOTTEDREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getXDocUriRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocReferenceExternalDocumentCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleXDocUri7882);
            ruleDOTTEDREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3370:2: (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==NumberSign) ) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3371:2: otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    {
                    otherlv_1=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_ruleXDocUri7896); 

                        	newLeafNode(otherlv_1, grammarAccess.getXDocUriAccess().getNumberSignKeyword_1_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3375:1: ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3376:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3376:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3377:3: lv_docFragment_2_0= ruleDOCFRAGMENT
                    {
                     
                    	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocFragmentDOCFRAGMENTParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri7916);
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3401:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3402:2: (iv_ruleCategory= ruleCategory EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3403:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory7953);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory7963); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3410:1: ruleCategory returns [EObject current=null] : (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3413:28: ( (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3414:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3414:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3415:2: otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End
            {
            otherlv_0=(Token)match(input,Category,FOLLOW_Category_in_ruleCategory8001); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3419:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3420:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3420:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCategory8017); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3437:2: (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==Extends) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3438:2: otherlv_2= Extends ( ( ruleDOTTEDREF ) )
                    {
                    otherlv_2=(Token)match(input,Extends,FOLLOW_Extends_in_ruleCategory8036); 

                        	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3442:1: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3443:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3443:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3444:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCategoryAccess().getExtendsCategoryCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleCategory8058);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleCategory8073); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3470:1: entryRuleValueString returns [String current=null] : iv_ruleValueString= ruleValueString EOF ;
    public final String entryRuleValueString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueString = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3471:1: (iv_ruleValueString= ruleValueString EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3472:2: iv_ruleValueString= ruleValueString EOF
            {
             newCompositeNode(grammarAccess.getValueStringRule()); 
            pushFollow(FOLLOW_ruleValueString_in_entryRuleValueString8108);
            iv_ruleValueString=ruleValueString();

            state._fsp--;

             current =iv_ruleValueString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueString8119); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3479:1: ruleValueString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleValueString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3483:6: (this_STRING_0= RULE_STRING )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3484:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueString8158); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3499:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3500:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3501:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder8201);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder8211); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3508:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3511:28: ( (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3512:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3512:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3513:2: otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End
            {
            otherlv_0=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleStakeholder8249); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3517:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3518:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3518:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3519:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder8265); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3535:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3537:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3537:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3538:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3541:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?)
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3542:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3542:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+
            int cnt55=0;
            loop55:
            do {
                int alt55=7;
                int LA55_0 = input.LA(1);

                if ( LA55_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0) ) {
                    alt55=1;
                }
                else if ( LA55_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1) ) {
                    alt55=2;
                }
                else if ( LA55_0 ==Role && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2) ) {
                    alt55=3;
                }
                else if ( LA55_0 ==Oranization && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
                    alt55=4;
                }
                else if ( LA55_0 ==Email && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
                    alt55=5;
                }
                else if ( LA55_0 ==Phone && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5) ) {
                    alt55=6;
                }


                switch (alt55) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3544:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3544:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3545:5: {...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3545:108: ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3546:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3549:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3549:7: {...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3549:16: (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3550:2: otherlv_3= Title ( (lv_title_4_0= ruleValueString ) )
            	    {
            	    otherlv_3=(Token)match(input,Title,FOLLOW_Title_in_ruleStakeholder8329); 

            	        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3554:1: ( (lv_title_4_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3555:1: (lv_title_4_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3555:1: (lv_title_4_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3556:3: lv_title_4_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getTitleValueStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8349);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3579:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3579:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3580:5: {...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3580:108: ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3581:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3584:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3584:7: {...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3584:16: (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3585:2: otherlv_5= Description ( (lv_description_6_0= ruleValueString ) )
            	    {
            	    otherlv_5=(Token)match(input,Description,FOLLOW_Description_in_ruleStakeholder8418); 

            	        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3589:1: ( (lv_description_6_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3590:1: (lv_description_6_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3590:1: (lv_description_6_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3591:3: lv_description_6_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getDescriptionValueStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8438);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3614:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3614:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3615:5: {...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3615:108: ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3616:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3619:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3619:7: {...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3619:16: (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3620:2: otherlv_7= Role ( (lv_role_8_0= ruleValueString ) )
            	    {
            	    otherlv_7=(Token)match(input,Role,FOLLOW_Role_in_ruleStakeholder8507); 

            	        	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getRoleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3624:1: ( (lv_role_8_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3625:1: (lv_role_8_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3625:1: (lv_role_8_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3626:3: lv_role_8_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getRoleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8527);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3649:4: ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3649:4: ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3650:5: {...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3650:108: ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3651:6: ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3654:6: ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3654:7: {...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3654:16: (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3655:2: otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Oranization,FOLLOW_Oranization_in_ruleStakeholder8596); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getOranizationKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3659:1: ( (lv_organziation_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3660:1: (lv_organziation_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3660:1: (lv_organziation_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3661:3: lv_organziation_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getOrganziationValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8616);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3684:4: ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3684:4: ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3685:5: {...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3685:108: ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3686:6: ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3689:6: ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3689:7: {...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3689:16: (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3690:2: otherlv_11= Email ( (lv_email_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Email,FOLLOW_Email_in_ruleStakeholder8685); 

            	        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getEmailKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3694:1: ( (lv_email_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3695:1: (lv_email_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3695:1: (lv_email_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3696:3: lv_email_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getEmailValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8705);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3719:4: ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3719:4: ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3720:5: {...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3720:108: ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3721:6: ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3724:6: ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3724:7: {...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3724:16: (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3725:2: otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Phone,FOLLOW_Phone_in_ruleStakeholder8774); 

            	        	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getPhoneKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3729:1: ( (lv_phone_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3730:1: (lv_phone_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3730:1: (lv_phone_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3731:3: lv_phone_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getPhoneValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8794);
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
            	    if ( cnt55 >= 1 ) break loop55;
                        EarlyExitException eee =
                            new EarlyExitException(55, input);
                        throw eee;
                }
                cnt55++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleStakeholder8854); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3775:1: entryRuleVerificationDecomposition returns [EObject current=null] : iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF ;
    public final EObject entryRuleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationDecomposition = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3776:2: (iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3777:2: iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF
            {
             newCompositeNode(grammarAccess.getVerificationDecompositionRule()); 
            pushFollow(FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition8888);
            iv_ruleVerificationDecomposition=ruleVerificationDecomposition();

            state._fsp--;

             current =iv_ruleVerificationDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationDecomposition8898); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3784:1: ruleVerificationDecomposition returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) ;
    public final EObject ruleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3787:28: ( ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3788:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3788:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            int alt57=2;
            alt57 = dfa57.predict(input);
            switch (alt57) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3788:2: ( ( ruleDOTTEDREF ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3788:2: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3789:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3789:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3790:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getElementVerificationActivityCrossReference_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8946);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3804:6: ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3804:6: ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3804:7: ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3804:7: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3805:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3805:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3806:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getLeftVerificationActivityCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8976);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3819:2: ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3820:1: ( (lv_type_2_1= And | lv_type_2_2= Or ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3820:1: ( (lv_type_2_1= And | lv_type_2_2= Or ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3821:1: (lv_type_2_1= And | lv_type_2_2= Or )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3821:1: (lv_type_2_1= And | lv_type_2_2= Or )
                    int alt56=2;
                    int LA56_0 = input.LA(1);

                    if ( (LA56_0==And) ) {
                        alt56=1;
                    }
                    else if ( (LA56_0==Or) ) {
                        alt56=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 56, 0, input);

                        throw nvae;
                    }
                    switch (alt56) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3822:3: lv_type_2_1= And
                            {
                            lv_type_2_1=(Token)match(input,And,FOLLOW_And_in_ruleVerificationDecomposition8997); 

                                    newLeafNode(lv_type_2_1, grammarAccess.getVerificationDecompositionAccess().getTypeAndKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3835:8: lv_type_2_2= Or
                            {
                            lv_type_2_2=(Token)match(input,Or,FOLLOW_Or_in_ruleVerificationDecomposition9025); 

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

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3851:2: ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3852:1: (lv_right_3_0= ruleVerificationDecomposition )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3852:1: (lv_right_3_0= ruleVerificationDecomposition )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3853:3: lv_right_3_0= ruleVerificationDecomposition
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getRightVerificationDecompositionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition9060);
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3877:1: entryRuleVerificationActivity returns [EObject current=null] : iv_ruleVerificationActivity= ruleVerificationActivity EOF ;
    public final EObject entryRuleVerificationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationActivity = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3878:2: (iv_ruleVerificationActivity= ruleVerificationActivity EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3879:2: iv_ruleVerificationActivity= ruleVerificationActivity EOF
            {
             newCompositeNode(grammarAccess.getVerificationActivityRule()); 
            pushFollow(FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity9096);
            iv_ruleVerificationActivity=ruleVerificationActivity();

            state._fsp--;

             current =iv_ruleVerificationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationActivity9106); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3886:1: ruleVerificationActivity returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3889:28: ( (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3890:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3890:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3891:2: otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationActivity9144); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationActivityAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,Activity,FOLLOW_Activity_in_ruleVerificationActivity9156); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationActivityAccess().getActivityKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3900:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3901:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3901:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3902:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity9172); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3918:2: (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )?
            int alt58=2;
            int LA58_0 = input.LA(1);

            if ( (LA58_0==Title) ) {
                alt58=1;
            }
            switch (alt58) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3919:2: otherlv_3= Title ( (lv_title_4_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,Title,FOLLOW_Title_in_ruleVerificationActivity9191); 

                        	newLeafNode(otherlv_3, grammarAccess.getVerificationActivityAccess().getTitleKeyword_3_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3923:1: ( (lv_title_4_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3924:1: (lv_title_4_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3924:1: (lv_title_4_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3925:3: lv_title_4_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getTitleValueStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity9211);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3941:4: (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Description) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3942:2: otherlv_5= Description ( (lv_description_6_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,Description,FOLLOW_Description_in_ruleVerificationActivity9227); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationActivityAccess().getDescriptionKeyword_4_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3946:1: ( (lv_description_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3947:1: (lv_description_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3947:1: (lv_description_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3948:3: lv_description_6_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDescriptionValueStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity9247);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3964:4: (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Method) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3965:2: otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) )
                    {
                    otherlv_7=(Token)match(input,Method,FOLLOW_Method_in_ruleVerificationActivity9263); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationActivityAccess().getMethodKeyword_5_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3969:1: ( (lv_method_8_0= ruleVerificationMethod ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3970:1: (lv_method_8_0= ruleVerificationMethod )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3970:1: (lv_method_8_0= ruleVerificationMethod )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3971:3: lv_method_8_0= ruleVerificationMethod
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getMethodVerificationMethodParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity9283);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3987:4: (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )?
            int alt62=2;
            int LA62_0 = input.LA(1);

            if ( (LA62_0==Decomposed) ) {
                alt62=1;
            }
            switch (alt62) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3988:2: otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )*
                    {
                    otherlv_9=(Token)match(input,Decomposed,FOLLOW_Decomposed_in_ruleVerificationActivity9299); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationActivityAccess().getDecomposedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,To,FOLLOW_To_in_ruleVerificationActivity9311); 

                        	newLeafNode(otherlv_10, grammarAccess.getVerificationActivityAccess().getToKeyword_6_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3997:1: ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )*
                    loop61:
                    do {
                        int alt61=2;
                        int LA61_0 = input.LA(1);

                        if ( (LA61_0==RULE_ID) ) {
                            alt61=1;
                        }


                        switch (alt61) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3998:1: (lv_decomposedTo_11_0= ruleVerificationDecomposition )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3998:1: (lv_decomposedTo_11_0= ruleVerificationDecomposition )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3999:3: lv_decomposedTo_11_0= ruleVerificationDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDecomposedToVerificationDecompositionParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleVerificationActivity9331);
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
                    	    break loop61;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4015:5: (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )?
            int alt64=2;
            int LA64_0 = input.LA(1);

            if ( (LA64_0==Assigned) ) {
                alt64=1;
            }
            switch (alt64) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4016:2: otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )*
                    {
                    otherlv_12=(Token)match(input,Assigned,FOLLOW_Assigned_in_ruleVerificationActivity9348); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerificationActivityAccess().getAssignedKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,To,FOLLOW_To_in_ruleVerificationActivity9360); 

                        	newLeafNode(otherlv_13, grammarAccess.getVerificationActivityAccess().getToKeyword_7_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4025:1: ( ( ruleDOTTEDREF ) )*
                    loop63:
                    do {
                        int alt63=2;
                        int LA63_0 = input.LA(1);

                        if ( (LA63_0==RULE_ID) ) {
                            alt63=1;
                        }


                        switch (alt63) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4026:1: ( ruleDOTTEDREF )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4026:1: ( ruleDOTTEDREF )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4027:3: ruleDOTTEDREF
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getVerificationActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getAssignedToStakeholderCrossReference_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9382);
                    	    ruleDOTTEDREF();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop63;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleVerificationActivity9398); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4053:1: entryRuleVerificationMethod returns [String current=null] : iv_ruleVerificationMethod= ruleVerificationMethod EOF ;
    public final String entryRuleVerificationMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationMethod = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4054:1: (iv_ruleVerificationMethod= ruleVerificationMethod EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4055:2: iv_ruleVerificationMethod= ruleVerificationMethod EOF
            {
             newCompositeNode(grammarAccess.getVerificationMethodRule()); 
            pushFollow(FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod9433);
            iv_ruleVerificationMethod=ruleVerificationMethod();

            state._fsp--;

             current =iv_ruleVerificationMethod.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationMethod9444); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4062:1: ruleVerificationMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification ) ;
    public final AntlrDatatypeRuleToken ruleVerificationMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4066:6: ( (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4067:1: (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4067:1: (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification )
            int alt65=6;
            switch ( input.LA(1) ) {
            case Manual:
                {
                alt65=1;
                }
                break;
            case Automatic:
                {
                alt65=2;
                }
                break;
            case Review:
                {
                alt65=3;
                }
                break;
            case Testing:
                {
                alt65=4;
                }
                break;
            case Analysis:
                {
                alt65=5;
                }
                break;
            case Verification:
                {
                alt65=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 65, 0, input);

                throw nvae;
            }

            switch (alt65) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4068:2: kw= Manual
                    {
                    kw=(Token)match(input,Manual,FOLLOW_Manual_in_ruleVerificationMethod9482); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getManualKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4075:2: kw= Automatic
                    {
                    kw=(Token)match(input,Automatic,FOLLOW_Automatic_in_ruleVerificationMethod9501); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getAutomaticKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4082:2: kw= Review
                    {
                    kw=(Token)match(input,Review,FOLLOW_Review_in_ruleVerificationMethod9520); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getReviewKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4089:2: kw= Testing
                    {
                    kw=(Token)match(input,Testing,FOLLOW_Testing_in_ruleVerificationMethod9539); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getTestingKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4096:2: kw= Analysis
                    {
                    kw=(Token)match(input,Analysis,FOLLOW_Analysis_in_ruleVerificationMethod9558); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getAnalysisKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4103:2: kw= Verification
                    {
                    kw=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationMethod9577); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4116:1: entryRuleVerificationResult returns [EObject current=null] : iv_ruleVerificationResult= ruleVerificationResult EOF ;
    public final EObject entryRuleVerificationResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationResult = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4117:2: (iv_ruleVerificationResult= ruleVerificationResult EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4118:2: iv_ruleVerificationResult= ruleVerificationResult EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultRule()); 
            pushFollow(FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult9616);
            iv_ruleVerificationResult=ruleVerificationResult();

            state._fsp--;

             current =iv_ruleVerificationResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResult9626); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4125:1: ruleVerificationResult returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4128:28: ( (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4129:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4129:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4130:2: otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationResult9664); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationResultAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,Result,FOLLOW_Result_in_ruleVerificationResult9676); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationResultAccess().getResultKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4139:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4140:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4140:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4141:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult9692); 

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

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_ruleVerificationResult9710); 

                	newLeafNode(otherlv_3, grammarAccess.getVerificationResultAccess().getOfKeyword_3());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4162:1: ( (otherlv_4= RULE_ID ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==RULE_ID) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4163:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4163:1: (otherlv_4= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4164:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVerificationResultRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult9729); 

            	    		newLeafNode(otherlv_4, grammarAccess.getVerificationResultAccess().getReferencedVerificationMethodVerificationActivityCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4175:3: (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )?
            int alt67=2;
            int LA67_0 = input.LA(1);

            if ( (LA67_0==Output) ) {
                alt67=1;
            }
            switch (alt67) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4176:2: otherlv_5= Output ( (lv_title_6_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,Output,FOLLOW_Output_in_ruleVerificationResult9744); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationResultAccess().getOutputKeyword_5_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4180:1: ( (lv_title_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4181:1: (lv_title_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4181:1: (lv_title_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4182:3: lv_title_6_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getTitleValueStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9764);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4198:4: (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Logfile) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4199:2: otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) )
                    {
                    otherlv_7=(Token)match(input,Logfile,FOLLOW_Logfile_in_ruleVerificationResult9780); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationResultAccess().getLogfileKeyword_6_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4203:1: ( (lv_description_8_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4204:1: (lv_description_8_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4204:1: (lv_description_8_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4205:3: lv_description_8_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getDescriptionValueStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9800);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4221:4: (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Date) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4222:2: otherlv_9= Date ( (lv_method_10_0= ruleValueString ) )
                    {
                    otherlv_9=(Token)match(input,Date,FOLLOW_Date_in_ruleVerificationResult9816); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationResultAccess().getDateKeyword_7_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4226:1: ( (lv_method_10_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4227:1: (lv_method_10_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4227:1: (lv_method_10_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4228:3: lv_method_10_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getMethodValueStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9836);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4244:4: (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==State) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4245:2: otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) )
                    {
                    otherlv_11=(Token)match(input,State,FOLLOW_State_in_ruleVerificationResult9852); 

                        	newLeafNode(otherlv_11, grammarAccess.getVerificationResultAccess().getStateKeyword_8_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4249:1: ( (lv_state_12_0= ruleVerificationResultState ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4250:1: (lv_state_12_0= ruleVerificationResultState )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4250:1: (lv_state_12_0= ruleVerificationResultState )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4251:3: lv_state_12_0= ruleVerificationResultState
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStateVerificationResultStateEnumRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultState_in_ruleVerificationResult9872);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4267:4: (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==Status) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4268:2: otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) )
                    {
                    otherlv_13=(Token)match(input,Status,FOLLOW_Status_in_ruleVerificationResult9888); 

                        	newLeafNode(otherlv_13, grammarAccess.getVerificationResultAccess().getStatusKeyword_9_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4272:1: ( (lv_status_14_0= ruleVerificationResultStatus ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4273:1: (lv_status_14_0= ruleVerificationResultStatus )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4273:1: (lv_status_14_0= ruleVerificationResultStatus )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4274:3: lv_status_14_0= ruleVerificationResultStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStatusVerificationResultStatusEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult9908);
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

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleVerificationResult9923); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4303:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4304:1: (iv_ruleQPREF= ruleQPREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4305:2: iv_ruleQPREF= ruleQPREF EOF
            {
             newCompositeNode(grammarAccess.getQPREFRule()); 
            pushFollow(FOLLOW_ruleQPREF_in_entryRuleQPREF9958);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;

             current =iv_ruleQPREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQPREF9969); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4312:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4316:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4317:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4317:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4317:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF10009); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4324:1: (kw= ColonColon this_ID_2= RULE_ID )*
            loop72:
            do {
                int alt72=2;
                int LA72_0 = input.LA(1);

                if ( (LA72_0==ColonColon) ) {
                    alt72=1;
                }


                switch (alt72) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4325:2: kw= ColonColon this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQPREF10028); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF10043); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop72;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4345:1: entryRuleQNEREF returns [String current=null] : iv_ruleQNEREF= ruleQNEREF EOF ;
    public final String entryRuleQNEREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNEREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4346:1: (iv_ruleQNEREF= ruleQNEREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4347:2: iv_ruleQNEREF= ruleQNEREF EOF
            {
             newCompositeNode(grammarAccess.getQNEREFRule()); 
            pushFollow(FOLLOW_ruleQNEREF_in_entryRuleQNEREF10090);
            iv_ruleQNEREF=ruleQNEREF();

            state._fsp--;

             current =iv_ruleQNEREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNEREF10101); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4354:1: ruleQNEREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQNEREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4358:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4359:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4359:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4359:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4359:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==RULE_ID) ) {
                    int LA73_1 = input.LA(2);

                    if ( (LA73_1==ColonColon) ) {
                        alt73=1;
                    }


                }


                switch (alt73) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4359:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF10142); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQNEREF10160); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNEREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop73;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF10177); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4379:1: (kw= FullStop this_ID_4= RULE_ID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==FullStop) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4380:2: kw= FullStop this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQNEREF10196); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNEREFAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF10211); 

            	    		current.merge(this_ID_4);
            	        
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_2_1()); 
            	        

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
    // $ANTLR end "ruleQNEREF"


    // $ANTLR start "entryRuleQDOTTEDPAREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4400:1: entryRuleQDOTTEDPAREF returns [String current=null] : iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF ;
    public final String entryRuleQDOTTEDPAREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQDOTTEDPAREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4401:1: (iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4402:2: iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF
            {
             newCompositeNode(grammarAccess.getQDOTTEDPAREFRule()); 
            pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_entryRuleQDOTTEDPAREF10258);
            iv_ruleQDOTTEDPAREF=ruleQDOTTEDPAREF();

            state._fsp--;

             current =iv_ruleQDOTTEDPAREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQDOTTEDPAREF10269); 

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
    // $ANTLR end "entryRuleQDOTTEDPAREF"


    // $ANTLR start "ruleQDOTTEDPAREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4409:1: ruleQDOTTEDPAREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF ) ;
    public final AntlrDatatypeRuleToken ruleQDOTTEDPAREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QNEREF_0 = null;

        AntlrDatatypeRuleToken this_PAREF_1 = null;

        AntlrDatatypeRuleToken this_PAREF_2 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4413:6: ( ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4414:1: ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4414:1: ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF )
            int alt76=2;
            int LA76_0 = input.LA(1);

            if ( (LA76_0==RULE_ID) ) {
                alt76=1;
            }
            else if ( (LA76_0==NumberSign) ) {
                alt76=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 76, 0, input);

                throw nvae;
            }
            switch (alt76) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4414:2: (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4414:2: (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4415:5: this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )?
                    {
                     
                            newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getQNEREFParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleQNEREF_in_ruleQDOTTEDPAREF10317);
                    this_QNEREF_0=ruleQNEREF();

                    state._fsp--;


                    		current.merge(this_QNEREF_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4425:1: (this_PAREF_1= rulePAREF )?
                    int alt75=2;
                    int LA75_0 = input.LA(1);

                    if ( (LA75_0==NumberSign) ) {
                        alt75=1;
                    }
                    switch (alt75) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4426:5: this_PAREF_1= rulePAREF
                            {
                             
                                    newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getPAREFParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10345);
                            this_PAREF_1=rulePAREF();

                            state._fsp--;


                            		current.merge(this_PAREF_1);
                                
                             
                                    afterParserOrEnumRuleCall();
                                

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4438:5: this_PAREF_2= rulePAREF
                    {
                     
                            newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getPAREFParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10381);
                    this_PAREF_2=rulePAREF();

                    state._fsp--;


                    		current.merge(this_PAREF_2);
                        
                     
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
    // $ANTLR end "ruleQDOTTEDPAREF"


    // $ANTLR start "entryRuleDOTTEDREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4456:1: entryRuleDOTTEDREF returns [String current=null] : iv_ruleDOTTEDREF= ruleDOTTEDREF EOF ;
    public final String entryRuleDOTTEDREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOTTEDREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4457:1: (iv_ruleDOTTEDREF= ruleDOTTEDREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4458:2: iv_ruleDOTTEDREF= ruleDOTTEDREF EOF
            {
             newCompositeNode(grammarAccess.getDOTTEDREFRule()); 
            pushFollow(FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF10426);
            iv_ruleDOTTEDREF=ruleDOTTEDREF();

            state._fsp--;

             current =iv_ruleDOTTEDREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOTTEDREF10437); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4465:1: ruleDOTTEDREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOTTEDREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4469:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4470:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4470:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4470:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF10477); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4477:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==FullStop) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4478:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOTTEDREF10496); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOTTEDREFAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF10511); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop77;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4498:1: entryRulePAREF returns [String current=null] : iv_rulePAREF= rulePAREF EOF ;
    public final String entryRulePAREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePAREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4499:1: (iv_rulePAREF= rulePAREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4500:2: iv_rulePAREF= rulePAREF EOF
            {
             newCompositeNode(grammarAccess.getPAREFRule()); 
            pushFollow(FOLLOW_rulePAREF_in_entryRulePAREF10558);
            iv_rulePAREF=rulePAREF();

            state._fsp--;

             current =iv_rulePAREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePAREF10569); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4507:1: rulePAREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken rulePAREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4511:6: ( (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4512:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4512:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4513:2: kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )?
            {
            kw=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_rulePAREF10607); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPAREFAccess().getNumberSignKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF10622); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getPAREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4525:1: (kw= ColonColon this_ID_3= RULE_ID )?
            int alt78=2;
            int LA78_0 = input.LA(1);

            if ( (LA78_0==ColonColon) ) {
                alt78=1;
            }
            switch (alt78) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4526:2: kw= ColonColon this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_rulePAREF10641); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPAREFAccess().getColonColonKeyword_2_0()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF10656); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4546:1: entryRuleDOCPATH returns [String current=null] : iv_ruleDOCPATH= ruleDOCPATH EOF ;
    public final String entryRuleDOCPATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCPATH = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4547:1: (iv_ruleDOCPATH= ruleDOCPATH EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4548:2: iv_ruleDOCPATH= ruleDOCPATH EOF
            {
             newCompositeNode(grammarAccess.getDOCPATHRule()); 
            pushFollow(FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH10703);
            iv_ruleDOCPATH=ruleDOCPATH();

            state._fsp--;

             current =iv_ruleDOCPATH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCPATH10714); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4555:1: ruleDOCPATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDOCPATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4559:6: ( ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4560:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4560:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4560:2: (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4560:2: (this_ID_0= RULE_ID kw= Solidus )*
            loop79:
            do {
                int alt79=2;
                int LA79_0 = input.LA(1);

                if ( (LA79_0==RULE_ID) ) {
                    int LA79_1 = input.LA(2);

                    if ( (LA79_1==Solidus) ) {
                        alt79=1;
                    }


                }


                switch (alt79) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4560:7: this_ID_0= RULE_ID kw= Solidus
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10755); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleDOCPATH10773); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOCPATHAccess().getSolidusKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop79;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10790); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCPATH10808); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOCPATHAccess().getFullStopKeyword_2()); 
                
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10823); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4601:1: entryRuleDOCFRAGMENT returns [String current=null] : iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF ;
    public final String entryRuleDOCFRAGMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCFRAGMENT = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4602:1: (iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4603:2: iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF
            {
             newCompositeNode(grammarAccess.getDOCFRAGMENTRule()); 
            pushFollow(FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT10868);
            iv_ruleDOCFRAGMENT=ruleDOCFRAGMENT();

            state._fsp--;

             current =iv_ruleDOCFRAGMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCFRAGMENT10879); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4610:1: ruleDOCFRAGMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOCFRAGMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4614:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4615:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4615:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4615:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10919); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4622:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==FullStop) ) {
                    alt80=1;
                }


                switch (alt80) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4623:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCFRAGMENT10938); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOCFRAGMENTAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10953); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop80;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4643:1: ruleVerificationResultState returns [Enumerator current=null] : ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) ;
    public final Enumerator ruleVerificationResultState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4645:28: ( ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4646:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4646:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            int alt81=3;
            switch ( input.LA(1) ) {
            case Scheduled:
                {
                alt81=1;
                }
                break;
            case Completed:
                {
                alt81=2;
                }
                break;
            case Inprogress:
                {
                alt81=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 81, 0, input);

                throw nvae;
            }

            switch (alt81) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4646:2: (enumLiteral_0= Scheduled )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4646:2: (enumLiteral_0= Scheduled )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4646:7: enumLiteral_0= Scheduled
                    {
                    enumLiteral_0=(Token)match(input,Scheduled,FOLLOW_Scheduled_in_ruleVerificationResultState11017); 

                            current = grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4652:6: (enumLiteral_1= Completed )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4652:6: (enumLiteral_1= Completed )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4652:11: enumLiteral_1= Completed
                    {
                    enumLiteral_1=(Token)match(input,Completed,FOLLOW_Completed_in_ruleVerificationResultState11039); 

                            current = grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4658:6: (enumLiteral_2= Inprogress )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4658:6: (enumLiteral_2= Inprogress )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4658:11: enumLiteral_2= Inprogress
                    {
                    enumLiteral_2=(Token)match(input,Inprogress,FOLLOW_Inprogress_in_ruleVerificationResultState11061); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4668:1: ruleVerificationResultStatus returns [Enumerator current=null] : ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) ) ;
    public final Enumerator ruleVerificationResultStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4670:28: ( ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4671:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4671:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case Pass:
                {
                alt82=1;
                }
                break;
            case Fail:
                {
                alt82=2;
                }
                break;
            case Unknown:
                {
                alt82=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 82, 0, input);

                throw nvae;
            }

            switch (alt82) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4671:2: (enumLiteral_0= Pass )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4671:2: (enumLiteral_0= Pass )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4671:7: enumLiteral_0= Pass
                    {
                    enumLiteral_0=(Token)match(input,Pass,FOLLOW_Pass_in_ruleVerificationResultStatus11111); 

                            current = grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4677:6: (enumLiteral_1= Fail )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4677:6: (enumLiteral_1= Fail )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4677:11: enumLiteral_1= Fail
                    {
                    enumLiteral_1=(Token)match(input,Fail,FOLLOW_Fail_in_ruleVerificationResultStatus11133); 

                            current = grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4683:6: (enumLiteral_2= Unknown )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4683:6: (enumLiteral_2= Unknown )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4683:11: enumLiteral_2= Unknown
                    {
                    enumLiteral_2=(Token)match(input,Unknown,FOLLOW_Unknown_in_ruleVerificationResultStatus11155); 

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


    protected DFA27 dfa27 = new DFA27(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA52 dfa52 = new DFA52(this);
    protected DFA57 dfa57 = new DFA57(this);
    static final String DFA27_eotS =
        "\24\uffff";
    static final String DFA27_eofS =
        "\24\uffff";
    static final String DFA27_minS =
        "\1\6\16\uffff\1\11\4\uffff";
    static final String DFA27_maxS =
        "\1\71\16\uffff\1\104\4\uffff";
    static final String DFA27_acceptS =
        "\1\uffff\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\uffff\1\17\1\21\1\20\1\16";
    static final String DFA27_specialS =
        "\1\1\16\uffff\1\0\4\uffff}>";
    static final String[] DFA27_transitionS = {
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
            "\1\23\15\uffff\1\22\22\uffff\1\20\31\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA27_eot = DFA.unpackEncodedString(DFA27_eotS);
    static final short[] DFA27_eof = DFA.unpackEncodedString(DFA27_eofS);
    static final char[] DFA27_min = DFA.unpackEncodedStringToUnsignedChars(DFA27_minS);
    static final char[] DFA27_max = DFA.unpackEncodedStringToUnsignedChars(DFA27_maxS);
    static final short[] DFA27_accept = DFA.unpackEncodedString(DFA27_acceptS);
    static final short[] DFA27_special = DFA.unpackEncodedString(DFA27_specialS);
    static final short[][] DFA27_transition;

    static {
        int numStates = DFA27_transitionS.length;
        DFA27_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA27_transition[i] = DFA.unpackEncodedString(DFA27_transitionS[i]);
        }
    }

    class DFA27 extends DFA {

        public DFA27(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 27;
            this.eot = DFA27_eot;
            this.eof = DFA27_eof;
            this.min = DFA27_min;
            this.max = DFA27_max;
            this.accept = DFA27_accept;
            this.special = DFA27_special;
            this.transition = DFA27_transition;
        }
        public String getDescription() {
            return "()* loopback of 638:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA27_15 = input.LA(1);

                         
                        int index27_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA27_15 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA27_15 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16) ) {s = 17;}

                        else if ( LA27_15 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) ) {s = 18;}

                        else if ( LA27_15 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) {s = 19;}

                         
                        input.seek(index27_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA27_0 = input.LA(1);

                         
                        int index27_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA27_0==End) ) {s = 1;}

                        else if ( LA27_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA27_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA27_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA27_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA27_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA27_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA27_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA27_0 ==Section && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA27_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA27_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA27_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA27_0 ==Conflicts && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA27_0 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA27_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) ) {s = 15;}

                         
                        input.seek(index27_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 27, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA39_eotS =
        "\23\uffff";
    static final String DFA39_eofS =
        "\23\uffff";
    static final String DFA39_minS =
        "\1\6\15\uffff\1\11\4\uffff";
    static final String DFA39_maxS =
        "\1\71\15\uffff\1\104\4\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\21\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\uffff\1\16\1\20\1\17\1\15";
    static final String DFA39_specialS =
        "\1\0\15\uffff\1\1\4\uffff}>";
    static final String[] DFA39_transitionS = {
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
            "\1\22\15\uffff\1\21\22\uffff\1\17\31\uffff\1\20",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "()* loopback of 1547:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA39_0 = input.LA(1);

                         
                        int index39_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA39_0==End) ) {s = 1;}

                        else if ( LA39_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA39_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA39_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA39_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA39_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA39_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA39_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA39_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA39_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA39_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA39_0 ==Conflicts && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA39_0 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA39_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) ) {s = 14;}

                         
                        input.seek(index39_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA39_14 = input.LA(1);

                         
                        int index39_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA39_14 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA39_14 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) ) {s = 16;}

                        else if ( LA39_14 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {s = 17;}

                        else if ( LA39_14 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {s = 18;}

                         
                        input.seek(index39_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 39, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA52_eotS =
        "\24\uffff";
    static final String DFA52_eofS =
        "\24\uffff";
    static final String DFA52_minS =
        "\1\6\10\uffff\1\11\12\uffff";
    static final String DFA52_maxS =
        "\1\71\10\uffff\1\104\12\uffff";
    static final String DFA52_acceptS =
        "\1\uffff\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14"+
        "\1\17\1\11\1\15\1\21\1\16\1\10\1\20";
    static final String DFA52_specialS =
        "\1\1\10\uffff\1\0\12\uffff}>";
    static final String[] DFA52_transitionS = {
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
            "\1\17\15\uffff\1\23\12\uffff\1\16\7\uffff\1\21\6\uffff\1\22"+
            "\22\uffff\1\20",
            "",
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

    static final short[] DFA52_eot = DFA.unpackEncodedString(DFA52_eotS);
    static final short[] DFA52_eof = DFA.unpackEncodedString(DFA52_eofS);
    static final char[] DFA52_min = DFA.unpackEncodedStringToUnsignedChars(DFA52_minS);
    static final char[] DFA52_max = DFA.unpackEncodedStringToUnsignedChars(DFA52_maxS);
    static final short[] DFA52_accept = DFA.unpackEncodedString(DFA52_acceptS);
    static final short[] DFA52_special = DFA.unpackEncodedString(DFA52_specialS);
    static final short[][] DFA52_transition;

    static {
        int numStates = DFA52_transitionS.length;
        DFA52_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA52_transition[i] = DFA.unpackEncodedString(DFA52_transitionS[i]);
        }
    }

    class DFA52 extends DFA {

        public DFA52(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 52;
            this.eot = DFA52_eot;
            this.eof = DFA52_eof;
            this.min = DFA52_min;
            this.max = DFA52_max;
            this.accept = DFA52_accept;
            this.special = DFA52_special;
            this.transition = DFA52_transition;
        }
        public String getDescription() {
            return "()* loopback of 2404:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA52_9 = input.LA(1);

                         
                        int index52_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA52_9 ==Hazard && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {s = 14;}

                        else if ( LA52_9 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {s = 15;}

                        else if ( LA52_9 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) ) {s = 16;}

                        else if ( LA52_9 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {s = 17;}

                        else if ( LA52_9 ==Goal && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {s = 18;}

                        else if ( LA52_9 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {s = 19;}

                         
                        input.seek(index52_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA52_0 = input.LA(1);

                         
                        int index52_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA52_0==End) ) {s = 1;}

                        else if ( LA52_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA52_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA52_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA52_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA52_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA52_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA52_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA52_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) ) {s = 9;}

                        else if ( LA52_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {s = 10;}

                        else if ( LA52_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {s = 11;}

                        else if ( LA52_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {s = 12;}

                        else if ( LA52_0 ==Verified && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {s = 13;}

                         
                        input.seek(index52_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 52, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA57_eotS =
        "\6\uffff";
    static final String DFA57_eofS =
        "\1\uffff\1\4\3\uffff\1\4";
    static final String DFA57_minS =
        "\1\106\1\6\1\106\2\uffff\1\6";
    static final String DFA57_maxS =
        "\3\106\2\uffff\1\106";
    static final String DFA57_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA57_specialS =
        "\6\uffff}>";
    static final String[] DFA57_transitionS = {
            "\1\1",
            "\1\4\4\uffff\1\4\1\uffff\1\4\3\uffff\1\4\3\uffff\2\4\1\uffff"+
            "\2\4\4\uffff\1\4\4\uffff\1\4\12\uffff\1\4\6\uffff\1\3\2\4\1"+
            "\uffff\1\4\4\uffff\1\3\3\uffff\1\2\3\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\4\4\uffff\1\4\1\uffff\1\4\3\uffff\1\4\3\uffff\2\4\1\uffff"+
            "\2\4\4\uffff\1\4\4\uffff\1\4\12\uffff\1\4\6\uffff\1\3\2\4\1"+
            "\uffff\1\4\4\uffff\1\3\3\uffff\1\2\3\uffff\1\4"
    };

    static final short[] DFA57_eot = DFA.unpackEncodedString(DFA57_eotS);
    static final short[] DFA57_eof = DFA.unpackEncodedString(DFA57_eofS);
    static final char[] DFA57_min = DFA.unpackEncodedStringToUnsignedChars(DFA57_minS);
    static final char[] DFA57_max = DFA.unpackEncodedStringToUnsignedChars(DFA57_maxS);
    static final short[] DFA57_accept = DFA.unpackEncodedString(DFA57_acceptS);
    static final short[] DFA57_special = DFA.unpackEncodedString(DFA57_specialS);
    static final short[][] DFA57_transition;

    static {
        int numStates = DFA57_transitionS.length;
        DFA57_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA57_transition[i] = DFA.unpackEncodedString(DFA57_transitionS[i]);
        }
    }

    class DFA57 extends DFA {

        public DFA57(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 57;
            this.eot = DFA57_eot;
            this.eof = DFA57_eof;
            this.min = DFA57_min;
            this.max = DFA57_max;
            this.accept = DFA57_accept;
            this.special = DFA57_special;
            this.transition = DFA57_transition;
        }
        public String getDescription() {
            return "3788:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlisaModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_ruleAlisaModel124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_ruleAlisaModel151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_entryRuleRSALPackage187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSALPackage197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_ruleRSALPackage235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage251 = new BitSet(new long[]{0x1012000088C00320L});
    public static final BitSet FOLLOW_Imports_in_ruleRSALPackage270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage289 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage322 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_ruleRSALPackage340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage362 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage398 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALElement_in_ruleRSALPackage423 = new BitSet(new long[]{0x1052000888C00320L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALPackage438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALPackage458 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
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
    public static final BitSet FOLLOW_Section_in_ruleRSALSection871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALSection887 = new BitSet(new long[]{0x1092000088C00320L});
    public static final BitSet FOLLOW_For_in_ruleRSALSection906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRSALSection928 = new BitSet(new long[]{0x1012000088C00320L});
    public static final BitSet FOLLOW_ruleRSALElement_in_ruleRSALSection951 = new BitSet(new long[]{0x1052000888C00320L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALSection966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection986 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALSection1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection1020 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRSALSection1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_entryRuleOrganization1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganization1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Organization_in_ruleOrganization1119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrganization1135 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleOrganization1161 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_End_in_ruleOrganization1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractualElement_in_entryRuleContractualElement1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContractualElement1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Cr_in_ruleContractualElement1259 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContractualElement1275 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_For_in_ruleContractualElement1339 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleContractualElement1361 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Category_in_ruleContractualElement1430 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1452 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement1466 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1488 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleContractualElement1559 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1579 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Description_in_ruleContractualElement1648 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1668 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Assertion_in_ruleContractualElement1737 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1757 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Rationale_in_ruleContractualElement1826 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1846 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Issues_in_ruleContractualElement1915 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1935 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement1949 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1969 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Section_in_ruleContractualElement2040 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2062 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2076 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2098 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleContractualElement2169 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2191 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2227 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleContractualElement2298 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2320 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2334 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2356 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleContractualElement2427 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2449 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2463 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2485 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Conflicts_in_ruleContractualElement2556 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2578 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2592 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2614 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleContractualElement2685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2707 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2721 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2743 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement2814 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleContractualElement2826 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleContractualElement2838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2860 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2896 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement2967 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleContractualElement2979 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleContractualElement2991 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3013 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement3027 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3049 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement3120 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleContractualElement3132 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleContractualElement3152 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement3166 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleContractualElement3186 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement3257 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleContractualElement3269 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3289 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement3303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3323 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleContractualElement3379 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal3413 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal3423 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goal_in_ruleGoal3461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3477 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_For_in_ruleGoal3541 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleGoal3563 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Category_in_ruleGoal3632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3654 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal3668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3690 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleGoal3761 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3781 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Description_in_ruleGoal3850 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3870 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Assertion_in_ruleGoal3939 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3959 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Rationale_in_ruleGoal4028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal4048 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Issues_in_ruleGoal4117 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal4137 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal4171 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleGoal4242 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4264 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4300 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleGoal4371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4393 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4407 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4429 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleGoal4500 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4522 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4536 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4558 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Conflicts_in_ruleGoal4629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4651 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4665 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4687 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleGoal4758 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4780 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4794 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4816 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal4887 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleGoal4899 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleGoal4911 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4933 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4969 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5040 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleGoal5052 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleGoal5064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal5086 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal5122 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5193 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleGoal5205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal5225 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal5259 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleGoal5342 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5362 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5396 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleGoal5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement5486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement5496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Requirement_in_ruleRequirement5534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement5550 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_For_in_ruleRequirement5614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement5636 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Category_in_ruleRequirement5705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5727 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5763 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleRequirement5834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5854 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Description_in_ruleRequirement5923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5943 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Assertion_in_ruleRequirement6012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6032 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Rationale_in_ruleRequirement6101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6121 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Issues_in_ruleRequirement6190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6210 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6244 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6315 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Goal_in_ruleRequirement6327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement6346 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement6379 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6450 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_Hazard_in_ruleRequirement6462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement6482 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement6516 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleRequirement6587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6609 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6645 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleRequirement6716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6738 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6774 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleRequirement6845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6867 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6903 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6974 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleRequirement6986 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleRequirement6998 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7020 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7034 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7056 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7127 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleRequirement7139 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleRequirement7151 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7173 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7187 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7209 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Verified_in_ruleRequirement7280 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_By_in_ruleRequirement7292 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleRequirement7312 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000040L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7382 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleRequirement7394 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement7414 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7428 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement7448 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7519 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleRequirement7531 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7551 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000041L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7585 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRequirement7641 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument7675 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalDocument7685 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Document_in_ruleExternalDocument7723 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalDocument7739 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_See_in_ruleExternalDocument7757 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_ruleExternalDocument7777 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleExternalDocument7790 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDocUri_in_entryRuleXDocUri7824 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDocUri7834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleXDocUri7882 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_NumberSign_in_ruleXDocUri7896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri7916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory7953 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory7963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Category_in_ruleCategory8001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCategory8017 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_Extends_in_ruleCategory8036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleCategory8058 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleCategory8073 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueString_in_entryRuleValueString8108 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueString8119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueString8158 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder8201 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder8211 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleStakeholder8249 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder8265 = new BitSet(new long[]{0x00085800000000C0L});
    public static final BitSet FOLLOW_Title_in_ruleStakeholder8329 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8349 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Description_in_ruleStakeholder8418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8438 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Role_in_ruleStakeholder8507 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8527 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Oranization_in_ruleStakeholder8596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8616 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Email_in_ruleStakeholder8685 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8705 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Phone_in_ruleStakeholder8774 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8794 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_End_in_ruleStakeholder8854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition8888 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationDecomposition8898 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition8976 = new BitSet(new long[]{0x4020000000000000L});
    public static final BitSet FOLLOW_And_in_ruleVerificationDecomposition8997 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_Or_in_ruleVerificationDecomposition9025 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition9060 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity9096 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationActivity9106 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationActivity9144 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Activity_in_ruleVerificationActivity9156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity9172 = new BitSet(new long[]{0x0040402000200440L});
    public static final BitSet FOLLOW_Title_in_ruleVerificationActivity9191 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity9211 = new BitSet(new long[]{0x0040002000200440L});
    public static final BitSet FOLLOW_Description_in_ruleVerificationActivity9227 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity9247 = new BitSet(new long[]{0x0040002000200400L});
    public static final BitSet FOLLOW_Method_in_ruleVerificationActivity9263 = new BitSet(new long[]{0x0000011100104020L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity9283 = new BitSet(new long[]{0x0040000000200400L});
    public static final BitSet FOLLOW_Decomposed_in_ruleVerificationActivity9299 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_To_in_ruleVerificationActivity9311 = new BitSet(new long[]{0x0040000000200000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleVerificationActivity9331 = new BitSet(new long[]{0x0040000000200000L,0x0000000000000040L});
    public static final BitSet FOLLOW_Assigned_in_ruleVerificationActivity9348 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_To_in_ruleVerificationActivity9360 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9382 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_End_in_ruleVerificationActivity9398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod9433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationMethod9444 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Manual_in_ruleVerificationMethod9482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Automatic_in_ruleVerificationMethod9501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Review_in_ruleVerificationMethod9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Testing_in_ruleVerificationMethod9539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Analysis_in_ruleVerificationMethod9558 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationMethod9577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult9616 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResult9626 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationResult9664 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_Result_in_ruleVerificationResult9676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult9692 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_Of_in_ruleVerificationResult9710 = new BitSet(new long[]{0x0040A24010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult9729 = new BitSet(new long[]{0x0040A24010000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_Output_in_ruleVerificationResult9744 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9764 = new BitSet(new long[]{0x0040A20010000000L});
    public static final BitSet FOLLOW_Logfile_in_ruleVerificationResult9780 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9800 = new BitSet(new long[]{0x0040A20000000000L});
    public static final BitSet FOLLOW_Date_in_ruleVerificationResult9816 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9836 = new BitSet(new long[]{0x0040220000000000L});
    public static final BitSet FOLLOW_State_in_ruleVerificationResult9852 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_ruleVerificationResult9872 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_Status_in_ruleVerificationResult9888 = new BitSet(new long[]{0x0005000200000000L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult9908 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleVerificationResult9923 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_entryRuleQPREF9958 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQPREF9969 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF10009 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQPREF10028 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF10043 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleQNEREF_in_entryRuleQNEREF10090 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNEREF10101 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF10142 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQNEREF10160 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF10177 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleQNEREF10196 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF10211 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_entryRuleQDOTTEDPAREF10258 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQDOTTEDPAREF10269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleQDOTTEDPAREF10317 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000041L});
    public static final BitSet FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10345 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10381 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF10426 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOTTEDREF10437 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF10477 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOTTEDREF10496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF10511 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePAREF_in_entryRulePAREF10558 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePAREF10569 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumberSign_in_rulePAREF10607 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF10622 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_rulePAREF10641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF10656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH10703 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCPATH10714 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10755 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Solidus_in_ruleDOCPATH10773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCPATH10808 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10823 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT10868 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCFRAGMENT10879 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10919 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCFRAGMENT10938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT10953 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_Scheduled_in_ruleVerificationResultState11017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Completed_in_ruleVerificationResultState11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Inprogress_in_ruleVerificationResultState11061 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pass_in_ruleVerificationResultStatus11111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fail_in_ruleVerificationResultStatus11133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unknown_in_ruleVerificationResultStatus11155 = new BitSet(new long[]{0x0000000000000002L});

}
