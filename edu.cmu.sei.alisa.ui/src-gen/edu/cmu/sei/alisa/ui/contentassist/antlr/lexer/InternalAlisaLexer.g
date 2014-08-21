
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




KEYWORD_81 : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('D'|'d')('E'|'e')('T'|'t')('A'|'a')('I'|'i')('L'|'l')('S'|'s');

KEYWORD_80 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_77 : ('E'|'e')('L'|'l')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_78 : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('S'|'s');

KEYWORD_79 : ('V'|'v')('E'|'e')('R'|'r')('I'|'i')('F'|'f')('I'|'i')('C'|'c')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_74 : ('D'|'d')('E'|'e')('S'|'s')('C'|'c')('R'|'r')('I'|'i')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_75 : ('R'|'r')('E'|'e')('Q'|'q')('U'|'u')('I'|'i')('R'|'r')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_76 : ('S'|'s')('T'|'t')('A'|'a')('K'|'k')('E'|'e')('H'|'h')('O'|'o')('L'|'l')('D'|'d')('E'|'e')('R'|'r');

KEYWORD_67 : ('A'|'a')('S'|'s')('S'|'s')('U'|'u')('M'|'m')('P'|'p')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_68 : ('C'|'c')('O'|'o')('N'|'n')('S'|'s')('T'|'t')('R'|'r')('A'|'a')('I'|'i')('N'|'n')('T'|'t');

KEYWORD_69 : ('D'|'d')('E'|'e')('C'|'c')('O'|'o')('M'|'m')('P'|'p')('O'|'o')('S'|'s')('E'|'e')('D'|'d');

KEYWORD_70 : ('D'|'d')('E'|'e')('C'|'c')('O'|'o')('M'|'m')('P'|'p')('O'|'o')('S'|'s')('E'|'e')('S'|'s');

KEYWORD_71 : ('I'|'i')('N'|'n')('P'|'p')('R'|'r')('O'|'o')('G'|'g')('R'|'r')('E'|'e')('S'|'s')('S'|'s');

KEYWORD_72 : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('L'|'l')'-'('T'|'t')('Y'|'y')('P'|'p')('E'|'e');

KEYWORD_73 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e')('D'|'d');

KEYWORD_58 : ('A'|'a')('S'|'s')('S'|'s')('E'|'e')('R'|'r')('T'|'t')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_59 : ('A'|'a')('U'|'u')('T'|'t')('O'|'o')('M'|'m')('A'|'a')('T'|'t')('I'|'i')('C'|'c');

KEYWORD_60 : ('C'|'c')('O'|'o')('M'|'m')('P'|'p')('L'|'l')('E'|'e')('T'|'t')('E'|'e')('D'|'d');

KEYWORD_61 : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t')('S'|'s');

KEYWORD_62 : ('G'|'g')('U'|'u')('A'|'a')('R'|'r')('A'|'a')('N'|'n')('T'|'t')('E'|'e')('E'|'e');

KEYWORD_63 : ('I'|'i')('N'|'n')('V'|'v')('A'|'a')('R'|'r')('I'|'i')('A'|'a')('N'|'n')('T'|'t');

KEYWORD_64 : ('R'|'r')('A'|'a')('T'|'t')('I'|'i')('O'|'o')('N'|'n')('A'|'a')('L'|'l')('E'|'e');

KEYWORD_65 : ('R'|'r')('E'|'e')('F'|'f')('E'|'e')('R'|'r')('E'|'e')('N'|'n')('C'|'c')('E'|'e');

KEYWORD_66 : ('S'|'s')('C'|'c')('H'|'h')('E'|'e')('D'|'d')('U'|'u')('L'|'l')('E'|'e')('D'|'d');

KEYWORD_53 : ('A'|'a')('C'|'c')('T'|'t')('I'|'i')('V'|'v')('I'|'i')('T'|'t')('Y'|'y');

KEYWORD_54 : ('A'|'a')('N'|'n')('A'|'a')('L'|'l')('Y'|'y')('S'|'s')('I'|'i')('S'|'s');

KEYWORD_55 : ('A'|'a')('S'|'s')('S'|'s')('I'|'i')('G'|'g')('N'|'n')('E'|'e')('D'|'d');

KEYWORD_56 : ('D'|'d')('O'|'o')('C'|'c')('U'|'u')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_57 : ('V'|'v')('E'|'e')('R'|'r')('I'|'i')('F'|'f')('I'|'i')('E'|'e')('D'|'d');

KEYWORD_42 : ('A'|'a')('L'|'l')('I'|'i')('A'|'a')('S'|'s')('E'|'e')('S'|'s');

KEYWORD_43 : ('C'|'c')('O'|'o')('M'|'m')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_44 : ('E'|'e')('L'|'l')('E'|'e')('M'|'m')('E'|'e')('N'|'n')('T'|'t');

KEYWORD_45 : ('E'|'e')('V'|'v')('O'|'o')('L'|'l')('V'|'v')('E'|'e')('S'|'s');

KEYWORD_46 : ('I'|'i')('M'|'m')('P'|'p')('O'|'o')('R'|'r')('T'|'t')('S'|'s');

KEYWORD_47 : ('L'|'l')('I'|'i')('B'|'b')('R'|'r')('A'|'a')('R'|'r')('Y'|'y');

KEYWORD_48 : ('L'|'l')('O'|'o')('G'|'g')('F'|'f')('I'|'i')('L'|'l')('E'|'e');

KEYWORD_49 : ('R'|'r')('E'|'e')('F'|'f')('I'|'i')('N'|'n')('E'|'e')('S'|'s');

KEYWORD_50 : ('T'|'t')('E'|'e')('S'|'s')('T'|'t')('I'|'i')('N'|'n')('G'|'g');

KEYWORD_51 : ('U'|'u')('N'|'n')('K'|'k')('N'|'n')('O'|'o')('W'|'w')('N'|'n');

KEYWORD_52 : ('V'|'v')('E'|'e')('R'|'r')('S'|'s')('I'|'i')('O'|'o')('N'|'n');

KEYWORD_32 : ('D'|'d')('E'|'e')('S'|'s')('I'|'i')('G'|'g')('N'|'n');

KEYWORD_33 : ('H'|'h')('A'|'a')('Z'|'z')('A'|'a')('R'|'r')('D'|'d');

KEYWORD_34 : ('I'|'i')('S'|'s')('S'|'s')('U'|'u')('E'|'e')('S'|'s');

KEYWORD_35 : ('M'|'m')('A'|'a')('N'|'n')('U'|'u')('A'|'a')('L'|'l');

KEYWORD_36 : ('M'|'m')('E'|'e')('T'|'t')('H'|'h')('O'|'o')('D'|'d');

KEYWORD_37 : ('O'|'o')('U'|'u')('T'|'t')('P'|'p')('U'|'u')('T'|'t');

KEYWORD_38 : ('R'|'r')('E'|'e')('S'|'s')('U'|'u')('L'|'l')('T'|'t');

KEYWORD_39 : ('R'|'r')('E'|'e')('V'|'v')('I'|'i')('E'|'e')('W'|'w');

KEYWORD_40 : ('S'|'s')('T'|'t')('A'|'a')('T'|'t')('U'|'u')('S'|'s');

KEYWORD_41 : ('S'|'s')('Y'|'y')('S'|'s')('T'|'t')('E'|'e')('M'|'m');

KEYWORD_25 : ('F'|'f')('O'|'o')('U'|'u')('N'|'n')('D'|'d');

KEYWORD_26 : ('G'|'g')('O'|'o')('A'|'a')('L'|'l')('S'|'s');

KEYWORD_27 : ('I'|'i')('N'|'n')('P'|'p')('U'|'u')('T'|'t');

KEYWORD_28 : ('M'|'m')('O'|'o')('D'|'d')('E'|'e')('L'|'l');

KEYWORD_29 : ('N'|'n')('O'|'o')('T'|'t')('E'|'e')('S'|'s');

KEYWORD_30 : ('S'|'s')('T'|'t')('A'|'a')('T'|'t')('E'|'e');

KEYWORD_31 : ('T'|'t')('I'|'i')('T'|'t')('L'|'l')('E'|'e');

KEYWORD_19 : ('D'|'d')('A'|'a')('T'|'t')('E'|'e');

KEYWORD_20 : ('F'|'f')('A'|'a')('I'|'i')('L'|'l');

KEYWORD_21 : ('G'|'g')('O'|'o')('A'|'a')('L'|'l');

KEYWORD_22 : ('P'|'p')('A'|'a')('S'|'s')('S'|'s');

KEYWORD_23 : ('R'|'r')('O'|'o')('L'|'l')('E'|'e');

KEYWORD_24 : ('W'|'w')('I'|'i')('T'|'t')('H'|'h');

KEYWORD_13 : ('A'|'a')('N'|'n')('D'|'d');

KEYWORD_14 : ('E'|'e')('N'|'n')('D'|'d');

KEYWORD_15 : ('F'|'f')('O'|'o')('R'|'r');

KEYWORD_16 : ('R'|'r')('E'|'e')('Q'|'q');

KEYWORD_17 : ('S'|'s')('E'|'e')('E'|'e');

KEYWORD_18 : ('U'|'u')('R'|'r')('L'|'l');

KEYWORD_7 : ':'':';

KEYWORD_8 : ('B'|'b')('Y'|'y');

KEYWORD_9 : ('I'|'i')('N'|'n');

KEYWORD_10 : ('O'|'o')('F'|'f');

KEYWORD_11 : ('O'|'o')('R'|'r');

KEYWORD_12 : ('T'|'t')('O'|'o');

KEYWORD_1 : '#';

KEYWORD_2 : '*';

KEYWORD_3 : ',';

KEYWORD_4 : '.';

KEYWORD_5 : ':';

KEYWORD_6 : ';';



RULE_STRING : ('"' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'"')))* '"'|'\'' ('\\' ('b'|'t'|'n'|'f'|'r'|'u'|'"'|'\''|'\\')|~(('\\'|'\'')))* '\'');

RULE_ID : ('a'..'z'|'A'..'Z') ('_'? ('a'..'z'|'A'..'Z'|'0'..'9'))*;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_INT : ('0'..'9')+;

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_ANY_OTHER : .;



