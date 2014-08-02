
/*
* generated by Xtext
*/
lexer grammar InternalAlisaLexer;


@header {
package edu.cmu.sei.alisa.ui.contentassist.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.Lexer;
}




KEYWORD_70 : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('D'|'d')('E'|'e')('T'|'t')('A'|'a')('I'|'i')('L'|'l')('S'|'s');

KEYWORD_69 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_68 : ('V'|'v')('E'|'e')('R'|'r')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_65 : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('R'|'r')('I'|'i')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_66 : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_67 : ('S'|'s')('T'|'t')('A'|'a')('K'|'k')('E'|'e')('H'|'h')('O'|'o')('L'|'l')('D'|'d')('E'|'e')('R'|'r');

KEYWORD_59 : ('C'|'c')('L'|'l')('A'|'a')('S'|'s')('S'|'s')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('R'|'r');

KEYWORD_60 : ('D'|'d')('E'|'e')('C'|'c')('O'|'o')('M'|'m')('P'|'p')('O'|'o')('S'|'s')('E'|'e')('D'|'d');

KEYWORD_61 : ('I'|'i')('N'|'n')('P'|'p')('R'|'r')('O'|'o')('G'|'g')('R'|'r')('E'|'e')('S'|'s')('S'|'s');

KEYWORD_62 : ('P'|'p')('A'|'a')('R'|'r')('A'|'a')('M'|'m')('E'|'e')('T'|'t')('E'|'e')('R'|'r')('S'|'s');

KEYWORD_63 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')('D'|'d');

KEYWORD_64 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')('S'|'s');

KEYWORD_56 : ('A'|'a')('U'|'u')('T'|'t')('O'|'o')('M'|'m')('A'|'a')('T'|'t')('I'|'i')('C'|'c');

KEYWORD_57 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e');

KEYWORD_58 : ('S'|'s')('C'|'c')('H'|'h')('E'|'e')('D'|'d')('U'|'u')('L'|'l')('E'|'e')('D'|'d');

KEYWORD_52 : ('A'|'a')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('I'|'i')('T'|'t')('Y'|'y');

KEYWORD_53 : ('A'|'a')('S'|'s')('S'|'s')('I'|'i')('G'|'g')('N'|'n')('E'|'e')('D'|'d');

KEYWORD_54 : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('A'|'a')('N'|'n')('T'|'t');

KEYWORD_55 : ('V'|'v')('E'|'e')('R'|'r')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('D'|'d');

KEYWORD_44 : ('A'|'a')('P'|'p')('P'|'p')('L'|'l')('I'|'i')('E'|'e')('S'|'s');

KEYWORD_45 : ('B'|'b')('I'|'i')('N'|'n')('D'|'d')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_46 : ('C'|'c')('O'|'o')('M'|'m')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_47 : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('U'|'u')('T'|'t')('E'|'e');

KEYWORD_48 : ('E'|'e')('L'|'l')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_49 : ('L'|'l')('O'|'o')('G'|'g')('F'|'f')('I'|'i')('L'|'l')('E'|'e');

KEYWORD_50 : ('U'|'u')('N'|'n')('K'|'k')('N'|'n')('O'|'o')('W'|'w')('N'|'n');

KEYWORD_51 : ('V'|'v')('E'|'e')('R'|'r')('S'|'s')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_37 : ('M'|'m')('A'|'a')('N'|'n')('U'|'u')('A'|'a')('L'|'l');

KEYWORD_38 : ('M'|'m')('E'|'e')('T'|'t')('H'|'h')('O'|'o')('D'|'d');

KEYWORD_39 : ('O'|'o')('U'|'u')('T'|'t')('P'|'p')('U'|'u')('T'|'t');

KEYWORD_40 : ('P'|'p')('A'|'a')('S'|'s')('S'|'s')('E'|'e')('D'|'d');

KEYWORD_41 : ('R'|'r')('E'|'e')('S'|'s')('U'|'u')('L'|'l')('T'|'t');

KEYWORD_42 : ('S'|'s')('T'|'t')('A'|'a')('T'|'t')('U'|'u')('S'|'s');

KEYWORD_43 : ('S'|'s')('Y'|'y')('S'|'s')('T'|'t')('E'|'e')('M'|'m');

KEYWORD_32 : ('D'|'d')('E'|'e')('L'|'l')('T'|'t')('A'|'a');

KEYWORD_33 : ('F'|'f')('A'|'a')('L'|'l')('S'|'s')('E'|'e');

KEYWORD_34 : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('S'|'s');

KEYWORD_35 : ('S'|'s')('T'|'t')('A'|'a')('T'|'t')('E'|'e');

KEYWORD_36 : ('T'|'t')('I'|'i')('T'|'t')('L'|'l')('E'|'e');

KEYWORD_28 : ('D'|'d')('A'|'a')('T'|'t')('E'|'e');

KEYWORD_29 : ('N'|'n')('A'|'a')('M'|'m')('E'|'e');

KEYWORD_30 : ('R'|'r')('O'|'o')('L'|'l')('E'|'e');

KEYWORD_31 : ('T'|'t')('R'|'r')('U'|'u')('E'|'e');

KEYWORD_23 : '+''=''>';

KEYWORD_24 : ('A'|'a')('N'|'n')('D'|'d');

KEYWORD_25 : ('E'|'e')('N'|'n')('D'|'d');

KEYWORD_26 : ('T'|'t')('B'|'b')('D'|'d');

KEYWORD_27 : ('U'|'u')('R'|'r')('L'|'l');

KEYWORD_14 : '.''.';

KEYWORD_15 : ':'':';

KEYWORD_16 : '=''>';

KEYWORD_17 : ('B'|'b')('Y'|'y');

KEYWORD_18 : ('I'|'i')('N'|'n');

KEYWORD_19 : ('O'|'o')('F'|'f');

KEYWORD_20 : ('O'|'o')('K'|'k');

KEYWORD_21 : ('O'|'o')('R'|'r');

KEYWORD_22 : ('T'|'t')('O'|'o');

KEYWORD_1 : '(';

KEYWORD_2 : ')';

KEYWORD_3 : '*';

KEYWORD_4 : '+';

KEYWORD_5 : ',';

KEYWORD_6 : '-';

KEYWORD_7 : '.';

KEYWORD_8 : ':';

KEYWORD_9 : ';';

KEYWORD_10 : '[';

KEYWORD_11 : ']';

KEYWORD_12 : '{';

KEYWORD_13 : '}';



RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '--' ~(('\n'|'\r'))* ('\r'? '\n')?;

fragment RULE_EXPONENT : ('e'|'E') ('+'|'-')? RULE_DIGIT+;

fragment RULE_INT_EXPONENT : ('e'|'E') '+'? RULE_DIGIT+;

RULE_REAL_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* '.' RULE_DIGIT+ ('_' RULE_DIGIT+)* RULE_EXPONENT?;

RULE_INTEGER_LIT : RULE_DIGIT+ ('_' RULE_DIGIT+)* ('#' RULE_BASED_INTEGER '#' RULE_INT_EXPONENT?|RULE_INT_EXPONENT?);

fragment RULE_DIGIT : '0'..'9';

fragment RULE_EXTENDED_DIGIT : ('0'..'9'|'a'..'f'|'A'..'F');

fragment RULE_BASED_INTEGER : RULE_EXTENDED_DIGIT ('_'? RULE_EXTENDED_DIGIT)*;

RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;



