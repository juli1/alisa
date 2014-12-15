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
import java.util.Map;
import java.util.HashMap;
@SuppressWarnings("all")
public class InternalAlisaParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Organization", "Verification", "Description", "Requirement", "Stakeholder", "Assumption", "Categories", "Decomposes", "Inprogress", "Assertion", "Assurance", "Completed", "Conflicts", "Rationale", "Scheduled", "Activity", "Argument", "Asserted", "Category", "Document", "Evolves", "Extends", "Imports", "Logfile", "Neutral", "Package", "Refines", "Section", "Unknown", "Hazard", "Issues", "Method", "Output", "Result", "Status", "Agree", "Email", "Phone", "State", "Title", "Case", "Date", "Fail", "Goal", "Lute", "Pass", "Role", "With", "And", "End", "For", "See", "ColonColon", "EqualsSignGreaterThanSign", "By", "Of", "Or", "NumberSign", "LeftParenthesis", "RightParenthesis", "Asterisk", "Comma", "FullStop", "Solidus", "Colon", "Semicolon", "EqualsSign", "CommercialAt", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int End=53;
    public static final int RULE_ID=73;
    public static final int Lute=48;
    public static final int Method=35;
    public static final int Unknown=32;
    public static final int RightParenthesis=63;
    public static final int Organization=4;
    public static final int Output=36;
    public static final int RULE_ANY_OTHER=78;
    public static final int LeftParenthesis=62;
    public static final int Issues=34;
    public static final int Assurance=14;
    public static final int Logfile=27;
    public static final int Extends=25;
    public static final int Date=45;
    public static final int Requirement=7;
    public static final int Solidus=67;
    public static final int Verification=5;
    public static final int Case=44;
    public static final int EOF=-1;
    public static final int FullStop=66;
    public static final int Evolves=24;
    public static final int CommercialAt=71;
    public static final int Result=37;
    public static final int Neutral=28;
    public static final int Fail=46;
    public static final int EqualsSignGreaterThanSign=57;
    public static final int Assertion=13;
    public static final int RULE_INT=75;
    public static final int Decomposes=11;
    public static final int Activity=19;
    public static final int Argument=20;
    public static final int Email=40;
    public static final int Or=60;
    public static final int Refines=30;
    public static final int Conflicts=16;
    public static final int And=52;
    public static final int Asterisk=64;
    public static final int Scheduled=18;
    public static final int Phone=41;
    public static final int Hazard=33;
    public static final int Stakeholder=8;
    public static final int Asserted=21;
    public static final int Categories=10;
    public static final int Colon=68;
    public static final int Inprogress=12;
    public static final int Imports=26;
    public static final int Semicolon=69;
    public static final int RULE_SL_COMMENT=77;
    public static final int Package=29;
    public static final int For=54;
    public static final int NumberSign=61;
    public static final int Rationale=17;
    public static final int With=51;
    public static final int Goal=47;
    public static final int RULE_ML_COMMENT=76;
    public static final int By=58;
    public static final int ColonColon=56;
    public static final int Document=23;
    public static final int Description=6;
    public static final int RULE_STRING=72;
    public static final int Completed=15;
    public static final int Agree=39;
    public static final int See=55;
    public static final int Title=43;
    public static final int Status=38;
    public static final int Section=31;
    public static final int Category=22;
    public static final int State=42;
    public static final int RULE_WS=74;
    public static final int Role=50;
    public static final int Comma=65;
    public static final int EqualsSign=70;
    public static final int Of=59;
    public static final int Pass=49;
    public static final int Assumption=9;

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
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAlisaModelRule()); 
            }
            pushFollow(FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel67);
            iv_ruleAlisaModel=ruleAlisaModel();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAlisaModel; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlisaModel77); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:71:1: ruleAlisaModel returns [EObject current=null] : (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization | this_RequirementCategories_2= ruleRequirementCategories | this_VerificationCategories_3= ruleVerificationCategories | this_AssuranceCase_4= ruleAssuranceCase ) ;
    public final EObject ruleAlisaModel() throws RecognitionException {
        EObject current = null;

        EObject this_RSALPackage_0 = null;

        EObject this_Organization_1 = null;

        EObject this_RequirementCategories_2 = null;

        EObject this_VerificationCategories_3 = null;

        EObject this_AssuranceCase_4 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:74:28: ( (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization | this_RequirementCategories_2= ruleRequirementCategories | this_VerificationCategories_3= ruleVerificationCategories | this_AssuranceCase_4= ruleAssuranceCase ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:75:1: (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization | this_RequirementCategories_2= ruleRequirementCategories | this_VerificationCategories_3= ruleVerificationCategories | this_AssuranceCase_4= ruleAssuranceCase )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:75:1: (this_RSALPackage_0= ruleRSALPackage | this_Organization_1= ruleOrganization | this_RequirementCategories_2= ruleRequirementCategories | this_VerificationCategories_3= ruleVerificationCategories | this_AssuranceCase_4= ruleAssuranceCase )
            int alt1=5;
            switch ( input.LA(1) ) {
            case Package:
                {
                alt1=1;
                }
                break;
            case Organization:
                {
                alt1=2;
                }
                break;
            case Requirement:
                {
                alt1=3;
                }
                break;
            case Verification:
                {
                alt1=4;
                }
                break;
            case Assurance:
                {
                alt1=5;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:76:5: this_RSALPackage_0= ruleRSALPackage
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlisaModelAccess().getRSALPackageParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRSALPackage_in_ruleAlisaModel124);
                    this_RSALPackage_0=ruleRSALPackage();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RSALPackage_0;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:86:5: this_Organization_1= ruleOrganization
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlisaModelAccess().getOrganizationParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleOrganization_in_ruleAlisaModel151);
                    this_Organization_1=ruleOrganization();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_Organization_1;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:96:5: this_RequirementCategories_2= ruleRequirementCategories
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlisaModelAccess().getRequirementCategoriesParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleRequirementCategories_in_ruleAlisaModel178);
                    this_RequirementCategories_2=ruleRequirementCategories();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_RequirementCategories_2;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 4 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:106:5: this_VerificationCategories_3= ruleVerificationCategories
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlisaModelAccess().getVerificationCategoriesParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVerificationCategories_in_ruleAlisaModel205);
                    this_VerificationCategories_3=ruleVerificationCategories();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_VerificationCategories_3;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;
                case 5 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:116:5: this_AssuranceCase_4= ruleAssuranceCase
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAlisaModelAccess().getAssuranceCaseParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAssuranceCase_in_ruleAlisaModel232);
                    this_AssuranceCase_4=ruleAssuranceCase();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_AssuranceCase_4;
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAlisaModel"


    // $ANTLR start "entryRuleRSALPackage"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:134:1: entryRuleRSALPackage returns [EObject current=null] : iv_ruleRSALPackage= ruleRSALPackage EOF ;
    public final EObject entryRuleRSALPackage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSALPackage = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:135:2: (iv_ruleRSALPackage= ruleRSALPackage EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:136:2: iv_ruleRSALPackage= ruleRSALPackage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRSALPackageRule()); 
            }
            pushFollow(FOLLOW_ruleRSALPackage_in_entryRuleRSALPackage268);
            iv_ruleRSALPackage=ruleRSALPackage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRSALPackage; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSALPackage278); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:143:1: ruleRSALPackage returns [EObject current=null] : (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End ) ;
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
        EObject lv_content_10_1 = null;

        EObject lv_content_10_2 = null;

        EObject lv_content_10_3 = null;

        EObject lv_content_10_4 = null;

        EObject lv_content_10_5 = null;

        EObject lv_content_10_6 = null;

        AntlrDatatypeRuleToken lv_issue_12_0 = null;

        AntlrDatatypeRuleToken lv_issue_14_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:146:28: ( (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:147:1: (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:147:1: (otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:148:2: otherlv_0= Package ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )? (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )? ( ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) ) )+ (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Package,FOLLOW_Package_in_ruleRSALPackage316); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRSALPackageAccess().getPackageKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:152:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:153:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:153:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:154:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALPackage332); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRSALPackageAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:170:2: (otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )* )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==Imports) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:171:2: otherlv_2= Imports ( (otherlv_3= RULE_ID ) ) (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    {
                    otherlv_2=(Token)match(input,Imports,FOLLOW_Imports_in_ruleRSALPackage351); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRSALPackageAccess().getImportsKeyword_2_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:175:1: ( (otherlv_3= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:176:1: (otherlv_3= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:176:1: (otherlv_3= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:177:3: otherlv_3= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRSALPackageRule());
                      	        }
                              
                    }
                    otherlv_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALPackage370); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_3, grammarAccess.getRSALPackageAccess().getImportedNamespaceRSALContainerCrossReference_2_1_0()); 
                      	
                    }

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:188:2: (otherlv_4= Comma ( (otherlv_5= RULE_ID ) ) )*
                    loop2:
                    do {
                        int alt2=2;
                        int LA2_0 = input.LA(1);

                        if ( (LA2_0==Comma) ) {
                            alt2=1;
                        }


                        switch (alt2) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:189:2: otherlv_4= Comma ( (otherlv_5= RULE_ID ) )
                    	    {
                    	    otherlv_4=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALPackage384); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_4, grammarAccess.getRSALPackageAccess().getCommaKeyword_2_2_0());
                    	          
                    	    }
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:193:1: ( (otherlv_5= RULE_ID ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:194:1: (otherlv_5= RULE_ID )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:194:1: (otherlv_5= RULE_ID )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:195:3: otherlv_5= RULE_ID
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRSALPackageRule());
                    	      	        }
                    	              
                    	    }
                    	    otherlv_5=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALPackage403); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	      		newLeafNode(otherlv_5, grammarAccess.getRSALPackageAccess().getImportedNamespaceRSALContainerCrossReference_2_2_1_0()); 
                    	      	
                    	    }

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:206:6: (otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )* )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==With) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:207:2: otherlv_6= With ( ( ruleQPREF ) ) (otherlv_8= Comma ( ( ruleQPREF ) ) )*
                    {
                    otherlv_6=(Token)match(input,With,FOLLOW_With_in_ruleRSALPackage421); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_6, grammarAccess.getRSALPackageAccess().getWithKeyword_3_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:211:1: ( ( ruleQPREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:212:1: ( ruleQPREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:212:1: ( ruleQPREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:213:3: ruleQPREF
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRSALPackageRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRSALPackageAccess().getImportedNamespaceAadlPackageCrossReference_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQPREF_in_ruleRSALPackage443);
                    ruleQPREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:226:2: (otherlv_8= Comma ( ( ruleQPREF ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==Comma) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:227:2: otherlv_8= Comma ( ( ruleQPREF ) )
                    	    {
                    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALPackage457); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_8, grammarAccess.getRSALPackageAccess().getCommaKeyword_3_2_0());
                    	          
                    	    }
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:231:1: ( ( ruleQPREF ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:232:1: ( ruleQPREF )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:232:1: ( ruleQPREF )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:233:3: ruleQPREF
                    	    {
                    	    if ( state.backtracking==0 ) {

                    	      			if (current==null) {
                    	      	            current = createModelElement(grammarAccess.getRSALPackageRule());
                    	      	        }
                    	              
                    	    }
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRSALPackageAccess().getImportedNamespaceAadlPackageCrossReference_3_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleQPREF_in_ruleRSALPackage479);
                    	    ruleQPREF();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        afterParserOrEnumRuleCall();
                    	      	    
                    	    }

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:246:6: ( ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) ) )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==Verification||LA7_0==Requirement||LA7_0==Document||LA7_0==Section||LA7_0==Goal||LA7_0==CommercialAt) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:247:1: ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:247:1: ( (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:248:1: (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:248:1: (lv_content_10_1= ruleGoal | lv_content_10_2= ruleRequirement | lv_content_10_3= ruleContractualElementProxy | lv_content_10_4= ruleRSALSection | lv_content_10_5= ruleVerificationActivity | lv_content_10_6= ruleExternalDocument )
            	    int alt6=6;
            	    switch ( input.LA(1) ) {
            	    case Goal:
            	        {
            	        alt6=1;
            	        }
            	        break;
            	    case Requirement:
            	        {
            	        alt6=2;
            	        }
            	        break;
            	    case CommercialAt:
            	        {
            	        alt6=3;
            	        }
            	        break;
            	    case Section:
            	        {
            	        alt6=4;
            	        }
            	        break;
            	    case Verification:
            	        {
            	        alt6=5;
            	        }
            	        break;
            	    case Document:
            	        {
            	        alt6=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 6, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt6) {
            	        case 1 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:249:3: lv_content_10_1= ruleGoal
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALPackageAccess().getContentGoalParserRuleCall_4_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGoal_in_ruleRSALPackage506);
            	            lv_content_10_1=ruleGoal();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_10_1, 
            	                      		"Goal");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:264:8: lv_content_10_2= ruleRequirement
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALPackageAccess().getContentRequirementParserRuleCall_4_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequirement_in_ruleRSALPackage525);
            	            lv_content_10_2=ruleRequirement();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_10_2, 
            	                      		"Requirement");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:279:8: lv_content_10_3= ruleContractualElementProxy
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALPackageAccess().getContentContractualElementProxyParserRuleCall_4_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleContractualElementProxy_in_ruleRSALPackage544);
            	            lv_content_10_3=ruleContractualElementProxy();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_10_3, 
            	                      		"ContractualElementProxy");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:294:8: lv_content_10_4= ruleRSALSection
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALPackageAccess().getContentRSALSectionParserRuleCall_4_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRSALSection_in_ruleRSALPackage563);
            	            lv_content_10_4=ruleRSALSection();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_10_4, 
            	                      		"RSALSection");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:309:8: lv_content_10_5= ruleVerificationActivity
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALPackageAccess().getContentVerificationActivityParserRuleCall_4_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVerificationActivity_in_ruleRSALPackage582);
            	            lv_content_10_5=ruleVerificationActivity();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_10_5, 
            	                      		"VerificationActivity");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:324:8: lv_content_10_6= ruleExternalDocument
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALPackageAccess().getContentExternalDocumentParserRuleCall_4_0_5()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExternalDocument_in_ruleRSALPackage601);
            	            lv_content_10_6=ruleExternalDocument();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALPackageRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_10_6, 
            	                      		"ExternalDocument");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:342:3: (otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )* )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==Issues) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:343:2: otherlv_11= Issues ( (lv_issue_12_0= ruleValueString ) ) (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )*
                    {
                    otherlv_11=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRSALPackage619); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_11, grammarAccess.getRSALPackageAccess().getIssuesKeyword_5_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:347:1: ( (lv_issue_12_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:348:1: (lv_issue_12_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:348:1: (lv_issue_12_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:349:3: lv_issue_12_0= ruleValueString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRSALPackageAccess().getIssueValueStringParserRuleCall_5_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueString_in_ruleRSALPackage639);
                    lv_issue_12_0=ruleValueString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:365:2: (otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) ) )*
                    loop8:
                    do {
                        int alt8=2;
                        int LA8_0 = input.LA(1);

                        if ( (LA8_0==Comma) ) {
                            alt8=1;
                        }


                        switch (alt8) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:366:2: otherlv_13= Comma ( (lv_issue_14_0= ruleValueString ) )
                    	    {
                    	    otherlv_13=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALPackage653); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_13, grammarAccess.getRSALPackageAccess().getCommaKeyword_5_2_0());
                    	          
                    	    }
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:370:1: ( (lv_issue_14_0= ruleValueString ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:371:1: (lv_issue_14_0= ruleValueString )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:371:1: (lv_issue_14_0= ruleValueString )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:372:3: lv_issue_14_0= ruleValueString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRSALPackageAccess().getIssueValueStringParserRuleCall_5_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueString_in_ruleRSALPackage673);
                    	    lv_issue_14_0=ruleValueString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop8;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleRSALPackage690); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getRSALPackageAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRSALPackage"


    // $ANTLR start "entryRuleRSALSection"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:401:1: entryRuleRSALSection returns [EObject current=null] : iv_ruleRSALSection= ruleRSALSection EOF ;
    public final EObject entryRuleRSALSection() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRSALSection = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:402:2: (iv_ruleRSALSection= ruleRSALSection EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:403:2: iv_ruleRSALSection= ruleRSALSection EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRSALSectionRule()); 
            }
            pushFollow(FOLLOW_ruleRSALSection_in_entryRuleRSALSection724);
            iv_ruleRSALSection=ruleRSALSection();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRSALSection; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRSALSection734); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:410:1: ruleRSALSection returns [EObject current=null] : (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End ) ;
    public final EObject ruleRSALSection() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        EObject lv_content_4_1 = null;

        EObject lv_content_4_2 = null;

        EObject lv_content_4_3 = null;

        EObject lv_content_4_4 = null;

        EObject lv_content_4_5 = null;

        EObject lv_content_4_6 = null;

        AntlrDatatypeRuleToken lv_issue_6_0 = null;

        AntlrDatatypeRuleToken lv_issue_8_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:413:28: ( (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:414:1: (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:414:1: (otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:415:2: otherlv_0= Section ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= For ( ( ruleQNEREF ) ) )? ( ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) ) )+ (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )? otherlv_9= End
            {
            otherlv_0=(Token)match(input,Section,FOLLOW_Section_in_ruleRSALSection772); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRSALSectionAccess().getSectionKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:419:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:420:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:420:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:421:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRSALSection788); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRSALSectionAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:437:2: (otherlv_2= For ( ( ruleQNEREF ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==For) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:438:2: otherlv_2= For ( ( ruleQNEREF ) )
                    {
                    otherlv_2=(Token)match(input,For,FOLLOW_For_in_ruleRSALSection807); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRSALSectionAccess().getForKeyword_2_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:442:1: ( ( ruleQNEREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:443:1: ( ruleQNEREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:443:1: ( ruleQNEREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:444:3: ruleQNEREF
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRSALSectionRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRSALSectionAccess().getTargetNamedElementCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleQNEREF_in_ruleRSALSection829);
                    ruleQNEREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:457:4: ( ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) ) )+
            int cnt12=0;
            loop12:
            do {
                int alt12=2;
                int LA12_0 = input.LA(1);

                if ( (LA12_0==Verification||LA12_0==Requirement||LA12_0==Document||LA12_0==Section||LA12_0==Goal||LA12_0==CommercialAt) ) {
                    alt12=1;
                }


                switch (alt12) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:458:1: ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:458:1: ( (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:459:1: (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:459:1: (lv_content_4_1= ruleGoal | lv_content_4_2= ruleRequirement | lv_content_4_3= ruleContractualElementProxy | lv_content_4_4= ruleRSALSection | lv_content_4_5= ruleVerificationActivity | lv_content_4_6= ruleExternalDocument )
            	    int alt11=6;
            	    switch ( input.LA(1) ) {
            	    case Goal:
            	        {
            	        alt11=1;
            	        }
            	        break;
            	    case Requirement:
            	        {
            	        alt11=2;
            	        }
            	        break;
            	    case CommercialAt:
            	        {
            	        alt11=3;
            	        }
            	        break;
            	    case Section:
            	        {
            	        alt11=4;
            	        }
            	        break;
            	    case Verification:
            	        {
            	        alt11=5;
            	        }
            	        break;
            	    case Document:
            	        {
            	        alt11=6;
            	        }
            	        break;
            	    default:
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 11, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt11) {
            	        case 1 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:460:3: lv_content_4_1= ruleGoal
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentGoalParserRuleCall_3_0_0()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleGoal_in_ruleRSALSection854);
            	            lv_content_4_1=ruleGoal();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_4_1, 
            	                      		"Goal");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 2 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:475:8: lv_content_4_2= ruleRequirement
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentRequirementParserRuleCall_3_0_1()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRequirement_in_ruleRSALSection873);
            	            lv_content_4_2=ruleRequirement();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_4_2, 
            	                      		"Requirement");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 3 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:490:8: lv_content_4_3= ruleContractualElementProxy
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentContractualElementProxyParserRuleCall_3_0_2()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleContractualElementProxy_in_ruleRSALSection892);
            	            lv_content_4_3=ruleContractualElementProxy();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_4_3, 
            	                      		"ContractualElementProxy");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 4 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:505:8: lv_content_4_4= ruleRSALSection
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentRSALSectionParserRuleCall_3_0_3()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleRSALSection_in_ruleRSALSection911);
            	            lv_content_4_4=ruleRSALSection();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_4_4, 
            	                      		"RSALSection");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 5 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:520:8: lv_content_4_5= ruleVerificationActivity
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentVerificationActivityParserRuleCall_3_0_4()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleVerificationActivity_in_ruleRSALSection930);
            	            lv_content_4_5=ruleVerificationActivity();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_4_5, 
            	                      		"VerificationActivity");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;
            	        case 6 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:535:8: lv_content_4_6= ruleExternalDocument
            	            {
            	            if ( state.backtracking==0 ) {
            	               
            	              	        newCompositeNode(grammarAccess.getRSALSectionAccess().getContentExternalDocumentParserRuleCall_3_0_5()); 
            	              	    
            	            }
            	            pushFollow(FOLLOW_ruleExternalDocument_in_ruleRSALSection949);
            	            lv_content_4_6=ruleExternalDocument();

            	            state._fsp--;
            	            if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	              	        if (current==null) {
            	              	            current = createModelElementForParent(grammarAccess.getRSALSectionRule());
            	              	        }
            	                     		add(
            	                     			current, 
            	                     			"content",
            	                      		lv_content_4_6, 
            	                      		"ExternalDocument");
            	              	        afterParserOrEnumRuleCall();
            	              	    
            	            }

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt12 >= 1 ) break loop12;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(12, input);
                        throw eee;
                }
                cnt12++;
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:553:3: (otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==Issues) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:554:2: otherlv_5= Issues ( (lv_issue_6_0= ruleValueString ) ) (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )*
                    {
                    otherlv_5=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRSALSection967); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_5, grammarAccess.getRSALSectionAccess().getIssuesKeyword_4_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:558:1: ( (lv_issue_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:559:1: (lv_issue_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:559:1: (lv_issue_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:560:3: lv_issue_6_0= ruleValueString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRSALSectionAccess().getIssueValueStringParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueString_in_ruleRSALSection987);
                    lv_issue_6_0=ruleValueString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:576:2: (otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==Comma) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:577:2: otherlv_7= Comma ( (lv_issue_8_0= ruleValueString ) )
                    	    {
                    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRSALSection1001); if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

                    	          	newLeafNode(otherlv_7, grammarAccess.getRSALSectionAccess().getCommaKeyword_4_2_0());
                    	          
                    	    }
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:581:1: ( (lv_issue_8_0= ruleValueString ) )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:582:1: (lv_issue_8_0= ruleValueString )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:582:1: (lv_issue_8_0= ruleValueString )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:583:3: lv_issue_8_0= ruleValueString
                    	    {
                    	    if ( state.backtracking==0 ) {
                    	       
                    	      	        newCompositeNode(grammarAccess.getRSALSectionAccess().getIssueValueStringParserRuleCall_4_2_1_0()); 
                    	      	    
                    	    }
                    	    pushFollow(FOLLOW_ruleValueString_in_ruleRSALSection1021);
                    	    lv_issue_8_0=ruleValueString();

                    	    state._fsp--;
                    	    if (state.failed) return current;
                    	    if ( state.backtracking==0 ) {

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


                    	    }
                    	    break;

                    	default :
                    	    break loop13;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_9=(Token)match(input,End,FOLLOW_End_in_ruleRSALSection1038); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getRSALSectionAccess().getEndKeyword_5());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRSALSection"


    // $ANTLR start "entryRuleOrganization"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:612:1: entryRuleOrganization returns [EObject current=null] : iv_ruleOrganization= ruleOrganization EOF ;
    public final EObject entryRuleOrganization() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrganization = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:613:2: (iv_ruleOrganization= ruleOrganization EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:614:2: iv_ruleOrganization= ruleOrganization EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrganizationRule()); 
            }
            pushFollow(FOLLOW_ruleOrganization_in_entryRuleOrganization1072);
            iv_ruleOrganization=ruleOrganization();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrganization; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrganization1082); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:621:1: ruleOrganization returns [EObject current=null] : (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End ) ;
    public final EObject ruleOrganization() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_3=null;
        EObject lv_stakeholder_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:624:28: ( (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:625:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:625:1: (otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:626:2: otherlv_0= Organization ( (lv_name_1_0= RULE_ID ) ) ( (lv_stakeholder_2_0= ruleStakeholder ) )+ otherlv_3= End
            {
            otherlv_0=(Token)match(input,Organization,FOLLOW_Organization_in_ruleOrganization1120); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getOrganizationAccess().getOrganizationKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:630:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:631:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:631:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:632:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleOrganization1136); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getOrganizationAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:648:2: ( (lv_stakeholder_2_0= ruleStakeholder ) )+
            int cnt15=0;
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==Stakeholder) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:649:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:649:1: (lv_stakeholder_2_0= ruleStakeholder )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:650:3: lv_stakeholder_2_0= ruleStakeholder
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrganizationAccess().getStakeholderStakeholderParserRuleCall_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleStakeholder_in_ruleOrganization1162);
            	    lv_stakeholder_2_0=ruleStakeholder();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }
            	    break;

            	default :
            	    if ( cnt15 >= 1 ) break loop15;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(15, input);
                        throw eee;
                }
                cnt15++;
            } while (true);

            otherlv_3=(Token)match(input,End,FOLLOW_End_in_ruleOrganization1176); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getOrganizationAccess().getEndKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrganization"


    // $ANTLR start "entryRuleDescriptionElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:681:1: entryRuleDescriptionElement returns [EObject current=null] : iv_ruleDescriptionElement= ruleDescriptionElement EOF ;
    public final EObject entryRuleDescriptionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionElement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:682:2: (iv_ruleDescriptionElement= ruleDescriptionElement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:683:2: iv_ruleDescriptionElement= ruleDescriptionElement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDescriptionElementRule()); 
            }
            pushFollow(FOLLOW_ruleDescriptionElement_in_entryRuleDescriptionElement1212);
            iv_ruleDescriptionElement=ruleDescriptionElement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDescriptionElement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionElement1222); if (state.failed) return current;

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
    // $ANTLR end "entryRuleDescriptionElement"


    // $ANTLR start "ruleDescriptionElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:690:1: ruleDescriptionElement returns [EObject current=null] : ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDescriptionElement() throws RecognitionException {
        EObject current = null;

        Token lv_test_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:693:28: ( ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:694:1: ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:694:1: ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==RULE_STRING) ) {
                alt16=1;
            }
            else if ( (LA16_0==RULE_ID) ) {
                alt16=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 16, 0, input);

                throw nvae;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:694:2: ( (lv_test_0_0= RULE_STRING ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:694:2: ( (lv_test_0_0= RULE_STRING ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:695:1: (lv_test_0_0= RULE_STRING )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:695:1: (lv_test_0_0= RULE_STRING )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:696:3: lv_test_0_0= RULE_STRING
                    {
                    lv_test_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescriptionElement1264); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_test_0_0, grammarAccess.getDescriptionElementAccess().getTestSTRINGTerminalRuleCall_0_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getDescriptionElementRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"test",
                              		lv_test_0_0, 
                              		"STRING");
                      	    
                    }

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:713:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:713:6: ( (otherlv_1= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:714:1: (otherlv_1= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:714:1: (otherlv_1= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:715:3: otherlv_1= RULE_ID
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getDescriptionElementRule());
                      	        }
                              
                    }
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDescriptionElement1295); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		newLeafNode(otherlv_1, grammarAccess.getDescriptionElementAccess().getRefRSALVariableCrossReference_1_0()); 
                      	
                    }

                    }


                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleDescriptionElement"


    // $ANTLR start "entryRuleContractualElementProxy"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:736:1: entryRuleContractualElementProxy returns [EObject current=null] : iv_ruleContractualElementProxy= ruleContractualElementProxy EOF ;
    public final EObject entryRuleContractualElementProxy() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractualElementProxy = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:737:2: (iv_ruleContractualElementProxy= ruleContractualElementProxy EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:738:2: iv_ruleContractualElementProxy= ruleContractualElementProxy EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getContractualElementProxyRule()); 
            }
            pushFollow(FOLLOW_ruleContractualElementProxy_in_entryRuleContractualElementProxy1332);
            iv_ruleContractualElementProxy=ruleContractualElementProxy();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleContractualElementProxy; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleContractualElementProxy1342); if (state.failed) return current;

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
    // $ANTLR end "entryRuleContractualElementProxy"


    // $ANTLR start "ruleContractualElementProxy"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:745:1: ruleContractualElementProxy returns [EObject current=null] : (otherlv_0= CommercialAt ( ( ruleDOTTEDREF ) ) ) ;
    public final EObject ruleContractualElementProxy() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:748:28: ( (otherlv_0= CommercialAt ( ( ruleDOTTEDREF ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:749:1: (otherlv_0= CommercialAt ( ( ruleDOTTEDREF ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:749:1: (otherlv_0= CommercialAt ( ( ruleDOTTEDREF ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:750:2: otherlv_0= CommercialAt ( ( ruleDOTTEDREF ) )
            {
            otherlv_0=(Token)match(input,CommercialAt,FOLLOW_CommercialAt_in_ruleContractualElementProxy1380); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getContractualElementProxyAccess().getCommercialAtKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:754:1: ( ( ruleDOTTEDREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:755:1: ( ruleDOTTEDREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:755:1: ( ruleDOTTEDREF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:756:3: ruleDOTTEDREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getContractualElementProxyRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getContractualElementProxyAccess().getProxyreferenceContractualElementCrossReference_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElementProxy1402);
            ruleDOTTEDREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleContractualElementProxy"


    // $ANTLR start "entryRuleGoal"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:777:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:778:2: (iv_ruleGoal= ruleGoal EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:779:2: iv_ruleGoal= ruleGoal EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getGoalRule()); 
            }
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal1437);
            iv_ruleGoal=ruleGoal();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleGoal; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal1447); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:786:1: ruleGoal returns [EObject current=null] : (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_61= End ) ;
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
        Token otherlv_44=null;
        Token otherlv_46=null;
        Token otherlv_47=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_52=null;
        Token otherlv_54=null;
        Token otherlv_56=null;
        Token otherlv_57=null;
        Token otherlv_59=null;
        Token otherlv_61=null;
        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_assert_14_0 = null;

        AntlrDatatypeRuleToken lv_rationale_16_0 = null;

        AntlrDatatypeRuleToken lv_issue_18_0 = null;

        AntlrDatatypeRuleToken lv_issue_20_0 = null;

        EObject lv_docReference_53_0 = null;

        EObject lv_docReference_55_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_58_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_60_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:789:28: ( (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_61= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:790:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_61= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:790:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_61= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:791:2: otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_61= End
            {
            otherlv_0=(Token)match(input,Goal,FOLLOW_Goal_in_ruleGoal1485); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:795:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:796:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:796:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:797:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal1501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getGoalAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:813:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:815:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:815:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:816:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:819:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:820:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:820:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop28:
            do {
                int alt28=17;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:822:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:822:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:823:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:823:101: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:824:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:827:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:827:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:827:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:828:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleGoal1565); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getForKeyword_2_0_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:832:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:833:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:833:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:834:3: ruleQNEREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleGoal1587);
            	    ruleQNEREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:854:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:854:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:855:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:855:101: ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:856:6: ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:859:6: ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:859:7: {...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:859:16: (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:860:2: otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleGoal1656); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getCategoryKeyword_2_1_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:864:1: ( ( ruleCATREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:865:1: ( ruleCATREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:865:1: ( ruleCATREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:866:3: ruleCATREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryRequirementCategoryCrossReference_2_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCATREF_in_ruleGoal1678);
            	    ruleCATREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:879:2: (otherlv_7= Comma ( ( ruleCATREF ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==Comma) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:880:2: otherlv_7= Comma ( ( ruleCATREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal1692); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getCommaKeyword_2_1_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:884:1: ( ( ruleCATREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:885:1: ( ruleCATREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:885:1: ( ruleCATREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:886:3: ruleCATREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryRequirementCategoryCrossReference_2_1_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleCATREF_in_ruleGoal1714);
            	    	    ruleCATREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:906:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:906:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:907:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:907:101: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:908:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:911:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:911:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:911:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:912:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleGoal1785); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getTitleKeyword_2_2_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:916:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:917:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:917:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:918:3: lv_title_10_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal1805);
            	    lv_title_10_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:941:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:941:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:942:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:942:101: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:943:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:946:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:946:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:946:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:947:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleGoal1874); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getDescriptionKeyword_2_3_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:951:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:952:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:952:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:953:3: lv_description_12_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal1894);
            	    lv_description_12_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:976:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:976:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:977:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:977:101: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:978:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:981:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:981:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:981:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:982:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleGoal1963); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getAssertionKeyword_2_4_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:986:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:987:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:987:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:988:3: lv_assert_14_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal1983);
            	    lv_assert_14_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1011:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1011:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1012:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1012:101: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1013:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1016:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1016:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1016:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1017:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleGoal2052); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getRationaleKeyword_2_5_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1021:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1022:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1022:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1023:3: lv_rationale_16_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal2072);
            	    lv_rationale_16_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1046:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1046:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1047:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1047:101: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1048:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1051:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1051:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1051:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1052:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleGoal2141); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getIssuesKeyword_2_6_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1056:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1057:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1057:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1058:3: lv_issue_18_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal2161);
            	    lv_issue_18_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1074:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==Comma) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1075:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal2175); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getCommaKeyword_2_6_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1079:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1080:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1080:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1081:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal2195);
            	    	    lv_issue_20_0=ruleValueString();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop18;
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1104:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1104:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1105:5: {...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1105:101: ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1106:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1109:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1109:7: {...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1109:16: (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1110:2: otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Refines,FOLLOW_Refines_in_ruleGoal2266); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getGoalAccess().getRefinesKeyword_2_7_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1114:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1115:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1115:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1116:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2288);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1129:2: (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==Comma) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1130:2: otherlv_23= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal2302); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_23, grammarAccess.getGoalAccess().getCommaKeyword_2_7_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1134:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1136:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2324);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1156:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1156:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1157:5: {...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1157:101: ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1158:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1161:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1161:7: {...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1161:16: (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1162:2: otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleGoal2395); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_25, grammarAccess.getGoalAccess().getDecomposesKeyword_2_8_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1166:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1167:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1167:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1168:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2417);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1181:2: (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==Comma) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1182:2: otherlv_27= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal2431); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_27, grammarAccess.getGoalAccess().getCommaKeyword_2_8_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1186:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1188:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2453);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1208:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1208:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1209:5: {...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1209:101: ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1210:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1213:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1213:7: {...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1213:16: (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1214:2: otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleGoal2524); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_29, grammarAccess.getGoalAccess().getEvolvesKeyword_2_9_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1218:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1219:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1219:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1220:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2546);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1233:2: (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==Comma) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1234:2: otherlv_31= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal2560); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_31, grammarAccess.getGoalAccess().getCommaKeyword_2_9_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1238:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1239:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1239:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1240:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2582);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1260:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1260:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1261:5: {...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1261:102: ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1262:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1265:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1265:7: {...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1265:16: (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1266:2: otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Conflicts,FOLLOW_Conflicts_in_ruleGoal2653); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_33, grammarAccess.getGoalAccess().getConflictsKeyword_2_10_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1270:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1271:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1271:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1272:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2675);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1285:2: (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==Comma) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1286:2: otherlv_35= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal2689); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_35, grammarAccess.getGoalAccess().getCommaKeyword_2_10_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1290:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1291:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1291:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1292:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2711);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1312:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1312:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1313:5: {...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1313:102: ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1314:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1317:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1317:7: {...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1317:16: (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1318:2: otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleGoal2782); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_37, grammarAccess.getGoalAccess().getStakeholderKeyword_2_11_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1322:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1323:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1323:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1324:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2804);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1337:2: (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==Comma) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1338:2: otherlv_39= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal2818); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_39, grammarAccess.getGoalAccess().getCommaKeyword_2_11_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1342:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1343:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1343:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1344:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2840);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1364:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1364:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1365:5: {...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1365:102: ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1366:6: ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1369:6: ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1369:7: {...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1369:16: (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1370:2: otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,See,FOLLOW_See_in_ruleGoal2911); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_41, grammarAccess.getGoalAccess().getSeeKeyword_2_12_0());
            	          
            	    }
            	    otherlv_42=(Token)match(input,Goal,FOLLOW_Goal_in_ruleGoal2923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_42, grammarAccess.getGoalAccess().getGoalKeyword_2_12_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1379:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1380:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1380:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1381:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2945);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1394:2: (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==Comma) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1395:2: otherlv_44= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_44=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal2959); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_44, grammarAccess.getGoalAccess().getCommaKeyword_2_12_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1399:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1400:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1400:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1401:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal2981);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1421:4: ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1421:4: ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1422:5: {...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1422:102: ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1423:6: ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1426:6: ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1426:7: {...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1426:16: (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1427:2: otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_46=(Token)match(input,See,FOLLOW_See_in_ruleGoal3052); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_46, grammarAccess.getGoalAccess().getSeeKeyword_2_13_0());
            	          
            	    }
            	    otherlv_47=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleGoal3064); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_47, grammarAccess.getGoalAccess().getRequirementKeyword_2_13_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1436:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1437:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1437:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1438:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getGoalRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3086);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1451:2: (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==Comma) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1452:2: otherlv_49= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_49=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal3100); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_49, grammarAccess.getGoalAccess().getCommaKeyword_2_13_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1456:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1457:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1457:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1458:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getGoalRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3122);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1478:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1478:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1479:5: {...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1479:102: ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1480:6: ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1483:6: ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1483:7: {...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1483:16: (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1484:2: otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_51=(Token)match(input,See,FOLLOW_See_in_ruleGoal3193); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_51, grammarAccess.getGoalAccess().getSeeKeyword_2_14_0());
            	          
            	    }
            	    otherlv_52=(Token)match(input,Document,FOLLOW_Document_in_ruleGoal3205); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_52, grammarAccess.getGoalAccess().getDocumentKeyword_2_14_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1493:1: ( (lv_docReference_53_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1494:1: (lv_docReference_53_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1494:1: (lv_docReference_53_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1495:3: lv_docReference_53_0= ruleXDocUri
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal3225);
            	    lv_docReference_53_0=ruleXDocUri();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"docReference",
            	              		lv_docReference_53_0, 
            	              		"XDocUri");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1511:2: (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==Comma) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1512:2: otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_54=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal3239); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_54, grammarAccess.getGoalAccess().getCommaKeyword_2_14_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1516:1: ( (lv_docReference_55_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1517:1: (lv_docReference_55_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1517:1: (lv_docReference_55_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1518:3: lv_docReference_55_0= ruleXDocUri
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal3259);
            	    	    lv_docReference_55_0=ruleXDocUri();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1541:4: ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1541:4: ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1542:5: {...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1542:102: ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1543:6: ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1546:6: ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1546:7: {...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1546:16: (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1547:2: otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_56=(Token)match(input,See,FOLLOW_See_in_ruleGoal3330); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_56, grammarAccess.getGoalAccess().getSeeKeyword_2_15_0());
            	          
            	    }
            	    otherlv_57=(Token)match(input,Colon,FOLLOW_Colon_in_ruleGoal3342); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_57, grammarAccess.getGoalAccess().getColonKeyword_2_15_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1556:1: ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1557:1: (lv_modelReference_58_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1557:1: (lv_modelReference_58_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1558:3: lv_modelReference_58_0= ruleQDOTTEDPAREF
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getGoalAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_15_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal3362);
            	    lv_modelReference_58_0=ruleQDOTTEDPAREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getGoalRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"modelReference",
            	              		lv_modelReference_58_0, 
            	              		"QDOTTEDPAREF");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1574:2: (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==Comma) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1575:2: otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_59=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal3376); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_59, grammarAccess.getGoalAccess().getCommaKeyword_2_15_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1579:1: ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1580:1: (lv_modelReference_60_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1580:1: (lv_modelReference_60_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1581:3: lv_modelReference_60_0= ruleQDOTTEDPAREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getGoalAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_15_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal3396);
            	    	    lv_modelReference_60_0=ruleQDOTTEDPAREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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

            	default :
            	    break loop28;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_2());

            }

            otherlv_61=(Token)match(input,End,FOLLOW_End_in_ruleGoal3452); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_61, grammarAccess.getGoalAccess().getEndKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleGoal"


    // $ANTLR start "entryRuleRequirement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1624:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1625:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1626:2: iv_ruleRequirement= ruleRequirement EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequirementRule()); 
            }
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement3486);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequirement; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement3496); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1633:1: ruleRequirement returns [EObject current=null] : (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_65= End ) ;
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
        Token otherlv_46=null;
        Token otherlv_48=null;
        Token otherlv_49=null;
        Token otherlv_51=null;
        Token otherlv_55=null;
        Token otherlv_56=null;
        Token otherlv_58=null;
        Token otherlv_60=null;
        Token otherlv_61=null;
        Token otherlv_63=null;
        Token otherlv_65=null;
        AntlrDatatypeRuleToken lv_title_10_0 = null;

        AntlrDatatypeRuleToken lv_description_12_0 = null;

        AntlrDatatypeRuleToken lv_assert_14_0 = null;

        AntlrDatatypeRuleToken lv_rationale_16_0 = null;

        AntlrDatatypeRuleToken lv_issue_18_0 = null;

        AntlrDatatypeRuleToken lv_issue_20_0 = null;

        AntlrDatatypeRuleToken lv_hazardReference_28_0 = null;

        AntlrDatatypeRuleToken lv_hazardReference_30_0 = null;

        EObject lv_verifiedBy_53_0 = null;

        EObject lv_argument_54_0 = null;

        EObject lv_docReference_57_0 = null;

        EObject lv_docReference_59_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_62_0 = null;

        AntlrDatatypeRuleToken lv_modelReference_64_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1636:28: ( (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_65= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1637:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_65= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1637:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_65= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1638:2: otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_65= End
            {
            otherlv_0=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleRequirement3534); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1642:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1643:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1643:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1644:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement3550); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRequirementAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1660:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1662:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1662:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1663:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1666:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1667:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1667:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop41:
            do {
                int alt41=19;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1669:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1669:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1670:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1670:108: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1671:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1674:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1674:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1674:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1675:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleRequirement3614); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getForKeyword_2_0_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1679:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1680:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1680:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1681:3: ruleQNEREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement3636);
            	    ruleQNEREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1701:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1701:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1702:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1702:108: ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1703:6: ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1706:6: ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1706:7: {...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1706:16: (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1707:2: otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleRequirement3705); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getCategoryKeyword_2_1_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1711:1: ( ( ruleCATREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1712:1: ( ruleCATREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1712:1: ( ruleCATREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1713:3: ruleCATREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryRequirementCategoryCrossReference_2_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCATREF_in_ruleRequirement3727);
            	    ruleCATREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1726:2: (otherlv_7= Comma ( ( ruleCATREF ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==Comma) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1727:2: otherlv_7= Comma ( ( ruleCATREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement3741); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getCommaKeyword_2_1_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1731:1: ( ( ruleCATREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1732:1: ( ruleCATREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1732:1: ( ruleCATREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1733:3: ruleCATREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryRequirementCategoryCrossReference_2_1_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleCATREF_in_ruleRequirement3763);
            	    	    ruleCATREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1753:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1753:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1754:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1754:108: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1755:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1758:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1758:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1758:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1759:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleRequirement3834); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getTitleKeyword_2_2_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1763:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1764:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1764:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1765:3: lv_title_10_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement3854);
            	    lv_title_10_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1788:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1788:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1789:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1789:108: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1790:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1793:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1793:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1793:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1794:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleRequirement3923); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getDescriptionKeyword_2_3_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1798:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1799:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1799:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1800:3: lv_description_12_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement3943);
            	    lv_description_12_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1823:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1823:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1824:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1824:108: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1825:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1828:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1828:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1828:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1829:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleRequirement4012); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getAssertionKeyword_2_4_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1833:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1834:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1834:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1835:3: lv_assert_14_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement4032);
            	    lv_assert_14_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1858:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1858:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1859:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1859:108: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1860:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1863:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1863:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1863:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1864:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleRequirement4101); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRationaleKeyword_2_5_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1868:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1869:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1869:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1870:3: lv_rationale_16_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement4121);
            	    lv_rationale_16_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1893:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1893:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1894:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1894:108: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1895:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1898:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1898:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1898:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1899:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRequirement4190); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getIssuesKeyword_2_6_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1903:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1904:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1904:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1905:3: lv_issue_18_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement4210);
            	    lv_issue_18_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1921:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==Comma) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1922:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement4224); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getCommaKeyword_2_6_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1926:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1927:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1927:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1928:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement4244);
            	    	    lv_issue_20_0=ruleValueString();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop30;
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1951:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1951:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1952:5: {...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1952:108: ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1953:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1956:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1956:7: {...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1956:16: (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1957:2: otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,See,FOLLOW_See_in_ruleRequirement4315); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getSeeKeyword_2_7_0());
            	          
            	    }
            	    otherlv_22=(Token)match(input,Goal,FOLLOW_Goal_in_ruleRequirement4327); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getGoalKeyword_2_7_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1966:1: ( (otherlv_23= RULE_ID ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1967:1: (otherlv_23= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1967:1: (otherlv_23= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1968:3: otherlv_23= RULE_ID
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement4346); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_2_0()); 
            	      	
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1979:2: (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==Comma) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1980:2: otherlv_24= Comma ( (otherlv_25= RULE_ID ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement4360); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getCommaKeyword_2_7_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1984:1: ( (otherlv_25= RULE_ID ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1985:1: (otherlv_25= RULE_ID )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1985:1: (otherlv_25= RULE_ID )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1986:3: otherlv_25= RULE_ID
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement4379); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      		newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_3_1_0()); 
            	    	      	
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2004:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2004:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2005:5: {...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2005:108: ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2006:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2009:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2009:7: {...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2009:16: (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2010:2: otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    {
            	    otherlv_26=(Token)match(input,See,FOLLOW_See_in_ruleRequirement4450); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getSeeKeyword_2_8_0());
            	          
            	    }
            	    otherlv_27=(Token)match(input,Hazard,FOLLOW_Hazard_in_ruleRequirement4462); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getHazardKeyword_2_8_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2019:1: ( (lv_hazardReference_28_0= ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2020:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2020:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2021:3: lv_hazardReference_28_0= ruleQNEREF
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement4482);
            	    lv_hazardReference_28_0=ruleQNEREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2037:2: (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==Comma) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2038:2: otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement4496); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getCommaKeyword_2_8_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2042:1: ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2043:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2043:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2044:3: lv_hazardReference_30_0= ruleQNEREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement4516);
            	    	    lv_hazardReference_30_0=ruleQNEREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

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


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop32;
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2067:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2067:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2068:5: {...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2068:108: ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2069:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2072:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2072:7: {...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2072:16: (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2073:2: otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_31=(Token)match(input,Refines,FOLLOW_Refines_in_ruleRequirement4587); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_31, grammarAccess.getRequirementAccess().getRefinesKeyword_2_9_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2077:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2078:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2078:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2079:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement4609);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2092:2: (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==Comma) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2093:2: otherlv_33= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_33=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement4623); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getCommaKeyword_2_9_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2097:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2098:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2098:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2099:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement4645);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2119:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2119:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2120:5: {...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2120:109: ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2121:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2124:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2124:7: {...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2124:16: (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2125:2: otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_35=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleRequirement4716); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_35, grammarAccess.getRequirementAccess().getDecomposesKeyword_2_10_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2129:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2130:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2130:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2131:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement4738);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2144:2: (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==Comma) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2145:2: otherlv_37= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement4752); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getCommaKeyword_2_10_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2149:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2150:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2150:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2151:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement4774);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2171:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2171:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2172:5: {...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2172:109: ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2173:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2176:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2176:7: {...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2176:16: (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2177:2: otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_39=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleRequirement4845); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_39, grammarAccess.getRequirementAccess().getEvolvesKeyword_2_11_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2181:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2182:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2182:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2183:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement4867);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2196:2: (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==Comma) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2197:2: otherlv_41= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement4881); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_41, grammarAccess.getRequirementAccess().getCommaKeyword_2_11_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2201:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2202:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2202:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2203:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement4903);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2223:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2223:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2224:5: {...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2224:109: ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2225:6: ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2228:6: ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2228:7: {...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2228:16: (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2229:2: otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_43=(Token)match(input,See,FOLLOW_See_in_ruleRequirement4974); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_43, grammarAccess.getRequirementAccess().getSeeKeyword_2_12_0());
            	          
            	    }
            	    otherlv_44=(Token)match(input,Goal,FOLLOW_Goal_in_ruleRequirement4986); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_44, grammarAccess.getRequirementAccess().getGoalKeyword_2_12_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2238:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2239:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2239:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2240:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5008);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2253:2: (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==Comma) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2254:2: otherlv_46= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_46=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5022); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_46, grammarAccess.getRequirementAccess().getCommaKeyword_2_12_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2258:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2259:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2259:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2260:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5044);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2280:4: ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2280:4: ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2281:5: {...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2281:109: ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2282:6: ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2285:6: ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2285:7: {...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2285:16: (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2286:2: otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_48=(Token)match(input,See,FOLLOW_See_in_ruleRequirement5115); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_48, grammarAccess.getRequirementAccess().getSeeKeyword_2_13_0());
            	          
            	    }
            	    otherlv_49=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleRequirement5127); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_49, grammarAccess.getRequirementAccess().getRequirementKeyword_2_13_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2295:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2296:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2296:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2297:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5149);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2310:2: (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==Comma) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2311:2: otherlv_51= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5163); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_51, grammarAccess.getRequirementAccess().getCommaKeyword_2_13_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2315:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2316:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2316:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2317:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5185);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2337:4: ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2337:4: ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2338:5: {...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2338:109: ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2339:6: ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2342:6: ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+
            	    int cnt38=0;
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==Verification) ) {
            	            int LA38_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt38=1;
            	            }


            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2342:7: {...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2342:16: ( (lv_verifiedBy_53_0= ruleVerificationActivity ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2343:1: (lv_verifiedBy_53_0= ruleVerificationActivity )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2343:1: (lv_verifiedBy_53_0= ruleVerificationActivity )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2344:3: lv_verifiedBy_53_0= ruleVerificationActivity
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getVerifiedByVerificationActivityParserRuleCall_2_14_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleVerificationActivity_in_ruleRequirement5263);
            	    	    lv_verifiedBy_53_0=ruleVerificationActivity();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"verifiedBy",
            	    	              		lv_verifiedBy_53_0, 
            	    	              		"VerificationActivity");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt38 >= 1 ) break loop38;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(38, input);
            	                throw eee;
            	        }
            	        cnt38++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2367:4: ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2367:4: ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2368:5: {...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2368:109: ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2369:6: ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2372:6: ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2372:7: {...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2372:16: ( (lv_argument_54_0= ruleAssuranceArgument ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2373:1: (lv_argument_54_0= ruleAssuranceArgument )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2373:1: (lv_argument_54_0= ruleAssuranceArgument )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2374:3: lv_argument_54_0= ruleAssuranceArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getArgumentAssuranceArgumentParserRuleCall_2_15_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssuranceArgument_in_ruleRequirement5339);
            	    lv_argument_54_0=ruleAssuranceArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"argument",
            	              		lv_argument_54_0, 
            	              		"AssuranceArgument");
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
            	case 17 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2397:4: ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2397:4: ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2398:5: {...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2398:109: ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2399:6: ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2402:6: ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2402:7: {...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2402:16: (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2403:2: otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_55=(Token)match(input,See,FOLLOW_See_in_ruleRequirement5407); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_55, grammarAccess.getRequirementAccess().getSeeKeyword_2_16_0());
            	          
            	    }
            	    otherlv_56=(Token)match(input,Document,FOLLOW_Document_in_ruleRequirement5419); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_56, grammarAccess.getRequirementAccess().getDocumentKeyword_2_16_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2412:1: ( (lv_docReference_57_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2413:1: (lv_docReference_57_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2413:1: (lv_docReference_57_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2414:3: lv_docReference_57_0= ruleXDocUri
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_16_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement5439);
            	    lv_docReference_57_0=ruleXDocUri();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRequirementRule());
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2430:2: (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==Comma) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2431:2: otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_58=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5453); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_58, grammarAccess.getRequirementAccess().getCommaKeyword_2_16_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2435:1: ( (lv_docReference_59_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2436:1: (lv_docReference_59_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2436:1: (lv_docReference_59_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2437:3: lv_docReference_59_0= ruleXDocUri
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_16_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement5473);
            	    	    lv_docReference_59_0=ruleXDocUri();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"docReference",
            	    	              		lv_docReference_59_0, 
            	    	              		"XDocUri");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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
            	case 18 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2460:4: ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2460:4: ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2461:5: {...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 17) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 17)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2461:109: ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2462:6: ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 17);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2465:6: ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2465:7: {...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2465:16: (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2466:2: otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_60=(Token)match(input,See,FOLLOW_See_in_ruleRequirement5544); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_60, grammarAccess.getRequirementAccess().getSeeKeyword_2_17_0());
            	          
            	    }
            	    otherlv_61=(Token)match(input,Colon,FOLLOW_Colon_in_ruleRequirement5556); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_61, grammarAccess.getRequirementAccess().getColonKeyword_2_17_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2475:1: ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2476:1: (lv_modelReference_62_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2476:1: (lv_modelReference_62_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2477:3: lv_modelReference_62_0= ruleQDOTTEDPAREF
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_17_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement5576);
            	    lv_modelReference_62_0=ruleQDOTTEDPAREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRequirementRule());
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2493:2: (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )*
            	    loop40:
            	    do {
            	        int alt40=2;
            	        int LA40_0 = input.LA(1);

            	        if ( (LA40_0==Comma) ) {
            	            alt40=1;
            	        }


            	        switch (alt40) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2494:2: otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_63=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5590); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_63, grammarAccess.getRequirementAccess().getCommaKeyword_2_17_3_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2498:1: ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2499:1: (lv_modelReference_64_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2499:1: (lv_modelReference_64_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2500:3: lv_modelReference_64_0= ruleQDOTTEDPAREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getRequirementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_17_3_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement5610);
            	    	    lv_modelReference_64_0=ruleQDOTTEDPAREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getRequirementRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"modelReference",
            	    	              		lv_modelReference_64_0, 
            	    	              		"QDOTTEDPAREF");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	default :
            	    break loop41;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getRequirementAccess().getUnorderedGroup_2());

            }

            otherlv_65=(Token)match(input,End,FOLLOW_End_in_ruleRequirement5666); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_65, grammarAccess.getRequirementAccess().getEndKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRequirement"


    // $ANTLR start "entryRuleVerificationAssumption"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2543:1: entryRuleVerificationAssumption returns [EObject current=null] : iv_ruleVerificationAssumption= ruleVerificationAssumption EOF ;
    public final EObject entryRuleVerificationAssumption() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationAssumption = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2544:2: (iv_ruleVerificationAssumption= ruleVerificationAssumption EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2545:2: iv_ruleVerificationAssumption= ruleVerificationAssumption EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerificationAssumptionRule()); 
            }
            pushFollow(FOLLOW_ruleVerificationAssumption_in_entryRuleVerificationAssumption5700);
            iv_ruleVerificationAssumption=ruleVerificationAssumption();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerificationAssumption; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationAssumption5710); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVerificationAssumption"


    // $ANTLR start "ruleVerificationAssumption"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2552:1: ruleVerificationAssumption returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Assumption ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) ) ) otherlv_25= End ) ;
    public final EObject ruleVerificationAssumption() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_title_11_0 = null;

        AntlrDatatypeRuleToken lv_description_13_0 = null;

        EObject lv_verifiedBy_17_0 = null;

        EObject lv_argument_18_0 = null;

        AntlrDatatypeRuleToken lv_rationale_20_0 = null;

        AntlrDatatypeRuleToken lv_issue_22_0 = null;

        AntlrDatatypeRuleToken lv_issue_24_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2555:28: ( (otherlv_0= Verification otherlv_1= Assumption ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) ) ) otherlv_25= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2556:1: (otherlv_0= Verification otherlv_1= Assumption ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) ) ) otherlv_25= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2556:1: (otherlv_0= Verification otherlv_1= Assumption ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) ) ) otherlv_25= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2557:2: otherlv_0= Verification otherlv_1= Assumption ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) ) ) otherlv_25= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationAssumption5748); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVerificationAssumptionAccess().getVerificationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Assumption,FOLLOW_Assumption_in_ruleVerificationAssumption5760); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVerificationAssumptionAccess().getAssumptionKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2566:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2567:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2567:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2568:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationAssumption5776); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVerificationAssumptionAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVerificationAssumptionRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2584:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2586:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2586:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2587:2: ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2590:2: ( ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2591:3: ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2591:3: ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )*
            loop45:
            do {
                int alt45=10;
                alt45 = dfa45.predict(input);
                switch (alt45) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2593:4: ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2593:4: ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2594:5: {...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2594:119: ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2595:6: ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 0);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2598:6: ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2598:7: {...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2598:16: (otherlv_4= For ( ( ruleDOTTEDREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2599:2: otherlv_4= For ( ( ruleDOTTEDREF ) )
            	    {
            	    otherlv_4=(Token)match(input,For,FOLLOW_For_in_ruleVerificationAssumption5840); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getVerificationAssumptionAccess().getForKeyword_3_0_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2603:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2604:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2604:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2605:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getTargetVerificationActivityCrossReference_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationAssumption5862);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2625:4: ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2625:4: ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2626:5: {...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2626:119: ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2627:6: ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 1);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2630:6: ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2630:7: {...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2630:16: (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2631:2: otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )*
            	    {
            	    otherlv_6=(Token)match(input,Category,FOLLOW_Category_in_ruleVerificationAssumption5931); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getVerificationAssumptionAccess().getCategoryKeyword_3_1_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2635:1: ( ( ruleCATREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2636:1: ( ruleCATREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2636:1: ( ruleCATREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2637:3: ruleCATREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getCategoryRequirementCategoryCrossReference_3_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCATREF_in_ruleVerificationAssumption5953);
            	    ruleCATREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2650:2: (otherlv_8= Comma ( ( ruleCATREF ) ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==Comma) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2651:2: otherlv_8= Comma ( ( ruleCATREF ) )
            	    	    {
            	    	    otherlv_8=(Token)match(input,Comma,FOLLOW_Comma_in_ruleVerificationAssumption5967); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_8, grammarAccess.getVerificationAssumptionAccess().getCommaKeyword_3_1_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2655:1: ( ( ruleCATREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2656:1: ( ruleCATREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2656:1: ( ruleCATREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2657:3: ruleCATREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getVerificationAssumptionRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getCategoryRequirementCategoryCrossReference_3_1_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleCATREF_in_ruleVerificationAssumption5989);
            	    	    ruleCATREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2677:4: ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2677:4: ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2678:5: {...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2678:119: ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2679:6: ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 2);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2682:6: ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2682:7: {...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2682:16: (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2683:2: otherlv_10= Title ( (lv_title_11_0= ruleValueString ) )
            	    {
            	    otherlv_10=(Token)match(input,Title,FOLLOW_Title_in_ruleVerificationAssumption6060); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getVerificationAssumptionAccess().getTitleKeyword_3_2_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2687:1: ( (lv_title_11_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2688:1: (lv_title_11_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2688:1: (lv_title_11_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2689:3: lv_title_11_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getTitleValueStringParserRuleCall_3_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationAssumption6080);
            	    lv_title_11_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"title",
            	              		lv_title_11_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2712:4: ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2712:4: ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2713:5: {...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2713:119: ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2714:6: ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 3);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2717:6: ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2717:7: {...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2717:16: (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2718:2: otherlv_12= Description ( (lv_description_13_0= ruleValueString ) )
            	    {
            	    otherlv_12=(Token)match(input,Description,FOLLOW_Description_in_ruleVerificationAssumption6149); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getVerificationAssumptionAccess().getDescriptionKeyword_3_3_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2722:1: ( (lv_description_13_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2723:1: (lv_description_13_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2723:1: (lv_description_13_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2724:3: lv_description_13_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getDescriptionValueStringParserRuleCall_3_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationAssumption6169);
            	    lv_description_13_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"description",
            	              		lv_description_13_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2747:4: ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2747:4: ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2748:5: {...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2748:119: ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2749:6: ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 4);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2752:6: ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2752:7: {...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2752:16: (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2753:2: otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) )
            	    {
            	    otherlv_14=(Token)match(input,Asserted,FOLLOW_Asserted_in_ruleVerificationAssumption6238); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getVerificationAssumptionAccess().getAssertedKeyword_3_4_0());
            	          
            	    }
            	    otherlv_15=(Token)match(input,By,FOLLOW_By_in_ruleVerificationAssumption6250); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_15, grammarAccess.getVerificationAssumptionAccess().getByKeyword_3_4_1());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2762:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2763:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2763:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2764:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getAssertRequirementCrossReference_3_4_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationAssumption6272);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 6 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2784:4: ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2784:4: ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2785:5: {...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 5) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2785:119: ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2786:6: ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 5);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2789:6: ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+
            	    int cnt43=0;
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==Verification) ) {
            	            int LA43_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt43=1;
            	            }


            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2789:7: {...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2789:16: ( (lv_verifiedBy_17_0= ruleVerificationActivity ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2790:1: (lv_verifiedBy_17_0= ruleVerificationActivity )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2790:1: (lv_verifiedBy_17_0= ruleVerificationActivity )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2791:3: lv_verifiedBy_17_0= ruleVerificationActivity
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getVerifiedByVerificationActivityParserRuleCall_3_5_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleVerificationActivity_in_ruleVerificationAssumption6348);
            	    	    lv_verifiedBy_17_0=ruleVerificationActivity();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getVerificationAssumptionRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"verifiedBy",
            	    	              		lv_verifiedBy_17_0, 
            	    	              		"VerificationActivity");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt43 >= 1 ) break loop43;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(43, input);
            	                throw eee;
            	        }
            	        cnt43++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 7 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2814:4: ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2814:4: ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2815:5: {...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 6) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2815:119: ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2816:6: ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 6);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2819:6: ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2819:7: {...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2819:16: ( (lv_argument_18_0= ruleAssuranceArgument ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2820:1: (lv_argument_18_0= ruleAssuranceArgument )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2820:1: (lv_argument_18_0= ruleAssuranceArgument )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2821:3: lv_argument_18_0= ruleAssuranceArgument
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getArgumentAssuranceArgumentParserRuleCall_3_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssuranceArgument_in_ruleVerificationAssumption6424);
            	    lv_argument_18_0=ruleAssuranceArgument();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"argument",
            	              		lv_argument_18_0, 
            	              		"AssuranceArgument");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2844:4: ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2844:4: ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2845:5: {...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 7) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2845:119: ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2846:6: ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 7);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2849:6: ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2849:7: {...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2849:16: (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2850:2: otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) )
            	    {
            	    otherlv_19=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleVerificationAssumption6492); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_19, grammarAccess.getVerificationAssumptionAccess().getRationaleKeyword_3_7_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2854:1: ( (lv_rationale_20_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2855:1: (lv_rationale_20_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2855:1: (lv_rationale_20_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2856:3: lv_rationale_20_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getRationaleValueStringParserRuleCall_3_7_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationAssumption6512);
            	    lv_rationale_20_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"rationale",
            	              		lv_rationale_20_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2879:4: ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2879:4: ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2880:5: {...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 8) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2880:119: ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2881:6: ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 8);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2884:6: ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2884:7: {...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationAssumption", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2884:16: (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2885:2: otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Issues,FOLLOW_Issues_in_ruleVerificationAssumption6581); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_21, grammarAccess.getVerificationAssumptionAccess().getIssuesKeyword_3_8_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2889:1: ( (lv_issue_22_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2890:1: (lv_issue_22_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2890:1: (lv_issue_22_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2891:3: lv_issue_22_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getIssueValueStringParserRuleCall_3_8_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationAssumption6601);
            	    lv_issue_22_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationAssumptionRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"issue",
            	              		lv_issue_22_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2907:2: (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==Comma) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2908:2: otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleVerificationAssumption6615); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_23, grammarAccess.getVerificationAssumptionAccess().getCommaKeyword_3_8_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2912:1: ( (lv_issue_24_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2913:1: (lv_issue_24_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2913:1: (lv_issue_24_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2914:3: lv_issue_24_0= ruleValueString
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getVerificationAssumptionAccess().getIssueValueStringParserRuleCall_3_8_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationAssumption6635);
            	    	    lv_issue_24_0=ruleValueString();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getVerificationAssumptionRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"issue",
            	    	              		lv_issue_24_0, 
            	    	              		"ValueString");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

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

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

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

            getUnorderedGroupHelper().leave(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3());

            }

            otherlv_25=(Token)match(input,End,FOLLOW_End_in_ruleVerificationAssumption6691); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_25, grammarAccess.getVerificationAssumptionAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationAssumption"


    // $ANTLR start "entryRuleExternalDocument"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2957:1: entryRuleExternalDocument returns [EObject current=null] : iv_ruleExternalDocument= ruleExternalDocument EOF ;
    public final EObject entryRuleExternalDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDocument = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2958:2: (iv_ruleExternalDocument= ruleExternalDocument EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2959:2: iv_ruleExternalDocument= ruleExternalDocument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getExternalDocumentRule()); 
            }
            pushFollow(FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument6725);
            iv_ruleExternalDocument=ruleExternalDocument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleExternalDocument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalDocument6735); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2966:1: ruleExternalDocument returns [EObject current=null] : (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) ;
    public final EObject ruleExternalDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_externalReference_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2969:28: ( (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2970:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2970:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2971:2: otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End
            {
            otherlv_0=(Token)match(input,Document,FOLLOW_Document_in_ruleExternalDocument6773); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getExternalDocumentAccess().getDocumentKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2975:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2976:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2976:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2977:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalDocument6789); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getExternalDocumentAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_2=(Token)match(input,See,FOLLOW_See_in_ruleExternalDocument6807); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getExternalDocumentAccess().getSeeKeyword_2());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2998:1: ( (lv_externalReference_3_0= ruleDOCPATH ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2999:1: (lv_externalReference_3_0= ruleDOCPATH )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2999:1: (lv_externalReference_3_0= ruleDOCPATH )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3000:3: lv_externalReference_3_0= ruleDOCPATH
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getExternalDocumentAccess().getExternalReferenceDOCPATHParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDOCPATH_in_ruleExternalDocument6827);
            lv_externalReference_3_0=ruleDOCPATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

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


            }

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleExternalDocument6840); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getExternalDocumentAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleExternalDocument"


    // $ANTLR start "entryRuleXDocUri"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3029:1: entryRuleXDocUri returns [EObject current=null] : iv_ruleXDocUri= ruleXDocUri EOF ;
    public final EObject entryRuleXDocUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDocUri = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3030:2: (iv_ruleXDocUri= ruleXDocUri EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3031:2: iv_ruleXDocUri= ruleXDocUri EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getXDocUriRule()); 
            }
            pushFollow(FOLLOW_ruleXDocUri_in_entryRuleXDocUri6874);
            iv_ruleXDocUri=ruleXDocUri();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleXDocUri; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDocUri6884); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3038:1: ruleXDocUri returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) ;
    public final EObject ruleXDocUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_docFragment_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3041:28: ( ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3042:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3042:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3042:2: ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3042:2: ( ( ruleDOTTEDREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3043:1: ( ruleDOTTEDREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3043:1: ( ruleDOTTEDREF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3044:3: ruleDOTTEDREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getXDocUriRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocReferenceExternalDocumentCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleXDocUri6932);
            ruleDOTTEDREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3057:2: (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            int alt46=2;
            int LA46_0 = input.LA(1);

            if ( (LA46_0==NumberSign) ) {
                alt46=1;
            }
            switch (alt46) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3058:2: otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    {
                    otherlv_1=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_ruleXDocUri6946); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getXDocUriAccess().getNumberSignKeyword_1_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3062:1: ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3063:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3063:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3064:3: lv_docFragment_2_0= ruleDOCFRAGMENT
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocFragmentDOCFRAGMENTParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri6966);
                    lv_docFragment_2_0=ruleDOCFRAGMENT();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

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


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleXDocUri"


    // $ANTLR start "entryRuleRequirementCategories"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3088:1: entryRuleRequirementCategories returns [EObject current=null] : iv_ruleRequirementCategories= ruleRequirementCategories EOF ;
    public final EObject entryRuleRequirementCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementCategories = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3089:2: (iv_ruleRequirementCategories= ruleRequirementCategories EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3090:2: iv_ruleRequirementCategories= ruleRequirementCategories EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequirementCategoriesRule()); 
            }
            pushFollow(FOLLOW_ruleRequirementCategories_in_entryRuleRequirementCategories7003);
            iv_ruleRequirementCategories=ruleRequirementCategories();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequirementCategories; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementCategories7013); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequirementCategories"


    // $ANTLR start "ruleRequirementCategories"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3097:1: ruleRequirementCategories returns [EObject current=null] : (otherlv_0= Requirement otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleRequirementCategory ) )+ otherlv_4= End ) ;
    public final EObject ruleRequirementCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_category_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3100:28: ( (otherlv_0= Requirement otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleRequirementCategory ) )+ otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3101:1: (otherlv_0= Requirement otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleRequirementCategory ) )+ otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3101:1: (otherlv_0= Requirement otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleRequirementCategory ) )+ otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3102:2: otherlv_0= Requirement otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleRequirementCategory ) )+ otherlv_4= End
            {
            otherlv_0=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleRequirementCategories7051); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequirementCategoriesAccess().getRequirementKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Categories,FOLLOW_Categories_in_ruleRequirementCategories7063); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getRequirementCategoriesAccess().getCategoriesKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3111:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3112:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3112:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3113:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementCategories7079); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getRequirementCategoriesAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequirementCategoriesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3129:2: ( (lv_category_3_0= ruleRequirementCategory ) )+
            int cnt47=0;
            loop47:
            do {
                int alt47=2;
                int LA47_0 = input.LA(1);

                if ( (LA47_0==Category) ) {
                    alt47=1;
                }


                switch (alt47) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3130:1: (lv_category_3_0= ruleRequirementCategory )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3130:1: (lv_category_3_0= ruleRequirementCategory )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3131:3: lv_category_3_0= ruleRequirementCategory
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getRequirementCategoriesAccess().getCategoryRequirementCategoryParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleRequirementCategory_in_ruleRequirementCategories7105);
            	    lv_category_3_0=ruleRequirementCategory();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getRequirementCategoriesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"category",
            	              		lv_category_3_0, 
            	              		"RequirementCategory");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt47 >= 1 ) break loop47;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(47, input);
                        throw eee;
                }
                cnt47++;
            } while (true);

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleRequirementCategories7119); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getRequirementCategoriesAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRequirementCategories"


    // $ANTLR start "entryRuleVerificationCategories"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3160:1: entryRuleVerificationCategories returns [EObject current=null] : iv_ruleVerificationCategories= ruleVerificationCategories EOF ;
    public final EObject entryRuleVerificationCategories() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationCategories = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3161:2: (iv_ruleVerificationCategories= ruleVerificationCategories EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3162:2: iv_ruleVerificationCategories= ruleVerificationCategories EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerificationCategoriesRule()); 
            }
            pushFollow(FOLLOW_ruleVerificationCategories_in_entryRuleVerificationCategories7153);
            iv_ruleVerificationCategories=ruleVerificationCategories();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerificationCategories; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationCategories7163); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVerificationCategories"


    // $ANTLR start "ruleVerificationCategories"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3169:1: ruleVerificationCategories returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleVerificationCategory ) )+ otherlv_4= End ) ;
    public final EObject ruleVerificationCategories() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        EObject lv_category_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3172:28: ( (otherlv_0= Verification otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleVerificationCategory ) )+ otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3173:1: (otherlv_0= Verification otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleVerificationCategory ) )+ otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3173:1: (otherlv_0= Verification otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleVerificationCategory ) )+ otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3174:2: otherlv_0= Verification otherlv_1= Categories ( (lv_name_2_0= RULE_ID ) ) ( (lv_category_3_0= ruleVerificationCategory ) )+ otherlv_4= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationCategories7201); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVerificationCategoriesAccess().getVerificationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Categories,FOLLOW_Categories_in_ruleVerificationCategories7213); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVerificationCategoriesAccess().getCategoriesKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3183:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3184:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3184:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3185:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationCategories7229); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVerificationCategoriesAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVerificationCategoriesRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3201:2: ( (lv_category_3_0= ruleVerificationCategory ) )+
            int cnt48=0;
            loop48:
            do {
                int alt48=2;
                int LA48_0 = input.LA(1);

                if ( (LA48_0==Category) ) {
                    alt48=1;
                }


                switch (alt48) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3202:1: (lv_category_3_0= ruleVerificationCategory )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3202:1: (lv_category_3_0= ruleVerificationCategory )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3203:3: lv_category_3_0= ruleVerificationCategory
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationCategoriesAccess().getCategoryVerificationCategoryParserRuleCall_3_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVerificationCategory_in_ruleVerificationCategories7255);
            	    lv_category_3_0=ruleVerificationCategory();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationCategoriesRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"category",
            	              		lv_category_3_0, 
            	              		"VerificationCategory");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt48 >= 1 ) break loop48;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(48, input);
                        throw eee;
                }
                cnt48++;
            } while (true);

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleVerificationCategories7269); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getVerificationCategoriesAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationCategories"


    // $ANTLR start "entryRuleRequirementCategory"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3234:1: entryRuleRequirementCategory returns [EObject current=null] : iv_ruleRequirementCategory= ruleRequirementCategory EOF ;
    public final EObject entryRuleRequirementCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementCategory = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3235:2: (iv_ruleRequirementCategory= ruleRequirementCategory EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3236:2: iv_ruleRequirementCategory= ruleRequirementCategory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRequirementCategoryRule()); 
            }
            pushFollow(FOLLOW_ruleRequirementCategory_in_entryRuleRequirementCategory7305);
            iv_ruleRequirementCategory=ruleRequirementCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRequirementCategory; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementCategory7315); if (state.failed) return current;

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
    // $ANTLR end "entryRuleRequirementCategory"


    // $ANTLR start "ruleRequirementCategory"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3243:1: ruleRequirementCategory returns [EObject current=null] : (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? ) ;
    public final EObject ruleRequirementCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3246:28: ( (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3247:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3247:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3248:2: otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )?
            {
            otherlv_0=(Token)match(input,Category,FOLLOW_Category_in_ruleRequirementCategory7353); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getRequirementCategoryAccess().getCategoryKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3252:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3253:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3253:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3254:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementCategory7369); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getRequirementCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getRequirementCategoryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3270:2: (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )?
            int alt49=2;
            int LA49_0 = input.LA(1);

            if ( (LA49_0==Extends) ) {
                alt49=1;
            }
            switch (alt49) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3271:2: otherlv_2= Extends ( ( ruleDOTTEDREF ) )
                    {
                    otherlv_2=(Token)match(input,Extends,FOLLOW_Extends_in_ruleRequirementCategory7388); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getRequirementCategoryAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3275:1: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3276:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3276:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3277:3: ruleDOTTEDREF
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getRequirementCategoryRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getRequirementCategoryAccess().getExtendsRequirementCategoryCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirementCategory7410);
                    ruleDOTTEDREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleRequirementCategory"


    // $ANTLR start "entryRuleVerificationCategory"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3298:1: entryRuleVerificationCategory returns [EObject current=null] : iv_ruleVerificationCategory= ruleVerificationCategory EOF ;
    public final EObject entryRuleVerificationCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationCategory = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3299:2: (iv_ruleVerificationCategory= ruleVerificationCategory EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3300:2: iv_ruleVerificationCategory= ruleVerificationCategory EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerificationCategoryRule()); 
            }
            pushFollow(FOLLOW_ruleVerificationCategory_in_entryRuleVerificationCategory7447);
            iv_ruleVerificationCategory=ruleVerificationCategory();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerificationCategory; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationCategory7457); if (state.failed) return current;

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
    // $ANTLR end "entryRuleVerificationCategory"


    // $ANTLR start "ruleVerificationCategory"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3307:1: ruleVerificationCategory returns [EObject current=null] : (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? ) ;
    public final EObject ruleVerificationCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3310:28: ( (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3311:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3311:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3312:2: otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )?
            {
            otherlv_0=(Token)match(input,Category,FOLLOW_Category_in_ruleVerificationCategory7495); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVerificationCategoryAccess().getCategoryKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3316:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3317:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3317:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3318:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationCategory7511); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getVerificationCategoryAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVerificationCategoryRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_1_0, 
                      		"ID");
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3334:2: (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )?
            int alt50=2;
            int LA50_0 = input.LA(1);

            if ( (LA50_0==Extends) ) {
                alt50=1;
            }
            switch (alt50) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3335:2: otherlv_2= Extends ( ( ruleDOTTEDREF ) )
                    {
                    otherlv_2=(Token)match(input,Extends,FOLLOW_Extends_in_ruleVerificationCategory7530); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getVerificationCategoryAccess().getExtendsKeyword_2_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3339:1: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3340:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3340:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3341:3: ruleDOTTEDREF
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getVerificationCategoryRule());
                      	        }
                              
                    }
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVerificationCategoryAccess().getExtendsVerificationCategoryCrossReference_2_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationCategory7552);
                    ruleDOTTEDREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationCategory"


    // $ANTLR start "entryRuleValueString"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3362:1: entryRuleValueString returns [String current=null] : iv_ruleValueString= ruleValueString EOF ;
    public final String entryRuleValueString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueString = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3363:1: (iv_ruleValueString= ruleValueString EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3364:2: iv_ruleValueString= ruleValueString EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getValueStringRule()); 
            }
            pushFollow(FOLLOW_ruleValueString_in_entryRuleValueString7590);
            iv_ruleValueString=ruleValueString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleValueString.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueString7601); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3371:1: ruleValueString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleValueString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3375:6: (this_STRING_0= RULE_STRING )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3376:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueString7640); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_STRING_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_STRING_0, grammarAccess.getValueStringAccess().getSTRINGTerminalRuleCall()); 
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleValueString"


    // $ANTLR start "entryRuleStakeholder"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3391:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3392:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3393:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getStakeholderRule()); 
            }
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder7683);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleStakeholder; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder7693); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3400:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) ) ) otherlv_13= End ) ;
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
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_6_0 = null;

        AntlrDatatypeRuleToken lv_role_8_0 = null;

        AntlrDatatypeRuleToken lv_email_10_0 = null;

        AntlrDatatypeRuleToken lv_phone_12_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3403:28: ( (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) ) ) otherlv_13= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3404:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) ) ) otherlv_13= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3404:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) ) ) otherlv_13= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3405:2: otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) ) ) otherlv_13= End
            {
            otherlv_0=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleStakeholder7731); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3409:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3410:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3410:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3411:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder7747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_1_0, grammarAccess.getStakeholderAccess().getNameIDTerminalRuleCall_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3427:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3429:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3429:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3430:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3433:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3434:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3434:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) ) )*
            loop51:
            do {
                int alt51=6;
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
                else if ( LA51_0 ==Email && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
                    alt51=4;
                }
                else if ( LA51_0 ==Phone && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
                    alt51=5;
                }


                switch (alt51) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3436:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3436:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3437:5: {...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3437:108: ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3438:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3441:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3441:7: {...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3441:16: (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3442:2: otherlv_3= Title ( (lv_title_4_0= ruleValueString ) )
            	    {
            	    otherlv_3=(Token)match(input,Title,FOLLOW_Title_in_ruleStakeholder7811); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getTitleKeyword_2_0_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3446:1: ( (lv_title_4_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3447:1: (lv_title_4_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3447:1: (lv_title_4_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3448:3: lv_title_4_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStakeholderAccess().getTitleValueStringParserRuleCall_2_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder7831);
            	    lv_title_4_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3471:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3471:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3472:5: {...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3472:108: ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3473:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3476:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3476:7: {...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3476:16: (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3477:2: otherlv_5= Description ( (lv_description_6_0= ruleValueString ) )
            	    {
            	    otherlv_5=(Token)match(input,Description,FOLLOW_Description_in_ruleStakeholder7900); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_2_1_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3481:1: ( (lv_description_6_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3482:1: (lv_description_6_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3482:1: (lv_description_6_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3483:3: lv_description_6_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStakeholderAccess().getDescriptionValueStringParserRuleCall_2_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder7920);
            	    lv_description_6_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3506:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3506:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3507:5: {...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3507:108: ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3508:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3511:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3511:7: {...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3511:16: (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3512:2: otherlv_7= Role ( (lv_role_8_0= ruleValueString ) )
            	    {
            	    otherlv_7=(Token)match(input,Role,FOLLOW_Role_in_ruleStakeholder7989); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getRoleKeyword_2_2_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3516:1: ( (lv_role_8_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3517:1: (lv_role_8_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3517:1: (lv_role_8_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3518:3: lv_role_8_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStakeholderAccess().getRoleValueStringParserRuleCall_2_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8009);
            	    lv_role_8_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

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


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3541:4: ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3541:4: ({...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3542:5: {...}? => ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3542:108: ( ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3543:6: ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3546:6: ({...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3546:7: {...}? => (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3546:16: (otherlv_9= Email ( (lv_email_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3547:2: otherlv_9= Email ( (lv_email_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Email,FOLLOW_Email_in_ruleStakeholder8078); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getEmailKeyword_2_3_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3551:1: ( (lv_email_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3552:1: (lv_email_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3552:1: (lv_email_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3553:3: lv_email_10_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStakeholderAccess().getEmailValueStringParserRuleCall_2_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8098);
            	    lv_email_10_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"email",
            	              		lv_email_10_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3576:4: ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3576:4: ({...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3577:5: {...}? => ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3577:108: ( ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3578:6: ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3581:6: ({...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3581:7: {...}? => (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3581:16: (otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3582:2: otherlv_11= Phone ( (lv_phone_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Phone,FOLLOW_Phone_in_ruleStakeholder8167); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getPhoneKeyword_2_4_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3586:1: ( (lv_phone_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3587:1: (lv_phone_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3587:1: (lv_phone_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3588:3: lv_phone_12_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getStakeholderAccess().getPhoneValueStringParserRuleCall_2_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8187);
            	    lv_phone_12_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"phone",
            	              		lv_phone_12_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

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
            	    break loop51;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());

            }

            otherlv_13=(Token)match(input,End,FOLLOW_End_in_ruleStakeholder8241); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getEndKeyword_3());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleStakeholder"


    // $ANTLR start "entryRuleAssuranceArgument"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3631:1: entryRuleAssuranceArgument returns [EObject current=null] : iv_ruleAssuranceArgument= ruleAssuranceArgument EOF ;
    public final EObject entryRuleAssuranceArgument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssuranceArgument = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3632:2: (iv_ruleAssuranceArgument= ruleAssuranceArgument EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3633:2: iv_ruleAssuranceArgument= ruleAssuranceArgument EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssuranceArgumentRule()); 
            }
            pushFollow(FOLLOW_ruleAssuranceArgument_in_entryRuleAssuranceArgument8275);
            iv_ruleAssuranceArgument=ruleAssuranceArgument();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssuranceArgument; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssuranceArgument8285); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssuranceArgument"


    // $ANTLR start "ruleAssuranceArgument"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3640:1: ruleAssuranceArgument returns [EObject current=null] : (otherlv_0= Argument ( (lv_expression_1_0= ruleArgumentExpr ) ) otherlv_2= Semicolon (otherlv_3= Rationale ( (lv_rationale_4_0= ruleValueString ) ) )? otherlv_5= End ) ;
    public final EObject ruleAssuranceArgument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_expression_1_0 = null;

        AntlrDatatypeRuleToken lv_rationale_4_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3643:28: ( (otherlv_0= Argument ( (lv_expression_1_0= ruleArgumentExpr ) ) otherlv_2= Semicolon (otherlv_3= Rationale ( (lv_rationale_4_0= ruleValueString ) ) )? otherlv_5= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3644:1: (otherlv_0= Argument ( (lv_expression_1_0= ruleArgumentExpr ) ) otherlv_2= Semicolon (otherlv_3= Rationale ( (lv_rationale_4_0= ruleValueString ) ) )? otherlv_5= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3644:1: (otherlv_0= Argument ( (lv_expression_1_0= ruleArgumentExpr ) ) otherlv_2= Semicolon (otherlv_3= Rationale ( (lv_rationale_4_0= ruleValueString ) ) )? otherlv_5= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3645:2: otherlv_0= Argument ( (lv_expression_1_0= ruleArgumentExpr ) ) otherlv_2= Semicolon (otherlv_3= Rationale ( (lv_rationale_4_0= ruleValueString ) ) )? otherlv_5= End
            {
            otherlv_0=(Token)match(input,Argument,FOLLOW_Argument_in_ruleAssuranceArgument8323); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssuranceArgumentAccess().getArgumentKeyword_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3649:1: ( (lv_expression_1_0= ruleArgumentExpr ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3650:1: (lv_expression_1_0= ruleArgumentExpr )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3650:1: (lv_expression_1_0= ruleArgumentExpr )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3651:3: lv_expression_1_0= ruleArgumentExpr
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getAssuranceArgumentAccess().getExpressionArgumentExprParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleArgumentExpr_in_ruleAssuranceArgument8343);
            lv_expression_1_0=ruleArgumentExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getAssuranceArgumentRule());
              	        }
                     		set(
                     			current, 
                     			"expression",
                      		lv_expression_1_0, 
                      		"ArgumentExpr");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_2=(Token)match(input,Semicolon,FOLLOW_Semicolon_in_ruleAssuranceArgument8356); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getAssuranceArgumentAccess().getSemicolonKeyword_2());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3672:1: (otherlv_3= Rationale ( (lv_rationale_4_0= ruleValueString ) ) )?
            int alt52=2;
            int LA52_0 = input.LA(1);

            if ( (LA52_0==Rationale) ) {
                alt52=1;
            }
            switch (alt52) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3673:2: otherlv_3= Rationale ( (lv_rationale_4_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleAssuranceArgument8369); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_3, grammarAccess.getAssuranceArgumentAccess().getRationaleKeyword_3_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3677:1: ( (lv_rationale_4_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3678:1: (lv_rationale_4_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3678:1: (lv_rationale_4_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3679:3: lv_rationale_4_0= ruleValueString
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAssuranceArgumentAccess().getRationaleValueStringParserRuleCall_3_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleValueString_in_ruleAssuranceArgument8389);
                    lv_rationale_4_0=ruleValueString();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAssuranceArgumentRule());
                      	        }
                             		set(
                             			current, 
                             			"rationale",
                              		lv_rationale_4_0, 
                              		"ValueString");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,End,FOLLOW_End_in_ruleAssuranceArgument8404); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssuranceArgumentAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssuranceArgument"


    // $ANTLR start "entryRuleArgumentExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3708:1: entryRuleArgumentExpr returns [EObject current=null] : iv_ruleArgumentExpr= ruleArgumentExpr EOF ;
    public final EObject entryRuleArgumentExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentExpr = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3709:2: (iv_ruleArgumentExpr= ruleArgumentExpr EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3710:2: iv_ruleArgumentExpr= ruleArgumentExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentExprRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentExpr_in_entryRuleArgumentExpr8438);
            iv_ruleArgumentExpr=ruleArgumentExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentExpr8448); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArgumentExpr"


    // $ANTLR start "ruleArgumentExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3717:1: ruleArgumentExpr returns [EObject current=null] : this_ImpliesExpr_0= ruleImpliesExpr ;
    public final EObject ruleArgumentExpr() throws RecognitionException {
        EObject current = null;

        EObject this_ImpliesExpr_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3720:28: (this_ImpliesExpr_0= ruleImpliesExpr )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3722:5: this_ImpliesExpr_0= ruleImpliesExpr
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getArgumentExprAccess().getImpliesExprParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_ruleArgumentExpr8494);
            this_ImpliesExpr_0=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_ImpliesExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }

            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArgumentExpr"


    // $ANTLR start "entryRuleImpliesExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3738:1: entryRuleImpliesExpr returns [EObject current=null] : iv_ruleImpliesExpr= ruleImpliesExpr EOF ;
    public final EObject entryRuleImpliesExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleImpliesExpr = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3739:2: (iv_ruleImpliesExpr= ruleImpliesExpr EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3740:2: iv_ruleImpliesExpr= ruleImpliesExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getImpliesExprRule()); 
            }
            pushFollow(FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr8527);
            iv_ruleImpliesExpr=ruleImpliesExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleImpliesExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleImpliesExpr8537); if (state.failed) return current;

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
    // $ANTLR end "entryRuleImpliesExpr"


    // $ANTLR start "ruleImpliesExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3747:1: ruleImpliesExpr returns [EObject current=null] : (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) ;
    public final EObject ruleImpliesExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_OrExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3750:28: ( (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3751:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3751:1: (this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3752:5: this_OrExpr_0= ruleOrExpr ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getImpliesExprAccess().getOrExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleOrExpr_in_ruleImpliesExpr8584);
            this_OrExpr_0=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_OrExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:1: ( ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) ) )?
            int alt53=2;
            int LA53_0 = input.LA(1);

            if ( (LA53_0==EqualsSignGreaterThanSign) && (synpred1_InternalAlisaParser())) {
                alt53=1;
            }
            switch (alt53) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:2: ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) ) ( (lv_right_3_0= ruleImpliesExpr ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:2: ( ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:3: ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )=> ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3768:6: ( () ( (lv_op_2_0= EqualsSignGreaterThanSign ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3768:7: () ( (lv_op_2_0= EqualsSignGreaterThanSign ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3768:7: ()
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3769:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElementAndSet(
                                  grammarAccess.getImpliesExprAccess().getBinaryExprLeftAction_1_0_0_0(),
                                  current);
                          
                    }

                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3774:2: ( (lv_op_2_0= EqualsSignGreaterThanSign ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3775:1: (lv_op_2_0= EqualsSignGreaterThanSign )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3775:1: (lv_op_2_0= EqualsSignGreaterThanSign )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3776:3: lv_op_2_0= EqualsSignGreaterThanSign
                    {
                    lv_op_2_0=(Token)match(input,EqualsSignGreaterThanSign,FOLLOW_EqualsSignGreaterThanSign_in_ruleImpliesExpr8634); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              newLeafNode(lv_op_2_0, grammarAccess.getImpliesExprAccess().getOpEqualsSignGreaterThanSignKeyword_1_0_0_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getImpliesExprRule());
                      	        }
                             		setWithLastConsumed(current, "op", lv_op_2_0, "=>");
                      	    
                    }

                    }


                    }


                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3790:4: ( (lv_right_3_0= ruleImpliesExpr ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3791:1: (lv_right_3_0= ruleImpliesExpr )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3791:1: (lv_right_3_0= ruleImpliesExpr )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3792:3: lv_right_3_0= ruleImpliesExpr
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getImpliesExprAccess().getRightImpliesExprParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr8668);
                    lv_right_3_0=ruleImpliesExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getImpliesExprRule());
                      	        }
                             		set(
                             			current, 
                             			"right",
                              		lv_right_3_0, 
                              		"ImpliesExpr");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleImpliesExpr"


    // $ANTLR start "entryRuleOrExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3816:1: entryRuleOrExpr returns [EObject current=null] : iv_ruleOrExpr= ruleOrExpr EOF ;
    public final EObject entryRuleOrExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOrExpr = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3817:2: (iv_ruleOrExpr= ruleOrExpr EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3818:2: iv_ruleOrExpr= ruleOrExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getOrExprRule()); 
            }
            pushFollow(FOLLOW_ruleOrExpr_in_entryRuleOrExpr8705);
            iv_ruleOrExpr=ruleOrExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOrExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOrExpr8715); if (state.failed) return current;

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
    // $ANTLR end "entryRuleOrExpr"


    // $ANTLR start "ruleOrExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3825:1: ruleOrExpr returns [EObject current=null] : (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) ;
    public final EObject ruleOrExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AndExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3828:28: ( (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3829:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3829:1: (this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3830:5: this_AndExpr_0= ruleAndExpr ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getOrExprAccess().getAndExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr8762);
            this_AndExpr_0=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AndExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:1: ( ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) ) )*
            loop54:
            do {
                int alt54=2;
                int LA54_0 = input.LA(1);

                if ( (LA54_0==Or) && (synpred2_InternalAlisaParser())) {
                    alt54=1;
                }


                switch (alt54) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:2: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) ) ( (lv_right_3_0= ruleAndExpr ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:2: ( ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:3: ( ( () ( ( Or ) ) ) )=> ( () ( (lv_op_2_0= Or ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3846:6: ( () ( (lv_op_2_0= Or ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3846:7: () ( (lv_op_2_0= Or ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3846:7: ()
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3847:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getOrExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3852:2: ( (lv_op_2_0= Or ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3853:1: (lv_op_2_0= Or )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3853:1: (lv_op_2_0= Or )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3854:3: lv_op_2_0= Or
            	    {
            	    lv_op_2_0=(Token)match(input,Or,FOLLOW_Or_in_ruleOrExpr8812); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getOrExprAccess().getOpOrKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getOrExprRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "or");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3868:4: ( (lv_right_3_0= ruleAndExpr ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3869:1: (lv_right_3_0= ruleAndExpr )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3869:1: (lv_right_3_0= ruleAndExpr )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3870:3: lv_right_3_0= ruleAndExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getOrExprAccess().getRightAndExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAndExpr_in_ruleOrExpr8846);
            	    lv_right_3_0=ruleAndExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getOrExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AndExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop54;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleOrExpr"


    // $ANTLR start "entryRuleAndExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3894:1: entryRuleAndExpr returns [EObject current=null] : iv_ruleAndExpr= ruleAndExpr EOF ;
    public final EObject entryRuleAndExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAndExpr = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3895:2: (iv_ruleAndExpr= ruleAndExpr EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3896:2: iv_ruleAndExpr= ruleAndExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAndExprRule()); 
            }
            pushFollow(FOLLOW_ruleAndExpr_in_entryRuleAndExpr8883);
            iv_ruleAndExpr=ruleAndExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAndExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAndExpr8893); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAndExpr"


    // $ANTLR start "ruleAndExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3903:1: ruleAndExpr returns [EObject current=null] : (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleAtomicExpr ) ) )* ) ;
    public final EObject ruleAndExpr() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_0=null;
        EObject this_AtomicExpr_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3906:28: ( (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleAtomicExpr ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3907:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleAtomicExpr ) ) )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3907:1: (this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleAtomicExpr ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3908:5: this_AtomicExpr_0= ruleAtomicExpr ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleAtomicExpr ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getAndExprAccess().getAtomicExprParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_ruleAndExpr8940);
            this_AtomicExpr_0=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current = this_AtomicExpr_0;
                      afterParserOrEnumRuleCall();
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:1: ( ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleAtomicExpr ) ) )*
            loop55:
            do {
                int alt55=2;
                int LA55_0 = input.LA(1);

                if ( (LA55_0==And) && (synpred3_InternalAlisaParser())) {
                    alt55=1;
                }


                switch (alt55) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:2: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) ) ( (lv_right_3_0= ruleAtomicExpr ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:2: ( ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:3: ( ( () ( ( And ) ) ) )=> ( () ( (lv_op_2_0= And ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3924:6: ( () ( (lv_op_2_0= And ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3924:7: () ( (lv_op_2_0= And ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3924:7: ()
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3925:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getAndExprAccess().getBinaryExprLeftAction_1_0_0_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3930:2: ( (lv_op_2_0= And ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3931:1: (lv_op_2_0= And )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3931:1: (lv_op_2_0= And )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3932:3: lv_op_2_0= And
            	    {
            	    lv_op_2_0=(Token)match(input,And,FOLLOW_And_in_ruleAndExpr8990); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              newLeafNode(lv_op_2_0, grammarAccess.getAndExprAccess().getOpAndKeyword_1_0_0_1_0());
            	          
            	    }
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElement(grammarAccess.getAndExprRule());
            	      	        }
            	             		setWithLastConsumed(current, "op", lv_op_2_0, "and");
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3946:4: ( (lv_right_3_0= ruleAtomicExpr ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3947:1: (lv_right_3_0= ruleAtomicExpr )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3947:1: (lv_right_3_0= ruleAtomicExpr )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3948:3: lv_right_3_0= ruleAtomicExpr
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAndExprAccess().getRightAtomicExprParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAtomicExpr_in_ruleAndExpr9024);
            	    lv_right_3_0=ruleAtomicExpr();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAndExprRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"right",
            	              		lv_right_3_0, 
            	              		"AtomicExpr");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop55;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAndExpr"


    // $ANTLR start "entryRuleAtomicExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3972:1: entryRuleAtomicExpr returns [EObject current=null] : iv_ruleAtomicExpr= ruleAtomicExpr EOF ;
    public final EObject entryRuleAtomicExpr() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomicExpr = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3973:2: (iv_ruleAtomicExpr= ruleAtomicExpr EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3974:2: iv_ruleAtomicExpr= ruleAtomicExpr EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicExprRule()); 
            }
            pushFollow(FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr9061);
            iv_ruleAtomicExpr=ruleAtomicExpr();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomicExpr; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomicExpr9071); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAtomicExpr"


    // $ANTLR start "ruleAtomicExpr"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3981:1: ruleAtomicExpr returns [EObject current=null] : ( ( () ( (lv_id_1_0= ruleArgumentReference ) ) ) | (otherlv_2= LeftParenthesis this_ArgumentExpr_3= ruleArgumentExpr otherlv_4= RightParenthesis ) ) ;
    public final EObject ruleAtomicExpr() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_id_1_0 = null;

        EObject this_ArgumentExpr_3 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3984:28: ( ( ( () ( (lv_id_1_0= ruleArgumentReference ) ) ) | (otherlv_2= LeftParenthesis this_ArgumentExpr_3= ruleArgumentExpr otherlv_4= RightParenthesis ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3985:1: ( ( () ( (lv_id_1_0= ruleArgumentReference ) ) ) | (otherlv_2= LeftParenthesis this_ArgumentExpr_3= ruleArgumentExpr otherlv_4= RightParenthesis ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3985:1: ( ( () ( (lv_id_1_0= ruleArgumentReference ) ) ) | (otherlv_2= LeftParenthesis this_ArgumentExpr_3= ruleArgumentExpr otherlv_4= RightParenthesis ) )
            int alt56=2;
            int LA56_0 = input.LA(1);

            if ( (LA56_0==RULE_ID) ) {
                alt56=1;
            }
            else if ( (LA56_0==LeftParenthesis) ) {
                alt56=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 56, 0, input);

                throw nvae;
            }
            switch (alt56) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3985:2: ( () ( (lv_id_1_0= ruleArgumentReference ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3985:2: ( () ( (lv_id_1_0= ruleArgumentReference ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3985:3: () ( (lv_id_1_0= ruleArgumentReference ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3985:3: ()
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3986:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicExprAccess().getRefExprAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3991:2: ( (lv_id_1_0= ruleArgumentReference ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3992:1: (lv_id_1_0= ruleArgumentReference )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3992:1: (lv_id_1_0= ruleArgumentReference )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3993:3: lv_id_1_0= ruleArgumentReference
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicExprAccess().getIdArgumentReferenceParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleArgumentReference_in_ruleAtomicExpr9127);
                    lv_id_1_0=ruleArgumentReference();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getAtomicExprRule());
                      	        }
                             		set(
                             			current, 
                             			"id",
                              		lv_id_1_0, 
                              		"ArgumentReference");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4010:6: (otherlv_2= LeftParenthesis this_ArgumentExpr_3= ruleArgumentExpr otherlv_4= RightParenthesis )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4010:6: (otherlv_2= LeftParenthesis this_ArgumentExpr_3= ruleArgumentExpr otherlv_4= RightParenthesis )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4011:2: otherlv_2= LeftParenthesis this_ArgumentExpr_3= ruleArgumentExpr otherlv_4= RightParenthesis
                    {
                    otherlv_2=(Token)match(input,LeftParenthesis,FOLLOW_LeftParenthesis_in_ruleAtomicExpr9148); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getAtomicExprAccess().getLeftParenthesisKeyword_1_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getAtomicExprAccess().getArgumentExprParserRuleCall_1_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleArgumentExpr_in_ruleAtomicExpr9169);
                    this_ArgumentExpr_3=ruleArgumentExpr();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = this_ArgumentExpr_3;
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_4=(Token)match(input,RightParenthesis,FOLLOW_RightParenthesis_in_ruleAtomicExpr9181); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getAtomicExprAccess().getRightParenthesisKeyword_1_2());
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAtomicExpr"


    // $ANTLR start "entryRuleArgumentReference"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4037:1: entryRuleArgumentReference returns [EObject current=null] : iv_ruleArgumentReference= ruleArgumentReference EOF ;
    public final EObject entryRuleArgumentReference() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleArgumentReference = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4038:2: (iv_ruleArgumentReference= ruleArgumentReference EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4039:2: iv_ruleArgumentReference= ruleArgumentReference EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getArgumentReferenceRule()); 
            }
            pushFollow(FOLLOW_ruleArgumentReference_in_entryRuleArgumentReference9216);
            iv_ruleArgumentReference=ruleArgumentReference();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleArgumentReference; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleArgumentReference9226); if (state.failed) return current;

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
    // $ANTLR end "entryRuleArgumentReference"


    // $ANTLR start "ruleArgumentReference"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4046:1: ruleArgumentReference returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) (otherlv_1= Asterisk ( (lv_weight_2_0= RULE_INT ) ) )? ) ;
    public final EObject ruleArgumentReference() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token lv_weight_2_0=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4049:28: ( ( ( ( ruleDOTTEDREF ) ) (otherlv_1= Asterisk ( (lv_weight_2_0= RULE_INT ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4050:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= Asterisk ( (lv_weight_2_0= RULE_INT ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4050:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= Asterisk ( (lv_weight_2_0= RULE_INT ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4050:2: ( ( ruleDOTTEDREF ) ) (otherlv_1= Asterisk ( (lv_weight_2_0= RULE_INT ) ) )?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4050:2: ( ( ruleDOTTEDREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4051:1: ( ruleDOTTEDREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4051:1: ( ruleDOTTEDREF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4052:3: ruleDOTTEDREF
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getArgumentReferenceRule());
              	        }
                      
            }
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getArgumentReferenceAccess().getReferenceVerificationActivityCrossReference_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleArgumentReference9274);
            ruleDOTTEDREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4065:2: (otherlv_1= Asterisk ( (lv_weight_2_0= RULE_INT ) ) )?
            int alt57=2;
            int LA57_0 = input.LA(1);

            if ( (LA57_0==Asterisk) ) {
                alt57=1;
            }
            switch (alt57) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4066:2: otherlv_1= Asterisk ( (lv_weight_2_0= RULE_INT ) )
                    {
                    otherlv_1=(Token)match(input,Asterisk,FOLLOW_Asterisk_in_ruleArgumentReference9288); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_1, grammarAccess.getArgumentReferenceAccess().getAsteriskKeyword_1_0());
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4070:1: ( (lv_weight_2_0= RULE_INT ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4071:1: (lv_weight_2_0= RULE_INT )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4071:1: (lv_weight_2_0= RULE_INT )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4072:3: lv_weight_2_0= RULE_INT
                    {
                    lv_weight_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleArgumentReference9304); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      			newLeafNode(lv_weight_2_0, grammarAccess.getArgumentReferenceAccess().getWeightINTTerminalRuleCall_1_1_0()); 
                      		
                    }
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElement(grammarAccess.getArgumentReferenceRule());
                      	        }
                             		setWithLastConsumed(
                             			current, 
                             			"weight",
                              		lv_weight_2_0, 
                              		"INT");
                      	    
                    }

                    }


                    }


                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleArgumentReference"


    // $ANTLR start "entryRuleVerificationActivity"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4096:1: entryRuleVerificationActivity returns [EObject current=null] : iv_ruleVerificationActivity= ruleVerificationActivity EOF ;
    public final EObject entryRuleVerificationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationActivity = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4097:2: (iv_ruleVerificationActivity= ruleVerificationActivity EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4098:2: iv_ruleVerificationActivity= ruleVerificationActivity EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerificationActivityRule()); 
            }
            pushFollow(FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity9346);
            iv_ruleVerificationActivity=ruleVerificationActivity();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerificationActivity; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationActivity9356); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4105:1: ruleVerificationActivity returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) ) ) otherlv_15= End ) ;
    public final EObject ruleVerificationActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_15=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        EObject lv_method_13_0 = null;

        EObject lv_assumption_14_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4108:28: ( (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) ) ) otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4109:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) ) ) otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4109:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) ) ) otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4110:2: otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) ) ) otherlv_15= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationActivity9394); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVerificationActivityAccess().getVerificationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Activity,FOLLOW_Activity_in_ruleVerificationActivity9406); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVerificationActivityAccess().getActivityKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4119:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4120:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4120:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4121:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity9422); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVerificationActivityAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4137:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4139:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4139:1: ( ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4140:2: ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3());
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4143:2: ( ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4144:3: ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4144:3: ( ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) ) )*
            loop60:
            do {
                int alt60=6;
                int LA60_0 = input.LA(1);

                if ( LA60_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 0) ) {
                    alt60=1;
                }
                else if ( LA60_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 1) ) {
                    alt60=2;
                }
                else if ( LA60_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 2) ) {
                    alt60=3;
                }
                else if ( LA60_0 ==Method && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 3) ) {
                    alt60=4;
                }
                else if ( LA60_0 ==Verification && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 4) ) {
                    alt60=5;
                }


                switch (alt60) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4146:4: ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4146:4: ({...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4147:5: {...}? => ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4147:117: ( ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4148:6: ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 0);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4151:6: ({...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4151:7: {...}? => (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4151:16: (otherlv_4= Title ( (lv_title_5_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4152:2: otherlv_4= Title ( (lv_title_5_0= ruleValueString ) )
            	    {
            	    otherlv_4=(Token)match(input,Title,FOLLOW_Title_in_ruleVerificationActivity9486); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_4, grammarAccess.getVerificationActivityAccess().getTitleKeyword_3_0_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4156:1: ( (lv_title_5_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4157:1: (lv_title_5_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4157:1: (lv_title_5_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4158:3: lv_title_5_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getTitleValueStringParserRuleCall_3_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity9506);
            	    lv_title_5_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"title",
            	              		lv_title_5_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4181:4: ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4181:4: ({...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4182:5: {...}? => ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4182:117: ( ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4183:6: ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 1);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4186:6: ({...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4186:7: {...}? => (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4186:16: (otherlv_6= Description ( (lv_description_7_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4187:2: otherlv_6= Description ( (lv_description_7_0= ruleValueString ) )
            	    {
            	    otherlv_6=(Token)match(input,Description,FOLLOW_Description_in_ruleVerificationActivity9575); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getVerificationActivityAccess().getDescriptionKeyword_3_1_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4191:1: ( (lv_description_7_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4192:1: (lv_description_7_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4192:1: (lv_description_7_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4193:3: lv_description_7_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDescriptionValueStringParserRuleCall_3_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity9595);
            	    lv_description_7_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"description",
            	              		lv_description_7_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4216:4: ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4216:4: ({...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4217:5: {...}? => ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4217:117: ( ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4218:6: ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 2);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4221:6: ({...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4221:7: {...}? => (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4221:16: (otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4222:2: otherlv_8= Category ( ( ruleDOTTEDREF ) ) (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_8=(Token)match(input,Category,FOLLOW_Category_in_ruleVerificationActivity9664); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getVerificationActivityAccess().getCategoryKeyword_3_2_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4226:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4227:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4227:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4228:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVerificationActivityRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getCategoryCategoryCrossReference_3_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9686);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4241:2: (otherlv_10= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop58:
            	    do {
            	        int alt58=2;
            	        int LA58_0 = input.LA(1);

            	        if ( (LA58_0==Comma) ) {
            	            alt58=1;
            	        }


            	        switch (alt58) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4242:2: otherlv_10= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_10=(Token)match(input,Comma,FOLLOW_Comma_in_ruleVerificationActivity9700); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_10, grammarAccess.getVerificationActivityAccess().getCommaKeyword_3_2_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4246:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4247:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4247:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4248:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getVerificationActivityRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getCategoryCategoryCrossReference_3_2_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9722);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop58;
            	        }
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4268:4: ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4268:4: ({...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4269:5: {...}? => ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4269:117: ( ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4270:6: ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 3);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4273:6: ({...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4273:7: {...}? => (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4273:16: (otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4274:2: otherlv_12= Method ( (lv_method_13_0= ruleVerificationMethod ) )
            	    {
            	    otherlv_12=(Token)match(input,Method,FOLLOW_Method_in_ruleVerificationActivity9793); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getVerificationActivityAccess().getMethodKeyword_3_3_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4278:1: ( (lv_method_13_0= ruleVerificationMethod ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4279:1: (lv_method_13_0= ruleVerificationMethod )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4279:1: (lv_method_13_0= ruleVerificationMethod )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4280:3: lv_method_13_0= ruleVerificationMethod
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getMethodVerificationMethodParserRuleCall_3_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity9813);
            	    lv_method_13_0=ruleVerificationMethod();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"method",
            	              		lv_method_13_0, 
            	              		"VerificationMethod");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4303:4: ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4303:4: ({...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4304:5: {...}? => ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationActivity", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4304:117: ( ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+ )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4305:6: ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3(), 4);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4308:6: ({...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) ) )+
            	    int cnt59=0;
            	    loop59:
            	    do {
            	        int alt59=2;
            	        int LA59_0 = input.LA(1);

            	        if ( (LA59_0==Verification) ) {
            	            int LA59_2 = input.LA(2);

            	            if ( ((true)) ) {
            	                alt59=1;
            	            }


            	        }


            	        switch (alt59) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4308:7: {...}? => ( (lv_assumption_14_0= ruleVerificationAssumption ) )
            	    	    {
            	    	    if ( !((true)) ) {
            	    	        if (state.backtracking>0) {state.failed=true; return current;}
            	    	        throw new FailedPredicateException(input, "ruleVerificationActivity", "true");
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4308:16: ( (lv_assumption_14_0= ruleVerificationAssumption ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4309:1: (lv_assumption_14_0= ruleVerificationAssumption )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4309:1: (lv_assumption_14_0= ruleVerificationAssumption )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4310:3: lv_assumption_14_0= ruleVerificationAssumption
            	    	    {
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getAssumptionVerificationAssumptionParserRuleCall_3_4_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleVerificationAssumption_in_ruleVerificationActivity9889);
            	    	    lv_assumption_14_0=ruleVerificationAssumption();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	      	        if (current==null) {
            	    	      	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
            	    	      	        }
            	    	             		add(
            	    	             			current, 
            	    	             			"assumption",
            	    	              		lv_assumption_14_0, 
            	    	              		"VerificationAssumption");
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    if ( cnt59 >= 1 ) break loop59;
            	    	    if (state.backtracking>0) {state.failed=true; return current;}
            	                EarlyExitException eee =
            	                    new EarlyExitException(59, input);
            	                throw eee;
            	        }
            	        cnt59++;
            	    } while (true);

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop60;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVerificationActivityAccess().getUnorderedGroup_3());

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleVerificationActivity9943); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getVerificationActivityAccess().getEndKeyword_4());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationActivity"


    // $ANTLR start "entryRuleVerificationMethod"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4353:1: entryRuleVerificationMethod returns [EObject current=null] : iv_ruleVerificationMethod= ruleVerificationMethod EOF ;
    public final EObject entryRuleVerificationMethod() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationMethod = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4354:2: (iv_ruleVerificationMethod= ruleVerificationMethod EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4355:2: iv_ruleVerificationMethod= ruleVerificationMethod EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerificationMethodRule()); 
            }
            pushFollow(FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod9977);
            iv_ruleVerificationMethod=ruleVerificationMethod();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerificationMethod; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationMethod9987); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4362:1: ruleVerificationMethod returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Method ( (lv_name_2_0= RULE_ID ) ) otherlv_3= EqualsSign ( (lv_language_4_0= ruleSupportedLanguage ) ) ( (lv_method_5_0= ruleValueString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) ) ) ) ;
    public final EObject ruleVerificationMethod() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_language_4_0 = null;

        AntlrDatatypeRuleToken lv_method_5_0 = null;

        AntlrDatatypeRuleToken lv_title_8_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4365:28: ( (otherlv_0= Verification otherlv_1= Method ( (lv_name_2_0= RULE_ID ) ) otherlv_3= EqualsSign ( (lv_language_4_0= ruleSupportedLanguage ) ) ( (lv_method_5_0= ruleValueString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4366:1: (otherlv_0= Verification otherlv_1= Method ( (lv_name_2_0= RULE_ID ) ) otherlv_3= EqualsSign ( (lv_language_4_0= ruleSupportedLanguage ) ) ( (lv_method_5_0= ruleValueString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4366:1: (otherlv_0= Verification otherlv_1= Method ( (lv_name_2_0= RULE_ID ) ) otherlv_3= EqualsSign ( (lv_language_4_0= ruleSupportedLanguage ) ) ( (lv_method_5_0= ruleValueString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4367:2: otherlv_0= Verification otherlv_1= Method ( (lv_name_2_0= RULE_ID ) ) otherlv_3= EqualsSign ( (lv_language_4_0= ruleSupportedLanguage ) ) ( (lv_method_5_0= ruleValueString ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) ) )
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationMethod10025); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVerificationMethodAccess().getVerificationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Method,FOLLOW_Method_in_ruleVerificationMethod10037); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVerificationMethodAccess().getMethodKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4376:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4377:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4377:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4378:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationMethod10053); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVerificationMethodAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getVerificationMethodRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,EqualsSign,FOLLOW_EqualsSign_in_ruleVerificationMethod10071); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVerificationMethodAccess().getEqualsSignKeyword_3());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4399:1: ( (lv_language_4_0= ruleSupportedLanguage ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4400:1: (lv_language_4_0= ruleSupportedLanguage )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4400:1: (lv_language_4_0= ruleSupportedLanguage )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4401:3: lv_language_4_0= ruleSupportedLanguage
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVerificationMethodAccess().getLanguageSupportedLanguageParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSupportedLanguage_in_ruleVerificationMethod10091);
            lv_language_4_0=ruleSupportedLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVerificationMethodRule());
              	        }
                     		set(
                     			current, 
                     			"language",
                      		lv_language_4_0, 
                      		"SupportedLanguage");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4417:2: ( (lv_method_5_0= ruleValueString ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4418:1: (lv_method_5_0= ruleValueString )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4418:1: (lv_method_5_0= ruleValueString )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4419:3: lv_method_5_0= ruleValueString
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVerificationMethodAccess().getMethodValueStringParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleValueString_in_ruleVerificationMethod10112);
            lv_method_5_0=ruleValueString();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getVerificationMethodRule());
              	        }
                     		set(
                     			current, 
                     			"method",
                      		lv_method_5_0, 
                      		"ValueString");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4435:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4437:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4437:1: ( ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4438:2: ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6());
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4441:2: ( ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4442:3: ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4442:3: ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )*
            loop62:
            do {
                int alt62=4;
                alt62 = dfa62.predict(input);
                switch (alt62) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4444:4: ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4444:4: ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4445:5: {...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationMethod", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4445:115: ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4446:6: ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 0);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4449:6: ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4449:7: {...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationMethod", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4449:16: (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4450:2: otherlv_7= Title ( (lv_title_8_0= ruleValueString ) )
            	    {
            	    otherlv_7=(Token)match(input,Title,FOLLOW_Title_in_ruleVerificationMethod10171); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_7, grammarAccess.getVerificationMethodAccess().getTitleKeyword_6_0_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4454:1: ( (lv_title_8_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4455:1: (lv_title_8_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4455:1: (lv_title_8_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4456:3: lv_title_8_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationMethodAccess().getTitleValueStringParserRuleCall_6_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationMethod10191);
            	    lv_title_8_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationMethodRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"title",
            	              		lv_title_8_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4479:4: ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4479:4: ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4480:5: {...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationMethod", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4480:115: ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4481:6: ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 1);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4484:6: ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4484:7: {...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationMethod", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4484:16: (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4485:2: otherlv_9= Description ( (lv_description_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Description,FOLLOW_Description_in_ruleVerificationMethod10260); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_9, grammarAccess.getVerificationMethodAccess().getDescriptionKeyword_6_1_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4489:1: ( (lv_description_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4490:1: (lv_description_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4490:1: (lv_description_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4491:3: lv_description_10_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationMethodAccess().getDescriptionValueStringParserRuleCall_6_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationMethod10280);
            	    lv_description_10_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationMethodRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"description",
            	              		lv_description_10_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4514:4: ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4514:4: ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4515:5: {...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationMethod", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4515:115: ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4516:6: ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 2);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4519:6: ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4519:7: {...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationMethod", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4519:16: (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4520:2: otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_11=(Token)match(input,Category,FOLLOW_Category_in_ruleVerificationMethod10349); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_11, grammarAccess.getVerificationMethodAccess().getCategoryKeyword_6_2_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4524:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4525:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4525:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4526:3: ruleDOTTEDREF
            	    {
            	    if ( state.backtracking==0 ) {

            	      			if (current==null) {
            	      	            current = createModelElement(grammarAccess.getVerificationMethodRule());
            	      	        }
            	              
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationMethodAccess().getCategoryCategoryCrossReference_6_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationMethod10371);
            	    ruleDOTTEDREF();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {
            	       
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4539:2: (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop61:
            	    do {
            	        int alt61=2;
            	        int LA61_0 = input.LA(1);

            	        if ( (LA61_0==Comma) ) {
            	            alt61=1;
            	        }


            	        switch (alt61) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4540:2: otherlv_13= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_13=(Token)match(input,Comma,FOLLOW_Comma_in_ruleVerificationMethod10385); if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {

            	    	          	newLeafNode(otherlv_13, grammarAccess.getVerificationMethodAccess().getCommaKeyword_6_2_2_0());
            	    	          
            	    	    }
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4544:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4545:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4545:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4546:3: ruleDOTTEDREF
            	    	    {
            	    	    if ( state.backtracking==0 ) {

            	    	      			if (current==null) {
            	    	      	            current = createModelElement(grammarAccess.getVerificationMethodRule());
            	    	      	        }
            	    	              
            	    	    }
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        newCompositeNode(grammarAccess.getVerificationMethodAccess().getCategoryCategoryCrossReference_6_2_2_1_0()); 
            	    	      	    
            	    	    }
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationMethod10407);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;
            	    	    if (state.failed) return current;
            	    	    if ( state.backtracking==0 ) {
            	    	       
            	    	      	        afterParserOrEnumRuleCall();
            	    	      	    
            	    	    }

            	    	    }


            	    	    }


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop61;
            	        }
            	    } while (true);


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop62;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6());

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationMethod"


    // $ANTLR start "entryRuleSupportedLanguage"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4581:1: entryRuleSupportedLanguage returns [String current=null] : iv_ruleSupportedLanguage= ruleSupportedLanguage EOF ;
    public final String entryRuleSupportedLanguage() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleSupportedLanguage = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4582:1: (iv_ruleSupportedLanguage= ruleSupportedLanguage EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4583:2: iv_ruleSupportedLanguage= ruleSupportedLanguage EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSupportedLanguageRule()); 
            }
            pushFollow(FOLLOW_ruleSupportedLanguage_in_entryRuleSupportedLanguage10486);
            iv_ruleSupportedLanguage=ruleSupportedLanguage();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSupportedLanguage.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSupportedLanguage10497); if (state.failed) return current;

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
    // $ANTLR end "entryRuleSupportedLanguage"


    // $ANTLR start "ruleSupportedLanguage"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4590:1: ruleSupportedLanguage returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Lute | kw= Agree ) ;
    public final AntlrDatatypeRuleToken ruleSupportedLanguage() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4594:6: ( (kw= Lute | kw= Agree ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4595:1: (kw= Lute | kw= Agree )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4595:1: (kw= Lute | kw= Agree )
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Lute) ) {
                alt63=1;
            }
            else if ( (LA63_0==Agree) ) {
                alt63=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 63, 0, input);

                throw nvae;
            }
            switch (alt63) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4596:2: kw= Lute
                    {
                    kw=(Token)match(input,Lute,FOLLOW_Lute_in_ruleSupportedLanguage10535); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSupportedLanguageAccess().getLuteKeyword_0()); 
                          
                    }

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4603:2: kw= Agree
                    {
                    kw=(Token)match(input,Agree,FOLLOW_Agree_in_ruleSupportedLanguage10554); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getSupportedLanguageAccess().getAgreeKeyword_1()); 
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleSupportedLanguage"


    // $ANTLR start "entryRuleAssuranceCase"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4616:1: entryRuleAssuranceCase returns [EObject current=null] : iv_ruleAssuranceCase= ruleAssuranceCase EOF ;
    public final EObject entryRuleAssuranceCase() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssuranceCase = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4617:2: (iv_ruleAssuranceCase= ruleAssuranceCase EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4618:2: iv_ruleAssuranceCase= ruleAssuranceCase EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssuranceCaseRule()); 
            }
            pushFollow(FOLLOW_ruleAssuranceCase_in_entryRuleAssuranceCase10593);
            iv_ruleAssuranceCase=ruleAssuranceCase();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssuranceCase; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssuranceCase10603); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssuranceCase"


    // $ANTLR start "ruleAssuranceCase"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4625:1: ruleAssuranceCase returns [EObject current=null] : (otherlv_0= Assurance otherlv_1= Case ( (lv_name_2_0= RULE_ID ) ) otherlv_3= For ( (otherlv_4= RULE_ID ) ) ( (lv_results_5_0= ruleAssuranceResult ) )+ otherlv_6= End ) ;
    public final EObject ruleAssuranceCase() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        EObject lv_results_5_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4628:28: ( (otherlv_0= Assurance otherlv_1= Case ( (lv_name_2_0= RULE_ID ) ) otherlv_3= For ( (otherlv_4= RULE_ID ) ) ( (lv_results_5_0= ruleAssuranceResult ) )+ otherlv_6= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4629:1: (otherlv_0= Assurance otherlv_1= Case ( (lv_name_2_0= RULE_ID ) ) otherlv_3= For ( (otherlv_4= RULE_ID ) ) ( (lv_results_5_0= ruleAssuranceResult ) )+ otherlv_6= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4629:1: (otherlv_0= Assurance otherlv_1= Case ( (lv_name_2_0= RULE_ID ) ) otherlv_3= For ( (otherlv_4= RULE_ID ) ) ( (lv_results_5_0= ruleAssuranceResult ) )+ otherlv_6= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4630:2: otherlv_0= Assurance otherlv_1= Case ( (lv_name_2_0= RULE_ID ) ) otherlv_3= For ( (otherlv_4= RULE_ID ) ) ( (lv_results_5_0= ruleAssuranceResult ) )+ otherlv_6= End
            {
            otherlv_0=(Token)match(input,Assurance,FOLLOW_Assurance_in_ruleAssuranceCase10641); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssuranceCaseAccess().getAssuranceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Case,FOLLOW_Case_in_ruleAssuranceCase10653); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssuranceCaseAccess().getCaseKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4639:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4640:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4640:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4641:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssuranceCase10669); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getAssuranceCaseAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceCaseRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleAssuranceCase10687); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssuranceCaseAccess().getForKeyword_3());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4662:1: ( (otherlv_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4663:1: (otherlv_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4663:1: (otherlv_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4664:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceCaseRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssuranceCase10706); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getAssuranceCaseAccess().getTargetSystemInstanceCrossReference_4_0()); 
              	
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4675:2: ( (lv_results_5_0= ruleAssuranceResult ) )+
            int cnt64=0;
            loop64:
            do {
                int alt64=2;
                int LA64_0 = input.LA(1);

                if ( (LA64_0==Assurance) ) {
                    alt64=1;
                }


                switch (alt64) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4676:1: (lv_results_5_0= ruleAssuranceResult )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4676:1: (lv_results_5_0= ruleAssuranceResult )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4677:3: lv_results_5_0= ruleAssuranceResult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssuranceCaseAccess().getResultsAssuranceResultParserRuleCall_5_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssuranceResult_in_ruleAssuranceCase10727);
            	    lv_results_5_0=ruleAssuranceResult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssuranceCaseRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"results",
            	              		lv_results_5_0, 
            	              		"AssuranceResult");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt64 >= 1 ) break loop64;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(64, input);
                        throw eee;
                }
                cnt64++;
            } while (true);

            otherlv_6=(Token)match(input,End,FOLLOW_End_in_ruleAssuranceCase10741); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getAssuranceCaseAccess().getEndKeyword_6());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssuranceCase"


    // $ANTLR start "entryRuleVerificationResult"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4706:1: entryRuleVerificationResult returns [EObject current=null] : iv_ruleVerificationResult= ruleVerificationResult EOF ;
    public final EObject entryRuleVerificationResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationResult = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4707:2: (iv_ruleVerificationResult= ruleVerificationResult EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4708:2: iv_ruleVerificationResult= ruleVerificationResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVerificationResultRule()); 
            }
            pushFollow(FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult10775);
            iv_ruleVerificationResult=ruleVerificationResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVerificationResult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResult10785); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4715:1: ruleVerificationResult returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) ) ) ( (lv_assumptionVerificationResult_16_0= ruleVerificationResult ) )* otherlv_17= End ) ;
    public final EObject ruleVerificationResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        AntlrDatatypeRuleToken lv_title_7_0 = null;

        AntlrDatatypeRuleToken lv_description_9_0 = null;

        AntlrDatatypeRuleToken lv_method_11_0 = null;

        Enumerator lv_state_13_0 = null;

        Enumerator lv_status_15_0 = null;

        EObject lv_assumptionVerificationResult_16_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4718:28: ( (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) ) ) ( (lv_assumptionVerificationResult_16_0= ruleVerificationResult ) )* otherlv_17= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4719:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) ) ) ( (lv_assumptionVerificationResult_16_0= ruleVerificationResult ) )* otherlv_17= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4719:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) ) ) ( (lv_assumptionVerificationResult_16_0= ruleVerificationResult ) )* otherlv_17= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4720:2: otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) ) ) ( (lv_assumptionVerificationResult_16_0= ruleVerificationResult ) )* otherlv_17= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationResult10823); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getVerificationResultAccess().getVerificationKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Result,FOLLOW_Result_in_ruleVerificationResult10835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getVerificationResultAccess().getResultKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4729:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4730:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4730:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4731:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult10851); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getVerificationResultAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

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


            }

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_ruleVerificationResult10869); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVerificationResultAccess().getOfKeyword_3());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4752:1: ( (otherlv_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4753:1: (otherlv_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4753:1: (otherlv_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4754:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getVerificationResultRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult10888); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getVerificationResultAccess().getVerificationActivityVerificationActivityCrossReference_4_0()); 
              	
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4765:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4767:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4767:1: ( ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4768:2: ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* )
            {
            getUnorderedGroupHelper().enter(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5());
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4771:2: ( ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4772:3: ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4772:3: ( ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) ) )*
            loop65:
            do {
                int alt65=6;
                int LA65_0 = input.LA(1);

                if ( LA65_0 ==Output && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 0) ) {
                    alt65=1;
                }
                else if ( LA65_0 ==Logfile && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 1) ) {
                    alt65=2;
                }
                else if ( LA65_0 ==Date && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 2) ) {
                    alt65=3;
                }
                else if ( LA65_0 ==State && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 3) ) {
                    alt65=4;
                }
                else if ( LA65_0 ==Status && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 4) ) {
                    alt65=5;
                }


                switch (alt65) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4774:4: ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4774:4: ({...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4775:5: {...}? => ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 0) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4775:115: ( ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4776:6: ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 0);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4779:6: ({...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4779:7: {...}? => (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4779:16: (otherlv_6= Output ( (lv_title_7_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4780:2: otherlv_6= Output ( (lv_title_7_0= ruleValueString ) )
            	    {
            	    otherlv_6=(Token)match(input,Output,FOLLOW_Output_in_ruleVerificationResult10947); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_6, grammarAccess.getVerificationResultAccess().getOutputKeyword_5_0_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4784:1: ( (lv_title_7_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4785:1: (lv_title_7_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4785:1: (lv_title_7_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4786:3: lv_title_7_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationResultAccess().getTitleValueStringParserRuleCall_5_0_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult10967);
            	    lv_title_7_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"title",
            	              		lv_title_7_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4809:4: ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4809:4: ({...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4810:5: {...}? => ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 1) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4810:115: ( ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4811:6: ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 1);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4814:6: ({...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4814:7: {...}? => (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4814:16: (otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4815:2: otherlv_8= Logfile ( (lv_description_9_0= ruleValueString ) )
            	    {
            	    otherlv_8=(Token)match(input,Logfile,FOLLOW_Logfile_in_ruleVerificationResult11036); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_8, grammarAccess.getVerificationResultAccess().getLogfileKeyword_5_1_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4819:1: ( (lv_description_9_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4820:1: (lv_description_9_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4820:1: (lv_description_9_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4821:3: lv_description_9_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationResultAccess().getDescriptionValueStringParserRuleCall_5_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult11056);
            	    lv_description_9_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"description",
            	              		lv_description_9_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4844:4: ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4844:4: ({...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4845:5: {...}? => ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 2) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4845:115: ( ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4846:6: ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 2);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4849:6: ({...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4849:7: {...}? => (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4849:16: (otherlv_10= Date ( (lv_method_11_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4850:2: otherlv_10= Date ( (lv_method_11_0= ruleValueString ) )
            	    {
            	    otherlv_10=(Token)match(input,Date,FOLLOW_Date_in_ruleVerificationResult11125); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_10, grammarAccess.getVerificationResultAccess().getDateKeyword_5_2_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4854:1: ( (lv_method_11_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4855:1: (lv_method_11_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4855:1: (lv_method_11_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4856:3: lv_method_11_0= ruleValueString
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationResultAccess().getMethodValueStringParserRuleCall_5_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult11145);
            	    lv_method_11_0=ruleValueString();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"method",
            	              		lv_method_11_0, 
            	              		"ValueString");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 4 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4879:4: ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4879:4: ({...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4880:5: {...}? => ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 3) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4880:115: ( ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4881:6: ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 3);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4884:6: ({...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4884:7: {...}? => (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4884:16: (otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4885:2: otherlv_12= State ( (lv_state_13_0= ruleVerificationResultState ) )
            	    {
            	    otherlv_12=(Token)match(input,State,FOLLOW_State_in_ruleVerificationResult11214); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_12, grammarAccess.getVerificationResultAccess().getStateKeyword_5_3_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4889:1: ( (lv_state_13_0= ruleVerificationResultState ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4890:1: (lv_state_13_0= ruleVerificationResultState )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4890:1: (lv_state_13_0= ruleVerificationResultState )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4891:3: lv_state_13_0= ruleVerificationResultState
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStateVerificationResultStateEnumRuleCall_5_3_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVerificationResultState_in_ruleVerificationResult11234);
            	    lv_state_13_0=ruleVerificationResultState();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"state",
            	              		lv_state_13_0, 
            	              		"VerificationResultState");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;
            	case 5 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4914:4: ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4914:4: ({...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4915:5: {...}? => ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 4) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4915:115: ( ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4916:6: ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) )
            	    {
            	    getUnorderedGroupHelper().select(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5(), 4);
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4919:6: ({...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4919:7: {...}? => (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) )
            	    {
            	    if ( !((true)) ) {
            	        if (state.backtracking>0) {state.failed=true; return current;}
            	        throw new FailedPredicateException(input, "ruleVerificationResult", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4919:16: (otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4920:2: otherlv_14= Status ( (lv_status_15_0= ruleVerificationResultStatus ) )
            	    {
            	    otherlv_14=(Token)match(input,Status,FOLLOW_Status_in_ruleVerificationResult11303); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_14, grammarAccess.getVerificationResultAccess().getStatusKeyword_5_4_0());
            	          
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4924:1: ( (lv_status_15_0= ruleVerificationResultStatus ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4925:1: (lv_status_15_0= ruleVerificationResultStatus )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4925:1: (lv_status_15_0= ruleVerificationResultStatus )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4926:3: lv_status_15_0= ruleVerificationResultStatus
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStatusVerificationResultStatusEnumRuleCall_5_4_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult11323);
            	    lv_status_15_0=ruleVerificationResultStatus();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
            	      	        }
            	             		set(
            	             			current, 
            	             			"status",
            	              		lv_status_15_0, 
            	              		"VerificationResultStatus");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }


            	    }


            	    }

            	    getUnorderedGroupHelper().returnFromSelection(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5());

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop65;
                }
            } while (true);


            }


            }

            getUnorderedGroupHelper().leave(grammarAccess.getVerificationResultAccess().getUnorderedGroup_5());

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4956:2: ( (lv_assumptionVerificationResult_16_0= ruleVerificationResult ) )*
            loop66:
            do {
                int alt66=2;
                int LA66_0 = input.LA(1);

                if ( (LA66_0==Verification) ) {
                    alt66=1;
                }


                switch (alt66) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4957:1: (lv_assumptionVerificationResult_16_0= ruleVerificationResult )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4957:1: (lv_assumptionVerificationResult_16_0= ruleVerificationResult )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4958:3: lv_assumptionVerificationResult_16_0= ruleVerificationResult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getVerificationResultAccess().getAssumptionVerificationResultVerificationResultParserRuleCall_6_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVerificationResult_in_ruleVerificationResult11385);
            	    lv_assumptionVerificationResult_16_0=ruleVerificationResult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"assumptionVerificationResult",
            	              		lv_assumptionVerificationResult_16_0, 
            	              		"VerificationResult");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop66;
                }
            } while (true);

            otherlv_17=(Token)match(input,End,FOLLOW_End_in_ruleVerificationResult11399); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_17, grammarAccess.getVerificationResultAccess().getEndKeyword_7());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationResult"


    // $ANTLR start "entryRuleAssuranceResult"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4987:1: entryRuleAssuranceResult returns [EObject current=null] : iv_ruleAssuranceResult= ruleAssuranceResult EOF ;
    public final EObject entryRuleAssuranceResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAssuranceResult = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4988:2: (iv_ruleAssuranceResult= ruleAssuranceResult EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4989:2: iv_ruleAssuranceResult= ruleAssuranceResult EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAssuranceResultRule()); 
            }
            pushFollow(FOLLOW_ruleAssuranceResult_in_entryRuleAssuranceResult11433);
            iv_ruleAssuranceResult=ruleAssuranceResult();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAssuranceResult; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAssuranceResult11443); if (state.failed) return current;

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
    // $ANTLR end "entryRuleAssuranceResult"


    // $ANTLR start "ruleAssuranceResult"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4996:1: ruleAssuranceResult returns [EObject current=null] : (otherlv_0= Assurance otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) (otherlv_5= Pass ( (lv_passCount_6_0= RULE_INT ) ) ) (otherlv_7= Fail ( (lv_failCount_8_0= RULE_INT ) ) ) (otherlv_9= Neutral ( (lv_neutralCount_10_0= RULE_INT ) ) ) (otherlv_11= Unknown ( (lv_unknownCount_12_0= RULE_INT ) ) ) ( (lv_subClaimResult_13_0= ruleAssuranceResult ) )* ( (lv_subVAResult_14_0= ruleVerificationResult ) )* otherlv_15= End ) ;
    public final EObject ruleAssuranceResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token lv_passCount_6_0=null;
        Token otherlv_7=null;
        Token lv_failCount_8_0=null;
        Token otherlv_9=null;
        Token lv_neutralCount_10_0=null;
        Token otherlv_11=null;
        Token lv_unknownCount_12_0=null;
        Token otherlv_15=null;
        EObject lv_subClaimResult_13_0 = null;

        EObject lv_subVAResult_14_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4999:28: ( (otherlv_0= Assurance otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) (otherlv_5= Pass ( (lv_passCount_6_0= RULE_INT ) ) ) (otherlv_7= Fail ( (lv_failCount_8_0= RULE_INT ) ) ) (otherlv_9= Neutral ( (lv_neutralCount_10_0= RULE_INT ) ) ) (otherlv_11= Unknown ( (lv_unknownCount_12_0= RULE_INT ) ) ) ( (lv_subClaimResult_13_0= ruleAssuranceResult ) )* ( (lv_subVAResult_14_0= ruleVerificationResult ) )* otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5000:1: (otherlv_0= Assurance otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) (otherlv_5= Pass ( (lv_passCount_6_0= RULE_INT ) ) ) (otherlv_7= Fail ( (lv_failCount_8_0= RULE_INT ) ) ) (otherlv_9= Neutral ( (lv_neutralCount_10_0= RULE_INT ) ) ) (otherlv_11= Unknown ( (lv_unknownCount_12_0= RULE_INT ) ) ) ( (lv_subClaimResult_13_0= ruleAssuranceResult ) )* ( (lv_subVAResult_14_0= ruleVerificationResult ) )* otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5000:1: (otherlv_0= Assurance otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) (otherlv_5= Pass ( (lv_passCount_6_0= RULE_INT ) ) ) (otherlv_7= Fail ( (lv_failCount_8_0= RULE_INT ) ) ) (otherlv_9= Neutral ( (lv_neutralCount_10_0= RULE_INT ) ) ) (otherlv_11= Unknown ( (lv_unknownCount_12_0= RULE_INT ) ) ) ( (lv_subClaimResult_13_0= ruleAssuranceResult ) )* ( (lv_subVAResult_14_0= ruleVerificationResult ) )* otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5001:2: otherlv_0= Assurance otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) ) (otherlv_5= Pass ( (lv_passCount_6_0= RULE_INT ) ) ) (otherlv_7= Fail ( (lv_failCount_8_0= RULE_INT ) ) ) (otherlv_9= Neutral ( (lv_neutralCount_10_0= RULE_INT ) ) ) (otherlv_11= Unknown ( (lv_unknownCount_12_0= RULE_INT ) ) ) ( (lv_subClaimResult_13_0= ruleAssuranceResult ) )* ( (lv_subVAResult_14_0= ruleVerificationResult ) )* otherlv_15= End
            {
            otherlv_0=(Token)match(input,Assurance,FOLLOW_Assurance_in_ruleAssuranceResult11481); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getAssuranceResultAccess().getAssuranceKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,Result,FOLLOW_Result_in_ruleAssuranceResult11493); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getAssuranceResultAccess().getResultKeyword_1());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5010:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5011:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5011:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5012:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssuranceResult11509); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_name_2_0, grammarAccess.getAssuranceResultAccess().getNameIDTerminalRuleCall_2_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceResultRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"name",
                      		lv_name_2_0, 
                      		"ID");
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_ruleAssuranceResult11527); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getAssuranceResultAccess().getOfKeyword_3());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5033:1: ( (otherlv_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5034:1: (otherlv_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5034:1: (otherlv_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5035:3: otherlv_4= RULE_ID
            {
            if ( state.backtracking==0 ) {

              			if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceResultRule());
              	        }
                      
            }
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAssuranceResult11546); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		newLeafNode(otherlv_4, grammarAccess.getAssuranceResultAccess().getRequirementRequirementCrossReference_4_0()); 
              	
            }

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5046:2: (otherlv_5= Pass ( (lv_passCount_6_0= RULE_INT ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5047:2: otherlv_5= Pass ( (lv_passCount_6_0= RULE_INT ) )
            {
            otherlv_5=(Token)match(input,Pass,FOLLOW_Pass_in_ruleAssuranceResult11560); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getAssuranceResultAccess().getPassKeyword_5_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5051:1: ( (lv_passCount_6_0= RULE_INT ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5052:1: (lv_passCount_6_0= RULE_INT )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5052:1: (lv_passCount_6_0= RULE_INT )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5053:3: lv_passCount_6_0= RULE_INT
            {
            lv_passCount_6_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssuranceResult11576); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_passCount_6_0, grammarAccess.getAssuranceResultAccess().getPassCountINTTerminalRuleCall_5_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceResultRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"passCount",
                      		lv_passCount_6_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5069:3: (otherlv_7= Fail ( (lv_failCount_8_0= RULE_INT ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5070:2: otherlv_7= Fail ( (lv_failCount_8_0= RULE_INT ) )
            {
            otherlv_7=(Token)match(input,Fail,FOLLOW_Fail_in_ruleAssuranceResult11596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getAssuranceResultAccess().getFailKeyword_6_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5074:1: ( (lv_failCount_8_0= RULE_INT ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5075:1: (lv_failCount_8_0= RULE_INT )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5075:1: (lv_failCount_8_0= RULE_INT )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5076:3: lv_failCount_8_0= RULE_INT
            {
            lv_failCount_8_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssuranceResult11612); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_failCount_8_0, grammarAccess.getAssuranceResultAccess().getFailCountINTTerminalRuleCall_6_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceResultRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"failCount",
                      		lv_failCount_8_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5092:3: (otherlv_9= Neutral ( (lv_neutralCount_10_0= RULE_INT ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5093:2: otherlv_9= Neutral ( (lv_neutralCount_10_0= RULE_INT ) )
            {
            otherlv_9=(Token)match(input,Neutral,FOLLOW_Neutral_in_ruleAssuranceResult11632); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_9, grammarAccess.getAssuranceResultAccess().getNeutralKeyword_7_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5097:1: ( (lv_neutralCount_10_0= RULE_INT ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5098:1: (lv_neutralCount_10_0= RULE_INT )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5098:1: (lv_neutralCount_10_0= RULE_INT )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5099:3: lv_neutralCount_10_0= RULE_INT
            {
            lv_neutralCount_10_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssuranceResult11648); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_neutralCount_10_0, grammarAccess.getAssuranceResultAccess().getNeutralCountINTTerminalRuleCall_7_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceResultRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"neutralCount",
                      		lv_neutralCount_10_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5115:3: (otherlv_11= Unknown ( (lv_unknownCount_12_0= RULE_INT ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5116:2: otherlv_11= Unknown ( (lv_unknownCount_12_0= RULE_INT ) )
            {
            otherlv_11=(Token)match(input,Unknown,FOLLOW_Unknown_in_ruleAssuranceResult11668); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_11, grammarAccess.getAssuranceResultAccess().getUnknownKeyword_8_0());
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5120:1: ( (lv_unknownCount_12_0= RULE_INT ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5121:1: (lv_unknownCount_12_0= RULE_INT )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5121:1: (lv_unknownCount_12_0= RULE_INT )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5122:3: lv_unknownCount_12_0= RULE_INT
            {
            lv_unknownCount_12_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleAssuranceResult11684); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              			newLeafNode(lv_unknownCount_12_0, grammarAccess.getAssuranceResultAccess().getUnknownCountINTTerminalRuleCall_8_1_0()); 
              		
            }
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElement(grammarAccess.getAssuranceResultRule());
              	        }
                     		setWithLastConsumed(
                     			current, 
                     			"unknownCount",
                      		lv_unknownCount_12_0, 
                      		"INT");
              	    
            }

            }


            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5138:3: ( (lv_subClaimResult_13_0= ruleAssuranceResult ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==Assurance) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5139:1: (lv_subClaimResult_13_0= ruleAssuranceResult )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5139:1: (lv_subClaimResult_13_0= ruleAssuranceResult )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5140:3: lv_subClaimResult_13_0= ruleAssuranceResult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssuranceResultAccess().getSubClaimResultAssuranceResultParserRuleCall_9_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAssuranceResult_in_ruleAssuranceResult11711);
            	    lv_subClaimResult_13_0=ruleAssuranceResult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssuranceResultRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subClaimResult",
            	              		lv_subClaimResult_13_0, 
            	              		"AssuranceResult");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5156:3: ( (lv_subVAResult_14_0= ruleVerificationResult ) )*
            loop68:
            do {
                int alt68=2;
                int LA68_0 = input.LA(1);

                if ( (LA68_0==Verification) ) {
                    alt68=1;
                }


                switch (alt68) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5157:1: (lv_subVAResult_14_0= ruleVerificationResult )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5157:1: (lv_subVAResult_14_0= ruleVerificationResult )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5158:3: lv_subVAResult_14_0= ruleVerificationResult
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getAssuranceResultAccess().getSubVAResultVerificationResultParserRuleCall_10_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVerificationResult_in_ruleAssuranceResult11733);
            	    lv_subVAResult_14_0=ruleVerificationResult();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getAssuranceResultRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"subVAResult",
            	              		lv_subVAResult_14_0, 
            	              		"VerificationResult");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    break loop68;
                }
            } while (true);

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleAssuranceResult11747); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_15, grammarAccess.getAssuranceResultAccess().getEndKeyword_11());
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleAssuranceResult"


    // $ANTLR start "entryRuleQPREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5189:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5190:1: (iv_ruleQPREF= ruleQPREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5191:2: iv_ruleQPREF= ruleQPREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQPREFRule()); 
            }
            pushFollow(FOLLOW_ruleQPREF_in_entryRuleQPREF11784);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQPREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQPREF11795); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5198:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5202:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5203:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5203:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5203:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF11835); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5210:1: (kw= ColonColon this_ID_2= RULE_ID )*
            loop69:
            do {
                int alt69=2;
                int LA69_0 = input.LA(1);

                if ( (LA69_0==ColonColon) ) {
                    alt69=1;
                }


                switch (alt69) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5211:2: kw= ColonColon this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQPREF11854); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF11869); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop69;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleQPREF"


    // $ANTLR start "entryRuleQNEREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5231:1: entryRuleQNEREF returns [String current=null] : iv_ruleQNEREF= ruleQNEREF EOF ;
    public final String entryRuleQNEREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNEREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5232:1: (iv_ruleQNEREF= ruleQNEREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5233:2: iv_ruleQNEREF= ruleQNEREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQNEREFRule()); 
            }
            pushFollow(FOLLOW_ruleQNEREF_in_entryRuleQNEREF11916);
            iv_ruleQNEREF=ruleQNEREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQNEREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNEREF11927); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5240:1: ruleQNEREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQNEREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5244:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5245:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5245:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5245:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5245:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop70:
            do {
                int alt70=2;
                int LA70_0 = input.LA(1);

                if ( (LA70_0==RULE_ID) ) {
                    int LA70_1 = input.LA(2);

                    if ( (LA70_1==ColonColon) ) {
                        alt70=1;
                    }


                }


                switch (alt70) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5245:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF11968); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQNEREF11986); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQNEREFAccess().getColonColonKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop70;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF12003); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5265:1: (kw= FullStop this_ID_4= RULE_ID )*
            loop71:
            do {
                int alt71=2;
                int LA71_0 = input.LA(1);

                if ( (LA71_0==FullStop) ) {
                    alt71=1;
                }


                switch (alt71) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5266:2: kw= FullStop this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQNEREF12022); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getQNEREFAccess().getFullStopKeyword_2_0()); 
            	          
            	    }
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF12037); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_4);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_4, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_2_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop71;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleQNEREF"


    // $ANTLR start "entryRuleQDOTTEDPAREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5286:1: entryRuleQDOTTEDPAREF returns [String current=null] : iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF ;
    public final String entryRuleQDOTTEDPAREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQDOTTEDPAREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5287:1: (iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5288:2: iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getQDOTTEDPAREFRule()); 
            }
            pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_entryRuleQDOTTEDPAREF12084);
            iv_ruleQDOTTEDPAREF=ruleQDOTTEDPAREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleQDOTTEDPAREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleQDOTTEDPAREF12095); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5295:1: ruleQDOTTEDPAREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF ) ;
    public final AntlrDatatypeRuleToken ruleQDOTTEDPAREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QNEREF_0 = null;

        AntlrDatatypeRuleToken this_PAREF_1 = null;

        AntlrDatatypeRuleToken this_PAREF_2 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5299:6: ( ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5300:1: ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5300:1: ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF )
            int alt73=2;
            int LA73_0 = input.LA(1);

            if ( (LA73_0==RULE_ID) ) {
                alt73=1;
            }
            else if ( (LA73_0==NumberSign) ) {
                alt73=2;
            }
            else {
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 73, 0, input);

                throw nvae;
            }
            switch (alt73) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5300:2: (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5300:2: (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5301:5: this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )?
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getQNEREFParserRuleCall_0_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleQNEREF_in_ruleQDOTTEDPAREF12143);
                    this_QNEREF_0=ruleQNEREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_QNEREF_0);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5311:1: (this_PAREF_1= rulePAREF )?
                    int alt72=2;
                    int LA72_0 = input.LA(1);

                    if ( (LA72_0==NumberSign) ) {
                        alt72=1;
                    }
                    switch (alt72) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5312:5: this_PAREF_1= rulePAREF
                            {
                            if ( state.backtracking==0 ) {
                               
                                      newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getPAREFParserRuleCall_0_1()); 
                                  
                            }
                            pushFollow(FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF12171);
                            this_PAREF_1=rulePAREF();

                            state._fsp--;
                            if (state.failed) return current;
                            if ( state.backtracking==0 ) {

                              		current.merge(this_PAREF_1);
                                  
                            }
                            if ( state.backtracking==0 ) {
                               
                                      afterParserOrEnumRuleCall();
                                  
                            }

                            }
                            break;

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5324:5: this_PAREF_2= rulePAREF
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getPAREFParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF12207);
                    this_PAREF_2=rulePAREF();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_PAREF_2);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              afterParserOrEnumRuleCall();
                          
                    }

                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleQDOTTEDPAREF"


    // $ANTLR start "entryRuleDOTTEDREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5342:1: entryRuleDOTTEDREF returns [String current=null] : iv_ruleDOTTEDREF= ruleDOTTEDREF EOF ;
    public final String entryRuleDOTTEDREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOTTEDREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5343:1: (iv_ruleDOTTEDREF= ruleDOTTEDREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5344:2: iv_ruleDOTTEDREF= ruleDOTTEDREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOTTEDREFRule()); 
            }
            pushFollow(FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF12252);
            iv_ruleDOTTEDREF=ruleDOTTEDREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOTTEDREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOTTEDREF12263); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5351:1: ruleDOTTEDREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOTTEDREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5355:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5356:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5356:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5356:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF12303); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5363:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==FullStop) ) {
                    alt74=1;
                }


                switch (alt74) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5364:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOTTEDREF12322); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDOTTEDREFAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF12337); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleDOTTEDREF"


    // $ANTLR start "entryRuleCATREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5384:1: entryRuleCATREF returns [String current=null] : iv_ruleCATREF= ruleCATREF EOF ;
    public final String entryRuleCATREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleCATREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5385:1: (iv_ruleCATREF= ruleCATREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5386:2: iv_ruleCATREF= ruleCATREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCATREFRule()); 
            }
            pushFollow(FOLLOW_ruleCATREF_in_entryRuleCATREF12384);
            iv_ruleCATREF=ruleCATREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCATREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCATREF12395); if (state.failed) return current;

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
    // $ANTLR end "entryRuleCATREF"


    // $ANTLR start "ruleCATREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5393:1: ruleCATREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID kw= FullStop this_ID_2= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleCATREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5397:6: ( (this_ID_0= RULE_ID kw= FullStop this_ID_2= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5398:1: (this_ID_0= RULE_ID kw= FullStop this_ID_2= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5398:1: (this_ID_0= RULE_ID kw= FullStop this_ID_2= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5398:6: this_ID_0= RULE_ID kw= FullStop this_ID_2= RULE_ID
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCATREF12435); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getCATREFAccess().getIDTerminalRuleCall_0()); 
                  
            }
            kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleCATREF12453); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getCATREFAccess().getFullStopKeyword_1()); 
                  
            }
            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCATREF12468); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getCATREFAccess().getIDTerminalRuleCall_2()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleCATREF"


    // $ANTLR start "entryRulePAREF"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5426:1: entryRulePAREF returns [String current=null] : iv_rulePAREF= rulePAREF EOF ;
    public final String entryRulePAREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePAREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5427:1: (iv_rulePAREF= rulePAREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5428:2: iv_rulePAREF= rulePAREF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPAREFRule()); 
            }
            pushFollow(FOLLOW_rulePAREF_in_entryRulePAREF12513);
            iv_rulePAREF=rulePAREF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePAREF.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePAREF12524); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5435:1: rulePAREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken rulePAREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5439:6: ( (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5440:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5440:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5441:2: kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )?
            {
            kw=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_rulePAREF12562); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getPAREFAccess().getNumberSignKeyword_0()); 
                  
            }
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF12577); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_1, grammarAccess.getPAREFAccess().getIDTerminalRuleCall_1()); 
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5453:1: (kw= ColonColon this_ID_3= RULE_ID )?
            int alt75=2;
            int LA75_0 = input.LA(1);

            if ( (LA75_0==ColonColon) ) {
                alt75=1;
            }
            switch (alt75) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5454:2: kw= ColonColon this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_rulePAREF12596); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getPAREFAccess().getColonColonKeyword_2_0()); 
                          
                    }
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF12611); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      		current.merge(this_ID_3);
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                          newLeafNode(this_ID_3, grammarAccess.getPAREFAccess().getIDTerminalRuleCall_2_1()); 
                          
                    }

                    }
                    break;

            }


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "rulePAREF"


    // $ANTLR start "entryRuleDOCPATH"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5474:1: entryRuleDOCPATH returns [String current=null] : iv_ruleDOCPATH= ruleDOCPATH EOF ;
    public final String entryRuleDOCPATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCPATH = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5475:1: (iv_ruleDOCPATH= ruleDOCPATH EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5476:2: iv_ruleDOCPATH= ruleDOCPATH EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOCPATHRule()); 
            }
            pushFollow(FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH12658);
            iv_ruleDOCPATH=ruleDOCPATH();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOCPATH.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCPATH12669); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5483:1: ruleDOCPATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDOCPATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5487:6: ( ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5488:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5488:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5488:2: (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5488:2: (this_ID_0= RULE_ID kw= Solidus )*
            loop76:
            do {
                int alt76=2;
                int LA76_0 = input.LA(1);

                if ( (LA76_0==RULE_ID) ) {
                    int LA76_1 = input.LA(2);

                    if ( (LA76_1==Solidus) ) {
                        alt76=1;
                    }


                }


                switch (alt76) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5488:7: this_ID_0= RULE_ID kw= Solidus
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH12710); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_0);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_0, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_0_0()); 
            	          
            	    }
            	    kw=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleDOCPATH12728); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDOCPATHAccess().getSolidusKeyword_0_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop76;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH12745); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_2);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_2, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_1()); 
                  
            }
            kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCPATH12763); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDOCPATHAccess().getFullStopKeyword_2()); 
                  
            }
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH12778); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_4);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_4, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_3()); 
                  
            }

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleDOCPATH"


    // $ANTLR start "entryRuleDOCFRAGMENT"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5529:1: entryRuleDOCFRAGMENT returns [String current=null] : iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF ;
    public final String entryRuleDOCFRAGMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCFRAGMENT = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5530:1: (iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5531:2: iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDOCFRAGMENTRule()); 
            }
            pushFollow(FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT12823);
            iv_ruleDOCFRAGMENT=ruleDOCFRAGMENT();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDOCFRAGMENT.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCFRAGMENT12834); if (state.failed) return current;

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5538:1: ruleDOCFRAGMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOCFRAGMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5542:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5543:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5543:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5543:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT12874); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_ID_0);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_ID_0, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_0()); 
                  
            }
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5550:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop77:
            do {
                int alt77=2;
                int LA77_0 = input.LA(1);

                if ( (LA77_0==FullStop) ) {
                    alt77=1;
                }


                switch (alt77) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5551:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCFRAGMENT12893); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	              current.merge(kw);
            	              newLeafNode(kw, grammarAccess.getDOCFRAGMENTAccess().getFullStopKeyword_1_0()); 
            	          
            	    }
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT12908); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      		current.merge(this_ID_2);
            	          
            	    }
            	    if ( state.backtracking==0 ) {
            	       
            	          newLeafNode(this_ID_2, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_1_1()); 
            	          
            	    }

            	    }
            	    break;

            	default :
            	    break loop77;
                }
            } while (true);


            }


            }

            if ( state.backtracking==0 ) {
               leaveRule();
                  
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
    // $ANTLR end "ruleDOCFRAGMENT"


    // $ANTLR start "ruleVerificationResultState"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5571:1: ruleVerificationResultState returns [Enumerator current=null] : ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) ;
    public final Enumerator ruleVerificationResultState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5573:28: ( ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5574:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5574:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            int alt78=3;
            switch ( input.LA(1) ) {
            case Scheduled:
                {
                alt78=1;
                }
                break;
            case Completed:
                {
                alt78=2;
                }
                break;
            case Inprogress:
                {
                alt78=3;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 78, 0, input);

                throw nvae;
            }

            switch (alt78) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5574:2: (enumLiteral_0= Scheduled )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5574:2: (enumLiteral_0= Scheduled )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5574:7: enumLiteral_0= Scheduled
                    {
                    enumLiteral_0=(Token)match(input,Scheduled,FOLLOW_Scheduled_in_ruleVerificationResultState12972); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5580:6: (enumLiteral_1= Completed )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5580:6: (enumLiteral_1= Completed )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5580:11: enumLiteral_1= Completed
                    {
                    enumLiteral_1=(Token)match(input,Completed,FOLLOW_Completed_in_ruleVerificationResultState12994); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5586:6: (enumLiteral_2= Inprogress )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5586:6: (enumLiteral_2= Inprogress )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5586:11: enumLiteral_2= Inprogress
                    {
                    enumLiteral_2=(Token)match(input,Inprogress,FOLLOW_Inprogress_in_ruleVerificationResultState13016); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerificationResultStateAccess().getINPROGRESSEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVerificationResultStateAccess().getINPROGRESSEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationResultState"


    // $ANTLR start "ruleVerificationResultStatus"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5596:1: ruleVerificationResultStatus returns [Enumerator current=null] : ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Neutral ) | (enumLiteral_3= Unknown ) ) ;
    public final Enumerator ruleVerificationResultStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5598:28: ( ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Neutral ) | (enumLiteral_3= Unknown ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5599:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Neutral ) | (enumLiteral_3= Unknown ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5599:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Neutral ) | (enumLiteral_3= Unknown ) )
            int alt79=4;
            switch ( input.LA(1) ) {
            case Pass:
                {
                alt79=1;
                }
                break;
            case Fail:
                {
                alt79=2;
                }
                break;
            case Neutral:
                {
                alt79=3;
                }
                break;
            case Unknown:
                {
                alt79=4;
                }
                break;
            default:
                if (state.backtracking>0) {state.failed=true; return current;}
                NoViableAltException nvae =
                    new NoViableAltException("", 79, 0, input);

                throw nvae;
            }

            switch (alt79) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5599:2: (enumLiteral_0= Pass )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5599:2: (enumLiteral_0= Pass )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5599:7: enumLiteral_0= Pass
                    {
                    enumLiteral_0=(Token)match(input,Pass,FOLLOW_Pass_in_ruleVerificationResultStatus13066); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0()); 
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5605:6: (enumLiteral_1= Fail )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5605:6: (enumLiteral_1= Fail )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5605:11: enumLiteral_1= Fail
                    {
                    enumLiteral_1=(Token)match(input,Fail,FOLLOW_Fail_in_ruleVerificationResultStatus13088); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1()); 
                          
                    }

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5611:6: (enumLiteral_2= Neutral )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5611:6: (enumLiteral_2= Neutral )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5611:11: enumLiteral_2= Neutral
                    {
                    enumLiteral_2=(Token)match(input,Neutral,FOLLOW_Neutral_in_ruleVerificationResultStatus13110); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerificationResultStatusAccess().getNEUTRALEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_2, grammarAccess.getVerificationResultStatusAccess().getNEUTRALEnumLiteralDeclaration_2()); 
                          
                    }

                    }


                    }
                    break;
                case 4 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5617:6: (enumLiteral_3= Unknown )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5617:6: (enumLiteral_3= Unknown )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:5617:11: enumLiteral_3= Unknown
                    {
                    enumLiteral_3=(Token)match(input,Unknown,FOLLOW_Unknown_in_ruleVerificationResultStatus13132); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current = grammarAccess.getVerificationResultStatusAccess().getUNKNOWNEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                              newLeafNode(enumLiteral_3, grammarAccess.getVerificationResultStatusAccess().getUNKNOWNEnumLiteralDeclaration_3()); 
                          
                    }

                    }


                    }
                    break;

            }


            }

            if ( state.backtracking==0 ) {
               leaveRule(); 
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
    // $ANTLR end "ruleVerificationResultStatus"

    // $ANTLR start synpred1_InternalAlisaParser
    public final void synpred1_InternalAlisaParser_fragment() throws RecognitionException {   
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:3: ( ( () ( ( EqualsSignGreaterThanSign ) ) ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:4: ( () ( ( EqualsSignGreaterThanSign ) ) )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:4: ( () ( ( EqualsSignGreaterThanSign ) ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:5: () ( ( EqualsSignGreaterThanSign ) )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3760:5: ()
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3761:1: 
        {
        }

        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3761:2: ( ( EqualsSignGreaterThanSign ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3762:1: ( EqualsSignGreaterThanSign )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3762:1: ( EqualsSignGreaterThanSign )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3764:1: EqualsSignGreaterThanSign
        {
        match(input,EqualsSignGreaterThanSign,FOLLOW_EqualsSignGreaterThanSign_in_synpred1_InternalAlisaParser8604); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred1_InternalAlisaParser

    // $ANTLR start synpred2_InternalAlisaParser
    public final void synpred2_InternalAlisaParser_fragment() throws RecognitionException {   
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:3: ( ( () ( ( Or ) ) ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:4: ( () ( ( Or ) ) )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:4: ( () ( ( Or ) ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:5: () ( ( Or ) )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3838:5: ()
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3839:1: 
        {
        }

        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3839:2: ( ( Or ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3840:1: ( Or )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3840:1: ( Or )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3842:1: Or
        {
        match(input,Or,FOLLOW_Or_in_synpred2_InternalAlisaParser8782); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred2_InternalAlisaParser

    // $ANTLR start synpred3_InternalAlisaParser
    public final void synpred3_InternalAlisaParser_fragment() throws RecognitionException {   
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:3: ( ( () ( ( And ) ) ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:4: ( () ( ( And ) ) )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:4: ( () ( ( And ) ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:5: () ( ( And ) )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3916:5: ()
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3917:1: 
        {
        }

        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3917:2: ( ( And ) )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3918:1: ( And )
        {
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3918:1: ( And )
        // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3920:1: And
        {
        match(input,And,FOLLOW_And_in_synpred3_InternalAlisaParser8960); if (state.failed) return ;

        }


        }


        }


        }
    }
    // $ANTLR end synpred3_InternalAlisaParser

    // Delegated rules

    public final boolean synpred1_InternalAlisaParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred1_InternalAlisaParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred2_InternalAlisaParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred2_InternalAlisaParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }
    public final boolean synpred3_InternalAlisaParser() {
        state.backtracking++;
        int start = input.mark();
        try {
            synpred3_InternalAlisaParser_fragment(); // can never throw exception
        } catch (RecognitionException re) {
            System.err.println("impossible: "+re);
        }
        boolean success = !state.failed;
        input.rewind(start);
        state.backtracking--;
        state.failed=false;
        return success;
    }


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA45 dfa45 = new DFA45(this);
    protected DFA62 dfa62 = new DFA62(this);
    static final String DFA28_eotS =
        "\23\uffff";
    static final String DFA28_eofS =
        "\23\uffff";
    static final String DFA28_minS =
        "\1\6\15\uffff\1\7\4\uffff";
    static final String DFA28_maxS =
        "\1\67\15\uffff\1\104\4\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\21\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\uffff\1\16\1\15\1\20\1\17";
    static final String DFA28_specialS =
        "\1\0\15\uffff\1\1\4\uffff}>";
    static final String[] DFA28_transitionS = {
            "\1\5\1\uffff\1\15\2\uffff\1\12\1\uffff\1\6\2\uffff\1\14\1\7"+
            "\4\uffff\1\3\1\uffff\1\13\5\uffff\1\11\3\uffff\1\10\10\uffff"+
            "\1\4\11\uffff\1\1\1\2\1\16",
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
            "\1\17\17\uffff\1\22\27\uffff\1\20\24\uffff\1\21",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA28_eot = DFA.unpackEncodedString(DFA28_eotS);
    static final short[] DFA28_eof = DFA.unpackEncodedString(DFA28_eofS);
    static final char[] DFA28_min = DFA.unpackEncodedStringToUnsignedChars(DFA28_minS);
    static final char[] DFA28_max = DFA.unpackEncodedStringToUnsignedChars(DFA28_maxS);
    static final short[] DFA28_accept = DFA.unpackEncodedString(DFA28_acceptS);
    static final short[] DFA28_special = DFA.unpackEncodedString(DFA28_specialS);
    static final short[][] DFA28_transition;

    static {
        int numStates = DFA28_transitionS.length;
        DFA28_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA28_transition[i] = DFA.unpackEncodedString(DFA28_transitionS[i]);
        }
    }

    class DFA28 extends DFA {

        public DFA28(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 28;
            this.eot = DFA28_eot;
            this.eof = DFA28_eof;
            this.min = DFA28_min;
            this.max = DFA28_max;
            this.accept = DFA28_accept;
            this.special = DFA28_special;
            this.transition = DFA28_transition;
        }
        public String getDescription() {
            return "()* loopback of 820:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Goal ( ( ruleDOTTEDREF ) ) (otherlv_44= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_46= See otherlv_47= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= Document ( (lv_docReference_53_0= ruleXDocUri ) ) (otherlv_54= Comma ( (lv_docReference_55_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_56= See otherlv_57= Colon ( (lv_modelReference_58_0= ruleQDOTTEDPAREF ) ) (otherlv_59= Comma ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==End) ) {s = 1;}

                        else if ( LA28_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA28_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA28_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA28_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA28_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA28_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA28_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA28_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA28_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA28_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA28_0 ==Conflicts && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA28_0 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA28_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) ) {s = 14;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_14 = input.LA(1);

                         
                        int index28_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA28_14 ==Requirement && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA28_14 ==Goal && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {s = 16;}

                        else if ( LA28_14 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) ) {s = 17;}

                        else if ( LA28_14 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {s = 18;}

                         
                        input.seek(index28_14);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA41_eotS =
        "\27\uffff";
    static final String DFA41_eofS =
        "\27\uffff";
    static final String DFA41_minS =
        "\1\5\10\uffff\1\7\6\uffff\1\111\3\uffff\1\0\2\uffff";
    static final String DFA41_maxS =
        "\1\67\10\uffff\1\104\6\uffff\1\111\3\uffff\1\0\2\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\23\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14"+
        "\1\17\1\20\1\21\1\uffff\1\22\1\16\1\11\1\uffff\1\10\1\15";
    static final String DFA41_specialS =
        "\1\1\10\uffff\1\0\6\uffff\1\3\3\uffff\1\2\2\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\15\1\5\4\uffff\1\13\1\uffff\1\6\3\uffff\1\7\2\uffff\1\16"+
            "\1\uffff\1\3\1\uffff\1\14\5\uffff\1\12\3\uffff\1\10\10\uffff"+
            "\1\4\11\uffff\1\1\1\2\1\11",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\22\17\uffff\1\17\11\uffff\1\23\15\uffff\1\20\24\uffff\1"+
            "\21",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\24",
            "",
            "",
            "",
            "\1\uffff",
            "",
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 1667:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleCATREF ) ) (otherlv_7= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Goal ( ( ruleDOTTEDREF ) ) (otherlv_46= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_48= See otherlv_49= Requirement ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_53_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_54_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= See otherlv_56= Document ( (lv_docReference_57_0= ruleXDocUri ) ) (otherlv_58= Comma ( (lv_docReference_59_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_60= See otherlv_61= Colon ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) (otherlv_63= Comma ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA41_9 = input.LA(1);

                         
                        int index41_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA41_9 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) ) {s = 15;}

                        else if ( LA41_9 ==Goal && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) ) {s = 16;}

                        else if ( LA41_9 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 17) ) {s = 17;}

                        else if ( LA41_9 ==Requirement && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {s = 18;}

                        else if ( LA41_9 ==Hazard && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {s = 19;}

                         
                        input.seek(index41_9);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA41_0 = input.LA(1);

                         
                        int index41_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA41_0==End) ) {s = 1;}

                        else if ( LA41_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA41_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA41_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA41_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA41_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA41_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA41_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA41_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 17) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) ) {s = 9;}

                        else if ( LA41_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {s = 10;}

                        else if ( LA41_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {s = 11;}

                        else if ( LA41_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {s = 12;}

                        else if ( LA41_0 ==Verification && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {s = 13;}

                        else if ( LA41_0 ==Argument && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {s = 14;}

                         
                        input.seek(index41_0);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA41_20 = input.LA(1);

                         
                        int index41_20 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {s = 21;}

                        else if ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {s = 22;}

                         
                        input.seek(index41_20);
                        if ( s>=0 ) return s;
                        break;
                    case 3 : 
                        int LA41_16 = input.LA(1);

                         
                        int index41_16 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA41_16 ==RULE_ID && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) ) {s = 20;}

                         
                        input.seek(index41_16);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 41, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA45_eotS =
        "\13\uffff";
    static final String DFA45_eofS =
        "\13\uffff";
    static final String DFA45_minS =
        "\1\5\12\uffff";
    static final String DFA45_maxS =
        "\1\66\12\uffff";
    static final String DFA45_acceptS =
        "\1\uffff\1\12\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11";
    static final String DFA45_specialS =
        "\1\0\12\uffff}>";
    static final String[] DFA45_transitionS = {
            "\1\7\1\5\12\uffff\1\11\2\uffff\1\10\1\6\1\3\13\uffff\1\12\10"+
            "\uffff\1\4\11\uffff\1\1\1\2",
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

    static final short[] DFA45_eot = DFA.unpackEncodedString(DFA45_eotS);
    static final short[] DFA45_eof = DFA.unpackEncodedString(DFA45_eofS);
    static final char[] DFA45_min = DFA.unpackEncodedStringToUnsignedChars(DFA45_minS);
    static final char[] DFA45_max = DFA.unpackEncodedStringToUnsignedChars(DFA45_maxS);
    static final short[] DFA45_accept = DFA.unpackEncodedString(DFA45_acceptS);
    static final short[] DFA45_special = DFA.unpackEncodedString(DFA45_specialS);
    static final short[][] DFA45_transition;

    static {
        int numStates = DFA45_transitionS.length;
        DFA45_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA45_transition[i] = DFA.unpackEncodedString(DFA45_transitionS[i]);
        }
    }

    class DFA45 extends DFA {

        public DFA45(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 45;
            this.eot = DFA45_eot;
            this.eof = DFA45_eof;
            this.min = DFA45_min;
            this.max = DFA45_max;
            this.accept = DFA45_accept;
            this.special = DFA45_special;
            this.transition = DFA45_transition;
        }
        public String getDescription() {
            return "()* loopback of 2591:3: ( ({...}? => ( ({...}? => (otherlv_4= For ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_6= Category ( ( ruleCATREF ) ) (otherlv_8= Comma ( ( ruleCATREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= Title ( (lv_title_11_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_12= Description ( (lv_description_13_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_14= Asserted otherlv_15= By ( ( ruleDOTTEDREF ) ) ) ) ) ) | ({...}? => ( ({...}? => ( (lv_verifiedBy_17_0= ruleVerificationActivity ) ) )+ ) ) | ({...}? => ( ({...}? => ( (lv_argument_18_0= ruleAssuranceArgument ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_19= Rationale ( (lv_rationale_20_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Issues ( (lv_issue_22_0= ruleValueString ) ) (otherlv_23= Comma ( (lv_issue_24_0= ruleValueString ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA45_0 = input.LA(1);

                         
                        int index45_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA45_0==End) ) {s = 1;}

                        else if ( LA45_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 0) ) {s = 2;}

                        else if ( LA45_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 1) ) {s = 3;}

                        else if ( LA45_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 2) ) {s = 4;}

                        else if ( LA45_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 3) ) {s = 5;}

                        else if ( LA45_0 ==Asserted && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 4) ) {s = 6;}

                        else if ( LA45_0 ==Verification && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 5) ) {s = 7;}

                        else if ( LA45_0 ==Argument && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 6) ) {s = 8;}

                        else if ( LA45_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 7) ) {s = 9;}

                        else if ( LA45_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationAssumptionAccess().getUnorderedGroup_3(), 8) ) {s = 10;}

                         
                        input.seek(index45_0);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 45, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA62_eotS =
        "\13\uffff";
    static final String DFA62_eofS =
        "\1\1\12\uffff";
    static final String DFA62_minS =
        "\1\5\1\uffff\2\110\1\111\3\0\3\uffff";
    static final String DFA62_maxS =
        "\1\65\1\uffff\2\110\1\111\3\0\3\uffff";
    static final String DFA62_acceptS =
        "\1\uffff\1\4\6\uffff\1\1\1\2\1\3";
    static final String DFA62_specialS =
        "\5\uffff\1\0\1\2\1\1\3\uffff}>";
    static final String[] DFA62_transitionS = {
            "\1\1\1\3\17\uffff\1\4\14\uffff\1\1\7\uffff\1\2\11\uffff\1\1",
            "",
            "\1\5",
            "\1\6",
            "\1\7",
            "\1\uffff",
            "\1\uffff",
            "\1\uffff",
            "",
            "",
            ""
    };

    static final short[] DFA62_eot = DFA.unpackEncodedString(DFA62_eotS);
    static final short[] DFA62_eof = DFA.unpackEncodedString(DFA62_eofS);
    static final char[] DFA62_min = DFA.unpackEncodedStringToUnsignedChars(DFA62_minS);
    static final char[] DFA62_max = DFA.unpackEncodedStringToUnsignedChars(DFA62_maxS);
    static final short[] DFA62_accept = DFA.unpackEncodedString(DFA62_acceptS);
    static final short[] DFA62_special = DFA.unpackEncodedString(DFA62_specialS);
    static final short[][] DFA62_transition;

    static {
        int numStates = DFA62_transitionS.length;
        DFA62_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA62_transition[i] = DFA.unpackEncodedString(DFA62_transitionS[i]);
        }
    }

    class DFA62 extends DFA {

        public DFA62(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 62;
            this.eot = DFA62_eot;
            this.eof = DFA62_eof;
            this.min = DFA62_min;
            this.max = DFA62_max;
            this.accept = DFA62_accept;
            this.special = DFA62_special;
            this.transition = DFA62_transition;
        }
        public String getDescription() {
            return "()* loopback of 4442:3: ( ({...}? => ( ({...}? => (otherlv_7= Title ( (lv_title_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Description ( (lv_description_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Category ( ( ruleDOTTEDREF ) ) (otherlv_13= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA62_5 = input.LA(1);

                         
                        int index62_5 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 0) ) {s = 8;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_5);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA62_7 = input.LA(1);

                         
                        int index62_7 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 2) ) {s = 10;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_7);
                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA62_6 = input.LA(1);

                         
                        int index62_6 = input.index();
                        input.rewind();
                        s = -1;
                        if ( getUnorderedGroupHelper().canSelect(grammarAccess.getVerificationMethodAccess().getUnorderedGroup_6(), 1) ) {s = 9;}

                        else if ( (true) ) {s = 1;}

                         
                        input.seek(index62_6);
                        if ( s>=0 ) return s;
                        break;
            }
            if (state.backtracking>0) {state.failed=true; return -1;}
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 62, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

    public static final BitSet FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlisaModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_ruleAlisaModel124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_ruleAlisaModel151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementCategories_in_ruleAlisaModel178 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationCategories_in_ruleAlisaModel205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssuranceCase_in_ruleAlisaModel232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_entryRuleRSALPackage268 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSALPackage278 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_ruleRSALPackage316 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage332 = new BitSet(new long[]{0x00088000848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_Imports_in_ruleRSALPackage351 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage370 = new BitSet(new long[]{0x00088000848000A0L,0x0000000000000082L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage384 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage403 = new BitSet(new long[]{0x00088000848000A0L,0x0000000000000082L});
    public static final BitSet FOLLOW_With_in_ruleRSALPackage421 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage443 = new BitSet(new long[]{0x00088000848000A0L,0x0000000000000082L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage457 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage479 = new BitSet(new long[]{0x00088000848000A0L,0x0000000000000082L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleRSALPackage506 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleRSALPackage525 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleContractualElementProxy_in_ruleRSALPackage544 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleRSALSection_in_ruleRSALPackage563 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_ruleRSALPackage582 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExternalDocument_in_ruleRSALPackage601 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALPackage619 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALPackage639 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALPackage673 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRSALPackage690 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALSection_in_entryRuleRSALSection724 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSALSection734 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Section_in_ruleRSALSection772 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALSection788 = new BitSet(new long[]{0x00488000848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_For_in_ruleRSALSection807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRSALSection829 = new BitSet(new long[]{0x00088000848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleGoal_in_ruleRSALSection854 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleRSALSection873 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleContractualElementProxy_in_ruleRSALSection892 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleRSALSection_in_ruleRSALSection911 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_ruleRSALSection930 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleExternalDocument_in_ruleRSALSection949 = new BitSet(new long[]{0x00288004848000A0L,0x0000000000000080L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALSection967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection987 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALSection1001 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection1021 = new BitSet(new long[]{0x0020000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRSALSection1038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_entryRuleOrganization1072 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganization1082 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Organization_in_ruleOrganization1120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrganization1136 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleOrganization1162 = new BitSet(new long[]{0x0020000000000100L});
    public static final BitSet FOLLOW_End_in_ruleOrganization1176 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionElement_in_entryRuleDescriptionElement1212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionElement1222 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescriptionElement1264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDescriptionElement1295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractualElementProxy_in_entryRuleContractualElementProxy1332 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContractualElementProxy1342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CommercialAt_in_ruleContractualElementProxy1380 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElementProxy1402 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal1437 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal1447 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goal_in_ruleGoal1485 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal1501 = new BitSet(new long[]{0x00E0080441432940L});
    public static final BitSet FOLLOW_For_in_ruleGoal1565 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleGoal1587 = new BitSet(new long[]{0x00E0080441432940L});
    public static final BitSet FOLLOW_Category_in_ruleGoal1656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleCATREF_in_ruleGoal1678 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal1692 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleCATREF_in_ruleGoal1714 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleGoal1785 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal1805 = new BitSet(new long[]{0x00E0080441432940L});
    public static final BitSet FOLLOW_Description_in_ruleGoal1874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal1894 = new BitSet(new long[]{0x00E0080441432940L});
    public static final BitSet FOLLOW_Assertion_in_ruleGoal1963 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal1983 = new BitSet(new long[]{0x00E0080441432940L});
    public static final BitSet FOLLOW_Rationale_in_ruleGoal2052 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal2072 = new BitSet(new long[]{0x00E0080441432940L});
    public static final BitSet FOLLOW_Issues_in_ruleGoal2141 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal2161 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal2175 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal2195 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleGoal2266 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2288 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal2302 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2324 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleGoal2395 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2417 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal2431 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2453 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleGoal2524 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2546 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal2560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2582 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Conflicts_in_ruleGoal2653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2675 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal2689 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2711 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleGoal2782 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2804 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal2818 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2840 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal2911 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_Goal_in_ruleGoal2923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2945 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal2959 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal2981 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal3052 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Requirement_in_ruleGoal3064 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3086 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal3100 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3122 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal3193 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleGoal3205 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal3225 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal3239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal3259 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal3330 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleGoal3342 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal3362 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal3376 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal3396 = new BitSet(new long[]{0x00E0080441432940L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleGoal3452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement3486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement3496 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Requirement_in_ruleRequirement3534 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement3550 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_For_in_ruleRequirement3614 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement3636 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_Category_in_ruleRequirement3705 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleCATREF_in_ruleRequirement3727 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement3741 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleCATREF_in_ruleRequirement3763 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleRequirement3834 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement3854 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_Description_in_ruleRequirement3923 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement3943 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_Assertion_in_ruleRequirement4012 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement4032 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_Rationale_in_ruleRequirement4101 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement4121 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_Issues_in_ruleRequirement4190 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement4210 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement4224 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement4244 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement4315 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_Goal_in_ruleRequirement4327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement4346 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement4360 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement4379 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement4450 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_Hazard_in_ruleRequirement4462 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement4482 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement4496 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement4516 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleRequirement4587 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement4609 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement4623 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement4645 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleRequirement4716 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement4738 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement4752 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement4774 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleRequirement4845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement4867 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement4881 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement4903 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement4974 = new BitSet(new long[]{0x0000800000000000L});
    public static final BitSet FOLLOW_Goal_in_ruleRequirement4986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5008 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5044 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement5115 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_Requirement_in_ruleRequirement5127 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5149 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5163 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5185 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_ruleRequirement5263 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_ruleAssuranceArgument_in_ruleRequirement5339 = new BitSet(new long[]{0x00E0080441522860L});
    public static final BitSet FOLLOW_See_in_ruleRequirement5407 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleRequirement5419 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement5439 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement5473 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement5544 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleRequirement5556 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement5576 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5590 = new BitSet(new long[]{0x2000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement5610 = new BitSet(new long[]{0x00E0080441522860L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRequirement5666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationAssumption_in_entryRuleVerificationAssumption5700 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationAssumption5710 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationAssumption5748 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Assumption_in_ruleVerificationAssumption5760 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationAssumption5776 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_For_in_ruleVerificationAssumption5840 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationAssumption5862 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_Category_in_ruleVerificationAssumption5931 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleCATREF_in_ruleVerificationAssumption5953 = new BitSet(new long[]{0x0060080400720060L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleVerificationAssumption5967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleCATREF_in_ruleVerificationAssumption5989 = new BitSet(new long[]{0x0060080400720060L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleVerificationAssumption6060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationAssumption6080 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_Description_in_ruleVerificationAssumption6149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationAssumption6169 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_Asserted_in_ruleVerificationAssumption6238 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_By_in_ruleVerificationAssumption6250 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationAssumption6272 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_ruleVerificationAssumption6348 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_ruleAssuranceArgument_in_ruleVerificationAssumption6424 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_Rationale_in_ruleVerificationAssumption6492 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationAssumption6512 = new BitSet(new long[]{0x0060080400720060L});
    public static final BitSet FOLLOW_Issues_in_ruleVerificationAssumption6581 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationAssumption6601 = new BitSet(new long[]{0x0060080400720060L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleVerificationAssumption6615 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationAssumption6635 = new BitSet(new long[]{0x0060080400720060L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleVerificationAssumption6691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument6725 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalDocument6735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Document_in_ruleExternalDocument6773 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalDocument6789 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_See_in_ruleExternalDocument6807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_ruleExternalDocument6827 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_End_in_ruleExternalDocument6840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDocUri_in_entryRuleXDocUri6874 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDocUri6884 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleXDocUri6932 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_NumberSign_in_ruleXDocUri6946 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri6966 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementCategories_in_entryRuleRequirementCategories7003 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementCategories7013 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Requirement_in_ruleRequirementCategories7051 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Categories_in_ruleRequirementCategories7063 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementCategories7079 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleRequirementCategory_in_ruleRequirementCategories7105 = new BitSet(new long[]{0x0020000000400000L});
    public static final BitSet FOLLOW_End_in_ruleRequirementCategories7119 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationCategories_in_entryRuleVerificationCategories7153 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationCategories7163 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationCategories7201 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_Categories_in_ruleVerificationCategories7213 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationCategories7229 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_ruleVerificationCategory_in_ruleVerificationCategories7255 = new BitSet(new long[]{0x0020000000400000L});
    public static final BitSet FOLLOW_End_in_ruleVerificationCategories7269 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementCategory_in_entryRuleRequirementCategory7305 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementCategory7315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Category_in_ruleRequirementCategory7353 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementCategory7369 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_Extends_in_ruleRequirementCategory7388 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirementCategory7410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationCategory_in_entryRuleVerificationCategory7447 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationCategory7457 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Category_in_ruleVerificationCategory7495 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationCategory7511 = new BitSet(new long[]{0x0000000002000002L});
    public static final BitSet FOLLOW_Extends_in_ruleVerificationCategory7530 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationCategory7552 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueString_in_entryRuleValueString7590 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueString7601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueString7640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder7683 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder7693 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleStakeholder7731 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder7747 = new BitSet(new long[]{0x00240B0000000040L});
    public static final BitSet FOLLOW_Title_in_ruleStakeholder7811 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder7831 = new BitSet(new long[]{0x00240B0000000040L});
    public static final BitSet FOLLOW_Description_in_ruleStakeholder7900 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder7920 = new BitSet(new long[]{0x00240B0000000040L});
    public static final BitSet FOLLOW_Role_in_ruleStakeholder7989 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8009 = new BitSet(new long[]{0x00240B0000000040L});
    public static final BitSet FOLLOW_Email_in_ruleStakeholder8078 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8098 = new BitSet(new long[]{0x00240B0000000040L});
    public static final BitSet FOLLOW_Phone_in_ruleStakeholder8167 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8187 = new BitSet(new long[]{0x00240B0000000040L});
    public static final BitSet FOLLOW_End_in_ruleStakeholder8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssuranceArgument_in_entryRuleAssuranceArgument8275 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssuranceArgument8285 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Argument_in_ruleAssuranceArgument8323 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleArgumentExpr_in_ruleAssuranceArgument8343 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000020L});
    public static final BitSet FOLLOW_Semicolon_in_ruleAssuranceArgument8356 = new BitSet(new long[]{0x0020000000020000L});
    public static final BitSet FOLLOW_Rationale_in_ruleAssuranceArgument8369 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleAssuranceArgument8389 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_End_in_ruleAssuranceArgument8404 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentExpr_in_entryRuleArgumentExpr8438 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentExpr8448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleArgumentExpr8494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_entryRuleImpliesExpr8527 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleImpliesExpr8537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_ruleImpliesExpr8584 = new BitSet(new long[]{0x0200000000000002L});
    public static final BitSet FOLLOW_EqualsSignGreaterThanSign_in_ruleImpliesExpr8634 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleImpliesExpr_in_ruleImpliesExpr8668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrExpr_in_entryRuleOrExpr8705 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrExpr8715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr8762 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_Or_in_ruleOrExpr8812 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAndExpr_in_ruleOrExpr8846 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleAndExpr_in_entryRuleAndExpr8883 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAndExpr8893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_ruleAndExpr8940 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_And_in_ruleAndExpr8990 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_ruleAndExpr9024 = new BitSet(new long[]{0x0010000000000002L});
    public static final BitSet FOLLOW_ruleAtomicExpr_in_entryRuleAtomicExpr9061 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomicExpr9071 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentReference_in_ruleAtomicExpr9127 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LeftParenthesis_in_ruleAtomicExpr9148 = new BitSet(new long[]{0x4000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleArgumentExpr_in_ruleAtomicExpr9169 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_RightParenthesis_in_ruleAtomicExpr9181 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleArgumentReference_in_entryRuleArgumentReference9216 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleArgumentReference9226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleArgumentReference9274 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_Asterisk_in_ruleArgumentReference9288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleArgumentReference9304 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity9346 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationActivity9356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationActivity9394 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Activity_in_ruleVerificationActivity9406 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity9422 = new BitSet(new long[]{0x0020080800400060L});
    public static final BitSet FOLLOW_Title_in_ruleVerificationActivity9486 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity9506 = new BitSet(new long[]{0x0020080800400060L});
    public static final BitSet FOLLOW_Description_in_ruleVerificationActivity9575 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity9595 = new BitSet(new long[]{0x0020080800400060L});
    public static final BitSet FOLLOW_Category_in_ruleVerificationActivity9664 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9686 = new BitSet(new long[]{0x0020080800400060L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleVerificationActivity9700 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9722 = new BitSet(new long[]{0x0020080800400060L,0x0000000000000002L});
    public static final BitSet FOLLOW_Method_in_ruleVerificationActivity9793 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity9813 = new BitSet(new long[]{0x0020080800400060L});
    public static final BitSet FOLLOW_ruleVerificationAssumption_in_ruleVerificationActivity9889 = new BitSet(new long[]{0x0020080800400060L});
    public static final BitSet FOLLOW_End_in_ruleVerificationActivity9943 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod9977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationMethod9987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationMethod10025 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_Method_in_ruleVerificationMethod10037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationMethod10053 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_EqualsSign_in_ruleVerificationMethod10071 = new BitSet(new long[]{0x0001008000000000L});
    public static final BitSet FOLLOW_ruleSupportedLanguage_in_ruleVerificationMethod10091 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationMethod10112 = new BitSet(new long[]{0x0000080000400042L});
    public static final BitSet FOLLOW_Title_in_ruleVerificationMethod10171 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationMethod10191 = new BitSet(new long[]{0x0000080000400042L});
    public static final BitSet FOLLOW_Description_in_ruleVerificationMethod10260 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationMethod10280 = new BitSet(new long[]{0x0000080000400042L});
    public static final BitSet FOLLOW_Category_in_ruleVerificationMethod10349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationMethod10371 = new BitSet(new long[]{0x0000080000400042L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleVerificationMethod10385 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationMethod10407 = new BitSet(new long[]{0x0000080000400042L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSupportedLanguage_in_entryRuleSupportedLanguage10486 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSupportedLanguage10497 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Lute_in_ruleSupportedLanguage10535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Agree_in_ruleSupportedLanguage10554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssuranceCase_in_entryRuleAssuranceCase10593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssuranceCase10603 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Assurance_in_ruleAssuranceCase10641 = new BitSet(new long[]{0x0000100000000000L});
    public static final BitSet FOLLOW_Case_in_ruleAssuranceCase10653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssuranceCase10669 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_For_in_ruleAssuranceCase10687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssuranceCase10706 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_ruleAssuranceResult_in_ruleAssuranceCase10727 = new BitSet(new long[]{0x0020000000004000L});
    public static final BitSet FOLLOW_End_in_ruleAssuranceCase10741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult10775 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResult10785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationResult10823 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Result_in_ruleVerificationResult10835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult10851 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_Of_in_ruleVerificationResult10869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult10888 = new BitSet(new long[]{0x0020245008000020L});
    public static final BitSet FOLLOW_Output_in_ruleVerificationResult10947 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult10967 = new BitSet(new long[]{0x0020245008000020L});
    public static final BitSet FOLLOW_Logfile_in_ruleVerificationResult11036 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult11056 = new BitSet(new long[]{0x0020245008000020L});
    public static final BitSet FOLLOW_Date_in_ruleVerificationResult11125 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult11145 = new BitSet(new long[]{0x0020245008000020L});
    public static final BitSet FOLLOW_State_in_ruleVerificationResult11214 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_ruleVerificationResult11234 = new BitSet(new long[]{0x0020245008000020L});
    public static final BitSet FOLLOW_Status_in_ruleVerificationResult11303 = new BitSet(new long[]{0x0002400110000000L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult11323 = new BitSet(new long[]{0x0020245008000020L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_ruleVerificationResult11385 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_End_in_ruleVerificationResult11399 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAssuranceResult_in_entryRuleAssuranceResult11433 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAssuranceResult11443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Assurance_in_ruleAssuranceResult11481 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_Result_in_ruleAssuranceResult11493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssuranceResult11509 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_Of_in_ruleAssuranceResult11527 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAssuranceResult11546 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Pass_in_ruleAssuranceResult11560 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssuranceResult11576 = new BitSet(new long[]{0x0000400000000000L});
    public static final BitSet FOLLOW_Fail_in_ruleAssuranceResult11596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssuranceResult11612 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_Neutral_in_ruleAssuranceResult11632 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssuranceResult11648 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_Unknown_in_ruleAssuranceResult11668 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000800L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleAssuranceResult11684 = new BitSet(new long[]{0x0020000000004020L});
    public static final BitSet FOLLOW_ruleAssuranceResult_in_ruleAssuranceResult11711 = new BitSet(new long[]{0x0020000000004020L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_ruleAssuranceResult11733 = new BitSet(new long[]{0x0020000000000020L});
    public static final BitSet FOLLOW_End_in_ruleAssuranceResult11747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_entryRuleQPREF11784 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQPREF11795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF11835 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQPREF11854 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF11869 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ruleQNEREF_in_entryRuleQNEREF11916 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNEREF11927 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF11968 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQNEREF11986 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF12003 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleQNEREF12022 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF12037 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_entryRuleQDOTTEDPAREF12084 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQDOTTEDPAREF12095 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleQDOTTEDPAREF12143 = new BitSet(new long[]{0x2000000000000002L,0x0000000000000200L});
    public static final BitSet FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF12171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF12207 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF12252 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOTTEDREF12263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF12303 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOTTEDREF12322 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF12337 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleCATREF_in_entryRuleCATREF12384 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCATREF12395 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCATREF12435 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleCATREF12453 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCATREF12468 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePAREF_in_entryRulePAREF12513 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePAREF12524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumberSign_in_rulePAREF12562 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF12577 = new BitSet(new long[]{0x0100000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_rulePAREF12596 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF12611 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH12658 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCPATH12669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH12710 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Solidus_in_ruleDOCPATH12728 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH12745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCPATH12763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH12778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT12823 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCFRAGMENT12834 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT12874 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCFRAGMENT12893 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000200L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT12908 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_Scheduled_in_ruleVerificationResultState12972 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Completed_in_ruleVerificationResultState12994 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Inprogress_in_ruleVerificationResultState13016 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pass_in_ruleVerificationResultStatus13066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fail_in_ruleVerificationResultStatus13088 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Neutral_in_ruleVerificationResultStatus13110 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unknown_in_ruleVerificationResultStatus13132 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EqualsSignGreaterThanSign_in_synpred1_InternalAlisaParser8604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Or_in_synpred2_InternalAlisaParser8782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_And_in_synpred3_InternalAlisaParser8960 = new BitSet(new long[]{0x0000000000000002L});

}
