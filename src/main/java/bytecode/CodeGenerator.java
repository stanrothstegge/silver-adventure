package main.java.bytecode;


import main.antlr4.alphaBaseVisitor;
import main.antlr4.alphaParser;

import java.util.ArrayList;

public class CodeGenerator extends alphaBaseVisitor<ArrayList<String>> {
    @Override
    public ArrayList<String> visitLanguage(alphaParser.LanguageContext ctx) {
        return super.visitLanguage(ctx);
    }

    @Override
    public ArrayList<String> visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        return super.visitLeftBracketExpressionRightBracketExpression(ctx);
    }

    @Override
    public ArrayList<String> visitMinusExpression(alphaParser.MinusExpressionContext ctx) {
        return super.visitMinusExpression(ctx);
    }

    @Override
    public ArrayList<String> visitAddCustomExpression(alphaParser.AddCustomExpressionContext ctx) {
        return super.visitAddCustomExpression(ctx);
    }

    @Override
    public ArrayList<String> visitModuloExpression(alphaParser.ModuloExpressionContext ctx) {
        return super.visitModuloExpression(ctx);
    }

    @Override
    public ArrayList<String> visitNumberExpression(alphaParser.NumberExpressionContext ctx) {
        return super.visitNumberExpression(ctx);
    }

    @Override
    public ArrayList<String> visitEqualToExpression(alphaParser.EqualToExpressionContext ctx) {
        return super.visitEqualToExpression(ctx);
    }

    @Override
    public ArrayList<String> visitNotExpression(alphaParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public ArrayList<String> visitFalseExpression(alphaParser.FalseExpressionContext ctx) {
        return super.visitFalseExpression(ctx);
    }

    @Override
    public ArrayList<String> visitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx) {
        return super.visitSmallerThanExpression(ctx);
    }

    @Override
    public ArrayList<String> visitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx) {
        return super.visitMultiplyExpression(ctx);
    }

    @Override
    public ArrayList<String> visitSmallerOrEqualExpression(alphaParser.SmallerOrEqualExpressionContext ctx) {
        return super.visitSmallerOrEqualExpression(ctx);
    }

    @Override
    public ArrayList<String> visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx) {
        return super.visitGreaterThanExpression(ctx);
    }

    @Override
    public ArrayList<String> visitVariableExpression(alphaParser.VariableExpressionContext ctx) {
        return super.visitVariableExpression(ctx);
    }

    @Override
    public ArrayList<String> visitDivideExpression(alphaParser.DivideExpressionContext ctx) {
        return super.visitDivideExpression(ctx);
    }

    @Override
    public ArrayList<String> visitOrExpression(alphaParser.OrExpressionContext ctx) {
        return super.visitOrExpression(ctx);
    }

    @Override
    public ArrayList<String> visitAndExpression(alphaParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }

    @Override
    public ArrayList<String> visitStringExpression(alphaParser.StringExpressionContext ctx) {
        return super.visitStringExpression(ctx);
    }

    @Override
    public ArrayList<String> visitTrueExpression(alphaParser.TrueExpressionContext ctx) {
        return super.visitTrueExpression(ctx);
    }

    @Override
    public ArrayList<String> visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        return super.visitGreaterOrEqualExpression(ctx);
    }

    @Override
    public ArrayList<String> visitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx) {
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public ArrayList<String> visitCharExpression(alphaParser.CharExpressionContext ctx) {
        return super.visitCharExpression(ctx);
    }

    @Override
    public ArrayList<String> visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        return super.visitPlusExpression(ctx);
    }

    @Override
    public ArrayList<String> visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx) {
        return super.visitNotEqualToExpression(ctx);
    }

    @Override
    public ArrayList<String> visitDeclaration(alphaParser.DeclarationContext ctx) {
        return super.visitDeclaration(ctx);
    }

    @Override
    public ArrayList<String> visitDeclarationFill(alphaParser.DeclarationFillContext ctx) {
        return super.visitDeclarationFill(ctx);
    }

    @Override
    public ArrayList<String> visitDeclarationFinal(alphaParser.DeclarationFinalContext ctx) {
        return super.visitDeclarationFinal(ctx);
    }

    @Override
    public ArrayList<String> visitDeclarationFunction(alphaParser.DeclarationFunctionContext ctx) {
        return super.visitDeclarationFunction(ctx);
    }

    @Override
    public ArrayList<String> visitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx) {
        return super.visitArgumentsDeclaration(ctx);
    }

    @Override
    public ArrayList<String> visitArgumentsCall(alphaParser.ArgumentsCallContext ctx) {
        return super.visitArgumentsCall(ctx);
    }

    @Override
    public ArrayList<String> visitFunctionDeclaration(alphaParser.FunctionDeclarationContext ctx) {
        return super.visitFunctionDeclaration(ctx);
    }

    @Override
    public ArrayList<String> visitFunctionCall(alphaParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public ArrayList<String> visitPrintFunction(alphaParser.PrintFunctionContext ctx) {
        return super.visitPrintFunction(ctx);
    }

    @Override
    public ArrayList<String> visitReadFunction(alphaParser.ReadFunctionContext ctx) {
        return super.visitReadFunction(ctx);
    }

    @Override
    public ArrayList<String> visitThrowFunction(alphaParser.ThrowFunctionContext ctx) {
        return super.visitThrowFunction(ctx);
    }

    @Override
    public ArrayList<String> visitCatchFunction(alphaParser.CatchFunctionContext ctx) {
        return super.visitCatchFunction(ctx);
    }

    @Override
    public ArrayList<String> visitGlobalStatements(alphaParser.GlobalStatementsContext ctx) {
        return super.visitGlobalStatements(ctx);
    }

    @Override
    public ArrayList<String> visitGlobalStatement(alphaParser.GlobalStatementContext ctx) {
        return super.visitGlobalStatement(ctx);
    }

    @Override
    public ArrayList<String> visitPlusPlusStatement(alphaParser.PlusPlusStatementContext ctx) {
        return super.visitPlusPlusStatement(ctx);
    }

    @Override
    public ArrayList<String> visitFunctionCallStatement(alphaParser.FunctionCallStatementContext ctx) {
        return super.visitFunctionCallStatement(ctx);
    }

    @Override
    public ArrayList<String> visitPrintStatement(alphaParser.PrintStatementContext ctx) {
        return super.visitPrintStatement(ctx);
    }

    @Override
    public ArrayList<String> visitReadStatement(alphaParser.ReadStatementContext ctx) {
        return super.visitReadStatement(ctx);
    }

    @Override
    public ArrayList<String> visitThrowBlockStatement(alphaParser.ThrowBlockStatementContext ctx) {
        return super.visitThrowBlockStatement(ctx);
    }

    @Override
    public ArrayList<String> visitIfStatementStatement(alphaParser.IfStatementStatementContext ctx) {
        return super.visitIfStatementStatement(ctx);
    }

    @Override
    public ArrayList<String> visitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx) {
        return super.visitReturnMethodStatement(ctx);
    }

    @Override
    public ArrayList<String> visitWhileMethodStatement(alphaParser.WhileMethodStatementContext ctx) {
        return super.visitWhileMethodStatement(ctx);
    }

    @Override
    public ArrayList<String> visitReturnMethod(alphaParser.ReturnMethodContext ctx) {
        return super.visitReturnMethod(ctx);
    }

    @Override
    public ArrayList<String> visitThrowBlock(alphaParser.ThrowBlockContext ctx) {
        return super.visitThrowBlock(ctx);
    }

    @Override
    public ArrayList<String> visitFunction(alphaParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public ArrayList<String> visitIfStatement(alphaParser.IfStatementContext ctx) {
        return super.visitIfStatement(ctx);
    }

    @Override
    public ArrayList<String> visitWhileMethod(alphaParser.WhileMethodContext ctx) {
        return super.visitWhileMethod(ctx);
    }

    @Override
    public ArrayList<String> visitDataType(alphaParser.DataTypeContext ctx) {
        return super.visitDataType(ctx);
    }

    @Override
    public ArrayList<String> visitVariable(alphaParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }
}
