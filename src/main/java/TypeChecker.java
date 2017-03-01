package main.java;

import main.antlr4.*;
import main.java.DataTypes.DataType;
import org.antlr.v4.runtime.RuleContext;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static main.java.DataTypes.typeChecker;

/**
 * Visitor
 */
class TypeChecker extends alphaBaseVisitor {
    Map<String, Function> functions = new HashMap<>();
    String currentVariable = "";                                                                                        //Used to save the key of function


    @Override
    public Object visitLanguage(alphaParser.LanguageContext ctx) {
        System.out.println(ctx.getText());
        return super.visitLanguage(ctx);
    }

    @Override
    public Object visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression());
        return a;
    }

    @Override
    public Object visitMinusExpression(alphaParser.MinusExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitAddCustomExpression(alphaParser.AddCustomExpressionContext ctx) {
        return super.visitAddCustomExpression(ctx);
    }

    @Override
    public Object visitModuloExpression(alphaParser.ModuloExpressionContext ctx) {
        return checkMathType(ctx);
    }


    @Override
    public Object visitNotExpression(alphaParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Object visitFalseExpression(alphaParser.FalseExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            functions.get(currentVariable).setParams(DataType.BOOLEAN);
            if (!ctx.getText().equals("fs")) throw new RuntimeException("Variable =" + ctx.getText() + " was not fs");

            currentVariable = "";                                                                                           //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.FALSE);
    }

    @Override
    public Object visitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitEqualToExpression(alphaParser.EqualToExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.expression(1));
        DataTypes.typeCheckingEqualToExpression(a.type, b.type);                                                         //Check if the 2 datatype are compatible
        return a;
    }


    @Override
    public Object visitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.expression(1));
        System.out.println("Is Integer :" + ctx.getText());
        DataTypes.typeCheckingMath(a.type, b.type);
        return a;
    }

    @Override
    public Object visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitVariableExpression(alphaParser.VariableExpressionContext ctx) {
        try {
            System.out.println(ctx.getText());
            return new DataTypeCarrier(functions.get(ctx.getText()).getParams());
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
        return null;
    }


    @Override
    public Object visitDivideExpression(alphaParser.DivideExpressionContext ctx) {
        return checkMathType(ctx);
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
        if (!currentVariable.equals("")) {
            System.out.println(ctx.getText());
            functions.get(currentVariable).setParams(DataType.STRING);
            typeChecker(functions.get(currentVariable).getId(), functions.get(currentVariable).getParams());                // should be string

            currentVariable = "";                                                                                       //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.STRING);
    }

    @Override
    public Object visitTrueExpression(alphaParser.TrueExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            functions.get(currentVariable).setParams(DataType.BOOLEAN);
            if (!ctx.getText().equals("tr")) throw new RuntimeException("Variable =" + ctx.getText() + " was not tr");

            currentVariable = "";                                                                                           //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.TRUE);
    }

    @Override
    public Object visitSmallerOrEqualExpression(alphaParser.SmallerOrEqualExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx) {
        //todo: function return and argument type checking
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public Object visitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx) {
        //todo: function return type checking
        return super.visitReturnMethodStatement(ctx);
    }

    @Override
    public Object visitCharExpression(alphaParser.CharExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            functions.get(currentVariable).setParams(DataType.CHAR);                                                    //Set datatype
            functions.get(currentVariable).setId(ctx.CHAR_TYPE().getText());                                            //Set char
            char c = functions.get(currentVariable).getId().charAt(1);
            typeChecker(c, functions.get(currentVariable).getParams());                                                 // should be char
            currentVariable = "";                                                                                       //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.CHAR);
    }

    @Override
    public Object visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b= (DataTypeCarrier) visit(ctx.expression(1));

        DataTypes.typeCheckingMathAndString(a.type,b.type);
        System.out.println("Is Integer :" + ctx.getText());
        return a;
    }

    @Override
    public Object visitNumberExpression(alphaParser.NumberExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            try {
                functions.get(currentVariable).setId(ctx.getText());                                                        //Add the integer to function
                Pattern p = Pattern.compile("[.]");
                Matcher m = p.matcher(ctx.getText());
                if (m.find()) {                                                                                             //Check if its a double or integer
                    functions.get(currentVariable).setParams(DataType.DOUBLE);
                    typeChecker(Double.parseDouble(functions.get(currentVariable).getId()), functions.get(currentVariable).getParams());
                } else {
                    functions.get(currentVariable).setParams(DataType.INTEGER);
                    typeChecker(Integer.parseInt(functions.get(currentVariable).getId()), functions.get(currentVariable).getParams());
                }
                functions.get(currentVariable).setId(ctx.getText());                                                        //Save the number in to the table

                currentVariable = "";                                                                                           //Clear for the next variable
            } catch (NumberFormatException e) {
                throw new RuntimeException("Variable = " + ctx.getText() + " Could not be parse to number");
            } catch (NullPointerException e) {
                throw new RuntimeException("Function couldn't find key for :" + currentVariable + "probably miss typed dataType");
            }
        }

        return new DataTypeCarrier(DataType.INTEGER);
    }

    @Override
    public Object visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b= (DataTypeCarrier) visit(ctx.expression(1));
        DataTypes.typeCheckingEqualToExpression(a.type, b.type);                                                         //Check if the 2 datatype are compatible
        return a;
    }

    @Override
    public Object visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitDeclaration(alphaParser.DeclarationContext ctx) {
        if (currentVariable.equals("")) {
            currentVariable = ctx.getText().substring(3);                                                                   //All our DataType are 2 long so get everything after that is a Declartion
            functions.put(currentVariable, new Function(DataTypes.getEnum(ctx.dataType().getText())));
        }
        return super.visitDeclaration(ctx);
    }

    /**
     * Math
     * @param ctx
     * @return
     */
    private DataTypeCarrier checkMathType(alphaParser.ExpressionContext ctx){
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.getChild(0));
        DataTypeCarrier b= (DataTypeCarrier) visit(ctx.getChild(2));
        DataTypes.typeCheckingMath(a.type,b.type);
        System.out.println("Is Integer :" + ctx.getText());
        return a;
    }

}