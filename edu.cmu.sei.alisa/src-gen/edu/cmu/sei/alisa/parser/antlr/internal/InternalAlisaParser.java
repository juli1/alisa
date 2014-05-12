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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'stakeholder'", "'title'", "':'", "'description'", "'role'", "'end'", "';'", "'requirement'", "'comment'", "'assigned'", "'to'", "'referenced'", "'by'", "'verified'", "'decomposed'", "'and'", "'or'", "'system'", "'element'", "'reference'", "'element-type'", "'model-type'", "'documentDetails'", "'version'", "'verification'", "'activity'", "'method'", "'manual'", "'automatic'", "'result'", "'of'", "'output'", "'logfile'", "'date'", "'state'", "'status'", "'scheduled'", "'passed'", "'inprogress'", "'ok'", "'unknown'", "'tbd'"
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
    public static final int T__51=51;
    public static final int T__16=16;
    public static final int T__52=52;
    public static final int T__15=15;
    public static final int T__18=18;
    public static final int T__17=17;
    public static final int T__12=12;
    public static final int T__11=11;
    public static final int T__14=14;
    public static final int T__13=13;
    public static final int RULE_INT=6;
    public static final int T__50=50;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int RULE_SL_COMMENT=8;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_STRING=4;
    public static final int T__32=32;
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

                if ( (LA2_0==11||LA2_0==18||LA2_0==28||LA2_0==35) ) {
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
            	    case 35:
            	        {
            	        int LA1_3 = input.LA(2);

            	        if ( (LA1_3==40) ) {
            	            alt1=4;
            	        }
            	        else if ( (LA1_3==36) ) {
            	            alt1=3;
            	        }
            	        else {
            	            NoViableAltException nvae =
            	                new NoViableAltException("", 1, 3, input);

            	            throw nvae;
            	        }
            	        }
            	        break;
            	    case 28:
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:339:1: ruleRequirement returns [EObject current=null] : (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'assigned' otherlv_12= 'to' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'referenced' otherlv_16= 'by' otherlv_17= ':' ( (otherlv_18= RULE_ID ) )* )? (otherlv_19= 'verified' otherlv_20= 'by' otherlv_21= ':' ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )* )? (otherlv_23= 'decomposed' otherlv_24= 'by' otherlv_25= ':' ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )* )? otherlv_27= 'end' this_ID_28= RULE_ID otherlv_29= ';' ) ;
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
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        Token this_ID_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_title_4_0 = null;

        AntlrDatatypeRuleToken lv_description_7_0 = null;

        AntlrDatatypeRuleToken lv_comment_10_0 = null;

        EObject lv_verifiedBy_22_0 = null;

        EObject lv_decomposedBy_26_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:342:28: ( (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'assigned' otherlv_12= 'to' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'referenced' otherlv_16= 'by' otherlv_17= ':' ( (otherlv_18= RULE_ID ) )* )? (otherlv_19= 'verified' otherlv_20= 'by' otherlv_21= ':' ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )* )? (otherlv_23= 'decomposed' otherlv_24= 'by' otherlv_25= ':' ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )* )? otherlv_27= 'end' this_ID_28= RULE_ID otherlv_29= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:343:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'assigned' otherlv_12= 'to' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'referenced' otherlv_16= 'by' otherlv_17= ':' ( (otherlv_18= RULE_ID ) )* )? (otherlv_19= 'verified' otherlv_20= 'by' otherlv_21= ':' ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )* )? (otherlv_23= 'decomposed' otherlv_24= 'by' otherlv_25= ':' ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )* )? otherlv_27= 'end' this_ID_28= RULE_ID otherlv_29= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:343:1: (otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'assigned' otherlv_12= 'to' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'referenced' otherlv_16= 'by' otherlv_17= ':' ( (otherlv_18= RULE_ID ) )* )? (otherlv_19= 'verified' otherlv_20= 'by' otherlv_21= ':' ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )* )? (otherlv_23= 'decomposed' otherlv_24= 'by' otherlv_25= ':' ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )* )? otherlv_27= 'end' this_ID_28= RULE_ID otherlv_29= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:343:3: otherlv_0= 'requirement' ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= 'title' otherlv_3= ':' ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= 'description' otherlv_6= ':' ( (lv_description_7_0= ruleValueString ) ) )? (otherlv_8= 'comment' otherlv_9= ':' ( (lv_comment_10_0= ruleValueString ) ) )? (otherlv_11= 'assigned' otherlv_12= 'to' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )? (otherlv_15= 'referenced' otherlv_16= 'by' otherlv_17= ':' ( (otherlv_18= RULE_ID ) )* )? (otherlv_19= 'verified' otherlv_20= 'by' otherlv_21= ':' ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )* )? (otherlv_23= 'decomposed' otherlv_24= 'by' otherlv_25= ':' ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )* )? otherlv_27= 'end' this_ID_28= RULE_ID otherlv_29= ';'
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:443:4: (otherlv_11= 'assigned' otherlv_12= 'to' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==20) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:443:6: otherlv_11= 'assigned' otherlv_12= 'to' otherlv_13= ':' ( (otherlv_14= RULE_ID ) )*
                    {
                    otherlv_11=(Token)match(input,20,FOLLOW_20_in_ruleRequirement851); 

                        	newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getAssignedKeyword_5_0());
                        
                    otherlv_12=(Token)match(input,21,FOLLOW_21_in_ruleRequirement863); 

                        	newLeafNode(otherlv_12, grammarAccess.getRequirementAccess().getToKeyword_5_1());
                        
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

                    	    		newLeafNode(otherlv_14, grammarAccess.getRequirementAccess().getAssignedToStakeholderCrossReference_5_3_0()); 
                    	    	

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:468:5: (otherlv_15= 'referenced' otherlv_16= 'by' otherlv_17= ':' ( (otherlv_18= RULE_ID ) )* )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==22) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:468:7: otherlv_15= 'referenced' otherlv_16= 'by' otherlv_17= ':' ( (otherlv_18= RULE_ID ) )*
                    {
                    otherlv_15=(Token)match(input,22,FOLLOW_22_in_ruleRequirement911); 

                        	newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getReferencedKeyword_6_0());
                        
                    otherlv_16=(Token)match(input,23,FOLLOW_23_in_ruleRequirement923); 

                        	newLeafNode(otherlv_16, grammarAccess.getRequirementAccess().getByKeyword_6_1());
                        
                    otherlv_17=(Token)match(input,13,FOLLOW_13_in_ruleRequirement935); 

                        	newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getColonKeyword_6_2());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:480:1: ( (otherlv_18= RULE_ID ) )*
                    loop11:
                    do {
                        int alt11=2;
                        int LA11_0 = input.LA(1);

                        if ( (LA11_0==RULE_ID) ) {
                            alt11=1;
                        }


                        switch (alt11) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:481:1: (otherlv_18= RULE_ID )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:481:1: (otherlv_18= RULE_ID )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:482:3: otherlv_18= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getRequirementRule());
                    	    	        }
                    	            
                    	    otherlv_18=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement955); 

                    	    		newLeafNode(otherlv_18, grammarAccess.getRequirementAccess().getReferencedByElementTypeCrossReference_6_3_0()); 
                    	    	

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:493:5: (otherlv_19= 'verified' otherlv_20= 'by' otherlv_21= ':' ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )* )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==24) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:493:7: otherlv_19= 'verified' otherlv_20= 'by' otherlv_21= ':' ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )*
                    {
                    otherlv_19=(Token)match(input,24,FOLLOW_24_in_ruleRequirement971); 

                        	newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getVerifiedKeyword_7_0());
                        
                    otherlv_20=(Token)match(input,23,FOLLOW_23_in_ruleRequirement983); 

                        	newLeafNode(otherlv_20, grammarAccess.getRequirementAccess().getByKeyword_7_1());
                        
                    otherlv_21=(Token)match(input,13,FOLLOW_13_in_ruleRequirement995); 

                        	newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getColonKeyword_7_2());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:505:1: ( (lv_verifiedBy_22_0= ruleVerificationDecomposition ) )*
                    loop13:
                    do {
                        int alt13=2;
                        int LA13_0 = input.LA(1);

                        if ( (LA13_0==RULE_ID) ) {
                            alt13=1;
                        }


                        switch (alt13) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:506:1: (lv_verifiedBy_22_0= ruleVerificationDecomposition )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:506:1: (lv_verifiedBy_22_0= ruleVerificationDecomposition )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:507:3: lv_verifiedBy_22_0= ruleVerificationDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getVerifiedByVerificationDecompositionParserRuleCall_7_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleRequirement1016);
                    	    lv_verifiedBy_22_0=ruleVerificationDecomposition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"verifiedBy",
                    	            		lv_verifiedBy_22_0, 
                    	            		"VerificationDecomposition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:523:5: (otherlv_23= 'decomposed' otherlv_24= 'by' otherlv_25= ':' ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==25) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:523:7: otherlv_23= 'decomposed' otherlv_24= 'by' otherlv_25= ':' ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )*
                    {
                    otherlv_23=(Token)match(input,25,FOLLOW_25_in_ruleRequirement1032); 

                        	newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getDecomposedKeyword_8_0());
                        
                    otherlv_24=(Token)match(input,23,FOLLOW_23_in_ruleRequirement1044); 

                        	newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getByKeyword_8_1());
                        
                    otherlv_25=(Token)match(input,13,FOLLOW_13_in_ruleRequirement1056); 

                        	newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getColonKeyword_8_2());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:535:1: ( (lv_decomposedBy_26_0= ruleRequirementDecomposition ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==RULE_ID) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:536:1: (lv_decomposedBy_26_0= ruleRequirementDecomposition )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:536:1: (lv_decomposedBy_26_0= ruleRequirementDecomposition )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:537:3: lv_decomposedBy_26_0= ruleRequirementDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposedByRequirementDecompositionParserRuleCall_8_3_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleRequirementDecomposition_in_ruleRequirement1077);
                    	    lv_decomposedBy_26_0=ruleRequirementDecomposition();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getRequirementRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"decomposedBy",
                    	            		lv_decomposedBy_26_0, 
                    	            		"RequirementDecomposition");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_27=(Token)match(input,16,FOLLOW_16_in_ruleRequirement1092); 

                	newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getEndKeyword_9());
                
            this_ID_28=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement1103); 
             
                newLeafNode(this_ID_28, grammarAccess.getRequirementAccess().getIDTerminalRuleCall_10()); 
                
            otherlv_29=(Token)match(input,17,FOLLOW_17_in_ruleRequirement1114); 

                	newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getSemicolonKeyword_11());
                

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:573:1: entryRuleRequirementDecomposition returns [EObject current=null] : iv_ruleRequirementDecomposition= ruleRequirementDecomposition EOF ;
    public final EObject entryRuleRequirementDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirementDecomposition = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:574:2: (iv_ruleRequirementDecomposition= ruleRequirementDecomposition EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:575:2: iv_ruleRequirementDecomposition= ruleRequirementDecomposition EOF
            {
             newCompositeNode(grammarAccess.getRequirementDecompositionRule()); 
            pushFollow(FOLLOW_ruleRequirementDecomposition_in_entryRuleRequirementDecomposition1150);
            iv_ruleRequirementDecomposition=ruleRequirementDecomposition();

            state._fsp--;

             current =iv_ruleRequirementDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirementDecomposition1160); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:582:1: ruleRequirementDecomposition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) ) ;
    public final EObject ruleRequirementDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:585:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:586:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:586:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) ) )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==RULE_ID) ) {
                int LA18_1 = input.LA(2);

                if ( (LA18_1==EOF||LA18_1==RULE_ID||LA18_1==16) ) {
                    alt18=1;
                }
                else if ( ((LA18_1>=26 && LA18_1<=27)) ) {
                    alt18=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:586:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:586:2: ( (otherlv_0= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:587:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:587:1: (otherlv_0= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:588:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementDecompositionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementDecomposition1205); 

                    		newLeafNode(otherlv_0, grammarAccess.getRequirementDecompositionAccess().getElementRequirementCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:600:6: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:600:6: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:600:7: ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleRequirementDecomposition ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:600:7: ( (otherlv_1= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:601:1: (otherlv_1= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:601:1: (otherlv_1= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:602:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getRequirementDecompositionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirementDecomposition1232); 

                    		newLeafNode(otherlv_1, grammarAccess.getRequirementDecompositionAccess().getLeftRequirementCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:613:2: ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:614:1: ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:614:1: ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:615:1: (lv_type_2_1= 'and' | lv_type_2_2= 'or' )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:615:1: (lv_type_2_1= 'and' | lv_type_2_2= 'or' )
                    int alt17=2;
                    int LA17_0 = input.LA(1);

                    if ( (LA17_0==26) ) {
                        alt17=1;
                    }
                    else if ( (LA17_0==27) ) {
                        alt17=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 17, 0, input);

                        throw nvae;
                    }
                    switch (alt17) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:616:3: lv_type_2_1= 'and'
                            {
                            lv_type_2_1=(Token)match(input,26,FOLLOW_26_in_ruleRequirementDecomposition1252); 

                                    newLeafNode(lv_type_2_1, grammarAccess.getRequirementDecompositionAccess().getTypeAndKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getRequirementDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:628:8: lv_type_2_2= 'or'
                            {
                            lv_type_2_2=(Token)match(input,27,FOLLOW_27_in_ruleRequirementDecomposition1281); 

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

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:643:2: ( (lv_right_3_0= ruleRequirementDecomposition ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:644:1: (lv_right_3_0= ruleRequirementDecomposition )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:644:1: (lv_right_3_0= ruleRequirementDecomposition )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:645:3: lv_right_3_0= ruleRequirementDecomposition
                    {
                     
                    	        newCompositeNode(grammarAccess.getRequirementDecompositionAccess().getRightRequirementDecompositionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleRequirementDecomposition_in_ruleRequirementDecomposition1318);
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


    // $ANTLR start "entryRuleVerificationDecomposition"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:669:1: entryRuleVerificationDecomposition returns [EObject current=null] : iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF ;
    public final EObject entryRuleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationDecomposition = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:670:2: (iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:671:2: iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF
            {
             newCompositeNode(grammarAccess.getVerificationDecompositionRule()); 
            pushFollow(FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition1355);
            iv_ruleVerificationDecomposition=ruleVerificationDecomposition();

            state._fsp--;

             current =iv_ruleVerificationDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationDecomposition1365); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:678:1: ruleVerificationDecomposition returns [EObject current=null] : ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) ;
    public final EObject ruleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:681:28: ( ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:682:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:682:1: ( ( (otherlv_0= RULE_ID ) ) | ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==RULE_ID) ) {
                int LA20_1 = input.LA(2);

                if ( ((LA20_1>=26 && LA20_1<=27)) ) {
                    alt20=2;
                }
                else if ( (LA20_1==EOF||LA20_1==RULE_ID||LA20_1==16||LA20_1==25) ) {
                    alt20=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 20, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 20, 0, input);

                throw nvae;
            }
            switch (alt20) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:682:2: ( (otherlv_0= RULE_ID ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:682:2: ( (otherlv_0= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:683:1: (otherlv_0= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:683:1: (otherlv_0= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:684:3: otherlv_0= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                    otherlv_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationDecomposition1410); 

                    		newLeafNode(otherlv_0, grammarAccess.getVerificationDecompositionAccess().getElementVerificationActivityCrossReference_0_0()); 
                    	

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:696:6: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:696:6: ( ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:696:7: ( (otherlv_1= RULE_ID ) ) ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:696:7: ( (otherlv_1= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:697:1: (otherlv_1= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:697:1: (otherlv_1= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:698:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationDecomposition1437); 

                    		newLeafNode(otherlv_1, grammarAccess.getVerificationDecompositionAccess().getLeftVerificationActivityCrossReference_1_0_0()); 
                    	

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:709:2: ( ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:710:1: ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:710:1: ( (lv_type_2_1= 'and' | lv_type_2_2= 'or' ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:711:1: (lv_type_2_1= 'and' | lv_type_2_2= 'or' )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:711:1: (lv_type_2_1= 'and' | lv_type_2_2= 'or' )
                    int alt19=2;
                    int LA19_0 = input.LA(1);

                    if ( (LA19_0==26) ) {
                        alt19=1;
                    }
                    else if ( (LA19_0==27) ) {
                        alt19=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 19, 0, input);

                        throw nvae;
                    }
                    switch (alt19) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:712:3: lv_type_2_1= 'and'
                            {
                            lv_type_2_1=(Token)match(input,26,FOLLOW_26_in_ruleVerificationDecomposition1457); 

                                    newLeafNode(lv_type_2_1, grammarAccess.getVerificationDecompositionAccess().getTypeAndKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:724:8: lv_type_2_2= 'or'
                            {
                            lv_type_2_2=(Token)match(input,27,FOLLOW_27_in_ruleVerificationDecomposition1486); 

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

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:739:2: ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:740:1: (lv_right_3_0= ruleVerificationDecomposition )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:740:1: (lv_right_3_0= ruleVerificationDecomposition )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:741:3: lv_right_3_0= ruleVerificationDecomposition
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getRightVerificationDecompositionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition1523);
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


    // $ANTLR start "entryRuleElementType"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:765:1: entryRuleElementType returns [EObject current=null] : iv_ruleElementType= ruleElementType EOF ;
    public final EObject entryRuleElementType() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElementType = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:766:2: (iv_ruleElementType= ruleElementType EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:767:2: iv_ruleElementType= ruleElementType EOF
            {
             newCompositeNode(grammarAccess.getElementTypeRule()); 
            pushFollow(FOLLOW_ruleElementType_in_entryRuleElementType1560);
            iv_ruleElementType=ruleElementType();

            state._fsp--;

             current =iv_ruleElementType; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleElementType1570); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:774:1: ruleElementType returns [EObject current=null] : (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:777:28: ( (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:778:1: (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:778:1: (otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:778:3: otherlv_0= 'system' otherlv_1= 'element' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )? (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )? (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )? (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )? (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )? otherlv_18= 'end' this_ID_19= RULE_ID otherlv_20= ';'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_28_in_ruleElementType1607); 

                	newLeafNode(otherlv_0, grammarAccess.getElementTypeAccess().getSystemKeyword_0());
                
            otherlv_1=(Token)match(input,29,FOLLOW_29_in_ruleElementType1619); 

                	newLeafNode(otherlv_1, grammarAccess.getElementTypeAccess().getElementKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:786:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:787:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:787:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:788:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementType1636); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:804:2: (otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) ) )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==30) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:804:4: otherlv_3= 'reference' otherlv_4= ':' ( (lv_reference_5_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,30,FOLLOW_30_in_ruleElementType1654); 

                        	newLeafNode(otherlv_3, grammarAccess.getElementTypeAccess().getReferenceKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleElementType1666); 

                        	newLeafNode(otherlv_4, grammarAccess.getElementTypeAccess().getColonKeyword_3_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:812:1: ( (lv_reference_5_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:813:1: (lv_reference_5_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:813:1: (lv_reference_5_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:814:3: lv_reference_5_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getReferenceValueStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1687);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:830:4: (otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) ) )?
            int alt22=2;
            int LA22_0 = input.LA(1);

            if ( (LA22_0==31) ) {
                alt22=1;
            }
            switch (alt22) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:830:6: otherlv_6= 'element-type' otherlv_7= ':' ( (lv_elementType_8_0= ruleValueString ) )
                    {
                    otherlv_6=(Token)match(input,31,FOLLOW_31_in_ruleElementType1702); 

                        	newLeafNode(otherlv_6, grammarAccess.getElementTypeAccess().getElementTypeKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleElementType1714); 

                        	newLeafNode(otherlv_7, grammarAccess.getElementTypeAccess().getColonKeyword_4_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:838:1: ( (lv_elementType_8_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:839:1: (lv_elementType_8_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:839:1: (lv_elementType_8_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:840:3: lv_elementType_8_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getElementTypeValueStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1735);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:856:4: (otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) ) )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==32) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:856:6: otherlv_9= 'model-type' otherlv_10= ':' ( (lv_modelType_11_0= ruleValueString ) )
                    {
                    otherlv_9=(Token)match(input,32,FOLLOW_32_in_ruleElementType1750); 

                        	newLeafNode(otherlv_9, grammarAccess.getElementTypeAccess().getModelTypeKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleElementType1762); 

                        	newLeafNode(otherlv_10, grammarAccess.getElementTypeAccess().getColonKeyword_5_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:864:1: ( (lv_modelType_11_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:865:1: (lv_modelType_11_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:865:1: (lv_modelType_11_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:866:3: lv_modelType_11_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getModelTypeValueStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1783);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:882:4: (otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) ) )?
            int alt24=2;
            int LA24_0 = input.LA(1);

            if ( (LA24_0==33) ) {
                alt24=1;
            }
            switch (alt24) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:882:6: otherlv_12= 'documentDetails' otherlv_13= ':' ( (lv_details_14_0= ruleValueString ) )
                    {
                    otherlv_12=(Token)match(input,33,FOLLOW_33_in_ruleElementType1798); 

                        	newLeafNode(otherlv_12, grammarAccess.getElementTypeAccess().getDocumentDetailsKeyword_6_0());
                        
                    otherlv_13=(Token)match(input,13,FOLLOW_13_in_ruleElementType1810); 

                        	newLeafNode(otherlv_13, grammarAccess.getElementTypeAccess().getColonKeyword_6_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:890:1: ( (lv_details_14_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:891:1: (lv_details_14_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:891:1: (lv_details_14_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:892:3: lv_details_14_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getElementTypeAccess().getDetailsValueStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1831);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:908:4: (otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )* )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==34) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:908:6: otherlv_15= 'version' otherlv_16= ':' ( (lv_version_17_0= ruleValueString ) )*
                    {
                    otherlv_15=(Token)match(input,34,FOLLOW_34_in_ruleElementType1846); 

                        	newLeafNode(otherlv_15, grammarAccess.getElementTypeAccess().getVersionKeyword_7_0());
                        
                    otherlv_16=(Token)match(input,13,FOLLOW_13_in_ruleElementType1858); 

                        	newLeafNode(otherlv_16, grammarAccess.getElementTypeAccess().getColonKeyword_7_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:916:1: ( (lv_version_17_0= ruleValueString ) )*
                    loop25:
                    do {
                        int alt25=2;
                        int LA25_0 = input.LA(1);

                        if ( (LA25_0==RULE_STRING) ) {
                            alt25=1;
                        }


                        switch (alt25) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:917:1: (lv_version_17_0= ruleValueString )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:917:1: (lv_version_17_0= ruleValueString )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:918:3: lv_version_17_0= ruleValueString
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getElementTypeAccess().getVersionValueStringParserRuleCall_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleValueString_in_ruleElementType1879);
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
                    	    break loop25;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_18=(Token)match(input,16,FOLLOW_16_in_ruleElementType1894); 

                	newLeafNode(otherlv_18, grammarAccess.getElementTypeAccess().getEndKeyword_8());
                
            this_ID_19=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleElementType1905); 
             
                newLeafNode(this_ID_19, grammarAccess.getElementTypeAccess().getIDTerminalRuleCall_9()); 
                
            otherlv_20=(Token)match(input,17,FOLLOW_17_in_ruleElementType1916); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:954:1: entryRuleVerificationActivity returns [EObject current=null] : iv_ruleVerificationActivity= ruleVerificationActivity EOF ;
    public final EObject entryRuleVerificationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationActivity = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:955:2: (iv_ruleVerificationActivity= ruleVerificationActivity EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:956:2: iv_ruleVerificationActivity= ruleVerificationActivity EOF
            {
             newCompositeNode(grammarAccess.getVerificationActivityRule()); 
            pushFollow(FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity1952);
            iv_ruleVerificationActivity=ruleVerificationActivity();

            state._fsp--;

             current =iv_ruleVerificationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationActivity1962); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:963:1: ruleVerificationActivity returns [EObject current=null] : (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? (otherlv_12= 'assigned' otherlv_13= 'to' otherlv_14= ':' ( (otherlv_15= RULE_ID ) )* )? otherlv_16= 'end' this_ID_17= RULE_ID otherlv_18= ';' ) ;
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
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token this_ID_17=null;
        Token otherlv_18=null;
        AntlrDatatypeRuleToken lv_title_5_0 = null;

        AntlrDatatypeRuleToken lv_description_8_0 = null;

        AntlrDatatypeRuleToken lv_method_11_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:966:28: ( (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? (otherlv_12= 'assigned' otherlv_13= 'to' otherlv_14= ':' ( (otherlv_15= RULE_ID ) )* )? otherlv_16= 'end' this_ID_17= RULE_ID otherlv_18= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:967:1: (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? (otherlv_12= 'assigned' otherlv_13= 'to' otherlv_14= ':' ( (otherlv_15= RULE_ID ) )* )? otherlv_16= 'end' this_ID_17= RULE_ID otherlv_18= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:967:1: (otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? (otherlv_12= 'assigned' otherlv_13= 'to' otherlv_14= ':' ( (otherlv_15= RULE_ID ) )* )? otherlv_16= 'end' this_ID_17= RULE_ID otherlv_18= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:967:3: otherlv_0= 'verification' otherlv_1= 'activity' ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )? (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )? (otherlv_12= 'assigned' otherlv_13= 'to' otherlv_14= ':' ( (otherlv_15= RULE_ID ) )* )? otherlv_16= 'end' this_ID_17= RULE_ID otherlv_18= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleVerificationActivity1999); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationActivityAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,36,FOLLOW_36_in_ruleVerificationActivity2011); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationActivityAccess().getActivityKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:975:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:976:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:976:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:977:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity2028); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:993:2: (otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) ) )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==12) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:993:4: otherlv_3= 'title' otherlv_4= ':' ( (lv_title_5_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,12,FOLLOW_12_in_ruleVerificationActivity2046); 

                        	newLeafNode(otherlv_3, grammarAccess.getVerificationActivityAccess().getTitleKeyword_3_0());
                        
                    otherlv_4=(Token)match(input,13,FOLLOW_13_in_ruleVerificationActivity2058); 

                        	newLeafNode(otherlv_4, grammarAccess.getVerificationActivityAccess().getColonKeyword_3_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1001:1: ( (lv_title_5_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1002:1: (lv_title_5_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1002:1: (lv_title_5_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1003:3: lv_title_5_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getTitleValueStringParserRuleCall_3_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity2079);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1019:4: (otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) ) )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==14) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1019:6: otherlv_6= 'description' otherlv_7= ':' ( (lv_description_8_0= ruleValueString ) )
                    {
                    otherlv_6=(Token)match(input,14,FOLLOW_14_in_ruleVerificationActivity2094); 

                        	newLeafNode(otherlv_6, grammarAccess.getVerificationActivityAccess().getDescriptionKeyword_4_0());
                        
                    otherlv_7=(Token)match(input,13,FOLLOW_13_in_ruleVerificationActivity2106); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationActivityAccess().getColonKeyword_4_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1027:1: ( (lv_description_8_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1028:1: (lv_description_8_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1028:1: (lv_description_8_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1029:3: lv_description_8_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDescriptionValueStringParserRuleCall_4_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity2127);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1045:4: (otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) ) )?
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==37) ) {
                alt29=1;
            }
            switch (alt29) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1045:6: otherlv_9= 'method' otherlv_10= ':' ( (lv_method_11_0= ruleVerificationMethod ) )
                    {
                    otherlv_9=(Token)match(input,37,FOLLOW_37_in_ruleVerificationActivity2142); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationActivityAccess().getMethodKeyword_5_0());
                        
                    otherlv_10=(Token)match(input,13,FOLLOW_13_in_ruleVerificationActivity2154); 

                        	newLeafNode(otherlv_10, grammarAccess.getVerificationActivityAccess().getColonKeyword_5_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1053:1: ( (lv_method_11_0= ruleVerificationMethod ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1054:1: (lv_method_11_0= ruleVerificationMethod )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1054:1: (lv_method_11_0= ruleVerificationMethod )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1055:3: lv_method_11_0= ruleVerificationMethod
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getMethodVerificationMethodParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity2175);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1071:4: (otherlv_12= 'assigned' otherlv_13= 'to' otherlv_14= ':' ( (otherlv_15= RULE_ID ) )* )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==20) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1071:6: otherlv_12= 'assigned' otherlv_13= 'to' otherlv_14= ':' ( (otherlv_15= RULE_ID ) )*
                    {
                    otherlv_12=(Token)match(input,20,FOLLOW_20_in_ruleVerificationActivity2190); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerificationActivityAccess().getAssignedKeyword_6_0());
                        
                    otherlv_13=(Token)match(input,21,FOLLOW_21_in_ruleVerificationActivity2202); 

                        	newLeafNode(otherlv_13, grammarAccess.getVerificationActivityAccess().getToKeyword_6_1());
                        
                    otherlv_14=(Token)match(input,13,FOLLOW_13_in_ruleVerificationActivity2214); 

                        	newLeafNode(otherlv_14, grammarAccess.getVerificationActivityAccess().getColonKeyword_6_2());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1083:1: ( (otherlv_15= RULE_ID ) )*
                    loop30:
                    do {
                        int alt30=2;
                        int LA30_0 = input.LA(1);

                        if ( (LA30_0==RULE_ID) ) {
                            alt30=1;
                        }


                        switch (alt30) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1084:1: (otherlv_15= RULE_ID )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1084:1: (otherlv_15= RULE_ID )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1085:3: otherlv_15= RULE_ID
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getVerificationActivityRule());
                    	    	        }
                    	            
                    	    otherlv_15=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity2234); 

                    	    		newLeafNode(otherlv_15, grammarAccess.getVerificationActivityAccess().getAssignedToStakeholderCrossReference_6_3_0()); 
                    	    	

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop30;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_16=(Token)match(input,16,FOLLOW_16_in_ruleVerificationActivity2249); 

                	newLeafNode(otherlv_16, grammarAccess.getVerificationActivityAccess().getEndKeyword_7());
                
            this_ID_17=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity2260); 
             
                newLeafNode(this_ID_17, grammarAccess.getVerificationActivityAccess().getIDTerminalRuleCall_8()); 
                
            otherlv_18=(Token)match(input,17,FOLLOW_17_in_ruleVerificationActivity2271); 

                	newLeafNode(otherlv_18, grammarAccess.getVerificationActivityAccess().getSemicolonKeyword_9());
                

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1116:1: entryRuleVerificationMethod returns [String current=null] : iv_ruleVerificationMethod= ruleVerificationMethod EOF ;
    public final String entryRuleVerificationMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationMethod = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1117:2: (iv_ruleVerificationMethod= ruleVerificationMethod EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1118:2: iv_ruleVerificationMethod= ruleVerificationMethod EOF
            {
             newCompositeNode(grammarAccess.getVerificationMethodRule()); 
            pushFollow(FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod2308);
            iv_ruleVerificationMethod=ruleVerificationMethod();

            state._fsp--;

             current =iv_ruleVerificationMethod.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationMethod2319); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1125:1: ruleVerificationMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'manual' | kw= 'automatic' ) ;
    public final AntlrDatatypeRuleToken ruleVerificationMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1128:28: ( (kw= 'manual' | kw= 'automatic' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1129:1: (kw= 'manual' | kw= 'automatic' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1129:1: (kw= 'manual' | kw= 'automatic' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==38) ) {
                alt32=1;
            }
            else if ( (LA32_0==39) ) {
                alt32=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1130:2: kw= 'manual'
                    {
                    kw=(Token)match(input,38,FOLLOW_38_in_ruleVerificationMethod2357); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getManualKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1137:2: kw= 'automatic'
                    {
                    kw=(Token)match(input,39,FOLLOW_39_in_ruleVerificationMethod2376); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1150:1: entryRuleVerificationResult returns [EObject current=null] : iv_ruleVerificationResult= ruleVerificationResult EOF ;
    public final EObject entryRuleVerificationResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationResult = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1151:2: (iv_ruleVerificationResult= ruleVerificationResult EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1152:2: iv_ruleVerificationResult= ruleVerificationResult EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultRule()); 
            pushFollow(FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult2416);
            iv_ruleVerificationResult=ruleVerificationResult();

            state._fsp--;

             current =iv_ruleVerificationResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResult2426); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1159:1: ruleVerificationResult returns [EObject current=null] : (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleValueString ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1162:28: ( (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleValueString ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1163:1: (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleValueString ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1163:1: (otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleValueString ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';' )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1163:3: otherlv_0= 'verification' otherlv_1= 'result' ( (lv_name_2_0= RULE_ID ) ) otherlv_3= 'of' ( (otherlv_4= RULE_ID ) )* (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )? (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )? (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleValueString ) ) )? (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )? (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )? otherlv_20= 'end' this_ID_21= RULE_ID otherlv_22= ';'
            {
            otherlv_0=(Token)match(input,35,FOLLOW_35_in_ruleVerificationResult2463); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationResultAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleVerificationResult2475); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationResultAccess().getResultKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1171:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1172:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1172:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1173:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult2492); 

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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleVerificationResult2509); 

                	newLeafNode(otherlv_3, grammarAccess.getVerificationResultAccess().getOfKeyword_3());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1193:1: ( (otherlv_4= RULE_ID ) )*
            loop33:
            do {
                int alt33=2;
                int LA33_0 = input.LA(1);

                if ( (LA33_0==RULE_ID) ) {
                    alt33=1;
                }


                switch (alt33) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1194:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1194:1: (otherlv_4= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1195:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVerificationResultRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult2529); 

            	    		newLeafNode(otherlv_4, grammarAccess.getVerificationResultAccess().getReferencedVerificationMethodVerificationActivityCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop33;
                }
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1206:3: (otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) ) )?
            int alt34=2;
            int LA34_0 = input.LA(1);

            if ( (LA34_0==42) ) {
                alt34=1;
            }
            switch (alt34) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1206:5: otherlv_5= 'output' otherlv_6= ':' ( (lv_title_7_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,42,FOLLOW_42_in_ruleVerificationResult2543); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationResultAccess().getOutputKeyword_5_0());
                        
                    otherlv_6=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2555); 

                        	newLeafNode(otherlv_6, grammarAccess.getVerificationResultAccess().getColonKeyword_5_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1214:1: ( (lv_title_7_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1215:1: (lv_title_7_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1215:1: (lv_title_7_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1216:3: lv_title_7_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getTitleValueStringParserRuleCall_5_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult2576);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1232:4: (otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) ) )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==43) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1232:6: otherlv_8= 'logfile' otherlv_9= ':' ( (lv_description_10_0= ruleValueString ) )
                    {
                    otherlv_8=(Token)match(input,43,FOLLOW_43_in_ruleVerificationResult2591); 

                        	newLeafNode(otherlv_8, grammarAccess.getVerificationResultAccess().getLogfileKeyword_6_0());
                        
                    otherlv_9=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2603); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationResultAccess().getColonKeyword_6_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1240:1: ( (lv_description_10_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1241:1: (lv_description_10_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1241:1: (lv_description_10_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1242:3: lv_description_10_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getDescriptionValueStringParserRuleCall_6_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult2624);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1258:4: (otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleValueString ) ) )?
            int alt36=2;
            int LA36_0 = input.LA(1);

            if ( (LA36_0==44) ) {
                alt36=1;
            }
            switch (alt36) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1258:6: otherlv_11= 'date' otherlv_12= ':' ( (lv_method_13_0= ruleValueString ) )
                    {
                    otherlv_11=(Token)match(input,44,FOLLOW_44_in_ruleVerificationResult2639); 

                        	newLeafNode(otherlv_11, grammarAccess.getVerificationResultAccess().getDateKeyword_7_0());
                        
                    otherlv_12=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2651); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerificationResultAccess().getColonKeyword_7_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1266:1: ( (lv_method_13_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1267:1: (lv_method_13_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1267:1: (lv_method_13_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1268:3: lv_method_13_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getMethodValueStringParserRuleCall_7_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult2672);
                    lv_method_13_0=ruleValueString();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getVerificationResultRule());
                    	        }
                           		set(
                           			current, 
                           			"method",
                            		lv_method_13_0, 
                            		"ValueString");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1284:4: (otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) ) )?
            int alt37=2;
            int LA37_0 = input.LA(1);

            if ( (LA37_0==45) ) {
                alt37=1;
            }
            switch (alt37) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1284:6: otherlv_14= 'state' otherlv_15= ':' ( (lv_state_16_0= ruleVerificationResultState ) )
                    {
                    otherlv_14=(Token)match(input,45,FOLLOW_45_in_ruleVerificationResult2687); 

                        	newLeafNode(otherlv_14, grammarAccess.getVerificationResultAccess().getStateKeyword_8_0());
                        
                    otherlv_15=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2699); 

                        	newLeafNode(otherlv_15, grammarAccess.getVerificationResultAccess().getColonKeyword_8_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1292:1: ( (lv_state_16_0= ruleVerificationResultState ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1293:1: (lv_state_16_0= ruleVerificationResultState )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1293:1: (lv_state_16_0= ruleVerificationResultState )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1294:3: lv_state_16_0= ruleVerificationResultState
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStateVerificationResultStateParserRuleCall_8_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultState_in_ruleVerificationResult2720);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1310:4: (otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) ) )?
            int alt38=2;
            int LA38_0 = input.LA(1);

            if ( (LA38_0==46) ) {
                alt38=1;
            }
            switch (alt38) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1310:6: otherlv_17= 'status' otherlv_18= ':' ( (lv_status_19_0= ruleVerificationResultStatus ) )
                    {
                    otherlv_17=(Token)match(input,46,FOLLOW_46_in_ruleVerificationResult2735); 

                        	newLeafNode(otherlv_17, grammarAccess.getVerificationResultAccess().getStatusKeyword_9_0());
                        
                    otherlv_18=(Token)match(input,13,FOLLOW_13_in_ruleVerificationResult2747); 

                        	newLeafNode(otherlv_18, grammarAccess.getVerificationResultAccess().getColonKeyword_9_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1318:1: ( (lv_status_19_0= ruleVerificationResultStatus ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1319:1: (lv_status_19_0= ruleVerificationResultStatus )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1319:1: (lv_status_19_0= ruleVerificationResultStatus )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1320:3: lv_status_19_0= ruleVerificationResultStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStatusVerificationResultStatusParserRuleCall_9_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult2768);
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

            otherlv_20=(Token)match(input,16,FOLLOW_16_in_ruleVerificationResult2782); 

                	newLeafNode(otherlv_20, grammarAccess.getVerificationResultAccess().getEndKeyword_10());
                
            this_ID_21=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult2793); 
             
                newLeafNode(this_ID_21, grammarAccess.getVerificationResultAccess().getIDTerminalRuleCall_11()); 
                
            otherlv_22=(Token)match(input,17,FOLLOW_17_in_ruleVerificationResult2804); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1356:1: entryRuleVerificationResultState returns [String current=null] : iv_ruleVerificationResultState= ruleVerificationResultState EOF ;
    public final String entryRuleVerificationResultState() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationResultState = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1357:2: (iv_ruleVerificationResultState= ruleVerificationResultState EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1358:2: iv_ruleVerificationResultState= ruleVerificationResultState EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultStateRule()); 
            pushFollow(FOLLOW_ruleVerificationResultState_in_entryRuleVerificationResultState2841);
            iv_ruleVerificationResultState=ruleVerificationResultState();

            state._fsp--;

             current =iv_ruleVerificationResultState.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResultState2852); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1365:1: ruleVerificationResultState returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'scheduled' | kw= 'passed' | kw= 'inprogress' ) ;
    public final AntlrDatatypeRuleToken ruleVerificationResultState() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1368:28: ( (kw= 'scheduled' | kw= 'passed' | kw= 'inprogress' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1369:1: (kw= 'scheduled' | kw= 'passed' | kw= 'inprogress' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1369:1: (kw= 'scheduled' | kw= 'passed' | kw= 'inprogress' )
            int alt39=3;
            switch ( input.LA(1) ) {
            case 47:
                {
                alt39=1;
                }
                break;
            case 48:
                {
                alt39=2;
                }
                break;
            case 49:
                {
                alt39=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 39, 0, input);

                throw nvae;
            }

            switch (alt39) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1370:2: kw= 'scheduled'
                    {
                    kw=(Token)match(input,47,FOLLOW_47_in_ruleVerificationResultState2890); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStateAccess().getScheduledKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1377:2: kw= 'passed'
                    {
                    kw=(Token)match(input,48,FOLLOW_48_in_ruleVerificationResultState2909); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStateAccess().getPassedKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1384:2: kw= 'inprogress'
                    {
                    kw=(Token)match(input,49,FOLLOW_49_in_ruleVerificationResultState2928); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStateAccess().getInprogressKeyword_2()); 
                        

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


    // $ANTLR start "entryRuleVerificationResultStatus"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1397:1: entryRuleVerificationResultStatus returns [String current=null] : iv_ruleVerificationResultStatus= ruleVerificationResultStatus EOF ;
    public final String entryRuleVerificationResultStatus() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationResultStatus = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1398:2: (iv_ruleVerificationResultStatus= ruleVerificationResultStatus EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1399:2: iv_ruleVerificationResultStatus= ruleVerificationResultStatus EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultStatusRule()); 
            pushFollow(FOLLOW_ruleVerificationResultStatus_in_entryRuleVerificationResultStatus2969);
            iv_ruleVerificationResultStatus=ruleVerificationResultStatus();

            state._fsp--;

             current =iv_ruleVerificationResultStatus.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResultStatus2980); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1406:1: ruleVerificationResultStatus returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= 'ok' | kw= 'unknown' | kw= 'tbd' ) ;
    public final AntlrDatatypeRuleToken ruleVerificationResultStatus() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1409:28: ( (kw= 'ok' | kw= 'unknown' | kw= 'tbd' ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1410:1: (kw= 'ok' | kw= 'unknown' | kw= 'tbd' )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1410:1: (kw= 'ok' | kw= 'unknown' | kw= 'tbd' )
            int alt40=3;
            switch ( input.LA(1) ) {
            case 50:
                {
                alt40=1;
                }
                break;
            case 51:
                {
                alt40=2;
                }
                break;
            case 52:
                {
                alt40=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 40, 0, input);

                throw nvae;
            }

            switch (alt40) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1411:2: kw= 'ok'
                    {
                    kw=(Token)match(input,50,FOLLOW_50_in_ruleVerificationResultStatus3018); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getOkKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1418:2: kw= 'unknown'
                    {
                    kw=(Token)match(input,51,FOLLOW_51_in_ruleVerificationResultStatus3037); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getUnknownKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisa.g:1425:2: kw= 'tbd'
                    {
                    kw=(Token)match(input,52,FOLLOW_52_in_ruleVerificationResultStatus3056); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationResultStatusAccess().getTbdKeyword_2()); 
                        

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


 

    public static final BitSet FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlisaModel85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleAlisaModel132 = new BitSet(new long[]{0x0000000810040802L});
    public static final BitSet FOLLOW_ruleRequirement_in_ruleAlisaModel151 = new BitSet(new long[]{0x0000000810040802L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_ruleAlisaModel170 = new BitSet(new long[]{0x0000000810040802L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_ruleAlisaModel189 = new BitSet(new long[]{0x0000000810040802L});
    public static final BitSet FOLLOW_ruleElementType_in_ruleAlisaModel208 = new BitSet(new long[]{0x0000000810040802L});
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
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement689 = new BitSet(new long[]{0x0000000003595000L});
    public static final BitSet FOLLOW_12_in_ruleRequirement707 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement719 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement740 = new BitSet(new long[]{0x0000000003594000L});
    public static final BitSet FOLLOW_14_in_ruleRequirement755 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement767 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement788 = new BitSet(new long[]{0x0000000003590000L});
    public static final BitSet FOLLOW_19_in_ruleRequirement803 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement815 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement836 = new BitSet(new long[]{0x0000000003510000L});
    public static final BitSet FOLLOW_20_in_ruleRequirement851 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleRequirement863 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement875 = new BitSet(new long[]{0x0000000003410020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement895 = new BitSet(new long[]{0x0000000003410020L});
    public static final BitSet FOLLOW_22_in_ruleRequirement911 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRequirement923 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement935 = new BitSet(new long[]{0x0000000003010020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement955 = new BitSet(new long[]{0x0000000003010020L});
    public static final BitSet FOLLOW_24_in_ruleRequirement971 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRequirement983 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement995 = new BitSet(new long[]{0x0000000002010020L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleRequirement1016 = new BitSet(new long[]{0x0000000002010020L});
    public static final BitSet FOLLOW_25_in_ruleRequirement1032 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_23_in_ruleRequirement1044 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleRequirement1056 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_ruleRequirementDecomposition_in_ruleRequirement1077 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleRequirement1092 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement1103 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleRequirement1114 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirementDecomposition_in_entryRuleRequirementDecomposition1150 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirementDecomposition1160 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementDecomposition1205 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirementDecomposition1232 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleRequirementDecomposition1252 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27_in_ruleRequirementDecomposition1281 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleRequirementDecomposition_in_ruleRequirementDecomposition1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition1355 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationDecomposition1365 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationDecomposition1410 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationDecomposition1437 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleVerificationDecomposition1457 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_27_in_ruleVerificationDecomposition1486 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition1523 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleElementType_in_entryRuleElementType1560 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleElementType1570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleElementType1607 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_29_in_ruleElementType1619 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementType1636 = new BitSet(new long[]{0x00000007C0010000L});
    public static final BitSet FOLLOW_30_in_ruleElementType1654 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1666 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1687 = new BitSet(new long[]{0x0000000780010000L});
    public static final BitSet FOLLOW_31_in_ruleElementType1702 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1714 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1735 = new BitSet(new long[]{0x0000000700010000L});
    public static final BitSet FOLLOW_32_in_ruleElementType1750 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1762 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1783 = new BitSet(new long[]{0x0000000600010000L});
    public static final BitSet FOLLOW_33_in_ruleElementType1798 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1810 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1831 = new BitSet(new long[]{0x0000000400010000L});
    public static final BitSet FOLLOW_34_in_ruleElementType1846 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleElementType1858 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleElementType1879 = new BitSet(new long[]{0x0000000000010010L});
    public static final BitSet FOLLOW_16_in_ruleElementType1894 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleElementType1905 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleElementType1916 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity1952 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationActivity1962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVerificationActivity1999 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_ruleVerificationActivity2011 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity2028 = new BitSet(new long[]{0x0000002000115000L});
    public static final BitSet FOLLOW_12_in_ruleVerificationActivity2046 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationActivity2058 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity2079 = new BitSet(new long[]{0x0000002000114000L});
    public static final BitSet FOLLOW_14_in_ruleVerificationActivity2094 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationActivity2106 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity2127 = new BitSet(new long[]{0x0000002000110000L});
    public static final BitSet FOLLOW_37_in_ruleVerificationActivity2142 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationActivity2154 = new BitSet(new long[]{0x000000C000000000L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity2175 = new BitSet(new long[]{0x0000000000110000L});
    public static final BitSet FOLLOW_20_in_ruleVerificationActivity2190 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleVerificationActivity2202 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationActivity2214 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity2234 = new BitSet(new long[]{0x0000000000010020L});
    public static final BitSet FOLLOW_16_in_ruleVerificationActivity2249 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity2260 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVerificationActivity2271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod2308 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationMethod2319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleVerificationMethod2357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_39_in_ruleVerificationMethod2376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult2416 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResult2426 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleVerificationResult2463 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleVerificationResult2475 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult2492 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleVerificationResult2509 = new BitSet(new long[]{0x00007C0000010020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult2529 = new BitSet(new long[]{0x00007C0000010020L});
    public static final BitSet FOLLOW_42_in_ruleVerificationResult2543 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2555 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult2576 = new BitSet(new long[]{0x0000780000010000L});
    public static final BitSet FOLLOW_43_in_ruleVerificationResult2591 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2603 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult2624 = new BitSet(new long[]{0x0000700000010000L});
    public static final BitSet FOLLOW_44_in_ruleVerificationResult2639 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2651 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult2672 = new BitSet(new long[]{0x0000600000010000L});
    public static final BitSet FOLLOW_45_in_ruleVerificationResult2687 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2699 = new BitSet(new long[]{0x0003800000000000L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_ruleVerificationResult2720 = new BitSet(new long[]{0x0000400000010000L});
    public static final BitSet FOLLOW_46_in_ruleVerificationResult2735 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_13_in_ruleVerificationResult2747 = new BitSet(new long[]{0x001C000000000000L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult2768 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_16_in_ruleVerificationResult2782 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult2793 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleVerificationResult2804 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_entryRuleVerificationResultState2841 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResultState2852 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleVerificationResultState2890 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleVerificationResultState2909 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleVerificationResultState2928 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_entryRuleVerificationResultStatus2969 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResultStatus2980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleVerificationResultStatus3018 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_ruleVerificationResultStatus3037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleVerificationResultStatus3056 = new BitSet(new long[]{0x0000000000000002L});

}