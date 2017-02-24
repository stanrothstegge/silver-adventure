// Generated from E:/Dropbox/Saxion/Jaar 2/Kwartiel 3/Compilers & Operating Systems/Practicumopdracht1/src/main/antlr4\alpha.g4 by ANTLR 4.6
package main.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link alphaParser}.
 */
public interface alphaListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link alphaParser#language}.
	 * @param ctx the parse tree
	 */
	void enterLanguage(alphaParser.LanguageContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#language}.
	 * @param ctx the parse tree
	 */
	void exitLanguage(alphaParser.LanguageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftBracketExpressionRightBracketExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftBracketExpressionRightBracketExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMinusExpression(alphaParser.MinusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMinusExpression(alphaParser.MinusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addCustomExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddCustomExpression(alphaParser.AddCustomExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addCustomExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddCustomExpression(alphaParser.AddCustomExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterModuloExpression(alphaParser.ModuloExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitModuloExpression(alphaParser.ModuloExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNumberExpression(alphaParser.NumberExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numberExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNumberExpression(alphaParser.NumberExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(alphaParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(alphaParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code falseExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFalseExpression(alphaParser.FalseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code falseExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFalseExpression(alphaParser.FalseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerThanExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerThanExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMultiplyExpression(alphaParser.MultiplyExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterVariableExpression(alphaParser.VariableExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitVariableExpression(alphaParser.VariableExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterDivideExpression(alphaParser.DivideExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitDivideExpression(alphaParser.DivideExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterOrExpression(alphaParser.OrExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitOrExpression(alphaParser.OrExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAndExpression(alphaParser.AndExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAndExpression(alphaParser.AndExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterStringExpression(alphaParser.StringExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitStringExpression(alphaParser.StringExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trueExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterTrueExpression(alphaParser.TrueExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trueExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitTrueExpression(alphaParser.TrueExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallerOrRequalExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterSmallerOrRequalExpression(alphaParser.SmallerOrRequalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallerOrRequalExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitSmallerOrRequalExpression(alphaParser.SmallerOrRequalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code greaterOrEqualExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code greaterOrEqualExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterCharExpression(alphaParser.CharExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitCharExpression(alphaParser.CharExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPlusExpression(alphaParser.PlusExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPlusExpression(alphaParser.PlusExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notEqualToExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notEqualToExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equaleToExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterEqualeToExpression(alphaParser.EqualeToExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equaleToExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitEqualeToExpression(alphaParser.EqualeToExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(alphaParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(alphaParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#declarationFill}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationFill(alphaParser.DeclarationFillContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#declarationFill}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationFill(alphaParser.DeclarationFillContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#declarationFinal}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationFinal(alphaParser.DeclarationFinalContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#declarationFinal}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationFinal(alphaParser.DeclarationFinalContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#declarationFunction}.
	 * @param ctx the parse tree
	 */
	void enterDeclarationFunction(alphaParser.DeclarationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#declarationFunction}.
	 * @param ctx the parse tree
	 */
	void exitDeclarationFunction(alphaParser.DeclarationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#argumentsDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#argumentsDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#argumentsCall}.
	 * @param ctx the parse tree
	 */
	void enterArgumentsCall(alphaParser.ArgumentsCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#argumentsCall}.
	 * @param ctx the parse tree
	 */
	void exitArgumentsCall(alphaParser.ArgumentsCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(alphaParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(alphaParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(alphaParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(alphaParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void enterPrintFunction(alphaParser.PrintFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#printFunction}.
	 * @param ctx the parse tree
	 */
	void exitPrintFunction(alphaParser.PrintFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#readFunction}.
	 * @param ctx the parse tree
	 */
	void enterReadFunction(alphaParser.ReadFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#readFunction}.
	 * @param ctx the parse tree
	 */
	void exitReadFunction(alphaParser.ReadFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#throwFunction}.
	 * @param ctx the parse tree
	 */
	void enterThrowFunction(alphaParser.ThrowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#throwFunction}.
	 * @param ctx the parse tree
	 */
	void exitThrowFunction(alphaParser.ThrowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#catchFunction}.
	 * @param ctx the parse tree
	 */
	void enterCatchFunction(alphaParser.CatchFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#catchFunction}.
	 * @param ctx the parse tree
	 */
	void exitCatchFunction(alphaParser.CatchFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#globalStatements}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatements(alphaParser.GlobalStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#globalStatements}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatements(alphaParser.GlobalStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterGlobalStatement(alphaParser.GlobalStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitGlobalStatement(alphaParser.GlobalStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plusPlusStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPlusPlusStatement(alphaParser.PlusPlusStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plusPlusStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPlusPlusStatement(alphaParser.PlusPlusStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallStatement(alphaParser.FunctionCallStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallStatement(alphaParser.FunctionCallStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterPrintStatement(alphaParser.PrintStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitPrintStatement(alphaParser.PrintStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(alphaParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(alphaParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code throwBlockStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterThrowBlockStatement(alphaParser.ThrowBlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code throwBlockStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitThrowBlockStatement(alphaParser.ThrowBlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ifStatementStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatementStatement(alphaParser.IfStatementStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ifStatementStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatementStatement(alphaParser.IfStatementStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code returnMethodStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code returnMethodStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code whileMethodStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterWhileMethodStatement(alphaParser.WhileMethodStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code whileMethodStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitWhileMethodStatement(alphaParser.WhileMethodStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#returnMethod}.
	 * @param ctx the parse tree
	 */
	void enterReturnMethod(alphaParser.ReturnMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#returnMethod}.
	 * @param ctx the parse tree
	 */
	void exitReturnMethod(alphaParser.ReturnMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#throwBlock}.
	 * @param ctx the parse tree
	 */
	void enterThrowBlock(alphaParser.ThrowBlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#throwBlock}.
	 * @param ctx the parse tree
	 */
	void exitThrowBlock(alphaParser.ThrowBlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(alphaParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(alphaParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(alphaParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(alphaParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#whileMethod}.
	 * @param ctx the parse tree
	 */
	void enterWhileMethod(alphaParser.WhileMethodContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#whileMethod}.
	 * @param ctx the parse tree
	 */
	void exitWhileMethod(alphaParser.WhileMethodContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(alphaParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(alphaParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(alphaParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(alphaParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link alphaParser#global_type}.
	 * @param ctx the parse tree
	 */
	void enterGlobal_type(alphaParser.Global_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link alphaParser#global_type}.
	 * @param ctx the parse tree
	 */
	void exitGlobal_type(alphaParser.Global_typeContext ctx);
}