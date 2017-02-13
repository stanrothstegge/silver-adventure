grammar alpha;
//https://github.com/bkiers/tiny-language-antlr4/blob/master/src/main/antlr4/tl/antlr4/TL.g4
//https://github.com/antlr/grammars-v4
program: NUMBER;

// expressions are true/false statements
expression
 : MINUS ' ' expression
 | NOT ' ' expression
 | expression ' ' MULTIPLY ' ' expression
 | expression ' ' DIVIDE ' ' expression
 | expression ' ' MODULO ' ' expression
 | expression ' ' PLUS ' ' expression
 | expression ' ' MINUS ' ' expression
 | expression ' ' GREATEROREQUAL ' ' expression
 | expression ' ' SMALLEROREQUAL ' ' expression
 | expression ' ' GREATERTHAN ' ' expression
 | expression ' ' SMALLERTHAN ' ' expression
 | expression ' ' EQUALTO ' ' expression
 | expression ' ' NOTEQUALTO ' ' expression
 | expression ' ' AND ' ' expression
 | expression ' ' OR ' ' expression
 | NUMBER
 | TRUE
 | FALSE
 | FUNCTION_CALL
 ;
 
//if elseif and elseif
// Example: if (expression) 
//				if (expression) //nesteled
//			ef (expression)
//			el
ifStatement: IF ' ' LBRACKET expression RBRACKET (ELSEIF ' ' LBRACKET expression RBRACKET)* ELSE?;

/*
=============================================
 SUCH LEXING!
=============================================
*/

//data types
INTEGER: 'in';
DOUBLE: 'do';
STRING: 'st';
CHAR: 'ch';
BOOLEAN: 'bo';
TRUE: 'tr';
FALSE: 'fs';

//Math & Expressions
PLUS: '+';
MINUS: '-';
MULTIPLY: '*';
DIVIDE: '/';
MODULO: '%';
LBRACKET: '(';
RBRACKET: ')';

SMALLERTHAN: '<';
GREATERTHAN: '>';
EQUALTO: '==';
NOTEQUALTO: '!=';
SMALLEROREQUAL: '<=';
GREATEROREQUAL: '>=';

OR: '||';
AND: '&&';
NOT: '!';

//try catch
TRY: 'tr';
CATCH: 'ca';
THROW: 'th';

//compare
IF: 'if';
ELSEIF: 'ef';
ELSE: 'el';

//global variables
THIS: 'gl';
GLOBAL_TYPE: THIS '.' TEXT;

//in & out
PRINT: 'sp';
READ: 'he';
RETURN: 're'; //return function

//START & END
START: 'Alpha';
END: 'Omega';

//Numbers
INTEGER_TYPE: [1-9] DIGIT* | '0';
DIGIT: [0-9];
NUMBER : INTEGER_TYPE ('.' DIGIT+)?;

//TEXT 
CHAR_TYPE: '\'' . '\'';
//used for function & variable names
TEXT: [a-zA-Z_] [a-zA-Z_0-9]? [a-zA-Z_0-9]? [a-zA-Z_0-9]? [a-zA-Z_0-9]?; //max 5 chars
STRING_TYPE: '"' .? .? .? .? .? '"'; //max 5 chars

//TAB 
TAB: '\u0009'; //must enable tab character in inteljij
//COMMENTS
COMMENT: '/*' .*? '*/' -> skip;//Everything between /* and */
LINE_COMMENT: '//' ~[\r\n]* -> skip;//Everything after //

/*
=============================================
 SUCH PARSING!
=============================================
*/

//--collections--
DATA_TYPE: INTEGER | DOUBLE | STRING | CHAR | BOOLEAN;
VALUE_TYPE: CHAR_TYPE | STRING_TYPE | NUMBER | TRUE | FALSE;
VARIABLE: TEXT | GLOBAL_TYPE;
// Example: "string" + a + 2 | \+ "string" a 2          for printing
VARIABLES_PRINT: ((VALUE_TYPE | VARIABLE) (' + ' (VALUE_TYPE | VARIABLE))*)? | '\\+' ( ' ' VALUE_TYPE | VARIABLE)+;


//--declarations--
// Example: in a
DECLARATION: DATA_TYPE ' ' TEXT;
// Example: a = 2 | in a = 2 | in a = b
FILLING: (DECLARATION | VARIABLE) ' = ' (VALUE_TYPE | VARIABLE);
// Example: in a = 2;
DECLARATION_FINAL: FILLING ';';
// Example: in a = b | int a
DECLARATION_FUNCTION: FILLING | DECLARATION;

//--functions--
// Example: (in a, in b = 2)
ARGUMENTS_DECLARATION: (DECLARATION_FUNCTION (', ' DECLARATION_FUNCTION)*)?;
// Example: (2, aap, "test")
ARGUMENTS_CALL: ((VALUE_TYPE | VARIABLE) (', ' (VALUE_TYPE | VARIABLE))*)?;
// Example: ~st in ch~ func2 (a, 2, "test")
FUNCTION_DECLARATION: '~' (DATA_TYPE (' ' DATA_TYPE)* '~')? ' ' TEXT ' ' LBRACKET ARGUMENTS_DECLARATION RBRACKET;
// Example: 4 * a = func (a, 2, "test");
FUNCTION_CALL: (INTEGER_TYPE ' * ')? ((DECLARATION | VARIABLE) (', ' (DECLARATION | VARIABLE)) ' = ')? TEXT ' ' LBRACKET ARGUMENTS_CALL RBRACKET ';';

//--custom-functions--
PRINT_FUNCTION: PRINT ' ' LBRACKET VARIABLES_PRINT? RBRACKET ';';
READ_FUNCTION: (DECLARATION | VARIABLE) ' = ' READ ' ' LBRACKET RBRACKET ';';
THROW_FUNCTION: THROW ' ' LBRACKET VARIABLES_PRINT RBRACKET ';';