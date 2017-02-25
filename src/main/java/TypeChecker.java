package main.java;

import main.antlr4.*;
import main.java.DataTypes.DataType;

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
    boolean lock = false;                                                                                               // tried Alpha in c = 1 / 2; Omega , didnt go to variable first but number so i locked so code didn't run that wasn't supposed to
    boolean printFunction = false;
    boolean isVariable = false;
    boolean isNumber = false;
    boolean isBoolean = false;
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
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitMinusExpression(ctx);
    }

    @Override
    public Object visitAddCustomExpression(alphaParser.AddCustomExpressionContext ctx) {
        return super.visitAddCustomExpression(ctx);
    }

    @Override
    public Object visitModuloExpression(alphaParser.ModuloExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitModuloExpression(ctx);
    }

    @Override
    public Object visitNumberExpression(alphaParser.NumberExpressionContext ctx) {
        if(!currentVariable.equals("") && !lock) {
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
        }else{
            lock = false;
            isNumber = true;
        }

        return super.visitNumberExpression(ctx);
    }

    @Override
    public Object visitNotExpression(alphaParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public Object visitFalseExpression(alphaParser.FalseExpressionContext ctx) {

        if(!currentVariable.equals("") && !lock) {
            functions.get(currentVariable).setParams(DataType.BOOLEAN);
            if (!ctx.getText().equals("fs")) throw new RuntimeException("Variable =" + ctx.getText() + " was not fs");

            currentVariable = "";                                                                                           //Clear for the next variable
        }else{
            lock = false;
            isBoolean = true;
        }
        return super.visitFalseExpression(ctx);
    }

    @Override
    public Object visitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitSmallerThanExpression(ctx);
    }

    @Override
    public Object visitEqualToExpression(alphaParser.EqualToExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingEqualToExpression(first, second);                                                         //Check if the 2 datatype are compatible

        return super.visitEqualToExpression(ctx);
    }

    /**
     * Checks what datatype it is by what boolean is filled
     *
     * @param text the key if its a function
     * @return DataType
     */
    private DataType dataTypeChecker(String text){
        DataType result;
        if(isVariable){
            System.out.println("is variable: " + text);
             result = functions.get(text).getParams();
        }else if(isNumber) {
            System.out.println("is number: " + text);
             result = DataType.INTEGER;
        }else if(isBoolean) {
            System.out.println("is boolean: " + text);
             result = DataType.BOOLEAN;
        }else{
            System.out.println("is string: " + text);
             result = DataType.STRING;
        }

        isNumber = false;                                                                                               //Reset booleans
        isVariable = false;
        isBoolean = false;
        return result;
    }


    @Override
    public Object visitGlobal_type(alphaParser.Global_typeContext ctx) {
        return super.visitGlobal_type(ctx);
    }

    @Override
    public Object visitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitMultiplyExpression(ctx);
    }

    @Override
    public Object visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitGreaterThanExpression(ctx);
    }

    @Override
    public Object visitVariableExpression(alphaParser.VariableExpressionContext ctx) {
        isVariable = true;
        return super.visitVariableExpression(ctx);
    }

    @Override
    public Object visitDivideExpression(alphaParser.DivideExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
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
        if(!printFunction && !currentVariable.equals("") && !lock) {
            System.out.println(ctx.getText());
            functions.get(currentVariable).setParams(DataType.STRING);
            typeChecker(functions.get(currentVariable).getId(), functions.get(currentVariable).getParams());                // should be string

            currentVariable = "";                                                                                       //Clear for the next variable
            printFunction = false;
        }else{
            lock = false;
            isVariable = false;
        }

        return super.visitStringExpression(ctx);
    }

    @Override
    public Object visitTrueExpression(alphaParser.TrueExpressionContext ctx) {
        if(!currentVariable.equals("")&& !lock) {
            functions.get(currentVariable).setParams(DataType.BOOLEAN);
            if (!ctx.getText().equals("tr")) throw new RuntimeException("Variable =" + ctx.getText() + " was not tr");

            currentVariable = "";                                                                                           //Clear for the next variable
        }else{
            lock = false;
            isBoolean = true;
        }
        return super.visitTrueExpression(ctx);
    }

    @Override
    public Object visitSmallerOrRequalExpression(alphaParser.SmallerOrRequalExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitSmallerOrRequalExpression(ctx);
    }

    @Override
    public Object visitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx) {
        return super.visitFunctionCallExpression(ctx);
    }

    @Override
    public Object visitCharExpression(alphaParser.CharExpressionContext ctx) {
        if(!currentVariable.equals("")) {
            functions.get(currentVariable).setParams(DataType.CHAR);
            char c = functions.get(currentVariable).getId().charAt(0);
            typeChecker(c, functions.get(currentVariable).getParams());                                                     // should be char

            currentVariable = "";                                                                                           //Clear for the next variable
        }
        return super.visitCharExpression(ctx);
    }

    @Override
    public Object visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitPlusExpression(ctx);
    }

    @Override
    public Object visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

        DataTypes.typeCheckingEqualToExpression(first, second);                                                         //Check if the 2 datatype are compatible
        return super.visitNotEqualToExpression(ctx);
    }

    @Override
    public Object visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(0));                                                                                    //Goes to the function and fills a boolean result
        DataType first =  dataTypeChecker(ctx.expression(0).getText());                                              //Check boolean result
        lock = true;                                                                                                    //Didn't follow the tree flow, so now i just lock everything
        visit(ctx.expression(1));                                                                                    //Goes to the function and fills a boolean result
        DataType second = dataTypeChecker(ctx.expression(1).getText());                                              //Check boolean result

       DataTypes.typeCheckingMath(first,second);                                                                        //Check if its Integer or double
        return super.visitGreaterOrEqualExpression(ctx);
    }

    @Override
    public Object visitDeclaration(alphaParser.DeclarationContext ctx) {
        if(currentVariable.equals("")) {
            currentVariable = ctx.getText().substring(3);                                                                   //All our DataType are 2 long so get everything after that is a Declartion
            functions.put(currentVariable, new RenameThis(DataTypes.getEnum(ctx.dataType().getText())));
        }
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
        printFunction = true;
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