grammar alpha;
//https://github.com/bkiers/tiny-language-antlr4/blob/master/src/main/antlr4/tl/antlr4/TL.g4
//https://github.com/antlr/grammars-v4
//https://en.wikipedia.org/wiki/Java_bytecode_instruction_listings
//http://jasmin.sourceforge.net/instructions.html
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
 :  '-' 						expression 					#negativeExpression
 | NOT  						expression 					#notExpression
 | expression GREATEROREQUAL 	expression 					#greaterOrEqualExpression
 | expression SMALLEROREQUAL 	expression 					#smallerOrEqualExpression
 | expression GREATERTHAN 		expression 					#greaterThanExpression
 | expression SMALLERTHAN 		expression 					#smallerThanExpression
 | expression EQUALTO 			expression 					#equalToExpression
 | expression NOTEQUALTO 		expression 					#notEqualToExpression
 | expression AND 				expression 					#andExpression
 | expression OR 				expression 					#orExpression
 | expression MULTIPLY 			expression 					#multiplyExpression
 | expression DIVIDE 			expression 					#divideExpression
 | expression MODULO			expression 					#moduloExpression
 | expression MINUS 			expression 					#minusExpression
 | expression PLUS 				expression 					#plusExpression
 | LBRACKET expression RBRACKET 		   					#leftBracketExpressionRightBracketExpression
 | value													#valueExpression
 | variable                                					#variableExpression
 | functionCall							   					#functionCallExpression
 | '\\+' (' ' (expression))+     							#addCustomExpression
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

declarationStatement: declarationFinal | declaration ';';

 statement
     : declarationStatement     #declarationStatementStatement
     | '++' (variable) ';'		#plusPlusStatement
     | functionCall 			#functionCallStatement
     | printFunction 			#printStatement
     | readFunction				#readStatement
     | throwBlock				#throwBlockStatement
     | ifStatement				#ifStatementStatement
     | returnMethod				#returnMethodStatement
     | whileMethod				#whileMethodStatement
     ;
     
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
value: NUMBER			#numberValue
     | CHAR_TYPE 		#charValue
     | STRING_TYPE		#stringValue
     | TRUE				#trueValue
     | FALSE			#falseValue
     ;
dataType: INTEGER | DOUBLE | STRING | CHAR | BOOLEAN;
variable: TEXT;

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
TAB: [ \t\r\u000C] -> skip; //must enable tab character in inteljij
//COMMENTS
COMMENT: '/*' .*? '*/' -> skip;//Everything between /* and */
LINE_COMMENT: '//' ~[\r\n]* -> skip;//Everything after //
NEWLINE: '\n' -> skip;




