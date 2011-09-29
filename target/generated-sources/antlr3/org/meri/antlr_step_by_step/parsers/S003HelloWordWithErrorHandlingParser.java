// $ANTLR 3.3 Nov 30, 2010 12:46:29 org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g 2011-09-29 09:52:03

package org.meri.antlr_step_by_step.parsers;

//add imports 
import org.meri.antlr_step_by_step.parsers.S003HelloWordWithErrorHandlingCompiler.S003HelloWordError;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;


import org.antlr.runtime.tree.*;

public class S003HelloWordWithErrorHandlingParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "SALUTATION", "ENDSYMBOL"
    };
    public static final int EOF=-1;
    public static final int SALUTATION=4;
    public static final int ENDSYMBOL=5;

    // delegates
    // delegators


        public S003HelloWordWithErrorHandlingParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public S003HelloWordWithErrorHandlingParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        
    protected TreeAdaptor adaptor = new CommonTreeAdaptor();

    public void setTreeAdaptor(TreeAdaptor adaptor) {
        this.adaptor = adaptor;
    }
    public TreeAdaptor getTreeAdaptor() {
        return adaptor;
    }

    public String[] getTokenNames() { return S003HelloWordWithErrorHandlingParser.tokenNames; }
    public String getGrammarFileName() { return "org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g"; }


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };

    // $ANTLR start "expression"
    // org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:41:1: expression : SALUTATION ENDSYMBOL ;
    public final S003HelloWordWithErrorHandlingParser.expression_return expression() throws RecognitionException {
        S003HelloWordWithErrorHandlingParser.expression_return retval = new S003HelloWordWithErrorHandlingParser.expression_return();
        retval.start = input.LT(1);

        Object root_0 = null;

        Token SALUTATION1=null;
        Token ENDSYMBOL2=null;

        Object SALUTATION1_tree=null;
        Object ENDSYMBOL2_tree=null;

        try {
            // org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:41:12: ( SALUTATION ENDSYMBOL )
            // org\\meri\\antlr_step_by_step\\parsers\\S003HelloWordWithErrorHandling.g:41:14: SALUTATION ENDSYMBOL
            {
            root_0 = (Object)adaptor.nil();

            SALUTATION1=(Token)match(input,SALUTATION,FOLLOW_SALUTATION_in_expression86); 
            SALUTATION1_tree = (Object)adaptor.create(SALUTATION1);
            adaptor.addChild(root_0, SALUTATION1_tree);

            ENDSYMBOL2=(Token)match(input,ENDSYMBOL,FOLLOW_ENDSYMBOL_in_expression88); 
            ENDSYMBOL2_tree = (Object)adaptor.create(ENDSYMBOL2);
            adaptor.addChild(root_0, ENDSYMBOL2_tree);


            }

            retval.stop = input.LT(-1);

            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }

          catch (RecognitionException e) {
        	//Custom handling of an exception. Any java code is allowed.
        	throw new S003HelloWordError(":(", e); 
          }
        finally {
        }
        return retval;
    }
    // $ANTLR end "expression"

    // Delegated rules


 

    public static final BitSet FOLLOW_SALUTATION_in_expression86 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ENDSYMBOL_in_expression88 = new BitSet(new long[]{0x0000000000000002L});

}