grammar alpha;
//https://github.com/bkiers/tiny-language-antlr4/blob/master/src/main/antlr4/tl/antlr4/TL.g4
//https://github.com/antlr/grammars-v4
language
    :START
    (globalStatements|function)*
    END;

/*
=============================================
 SUCH PARSING!
=============================================
*/

// expressions are true/false statements
expression
 :  '-' 						expression 					#minusExpression
 | NOT  						expression 					#notExpression
 | expression MULTIPLY 			expression 					#multiplyExpression
 | expression DIVIDE 			expression 					#divideExpression
 | expression MODULO			expression 					#moduloExpression
 | expression PLUS 				expression 					#plusExpression
 | expression MINUS 			expression 					#minusExpression
 | expression GREATEROREQUAL 	expression 					#greatOrRequalExpression
 | expression SMALLEROREQUAL 	expression 					#smallerOrRequalExpression
 | expression GREATERTHAN 		expression 					#greaterThanExpression
 | expression SMALLERTHAN 		expression 					#smallerThanExpression
 | expression EQUALTO 			expression 					#qualeToEpression
 | expression NOTEQUALTO 		expression 					#notEqualToExpression
 | expression AND 				expression 					#andExpression
 | expression OR 				expression 					#orExpression
 | LBRACKET expression RBRACKET 		   					#leftBracketExpressionRightBracketExpression
 | NUMBER								   					#numberExpression
 | CHAR_TYPE 												#charExpression
 | STRING_TYPE												#stringExpression
 | TRUE									   					#trueExpression
 | FALSE								   					#falseExpression
 | variable                                					#variableExpression
 | functionCall							   					#functionCallExpression
 | '\\+' (' ' (NUMBER|variable|CHAR_TYPE|STRING_TYPE))+     #addCustomExpression
 ;
  
 //--declarations--
 // Example: in a
 declaration: dataType ' ' TEXT;
 // Example: a = 2 | in a = 2 | in a = b
 declarationFill: (declaration | variable) ' = ' (expression);
 // Example: in a = 2;
 declarationFinal: declarationFill ';';
 // Example: in a = b | int a
 declarationFunction: declarationFill | declaration;
 
 
 //--functions--
 // Example: (in a, in b = 2)
 argumentsDeclaration: declarationFunction (', ' declarationFunction)*;
 // Example: (2, aap, "test")
 argumentsCall: (expression) (', ' (expression))*;
 // Example: ~st in ch~ func2 (a, 2, "test")
 functionDeclaration: '~' (dataType (' ' dataType)* '~ ')? TEXT ' ' LBRACKET argumentsDeclaration? RBRACKET;
 // Example: 4 * a = func (a, 2, "test");
 functionCall: (NUMBER ' * ')? ((declaration | variable) ((', ' (declaration | variable))* ' = '))? TEXT ' ' LBRACKET argumentsCall? RBRACKET ';';
 //--custom-functions--
 printFunction: PRINT ' ' LBRACKET expression RBRACKET ';';
 readFunction: (declaration | variable) ' = ' READ ' ' LBRACKET RBRACKET ';';
 throwFunction: THROW ' ' LBRACKET expression RBRACKET ';';
 catchFunction: CATCH ' ' LBRACKET variable RBRACKET;
 
 //--lines--
 globalStatements: declarationFinal | declaration ';';
 
 statement
     : (globalStatements 
     | '++' (variable) ';'
     | functionCall 
     | printFunction 
     | readFunction
     | throwBlock
     | ifStatement
     | returnMethod
     | whileMethod);
     
 returnMethod: RETURN ' ' (expression (', '(expression))*)? ';';
 
 //--blocks--
// throwBlock: TRY NEWLINE (statement )* TAB* throwFunction NEWLINE (statement )* TAB* CATCH;
// function: TAB functionDeclaration NEWLINE (TAB TAB statement NEWLINE)* (TAB TAB return NEWLINE)?;
 throwBlock: TRY (statement )*  throwFunction (statement )* catchFunction statement+ COFFEE;
 function:  functionDeclaration ( statement)* COFFEE;
 //if elseif and elseif
 // Example: if (expression) 
 //				if (expression) //nesteled
 //			ef (expression)
 //			el
 ifStatement: IF ' ' LBRACKET expression RBRACKET statement* 
     (ELSEIF ' ' LBRACKET expression RBRACKET statement*)* 
     (ELSE statement*)?
     COFFEE;
     
 whileMethod: WHILE ' ' LBRACKET expression RBRACKET statement* COFFEE;


//--collections--
 dataType: INTEGER | DOUBLE | STRING | CHAR | BOOLEAN;
 variable: TEXT | GLOBAL_TYPE;

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
PLUS: ' + ';
MINUS: ' - ';
MULTIPLY: ' * ';
DIVIDE: ' / ';
MODULO: ' % ';
LBRACKET: '(';
RBRACKET: ')';

SMALLERTHAN: ' < ';
GREATERTHAN: ' > ';
EQUALTO: ' == ';
NOTEQUALTO: ' != ';
SMALLEROREQUAL: ' <= ';
GREATEROREQUAL: ' >= ';

OR: ' || ';
AND: ' && ';
NOT: '! ';

//try catch
TRY: 'ty';
CATCH: 'ca';
THROW: 'th';

//compare
IF: 'if';
ELSEIF: 'ef';
ELSE: 'el';
WHILE: 'wh';

COFFEE: '☕' | '\u2615';

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
fragment DIGITS: [0-9];
fragment INTEGER_TYPE: [1-9] DIGITS* | '0';
NUMBER: INTEGER_TYPE ('.' DIGITS+)?;

//TEXT
CHAR_TYPE: '\'' . '\'';
//used for function & variable names
TEXT: [a-zA-Z_] [a-zA-Z_0-9]? [a-zA-Z_0-9]? [a-zA-Z_0-9]? [a-zA-Z_0-9]?; //max 5 chars
STRING_TYPE: '"' .? .? .? .? .? '"'; //max 5 chars

//TAB 
TAB: ('\u0009' | '\t') -> skip; //must enable tab character in inteljij
//COMMENTS
COMMENT: '/*' .*? '*/' -> skip;//Everything between /* and */
LINE_COMMENT: '//' ~[\r\n]* -> skip;//Everything after //
NEWLINE: '\n' -> skip;




