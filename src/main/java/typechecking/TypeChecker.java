package main.java.typechecking;

import main.antlr4.*;
import main.java.shared.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Visitor
 */
//todo: garcia mag datatypecarrier maken
public class TypeChecker extends alphaBaseVisitor {
    Map<String, Function> variables = new HashMap<>();
    Map<String, Function> functions = new HashMap<>();
    String currentVariable = "";                                                                                        //Used to save the key of function
    String currentFunction = "";                                                                                        //Use to hold the function to get it in the return methode


    @Override
    public Object visitLanguage(alphaParser.LanguageContext ctx) {
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
        DataType type = ((DataTypeCarrier) visit(ctx.expression())).type;

        DataTypes.typeCheckingBoolean(type,DataType.BOOLEAN);
        
        return type;
    }

    @Override
    public Object visitFalseExpression(alphaParser.FalseExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            variables.get(currentVariable).setId(ctx.getText());                                            //Set char
            DataTypes.typeCheckingBoolean(DataType.TRUE, variables.get(currentVariable).getParams());
            if (!ctx.getText().equals("fs")) throw new RuntimeException("Variable =" + ctx.getText() + " was not fs");

            currentVariable = "";                                                                                           //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.FALSE);
    }

    @Override
    public Object visitThrowFunction(alphaParser.ThrowFunctionContext ctx) {
        return null;
    }

    @Override
    public Object visitPrintFunction(alphaParser.PrintFunctionContext ctx) {
        return null;
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
        DataTypes.typeCheckDoubleAndInteger(a.type, b.type);
        return a;
    }

    @Override
    public Object visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitVariable(alphaParser.VariableContext ctx) {
        try {
            return new DataTypeCarrier(variables.get(ctx.getText()).getParams());
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
            if (variables.get(currentVariable).getParams() != DataType.STRING) {
                throw new RuntimeException("Char "+ currentVariable +" = " + ctx.getText() + " was supposed to be string");                                  //todo char2 wordt niet weggehaald als hij in de printfuncite komt??
            }
            variables.get(currentVariable).setId(ctx.getText());                                            //Set char
            DataTypes.thatOtherTypeChecker(variables.get(currentVariable).getId(), variables.get(currentVariable).getParams());                // should be string

            currentVariable = "";                                                                                       //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.STRING);
    }


    @Override
    public Object visitTrueExpression(alphaParser.TrueExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            variables.get(currentVariable).setId(ctx.getText());
            DataTypes.typeCheckingBoolean(DataType.TRUE, variables.get(currentVariable).getParams());
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
    public Object visitFunctionDeclaration(alphaParser.FunctionDeclarationContext ctx) {
        List dataTypes = ctx.dataType();                                                                                //possible list of datatypes
        currentFunction = ctx.TEXT().getText();                                                                         //Get function name
        ArrayList<DataType> dataTypeArrayList = new ArrayList<>();                                            //Create list that hold datatypes
        if (dataTypes.size() > 0) {                                                                                        //Check if function has return var
            for (Object dataType : dataTypes) {                                                                           //Loop through all return types
                dataTypeArrayList.add(DataTypes.getEnum(((java.util.ArrayList)
                        ((alphaParser.DataTypeContext) dataType).children).get(0).toString()));                           //Get datatype and add to the list
            }
            functions.put(currentFunction, new Function(dataTypeArrayList));                                                  //Add to the hashmap for later use
        } else {
            functions.put(currentFunction, new Function());
        }

        if (ctx.argumentsDeclaration() != null) {
            ArrayList<DataType> argumentTypes = (ArrayList<DataType>) visit(ctx.argumentsDeclaration());
            functions.get(currentFunction).setArgumentTypes(argumentTypes);

        }

        return super.visitFunctionDeclaration(ctx);
    }


    @Override
    public Object visitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx) {
        //these declartion are added to variable
        ArrayList<DataType> argumentTypes = new ArrayList<>();
        for (int i = 0; i < ctx.declarationFunction().size(); i++) {
            argumentTypes.add(((DataTypeCarrier) visit(ctx.declarationFunction(i))).type);
        }
        System.out.println(ctx.getText() + "   test");
        if(!ctx.getText().contains(" = "))
            currentVariable ="";
        return argumentTypes;
    }

    @Override
    public Object visitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx) {
        int amount = ctx.returnMethod().expression().size();                                                            //Get how many
        if (amount > 0) {
            for (int i = 0; i < amount; i++) {
                if (functions.get(currentFunction).getReturnType(i) != ((DataTypeCarrier) visit(ctx.returnMethod().expression(i))).type)
                    throw new RuntimeException("Function didnt return correct datatype Expected :"
                            + functions.get(currentFunction).getReturnType(i) + "got "
                            + ctx.returnMethod().expression(i).getText());
            }
        }

        return super.visitReturnMethodStatement(ctx);
    }

    @Override
    public Object visitFunctionCall(alphaParser.FunctionCallContext ctx) {
        Function function = functions.get(ctx.TEXT().getText());
        //todo: function return and argument type checking

        //return checking
        int returntypes = 0;
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof alphaParser.DeclarationContext ||
                    ctx.children.get(i) instanceof alphaParser.VariableContext) {
                DataTypeCarrier carrier = (DataTypeCarrier) visit(ctx.children.get(i));
                if (function.getReturnType(returntypes) != carrier.type) {
                    throw new RuntimeException("return type was incorrect: " + carrier.type + " expected: " + function.getReturnType(returntypes));
                }
                ++returntypes;
            }
        }

        //arguments checking;
        if (ctx.argumentsCall() != null) {
            for (int i = 0; i < ctx.argumentsCall().expression().size(); i++) {
                DataTypeCarrier carrier = (DataTypeCarrier) visit(ctx.argumentsCall().expression().get(i));
                if (carrier.type != function.getArgument(i)) {
                    throw new RuntimeException("argument was of the wrong type: " + carrier.type + " , expected: " + function.getArgument(i));
                }
            }
        }

        return super.visitFunctionCall(ctx);
    }

    @Override
    public Object visitCharExpression(alphaParser.CharExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            variables.get(currentVariable).setId(ctx.CHAR_TYPE().getText());                                            //Set char
            char c = variables.get(currentVariable).getId().charAt(1);
            DataTypes.thatOtherTypeChecker(c, variables.get(currentVariable).getParams());                                                 // should be char
            currentVariable = "";                                                                                       //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.CHAR);
    }

    @Override
    public Object visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.expression(1));

        DataTypes.typeCheckingMathAndString(a.type, b.type);
        return a;
    }

    @Override
    public Object visitNumberExpression(alphaParser.NumberExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            try {
                variables.get(currentVariable).setId(ctx.getText());                                                        //Add the integer to function
                Pattern p = Pattern.compile("[.]");
                Matcher m = p.matcher(ctx.getText());
                if (m.find()) {                                                                                             //Check if its a double or integer
                    DataTypes.thatOtherTypeChecker(Double.parseDouble(variables.get(currentVariable).getId()), variables.get(currentVariable).getParams());
                } else {
                    DataTypes.thatOtherTypeChecker(Integer.parseInt(variables.get(currentVariable).getId()), variables.get(currentVariable).getParams());
                }
                variables.get(currentVariable).setId(ctx.getText());                                                        //Save the number in to the table

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
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.expression(1));
        DataTypes.typeCheckingEqualToExpression(a.type, b.type);                                                         //Check if the 2 datatype are compatible
        return a;
    }

    @Override
    public Object visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitDeclaration(alphaParser.DeclarationContext ctx) {
        currentVariable = ctx.TEXT().getText();                                                                         //All our DataType are 2 long so get everything after that is a Declartion
        variables.put(currentVariable, new Function(DataTypes.getEnum(ctx.dataType().getText())));
        return new DataTypeCarrier(DataTypes.getEnum(ctx.dataType().getText()));
    }

    @Override
    public Object visitDeclarationFill(alphaParser.DeclarationFillContext ctx) {
        DataTypeCarrier data1;
        if(ctx.declaration() != null){
            data1 = (DataTypeCarrier) visit(ctx.declaration());
            System.out.println(ctx.getText());
            if(!ctx.getText().contains(" = "))
                currentVariable ="";
        } else {
            data1 = (DataTypeCarrier) visit(ctx.variable());
        }
        
        DataTypeCarrier data2;
        Object object = visit(ctx.expression());
        if (object instanceof DataTypeCarrier) {
            data2 = (DataTypeCarrier) object;
            
            try {
                DataTypes.typeCheckingExpression(data1.type, data2.type);
            } catch (RuntimeException e) {
                throw new RuntimeException("Variable: " + currentVariable + e.getMessage());
            }
            return data1;
        }
        
        return null;
    }

    /**
     * Math
     *
     * @param ctx
     * @return
     */
    private DataTypeCarrier checkMathType(alphaParser.ExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.getChild(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.getChild(2));
        DataTypes.typeCheckDoubleAndInteger(a.type, b.type);
        return a;
    }

}