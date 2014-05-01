package edu.cmu.sei.alisa.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stakeholder'", "'title'", "':'", "'description'", "'role'", "'end'", "';'", "'requirement'", "'comment'", "'referenced'", "'by'", "'decomposed'", "'and'", "'or'", "'system'", "'element'", "'reference'", "'element-type'", "'model-type'", "'documentDetails'", "'version'", "'verification'", "'activity'", "'method'", "'manual'", "'automatic'", "'result'", "'of'", "'output'", "'logfile'", "'date'", "'state'", "'status'", "'ok'", "'unknown'", "'tbd'"
    };
    public static final int RULE_ID=5;
    public static final int T__29=29;
    public static final int T__28=28;
    public static final int T__27=27;
    public static final int T__26=26;
    public static final int T__25=25;
    public static final int T__24=24;
    public static final int T__23=23;
    public static final int T__22=22;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__21=21;
    public static final int T__20=20;
    public static final int EOF=-1;
    public static final int T__19=19;
    public static final int T__16=16;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_STRING=4;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int RULE_WS=9;

    // delegates
    // delegators


        public InternalAlisaParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalAlisaParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalAlisaParser.tokenNames; }
    public String getGrammarFileName() { return "../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g"; }



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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:67:1: entryRuleAlisaModel returns [EObject current=null] : iv_ruleAlisaModel= ruleAlisaModel EOF ;
    public final EObject entryRuleAlisaModel() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlisaModel = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:68:2: (iv_ruleAlisaModel= ruleAlisaModel EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:69:2: iv_ruleAlisaModel= ruleAlisaModel EOF
            {
             newCompositeNode(grammarAccess.getAlisaModelRule()); 
            pushFollow(FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel75);
            iv_ruleAlisaModel=ruleAlisaModel();

            state._fsp--;

             current =iv_ruleAlisaModel; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlisaModel85); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:76:1: ruleAlisaModel returns [EObject current=null] : ( ( (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType ) ) )* ;
    public final EObject ruleAlisaModel() throws RecognitionException {
        EObject current = null;

        EObject lv_content_0_1 = null;

        EObject lv_content_0_2 = null;

        EObject lv_content_0_3 = null;

        EObject lv_content_0_4 = null;

        EObject lv_content_0_5 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:79:28: ( ( ( (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:80:1: ( ( (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:80:1: ( ( (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==11||LA2_0==18||LA2_0==25||LA2_0==32) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:81:1: ( (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:81:1: ( (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:82:1: (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:82:1: (lv_content_0_1= ruleStakeholder | lv_content_0_2= ruleRequirement | lv_content_0_3= ruleVerificationActivity | lv_content_0_4= ruleVerificationResult | lv_content_0_5= ruleElementType )
            	    int alt1=5;
            	    switch ( input.LA(1) ) {
            	    case 11:
            	        {
            	        alt1=1;
            	        }
            	        break;
            	    case 18:
            	        {
            	        alt1=2;
            	        }
            	        break;
            	    case 32:
            	        {
            	        int LA1_3 = input.LA(2);

            	        if ( (LA1_3==37) ) {
            	            alt1=4;
            	        }
            	        else if ( (LA1_3==33) ) {
            	            alt1=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 1, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 25:
            	        {
            	        alt1=5;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 1, 0, input);

            	        throw nvae;
            	    }

            	    switch (alt1) {
            	        case 1 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:83:3: lv_content_0_1= ruleStakeholder
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAlisaModelAccess().getContentStakeholderParserRuleCall_0_0()); 
            	            	    
            	            pushFollow(FOLLOW_ruleStakeholder_in_ruleAlisaModel132);
            	            lv_content_0_1=ruleStakeholder();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAlisaModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"content",
            	                    		lv_content_0_1, 
            	                    		"Stakeholder");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 2 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:98:8: lv_content_0_2= ruleRequirement
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAlisaModelAccess().getContentRequirementParserRuleCall_0_1()); 
            	            	    
            	            pushFollow(FOLLOW_ruleRequirement_in_ruleAlisaModel151);
            	            lv_content_0_2=ruleRequirement();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAlisaModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"content",
            	                    		lv_content_0_2, 
            	                    		"Requirement");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 3 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:113:8: lv_content_0_3= ruleVerificationActivity
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAlisaModelAccess().getContentVerificationActivityParserRuleCall_0_2()); 
            	            	    
            	            pushFollow(FOLLOW_ruleVerificationActivity_in_ruleAlisaModel170);
            	            lv_content_0_3=ruleVerificationActivity();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAlisaModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"content",
            	                    		lv_content_0_3, 
            	                    		"VerificationActivity");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 4 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:128:8: lv_content_0_4= ruleVerificationResult
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAlisaModelAccess().getContentVerificationResultParserRuleCall_0_3()); 
            	            	    
            	            pushFollow(FOLLOW_ruleVerificationResult_in_ruleAlisaModel189);
            	            lv_content_0_4=ruleVerificationResult();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAlisaModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"content",
            	                    		lv_content_0_4, 
            	                    		"VerificationResult");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;
            	        case 5 :
            	            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:143:8: lv_content_0_5= ruleElementType
            	            {
            	             
            	            	        newCompositeNode(grammarAccess.getAlisaModelAccess().getContentElementTypeParserRuleCall_0_4()); 
            	            	    
            	            pushFollow(FOLLOW_ruleElementType_in_ruleAlisaModel208);
            	            lv_content_0_5=ruleElementType();

            	            state._fsp--;


            	            	        if (current==null) {
            	            	            current = createModelElementForParent(grammarAccess.getAlisaModelRule());
            	            	        }
            	                   		add(
            	                   			current, 
            	                   			"content",
            	                    		lv_content_0_5, 
            	                    		"ElementType");
            	            	        afterParserOrEnumRuleCall();
            	            	    

            	            }
            	            break;

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


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


    // $ANTLR start "entryRuleValueString"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:169:1: entryRuleValueString returns [String current=null] : iv_ruleValueString= ruleValueString EOF ;
    public final String entryRuleValueString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueString = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:170:2: (iv_ruleValueString= ruleValueString EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:171:2: iv_ruleValueString= ruleValueString EOF
            {
             newCompositeNode(grammarAccess.getValueStringRule()); 
            pushFollow(FOLLOW_ruleValueString_in_entryRuleValueString248);
            iv_ruleValueString=ruleValueString();

            state._fsp--;

             current =iv_ruleValueString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueString259); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:178:1: ruleValueString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleValueString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:181:28: (this_STRING_0= RULE_STRING )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:182:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueString298); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:197:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:198:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:199:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder342);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder352); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:206:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= 'stakeholder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'role' otherlv_9= ':' ( (lv_role_10_0= ruleValueString ) ) )? otherlv_11= 'end' this_ID_12= RULE_ID otherlv_13= ';' ) ;
    public final EObject ruleStakeholder() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token this_ID_12=null;
        Token otherlv_13=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_role_10_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:209:28: ( (otherlv_0= 'stakeholder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'role' otherlv_9= ':' ( (lv_role_10_0= ruleValueString ) ) )? otherlv_11= 'end' this_ID_12= RULE_ID otherlv_13= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:210:1: (otherlv_0= 'stakeholder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'role' otherlv_9= ':' ( (lv_role_10_0= ruleValueString ) ) )? otherlv_11= 'end' this_ID_12= RULE_ID otherlv_13= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:210:1: (otherlv_0= 'stakeholder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'role' otherlv_9= ':' ( (lv_role_10_0= ruleValueString ) ) )? otherlv_11= 'end' this_ID_12= RULE_ID otherlv_13= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:210:3: otherlv_0= 'stakeholder' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'role' otherlv_9= ':' ( (lv_role_10_0= ruleValueString ) ) )? otherlv_11= 'end' this_ID_12= RULE_ID otherlv_13= ';'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_11_in_ruleStakeholder389); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:214:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:215:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:215:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:216:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder406); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:232:2: (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==12) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:232:4: otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleStakeholder424); 

                        	newLeafNode(otherlv_2, grammarAccess.getStakeholderAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder436); 

                        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getColonKeyword_2_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:240:1: ( (lv_title_4_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:241:1: (lv_title_4_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:241:1: (lv_title_4_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:242:3: lv_title_4_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStakeholderAccess().getTitleValueStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder457);
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
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:258:4: (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==14) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:258:6: otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleStakeholder472); 

                        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder484); 

                        	newLeafNode(otherlv_6, grammarAccess.getStakeholderAccess().getColonKeyword_3_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:266:1: ( (lv_description_7_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:267:1: (lv_description_7_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:267:1: (lv_description_7_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:268:3: lv_description_7_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStakeholderAccess().getDescriptionValueStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder505);
                    lv_description_7_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
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
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:284:4: (otherlv_8= 'role' otherlv_9= ':' ( (lv_role_10_0= ruleValueString ) ) )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==15) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:284:6: otherlv_8= 'role' otherlv_9= ':' ( (lv_role_10_0= ruleValueString ) )
                    {
                    otherlv_8=(Token)match(input,15,FOLLOW_15_in_ruleStakeholder520); 

                        	newLeafNode(otherlv_8, grammarAccess.getStakeholderAccess().getRoleKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleStakeholder532); 

                        	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getColonKeyword_4_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:292:1: ( (lv_role_10_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:293:1: (lv_role_10_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:293:1: (lv_role_10_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:294:3: lv_role_10_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getStakeholderAccess().getRoleValueStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder553);
                    lv_role_10_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getStakeholderRule());
                    	        }
                           		set(
                           			current, 
                           			"role",
                            		lv_role_10_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_11=(Token)match(input,16,FOLLOW_16_in_ruleStakeholder567); 

                	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getEndKeyword_5());
                
            this_ID_12=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder578); 
             
                newLeafNode(this_ID_12, grammarAccess.getStakeholderAccess().getIDTerminalRuleCall_6()); 
                
            otherlv_13=(Token)match(input,17,FOLLOW_17_in_ruleStakeholder589); 

                	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getSemicolonKeyword_7());
                

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


    // $ANTLR start "entryRuleRequirement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:330:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:331:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:332:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement625);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement635); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:339:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'referenced' otherlv_12= 'by' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'decomposed' otherlv_16= 'by' otherlv_17= ':' ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )* )? otherlv_19= 'end' this_ID_20= RULE_ID otherlv_21= ';' ) ;
    public final EObject ruleRequirement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token this_ID_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_comment_10_0 = null;

        EObject lv_decomposedBy_18_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:342:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'referenced' otherlv_12= 'by' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'decomposed' otherlv_16= 'by' otherlv_17= ':' ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )* )? otherlv_19= 'end' this_ID_20= RULE_ID otherlv_21= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:343:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'referenced' otherlv_12= 'by' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'decomposed' otherlv_16= 'by' otherlv_17= ':' ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )* )? otherlv_19= 'end' this_ID_20= RULE_ID otherlv_21= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:343:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'referenced' otherlv_12= 'by' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'decomposed' otherlv_16= 'by' otherlv_17= ':' ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )* )? otherlv_19= 'end' this_ID_20= RULE_ID otherlv_21= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:343:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'referenced' otherlv_12= 'by' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'decomposed' otherlv_16= 'by' otherlv_17= ':' ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )* )? otherlv_19= 'end' this_ID_20= RULE_ID otherlv_21= ';'
            {
            otherlv_0=(Token)match(input,18,FOLLOW_18_in_ruleRequirement672); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:347:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:348:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:348:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:349:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement689); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:365:2: (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==12) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:365:4: otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) )
                    {
                    otherlv_2=(Token)match(input,12,FOLLOW_12_in_ruleRequirement707); 

                        	newLeafNode(otherlv_2, grammarAccess.getRequirementAccess().getTitleKeyword_2_0());
                        
                    otherlv_3=(Token)match(input,13,FOLLOW_13_in_ruleRequirement719); 

                        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getColonKeyword_2_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:373:1: ( (lv_title_4_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:374:1: (lv_title_4_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:374:1: (lv_title_4_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:375:3: lv_title_4_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequirementAccess().getTitleValueStringParserRuleCall_2_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement740);
                    lv_title_4_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:391:4: (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==14) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:391:6: otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,14,FOLLOW_14_in_ruleRequirement755); 

                        	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getDescriptionKeyword_3_0());
                        
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleRequirement767); 

                        	newLeafNode(otherlv_6, grammarAccess.getRequirementAccess().getColonKeyword_3_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:399:1: ( (lv_description_7_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:400:1: (lv_description_7_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:400:1: (lv_description_7_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:401:3: lv_description_7_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionValueStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement788);
                    lv_description_7_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
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
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:417:4: (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==19) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:417:6: otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) )
                    {
                    otherlv_8=(Token)match(input,19,FOLLOW_19_in_ruleRequirement803); 

                        	newLeafNode(otherlv_8, grammarAccess.getRequirementAccess().getCommentKeyword_4_0());
                        
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleRequirement815); 

                        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getColonKeyword_4_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:425:1: ( (lv_comment_10_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:426:1: (lv_comment_10_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:426:1: (lv_comment_10_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:427:3: lv_comment_10_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequirementAccess().getCommentValueStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement836);
                    lv_comment_10_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	        }
                           		set(
                           			current, 
                           			"comment",
                            		lv_comment_10_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:443:4: (otherlv_11= 'referenced' otherlv_12= 'by' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:443:6: otherlv_11= 'referenced' otherlv_12= 'by' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )*
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleRequirement851); 

                        	newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getReferencedKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleRequirement863); 

                        	newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getByKeyword_5_1());
                        
                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleRequirement875); 

                        	newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getColonKeyword_5_2());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:455:1: ( (otherlv_14= RULE_ID ) )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==RULE_ID) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:456:1: (otherlv_14= RULE_ID )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:456:1: (otherlv_14= RULE_ID )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:457:3: otherlv_14= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	    	        }
                    	            
                    	    otherlv_14=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement895); 

                    	    		newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getReferencedByElementTypeCrossReference_5_3_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:468:5: (otherlv_15= 'decomposed' otherlv_16= 'by' otherlv_17= ':' ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:468:7: otherlv_15= 'decomposed' otherlv_16= 'by' otherlv_17= ':' ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )*
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleRequirement911); 

                        	newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getDecomposedKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,21,FOLLOW_21_in_ruleRequirement923); 

                        	newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getByKeyword_6_1());
                        
                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleRequirement935); 

                        	newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getColonKeyword_6_2());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:480:1: ( (lv_decomposedBy_18_0= ruleRequirementDecomposition ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:481:1: (lv_decomposedBy_18_0= ruleRequirementDecomposition )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:481:1: (lv_decomposedBy_18_0= ruleRequirementDecomposition )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:482:3: lv_decomposedBy_18_0= ruleRequirementDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposedByRequirementDecompositionParserRuleCall_6_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRequirementDecomposition_in_ruleRequirement956);
                    	    lv_decomposedBy_18_0=ruleRequirementDecomposition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decomposedBy",
                    	            		lv_decomposedBy_18_0, 
                    	            		"RequirementDecomposition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            otherlv_19=(Token)match(input,16,FOLLOW_16_in_ruleRequirement971); 

                	newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getEndKeyword_7());
                
            this_ID_20=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement982); 
             
                newLeafNode(this_ID_20, grammarAccess.getRequirementAccess().getIDTerminalRuleCall_8()); 
                
            otherlv_21=(Token)match(input,17,FOLLOW_17_in_ruleRequirement993); 

                	newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getSemicolonKeyword_9());
                

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


    // $ANTLR start "entryRuleRequirementDecomposition"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:518:1: entryRuleRequirementDecomposition returns [EObject current=null] : iv_ruleRequirementDecomposition= ruleRequirementDecomposition EOF ;
    public final EObject entryRuleRequirementDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementDecomposition = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:519:2: (iv_ruleRequirementDecomposition= ruleRequirementDecomposition EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:520:2: iv_ruleRequirementDecomposition= ruleRequirementDecomposition EOF
            {
             newCompositeNode(grammarAccess.getRequirementDecompositionRule()); 
            pushFollow(FOLLOW_ruleRequirementDecomposition_in_entryRuleRequirementDecomposition1029);
            iv_ruleRequirementDecomposition=ruleRequirementDecomposition();

            state._fsp--;

             current =iv_ruleRequirementDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementDecomposition1039); 

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
    // $ANTLR end "entryRuleRequirementDecomposition"


    // $ANTLR start "ruleRequirementDecomposition"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:527:1: ruleRequirementDecomposition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_left_1_0= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) ) ;
    public final EObject ruleRequirementDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_left_1_0=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:530:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_left_1_0= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:531:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_left_1_0= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:531:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (lv_left_1_0= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==RULE_ID) ) {
                int LA14_1 = input.LA(2);

                if ( (LA14_1==EOF||LA14_1==RULE_ID||LA14_1==16) ) {
                    alt14=1;
                }
                else if ( ((LA14_1>=23 && LA14_1<=24)) ) {
                    alt14=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 14, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:531:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:531:2: ( (otherlv_0= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:532:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:532:1: (otherlv_0= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:533:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementDecompositionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementDecomposition1084); 

                    		newLeafNode(otherlv_0, grammarAccess.getRequirementDecompositionAccess().getElementsRequirementCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:545:6: ( ( (lv_left_1_0= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:545:6: ( ( (lv_left_1_0= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:545:7: ( (lv_left_1_0= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:545:7: ( (lv_left_1_0= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:546:1: (lv_left_1_0= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:546:1: (lv_left_1_0= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:547:3: lv_left_1_0= RULE_ID
                    {
                    lv_left_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementDecomposition1108); 

                    			newLeafNode(lv_left_1_0, grammarAccess.getRequirementDecompositionAccess().getLeftIDTerminalRuleCall_1_0_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementDecompositionRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"left",
                            		lv_left_1_0, 
                            		"ID");
                    	    

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:563:2: ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:564:1: ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:564:1: ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:565:1: (lv_type_2_1= 'and' | lv_type_2_2= 'or' )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:565:1: (lv_type_2_1= 'and' | lv_type_2_2= 'or' )
                    int alt13=2;
                    int LA13_0 = input.LA(1);

                    if ( (LA13_0==23) ) {
                        alt13=1;
                    }
                    else if ( (LA13_0==24) ) {
                        alt13=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 13, 0, input);

                        throw nvae;
                    }
                    switch (alt13) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:566:3: lv_type_2_1= 'and'
                            {
                            lv_type_2_1=(Token)match(input,23,FOLLOW_23_in_ruleRequirementDecomposition1133); 

                                    newLeafNode(lv_type_2_1, grammarAccess.getRequirementDecompositionAccess().getTypeAndKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRequirementDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:578:8: lv_type_2_2= 'or'
                            {
                            lv_type_2_2=(Token)match(input,24,FOLLOW_24_in_ruleRequirementDecomposition1162); 

                                    newLeafNode(lv_type_2_2, grammarAccess.getRequirementDecompositionAccess().getTypeOrKeyword_1_1_0_1());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRequirementDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_2, null);
                            	    

                            }
                            break;

                    }


                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:593:2: ( (lv_right_3_0= ruleRequirementDecomposition ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:594:1: (lv_right_3_0= ruleRequirementDecomposition )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:594:1: (lv_right_3_0= ruleRequirementDecomposition )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:595:3: lv_right_3_0= ruleRequirementDecomposition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequirementDecompositionAccess().getRightRequirementDecompositionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequirementDecomposition_in_ruleRequirementDecomposition1199);
                    lv_right_3_0=ruleRequirementDecomposition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getRequirementDecompositionRule());
                    	        }
                           		set(
                           			current, 
                           			"right",
                            		lv_right_3_0, 
                            		"RequirementDecomposition");
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
    // $ANTLR end "ruleRequirementDecomposition"


    // $ANTLR start "entryRuleElementType"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:619:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:620:2: (iv_ruleElementType= ruleElementType EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:621:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType1236);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType1246); 

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
    // $ANTLR end "entryRuleElementType"


    // $ANTLR start "ruleElementType"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:628:1: ruleElementType returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' ) ;
    public final EObject ruleElementType() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token this_ID_19=null;
        Token otherlv_20=null;
        AntlrDatatypeRuleToken lv_reference_5_0 = null;

        AntlrDatatypeRuleToken lv_elementType_8_0 = null;

        AntlrDatatypeRuleToken lv_modelType_11_0 = null;

        AntlrDatatypeRuleToken lv_details_14_0 = null;

        AntlrDatatypeRuleToken lv_version_17_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:631:28: ( (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:632:1: (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:632:1: (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:632:3: otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleElementType1283); 

                	newLeafNode(otherlv_0, grammarAccess.getElementTypeAccess().getSystemKeyword_0());
                
            otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleElementType1295); 

                	newLeafNode(otherlv_1, grammarAccess.getElementTypeAccess().getElementKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:640:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:641:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:641:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:642:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementType1312); 

            			newLeafNode(lv_name_2_0, grammarAccess.getElementTypeAccess().getNameIDTerminalRuleCall_2_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getElementTypeRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"ID");
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:658:2: (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==27) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:658:4: otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,27,FOLLOW_27_in_ruleElementType1330); 

                        	newLeafNode(otherlv_3, grammarAccess.getElementTypeAccess().getReferenceKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleElementType1342); 

                        	newLeafNode(otherlv_4, grammarAccess.getElementTypeAccess().getColonKeyword_3_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:666:1: ( (lv_reference_5_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:667:1: (lv_reference_5_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:667:1: (lv_reference_5_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:668:3: lv_reference_5_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getReferenceValueStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1363);
                    lv_reference_5_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"reference",
                            		lv_reference_5_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:684:4: (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==28) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:684:6: otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) )
                    {
                    otherlv_6=(Token)match(input,28,FOLLOW_28_in_ruleElementType1378); 

                        	newLeafNode(otherlv_6, grammarAccess.getElementTypeAccess().getElementTypeKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleElementType1390); 

                        	newLeafNode(otherlv_7, grammarAccess.getElementTypeAccess().getColonKeyword_4_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:692:1: ( (lv_elementType_8_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:693:1: (lv_elementType_8_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:693:1: (lv_elementType_8_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:694:3: lv_elementType_8_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getElementTypeValueStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1411);
                    lv_elementType_8_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"elementType",
                            		lv_elementType_8_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:710:4: (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==29) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:710:6: otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) )
                    {
                    otherlv_9=(Token)match(input,29,FOLLOW_29_in_ruleElementType1426); 

                        	newLeafNode(otherlv_9, grammarAccess.getElementTypeAccess().getModelTypeKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleElementType1438); 

                        	newLeafNode(otherlv_10, grammarAccess.getElementTypeAccess().getColonKeyword_5_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:718:1: ( (lv_modelType_11_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:719:1: (lv_modelType_11_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:719:1: (lv_modelType_11_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:720:3: lv_modelType_11_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getModelTypeValueStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1459);
                    lv_modelType_11_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"modelType",
                            		lv_modelType_11_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:736:4: (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==30) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:736:6: otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) )
                    {
                    otherlv_12=(Token)match(input,30,FOLLOW_30_in_ruleElementType1474); 

                        	newLeafNode(otherlv_12, grammarAccess.getElementTypeAccess().getDocumentDetailsKeyword_6_0());
                        
                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleElementType1486); 

                        	newLeafNode(otherlv_13, grammarAccess.getElementTypeAccess().getColonKeyword_6_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:744:1: ( (lv_details_14_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:745:1: (lv_details_14_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:745:1: (lv_details_14_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:746:3: lv_details_14_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getDetailsValueStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1507);
                    lv_details_14_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getElementTypeRule());
                    	        }
                           		set(
                           			current, 
                           			"details",
                            		lv_details_14_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:762:4: (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==31) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:762:6: otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )*
                    {
                    otherlv_15=(Token)match(input,31,FOLLOW_31_in_ruleElementType1522); 

                        	newLeafNode(otherlv_15, grammarAccess.getElementTypeAccess().getVersionKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleElementType1534); 

                        	newLeafNode(otherlv_16, grammarAccess.getElementTypeAccess().getColonKeyword_7_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:770:1: ( (lv_version_17_0= ruleValueString ) )*
                    loop19:
                    do {
                        int alt19=2;
                        int LA19_0 = input.LA(1);

                        if ( (LA19_0==RULE_STRING) ) {
                            alt19=1;
                        }


                        switch (alt19) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:771:1: (lv_version_17_0= ruleValueString )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:771:1: (lv_version_17_0= ruleValueString )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:772:3: lv_version_17_0= ruleValueString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementTypeAccess().getVersionValueStringParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1555);
                    	    lv_version_17_0=ruleValueString();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getElementTypeRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"version",
                    	            		lv_version_17_0, 
                    	            		"ValueString");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop19;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleElementType1570); 

                	newLeafNode(otherlv_18, grammarAccess.getElementTypeAccess().getEndKeyword_8());
                
            this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementType1581); 
             
                newLeafNode(this_ID_19, grammarAccess.getElementTypeAccess().getIDTerminalRuleCall_9()); 
                
            otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleElementType1592); 

                	newLeafNode(otherlv_20, grammarAccess.getElementTypeAccess().getSemicolonKeyword_10());
                

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
    // $ANTLR end "ruleElementType"


    // $ANTLR start "entryRuleVerificationActivity"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:808:1: entryRuleVerificationActivity returns [EObject current=null] : iv_ruleVerificationActivity= ruleVerificationActivity EOF ;
    public final EObject entryRuleVerificationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationActivity = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:809:2: (iv_ruleVerificationActivity= ruleVerificationActivity EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:810:2: iv_ruleVerificationActivity= ruleVerificationActivity EOF
            {
             newCompositeNode(grammarAccess.getVerificationActivityRule()); 
            pushFollow(FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity1628);
            iv_ruleVerificationActivity=ruleVerificationActivity();

            state._fsp--;

             current =iv_ruleVerificationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationActivity1638); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:817:1: ruleVerificationActivity returns [EObject current=null] : (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' ) ;
    public final EObject ruleVerificationActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token this_ID_13=null;
        Token otherlv_14=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_method_11_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:820:28: ( (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:821:1: (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:821:1: (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:821:3: otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? otherlv_12= 'end' this_ID_13= RULE_ID otherlv_14= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleVerificationActivity1675); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationActivityAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,33,FOLLOW_33_in_ruleVerificationActivity1687); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationActivityAccess().getActivityKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:829:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:830:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:830:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:831:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity1704); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:847:2: (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==12) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:847:4: otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleVerificationActivity1722); 

                        	newLeafNode(otherlv_3, grammarAccess.getVerificationActivityAccess().getTitleKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleVerificationActivity1734); 

                        	newLeafNode(otherlv_4, grammarAccess.getVerificationActivityAccess().getColonKeyword_3_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:855:1: ( (lv_title_5_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:856:1: (lv_title_5_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:856:1: (lv_title_5_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:857:3: lv_title_5_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getTitleValueStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity1755);
                    lv_title_5_0=ruleValueString();

                    state._fsp--;


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
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:873:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==14) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:873:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleVerificationActivity1770); 

                        	newLeafNode(otherlv_6, grammarAccess.getVerificationActivityAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleVerificationActivity1782); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationActivityAccess().getColonKeyword_4_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:881:1: ( (lv_description_8_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:882:1: (lv_description_8_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:882:1: (lv_description_8_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:883:3: lv_description_8_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDescriptionValueStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity1803);
                    lv_description_8_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:899:4: (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==34) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:899:6: otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) )
                    {
                    otherlv_9=(Token)match(input,34,FOLLOW_34_in_ruleVerificationActivity1818); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationActivityAccess().getMethodKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleVerificationActivity1830); 

                        	newLeafNode(otherlv_10, grammarAccess.getVerificationActivityAccess().getColonKeyword_5_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:907:1: ( (lv_method_11_0= ruleVerificationMethod ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:908:1: (lv_method_11_0= ruleVerificationMethod )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:908:1: (lv_method_11_0= ruleVerificationMethod )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:909:3: lv_method_11_0= ruleVerificationMethod
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getMethodVerificationMethodParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity1851);
                    lv_method_11_0=ruleVerificationMethod();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"method",
                            		lv_method_11_0, 
                            		"VerificationMethod");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_12=(Token)match(input,16,FOLLOW_16_in_ruleVerificationActivity1865); 

                	newLeafNode(otherlv_12, grammarAccess.getVerificationActivityAccess().getEndKeyword_6());
                
            this_ID_13=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity1876); 
             
                newLeafNode(this_ID_13, grammarAccess.getVerificationActivityAccess().getIDTerminalRuleCall_7()); 
                
            otherlv_14=(Token)match(input,17,FOLLOW_17_in_ruleVerificationActivity1887); 

                	newLeafNode(otherlv_14, grammarAccess.getVerificationActivityAccess().getSemicolonKeyword_8());
                

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:945:1: entryRuleVerificationMethod returns [String current=null] : iv_ruleVerificationMethod= ruleVerificationMethod EOF ;
    public final String entryRuleVerificationMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationMethod = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:946:2: (iv_ruleVerificationMethod= ruleVerificationMethod EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:947:2: iv_ruleVerificationMethod= ruleVerificationMethod EOF
            {
             newCompositeNode(grammarAccess.getVerificationMethodRule()); 
            pushFollow(FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod1924);
            iv_ruleVerificationMethod=ruleVerificationMethod();

            state._fsp--;

             current =iv_ruleVerificationMethod.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationMethod1935); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:954:1: ruleVerificationMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'manual' | kw= 'automatic' ) ;
    public final AntlrDatatypeRuleToken ruleVerificationMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:957:28: ( (kw= 'manual' | kw= 'automatic' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:958:1: (kw= 'manual' | kw= 'automatic' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:958:1: (kw= 'manual' | kw= 'automatic' )
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==35) ) {
                alt24=1;
            }
            else if ( (LA24_0==36) ) {
                alt24=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 24, 0, input);

                throw nvae;
            }
            switch (alt24) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:959:2: kw= 'manual'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVerificationMethod1973); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getManualKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:966:2: kw= 'automatic'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVerificationMethod1992); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getAutomaticKeyword_1()); 
                        

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:979:1: entryRuleVerificationResult returns [EObject current=null] : iv_ruleVerificationResult= ruleVerificationResult EOF ;
    public final EObject entryRuleVerificationResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationResult = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:980:2: (iv_ruleVerificationResult= ruleVerificationResult EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:981:2: iv_ruleVerificationResult= ruleVerificationResult EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultRule()); 
            pushFollow(FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult2032);
            iv_ruleVerificationResult=ruleVerificationResult();

            state._fsp--;

             current =iv_ruleVerificationResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResult2042); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:988:1: ruleVerificationResult returns [EObject current=null] : (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleVerificationMethod ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' ) ;
    public final EObject ruleVerificationResult() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_12=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token this_ID_21=null;
        Token otherlv_22=null;
        AntlrDatatypeRuleToken lv_title_7_0 = null;

        AntlrDatatypeRuleToken lv_description_10_0 = null;

        AntlrDatatypeRuleToken lv_method_13_0 = null;

        AntlrDatatypeRuleToken lv_state_16_0 = null;

        AntlrDatatypeRuleToken lv_status_19_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:991:28: ( (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleVerificationMethod ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:992:1: (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleVerificationMethod ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:992:1: (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleVerificationMethod ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:992:3: otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) ) (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleVerificationMethod ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,32,FOLLOW_32_in_ruleVerificationResult2079); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationResultAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,37,FOLLOW_37_in_ruleVerificationResult2091); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationResultAccess().getResultKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1000:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1001:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1001:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1002:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult2108); 

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

            otherlv_3=(Token)match(input,38,FOLLOW_38_in_ruleVerificationResult2125); 

                	newLeafNode(otherlv_3, grammarAccess.getVerificationResultAccess().getOfKeyword_3());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1022:1: ( (otherlv_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1023:1: (otherlv_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1023:1: (otherlv_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1024:3: otherlv_4= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getVerificationResultRule());
            	        }
                    
            otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult2145); 

            		newLeafNode(otherlv_4, grammarAccess.getVerificationResultAccess().getReferencedVerificationMethodVerificationActivityCrossReference_4_0()); 
            	

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1035:2: (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )?
            int alt25=2;
            int LA25_0 = input.LA(1);

            if ( (LA25_0==39) ) {
                alt25=1;
            }
            switch (alt25) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1035:4: otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,39,FOLLOW_39_in_ruleVerificationResult2158); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationResultAccess().getOutputKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2170); 

                        	newLeafNode(otherlv_6, grammarAccess.getVerificationResultAccess().getColonKeyword_5_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1043:1: ( (lv_title_7_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1044:1: (lv_title_7_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1044:1: (lv_title_7_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1045:3: lv_title_7_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getTitleValueStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult2191);
                    lv_title_7_0=ruleValueString();

                    state._fsp--;


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
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1061:4: (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==40) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1061:6: otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) )
                    {
                    otherlv_8=(Token)match(input,40,FOLLOW_40_in_ruleVerificationResult2206); 

                        	newLeafNode(otherlv_8, grammarAccess.getVerificationResultAccess().getLogfileKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2218); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationResultAccess().getColonKeyword_6_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1069:1: ( (lv_description_10_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1070:1: (lv_description_10_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1070:1: (lv_description_10_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1071:3: lv_description_10_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getDescriptionValueStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult2239);
                    lv_description_10_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
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
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1087:4: (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleVerificationMethod ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==41) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1087:6: otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleVerificationMethod ) )
                    {
                    otherlv_11=(Token)match(input,41,FOLLOW_41_in_ruleVerificationResult2254); 

                        	newLeafNode(otherlv_11, grammarAccess.getVerificationResultAccess().getDateKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2266); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerificationResultAccess().getColonKeyword_7_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1095:1: ( (lv_method_13_0= ruleVerificationMethod ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1096:1: (lv_method_13_0= ruleVerificationMethod )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1096:1: (lv_method_13_0= ruleVerificationMethod )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1097:3: lv_method_13_0= ruleVerificationMethod
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getMethodVerificationMethodParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationMethod_in_ruleVerificationResult2287);
                    lv_method_13_0=ruleVerificationMethod();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
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
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1113:4: (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==42) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1113:6: otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) )
                    {
                    otherlv_14=(Token)match(input,42,FOLLOW_42_in_ruleVerificationResult2302); 

                        	newLeafNode(otherlv_14, grammarAccess.getVerificationResultAccess().getStateKeyword_8_0());
                        
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2314); 

                        	newLeafNode(otherlv_15, grammarAccess.getVerificationResultAccess().getColonKeyword_8_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1121:1: ( (lv_state_16_0= ruleVerificationResultState ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1122:1: (lv_state_16_0= ruleVerificationResultState )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1122:1: (lv_state_16_0= ruleVerificationResultState )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1123:3: lv_state_16_0= ruleVerificationResultState
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStateVerificationResultStateParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultState_in_ruleVerificationResult2335);
                    lv_state_16_0=ruleVerificationResultState();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"state",
                            		lv_state_16_0, 
                            		"VerificationResultState");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1139:4: (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==43) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1139:6: otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) )
                    {
                    otherlv_17=(Token)match(input,43,FOLLOW_43_in_ruleVerificationResult2350); 

                        	newLeafNode(otherlv_17, grammarAccess.getVerificationResultAccess().getStatusKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2362); 

                        	newLeafNode(otherlv_18, grammarAccess.getVerificationResultAccess().getColonKeyword_9_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1147:1: ( (lv_status_19_0= ruleVerificationResultStatus ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1148:1: (lv_status_19_0= ruleVerificationResultStatus )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1148:1: (lv_status_19_0= ruleVerificationResultStatus )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1149:3: lv_status_19_0= ruleVerificationResultStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStatusVerificationResultStatusParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult2383);
                    lv_status_19_0=ruleVerificationResultStatus();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"status",
                            		lv_status_19_0, 
                            		"VerificationResultStatus");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleVerificationResult2397); 

                	newLeafNode(otherlv_20, grammarAccess.getVerificationResultAccess().getEndKeyword_10());
                
            this_ID_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult2408); 
             
                newLeafNode(this_ID_21, grammarAccess.getVerificationResultAccess().getIDTerminalRuleCall_11()); 
                
            otherlv_22=(Token)match(input,17,FOLLOW_17_in_ruleVerificationResult2419); 

                	newLeafNode(otherlv_22, grammarAccess.getVerificationResultAccess().getSemicolonKeyword_12());
                

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


    // $ANTLR start "entryRuleVerificationResultState"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1185:1: entryRuleVerificationResultState returns [String current=null] : iv_ruleVerificationResultState= ruleVerificationResultState EOF ;
    public final String entryRuleVerificationResultState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationResultState = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1186:2: (iv_ruleVerificationResultState= ruleVerificationResultState EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1187:2: iv_ruleVerificationResultState= ruleVerificationResultState EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultStateRule()); 
            pushFollow(FOLLOW_ruleVerificationResultState_in_entryRuleVerificationResultState2456);
            iv_ruleVerificationResultState=ruleVerificationResultState();

            state._fsp--;

             current =iv_ruleVerificationResultState.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResultState2467); 

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
    // $ANTLR end "entryRuleVerificationResultState"


    // $ANTLR start "ruleVerificationResultState"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1194:1: ruleVerificationResultState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'state' kw= ':' (kw= 'manual' | kw= 'automatic' ) ) ;
    public final AntlrDatatypeRuleToken ruleVerificationResultState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1197:28: ( (kw= 'state' kw= ':' (kw= 'manual' | kw= 'automatic' ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1198:1: (kw= 'state' kw= ':' (kw= 'manual' | kw= 'automatic' ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1198:1: (kw= 'state' kw= ':' (kw= 'manual' | kw= 'automatic' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1199:2: kw= 'state' kw= ':' (kw= 'manual' | kw= 'automatic' )
            {
            kw=(Token)match(input,42,FOLLOW_42_in_ruleVerificationResultState2505); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVerificationResultStateAccess().getStateKeyword_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResultState2518); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVerificationResultStateAccess().getColonKeyword_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1210:1: (kw= 'manual' | kw= 'automatic' )
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==35) ) {
                alt30=1;
            }
            else if ( (LA30_0==36) ) {
                alt30=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 30, 0, input);

                throw nvae;
            }
            switch (alt30) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1211:2: kw= 'manual'
                    {
                    kw=(Token)match(input,35,FOLLOW_35_in_ruleVerificationResultState2532); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStateAccess().getManualKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1218:2: kw= 'automatic'
                    {
                    kw=(Token)match(input,36,FOLLOW_36_in_ruleVerificationResultState2551); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStateAccess().getAutomaticKeyword_2_1()); 
                        

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
    // $ANTLR end "ruleVerificationResultState"


    // $ANTLR start "entryRuleVerificationResultStatus"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1231:1: entryRuleVerificationResultStatus returns [String current=null] : iv_ruleVerificationResultStatus= ruleVerificationResultStatus EOF ;
    public final String entryRuleVerificationResultStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationResultStatus = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1232:2: (iv_ruleVerificationResultStatus= ruleVerificationResultStatus EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1233:2: iv_ruleVerificationResultStatus= ruleVerificationResultStatus EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultStatusRule()); 
            pushFollow(FOLLOW_ruleVerificationResultStatus_in_entryRuleVerificationResultStatus2593);
            iv_ruleVerificationResultStatus=ruleVerificationResultStatus();

            state._fsp--;

             current =iv_ruleVerificationResultStatus.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResultStatus2604); 

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
    // $ANTLR end "entryRuleVerificationResultStatus"


    // $ANTLR start "ruleVerificationResultStatus"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1240:1: ruleVerificationResultStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'status' kw= ':' (kw= 'ok' | kw= 'unknown' | kw= 'tbd' ) ) ;
    public final AntlrDatatypeRuleToken ruleVerificationResultStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1243:28: ( (kw= 'status' kw= ':' (kw= 'ok' | kw= 'unknown' | kw= 'tbd' ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1244:1: (kw= 'status' kw= ':' (kw= 'ok' | kw= 'unknown' | kw= 'tbd' ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1244:1: (kw= 'status' kw= ':' (kw= 'ok' | kw= 'unknown' | kw= 'tbd' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1245:2: kw= 'status' kw= ':' (kw= 'ok' | kw= 'unknown' | kw= 'tbd' )
            {
            kw=(Token)match(input,43,FOLLOW_43_in_ruleVerificationResultStatus2642); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getStatusKeyword_0()); 
                
            kw=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResultStatus2655); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getColonKeyword_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1256:1: (kw= 'ok' | kw= 'unknown' | kw= 'tbd' )
            int alt31=3;
            switch ( input.LA(1) ) {
            case 44:
                {
                alt31=1;
                }
                break;
            case 45:
                {
                alt31=2;
                }
                break;
            case 46:
                {
                alt31=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 31, 0, input);

                throw nvae;
            }

            switch (alt31) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1257:2: kw= 'ok'
                    {
                    kw=(Token)match(input,44,FOLLOW_44_in_ruleVerificationResultStatus2669); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getOkKeyword_2_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1264:2: kw= 'unknown'
                    {
                    kw=(Token)match(input,45,FOLLOW_45_in_ruleVerificationResultStatus2688); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getUnknownKeyword_2_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1271:2: kw= 'tbd'
                    {
                    kw=(Token)match(input,46,FOLLOW_46_in_ruleVerificationResultStatus2707); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getTbdKeyword_2_2()); 
                        

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
    // $ANTLR end "ruleVerificationResultStatus"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlisaModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleAlisaModel132 = new BitSet(new long[]{0x0000000102040802L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleAlisaModel151 = new BitSet(new long[]{0x0000000102040802L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_ruleAlisaModel170 = new BitSet(new long[]{0x0000000102040802L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_ruleAlisaModel189 = new BitSet(new long[]{0x0000000102040802L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleAlisaModel208 = new BitSet(new long[]{0x0000000102040802L});
    public static final BitSet FOLLOW_ruleValueString_in_entryRuleValueString248 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueString259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueString298 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder342 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder352 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_11_in_ruleStakeholder389 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder406 = new BitSet(new long[]{0x000000000001D000L});
    public static final BitSet FOLLOW_12_in_ruleStakeholder424 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder436 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder457 = new BitSet(new long[]{0x000000000001C000L});
    public static final BitSet FOLLOW_14_in_ruleStakeholder472 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder484 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder505 = new BitSet(new long[]{0x0000000000018000L});
    public static final BitSet FOLLOW_15_in_ruleStakeholder520 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleStakeholder532 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder553 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleStakeholder567 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder578 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleStakeholder589 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement625 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement635 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_ruleRequirement672 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement689 = new BitSet(new long[]{0x0000000000595000L});
    public static final BitSet FOLLOW_12_in_ruleRequirement707 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement740 = new BitSet(new long[]{0x0000000000594000L});
    public static final BitSet FOLLOW_14_in_ruleRequirement755 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement788 = new BitSet(new long[]{0x0000000000590000L});
    public static final BitSet FOLLOW_19_in_ruleRequirement803 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement836 = new BitSet(new long[]{0x0000000000510000L});
    public static final BitSet FOLLOW_20_in_ruleRequirement851 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRequirement863 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement875 = new BitSet(new long[]{0x0000000000410020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement895 = new BitSet(new long[]{0x0000000000410020L});
    public static final BitSet FOLLOW_22_in_ruleRequirement911 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRequirement923 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement935 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleRequirementDecomposition_in_ruleRequirement956 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleRequirement971 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement982 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequirement993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementDecomposition_in_entryRuleRequirementDecomposition1029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementDecomposition1039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementDecomposition1084 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementDecomposition1108 = new BitSet(new long[]{0x0000000001800000L});
    public static final BitSet FOLLOW_23_in_ruleRequirementDecomposition1133 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_24_in_ruleRequirementDecomposition1162 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRequirementDecomposition_in_ruleRequirementDecomposition1199 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType1236 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType1246 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleElementType1283 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_26_in_ruleElementType1295 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementType1312 = new BitSet(new long[]{0x00000000F8010000L});
    public static final BitSet FOLLOW_27_in_ruleElementType1330 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1342 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1363 = new BitSet(new long[]{0x00000000F0010000L});
    public static final BitSet FOLLOW_28_in_ruleElementType1378 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1390 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1411 = new BitSet(new long[]{0x00000000E0010000L});
    public static final BitSet FOLLOW_29_in_ruleElementType1426 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1438 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1459 = new BitSet(new long[]{0x00000000C0010000L});
    public static final BitSet FOLLOW_30_in_ruleElementType1474 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1486 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1507 = new BitSet(new long[]{0x0000000080010000L});
    public static final BitSet FOLLOW_31_in_ruleElementType1522 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1534 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1555 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleElementType1570 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementType1581 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleElementType1592 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity1628 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationActivity1638 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVerificationActivity1675 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_ruleVerificationActivity1687 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity1704 = new BitSet(new long[]{0x0000000400015000L});
    public static final BitSet FOLLOW_12_in_ruleVerificationActivity1722 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationActivity1734 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity1755 = new BitSet(new long[]{0x0000000400014000L});
    public static final BitSet FOLLOW_14_in_ruleVerificationActivity1770 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationActivity1782 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity1803 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_34_in_ruleVerificationActivity1818 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationActivity1830 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity1851 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVerificationActivity1865 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity1876 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVerificationActivity1887 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod1924 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationMethod1935 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVerificationMethod1973 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVerificationMethod1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult2032 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResult2042 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleVerificationResult2079 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ruleVerificationResult2091 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult2108 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ruleVerificationResult2125 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult2145 = new BitSet(new long[]{0x00000F8000010000L});
    public static final BitSet FOLLOW_39_in_ruleVerificationResult2158 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2170 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult2191 = new BitSet(new long[]{0x00000F0000010000L});
    public static final BitSet FOLLOW_40_in_ruleVerificationResult2206 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2218 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult2239 = new BitSet(new long[]{0x00000E0000010000L});
    public static final BitSet FOLLOW_41_in_ruleVerificationResult2254 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2266 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_ruleVerificationResult2287 = new BitSet(new long[]{0x00000C0000010000L});
    public static final BitSet FOLLOW_42_in_ruleVerificationResult2302 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2314 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_ruleVerificationResult2335 = new BitSet(new long[]{0x0000080000010000L});
    public static final BitSet FOLLOW_43_in_ruleVerificationResult2350 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2362 = new BitSet(new long[]{0x0000080000000000L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult2383 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVerificationResult2397 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult2408 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVerificationResult2419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_entryRuleVerificationResultState2456 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResultState2467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleVerificationResultState2505 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResultState2518 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_35_in_ruleVerificationResultState2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleVerificationResultState2551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_entryRuleVerificationResultStatus2593 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResultStatus2604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleVerificationResultStatus2642 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResultStatus2655 = new BitSet(new long[]{0x0000700000000000L});
    public static final BitSet FOLLOW_44_in_ruleVerificationResultStatus2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleVerificationResultStatus2688 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleVerificationResultStatus2707 = new BitSet(new long[]{0x0000000000000002L});

}