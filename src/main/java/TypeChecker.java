package main.java;

import main.antlr4.*;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.java.DataTypes.typeChecker;

/**
 * Visitor
 */
class TypeChecker extends alphaBaseVisitor {
    //todo all declaritions then if statments

    Map<String, RenameThis> functions = new HashMap<>();
    String currentVariable = "";                                                                                        //Used to save the key of function

    @Override
    public Object visitLanguage(alphaParser.LanguageContext ctx) {
        System.out.println(ctx.getText());
        return super.visitLanguage(ctx);
    }

    @Override
    public Object visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        return super.visitLeftBracketExpressionRightBracketExpression(ctx);
    }

    @Override
    public Object visitMinusExpression(alphaParser.MinusExpressionContext ctx) {
        return super.visitMinusExpression(ctx);
    }

    @Override
    public Object visitAddCustomExpression(alphaParser.AddCustomExpressionContext ctx) {
        return super.visitAddCustomExpression(ctx);
    }

    @Override
    public Object visitModuloExpression(alphaParser.ModuloExpressionContext ctx) {
        return super.visitModuloExpression(ctx);
    }

    @Override
    public Object visitNumberExpression(alphaParser.NumberExpressionContext ctx) {
        try {
            functions.get(currentVariable).setId(ctx.getText());                                                        //Add the integer to function
            Pattern p = Pattern.compile("[.]");
            Matcher m = p.matcher(ctx.getText());
            if (m.find()) {                                                                                             //Check if its a double or integer
                functions.get(currentVariable).setParams(DataTypes.DataType.DOUBLE);
                typeChecker(Double.parseDouble(functions.get(currentVariable).getId()), functions.get(currentVariable).getParams());
            } else {
                functions.get(currentVariable).setParams(DataTypes.DataType.INTEGER);
                typeChecker(Integer.parseInt(functions.get(currentVariable).getId()), functions.get(currentVariable).getParams());
            }
            functions.get(currentVariable).setId(ctx.getText());                                                        //Save the number in to the table
        } catch (NumberFormatException e) {
            throw new RuntimeException("Variable = " + ctx.getText() + " Could not be parse to number");
        }
        catch(NullPointerException e){
            throw new RuntimeException("Function couldn't find key for :" +currentVariable +"probably miss typed dataType");
        }

        currentVariable = "";                                                                                           //Clear for the next variable
        return super.visitNumberExpression(ctx);
    }

    @Override
    public Object visitNotExpression(alphaParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Object visitFalseExpression(alphaParser.FalseExpressionContext ctx) {
        functions.get(currentVariable).setParams(DataTypes.DataType.BOOLEAN);
        if(!ctx.getText().equals("fs")) throw new RuntimeException("Variable =" + ctx.getText() + " was not fs");

        currentVariable = "";                                                                                           //Clear for the next variable
        return super.visitFalseExpression(ctx);
    }

    @Override
    public Object visitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx) {
        return super.visitSmallerThanExpression(ctx);
    }

    @Override
    public Object visitEqualToExpression(alphaParser.EqualToExpressionContext ctx) {
        return super.visitEqualToExpression(ctx);
    }

    @Override
    public Object visitGlobal_type(alphaParser.Global_typeContext ctx) {
        return super.visitGlobal_type(ctx);
    }

    @Override
    public Object visitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx) {
        return super.visitMultiplyExpression(ctx);
    }

    @Override
    public Object visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx) {
        return super.visitGreaterThanExpression(ctx);
    }

    @Override
    public Object visitVariableExpression(alphaParser.VariableExpressionContext ctx) {
        return super.visitVariableExpression(ctx);
    }

    @Override
    public Object visitDivideExpression(alphaParser.DivideExpressionContext ctx) {
        return super.visitDivideExpression(ctx);
    }

    @Override
    public Object visitOrExpression(alphaParser.OrExpressionContext ctx) {
        return super.visitOrExpression(ctx);
    }

    @Override
    public Object visitAndExpression(alphaParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }

    @Override
    public Object visitStringExpression(alphaParser.StringExpressionContext ctx) {
        functions.get(currentVariable).setParams(DataTypes.DataType.STRING);
        typeChecker(functions.get(currentVariable).getId(), functions.get(currentVariable).getParams());                // should be string

        currentVariable = "";                                                                                           //Clear for the next variable
        return super.visitStringExpression(ctx);
    }

    @Override
    public Object visitTrueExpression(alphaParser.TrueExpressionContext ctx) {
        functions.get(currentVariable).setParams(DataTypes.DataType.BOOLEAN);
        if(!ctx.getText().equals("tr")) throw new RuntimeException("Variable =" + ctx.getText() + " was not tr");

        currentVariable = "";                                                                                           //Clear for the next variable
        return super.visitTrueExpression(ctx);
    }

    @Override
    public Object visitSmallerOrRequalExpression(alphaParser.SmallerOrRequalExpressionContext ctx) {
        return super.visitSmallerOrRequalExpression(ctx);
    }

    @Override
    public Object visitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx) {
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public Object visitCharExpression(alphaParser.CharExpressionContext ctx) {
        functions.get(currentVariable).setParams(DataTypes.DataType.CHAR);
        char c = functions.get(currentVariable).getId().charAt(0);
        typeChecker(c, functions.get(currentVariable).getParams());                                                     // should be char

        currentVariable = "";                                                                                           //Clear for the next variable
        return super.visitCharExpression(ctx);
    }

    @Override
    public Object visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        return super.visitPlusExpression(ctx);
    }

    @Override
    public Object visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx) {
        return super.visitNotEqualToExpression(ctx);
    }

    @Override
    public Object visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        return super.visitGreaterOrEqualExpression(ctx);
    }

    @Override
    public Object visitDeclaration(alphaParser.DeclarationContext ctx) {
        currentVariable = ctx.getText().substring(3);                                                                   //All our DataType are 2 long so get everything after that is a Declartion
        functions.put(currentVariable, new RenameThis(DataTypes.getEnum(ctx.dataType().getText())));
        return super.visitDeclaration(ctx);
    }

    @Override
    public Object visitDeclarationFill(alphaParser.DeclarationFillContext ctx) {
        return super.visitDeclarationFill(ctx);
    }

    @Override
    public Object visitDeclarationFinal(alphaParser.DeclarationFinalContext ctx) {
        return super.visitDeclarationFinal(ctx);
    }

    @Override
    public Object visitDeclarationFunction(alphaParser.DeclarationFunctionContext ctx) {
        return super.visitDeclarationFunction(ctx);
    }

    @Override
    public Object visitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx) {
        return super.visitArgumentsDeclaration(ctx);
    }

    @Override
    public Object visitArgumentsCall(alphaParser.ArgumentsCallContext ctx) {
        return super.visitArgumentsCall(ctx);
    }

    @Override
    public Object visitFunctionDeclaration(alphaParser.FunctionDeclarationContext ctx) {
        return super.visitFunctionDeclaration(ctx);
    }

    @Override
    public Object visitFunctionCall(alphaParser.FunctionCallContext ctx) {
        return super.visitFunctionCall(ctx);
    }

    @Override
    public Object visitPrintFunction(alphaParser.PrintFunctionContext ctx) {
        return super.visitPrintFunction(ctx);
    }

    @Override
    public Object visitReadFunction(alphaParser.ReadFunctionContext ctx) {
        return super.visitReadFunction(ctx);
    }

    @Override
    public Object visitThrowFunction(alphaParser.ThrowFunctionContext ctx) {
        return super.visitThrowFunction(ctx);
    }

    @Override
    public Object visitCatchFunction(alphaParser.CatchFunctionContext ctx) {
        return super.visitCatchFunction(ctx);
    }

    @Override
    public Object visitGlobalStatements(alphaParser.GlobalStatementsContext ctx) {
        return super.visitGlobalStatements(ctx);
    }

    @Override
    public Object visitGlobalStatement(alphaParser.GlobalStatementContext ctx) {
        return super.visitGlobalStatement(ctx);
    }

    @Override
    public Object visitPlusPlusStatement(alphaParser.PlusPlusStatementContext ctx) {
        return super.visitPlusPlusStatement(ctx);
    }

    @Override
    public Object visitFunctionCallStatement(alphaParser.FunctionCallStatementContext ctx) {
        return super.visitFunctionCallStatement(ctx);
    }

    @Override
    public Object visitPrintStatement(alphaParser.PrintStatementContext ctx) {
        return super.visitPrintStatement(ctx);
    }

    @Override
    public Object visitReadStatement(alphaParser.ReadStatementContext ctx) {
        return super.visitReadStatement(ctx);
    }

    @Override
    public Object visitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx) {
        return super.visitReturnMethodStatement(ctx);
    }

    @Override
    public Object visitWhileMethodStatement(alphaParser.WhileMethodStatementContext ctx) {
        return super.visitWhileMethodStatement(ctx);
    }

    @Override
    public Object visitIfStatementStatement(alphaParser.IfStatementStatementContext ctx) {
        return super.visitIfStatementStatement(ctx);
    }

    @Override
    public Object visitReturnMethod(alphaParser.ReturnMethodContext ctx) {
        return super.visitReturnMethod(ctx);
    }

    @Override
    public Object visitThrowBlock(alphaParser.ThrowBlockContext ctx) {
        return super.visitThrowBlock(ctx);
    }

    @Override
    public Object visitFunction(alphaParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public Object visitIfStatement(alphaParser.IfStatementContext ctx) {
        //todo sutff

        return super.visitIfStatement(ctx);
    }

    @Override
    public Object visitWhileMethod(alphaParser.WhileMethodContext ctx) {
        return super.visitWhileMethod(ctx);
    }

    @Override
    public Object visitDataType(alphaParser.DataTypeContext ctx) {
        return super.visitDataType(ctx);
    }

    @Override
    public Object visitVariable(alphaParser.VariableContext ctx) {
        return super.visitVariable(ctx);
    }

    @Override
    public Object visitThrowBlockStatement(alphaParser.ThrowBlockStatementContext ctx) {
        return super.visitThrowBlockStatement(ctx);
    }
}