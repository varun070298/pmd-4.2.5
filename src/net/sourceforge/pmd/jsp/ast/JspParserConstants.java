/* Generated By:JJTree&JavaCC: Do not edit this line. JspParserConstants.java */
/** 
 * JSP Parser for PMD.
 * @author Pieter � Application Engineers NV/SA � http://www.ae.be
 */

package net.sourceforge.pmd.jsp.ast;


/**
 * Token literal values and constants.
 * Generated by org.javacc.parser.OtherFilesGen#start()
 */
public interface JspParserConstants {

  /** End of File. */
  int EOF = 0;
  /** RegularExpression Id. */
  int ALPHA_CHAR = 1;
  /** RegularExpression Id. */
  int NUM_CHAR = 2;
  /** RegularExpression Id. */
  int ALPHANUM_CHAR = 3;
  /** RegularExpression Id. */
  int IDENTIFIER_CHAR = 4;
  /** RegularExpression Id. */
  int IDENTIFIER = 5;
  /** RegularExpression Id. */
  int XMLNAME = 6;
  /** RegularExpression Id. */
  int QUOTED_STRING_NO_BREAKS = 7;
  /** RegularExpression Id. */
  int QUOTED_STRING = 8;
  /** RegularExpression Id. */
  int WHITESPACE = 9;
  /** RegularExpression Id. */
  int NEWLINE = 10;
  /** RegularExpression Id. */
  int QUOTE = 11;
  /** RegularExpression Id. */
  int NO_WHITESPACE_OR_LT_OR_DOLLAR = 12;
  /** RegularExpression Id. */
  int NO_LT_OR_DOLLAR = 13;
  /** RegularExpression Id. */
  int DOLLAR = 14;
  /** RegularExpression Id. */
  int NO_OPENBRACE_OR_LT = 15;
  /** RegularExpression Id. */
  int TEXT_IN_EL = 16;
  /** RegularExpression Id. */
  int EL_ESCAPE = 17;
  /** RegularExpression Id. */
  int NO_JSP_COMMENT_END = 18;
  /** RegularExpression Id. */
  int NO_JSP_TAG_END = 19;
  /** RegularExpression Id. */
  int TAG_START = 22;
  /** RegularExpression Id. */
  int ENDTAG_START = 23;
  /** RegularExpression Id. */
  int COMMENT_START = 24;
  /** RegularExpression Id. */
  int DECL_START = 25;
  /** RegularExpression Id. */
  int DOCTYPE_DECL_START = 26;
  /** RegularExpression Id. */
  int CDATA_START = 27;
  /** RegularExpression Id. */
  int JSP_COMMENT_START = 28;
  /** RegularExpression Id. */
  int JSP_DECLARATION_START = 29;
  /** RegularExpression Id. */
  int JSP_EXPRESSION_START = 30;
  /** RegularExpression Id. */
  int JSP_SCRIPTLET_START = 31;
  /** RegularExpression Id. */
  int JSP_DIRECTIVE_START = 32;
  /** RegularExpression Id. */
  int EL_EXPRESSION = 33;
  /** RegularExpression Id. */
  int UNPARSED_TEXT = 34;
  /** RegularExpression Id. */
  int JSP_DIRECTIVE_NAME = 35;
  /** RegularExpression Id. */
  int JSP_DIRECTIVE_ATTRIBUTE_NAME = 36;
  /** RegularExpression Id. */
  int JSP_DIRECTIVE_ATTRIBUTE_EQUALS = 37;
  /** RegularExpression Id. */
  int JSP_DIRECTIVE_ATTRIBUTE_VALUE = 38;
  /** RegularExpression Id. */
  int JSP_DIRECTIVE_END = 39;
  /** RegularExpression Id. */
  int JSP_SCRIPTLET_END = 40;
  /** RegularExpression Id. */
  int JSP_SCRIPTLET = 41;
  /** RegularExpression Id. */
  int JSP_EXPRESSION_END = 42;
  /** RegularExpression Id. */
  int JSP_EXPRESSION = 43;
  /** RegularExpression Id. */
  int JSP_DECLARATION_END = 44;
  /** RegularExpression Id. */
  int JSP_DECLARATION = 45;
  /** RegularExpression Id. */
  int JSP_COMMENT_END = 46;
  /** RegularExpression Id. */
  int JSP_COMMENT_CONTENT = 47;
  /** RegularExpression Id. */
  int WHITESPACES = 48;
  /** RegularExpression Id. */
  int NAME = 49;
  /** RegularExpression Id. */
  int PUBLIC = 50;
  /** RegularExpression Id. */
  int SYSTEM = 51;
  /** RegularExpression Id. */
  int DOCTYPE_DECL_END = 52;
  /** RegularExpression Id. */
  int QUOTED_LITERAL = 53;
  /** RegularExpression Id. */
  int UNPARSED = 54;
  /** RegularExpression Id. */
  int CDATA_END = 55;
  /** RegularExpression Id. */
  int TAG_NAME = 56;
  /** RegularExpression Id. */
  int LST_ERROR = 57;
  /** RegularExpression Id. */
  int ATTR_NAME = 58;
  /** RegularExpression Id. */
  int TAG_END = 59;
  /** RegularExpression Id. */
  int DECL_END = 60;
  /** RegularExpression Id. */
  int TAG_SLASHEND = 61;
  /** RegularExpression Id. */
  int ATTR_EQ = 62;
  /** RegularExpression Id. */
  int IN_TAG_ERROR = 63;
  /** RegularExpression Id. */
  int SINGLE_QUOTE = 64;
  /** RegularExpression Id. */
  int DOUBLE_QUOTE = 65;
  /** RegularExpression Id. */
  int EL_EXPRESSION_IN_ATTRIBUTE = 66;
  /** RegularExpression Id. */
  int VALUE_BINDING_IN_ATTRIBUTE = 67;
  /** RegularExpression Id. */
  int JSP_EXPRESSION_IN_ATTRIBUTE = 68;
  /** RegularExpression Id. */
  int ENDING_SINGLE_QUOTE = 69;
  /** RegularExpression Id. */
  int UNPARSED_TEXT_NO_SINGLE_QUOTES = 70;
  /** RegularExpression Id. */
  int DOLLAR_OR_HASH_SINGLE_QUOTE = 71;
  /** RegularExpression Id. */
  int ENDING_DOUBLE_QUOTE = 72;
  /** RegularExpression Id. */
  int UNPARSED_TEXT_NO_DOUBLE_QUOTES = 73;
  /** RegularExpression Id. */
  int DOLLAR_OR_HASH_DOUBLE_QUOTE = 74;
  /** RegularExpression Id. */
  int COMMENT_END = 75;
  /** RegularExpression Id. */
  int COMMENT_TEXT = 76;

  /** Lexical state. */
  int CommentState = 0;
  /** Lexical state. */
  int AttrValueBetweenDoubleQuotesState = 1;
  /** Lexical state. */
  int AttrValueBetweenSingleQuotesState = 2;
  /** Lexical state. */
  int StartTagState = 3;
  /** Lexical state. */
  int CDataState = 4;
  /** Lexical state. */
  int DocTypeExternalIdState = 5;
  /** Lexical state. */
  int DocTypeState = 6;
  /** Lexical state. */
  int JspCommentState = 7;
  /** Lexical state. */
  int JspDeclarationState = 8;
  /** Lexical state. */
  int JspExpressionState = 9;
  /** Lexical state. */
  int JspScriptletState = 10;
  /** Lexical state. */
  int InTagState = 11;
  /** Lexical state. */
  int AfterTagState = 12;
  /** Lexical state. */
  int AttrValueState = 13;
  /** Lexical state. */
  int JspDirectiveAttributesState = 14;
  /** Lexical state. */
  int JspDirectiveState = 15;
  /** Lexical state. */
  int DEFAULT = 16;

  /** Literal token values. */
  String[] tokenImage = {
    "<EOF>",
    "<ALPHA_CHAR>",
    "<NUM_CHAR>",
    "<ALPHANUM_CHAR>",
    "<IDENTIFIER_CHAR>",
    "<IDENTIFIER>",
    "<XMLNAME>",
    "<QUOTED_STRING_NO_BREAKS>",
    "<QUOTED_STRING>",
    "<WHITESPACE>",
    "<NEWLINE>",
    "<QUOTE>",
    "<NO_WHITESPACE_OR_LT_OR_DOLLAR>",
    "<NO_LT_OR_DOLLAR>",
    "\"$\"",
    "<NO_OPENBRACE_OR_LT>",
    "<TEXT_IN_EL>",
    "<EL_ESCAPE>",
    "<NO_JSP_COMMENT_END>",
    "<NO_JSP_TAG_END>",
    "<token of kind 20>",
    "<token of kind 21>",
    "\"<\"",
    "\"</\"",
    "\"<!--\"",
    "\"<?\"",
    "\"<!DOCTYPE\"",
    "\"<![CDATA[\"",
    "\"<%--\"",
    "\"<%!\"",
    "\"<%=\"",
    "\"<%\"",
    "\"<%@\"",
    "<EL_EXPRESSION>",
    "<UNPARSED_TEXT>",
    "<JSP_DIRECTIVE_NAME>",
    "<JSP_DIRECTIVE_ATTRIBUTE_NAME>",
    "\"=\"",
    "<JSP_DIRECTIVE_ATTRIBUTE_VALUE>",
    "\"%>\"",
    "\"%>\"",
    "<JSP_SCRIPTLET>",
    "\"%>\"",
    "<JSP_EXPRESSION>",
    "\"%>\"",
    "<JSP_DECLARATION>",
    "\"--%>\"",
    "<JSP_COMMENT_CONTENT>",
    "<WHITESPACES>",
    "<NAME>",
    "\"PUBLIC\"",
    "\"SYSTEM\"",
    "\">\"",
    "<QUOTED_LITERAL>",
    "<UNPARSED>",
    "\"]]>\"",
    "<TAG_NAME>",
    "<LST_ERROR>",
    "<ATTR_NAME>",
    "\">\"",
    "<DECL_END>",
    "\"/>\"",
    "\"=\"",
    "<IN_TAG_ERROR>",
    "\"\\\'\"",
    "\"\\\"\"",
    "<EL_EXPRESSION_IN_ATTRIBUTE>",
    "<VALUE_BINDING_IN_ATTRIBUTE>",
    "<JSP_EXPRESSION_IN_ATTRIBUTE>",
    "\"\\\'\"",
    "<UNPARSED_TEXT_NO_SINGLE_QUOTES>",
    "<DOLLAR_OR_HASH_SINGLE_QUOTE>",
    "\"\\\"\"",
    "<UNPARSED_TEXT_NO_DOUBLE_QUOTES>",
    "<DOLLAR_OR_HASH_DOUBLE_QUOTE>",
    "<COMMENT_END>",
    "<COMMENT_TEXT>",
  };

}
