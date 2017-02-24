package main.java;

import main.antlr4.*;
import org.antlr.v4.runtime.tree.ParseTree;

/**
 * Visitor
 */
class Identifier extends alphaBaseVisitor {
    private Scope scope = new Scope();
    
    @Override
    public Object visitLanguage(alphaParser.LanguageContext ctx) {
        System.out.println(ctx.getText());
        System.out.println(ctx.children);
        return super.visitLanguage(ctx);
    }

    @Override
    public Object visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        scope = scope.open();
        
        Object object = super.visitLeftBracketExpressionRightBracketExpression(ctx);
        
        scope = scope.close();
        return object;
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
        return super.visitNumberExpression(ctx);
    }

    @Override
    public Object visitNotExpression(alphaParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Object visitFalseExpression(alphaParser.FalseExpressionContext ctx) {
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
        return super.visitStringExpression(ctx);
    }

    @Override
    public Object visitTrueExpression(alphaParser.TrueExpressionContext ctx) {
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
        if (scope.declareVariable(ctx.TEXT().getText(), DataTypes.getEnum(ctx.dataType().getText()))) {
            return super.visitDeclaration(ctx);
        }
        assert false: "declared something that already exists: " + ctx.getText();
        return null;
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
        for(ParseTree t: ctx.children) {
            switch (t.getText()) {
                case "ca":
                    scope = scope.close();
                    scope = scope.open();
                    break;
                default:
                    visit(t);
            }
        }

        scope = scope.close();

        return null;
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
    public Object visitThrowBlockStatement(alphaParser.ThrowBlockStatementContext ctx) {
        return super.visitThrowBlockStatement(ctx);
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
        for(ParseTree t: ctx.children) {
            switch (t.getText()) {
                case "ty":
                    //scope closed in visitCatchFunction
                    scope = scope.open();
                    break;
                default:
                    visit(t);
            }
        }

        return null;
    }

    @Override
    public Object visitFunction(alphaParser.FunctionContext ctx) {
        return super.visitFunction(ctx);
    }

    @Override
    public Object visitIfStatement(alphaParser.IfStatementContext ctx) {
        for(ParseTree t: ctx.children) {
            switch (t.getText()) {
                case "if":
                    scope = scope.open();
                    break;
                case "ef":
                    scope = scope.close();
                    scope = scope.open();
                    break;
                case "el":
                    scope = scope.close();
                    scope = scope.open();
                    break;
                default:
                    visit(t);
            }
        }

        scope = scope.close();
        
        return null;
    }

    @Override
    public Object visitWhileMethod(alphaParser.WhileMethodContext ctx) {
        for(ParseTree t: ctx.children) {
            switch (t.getText()) {
                case "wh":
                    scope = scope.open();
                    break;
                default:
                    visit(t);
            }
        }

        scope = scope.close();

        return null;
    }

    @Override
    public Object visitDataType(alphaParser.DataTypeContext ctx) {
        return super.visitDataType(ctx);
    }

    @Override
    public Object visitVariable(alphaParser.VariableContext ctx) {
        //local variable
        if (ctx.TEXT() != null) {
            if (scope.lookupVariable(ctx.TEXT().getText()) == null) {
                assert false : "variable has not been initialized: " + ctx.getText();
            }
        //global variable
        } else {
            if (scope.lookupGlobalVariable(ctx.global_type().TEXT().getText()) == null) {
                assert false : "variable has not been initialized: " + ctx.getText();
            }
        }
        return super.visitVariable(ctx);
    }

    @Override
    public Object visitGlobal_type(alphaParser.Global_typeContext ctx) {
        return super.visitGlobal_type(ctx);
    }
}