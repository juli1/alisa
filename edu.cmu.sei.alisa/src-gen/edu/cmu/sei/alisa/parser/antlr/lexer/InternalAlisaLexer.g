
/*
* generated by Xtext
*/
lexer grammar InternalAlisaLexer;


@header {
package edu.cmu.sei.alisa.parser.antlr.lexer;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.parser.antlr.Lexer;
}




KEYWORD_81 : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('D'|'d')('E'|'e')('T'|'t')('A'|'a')('I'|'i')('L'|'l')('S'|'s');

KEYWORD_80 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_77 : ('E'|'e')('L'|'l')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_78 : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('S'|'s');

KEYWORD_79 : ('V'|'v')('E'|'e')('R'|'r')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_73 : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('R'|'r')('I'|'i')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_74 : ('D'|'d')('E'|'e')('V'|'v')('E'|'e')('L'|'l')('O'|'o')('P'|'p')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_75 : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_76 : ('S'|'s')('T'|'t')('A'|'a')('K'|'k')('E'|'e')('H'|'h')('O'|'o')('L'|'l')('D'|'d')('E'|'e')('R'|'r');

KEYWORD_66 : ('A'|'a')('S'|'s')('S'|'s')('U'|'u')('M'|'m')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_67 : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('R'|'r')('A'|'a')('I'|'i')('N'|'n')('T'|'t');

KEYWORD_68 : ('D'|'d')('E'|'e')('C'|'c')('O'|'o')('M'|'m')('P'|'p')('O'|'o')('S'|'s')('E'|'e')('D'|'d');

KEYWORD_69 : ('D'|'d')('E'|'e')('C'|'c')('O'|'o')('M'|'m')('P'|'p')('O'|'o')('S'|'s')('E'|'e')('S'|'s');

KEYWORD_70 : ('I'|'i')('N'|'n')('P'|'p')('R'|'r')('O'|'o')('G'|'g')('R'|'r')('E'|'e')('S'|'s')('S'|'s');

KEYWORD_71 : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('L'|'l')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_72 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')('D'|'d');

KEYWORD_57 : ('A'|'a')('S'|'s')('S'|'s')('E'|'e')('R'|'r')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_58 : ('A'|'a')('U'|'u')('T'|'t')('O'|'o')('M'|'m')('A'|'a')('T'|'t')('I'|'i')('C'|'c');

KEYWORD_59 : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('L'|'l')('E'|'e')('T'|'t')('E'|'e')('D'|'d');

KEYWORD_60 : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('S'|'s');

KEYWORD_61 : ('G'|'g')('U'|'u')('A'|'a')('R'|'r')('A'|'a')('N'|'n')('T'|'t')('E'|'e')('E'|'e');

KEYWORD_62 : ('I'|'i')('N'|'n')('V'|'v')('A'|'a')('R'|'r')('I'|'i')('A'|'a')('N'|'n')('T'|'t');

KEYWORD_63 : ('R'|'r')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l')('E'|'e');

KEYWORD_64 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e');

KEYWORD_65 : ('S'|'s')('C'|'c')('H'|'h')('E'|'e')('D'|'d')('U'|'u')('L'|'l')('E'|'e')('D'|'d');

KEYWORD_52 : ('A'|'a')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('I'|'i')('T'|'t')('Y'|'y');

KEYWORD_53 : ('A'|'a')('N'|'n')('A'|'a')('L'|'l')('Y'|'y')('S'|'s')('I'|'i')('S'|'s');

KEYWORD_54 : ('A'|'a')('S'|'s')('S'|'s')('I'|'i')('G'|'g')('N'|'n')('E'|'e')('D'|'d');

KEYWORD_55 : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_56 : ('V'|'v')('E'|'e')('R'|'r')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('D'|'d');

KEYWORD_41 : ('A'|'a')('L'|'l')('I'|'i')('A'|'a')('S'|'s')('E'|'e')('S'|'s');

KEYWORD_42 : ('C'|'c')('O'|'o')('M'|'m')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_43 : ('E'|'e')('L'|'l')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_44 : ('E'|'e')('V'|'v')('O'|'o')('L'|'l')('V'|'v')('E'|'e')('S'|'s');

KEYWORD_45 : ('I'|'i')('M'|'m')('P'|'p')('O'|'o')('R'|'r')('T'|'t')('S'|'s');

KEYWORD_46 : ('L'|'l')('I'|'i')('B'|'b')('R'|'r')('A'|'a')('R'|'r')('Y'|'y');

KEYWORD_47 : ('L'|'l')('O'|'o')('G'|'g')('F'|'f')('I'|'i')('L'|'l')('E'|'e');

KEYWORD_48 : ('R'|'r')('E'|'e')('F'|'f')('I'|'i')('N'|'n')('E'|'e')('S'|'s');

KEYWORD_49 : ('T'|'t')('E'|'e')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_50 : ('U'|'u')('N'|'n')('K'|'k')('N'|'n')('O'|'o')('W'|'w')('N'|'n');

KEYWORD_51 : ('V'|'v')('E'|'e')('R'|'r')('S'|'s')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_31 : ('D'|'d')('E'|'e')('S'|'s')('I'|'i')('G'|'g')('N'|'n');

KEYWORD_32 : ('H'|'h')('A'|'a')('Z'|'z')('A'|'a')('R'|'r')('D'|'d');

KEYWORD_33 : ('I'|'i')('S'|'s')('S'|'s')('U'|'u')('E'|'e')('S'|'s');

KEYWORD_34 : ('M'|'m')('A'|'a')('N'|'n')('U'|'u')('A'|'a')('L'|'l');

KEYWORD_35 : ('M'|'m')('E'|'e')('T'|'t')('H'|'h')('O'|'o')('D'|'d');

KEYWORD_36 : ('O'|'o')('U'|'u')('T'|'t')('P'|'p')('U'|'u')('T'|'t');

KEYWORD_37 : ('R'|'r')('E'|'e')('S'|'s')('U'|'u')('L'|'l')('T'|'t');

KEYWORD_38 : ('R'|'r')('E'|'e')('V'|'v')('I'|'i')('E'|'e')('W'|'w');

KEYWORD_39 : ('S'|'s')('T'|'t')('A'|'a')('T'|'t')('U'|'u')('S'|'s');

KEYWORD_40 : ('S'|'s')('Y'|'y')('S'|'s')('T'|'t')('E'|'e')('M'|'m');

KEYWORD_24 : ('F'|'f')('O'|'o')('U'|'u')('N'|'n')('D'|'d');

KEYWORD_25 : ('G'|'g')('O'|'o')('A'|'a')('L'|'l')('S'|'s');

KEYWORD_26 : ('I'|'i')('N'|'n')('P'|'p')('U'|'u')('T'|'t');

KEYWORD_27 : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('L'|'l');

KEYWORD_28 : ('N'|'n')('O'|'o')('T'|'t')('E'|'e')('S'|'s');

KEYWORD_29 : ('S'|'s')('T'|'t')('A'|'a')('T'|'t')('E'|'e');

KEYWORD_30 : ('T'|'t')('I'|'i')('T'|'t')('L'|'l')('E'|'e');

KEYWORD_18 : ('D'|'d')('A'|'a')('T'|'t')('E'|'e');

KEYWORD_19 : ('F'|'f')('A'|'a')('I'|'i')('L'|'l');

KEYWORD_20 : ('G'|'g')('O'|'o')('A'|'a')('L'|'l');

KEYWORD_21 : ('P'|'p')('A'|'a')('S'|'s')('S'|'s');

KEYWORD_22 : ('R'|'r')('O'|'o')('L'|'l')('E'|'e');

KEYWORD_23 : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

KEYWORD_12 : ('A'|'a')('N'|'n')('D'|'d');

KEYWORD_13 : ('E'|'e')('N'|'n')('D'|'d');

KEYWORD_14 : ('F'|'f')('O'|'o')('R'|'r');

KEYWORD_15 : ('R'|'r')('E'|'e')('Q'|'q');

KEYWORD_16 : ('S'|'s')('E'|'e')('E'|'e');

KEYWORD_17 : ('U'|'u')('R'|'r')('L'|'l');

KEYWORD_6 : ':'':';

KEYWORD_7 : ('B'|'b')('Y'|'y');

KEYWORD_8 : ('I'|'i')('N'|'n');

KEYWORD_9 : ('O'|'o')('F'|'f');

KEYWORD_10 : ('O'|'o')('R'|'r');

KEYWORD_11 : ('T'|'t')('O'|'o');

KEYWORD_1 : '#';

KEYWORD_2 : ',';

KEYWORD_3 : '.';

KEYWORD_4 : ':';

KEYWORD_5 : ';';



RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ANY_OTHER : .;



