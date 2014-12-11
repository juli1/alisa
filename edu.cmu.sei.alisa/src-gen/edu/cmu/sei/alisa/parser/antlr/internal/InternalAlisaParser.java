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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "Organization", "Verification", "Description", "Oranization", "Requirement", "Stakeholder", "Decomposed", "Decomposes", "Inprogress", "Assertion", "Automatic", "Completed", "Conflicts", "Rationale", "Scheduled", "Activity", "Analysis", "Assigned", "Category", "Document", "Verified", "Evolves", "Extends", "Imports", "Logfile", "Package", "Refines", "Section", "Testing", "Unknown", "Hazard", "Issues", "Manual", "Method", "Output", "Result", "Review", "Status", "System", "Email", "Phone", "State", "Title", "Date", "Fail", "Goal", "Pass", "Role", "With", "And", "End", "For", "Req", "See", "ColonColon", "By", "Cr", "Of", "Or", "To", "NumberSign", "Comma", "FullStop", "Solidus", "Colon", "EqualsSign", "RULE_STRING", "RULE_ID", "RULE_WS", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_ANY_OTHER"
    };
    public static final int End=54;
    public static final int RULE_ID=71;
    public static final int Method=37;
    public static final int Unknown=33;
    public static final int Organization=4;
    public static final int Output=38;
    public static final int RULE_ANY_OTHER=76;
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
    public static final int RULE_INT=73;
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
    public static final int RULE_SL_COMMENT=75;
    public static final int Package=29;
    public static final int For=55;
    public static final int Verified=24;
    public static final int NumberSign=64;
    public static final int System=42;
    public static final int Rationale=17;
    public static final int With=52;
    public static final int Goal=49;
    public static final int RULE_ML_COMMENT=74;
    public static final int By=59;
    public static final int ColonColon=58;
    public static final int Document=23;
    public static final int Description=6;
    public static final int RULE_STRING=70;
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
    public static final int RULE_WS=72;
    public static final int Role=51;
    public static final int Comma=65;
    public static final int EqualsSign=69;
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


    // $ANTLR start "entryRuleDescriptionElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:595:1: entryRuleDescriptionElement returns [EObject current=null] : iv_ruleDescriptionElement= ruleDescriptionElement EOF ;
    public final EObject entryRuleDescriptionElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDescriptionElement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:596:2: (iv_ruleDescriptionElement= ruleDescriptionElement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:597:2: iv_ruleDescriptionElement= ruleDescriptionElement EOF
            {
             newCompositeNode(grammarAccess.getDescriptionElementRule()); 
            pushFollow(FOLLOW_ruleDescriptionElement_in_entryRuleDescriptionElement1211);
            iv_ruleDescriptionElement=ruleDescriptionElement();

            state._fsp--;

             current =iv_ruleDescriptionElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDescriptionElement1221); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:604:1: ruleDescriptionElement returns [EObject current=null] : ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) ;
    public final EObject ruleDescriptionElement() throws RecognitionException {
        EObject current = null;

        Token lv_test_0_0=null;
        Token otherlv_1=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:607:28: ( ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:608:1: ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:608:1: ( ( (lv_test_0_0= RULE_STRING ) ) | ( (otherlv_1= RULE_ID ) ) )
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==RULE_STRING) ) {
                alt15=1;
            }
            else if ( (LA15_0==RULE_ID) ) {
                alt15=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;
            }
            switch (alt15) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:608:2: ( (lv_test_0_0= RULE_STRING ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:608:2: ( (lv_test_0_0= RULE_STRING ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:609:1: (lv_test_0_0= RULE_STRING )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:609:1: (lv_test_0_0= RULE_STRING )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:610:3: lv_test_0_0= RULE_STRING
                    {
                    lv_test_0_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleDescriptionElement1263); 

                    			newLeafNode(lv_test_0_0, grammarAccess.getDescriptionElementAccess().getTestSTRINGTerminalRuleCall_0_0()); 
                    		

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
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:627:6: ( (otherlv_1= RULE_ID ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:627:6: ( (otherlv_1= RULE_ID ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:628:1: (otherlv_1= RULE_ID )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:628:1: (otherlv_1= RULE_ID )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:629:3: otherlv_1= RULE_ID
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getDescriptionElementRule());
                    	        }
                            
                    otherlv_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDescriptionElement1294); 

                    		newLeafNode(otherlv_1, grammarAccess.getDescriptionElementAccess().getRefRSALVariableCrossReference_1_0()); 
                    	

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
    // $ANTLR end "ruleDescriptionElement"


    // $ANTLR start "entryRuleContractualElement"
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:652:1: entryRuleContractualElement returns [EObject current=null] : iv_ruleContractualElement= ruleContractualElement EOF ;
    public final EObject entryRuleContractualElement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleContractualElement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:653:2: (iv_ruleContractualElement= ruleContractualElement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:654:2: iv_ruleContractualElement= ruleContractualElement EOF
            {
             newCompositeNode(grammarAccess.getContractualElementRule()); 
            pushFollow(FOLLOW_ruleContractualElement_in_entryRuleContractualElement1333);
            iv_ruleContractualElement=ruleContractualElement();

            state._fsp--;

             current =iv_ruleContractualElement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleContractualElement1343); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:661:1: ruleContractualElement returns [EObject current=null] : (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:664:28: ( (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:665:1: (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:665:1: (otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:666:2: otherlv_0= Cr ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_67= End
            {
            otherlv_0=(Token)match(input,Cr,FOLLOW_Cr_in_ruleContractualElement1381); 

                	newLeafNode(otherlv_0, grammarAccess.getContractualElementAccess().getCrKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:670:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:671:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:671:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:672:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleContractualElement1397); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:688:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:690:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:690:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:691:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:694:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:695:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:695:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop28:
            do {
                int alt28=18;
                alt28 = dfa28.predict(input);
                switch (alt28) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:697:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:697:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:698:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:698:115: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:699:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:702:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:702:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:702:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:703:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleContractualElement1461); 

            	        	newLeafNode(otherlv_3, grammarAccess.getContractualElementAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:707:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:708:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:708:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:709:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleContractualElement1483);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:729:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:729:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:730:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:730:115: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:731:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:734:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:734:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:734:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:735:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleContractualElement1552); 

            	        	newLeafNode(otherlv_5, grammarAccess.getContractualElementAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:739:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:740:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:740:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:741:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1574);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:754:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop16:
            	    do {
            	        int alt16=2;
            	        int LA16_0 = input.LA(1);

            	        if ( (LA16_0==Comma) ) {
            	            alt16=1;
            	        }


            	        switch (alt16) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:755:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement1588); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getContractualElementAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:759:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:760:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:760:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:761:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1610);
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
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:781:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:781:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:782:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:782:115: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:783:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:786:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:786:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:786:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:787:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleContractualElement1681); 

            	        	newLeafNode(otherlv_9, grammarAccess.getContractualElementAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:791:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:792:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:792:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:793:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1701);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:816:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:816:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:817:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:817:115: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:818:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:821:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:821:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:821:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:822:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleContractualElement1770); 

            	        	newLeafNode(otherlv_11, grammarAccess.getContractualElementAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:826:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:827:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:827:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:828:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1790);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:851:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:851:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:852:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:852:115: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:853:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:856:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:856:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:856:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:857:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleContractualElement1859); 

            	        	newLeafNode(otherlv_13, grammarAccess.getContractualElementAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:861:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:862:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:862:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:863:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1879);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:886:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:886:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:887:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:887:115: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:888:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:891:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:891:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:891:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:892:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleContractualElement1948); 

            	        	newLeafNode(otherlv_15, grammarAccess.getContractualElementAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:896:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:897:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:897:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:898:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement1968);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:921:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:921:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:922:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:922:115: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:923:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:926:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:926:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:926:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:927:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleContractualElement2037); 

            	        	newLeafNode(otherlv_17, grammarAccess.getContractualElementAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:931:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:932:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:932:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:933:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement2057);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:949:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop17:
            	    do {
            	        int alt17=2;
            	        int LA17_0 = input.LA(1);

            	        if ( (LA17_0==Comma) ) {
            	            alt17=1;
            	        }


            	        switch (alt17) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:950:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2071); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getContractualElementAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:954:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:955:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:955:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:956:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleContractualElement2091);
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
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:979:4: ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:979:4: ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:980:5: {...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:980:115: ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:981:6: ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:984:6: ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:984:7: {...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:984:16: (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:985:2: otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Section,FOLLOW_Section_in_ruleContractualElement2162); 

            	        	newLeafNode(otherlv_21, grammarAccess.getContractualElementAccess().getSectionKeyword_2_7_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:989:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:990:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:990:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:991:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSectionReferenceRSALContainerCrossReference_2_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2184);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1004:2: (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop18:
            	    do {
            	        int alt18=2;
            	        int LA18_0 = input.LA(1);

            	        if ( (LA18_0==Comma) ) {
            	            alt18=1;
            	        }


            	        switch (alt18) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1005:2: otherlv_23= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2198); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getContractualElementAccess().getCommaKeyword_2_7_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1009:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1010:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1010:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1011:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSectionReferenceRSALContainerCrossReference_2_7_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2220);
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
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1031:4: ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1031:4: ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1032:5: {...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1032:115: ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1033:6: ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1036:6: ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1036:7: {...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1036:16: (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1037:2: otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,Refines,FOLLOW_Refines_in_ruleContractualElement2291); 

            	        	newLeafNode(otherlv_25, grammarAccess.getContractualElementAccess().getRefinesKeyword_2_8_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1041:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1042:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1042:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1043:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRefinesReferenceContractualElementCrossReference_2_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2313);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1056:2: (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop19:
            	    do {
            	        int alt19=2;
            	        int LA19_0 = input.LA(1);

            	        if ( (LA19_0==Comma) ) {
            	            alt19=1;
            	        }


            	        switch (alt19) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1057:2: otherlv_27= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2327); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getContractualElementAccess().getCommaKeyword_2_8_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1061:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1062:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1062:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1063:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getRefinesReferenceContractualElementCrossReference_2_8_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2349);
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
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1083:4: ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1083:4: ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1084:5: {...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1084:115: ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1085:6: ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1088:6: ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1088:7: {...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1088:16: (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1089:2: otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleContractualElement2420); 

            	        	newLeafNode(otherlv_29, grammarAccess.getContractualElementAccess().getDecomposesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1093:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1094:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1094:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1095:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDecomposesReferenceContractualElementCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2442);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1108:2: (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop20:
            	    do {
            	        int alt20=2;
            	        int LA20_0 = input.LA(1);

            	        if ( (LA20_0==Comma) ) {
            	            alt20=1;
            	        }


            	        switch (alt20) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1109:2: otherlv_31= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2456); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getContractualElementAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1113:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1114:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1114:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1115:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDecomposesReferenceContractualElementCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2478);
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
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:4: ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1135:4: ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1136:5: {...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1136:116: ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1137:6: ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1140:6: ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1140:7: {...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1140:16: (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1141:2: otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleContractualElement2549); 

            	        	newLeafNode(otherlv_33, grammarAccess.getContractualElementAccess().getEvolvesKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1145:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1146:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1146:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1147:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getEvolvesReferenceContractualElementCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2571);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1160:2: (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop21:
            	    do {
            	        int alt21=2;
            	        int LA21_0 = input.LA(1);

            	        if ( (LA21_0==Comma) ) {
            	            alt21=1;
            	        }


            	        switch (alt21) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1161:2: otherlv_35= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2585); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getContractualElementAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1165:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1166:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1166:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1167:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getEvolvesReferenceContractualElementCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2607);
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
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:4: ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1187:4: ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1188:5: {...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1188:116: ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1189:6: ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1192:6: ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1192:7: {...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1192:16: (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1193:2: otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,Conflicts,FOLLOW_Conflicts_in_ruleContractualElement2678); 

            	        	newLeafNode(otherlv_37, grammarAccess.getContractualElementAccess().getConflictsKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1197:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1198:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1198:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1199:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getConflictsReferenceContractualElementCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2700);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1212:2: (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop22:
            	    do {
            	        int alt22=2;
            	        int LA22_0 = input.LA(1);

            	        if ( (LA22_0==Comma) ) {
            	            alt22=1;
            	        }


            	        switch (alt22) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1213:2: otherlv_39= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2714); 

            	    	        	newLeafNode(otherlv_39, grammarAccess.getContractualElementAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1217:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1218:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1218:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1219:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getConflictsReferenceContractualElementCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2736);
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
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1239:4: ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1239:4: ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1240:5: {...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1240:116: ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1241:6: ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1244:6: ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1244:7: {...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1244:16: (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1245:2: otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleContractualElement2807); 

            	        	newLeafNode(otherlv_41, grammarAccess.getContractualElementAccess().getStakeholderKeyword_2_12_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1249:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1250:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1250:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1251:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderReferenceStakeholderCrossReference_2_12_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2829);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1264:2: (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop23:
            	    do {
            	        int alt23=2;
            	        int LA23_0 = input.LA(1);

            	        if ( (LA23_0==Comma) ) {
            	            alt23=1;
            	        }


            	        switch (alt23) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1265:2: otherlv_43= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_43=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2843); 

            	    	        	newLeafNode(otherlv_43, grammarAccess.getContractualElementAccess().getCommaKeyword_2_12_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1269:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1270:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1270:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1271:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderReferenceStakeholderCrossReference_2_12_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2865);
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
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1291:4: ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1291:4: ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1292:5: {...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1292:116: ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1293:6: ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1296:6: ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1296:7: {...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1296:16: (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1297:2: otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_45=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement2936); 

            	        	newLeafNode(otherlv_45, grammarAccess.getContractualElementAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_46=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleContractualElement2948); 

            	        	newLeafNode(otherlv_46, grammarAccess.getContractualElementAccess().getStakeholderKeyword_2_13_1());
            	        
            	    otherlv_47=(Token)match(input,Req,FOLLOW_Req_in_ruleContractualElement2960); 

            	        	newLeafNode(otherlv_47, grammarAccess.getContractualElementAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1311:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1312:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1312:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1313:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2982);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1326:2: (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop24:
            	    do {
            	        int alt24=2;
            	        int LA24_0 = input.LA(1);

            	        if ( (LA24_0==Comma) ) {
            	            alt24=1;
            	        }


            	        switch (alt24) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1327:2: otherlv_49= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_49=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement2996); 

            	    	        	newLeafNode(otherlv_49, grammarAccess.getContractualElementAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1331:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1332:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1332:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1333:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getStakeholderRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3018);
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
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1353:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1353:4: ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1354:5: {...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1354:116: ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1355:6: ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1358:6: ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1358:7: {...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1358:16: (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1359:2: otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_51=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement3089); 

            	        	newLeafNode(otherlv_51, grammarAccess.getContractualElementAccess().getSeeKeyword_2_14_0());
            	        
            	    otherlv_52=(Token)match(input,System,FOLLOW_System_in_ruleContractualElement3101); 

            	        	newLeafNode(otherlv_52, grammarAccess.getContractualElementAccess().getSystemKeyword_2_14_1());
            	        
            	    otherlv_53=(Token)match(input,Req,FOLLOW_Req_in_ruleContractualElement3113); 

            	        	newLeafNode(otherlv_53, grammarAccess.getContractualElementAccess().getReqKeyword_2_14_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1373:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1374:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1374:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1375:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_14_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3135);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1388:2: (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==Comma) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1389:2: otherlv_55= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_55=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement3149); 

            	    	        	newLeafNode(otherlv_55, grammarAccess.getContractualElementAccess().getCommaKeyword_2_14_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1393:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1394:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1394:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1395:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getContractualElementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_14_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3171);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
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
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1415:4: ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1415:4: ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1416:5: {...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1416:116: ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1417:6: ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1420:6: ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1420:7: {...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1420:16: (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1421:2: otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_57=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement3242); 

            	        	newLeafNode(otherlv_57, grammarAccess.getContractualElementAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_58=(Token)match(input,Document,FOLLOW_Document_in_ruleContractualElement3254); 

            	        	newLeafNode(otherlv_58, grammarAccess.getContractualElementAccess().getDocumentKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1430:1: ( (lv_docReference_59_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1431:1: (lv_docReference_59_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1431:1: (lv_docReference_59_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1432:3: lv_docReference_59_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDocReferenceXDocUriParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleContractualElement3274);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1448:2: (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )*
            	    loop26:
            	    do {
            	        int alt26=2;
            	        int LA26_0 = input.LA(1);

            	        if ( (LA26_0==Comma) ) {
            	            alt26=1;
            	        }


            	        switch (alt26) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1449:2: otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_60=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement3288); 

            	    	        	newLeafNode(otherlv_60, grammarAccess.getContractualElementAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1453:1: ( (lv_docReference_61_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1454:1: (lv_docReference_61_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1454:1: (lv_docReference_61_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1455:3: lv_docReference_61_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getDocReferenceXDocUriParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleContractualElement3308);
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
            	case 17 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1478:4: ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1478:4: ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1479:5: {...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1479:116: ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1480:6: ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1483:6: ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1483:7: {...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleContractualElement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1483:16: (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1484:2: otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_62=(Token)match(input,See,FOLLOW_See_in_ruleContractualElement3379); 

            	        	newLeafNode(otherlv_62, grammarAccess.getContractualElementAccess().getSeeKeyword_2_16_0());
            	        
            	    otherlv_63=(Token)match(input,Colon,FOLLOW_Colon_in_ruleContractualElement3391); 

            	        	newLeafNode(otherlv_63, grammarAccess.getContractualElementAccess().getColonKeyword_2_16_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1493:1: ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1494:1: (lv_modelReference_64_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1494:1: (lv_modelReference_64_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1495:3: lv_modelReference_64_0= ruleQDOTTEDPAREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3411);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1511:2: (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )*
            	    loop27:
            	    do {
            	        int alt27=2;
            	        int LA27_0 = input.LA(1);

            	        if ( (LA27_0==Comma) ) {
            	            alt27=1;
            	        }


            	        switch (alt27) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1512:2: otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_65=(Token)match(input,Comma,FOLLOW_Comma_in_ruleContractualElement3425); 

            	    	        	newLeafNode(otherlv_65, grammarAccess.getContractualElementAccess().getCommaKeyword_2_16_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1516:1: ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1517:1: (lv_modelReference_66_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1517:1: (lv_modelReference_66_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1518:3: lv_modelReference_66_0= ruleQDOTTEDPAREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getContractualElementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3445);
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
            	    	    break loop27;
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
            	    break loop28;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getContractualElementAccess().getUnorderedGroup_2());
            	

            }

            otherlv_67=(Token)match(input,End,FOLLOW_End_in_ruleContractualElement3501); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1561:1: entryRuleGoal returns [EObject current=null] : iv_ruleGoal= ruleGoal EOF ;
    public final EObject entryRuleGoal() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleGoal = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1562:2: (iv_ruleGoal= ruleGoal EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1563:2: iv_ruleGoal= ruleGoal EOF
            {
             newCompositeNode(grammarAccess.getGoalRule()); 
            pushFollow(FOLLOW_ruleGoal_in_entryRuleGoal3535);
            iv_ruleGoal=ruleGoal();

            state._fsp--;

             current =iv_ruleGoal; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleGoal3545); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1570:1: ruleGoal returns [EObject current=null] : (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1573:28: ( (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1574:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1574:1: (otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1575:2: otherlv_0= Goal ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_63= End
            {
            otherlv_0=(Token)match(input,Goal,FOLLOW_Goal_in_ruleGoal3583); 

                	newLeafNode(otherlv_0, grammarAccess.getGoalAccess().getGoalKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1579:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1580:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1580:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1581:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleGoal3599); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1597:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1599:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1599:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1600:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1603:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1604:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1604:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop40:
            do {
                int alt40=17;
                alt40 = dfa40.predict(input);
                switch (alt40) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1606:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1606:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1607:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1607:101: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1608:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1611:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1611:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1611:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1612:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleGoal3663); 

            	        	newLeafNode(otherlv_3, grammarAccess.getGoalAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1616:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1617:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1617:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1618:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleGoal3685);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1638:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1638:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1639:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1639:101: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1640:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1643:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1643:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1643:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1644:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleGoal3754); 

            	        	newLeafNode(otherlv_5, grammarAccess.getGoalAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1648:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1649:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1649:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1650:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3776);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1663:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop29:
            	    do {
            	        int alt29=2;
            	        int LA29_0 = input.LA(1);

            	        if ( (LA29_0==Comma) ) {
            	            alt29=1;
            	        }


            	        switch (alt29) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1664:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal3790); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getGoalAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1668:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1669:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1669:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1670:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal3812);
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
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1690:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1690:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1691:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1691:101: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1692:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1695:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1695:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1695:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1696:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleGoal3883); 

            	        	newLeafNode(otherlv_9, grammarAccess.getGoalAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1700:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1701:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1701:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1702:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3903);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1725:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1725:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1726:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1726:101: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1727:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1730:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1730:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1730:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1731:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleGoal3972); 

            	        	newLeafNode(otherlv_11, grammarAccess.getGoalAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1735:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1736:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1736:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1737:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal3992);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1760:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1760:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1761:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1761:101: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1762:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1765:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1765:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1765:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1766:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleGoal4061); 

            	        	newLeafNode(otherlv_13, grammarAccess.getGoalAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1770:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1771:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1771:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1772:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal4081);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1795:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1795:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1796:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1796:101: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1797:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1800:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1800:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1800:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1801:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleGoal4150); 

            	        	newLeafNode(otherlv_15, grammarAccess.getGoalAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1805:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1806:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1806:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1807:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal4170);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1830:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1830:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1831:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1831:101: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1832:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1835:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1835:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1835:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1836:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleGoal4239); 

            	        	newLeafNode(otherlv_17, grammarAccess.getGoalAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1840:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1841:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1841:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1842:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal4259);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1858:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop30:
            	    do {
            	        int alt30=2;
            	        int LA30_0 = input.LA(1);

            	        if ( (LA30_0==Comma) ) {
            	            alt30=1;
            	        }


            	        switch (alt30) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1859:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4273); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getGoalAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1863:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1864:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1864:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1865:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleGoal4293);
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
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1888:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1888:4: ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1889:5: {...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1889:101: ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1890:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1893:6: ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1893:7: {...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1893:16: (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1894:2: otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,Refines,FOLLOW_Refines_in_ruleGoal4364); 

            	        	newLeafNode(otherlv_21, grammarAccess.getGoalAccess().getRefinesKeyword_2_7_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1898:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1899:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1899:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1900:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4386);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1913:2: (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop31:
            	    do {
            	        int alt31=2;
            	        int LA31_0 = input.LA(1);

            	        if ( (LA31_0==Comma) ) {
            	            alt31=1;
            	        }


            	        switch (alt31) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1914:2: otherlv_23= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_23=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4400); 

            	    	        	newLeafNode(otherlv_23, grammarAccess.getGoalAccess().getCommaKeyword_2_7_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1918:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1919:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1919:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1920:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getRefinesReferenceGoalCrossReference_2_7_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4422);
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
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1940:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1940:4: ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1941:5: {...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1941:101: ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1942:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1945:6: ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1945:7: {...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1945:16: (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1946:2: otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_25=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleGoal4493); 

            	        	newLeafNode(otherlv_25, grammarAccess.getGoalAccess().getDecomposesKeyword_2_8_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1950:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1951:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1951:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1952:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4515);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1965:2: (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop32:
            	    do {
            	        int alt32=2;
            	        int LA32_0 = input.LA(1);

            	        if ( (LA32_0==Comma) ) {
            	            alt32=1;
            	        }


            	        switch (alt32) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1966:2: otherlv_27= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_27=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4529); 

            	    	        	newLeafNode(otherlv_27, grammarAccess.getGoalAccess().getCommaKeyword_2_8_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1970:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1971:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1971:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1972:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDecomposesReferenceGoalCrossReference_2_8_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4551);
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
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1992:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1992:4: ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1993:5: {...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1993:101: ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1994:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1997:6: ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1997:7: {...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1997:16: (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:1998:2: otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_29=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleGoal4622); 

            	        	newLeafNode(otherlv_29, grammarAccess.getGoalAccess().getEvolvesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2002:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2003:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2003:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2004:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4644);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2017:2: (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop33:
            	    do {
            	        int alt33=2;
            	        int LA33_0 = input.LA(1);

            	        if ( (LA33_0==Comma) ) {
            	            alt33=1;
            	        }


            	        switch (alt33) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2018:2: otherlv_31= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_31=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4658); 

            	    	        	newLeafNode(otherlv_31, grammarAccess.getGoalAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2022:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2023:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2023:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2024:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getEvolvesReferenceGoalCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4680);
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
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2044:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2044:4: ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2045:5: {...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2045:102: ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2046:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2049:6: ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2049:7: {...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2049:16: (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2050:2: otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_33=(Token)match(input,Conflicts,FOLLOW_Conflicts_in_ruleGoal4751); 

            	        	newLeafNode(otherlv_33, grammarAccess.getGoalAccess().getConflictsKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2054:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2055:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2055:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2056:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4773);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2069:2: (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop34:
            	    do {
            	        int alt34=2;
            	        int LA34_0 = input.LA(1);

            	        if ( (LA34_0==Comma) ) {
            	            alt34=1;
            	        }


            	        switch (alt34) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2070:2: otherlv_35= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_35=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4787); 

            	    	        	newLeafNode(otherlv_35, grammarAccess.getGoalAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2074:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2075:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2075:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2076:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getConflictsReferenceGoalCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4809);
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
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2096:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2096:4: ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2097:5: {...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2097:102: ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2098:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2101:6: ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2101:7: {...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2101:16: (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2102:2: otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_37=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleGoal4880); 

            	        	newLeafNode(otherlv_37, grammarAccess.getGoalAccess().getStakeholderKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2106:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2107:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2107:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2108:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4902);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2121:2: (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop35:
            	    do {
            	        int alt35=2;
            	        int LA35_0 = input.LA(1);

            	        if ( (LA35_0==Comma) ) {
            	            alt35=1;
            	        }


            	        switch (alt35) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2122:2: otherlv_39= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_39=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal4916); 

            	    	        	newLeafNode(otherlv_39, grammarAccess.getGoalAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2126:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2127:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2127:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2128:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderReferenceStakeholderCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal4938);
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
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2148:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2148:4: ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2149:5: {...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2149:102: ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2150:6: ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2153:6: ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2153:7: {...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2153:16: (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2154:2: otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_41=(Token)match(input,See,FOLLOW_See_in_ruleGoal5009); 

            	        	newLeafNode(otherlv_41, grammarAccess.getGoalAccess().getSeeKeyword_2_12_0());
            	        
            	    otherlv_42=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleGoal5021); 

            	        	newLeafNode(otherlv_42, grammarAccess.getGoalAccess().getStakeholderKeyword_2_12_1());
            	        
            	    otherlv_43=(Token)match(input,Req,FOLLOW_Req_in_ruleGoal5033); 

            	        	newLeafNode(otherlv_43, grammarAccess.getGoalAccess().getReqKeyword_2_12_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2168:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2169:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2169:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2170:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal5055);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2183:2: (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop36:
            	    do {
            	        int alt36=2;
            	        int LA36_0 = input.LA(1);

            	        if ( (LA36_0==Comma) ) {
            	            alt36=1;
            	        }


            	        switch (alt36) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2184:2: otherlv_45= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_45=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5069); 

            	    	        	newLeafNode(otherlv_45, grammarAccess.getGoalAccess().getCommaKeyword_2_12_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2188:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2189:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2189:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2190:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal5091);
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
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2210:4: ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2210:4: ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2211:5: {...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2211:102: ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2212:6: ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2215:6: ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2215:7: {...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2215:16: (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2216:2: otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_47=(Token)match(input,See,FOLLOW_See_in_ruleGoal5162); 

            	        	newLeafNode(otherlv_47, grammarAccess.getGoalAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_48=(Token)match(input,System,FOLLOW_System_in_ruleGoal5174); 

            	        	newLeafNode(otherlv_48, grammarAccess.getGoalAccess().getSystemKeyword_2_13_1());
            	        
            	    otherlv_49=(Token)match(input,Req,FOLLOW_Req_in_ruleGoal5186); 

            	        	newLeafNode(otherlv_49, grammarAccess.getGoalAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2230:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2231:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2231:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2232:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal5208);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2245:2: (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop37:
            	    do {
            	        int alt37=2;
            	        int LA37_0 = input.LA(1);

            	        if ( (LA37_0==Comma) ) {
            	            alt37=1;
            	        }


            	        switch (alt37) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2246:2: otherlv_51= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_51=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5222); 

            	    	        	newLeafNode(otherlv_51, grammarAccess.getGoalAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2250:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2251:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2251:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2252:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getGoalRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleGoal5244);
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

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2272:4: ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2272:4: ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2273:5: {...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2273:102: ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2274:6: ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2277:6: ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2277:7: {...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2277:16: (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2278:2: otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_53=(Token)match(input,See,FOLLOW_See_in_ruleGoal5315); 

            	        	newLeafNode(otherlv_53, grammarAccess.getGoalAccess().getSeeKeyword_2_14_0());
            	        
            	    otherlv_54=(Token)match(input,Document,FOLLOW_Document_in_ruleGoal5327); 

            	        	newLeafNode(otherlv_54, grammarAccess.getGoalAccess().getDocumentKeyword_2_14_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2287:1: ( (lv_docReference_55_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2288:1: (lv_docReference_55_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2288:1: (lv_docReference_55_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2289:3: lv_docReference_55_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal5347);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2305:2: (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )*
            	    loop38:
            	    do {
            	        int alt38=2;
            	        int LA38_0 = input.LA(1);

            	        if ( (LA38_0==Comma) ) {
            	            alt38=1;
            	        }


            	        switch (alt38) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2306:2: otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_56=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5361); 

            	    	        	newLeafNode(otherlv_56, grammarAccess.getGoalAccess().getCommaKeyword_2_14_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2310:1: ( (lv_docReference_57_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2311:1: (lv_docReference_57_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2311:1: (lv_docReference_57_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2312:3: lv_docReference_57_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getDocReferenceXDocUriParserRuleCall_2_14_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleGoal5381);
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
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2335:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2335:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2336:5: {...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2336:102: ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2337:6: ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2340:6: ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2340:7: {...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleGoal", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2340:16: (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2341:2: otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_58=(Token)match(input,See,FOLLOW_See_in_ruleGoal5452); 

            	        	newLeafNode(otherlv_58, grammarAccess.getGoalAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_59=(Token)match(input,Colon,FOLLOW_Colon_in_ruleGoal5464); 

            	        	newLeafNode(otherlv_59, grammarAccess.getGoalAccess().getColonKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2350:1: ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2351:1: (lv_modelReference_60_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2351:1: (lv_modelReference_60_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2352:3: lv_modelReference_60_0= ruleQDOTTEDPAREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getGoalAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5484);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2368:2: (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )*
            	    loop39:
            	    do {
            	        int alt39=2;
            	        int LA39_0 = input.LA(1);

            	        if ( (LA39_0==Comma) ) {
            	            alt39=1;
            	        }


            	        switch (alt39) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2369:2: otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_61=(Token)match(input,Comma,FOLLOW_Comma_in_ruleGoal5498); 

            	    	        	newLeafNode(otherlv_61, grammarAccess.getGoalAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2373:1: ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2374:1: (lv_modelReference_62_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2374:1: (lv_modelReference_62_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2375:3: lv_modelReference_62_0= ruleQDOTTEDPAREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getGoalAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5518);
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
            	    	    break loop39;
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
            	    break loop40;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getGoalAccess().getUnorderedGroup_2());
            	

            }

            otherlv_63=(Token)match(input,End,FOLLOW_End_in_ruleGoal5574); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2418:1: entryRuleRequirement returns [EObject current=null] : iv_ruleRequirement= ruleRequirement EOF ;
    public final EObject entryRuleRequirement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRequirement = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2419:2: (iv_ruleRequirement= ruleRequirement EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2420:2: iv_ruleRequirement= ruleRequirement EOF
            {
             newCompositeNode(grammarAccess.getRequirementRule()); 
            pushFollow(FOLLOW_ruleRequirement_in_entryRuleRequirement5608);
            iv_ruleRequirement=ruleRequirement();

            state._fsp--;

             current =iv_ruleRequirement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleRequirement5618); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2427:1: ruleRequirement returns [EObject current=null] : (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2430:28: ( (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2431:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2431:1: (otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2432:2: otherlv_0= Requirement ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) ) otherlv_68= End
            {
            otherlv_0=(Token)match(input,Requirement,FOLLOW_Requirement_in_ruleRequirement5656); 

                	newLeafNode(otherlv_0, grammarAccess.getRequirementAccess().getRequirementKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2436:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2437:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2437:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2438:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement5672); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2454:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2456:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2456:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2457:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2460:2: ( ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2461:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2461:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*
            loop53:
            do {
                int alt53=18;
                alt53 = dfa53.predict(input);
                switch (alt53) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2463:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2463:4: ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2464:5: {...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2464:108: ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2465:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2468:6: ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2468:7: {...}? => (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2468:16: (otherlv_3= For ( ( ruleQNEREF ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2469:2: otherlv_3= For ( ( ruleQNEREF ) )
            	    {
            	    otherlv_3=(Token)match(input,For,FOLLOW_For_in_ruleRequirement5736); 

            	        	newLeafNode(otherlv_3, grammarAccess.getRequirementAccess().getForKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2473:1: ( ( ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2474:1: ( ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2474:1: ( ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2475:3: ruleQNEREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getTargetNamedElementCrossReference_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement5758);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2495:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2495:4: ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2496:5: {...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2496:108: ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2497:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2500:6: ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2500:7: {...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2500:16: (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2501:2: otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_5=(Token)match(input,Category,FOLLOW_Category_in_ruleRequirement5827); 

            	        	newLeafNode(otherlv_5, grammarAccess.getRequirementAccess().getCategoryKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2505:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2506:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2506:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2507:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryCategoryCrossReference_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5849);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2520:2: (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop41:
            	    do {
            	        int alt41=2;
            	        int LA41_0 = input.LA(1);

            	        if ( (LA41_0==Comma) ) {
            	            alt41=1;
            	        }


            	        switch (alt41) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2521:2: otherlv_7= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_7=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement5863); 

            	    	        	newLeafNode(otherlv_7, grammarAccess.getRequirementAccess().getCommaKeyword_2_1_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2525:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2526:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2526:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2527:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getCategoryCategoryCrossReference_2_1_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement5885);
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
            	case 3 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2547:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2547:4: ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2548:5: {...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2548:108: ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2549:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2552:6: ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2552:7: {...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2552:16: (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2553:2: otherlv_9= Title ( (lv_title_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Title,FOLLOW_Title_in_ruleRequirement5956); 

            	        	newLeafNode(otherlv_9, grammarAccess.getRequirementAccess().getTitleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2557:1: ( (lv_title_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2558:1: (lv_title_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2558:1: (lv_title_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2559:3: lv_title_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getTitleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement5976);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2582:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2582:4: ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2583:5: {...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2583:108: ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2584:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2587:6: ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2587:7: {...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2587:16: (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2588:2: otherlv_11= Description ( (lv_description_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Description,FOLLOW_Description_in_ruleRequirement6045); 

            	        	newLeafNode(otherlv_11, grammarAccess.getRequirementAccess().getDescriptionKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2592:1: ( (lv_description_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2593:1: (lv_description_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2593:1: (lv_description_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2594:3: lv_description_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDescriptionValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6065);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2617:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2617:4: ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2618:5: {...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2618:108: ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2619:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2622:6: ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2622:7: {...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2622:16: (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2623:2: otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Assertion,FOLLOW_Assertion_in_ruleRequirement6134); 

            	        	newLeafNode(otherlv_13, grammarAccess.getRequirementAccess().getAssertionKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2627:1: ( (lv_assert_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2628:1: (lv_assert_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2628:1: (lv_assert_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2629:3: lv_assert_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getAssertValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6154);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2652:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2652:4: ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2653:5: {...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2653:108: ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2654:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2657:6: ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2657:7: {...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2657:16: (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2658:2: otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) )
            	    {
            	    otherlv_15=(Token)match(input,Rationale,FOLLOW_Rationale_in_ruleRequirement6223); 

            	        	newLeafNode(otherlv_15, grammarAccess.getRequirementAccess().getRationaleKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2662:1: ( (lv_rationale_16_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2663:1: (lv_rationale_16_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2663:1: (lv_rationale_16_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2664:3: lv_rationale_16_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRationaleValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6243);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2687:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2687:4: ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2688:5: {...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2688:108: ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2689:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2692:6: ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2692:7: {...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2692:16: (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2693:2: otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    {
            	    otherlv_17=(Token)match(input,Issues,FOLLOW_Issues_in_ruleRequirement6312); 

            	        	newLeafNode(otherlv_17, grammarAccess.getRequirementAccess().getIssuesKeyword_2_6_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2697:1: ( (lv_issue_18_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2698:1: (lv_issue_18_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2698:1: (lv_issue_18_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2699:3: lv_issue_18_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6332);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2715:2: (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )*
            	    loop42:
            	    do {
            	        int alt42=2;
            	        int LA42_0 = input.LA(1);

            	        if ( (LA42_0==Comma) ) {
            	            alt42=1;
            	        }


            	        switch (alt42) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2716:2: otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) )
            	    	    {
            	    	    otherlv_19=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6346); 

            	    	        	newLeafNode(otherlv_19, grammarAccess.getRequirementAccess().getCommaKeyword_2_6_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2720:1: ( (lv_issue_20_0= ruleValueString ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2721:1: (lv_issue_20_0= ruleValueString )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2721:1: (lv_issue_20_0= ruleValueString )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2722:3: lv_issue_20_0= ruleValueString
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getIssueValueStringParserRuleCall_2_6_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleValueString_in_ruleRequirement6366);
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
            	case 8 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2745:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2745:4: ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2746:5: {...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2746:108: ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2747:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2750:6: ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2750:7: {...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2750:16: (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2751:2: otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    {
            	    otherlv_21=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6437); 

            	        	newLeafNode(otherlv_21, grammarAccess.getRequirementAccess().getSeeKeyword_2_7_0());
            	        
            	    otherlv_22=(Token)match(input,Goal,FOLLOW_Goal_in_ruleRequirement6449); 

            	        	newLeafNode(otherlv_22, grammarAccess.getRequirementAccess().getGoalKeyword_2_7_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2760:1: ( (otherlv_23= RULE_ID ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2761:1: (otherlv_23= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2761:1: (otherlv_23= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2762:3: otherlv_23= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	    otherlv_23=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement6468); 

            	    		newLeafNode(otherlv_23, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_2_0()); 
            	    	

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2773:2: (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )*
            	    loop43:
            	    do {
            	        int alt43=2;
            	        int LA43_0 = input.LA(1);

            	        if ( (LA43_0==Comma) ) {
            	            alt43=1;
            	        }


            	        switch (alt43) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2774:2: otherlv_24= Comma ( (otherlv_25= RULE_ID ) )
            	    	    {
            	    	    otherlv_24=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6482); 

            	    	        	newLeafNode(otherlv_24, grammarAccess.getRequirementAccess().getCommaKeyword_2_7_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2778:1: ( (otherlv_25= RULE_ID ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2779:1: (otherlv_25= RULE_ID )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2779:1: (otherlv_25= RULE_ID )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2780:3: otherlv_25= RULE_ID
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	    otherlv_25=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleRequirement6501); 

            	    	    		newLeafNode(otherlv_25, grammarAccess.getRequirementAccess().getGoalReferenceGoalCrossReference_2_7_3_1_0()); 
            	    	    	

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
            	case 9 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2798:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2798:4: ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2799:5: {...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2799:108: ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2800:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2803:6: ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2803:7: {...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2803:16: (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2804:2: otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    {
            	    otherlv_26=(Token)match(input,See,FOLLOW_See_in_ruleRequirement6572); 

            	        	newLeafNode(otherlv_26, grammarAccess.getRequirementAccess().getSeeKeyword_2_8_0());
            	        
            	    otherlv_27=(Token)match(input,Hazard,FOLLOW_Hazard_in_ruleRequirement6584); 

            	        	newLeafNode(otherlv_27, grammarAccess.getRequirementAccess().getHazardKeyword_2_8_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2813:1: ( (lv_hazardReference_28_0= ruleQNEREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2814:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2814:1: (lv_hazardReference_28_0= ruleQNEREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2815:3: lv_hazardReference_28_0= ruleQNEREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement6604);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2831:2: (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )*
            	    loop44:
            	    do {
            	        int alt44=2;
            	        int LA44_0 = input.LA(1);

            	        if ( (LA44_0==Comma) ) {
            	            alt44=1;
            	        }


            	        switch (alt44) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2832:2: otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    {
            	    	    otherlv_29=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6618); 

            	    	        	newLeafNode(otherlv_29, grammarAccess.getRequirementAccess().getCommaKeyword_2_8_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2836:1: ( (lv_hazardReference_30_0= ruleQNEREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2837:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2837:1: (lv_hazardReference_30_0= ruleQNEREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2838:3: lv_hazardReference_30_0= ruleQNEREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getHazardReferenceQNEREFParserRuleCall_2_8_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQNEREF_in_ruleRequirement6638);
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
            	case 10 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2861:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2861:4: ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2862:5: {...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2862:108: ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2863:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2866:6: ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2866:7: {...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2866:16: (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2867:2: otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_31=(Token)match(input,Refines,FOLLOW_Refines_in_ruleRequirement6709); 

            	        	newLeafNode(otherlv_31, grammarAccess.getRequirementAccess().getRefinesKeyword_2_9_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2871:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2872:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2872:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2873:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6731);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2886:2: (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop45:
            	    do {
            	        int alt45=2;
            	        int LA45_0 = input.LA(1);

            	        if ( (LA45_0==Comma) ) {
            	            alt45=1;
            	        }


            	        switch (alt45) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2887:2: otherlv_33= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_33=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6745); 

            	    	        	newLeafNode(otherlv_33, grammarAccess.getRequirementAccess().getCommaKeyword_2_9_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2891:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2892:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2892:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2893:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getRefinesReferenceRequirementCrossReference_2_9_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6767);
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
            	case 11 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2913:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2913:4: ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2914:5: {...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2914:109: ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2915:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2918:6: ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2918:7: {...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2918:16: (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2919:2: otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_35=(Token)match(input,Decomposes,FOLLOW_Decomposes_in_ruleRequirement6838); 

            	        	newLeafNode(otherlv_35, grammarAccess.getRequirementAccess().getDecomposesKeyword_2_10_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2923:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2924:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2924:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2925:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6860);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2938:2: (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop46:
            	    do {
            	        int alt46=2;
            	        int LA46_0 = input.LA(1);

            	        if ( (LA46_0==Comma) ) {
            	            alt46=1;
            	        }


            	        switch (alt46) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2939:2: otherlv_37= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_37=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement6874); 

            	    	        	newLeafNode(otherlv_37, grammarAccess.getRequirementAccess().getCommaKeyword_2_10_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2943:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2944:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2944:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2945:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDecomposesReferenceRequirementCrossReference_2_10_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6896);
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
            	case 12 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2965:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2965:4: ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2966:5: {...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2966:109: ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2967:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2970:6: ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2970:7: {...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2970:16: (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2971:2: otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_39=(Token)match(input,Evolves,FOLLOW_Evolves_in_ruleRequirement6967); 

            	        	newLeafNode(otherlv_39, grammarAccess.getRequirementAccess().getEvolvesKeyword_2_11_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2975:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2976:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2976:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2977:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement6989);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2990:2: (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop47:
            	    do {
            	        int alt47=2;
            	        int LA47_0 = input.LA(1);

            	        if ( (LA47_0==Comma) ) {
            	            alt47=1;
            	        }


            	        switch (alt47) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2991:2: otherlv_41= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_41=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7003); 

            	    	        	newLeafNode(otherlv_41, grammarAccess.getRequirementAccess().getCommaKeyword_2_11_2_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2995:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2996:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2996:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:2997:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getEvolvesReferenceRequirementCrossReference_2_11_2_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7025);
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
            	case 13 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3017:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3017:4: ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3018:5: {...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3018:109: ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3019:6: ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3022:6: ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3022:7: {...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3022:16: (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3023:2: otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_43=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7096); 

            	        	newLeafNode(otherlv_43, grammarAccess.getRequirementAccess().getSeeKeyword_2_12_0());
            	        
            	    otherlv_44=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleRequirement7108); 

            	        	newLeafNode(otherlv_44, grammarAccess.getRequirementAccess().getStakeholderKeyword_2_12_1());
            	        
            	    otherlv_45=(Token)match(input,Req,FOLLOW_Req_in_ruleRequirement7120); 

            	        	newLeafNode(otherlv_45, grammarAccess.getRequirementAccess().getReqKeyword_2_12_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3037:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3038:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3038:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3039:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7142);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3052:2: (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop48:
            	    do {
            	        int alt48=2;
            	        int LA48_0 = input.LA(1);

            	        if ( (LA48_0==Comma) ) {
            	            alt48=1;
            	        }


            	        switch (alt48) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3053:2: otherlv_47= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_47=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7156); 

            	    	        	newLeafNode(otherlv_47, grammarAccess.getRequirementAccess().getCommaKeyword_2_12_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3057:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3058:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3058:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3059:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getStakeholderRequirementReferenceGoalCrossReference_2_12_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7178);
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
            	case 14 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3079:4: ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3079:4: ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3080:5: {...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3080:109: ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3081:6: ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3084:6: ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3084:7: {...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3084:16: (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3085:2: otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )*
            	    {
            	    otherlv_49=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7249); 

            	        	newLeafNode(otherlv_49, grammarAccess.getRequirementAccess().getSeeKeyword_2_13_0());
            	        
            	    otherlv_50=(Token)match(input,System,FOLLOW_System_in_ruleRequirement7261); 

            	        	newLeafNode(otherlv_50, grammarAccess.getRequirementAccess().getSystemKeyword_2_13_1());
            	        
            	    otherlv_51=(Token)match(input,Req,FOLLOW_Req_in_ruleRequirement7273); 

            	        	newLeafNode(otherlv_51, grammarAccess.getRequirementAccess().getReqKeyword_2_13_2());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3099:1: ( ( ruleDOTTEDREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3100:1: ( ruleDOTTEDREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3100:1: ( ruleDOTTEDREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3101:3: ruleDOTTEDREF
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	        }
            	            
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7295);
            	    ruleDOTTEDREF();

            	    state._fsp--;

            	     
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3114:2: (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )*
            	    loop49:
            	    do {
            	        int alt49=2;
            	        int LA49_0 = input.LA(1);

            	        if ( (LA49_0==Comma) ) {
            	            alt49=1;
            	        }


            	        switch (alt49) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3115:2: otherlv_53= Comma ( ( ruleDOTTEDREF ) )
            	    	    {
            	    	    otherlv_53=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7309); 

            	    	        	newLeafNode(otherlv_53, grammarAccess.getRequirementAccess().getCommaKeyword_2_13_4_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3119:1: ( ( ruleDOTTEDREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3120:1: ( ruleDOTTEDREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3120:1: ( ruleDOTTEDREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3121:3: ruleDOTTEDREF
            	    	    {

            	    	    			if (current==null) {
            	    	    	            current = createModelElement(grammarAccess.getRequirementRule());
            	    	    	        }
            	    	            
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getSystemRequirementReferenceContractualElementCrossReference_2_13_4_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleRequirement7331);
            	    	    ruleDOTTEDREF();

            	    	    state._fsp--;

            	    	     
            	    	    	        afterParserOrEnumRuleCall();
            	    	    	    

            	    	    }


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
            	case 15 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3141:4: ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3141:4: ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3142:5: {...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3142:109: ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3143:6: ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3146:6: ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3146:7: {...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3146:16: (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3147:2: otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )*
            	    {
            	    otherlv_55=(Token)match(input,Verified,FOLLOW_Verified_in_ruleRequirement7402); 

            	        	newLeafNode(otherlv_55, grammarAccess.getRequirementAccess().getVerifiedKeyword_2_14_0());
            	        
            	    otherlv_56=(Token)match(input,By,FOLLOW_By_in_ruleRequirement7414); 

            	        	newLeafNode(otherlv_56, grammarAccess.getRequirementAccess().getByKeyword_2_14_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3156:1: ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )*
            	    loop50:
            	    do {
            	        int alt50=2;
            	        int LA50_0 = input.LA(1);

            	        if ( (LA50_0==RULE_ID) ) {
            	            alt50=1;
            	        }


            	        switch (alt50) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3157:1: (lv_verifiedBy_57_0= ruleVerificationDecomposition )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3157:1: (lv_verifiedBy_57_0= ruleVerificationDecomposition )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3158:3: lv_verifiedBy_57_0= ruleVerificationDecomposition
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getVerifiedByVerificationDecompositionParserRuleCall_2_14_2_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleRequirement7434);
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
            	case 16 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3181:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3181:4: ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3182:5: {...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3182:109: ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3183:6: ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3186:6: ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3186:7: {...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3186:16: (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3187:2: otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )*
            	    {
            	    otherlv_58=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7504); 

            	        	newLeafNode(otherlv_58, grammarAccess.getRequirementAccess().getSeeKeyword_2_15_0());
            	        
            	    otherlv_59=(Token)match(input,Document,FOLLOW_Document_in_ruleRequirement7516); 

            	        	newLeafNode(otherlv_59, grammarAccess.getRequirementAccess().getDocumentKeyword_2_15_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3196:1: ( (lv_docReference_60_0= ruleXDocUri ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3197:1: (lv_docReference_60_0= ruleXDocUri )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3197:1: (lv_docReference_60_0= ruleXDocUri )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3198:3: lv_docReference_60_0= ruleXDocUri
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_15_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement7536);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3214:2: (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )*
            	    loop51:
            	    do {
            	        int alt51=2;
            	        int LA51_0 = input.LA(1);

            	        if ( (LA51_0==Comma) ) {
            	            alt51=1;
            	        }


            	        switch (alt51) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3215:2: otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) )
            	    	    {
            	    	    otherlv_61=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7550); 

            	    	        	newLeafNode(otherlv_61, grammarAccess.getRequirementAccess().getCommaKeyword_2_15_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3219:1: ( (lv_docReference_62_0= ruleXDocUri ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3220:1: (lv_docReference_62_0= ruleXDocUri )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3220:1: (lv_docReference_62_0= ruleXDocUri )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3221:3: lv_docReference_62_0= ruleXDocUri
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getDocReferenceXDocUriParserRuleCall_2_15_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleXDocUri_in_ruleRequirement7570);
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
            	case 17 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3244:4: ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3244:4: ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3245:5: {...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3245:109: ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3246:6: ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3249:6: ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3249:7: {...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleRequirement", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3249:16: (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3250:2: otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )*
            	    {
            	    otherlv_63=(Token)match(input,See,FOLLOW_See_in_ruleRequirement7641); 

            	        	newLeafNode(otherlv_63, grammarAccess.getRequirementAccess().getSeeKeyword_2_16_0());
            	        
            	    otherlv_64=(Token)match(input,Colon,FOLLOW_Colon_in_ruleRequirement7653); 

            	        	newLeafNode(otherlv_64, grammarAccess.getRequirementAccess().getColonKeyword_2_16_1());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3259:1: ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3260:1: (lv_modelReference_65_0= ruleQDOTTEDPAREF )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3260:1: (lv_modelReference_65_0= ruleQDOTTEDPAREF )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3261:3: lv_modelReference_65_0= ruleQDOTTEDPAREF
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRequirementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7673);
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

            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3277:2: (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )*
            	    loop52:
            	    do {
            	        int alt52=2;
            	        int LA52_0 = input.LA(1);

            	        if ( (LA52_0==Comma) ) {
            	            alt52=1;
            	        }


            	        switch (alt52) {
            	    	case 1 :
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3278:2: otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) )
            	    	    {
            	    	    otherlv_66=(Token)match(input,Comma,FOLLOW_Comma_in_ruleRequirement7687); 

            	    	        	newLeafNode(otherlv_66, grammarAccess.getRequirementAccess().getCommaKeyword_2_16_3_0());
            	    	        
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3282:1: ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3283:1: (lv_modelReference_67_0= ruleQDOTTEDPAREF )
            	    	    {
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3283:1: (lv_modelReference_67_0= ruleQDOTTEDPAREF )
            	    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3284:3: lv_modelReference_67_0= ruleQDOTTEDPAREF
            	    	    {
            	    	     
            	    	    	        newCompositeNode(grammarAccess.getRequirementAccess().getModelReferenceQDOTTEDPAREFParserRuleCall_2_16_3_1_0()); 
            	    	    	    
            	    	    pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7707);
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
            	    	    break loop52;
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
            	    break loop53;
                }
            } while (true);


            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getRequirementAccess().getUnorderedGroup_2());
            	

            }

            otherlv_68=(Token)match(input,End,FOLLOW_End_in_ruleRequirement7763); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3327:1: entryRuleExternalDocument returns [EObject current=null] : iv_ruleExternalDocument= ruleExternalDocument EOF ;
    public final EObject entryRuleExternalDocument() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleExternalDocument = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3328:2: (iv_ruleExternalDocument= ruleExternalDocument EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3329:2: iv_ruleExternalDocument= ruleExternalDocument EOF
            {
             newCompositeNode(grammarAccess.getExternalDocumentRule()); 
            pushFollow(FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument7797);
            iv_ruleExternalDocument=ruleExternalDocument();

            state._fsp--;

             current =iv_ruleExternalDocument; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleExternalDocument7807); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3336:1: ruleExternalDocument returns [EObject current=null] : (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) ;
    public final EObject ruleExternalDocument() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_externalReference_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3339:28: ( (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3340:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3340:1: (otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3341:2: otherlv_0= Document ( (lv_name_1_0= RULE_ID ) ) otherlv_2= See ( (lv_externalReference_3_0= ruleDOCPATH ) ) otherlv_4= End
            {
            otherlv_0=(Token)match(input,Document,FOLLOW_Document_in_ruleExternalDocument7845); 

                	newLeafNode(otherlv_0, grammarAccess.getExternalDocumentAccess().getDocumentKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3345:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3346:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3346:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3347:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleExternalDocument7861); 

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

            otherlv_2=(Token)match(input,See,FOLLOW_See_in_ruleExternalDocument7879); 

                	newLeafNode(otherlv_2, grammarAccess.getExternalDocumentAccess().getSeeKeyword_2());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3368:1: ( (lv_externalReference_3_0= ruleDOCPATH ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3369:1: (lv_externalReference_3_0= ruleDOCPATH )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3369:1: (lv_externalReference_3_0= ruleDOCPATH )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3370:3: lv_externalReference_3_0= ruleDOCPATH
            {
             
            	        newCompositeNode(grammarAccess.getExternalDocumentAccess().getExternalReferenceDOCPATHParserRuleCall_3_0()); 
            	    
            pushFollow(FOLLOW_ruleDOCPATH_in_ruleExternalDocument7899);
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

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleExternalDocument7912); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3399:1: entryRuleXDocUri returns [EObject current=null] : iv_ruleXDocUri= ruleXDocUri EOF ;
    public final EObject entryRuleXDocUri() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleXDocUri = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3400:2: (iv_ruleXDocUri= ruleXDocUri EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3401:2: iv_ruleXDocUri= ruleXDocUri EOF
            {
             newCompositeNode(grammarAccess.getXDocUriRule()); 
            pushFollow(FOLLOW_ruleXDocUri_in_entryRuleXDocUri7946);
            iv_ruleXDocUri=ruleXDocUri();

            state._fsp--;

             current =iv_ruleXDocUri; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleXDocUri7956); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3408:1: ruleXDocUri returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) ;
    public final EObject ruleXDocUri() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_docFragment_2_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3411:28: ( ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3412:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3412:1: ( ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3412:2: ( ( ruleDOTTEDREF ) ) (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3412:2: ( ( ruleDOTTEDREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3413:1: ( ruleDOTTEDREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3413:1: ( ruleDOTTEDREF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3414:3: ruleDOTTEDREF
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getXDocUriRule());
            	        }
                    
             
            	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocReferenceExternalDocumentCrossReference_0_0()); 
            	    
            pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleXDocUri8004);
            ruleDOTTEDREF();

            state._fsp--;

             
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3427:2: (otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) ) )?
            int alt54=2;
            int LA54_0 = input.LA(1);

            if ( (LA54_0==NumberSign) ) {
                alt54=1;
            }
            switch (alt54) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3428:2: otherlv_1= NumberSign ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    {
                    otherlv_1=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_ruleXDocUri8018); 

                        	newLeafNode(otherlv_1, grammarAccess.getXDocUriAccess().getNumberSignKeyword_1_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3432:1: ( (lv_docFragment_2_0= ruleDOCFRAGMENT ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3433:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3433:1: (lv_docFragment_2_0= ruleDOCFRAGMENT )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3434:3: lv_docFragment_2_0= ruleDOCFRAGMENT
                    {
                     
                    	        newCompositeNode(grammarAccess.getXDocUriAccess().getDocFragmentDOCFRAGMENTParserRuleCall_1_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri8038);
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3458:1: entryRuleCategory returns [EObject current=null] : iv_ruleCategory= ruleCategory EOF ;
    public final EObject entryRuleCategory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategory = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3459:2: (iv_ruleCategory= ruleCategory EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3460:2: iv_ruleCategory= ruleCategory EOF
            {
             newCompositeNode(grammarAccess.getCategoryRule()); 
            pushFollow(FOLLOW_ruleCategory_in_entryRuleCategory8075);
            iv_ruleCategory=ruleCategory();

            state._fsp--;

             current =iv_ruleCategory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleCategory8085); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3467:1: ruleCategory returns [EObject current=null] : (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End ) ;
    public final EObject ruleCategory() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3470:28: ( (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3471:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3471:1: (otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3472:2: otherlv_0= Category ( (lv_name_1_0= RULE_ID ) ) (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )? otherlv_4= End
            {
            otherlv_0=(Token)match(input,Category,FOLLOW_Category_in_ruleCategory8123); 

                	newLeafNode(otherlv_0, grammarAccess.getCategoryAccess().getCategoryKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3476:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3477:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3477:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3478:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleCategory8139); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3494:2: (otherlv_2= Extends ( ( ruleDOTTEDREF ) ) )?
            int alt55=2;
            int LA55_0 = input.LA(1);

            if ( (LA55_0==Extends) ) {
                alt55=1;
            }
            switch (alt55) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3495:2: otherlv_2= Extends ( ( ruleDOTTEDREF ) )
                    {
                    otherlv_2=(Token)match(input,Extends,FOLLOW_Extends_in_ruleCategory8158); 

                        	newLeafNode(otherlv_2, grammarAccess.getCategoryAccess().getExtendsKeyword_2_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3499:1: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3500:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3500:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3501:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCategoryRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCategoryAccess().getExtendsCategoryCrossReference_2_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleCategory8180);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_4=(Token)match(input,End,FOLLOW_End_in_ruleCategory8195); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3527:1: entryRuleValueString returns [String current=null] : iv_ruleValueString= ruleValueString EOF ;
    public final String entryRuleValueString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValueString = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3528:1: (iv_ruleValueString= ruleValueString EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3529:2: iv_ruleValueString= ruleValueString EOF
            {
             newCompositeNode(grammarAccess.getValueStringRule()); 
            pushFollow(FOLLOW_ruleValueString_in_entryRuleValueString8230);
            iv_ruleValueString=ruleValueString();

            state._fsp--;

             current =iv_ruleValueString.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleValueString8241); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3536:1: ruleValueString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : this_STRING_0= RULE_STRING ;
    public final AntlrDatatypeRuleToken ruleValueString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3540:6: (this_STRING_0= RULE_STRING )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3541:5: this_STRING_0= RULE_STRING
            {
            this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleValueString8280); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3556:1: entryRuleStakeholder returns [EObject current=null] : iv_ruleStakeholder= ruleStakeholder EOF ;
    public final EObject entryRuleStakeholder() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStakeholder = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3557:2: (iv_ruleStakeholder= ruleStakeholder EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3558:2: iv_ruleStakeholder= ruleStakeholder EOF
            {
             newCompositeNode(grammarAccess.getStakeholderRule()); 
            pushFollow(FOLLOW_ruleStakeholder_in_entryRuleStakeholder8323);
            iv_ruleStakeholder=ruleStakeholder();

            state._fsp--;

             current =iv_ruleStakeholder; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStakeholder8333); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3565:1: ruleStakeholder returns [EObject current=null] : (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3568:28: ( (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3569:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3569:1: (otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3570:2: otherlv_0= Stakeholder ( (lv_name_1_0= RULE_ID ) ) ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) ) otherlv_15= End
            {
            otherlv_0=(Token)match(input,Stakeholder,FOLLOW_Stakeholder_in_ruleStakeholder8371); 

                	newLeafNode(otherlv_0, grammarAccess.getStakeholderAccess().getStakeholderKeyword_0());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3574:1: ( (lv_name_1_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3575:1: (lv_name_1_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3575:1: (lv_name_1_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3576:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleStakeholder8387); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3592:2: ( ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3594:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3594:1: ( ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3595:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3598:2: ( ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?)
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3599:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+ {...}?
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3599:3: ( ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) ) )+
            int cnt56=0;
            loop56:
            do {
                int alt56=7;
                int LA56_0 = input.LA(1);

                if ( LA56_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0) ) {
                    alt56=1;
                }
                else if ( LA56_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1) ) {
                    alt56=2;
                }
                else if ( LA56_0 ==Role && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2) ) {
                    alt56=3;
                }
                else if ( LA56_0 ==Oranization && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
                    alt56=4;
                }
                else if ( LA56_0 ==Email && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
                    alt56=5;
                }
                else if ( LA56_0 ==Phone && getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5) ) {
                    alt56=6;
                }


                switch (alt56) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3601:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3601:4: ({...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3602:5: {...}? => ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3602:108: ( ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3603:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 0);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3606:6: ({...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3606:7: {...}? => (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3606:16: (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3607:2: otherlv_3= Title ( (lv_title_4_0= ruleValueString ) )
            	    {
            	    otherlv_3=(Token)match(input,Title,FOLLOW_Title_in_ruleStakeholder8451); 

            	        	newLeafNode(otherlv_3, grammarAccess.getStakeholderAccess().getTitleKeyword_2_0_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3611:1: ( (lv_title_4_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3612:1: (lv_title_4_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3612:1: (lv_title_4_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3613:3: lv_title_4_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getTitleValueStringParserRuleCall_2_0_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8471);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3636:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3636:4: ({...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3637:5: {...}? => ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3637:108: ( ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3638:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 1);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3641:6: ({...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3641:7: {...}? => (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3641:16: (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3642:2: otherlv_5= Description ( (lv_description_6_0= ruleValueString ) )
            	    {
            	    otherlv_5=(Token)match(input,Description,FOLLOW_Description_in_ruleStakeholder8540); 

            	        	newLeafNode(otherlv_5, grammarAccess.getStakeholderAccess().getDescriptionKeyword_2_1_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3646:1: ( (lv_description_6_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3647:1: (lv_description_6_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3647:1: (lv_description_6_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3648:3: lv_description_6_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getDescriptionValueStringParserRuleCall_2_1_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8560);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3671:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3671:4: ({...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3672:5: {...}? => ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3672:108: ( ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3673:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 2);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3676:6: ({...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3676:7: {...}? => (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3676:16: (otherlv_7= Role ( (lv_role_8_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3677:2: otherlv_7= Role ( (lv_role_8_0= ruleValueString ) )
            	    {
            	    otherlv_7=(Token)match(input,Role,FOLLOW_Role_in_ruleStakeholder8629); 

            	        	newLeafNode(otherlv_7, grammarAccess.getStakeholderAccess().getRoleKeyword_2_2_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3681:1: ( (lv_role_8_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3682:1: (lv_role_8_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3682:1: (lv_role_8_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3683:3: lv_role_8_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getRoleValueStringParserRuleCall_2_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8649);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3706:4: ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3706:4: ({...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3707:5: {...}? => ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3707:108: ( ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3708:6: ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 3);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3711:6: ({...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3711:7: {...}? => (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3711:16: (otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3712:2: otherlv_9= Oranization ( (lv_organziation_10_0= ruleValueString ) )
            	    {
            	    otherlv_9=(Token)match(input,Oranization,FOLLOW_Oranization_in_ruleStakeholder8718); 

            	        	newLeafNode(otherlv_9, grammarAccess.getStakeholderAccess().getOranizationKeyword_2_3_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3716:1: ( (lv_organziation_10_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3717:1: (lv_organziation_10_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3717:1: (lv_organziation_10_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3718:3: lv_organziation_10_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getOrganziationValueStringParserRuleCall_2_3_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8738);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3741:4: ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3741:4: ({...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3742:5: {...}? => ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3742:108: ( ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3743:6: ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 4);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3746:6: ({...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3746:7: {...}? => (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3746:16: (otherlv_11= Email ( (lv_email_12_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3747:2: otherlv_11= Email ( (lv_email_12_0= ruleValueString ) )
            	    {
            	    otherlv_11=(Token)match(input,Email,FOLLOW_Email_in_ruleStakeholder8807); 

            	        	newLeafNode(otherlv_11, grammarAccess.getStakeholderAccess().getEmailKeyword_2_4_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3751:1: ( (lv_email_12_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3752:1: (lv_email_12_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3752:1: (lv_email_12_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3753:3: lv_email_12_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getEmailValueStringParserRuleCall_2_4_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8827);
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
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3776:4: ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3776:4: ({...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3777:5: {...}? => ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canSelect(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5)");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3777:108: ( ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3778:6: ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getStakeholderAccess().getUnorderedGroup_2(), 5);
            	    	 				
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3781:6: ({...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3781:7: {...}? => (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleStakeholder", "true");
            	    }
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3781:16: (otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3782:2: otherlv_13= Phone ( (lv_phone_14_0= ruleValueString ) )
            	    {
            	    otherlv_13=(Token)match(input,Phone,FOLLOW_Phone_in_ruleStakeholder8896); 

            	        	newLeafNode(otherlv_13, grammarAccess.getStakeholderAccess().getPhoneKeyword_2_5_0());
            	        
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3786:1: ( (lv_phone_14_0= ruleValueString ) )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3787:1: (lv_phone_14_0= ruleValueString )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3787:1: (lv_phone_14_0= ruleValueString )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3788:3: lv_phone_14_0= ruleValueString
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getStakeholderAccess().getPhoneValueStringParserRuleCall_2_5_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleValueString_in_ruleStakeholder8916);
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
            	    if ( cnt56 >= 1 ) break loop56;
                        EarlyExitException eee =
                            new EarlyExitException(56, input);
                        throw eee;
                }
                cnt56++;
            } while (true);

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2()) ) {
                throw new FailedPredicateException(input, "ruleStakeholder", "getUnorderedGroupHelper().canLeave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getStakeholderAccess().getUnorderedGroup_2());
            	

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleStakeholder8976); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3832:1: entryRuleVerificationDecomposition returns [EObject current=null] : iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF ;
    public final EObject entryRuleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationDecomposition = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3833:2: (iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3834:2: iv_ruleVerificationDecomposition= ruleVerificationDecomposition EOF
            {
             newCompositeNode(grammarAccess.getVerificationDecompositionRule()); 
            pushFollow(FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition9010);
            iv_ruleVerificationDecomposition=ruleVerificationDecomposition();

            state._fsp--;

             current =iv_ruleVerificationDecomposition; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationDecomposition9020); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3841:1: ruleVerificationDecomposition returns [EObject current=null] : ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) ;
    public final EObject ruleVerificationDecomposition() throws RecognitionException {
        EObject current = null;

        Token lv_type_2_1=null;
        Token lv_type_2_2=null;
        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3844:28: ( ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3845:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3845:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )
            int alt58=2;
            alt58 = dfa58.predict(input);
            switch (alt58) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3845:2: ( ( ruleDOTTEDREF ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3845:2: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3846:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3846:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3847:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getElementVerificationActivityCrossReference_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition9068);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3861:6: ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3861:6: ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3861:7: ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3861:7: ( ( ruleDOTTEDREF ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3862:1: ( ruleDOTTEDREF )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3862:1: ( ruleDOTTEDREF )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3863:3: ruleDOTTEDREF
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getLeftVerificationActivityCrossReference_1_0_0()); 
                    	    
                    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition9098);
                    ruleDOTTEDREF();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3876:2: ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3877:1: ( (lv_type_2_1= And | lv_type_2_2= Or ) )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3877:1: ( (lv_type_2_1= And | lv_type_2_2= Or ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3878:1: (lv_type_2_1= And | lv_type_2_2= Or )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3878:1: (lv_type_2_1= And | lv_type_2_2= Or )
                    int alt57=2;
                    int LA57_0 = input.LA(1);

                    if ( (LA57_0==And) ) {
                        alt57=1;
                    }
                    else if ( (LA57_0==Or) ) {
                        alt57=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 57, 0, input);

                        throw nvae;
                    }
                    switch (alt57) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3879:3: lv_type_2_1= And
                            {
                            lv_type_2_1=(Token)match(input,And,FOLLOW_And_in_ruleVerificationDecomposition9119); 

                                    newLeafNode(lv_type_2_1, grammarAccess.getVerificationDecompositionAccess().getTypeAndKeyword_1_1_0_0());
                                

                            	        if (current==null) {
                            	            current = createModelElement(grammarAccess.getVerificationDecompositionRule());
                            	        }
                                   		setWithLastConsumed(current, "type", lv_type_2_1, null);
                            	    

                            }
                            break;
                        case 2 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3892:8: lv_type_2_2= Or
                            {
                            lv_type_2_2=(Token)match(input,Or,FOLLOW_Or_in_ruleVerificationDecomposition9147); 

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

                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3908:2: ( (lv_right_3_0= ruleVerificationDecomposition ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3909:1: (lv_right_3_0= ruleVerificationDecomposition )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3909:1: (lv_right_3_0= ruleVerificationDecomposition )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3910:3: lv_right_3_0= ruleVerificationDecomposition
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationDecompositionAccess().getRightVerificationDecompositionParserRuleCall_1_2_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition9182);
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3934:1: entryRuleVerificationActivity returns [EObject current=null] : iv_ruleVerificationActivity= ruleVerificationActivity EOF ;
    public final EObject entryRuleVerificationActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationActivity = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3935:2: (iv_ruleVerificationActivity= ruleVerificationActivity EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3936:2: iv_ruleVerificationActivity= ruleVerificationActivity EOF
            {
             newCompositeNode(grammarAccess.getVerificationActivityRule()); 
            pushFollow(FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity9218);
            iv_ruleVerificationActivity=ruleVerificationActivity();

            state._fsp--;

             current =iv_ruleVerificationActivity; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationActivity9228); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3943:1: ruleVerificationActivity returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3946:28: ( (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3947:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3947:1: (otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3948:2: otherlv_0= Verification otherlv_1= Activity ( (lv_name_2_0= RULE_ID ) ) (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )? (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )? (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )? (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )? (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationActivity9266); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationActivityAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,Activity,FOLLOW_Activity_in_ruleVerificationActivity9278); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationActivityAccess().getActivityKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3957:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3958:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3958:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3959:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationActivity9294); 

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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3975:2: (otherlv_3= Title ( (lv_title_4_0= ruleValueString ) ) )?
            int alt59=2;
            int LA59_0 = input.LA(1);

            if ( (LA59_0==Title) ) {
                alt59=1;
            }
            switch (alt59) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3976:2: otherlv_3= Title ( (lv_title_4_0= ruleValueString ) )
                    {
                    otherlv_3=(Token)match(input,Title,FOLLOW_Title_in_ruleVerificationActivity9313); 

                        	newLeafNode(otherlv_3, grammarAccess.getVerificationActivityAccess().getTitleKeyword_3_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3980:1: ( (lv_title_4_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3981:1: (lv_title_4_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3981:1: (lv_title_4_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3982:3: lv_title_4_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getTitleValueStringParserRuleCall_3_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity9333);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3998:4: (otherlv_5= Description ( (lv_description_6_0= ruleValueString ) ) )?
            int alt60=2;
            int LA60_0 = input.LA(1);

            if ( (LA60_0==Description) ) {
                alt60=1;
            }
            switch (alt60) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:3999:2: otherlv_5= Description ( (lv_description_6_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,Description,FOLLOW_Description_in_ruleVerificationActivity9349); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationActivityAccess().getDescriptionKeyword_4_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4003:1: ( (lv_description_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4004:1: (lv_description_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4004:1: (lv_description_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4005:3: lv_description_6_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDescriptionValueStringParserRuleCall_4_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationActivity9369);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4021:4: (otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) ) )?
            int alt61=2;
            int LA61_0 = input.LA(1);

            if ( (LA61_0==Method) ) {
                alt61=1;
            }
            switch (alt61) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4022:2: otherlv_7= Method ( (lv_method_8_0= ruleVerificationMethod ) )
                    {
                    otherlv_7=(Token)match(input,Method,FOLLOW_Method_in_ruleVerificationActivity9385); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationActivityAccess().getMethodKeyword_5_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4026:1: ( (lv_method_8_0= ruleVerificationMethod ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4027:1: (lv_method_8_0= ruleVerificationMethod )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4027:1: (lv_method_8_0= ruleVerificationMethod )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4028:3: lv_method_8_0= ruleVerificationMethod
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getMethodVerificationMethodParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity9405);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4044:4: (otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )* )?
            int alt63=2;
            int LA63_0 = input.LA(1);

            if ( (LA63_0==Decomposed) ) {
                alt63=1;
            }
            switch (alt63) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4045:2: otherlv_9= Decomposed otherlv_10= To ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )*
                    {
                    otherlv_9=(Token)match(input,Decomposed,FOLLOW_Decomposed_in_ruleVerificationActivity9421); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationActivityAccess().getDecomposedKeyword_6_0());
                        
                    otherlv_10=(Token)match(input,To,FOLLOW_To_in_ruleVerificationActivity9433); 

                        	newLeafNode(otherlv_10, grammarAccess.getVerificationActivityAccess().getToKeyword_6_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4054:1: ( (lv_decomposedTo_11_0= ruleVerificationDecomposition ) )*
                    loop62:
                    do {
                        int alt62=2;
                        int LA62_0 = input.LA(1);

                        if ( (LA62_0==RULE_ID) ) {
                            alt62=1;
                        }


                        switch (alt62) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4055:1: (lv_decomposedTo_11_0= ruleVerificationDecomposition )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4055:1: (lv_decomposedTo_11_0= ruleVerificationDecomposition )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4056:3: lv_decomposedTo_11_0= ruleVerificationDecomposition
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getDecomposedToVerificationDecompositionParserRuleCall_6_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleVerificationDecomposition_in_ruleVerificationActivity9453);
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
                    	    break loop62;
                        }
                    } while (true);


                    }
                    break;

            }

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4072:5: (otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )* )?
            int alt65=2;
            int LA65_0 = input.LA(1);

            if ( (LA65_0==Assigned) ) {
                alt65=1;
            }
            switch (alt65) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4073:2: otherlv_12= Assigned otherlv_13= To ( ( ruleDOTTEDREF ) )*
                    {
                    otherlv_12=(Token)match(input,Assigned,FOLLOW_Assigned_in_ruleVerificationActivity9470); 

                        	newLeafNode(otherlv_12, grammarAccess.getVerificationActivityAccess().getAssignedKeyword_7_0());
                        
                    otherlv_13=(Token)match(input,To,FOLLOW_To_in_ruleVerificationActivity9482); 

                        	newLeafNode(otherlv_13, grammarAccess.getVerificationActivityAccess().getToKeyword_7_1());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4082:1: ( ( ruleDOTTEDREF ) )*
                    loop64:
                    do {
                        int alt64=2;
                        int LA64_0 = input.LA(1);

                        if ( (LA64_0==RULE_ID) ) {
                            alt64=1;
                        }


                        switch (alt64) {
                    	case 1 :
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4083:1: ( ruleDOTTEDREF )
                    	    {
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4083:1: ( ruleDOTTEDREF )
                    	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4084:3: ruleDOTTEDREF
                    	    {

                    	    			if (current==null) {
                    	    	            current = createModelElement(grammarAccess.getVerificationActivityRule());
                    	    	        }
                    	            
                    	     
                    	    	        newCompositeNode(grammarAccess.getVerificationActivityAccess().getAssignedToStakeholderCrossReference_7_2_0()); 
                    	    	    
                    	    pushFollow(FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9504);
                    	    ruleDOTTEDREF();

                    	    state._fsp--;

                    	     
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop64;
                        }
                    } while (true);


                    }
                    break;

            }

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleVerificationActivity9520); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4110:1: entryRuleVerificationMethod returns [String current=null] : iv_ruleVerificationMethod= ruleVerificationMethod EOF ;
    public final String entryRuleVerificationMethod() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleVerificationMethod = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4111:1: (iv_ruleVerificationMethod= ruleVerificationMethod EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4112:2: iv_ruleVerificationMethod= ruleVerificationMethod EOF
            {
             newCompositeNode(grammarAccess.getVerificationMethodRule()); 
            pushFollow(FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod9555);
            iv_ruleVerificationMethod=ruleVerificationMethod();

            state._fsp--;

             current =iv_ruleVerificationMethod.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationMethod9566); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4119:1: ruleVerificationMethod returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification ) ;
    public final AntlrDatatypeRuleToken ruleVerificationMethod() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4123:6: ( (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4124:1: (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4124:1: (kw= Manual | kw= Automatic | kw= Review | kw= Testing | kw= Analysis | kw= Verification )
            int alt66=6;
            switch ( input.LA(1) ) {
            case Manual:
                {
                alt66=1;
                }
                break;
            case Automatic:
                {
                alt66=2;
                }
                break;
            case Review:
                {
                alt66=3;
                }
                break;
            case Testing:
                {
                alt66=4;
                }
                break;
            case Analysis:
                {
                alt66=5;
                }
                break;
            case Verification:
                {
                alt66=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 66, 0, input);

                throw nvae;
            }

            switch (alt66) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4125:2: kw= Manual
                    {
                    kw=(Token)match(input,Manual,FOLLOW_Manual_in_ruleVerificationMethod9604); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getManualKeyword_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4132:2: kw= Automatic
                    {
                    kw=(Token)match(input,Automatic,FOLLOW_Automatic_in_ruleVerificationMethod9623); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getAutomaticKeyword_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4139:2: kw= Review
                    {
                    kw=(Token)match(input,Review,FOLLOW_Review_in_ruleVerificationMethod9642); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getReviewKeyword_2()); 
                        

                    }
                    break;
                case 4 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4146:2: kw= Testing
                    {
                    kw=(Token)match(input,Testing,FOLLOW_Testing_in_ruleVerificationMethod9661); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getTestingKeyword_3()); 
                        

                    }
                    break;
                case 5 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4153:2: kw= Analysis
                    {
                    kw=(Token)match(input,Analysis,FOLLOW_Analysis_in_ruleVerificationMethod9680); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getVerificationMethodAccess().getAnalysisKeyword_4()); 
                        

                    }
                    break;
                case 6 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4160:2: kw= Verification
                    {
                    kw=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationMethod9699); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4173:1: entryRuleVerificationResult returns [EObject current=null] : iv_ruleVerificationResult= ruleVerificationResult EOF ;
    public final EObject entryRuleVerificationResult() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVerificationResult = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4174:2: (iv_ruleVerificationResult= ruleVerificationResult EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4175:2: iv_ruleVerificationResult= ruleVerificationResult EOF
            {
             newCompositeNode(grammarAccess.getVerificationResultRule()); 
            pushFollow(FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult9738);
            iv_ruleVerificationResult=ruleVerificationResult();

            state._fsp--;

             current =iv_ruleVerificationResult; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVerificationResult9748); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4182:1: ruleVerificationResult returns [EObject current=null] : (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End ) ;
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
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4185:28: ( (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4186:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4186:1: (otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4187:2: otherlv_0= Verification otherlv_1= Result ( (lv_name_2_0= RULE_ID ) ) otherlv_3= Of ( (otherlv_4= RULE_ID ) )* (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )? (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )? (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )? (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )? (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )? otherlv_15= End
            {
            otherlv_0=(Token)match(input,Verification,FOLLOW_Verification_in_ruleVerificationResult9786); 

                	newLeafNode(otherlv_0, grammarAccess.getVerificationResultAccess().getVerificationKeyword_0());
                
            otherlv_1=(Token)match(input,Result,FOLLOW_Result_in_ruleVerificationResult9798); 

                	newLeafNode(otherlv_1, grammarAccess.getVerificationResultAccess().getResultKeyword_1());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4196:1: ( (lv_name_2_0= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4197:1: (lv_name_2_0= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4197:1: (lv_name_2_0= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4198:3: lv_name_2_0= RULE_ID
            {
            lv_name_2_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult9814); 

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

            otherlv_3=(Token)match(input,Of,FOLLOW_Of_in_ruleVerificationResult9832); 

                	newLeafNode(otherlv_3, grammarAccess.getVerificationResultAccess().getOfKeyword_3());
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4219:1: ( (otherlv_4= RULE_ID ) )*
            loop67:
            do {
                int alt67=2;
                int LA67_0 = input.LA(1);

                if ( (LA67_0==RULE_ID) ) {
                    alt67=1;
                }


                switch (alt67) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4220:1: (otherlv_4= RULE_ID )
            	    {
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4220:1: (otherlv_4= RULE_ID )
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4221:3: otherlv_4= RULE_ID
            	    {

            	    			if (current==null) {
            	    	            current = createModelElement(grammarAccess.getVerificationResultRule());
            	    	        }
            	            
            	    otherlv_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleVerificationResult9851); 

            	    		newLeafNode(otherlv_4, grammarAccess.getVerificationResultAccess().getReferencedVerificationMethodVerificationActivityCrossReference_4_0()); 
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop67;
                }
            } while (true);

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4232:3: (otherlv_5= Output ( (lv_title_6_0= ruleValueString ) ) )?
            int alt68=2;
            int LA68_0 = input.LA(1);

            if ( (LA68_0==Output) ) {
                alt68=1;
            }
            switch (alt68) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4233:2: otherlv_5= Output ( (lv_title_6_0= ruleValueString ) )
                    {
                    otherlv_5=(Token)match(input,Output,FOLLOW_Output_in_ruleVerificationResult9866); 

                        	newLeafNode(otherlv_5, grammarAccess.getVerificationResultAccess().getOutputKeyword_5_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4237:1: ( (lv_title_6_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4238:1: (lv_title_6_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4238:1: (lv_title_6_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4239:3: lv_title_6_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getTitleValueStringParserRuleCall_5_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9886);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4255:4: (otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) ) )?
            int alt69=2;
            int LA69_0 = input.LA(1);

            if ( (LA69_0==Logfile) ) {
                alt69=1;
            }
            switch (alt69) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4256:2: otherlv_7= Logfile ( (lv_description_8_0= ruleValueString ) )
                    {
                    otherlv_7=(Token)match(input,Logfile,FOLLOW_Logfile_in_ruleVerificationResult9902); 

                        	newLeafNode(otherlv_7, grammarAccess.getVerificationResultAccess().getLogfileKeyword_6_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4260:1: ( (lv_description_8_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4261:1: (lv_description_8_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4261:1: (lv_description_8_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4262:3: lv_description_8_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getDescriptionValueStringParserRuleCall_6_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9922);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4278:4: (otherlv_9= Date ( (lv_method_10_0= ruleValueString ) ) )?
            int alt70=2;
            int LA70_0 = input.LA(1);

            if ( (LA70_0==Date) ) {
                alt70=1;
            }
            switch (alt70) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4279:2: otherlv_9= Date ( (lv_method_10_0= ruleValueString ) )
                    {
                    otherlv_9=(Token)match(input,Date,FOLLOW_Date_in_ruleVerificationResult9938); 

                        	newLeafNode(otherlv_9, grammarAccess.getVerificationResultAccess().getDateKeyword_7_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4283:1: ( (lv_method_10_0= ruleValueString ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4284:1: (lv_method_10_0= ruleValueString )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4284:1: (lv_method_10_0= ruleValueString )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4285:3: lv_method_10_0= ruleValueString
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getMethodValueStringParserRuleCall_7_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleValueString_in_ruleVerificationResult9958);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4301:4: (otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) ) )?
            int alt71=2;
            int LA71_0 = input.LA(1);

            if ( (LA71_0==State) ) {
                alt71=1;
            }
            switch (alt71) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4302:2: otherlv_11= State ( (lv_state_12_0= ruleVerificationResultState ) )
                    {
                    otherlv_11=(Token)match(input,State,FOLLOW_State_in_ruleVerificationResult9974); 

                        	newLeafNode(otherlv_11, grammarAccess.getVerificationResultAccess().getStateKeyword_8_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4306:1: ( (lv_state_12_0= ruleVerificationResultState ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4307:1: (lv_state_12_0= ruleVerificationResultState )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4307:1: (lv_state_12_0= ruleVerificationResultState )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4308:3: lv_state_12_0= ruleVerificationResultState
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStateVerificationResultStateEnumRuleCall_8_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultState_in_ruleVerificationResult9994);
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

            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4324:4: (otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) ) )?
            int alt72=2;
            int LA72_0 = input.LA(1);

            if ( (LA72_0==Status) ) {
                alt72=1;
            }
            switch (alt72) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4325:2: otherlv_13= Status ( (lv_status_14_0= ruleVerificationResultStatus ) )
                    {
                    otherlv_13=(Token)match(input,Status,FOLLOW_Status_in_ruleVerificationResult10010); 

                        	newLeafNode(otherlv_13, grammarAccess.getVerificationResultAccess().getStatusKeyword_9_0());
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4329:1: ( (lv_status_14_0= ruleVerificationResultStatus ) )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4330:1: (lv_status_14_0= ruleVerificationResultStatus )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4330:1: (lv_status_14_0= ruleVerificationResultStatus )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4331:3: lv_status_14_0= ruleVerificationResultStatus
                    {
                     
                    	        newCompositeNode(grammarAccess.getVerificationResultAccess().getStatusVerificationResultStatusEnumRuleCall_9_1_0()); 
                    	    
                    pushFollow(FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult10030);
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

            otherlv_15=(Token)match(input,End,FOLLOW_End_in_ruleVerificationResult10045); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4360:1: entryRuleQPREF returns [String current=null] : iv_ruleQPREF= ruleQPREF EOF ;
    public final String entryRuleQPREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQPREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4361:1: (iv_ruleQPREF= ruleQPREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4362:2: iv_ruleQPREF= ruleQPREF EOF
            {
             newCompositeNode(grammarAccess.getQPREFRule()); 
            pushFollow(FOLLOW_ruleQPREF_in_entryRuleQPREF10080);
            iv_ruleQPREF=ruleQPREF();

            state._fsp--;

             current =iv_ruleQPREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQPREF10091); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4369:1: ruleQPREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQPREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4373:6: ( (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4374:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4374:1: (this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4374:6: this_ID_0= RULE_ID (kw= ColonColon this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF10131); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4381:1: (kw= ColonColon this_ID_2= RULE_ID )*
            loop73:
            do {
                int alt73=2;
                int LA73_0 = input.LA(1);

                if ( (LA73_0==ColonColon) ) {
                    alt73=1;
                }


                switch (alt73) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4382:2: kw= ColonColon this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQPREF10150); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQPREFAccess().getColonColonKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQPREF10165); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getQPREFAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop73;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4402:1: entryRuleQNEREF returns [String current=null] : iv_ruleQNEREF= ruleQNEREF EOF ;
    public final String entryRuleQNEREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQNEREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4403:1: (iv_ruleQNEREF= ruleQNEREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4404:2: iv_ruleQNEREF= ruleQNEREF EOF
            {
             newCompositeNode(grammarAccess.getQNEREFRule()); 
            pushFollow(FOLLOW_ruleQNEREF_in_entryRuleQNEREF10212);
            iv_ruleQNEREF=ruleQNEREF();

            state._fsp--;

             current =iv_ruleQNEREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQNEREF10223); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4411:1: ruleQNEREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleQNEREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4415:6: ( ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4416:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4416:1: ( (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4416:2: (this_ID_0= RULE_ID kw= ColonColon )* this_ID_2= RULE_ID (kw= FullStop this_ID_4= RULE_ID )*
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4416:2: (this_ID_0= RULE_ID kw= ColonColon )*
            loop74:
            do {
                int alt74=2;
                int LA74_0 = input.LA(1);

                if ( (LA74_0==RULE_ID) ) {
                    int LA74_1 = input.LA(2);

                    if ( (LA74_1==ColonColon) ) {
                        alt74=1;
                    }


                }


                switch (alt74) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4416:7: this_ID_0= RULE_ID kw= ColonColon
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF10264); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_ruleQNEREF10282); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNEREFAccess().getColonColonKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop74;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF10299); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4436:1: (kw= FullStop this_ID_4= RULE_ID )*
            loop75:
            do {
                int alt75=2;
                int LA75_0 = input.LA(1);

                if ( (LA75_0==FullStop) ) {
                    alt75=1;
                }


                switch (alt75) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4437:2: kw= FullStop this_ID_4= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleQNEREF10318); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getQNEREFAccess().getFullStopKeyword_2_0()); 
            	        
            	    this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleQNEREF10333); 

            	    		current.merge(this_ID_4);
            	        
            	     
            	        newLeafNode(this_ID_4, grammarAccess.getQNEREFAccess().getIDTerminalRuleCall_2_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop75;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4457:1: entryRuleQDOTTEDPAREF returns [String current=null] : iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF ;
    public final String entryRuleQDOTTEDPAREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleQDOTTEDPAREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4458:1: (iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4459:2: iv_ruleQDOTTEDPAREF= ruleQDOTTEDPAREF EOF
            {
             newCompositeNode(grammarAccess.getQDOTTEDPAREFRule()); 
            pushFollow(FOLLOW_ruleQDOTTEDPAREF_in_entryRuleQDOTTEDPAREF10380);
            iv_ruleQDOTTEDPAREF=ruleQDOTTEDPAREF();

            state._fsp--;

             current =iv_ruleQDOTTEDPAREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleQDOTTEDPAREF10391); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4466:1: ruleQDOTTEDPAREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF ) ;
    public final AntlrDatatypeRuleToken ruleQDOTTEDPAREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        AntlrDatatypeRuleToken this_QNEREF_0 = null;

        AntlrDatatypeRuleToken this_PAREF_1 = null;

        AntlrDatatypeRuleToken this_PAREF_2 = null;


         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4470:6: ( ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4471:1: ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4471:1: ( (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? ) | this_PAREF_2= rulePAREF )
            int alt77=2;
            int LA77_0 = input.LA(1);

            if ( (LA77_0==RULE_ID) ) {
                alt77=1;
            }
            else if ( (LA77_0==NumberSign) ) {
                alt77=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 77, 0, input);

                throw nvae;
            }
            switch (alt77) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4471:2: (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4471:2: (this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )? )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4472:5: this_QNEREF_0= ruleQNEREF (this_PAREF_1= rulePAREF )?
                    {
                     
                            newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getQNEREFParserRuleCall_0_0()); 
                        
                    pushFollow(FOLLOW_ruleQNEREF_in_ruleQDOTTEDPAREF10439);
                    this_QNEREF_0=ruleQNEREF();

                    state._fsp--;


                    		current.merge(this_QNEREF_0);
                        
                     
                            afterParserOrEnumRuleCall();
                        
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4482:1: (this_PAREF_1= rulePAREF )?
                    int alt76=2;
                    int LA76_0 = input.LA(1);

                    if ( (LA76_0==NumberSign) ) {
                        alt76=1;
                    }
                    switch (alt76) {
                        case 1 :
                            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4483:5: this_PAREF_1= rulePAREF
                            {
                             
                                    newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getPAREFParserRuleCall_0_1()); 
                                
                            pushFollow(FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10467);
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
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4495:5: this_PAREF_2= rulePAREF
                    {
                     
                            newCompositeNode(grammarAccess.getQDOTTEDPAREFAccess().getPAREFParserRuleCall_1()); 
                        
                    pushFollow(FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10503);
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4513:1: entryRuleDOTTEDREF returns [String current=null] : iv_ruleDOTTEDREF= ruleDOTTEDREF EOF ;
    public final String entryRuleDOTTEDREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOTTEDREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4514:1: (iv_ruleDOTTEDREF= ruleDOTTEDREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4515:2: iv_ruleDOTTEDREF= ruleDOTTEDREF EOF
            {
             newCompositeNode(grammarAccess.getDOTTEDREFRule()); 
            pushFollow(FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF10548);
            iv_ruleDOTTEDREF=ruleDOTTEDREF();

            state._fsp--;

             current =iv_ruleDOTTEDREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOTTEDREF10559); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4522:1: ruleDOTTEDREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOTTEDREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4526:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4527:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4527:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4527:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF10599); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4534:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop78:
            do {
                int alt78=2;
                int LA78_0 = input.LA(1);

                if ( (LA78_0==FullStop) ) {
                    alt78=1;
                }


                switch (alt78) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4535:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOTTEDREF10618); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOTTEDREFAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOTTEDREF10633); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getDOTTEDREFAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop78;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4555:1: entryRulePAREF returns [String current=null] : iv_rulePAREF= rulePAREF EOF ;
    public final String entryRulePAREF() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_rulePAREF = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4556:1: (iv_rulePAREF= rulePAREF EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4557:2: iv_rulePAREF= rulePAREF EOF
            {
             newCompositeNode(grammarAccess.getPAREFRule()); 
            pushFollow(FOLLOW_rulePAREF_in_entryRulePAREF10680);
            iv_rulePAREF=rulePAREF();

            state._fsp--;

             current =iv_rulePAREF.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRulePAREF10691); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4564:1: rulePAREF returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) ;
    public final AntlrDatatypeRuleToken rulePAREF() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_ID_1=null;
        Token this_ID_3=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4568:6: ( (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4569:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4569:1: (kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )? )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4570:2: kw= NumberSign this_ID_1= RULE_ID (kw= ColonColon this_ID_3= RULE_ID )?
            {
            kw=(Token)match(input,NumberSign,FOLLOW_NumberSign_in_rulePAREF10729); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getPAREFAccess().getNumberSignKeyword_0()); 
                
            this_ID_1=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF10744); 

            		current.merge(this_ID_1);
                
             
                newLeafNode(this_ID_1, grammarAccess.getPAREFAccess().getIDTerminalRuleCall_1()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4582:1: (kw= ColonColon this_ID_3= RULE_ID )?
            int alt79=2;
            int LA79_0 = input.LA(1);

            if ( (LA79_0==ColonColon) ) {
                alt79=1;
            }
            switch (alt79) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4583:2: kw= ColonColon this_ID_3= RULE_ID
                    {
                    kw=(Token)match(input,ColonColon,FOLLOW_ColonColon_in_rulePAREF10763); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getPAREFAccess().getColonColonKeyword_2_0()); 
                        
                    this_ID_3=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_rulePAREF10778); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4603:1: entryRuleDOCPATH returns [String current=null] : iv_ruleDOCPATH= ruleDOCPATH EOF ;
    public final String entryRuleDOCPATH() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCPATH = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4604:1: (iv_ruleDOCPATH= ruleDOCPATH EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4605:2: iv_ruleDOCPATH= ruleDOCPATH EOF
            {
             newCompositeNode(grammarAccess.getDOCPATHRule()); 
            pushFollow(FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH10825);
            iv_ruleDOCPATH=ruleDOCPATH();

            state._fsp--;

             current =iv_ruleDOCPATH.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCPATH10836); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4612:1: ruleDOCPATH returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleDOCPATH() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;
        Token this_ID_4=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4616:6: ( ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4617:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4617:1: ( (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4617:2: (this_ID_0= RULE_ID kw= Solidus )* this_ID_2= RULE_ID kw= FullStop this_ID_4= RULE_ID
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4617:2: (this_ID_0= RULE_ID kw= Solidus )*
            loop80:
            do {
                int alt80=2;
                int LA80_0 = input.LA(1);

                if ( (LA80_0==RULE_ID) ) {
                    int LA80_1 = input.LA(2);

                    if ( (LA80_1==Solidus) ) {
                        alt80=1;
                    }


                }


                switch (alt80) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4617:7: this_ID_0= RULE_ID kw= Solidus
            	    {
            	    this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10877); 

            	    		current.merge(this_ID_0);
            	        
            	     
            	        newLeafNode(this_ID_0, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_0_0()); 
            	        
            	    kw=(Token)match(input,Solidus,FOLLOW_Solidus_in_ruleDOCPATH10895); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOCPATHAccess().getSolidusKeyword_0_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop80;
                }
            } while (true);

            this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10912); 

            		current.merge(this_ID_2);
                
             
                newLeafNode(this_ID_2, grammarAccess.getDOCPATHAccess().getIDTerminalRuleCall_1()); 
                
            kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCPATH10930); 

                    current.merge(kw);
                    newLeafNode(kw, grammarAccess.getDOCPATHAccess().getFullStopKeyword_2()); 
                
            this_ID_4=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCPATH10945); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4658:1: entryRuleDOCFRAGMENT returns [String current=null] : iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF ;
    public final String entryRuleDOCFRAGMENT() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDOCFRAGMENT = null;


        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4659:1: (iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4660:2: iv_ruleDOCFRAGMENT= ruleDOCFRAGMENT EOF
            {
             newCompositeNode(grammarAccess.getDOCFRAGMENTRule()); 
            pushFollow(FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT10990);
            iv_ruleDOCFRAGMENT=ruleDOCFRAGMENT();

            state._fsp--;

             current =iv_ruleDOCFRAGMENT.getText(); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleDOCFRAGMENT11001); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4667:1: ruleDOCFRAGMENT returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) ;
    public final AntlrDatatypeRuleToken ruleDOCFRAGMENT() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_ID_0=null;
        Token kw=null;
        Token this_ID_2=null;

         enterRule(); 
            
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4671:6: ( (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4672:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4672:1: (this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )* )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4672:6: this_ID_0= RULE_ID (kw= FullStop this_ID_2= RULE_ID )*
            {
            this_ID_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT11041); 

            		current.merge(this_ID_0);
                
             
                newLeafNode(this_ID_0, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_0()); 
                
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4679:1: (kw= FullStop this_ID_2= RULE_ID )*
            loop81:
            do {
                int alt81=2;
                int LA81_0 = input.LA(1);

                if ( (LA81_0==FullStop) ) {
                    alt81=1;
                }


                switch (alt81) {
            	case 1 :
            	    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4680:2: kw= FullStop this_ID_2= RULE_ID
            	    {
            	    kw=(Token)match(input,FullStop,FOLLOW_FullStop_in_ruleDOCFRAGMENT11060); 

            	            current.merge(kw);
            	            newLeafNode(kw, grammarAccess.getDOCFRAGMENTAccess().getFullStopKeyword_1_0()); 
            	        
            	    this_ID_2=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleDOCFRAGMENT11075); 

            	    		current.merge(this_ID_2);
            	        
            	     
            	        newLeafNode(this_ID_2, grammarAccess.getDOCFRAGMENTAccess().getIDTerminalRuleCall_1_1()); 
            	        

            	    }
            	    break;

            	default :
            	    break loop81;
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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4700:1: ruleVerificationResultState returns [Enumerator current=null] : ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) ;
    public final Enumerator ruleVerificationResultState() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4702:28: ( ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4703:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4703:1: ( (enumLiteral_0= Scheduled ) | (enumLiteral_1= Completed ) | (enumLiteral_2= Inprogress ) )
            int alt82=3;
            switch ( input.LA(1) ) {
            case Scheduled:
                {
                alt82=1;
                }
                break;
            case Completed:
                {
                alt82=2;
                }
                break;
            case Inprogress:
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
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4703:2: (enumLiteral_0= Scheduled )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4703:2: (enumLiteral_0= Scheduled )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4703:7: enumLiteral_0= Scheduled
                    {
                    enumLiteral_0=(Token)match(input,Scheduled,FOLLOW_Scheduled_in_ruleVerificationResultState11139); 

                            current = grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStateAccess().getSCHEDULEDEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4709:6: (enumLiteral_1= Completed )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4709:6: (enumLiteral_1= Completed )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4709:11: enumLiteral_1= Completed
                    {
                    enumLiteral_1=(Token)match(input,Completed,FOLLOW_Completed_in_ruleVerificationResultState11161); 

                            current = grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStateAccess().getCOMPLETEDEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4715:6: (enumLiteral_2= Inprogress )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4715:6: (enumLiteral_2= Inprogress )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4715:11: enumLiteral_2= Inprogress
                    {
                    enumLiteral_2=(Token)match(input,Inprogress,FOLLOW_Inprogress_in_ruleVerificationResultState11183); 

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
    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4725:1: ruleVerificationResultStatus returns [Enumerator current=null] : ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) ) ;
    public final Enumerator ruleVerificationResultStatus() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4727:28: ( ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) ) )
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4728:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) )
            {
            // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4728:1: ( (enumLiteral_0= Pass ) | (enumLiteral_1= Fail ) | (enumLiteral_2= Unknown ) )
            int alt83=3;
            switch ( input.LA(1) ) {
            case Pass:
                {
                alt83=1;
                }
                break;
            case Fail:
                {
                alt83=2;
                }
                break;
            case Unknown:
                {
                alt83=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 83, 0, input);

                throw nvae;
            }

            switch (alt83) {
                case 1 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4728:2: (enumLiteral_0= Pass )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4728:2: (enumLiteral_0= Pass )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4728:7: enumLiteral_0= Pass
                    {
                    enumLiteral_0=(Token)match(input,Pass,FOLLOW_Pass_in_ruleVerificationResultStatus11233); 

                            current = grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getVerificationResultStatusAccess().getPASSEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4734:6: (enumLiteral_1= Fail )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4734:6: (enumLiteral_1= Fail )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4734:11: enumLiteral_1= Fail
                    {
                    enumLiteral_1=(Token)match(input,Fail,FOLLOW_Fail_in_ruleVerificationResultStatus11255); 

                            current = grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getVerificationResultStatusAccess().getFAILEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4740:6: (enumLiteral_2= Unknown )
                    {
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4740:6: (enumLiteral_2= Unknown )
                    // ../edu.cmu.sei.alisa/src-gen/edu/cmu/sei/alisa/parser/antlr/internal/InternalAlisaParser.g:4740:11: enumLiteral_2= Unknown
                    {
                    enumLiteral_2=(Token)match(input,Unknown,FOLLOW_Unknown_in_ruleVerificationResultStatus11277); 

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


    protected DFA28 dfa28 = new DFA28(this);
    protected DFA40 dfa40 = new DFA40(this);
    protected DFA53 dfa53 = new DFA53(this);
    protected DFA58 dfa58 = new DFA58(this);
    static final String DFA28_eotS =
        "\24\uffff";
    static final String DFA28_eofS =
        "\24\uffff";
    static final String DFA28_minS =
        "\1\6\16\uffff\1\11\4\uffff";
    static final String DFA28_maxS =
        "\1\71\16\uffff\1\104\4\uffff";
    static final String DFA28_acceptS =
        "\1\uffff\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\15\1\uffff\1\17\1\16\1\21\1\20";
    static final String DFA28_specialS =
        "\1\1\16\uffff\1\0\4\uffff}>";
    static final String[] DFA28_transitionS = {
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
            "\1\21\15\uffff\1\23\22\uffff\1\20\31\uffff\1\22",
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
            return "()* loopback of 695:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Section ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Refines ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_43= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_45= See otherlv_46= Stakeholder otherlv_47= Req ( ( ruleDOTTEDREF ) ) (otherlv_49= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_51= See otherlv_52= System otherlv_53= Req ( ( ruleDOTTEDREF ) ) (otherlv_55= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_57= See otherlv_58= Document ( (lv_docReference_59_0= ruleXDocUri ) ) (otherlv_60= Comma ( (lv_docReference_61_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_62= See otherlv_63= Colon ( (lv_modelReference_64_0= ruleQDOTTEDPAREF ) ) (otherlv_65= Comma ( (lv_modelReference_66_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA28_15 = input.LA(1);

                         
                        int index28_15 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA28_15 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) ) {s = 16;}

                        else if ( LA28_15 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) {s = 17;}

                        else if ( LA28_15 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16) ) {s = 18;}

                        else if ( LA28_15 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) ) {s = 19;}

                         
                        input.seek(index28_15);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA28_0 = input.LA(1);

                         
                        int index28_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA28_0==End) ) {s = 1;}

                        else if ( LA28_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA28_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA28_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA28_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA28_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA28_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA28_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA28_0 ==Section && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA28_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA28_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA28_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA28_0 ==Conflicts && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA28_0 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 12) ) {s = 14;}

                        else if ( LA28_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 15) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 16) || getUnorderedGroupHelper().canSelect(grammarAccess.getContractualElementAccess().getUnorderedGroup_2(), 13) ) ) {s = 15;}

                         
                        input.seek(index28_0);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 28, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA40_eotS =
        "\23\uffff";
    static final String DFA40_eofS =
        "\23\uffff";
    static final String DFA40_minS =
        "\1\6\15\uffff\1\11\4\uffff";
    static final String DFA40_maxS =
        "\1\71\15\uffff\1\104\4\uffff";
    static final String DFA40_acceptS =
        "\1\uffff\1\21\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1"+
        "\14\1\uffff\1\16\1\20\1\17\1\15";
    static final String DFA40_specialS =
        "\1\0\15\uffff\1\1\4\uffff}>";
    static final String[] DFA40_transitionS = {
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

    static final short[] DFA40_eot = DFA.unpackEncodedString(DFA40_eotS);
    static final short[] DFA40_eof = DFA.unpackEncodedString(DFA40_eofS);
    static final char[] DFA40_min = DFA.unpackEncodedStringToUnsignedChars(DFA40_minS);
    static final char[] DFA40_max = DFA.unpackEncodedStringToUnsignedChars(DFA40_maxS);
    static final short[] DFA40_accept = DFA.unpackEncodedString(DFA40_acceptS);
    static final short[] DFA40_special = DFA.unpackEncodedString(DFA40_specialS);
    static final short[][] DFA40_transition;

    static {
        int numStates = DFA40_transitionS.length;
        DFA40_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA40_transition[i] = DFA.unpackEncodedString(DFA40_transitionS[i]);
        }
    }

    class DFA40 extends DFA {

        public DFA40(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 40;
            this.eot = DFA40_eot;
            this.eof = DFA40_eof;
            this.min = DFA40_min;
            this.max = DFA40_max;
            this.accept = DFA40_accept;
            this.special = DFA40_special;
            this.transition = DFA40_transition;
        }
        public String getDescription() {
            return "()* loopback of 1604:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= Refines ( ( ruleDOTTEDREF ) ) (otherlv_23= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_25= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_27= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_29= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_31= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_33= Conflicts ( ( ruleDOTTEDREF ) ) (otherlv_35= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_37= Stakeholder ( ( ruleDOTTEDREF ) ) (otherlv_39= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_41= See otherlv_42= Stakeholder otherlv_43= Req ( ( ruleDOTTEDREF ) ) (otherlv_45= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_47= See otherlv_48= System otherlv_49= Req ( ( ruleDOTTEDREF ) ) (otherlv_51= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_53= See otherlv_54= Document ( (lv_docReference_55_0= ruleXDocUri ) ) (otherlv_56= Comma ( (lv_docReference_57_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Colon ( (lv_modelReference_60_0= ruleQDOTTEDPAREF ) ) (otherlv_61= Comma ( (lv_modelReference_62_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA40_0 = input.LA(1);

                         
                        int index40_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA40_0==End) ) {s = 1;}

                        else if ( LA40_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA40_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA40_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA40_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA40_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA40_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA40_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA40_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 7) ) {s = 9;}

                        else if ( LA40_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 8) ) {s = 10;}

                        else if ( LA40_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 9) ) {s = 11;}

                        else if ( LA40_0 ==Conflicts && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 10) ) {s = 12;}

                        else if ( LA40_0 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 11) ) {s = 13;}

                        else if ( LA40_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) || getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) ) {s = 14;}

                         
                        input.seek(index40_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA40_14 = input.LA(1);

                         
                        int index40_14 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA40_14 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 13) ) {s = 15;}

                        else if ( LA40_14 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 15) ) {s = 16;}

                        else if ( LA40_14 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 14) ) {s = 17;}

                        else if ( LA40_14 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getGoalAccess().getUnorderedGroup_2(), 12) ) {s = 18;}

                         
                        input.seek(index40_14);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 40, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA53_eotS =
        "\24\uffff";
    static final String DFA53_eofS =
        "\24\uffff";
    static final String DFA53_minS =
        "\1\6\10\uffff\1\11\12\uffff";
    static final String DFA53_maxS =
        "\1\71\10\uffff\1\104\12\uffff";
    static final String DFA53_acceptS =
        "\1\uffff\1\22\1\1\1\2\1\3\1\4\1\5\1\6\1\7\1\uffff\1\12\1\13\1\14"+
        "\1\17\1\20\1\11\1\15\1\21\1\16\1\10";
    static final String DFA53_specialS =
        "\1\0\10\uffff\1\1\12\uffff}>";
    static final String[] DFA53_transitionS = {
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
            "\1\20\15\uffff\1\16\12\uffff\1\17\7\uffff\1\22\6\uffff\1\23"+
            "\22\uffff\1\21",
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
            return "()* loopback of 2461:3: ( ({...}? => ( ({...}? => (otherlv_3= For ( ( ruleQNEREF ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_5= Category ( ( ruleDOTTEDREF ) ) (otherlv_7= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_9= Title ( (lv_title_10_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_11= Description ( (lv_description_12_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_13= Assertion ( (lv_assert_14_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_15= Rationale ( (lv_rationale_16_0= ruleValueString ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_17= Issues ( (lv_issue_18_0= ruleValueString ) ) (otherlv_19= Comma ( (lv_issue_20_0= ruleValueString ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_21= See otherlv_22= Goal ( (otherlv_23= RULE_ID ) ) (otherlv_24= Comma ( (otherlv_25= RULE_ID ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_26= See otherlv_27= Hazard ( (lv_hazardReference_28_0= ruleQNEREF ) ) (otherlv_29= Comma ( (lv_hazardReference_30_0= ruleQNEREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_31= Refines ( ( ruleDOTTEDREF ) ) (otherlv_33= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_35= Decomposes ( ( ruleDOTTEDREF ) ) (otherlv_37= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_39= Evolves ( ( ruleDOTTEDREF ) ) (otherlv_41= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_43= See otherlv_44= Stakeholder otherlv_45= Req ( ( ruleDOTTEDREF ) ) (otherlv_47= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_49= See otherlv_50= System otherlv_51= Req ( ( ruleDOTTEDREF ) ) (otherlv_53= Comma ( ( ruleDOTTEDREF ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_55= Verified otherlv_56= By ( (lv_verifiedBy_57_0= ruleVerificationDecomposition ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_58= See otherlv_59= Document ( (lv_docReference_60_0= ruleXDocUri ) ) (otherlv_61= Comma ( (lv_docReference_62_0= ruleXDocUri ) ) )* ) ) ) ) | ({...}? => ( ({...}? => (otherlv_63= See otherlv_64= Colon ( (lv_modelReference_65_0= ruleQDOTTEDPAREF ) ) (otherlv_66= Comma ( (lv_modelReference_67_0= ruleQDOTTEDPAREF ) ) )* ) ) ) ) )*";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            TokenStream input = (TokenStream)_input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA53_0 = input.LA(1);

                         
                        int index53_0 = input.index();
                        input.rewind();
                        s = -1;
                        if ( (LA53_0==End) ) {s = 1;}

                        else if ( LA53_0 ==For && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 0) ) {s = 2;}

                        else if ( LA53_0 ==Category && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 1) ) {s = 3;}

                        else if ( LA53_0 ==Title && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 2) ) {s = 4;}

                        else if ( LA53_0 ==Description && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 3) ) {s = 5;}

                        else if ( LA53_0 ==Assertion && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 4) ) {s = 6;}

                        else if ( LA53_0 ==Rationale && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 5) ) {s = 7;}

                        else if ( LA53_0 ==Issues && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 6) ) {s = 8;}

                        else if ( LA53_0 ==See && ( getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) || getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) ) {s = 9;}

                        else if ( LA53_0 ==Refines && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 9) ) {s = 10;}

                        else if ( LA53_0 ==Decomposes && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 10) ) {s = 11;}

                        else if ( LA53_0 ==Evolves && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 11) ) {s = 12;}

                        else if ( LA53_0 ==Verified && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 14) ) {s = 13;}

                         
                        input.seek(index53_0);
                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA53_9 = input.LA(1);

                         
                        int index53_9 = input.index();
                        input.rewind();
                        s = -1;
                        if ( LA53_9 ==Document && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 15) ) {s = 14;}

                        else if ( LA53_9 ==Hazard && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 8) ) {s = 15;}

                        else if ( LA53_9 ==Stakeholder && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 12) ) {s = 16;}

                        else if ( LA53_9 ==Colon && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 16) ) {s = 17;}

                        else if ( LA53_9 ==System && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 13) ) {s = 18;}

                        else if ( LA53_9 ==Goal && getUnorderedGroupHelper().canSelect(grammarAccess.getRequirementAccess().getUnorderedGroup_2(), 7) ) {s = 19;}

                         
                        input.seek(index53_9);
                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 53, _s, input);
            error(nvae);
            throw nvae;
        }
    }
    static final String DFA58_eotS =
        "\6\uffff";
    static final String DFA58_eofS =
        "\1\uffff\1\4\3\uffff\1\4";
    static final String DFA58_minS =
        "\1\107\1\6\1\107\2\uffff\1\6";
    static final String DFA58_maxS =
        "\3\107\2\uffff\1\107";
    static final String DFA58_acceptS =
        "\3\uffff\1\2\1\1\1\uffff";
    static final String DFA58_specialS =
        "\6\uffff}>";
    static final String[] DFA58_transitionS = {
            "\1\1",
            "\1\4\4\uffff\1\4\1\uffff\1\4\3\uffff\1\4\3\uffff\2\4\1\uffff"+
            "\2\4\4\uffff\1\4\4\uffff\1\4\12\uffff\1\4\6\uffff\1\3\2\4\1"+
            "\uffff\1\4\4\uffff\1\3\3\uffff\1\2\4\uffff\1\4",
            "\1\5",
            "",
            "",
            "\1\4\4\uffff\1\4\1\uffff\1\4\3\uffff\1\4\3\uffff\2\4\1\uffff"+
            "\2\4\4\uffff\1\4\4\uffff\1\4\12\uffff\1\4\6\uffff\1\3\2\4\1"+
            "\uffff\1\4\4\uffff\1\3\3\uffff\1\2\4\uffff\1\4"
    };

    static final short[] DFA58_eot = DFA.unpackEncodedString(DFA58_eotS);
    static final short[] DFA58_eof = DFA.unpackEncodedString(DFA58_eofS);
    static final char[] DFA58_min = DFA.unpackEncodedStringToUnsignedChars(DFA58_minS);
    static final char[] DFA58_max = DFA.unpackEncodedStringToUnsignedChars(DFA58_maxS);
    static final short[] DFA58_accept = DFA.unpackEncodedString(DFA58_acceptS);
    static final short[] DFA58_special = DFA.unpackEncodedString(DFA58_specialS);
    static final short[][] DFA58_transition;

    static {
        int numStates = DFA58_transitionS.length;
        DFA58_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA58_transition[i] = DFA.unpackEncodedString(DFA58_transitionS[i]);
        }
    }

    class DFA58 extends DFA {

        public DFA58(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 58;
            this.eot = DFA58_eot;
            this.eof = DFA58_eof;
            this.min = DFA58_min;
            this.max = DFA58_max;
            this.accept = DFA58_accept;
            this.special = DFA58_special;
            this.transition = DFA58_transition;
        }
        public String getDescription() {
            return "3845:1: ( ( ( ruleDOTTEDREF ) ) | ( ( ( ruleDOTTEDREF ) ) ( ( (lv_type_2_1= And | lv_type_2_2= Or ) ) ) ( (lv_right_3_0= ruleVerificationDecomposition ) ) ) )";
        }
    }
 

    public static final BitSet FOLLOW_ruleAlisaModel_in_entryRuleAlisaModel67 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlisaModel77 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_ruleAlisaModel124 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_ruleAlisaModel151 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALPackage_in_entryRuleRSALPackage187 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRSALPackage197 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Package_in_ruleRSALPackage235 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage251 = new BitSet(new long[]{0x1012000088C00320L});
    public static final BitSet FOLLOW_Imports_in_ruleRSALPackage270 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage289 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage303 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALPackage322 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_With_in_ruleRSALPackage340 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage362 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage376 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQPREF_in_ruleRSALPackage398 = new BitSet(new long[]{0x1012000088C00320L,0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRSALElement_in_ruleRSALPackage423 = new BitSet(new long[]{0x1052000888C00320L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALPackage438 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALPackage458 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALPackage472 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
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
    public static final BitSet FOLLOW_Section_in_ruleRSALSection871 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRSALSection887 = new BitSet(new long[]{0x1092000088C00320L});
    public static final BitSet FOLLOW_For_in_ruleRSALSection906 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRSALSection928 = new BitSet(new long[]{0x1012000088C00320L});
    public static final BitSet FOLLOW_ruleRSALElement_in_ruleRSALSection951 = new BitSet(new long[]{0x1052000888C00320L});
    public static final BitSet FOLLOW_Issues_in_ruleRSALSection966 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection986 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRSALSection1000 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRSALSection1020 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRSALSection1037 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOrganization_in_entryRuleOrganization1071 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOrganization1081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Organization_in_ruleOrganization1119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleOrganization1135 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_ruleStakeholder_in_ruleOrganization1161 = new BitSet(new long[]{0x0040000000000200L});
    public static final BitSet FOLLOW_End_in_ruleOrganization1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDescriptionElement_in_entryRuleDescriptionElement1211 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDescriptionElement1221 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleDescriptionElement1263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDescriptionElement1294 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleContractualElement_in_entryRuleContractualElement1333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleContractualElement1343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Cr_in_ruleContractualElement1381 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleContractualElement1397 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_For_in_ruleContractualElement1461 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleContractualElement1483 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Category_in_ruleContractualElement1552 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1574 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement1588 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement1610 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleContractualElement1681 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1701 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Description_in_ruleContractualElement1770 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1790 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Assertion_in_ruleContractualElement1859 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1879 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Rationale_in_ruleContractualElement1948 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement1968 = new BitSet(new long[]{0x02C04008C2432A40L});
    public static final BitSet FOLLOW_Issues_in_ruleContractualElement2037 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement2057 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2071 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleContractualElement2091 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Section_in_ruleContractualElement2162 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2184 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2198 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2220 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleContractualElement2291 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2313 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2349 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleContractualElement2420 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2442 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2456 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2478 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleContractualElement2549 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2571 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2585 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2607 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Conflicts_in_ruleContractualElement2678 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2700 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2714 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2736 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleContractualElement2807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2829 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2843 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2865 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement2936 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleContractualElement2948 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleContractualElement2960 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement2982 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement2996 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3018 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement3089 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleContractualElement3101 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleContractualElement3113 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3135 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement3149 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleContractualElement3171 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement3242 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleContractualElement3254 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleContractualElement3274 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement3288 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleContractualElement3308 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleContractualElement3379 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleContractualElement3391 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3411 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleContractualElement3425 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleContractualElement3445 = new BitSet(new long[]{0x02C04008C2432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleContractualElement3501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleGoal_in_entryRuleGoal3535 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleGoal3545 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Goal_in_ruleGoal3583 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleGoal3599 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_For_in_ruleGoal3663 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleGoal3685 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Category_in_ruleGoal3754 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3776 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal3790 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal3812 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleGoal3883 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3903 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Description_in_ruleGoal3972 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal3992 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Assertion_in_ruleGoal4061 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal4081 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Rationale_in_ruleGoal4150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal4170 = new BitSet(new long[]{0x02C0400842432A40L});
    public static final BitSet FOLLOW_Issues_in_ruleGoal4239 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal4259 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleGoal4293 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleGoal4364 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4386 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4400 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4422 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleGoal4493 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4515 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4529 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4551 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleGoal4622 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4644 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4658 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4680 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Conflicts_in_ruleGoal4751 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4773 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4787 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4809 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleGoal4880 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4902 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal4916 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal4938 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5009 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleGoal5021 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleGoal5033 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal5055 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5069 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal5091 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5162 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleGoal5174 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleGoal5186 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal5208 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5222 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleGoal5244 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5315 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleGoal5327 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal5347 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5361 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleGoal5381 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleGoal5452 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleGoal5464 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5484 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleGoal5498 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleGoal5518 = new BitSet(new long[]{0x02C0400842432A40L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleGoal5574 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRequirement_in_entryRuleRequirement5608 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRequirement5618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Requirement_in_ruleRequirement5656 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement5672 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_For_in_ruleRequirement5736 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement5758 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Category_in_ruleRequirement5827 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5849 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement5863 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement5885 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Title_in_ruleRequirement5956 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement5976 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Description_in_ruleRequirement6045 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6065 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Assertion_in_ruleRequirement6134 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6154 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Rationale_in_ruleRequirement6223 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6243 = new BitSet(new long[]{0x02C0400843422840L});
    public static final BitSet FOLLOW_Issues_in_ruleRequirement6312 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6332 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6346 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleRequirement6366 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6437 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_Goal_in_ruleRequirement6449 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement6468 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6482 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleRequirement6501 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement6572 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_Hazard_in_ruleRequirement6584 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement6604 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleRequirement6638 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Refines_in_ruleRequirement6709 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6731 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6745 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6767 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Decomposes_in_ruleRequirement6838 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6860 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement6874 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6896 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Evolves_in_ruleRequirement6967 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement6989 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7003 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7025 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7096 = new BitSet(new long[]{0x0000000000000200L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleRequirement7108 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleRequirement7120 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7142 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7156 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7178 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7249 = new BitSet(new long[]{0x0000040000000000L});
    public static final BitSet FOLLOW_System_in_ruleRequirement7261 = new BitSet(new long[]{0x0100000000000000L});
    public static final BitSet FOLLOW_Req_in_ruleRequirement7273 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7295 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7309 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleRequirement7331 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Verified_in_ruleRequirement7402 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_By_in_ruleRequirement7414 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleRequirement7434 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000080L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7504 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_Document_in_ruleRequirement7516 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement7536 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7550 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleXDocUri_in_ruleRequirement7570 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_See_in_ruleRequirement7641 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_Colon_in_ruleRequirement7653 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7673 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_Comma_in_ruleRequirement7687 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000081L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_ruleRequirement7707 = new BitSet(new long[]{0x02C0400843422840L,0x0000000000000002L});
    public static final BitSet FOLLOW_End_in_ruleRequirement7763 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleExternalDocument_in_entryRuleExternalDocument7797 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleExternalDocument7807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Document_in_ruleExternalDocument7845 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleExternalDocument7861 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_See_in_ruleExternalDocument7879 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_ruleExternalDocument7899 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleExternalDocument7912 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleXDocUri_in_entryRuleXDocUri7946 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleXDocUri7956 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleXDocUri8004 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000001L});
    public static final BitSet FOLLOW_NumberSign_in_ruleXDocUri8018 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_ruleXDocUri8038 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCategory_in_entryRuleCategory8075 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCategory8085 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Category_in_ruleCategory8123 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleCategory8139 = new BitSet(new long[]{0x0040000004000000L});
    public static final BitSet FOLLOW_Extends_in_ruleCategory8158 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleCategory8180 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleCategory8195 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleValueString_in_entryRuleValueString8230 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleValueString8241 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleValueString8280 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStakeholder_in_entryRuleStakeholder8323 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStakeholder8333 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Stakeholder_in_ruleStakeholder8371 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleStakeholder8387 = new BitSet(new long[]{0x00085800000000C0L});
    public static final BitSet FOLLOW_Title_in_ruleStakeholder8451 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8471 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Description_in_ruleStakeholder8540 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8560 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Role_in_ruleStakeholder8629 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8649 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Oranization_in_ruleStakeholder8718 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8738 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Email_in_ruleStakeholder8807 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8827 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_Phone_in_ruleStakeholder8896 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleStakeholder8916 = new BitSet(new long[]{0x00485800000000C0L});
    public static final BitSet FOLLOW_End_in_ruleStakeholder8976 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_entryRuleVerificationDecomposition9010 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationDecomposition9020 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition9068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationDecomposition9098 = new BitSet(new long[]{0x4020000000000000L});
    public static final BitSet FOLLOW_And_in_ruleVerificationDecomposition9119 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Or_in_ruleVerificationDecomposition9147 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleVerificationDecomposition9182 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationActivity_in_entryRuleVerificationActivity9218 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationActivity9228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationActivity9266 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_Activity_in_ruleVerificationActivity9278 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationActivity9294 = new BitSet(new long[]{0x0040402000200440L});
    public static final BitSet FOLLOW_Title_in_ruleVerificationActivity9313 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity9333 = new BitSet(new long[]{0x0040002000200440L});
    public static final BitSet FOLLOW_Description_in_ruleVerificationActivity9349 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationActivity9369 = new BitSet(new long[]{0x0040002000200400L});
    public static final BitSet FOLLOW_Method_in_ruleVerificationActivity9385 = new BitSet(new long[]{0x0000011100104020L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_ruleVerificationActivity9405 = new BitSet(new long[]{0x0040000000200400L});
    public static final BitSet FOLLOW_Decomposed_in_ruleVerificationActivity9421 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_To_in_ruleVerificationActivity9433 = new BitSet(new long[]{0x0040000000200000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleVerificationDecomposition_in_ruleVerificationActivity9453 = new BitSet(new long[]{0x0040000000200000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Assigned_in_ruleVerificationActivity9470 = new BitSet(new long[]{0x8000000000000000L});
    public static final BitSet FOLLOW_To_in_ruleVerificationActivity9482 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_ruleVerificationActivity9504 = new BitSet(new long[]{0x0040000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_End_in_ruleVerificationActivity9520 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationMethod_in_entryRuleVerificationMethod9555 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationMethod9566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Manual_in_ruleVerificationMethod9604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Automatic_in_ruleVerificationMethod9623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Review_in_ruleVerificationMethod9642 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Testing_in_ruleVerificationMethod9661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Analysis_in_ruleVerificationMethod9680 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationMethod9699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVerificationResult_in_entryRuleVerificationResult9738 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVerificationResult9748 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Verification_in_ruleVerificationResult9786 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_Result_in_ruleVerificationResult9798 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult9814 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_Of_in_ruleVerificationResult9832 = new BitSet(new long[]{0x0040A24010000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleVerificationResult9851 = new BitSet(new long[]{0x0040A24010000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_Output_in_ruleVerificationResult9866 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9886 = new BitSet(new long[]{0x0040A20010000000L});
    public static final BitSet FOLLOW_Logfile_in_ruleVerificationResult9902 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9922 = new BitSet(new long[]{0x0040A20000000000L});
    public static final BitSet FOLLOW_Date_in_ruleVerificationResult9938 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000040L});
    public static final BitSet FOLLOW_ruleValueString_in_ruleVerificationResult9958 = new BitSet(new long[]{0x0040220000000000L});
    public static final BitSet FOLLOW_State_in_ruleVerificationResult9974 = new BitSet(new long[]{0x0000000000049000L});
    public static final BitSet FOLLOW_ruleVerificationResultState_in_ruleVerificationResult9994 = new BitSet(new long[]{0x0040020000000000L});
    public static final BitSet FOLLOW_Status_in_ruleVerificationResult10010 = new BitSet(new long[]{0x0005000200000000L});
    public static final BitSet FOLLOW_ruleVerificationResultStatus_in_ruleVerificationResult10030 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_End_in_ruleVerificationResult10045 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQPREF_in_entryRuleQPREF10080 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQPREF10091 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF10131 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQPREF10150 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQPREF10165 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ruleQNEREF_in_entryRuleQNEREF10212 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQNEREF10223 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF10264 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_ColonColon_in_ruleQNEREF10282 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF10299 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleQNEREF10318 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleQNEREF10333 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_ruleQDOTTEDPAREF_in_entryRuleQDOTTEDPAREF10380 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleQDOTTEDPAREF10391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleQNEREF_in_ruleQDOTTEDPAREF10439 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000081L});
    public static final BitSet FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10467 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePAREF_in_ruleQDOTTEDPAREF10503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOTTEDREF_in_entryRuleDOTTEDREF10548 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOTTEDREF10559 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF10599 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOTTEDREF10618 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOTTEDREF10633 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_rulePAREF_in_entryRulePAREF10680 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePAREF10691 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NumberSign_in_rulePAREF10729 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF10744 = new BitSet(new long[]{0x0400000000000002L});
    public static final BitSet FOLLOW_ColonColon_in_rulePAREF10763 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_rulePAREF10778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCPATH_in_entryRuleDOCPATH10825 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCPATH10836 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10877 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000008L});
    public static final BitSet FOLLOW_Solidus_in_ruleDOCPATH10895 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10912 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCPATH10930 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCPATH10945 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDOCFRAGMENT_in_entryRuleDOCFRAGMENT10990 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDOCFRAGMENT11001 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT11041 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_FullStop_in_ruleDOCFRAGMENT11060 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleDOCFRAGMENT11075 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000004L});
    public static final BitSet FOLLOW_Scheduled_in_ruleVerificationResultState11139 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Completed_in_ruleVerificationResultState11161 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Inprogress_in_ruleVerificationResultState11183 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Pass_in_ruleVerificationResultStatus11233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Fail_in_ruleVerificationResultStatus11255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_Unknown_in_ruleVerificationResultStatus11277 = new BitSet(new long[]{0x0000000000000002L});

}
