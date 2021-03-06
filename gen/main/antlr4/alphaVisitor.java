// Generated from C:/Users/Robin/Documents/School/Jaar 2/Kwartiel 3/Compilers/ProgrammeerTaal/src/main/antlr4\alpha.g4 by ANTLR 4.6
package main.antlr4;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link alphaParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface alphaVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link alphaParser#language}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage(alphaParser.LanguageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftBracketExpressionRightBracketExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpression(alphaParser.ValueExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code negativeExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNegativeExpression(alphaParser.NegativeExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code minusExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinusExpression(alphaParser.MinusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addCustomExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddCustomExpression(alphaParser.AddCustomExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code moduloExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModuloExpression(alphaParser.ModuloExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equalToExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqualToExpression(alphaParser.EqualToExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(alphaParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallerThanExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallerOrEqualExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallerOrEqualExpression(alphaParser.SmallerOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterThanExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplyExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code variableExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableExpression(alphaParser.VariableExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code divideExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDivideExpression(alphaParser.DivideExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code orExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrExpression(alphaParser.OrExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code andExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndExpression(alphaParser.AndExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterOrEqualExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusExpression(alphaParser.PlusExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notEqualToExpression}
	 * labeled alternative in {@link alphaParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(alphaParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#declarationFill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationFill(alphaParser.DeclarationFillContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#declarationFinal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationFinal(alphaParser.DeclarationFinalContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#declarationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationFunction(alphaParser.DeclarationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#argumentsDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#argumentsCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentsCall(alphaParser.ArgumentsCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#functionDeclaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionDeclaration(alphaParser.FunctionDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(alphaParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#printFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintFunction(alphaParser.PrintFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#readFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadFunction(alphaParser.ReadFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#throwFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowFunction(alphaParser.ThrowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#catchFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCatchFunction(alphaParser.CatchFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#globalStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalStatements(alphaParser.GlobalStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#declarationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatement(alphaParser.DeclarationStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code declarationStatementStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarationStatementStatement(alphaParser.DeclarationStatementStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plusPlusStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlusPlusStatement(alphaParser.PlusPlusStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallStatement(alphaParser.FunctionCallStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code printStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintStatement(alphaParser.PrintStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadStatement(alphaParser.ReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code throwBlockStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowBlockStatement(alphaParser.ThrowBlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ifStatementStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatementStatement(alphaParser.IfStatementStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code returnMethodStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code whileMethodStatement}
	 * labeled alternative in {@link alphaParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileMethodStatement(alphaParser.WhileMethodStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#returnMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnMethod(alphaParser.ReturnMethodContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#throwBlock}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrowBlock(alphaParser.ThrowBlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(alphaParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(alphaParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#whileMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileMethod(alphaParser.WhileMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numberValue}
	 * labeled alternative in {@link alphaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberValue(alphaParser.NumberValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charValue}
	 * labeled alternative in {@link alphaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharValue(alphaParser.CharValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringValue}
	 * labeled alternative in {@link alphaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringValue(alphaParser.StringValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trueValue}
	 * labeled alternative in {@link alphaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrueValue(alphaParser.TrueValueContext ctx);
	/**
	 * Visit a parse tree produced by the {@code falseValue}
	 * labeled alternative in {@link alphaParser#value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFalseValue(alphaParser.FalseValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(alphaParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link alphaParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(alphaParser.VariableContext ctx);
}