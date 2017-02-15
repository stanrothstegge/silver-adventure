grammar alpha;
//https://github.com/bkiers/tiny-language-antlr4/blob/master/src/main/antlr4/tl/antlr4/TL.g4
//https://github.com/antlr/grammars-v4
language
    :START NEWLINE
    (TAB globalStatements NEWLINE
    | function)*
    END;

program: TAB;

/*
=============================================
 SUCH PARSING!
=============================================
*/

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
 | functionCall
 ;
 
 valueType: CHAR_TYPE | STRING_TYPE | expression;
 
 // Example: "string" + a + 2 | \+ "string" a 2          for printing
 variablesPrint: (valueType | VARIABLE) (' + ' (valueType | VARIABLE))* | '\\+' ( ' ' valueType | VARIABLE)+;
 
 
 //--declarations--
 // Example: in a
 declaration: DATA_TYPE ' ' TEXT;
 // Example: a = 2 | in a = 2 | in a = b
 declarationFill: (declaration | VARIABLE) ' = ' (valueType | VARIABLE);
 // Example: in a = 2;
 declarationFinal: declarationFill ';';
 // Example: in a = b | int a
 declarationFunction: declarationFill | declaration;
 
 //--functions--
 // Example: (in a, in b = 2)
 argumentsDeclaration: declarationFunction (', ' declarationFunction)*;
 // Example: (2, aap, "test")
 argumentsCall: (valueType | VARIABLE) (', ' (valueType | VARIABLE))*;
 // Example: ~st in ch~ func2 (a, 2, "test")
 functionDeclaration: '~' (DATA_TYPE (' ' DATA_TYPE)* '~')? ' ' TEXT ' ' LBRACKET argumentsDeclaration? RBRACKET;
 // Example: 4 * a = func (a, 2, "test");
 functionCall: (INTEGER_TYPE ' * ')? ((declaration | VARIABLE) (', ' (declaration | VARIABLE)) ' = ')? TEXT ' ' LBRACKET argumentsCall? RBRACKET ';';
 
 //--custom-functions--
 printFunction: PRINT ' ' LBRACKET variablesPrint? RBRACKET ';';
 readFunction: (declaration | VARIABLE) ' = ' READ ' ' LBRACKET RBRACKET ';';
 throwFunction: THROW ' ' LBRACKET variablesPrint RBRACKET ';';
 
 //--lines--
 globalStatements: declarationFinal | declaration ';';
 
 statement
 //before every statement, there are tabs. the number of tabs matter.
     : TAB*
     (globalStatements 
     | PLUS PLUS valueType ';'
     | functionCall 
     | printFunction 
     | readFunction
     | throwBlock
     | ifStatement
     | while) 
     NEWLINE;
     
 return: RETURN (VARIABLE | valueType (', '(VARIABLE | valueType))*)? ';' NEWLINE;
 
 //--blocks--
 throwBlock: TRY NEWLINE (statement )* TAB* throwFunction NEWLINE (statement )* TAB* CATCH;
 function: TAB functionDeclaration NEWLINE (TAB TAB statement NEWLINE)* (TAB TAB return NEWLINE)?;
 
 //if elseif and elseif
 // Example: if (expression) 
 //				if (expression) //nesteled
 //			ef (expression)
 //			el
 ifStatement: IF ' ' LBRACKET expression RBRACKET NEWLINE statement* 
     (ELSEIF ' ' LBRACKET expression RBRACKET NEWLINE statement*)* 
     (ELSE statement*)?;
     
 while: WHILE ' ' LBRACKET expression RBRACKET NEWLINE statement*

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
WHILE: 'wh';

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
fragment INTEGER_TYPE: [1-9] DIGIT* | '0';
fragment DIGIT: [0-9];
NUMBER: INTEGER_TYPE ('.' DIGIT+)?;

//TEXT 
CHAR_TYPE: '\'' . '\'';
//used for function & variable names
TEXT: [a-zA-Z_] [a-zA-Z_0-9]? [a-zA-Z_0-9]? [a-zA-Z_0-9]? [a-zA-Z_0-9]?; //max 5 chars
STRING_TYPE: '"' .? .? .? .? .? '"'; //max 5 chars

//TAB 
TAB: '\u0009' | '\t'; //must enable tab character in inteljij
//COMMENTS
COMMENT: '/*' .*? '*/' -> skip;//Everything between /* and */
LINE_COMMENT: '//' ~[\r\n]* -> skip;//Everything after //
NEWLINE: '\n';



//--collections--
fragment DATA_TYPE: INTEGER | DOUBLE | STRING | CHAR | BOOLEAN;
fragment VARIABLE: TEXT | GLOBAL_TYPE;
