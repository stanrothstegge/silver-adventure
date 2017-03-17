package main.java.typechecking;

import main.antlr4.*;
import main.java.shared.*;
import main.java.shared.model.Function;
import main.java.shared.model.Variables;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Visitor
 */
public class TypeChecker extends alphaBaseVisitor {
    
    private Scope scope = new Scope();
    
    public static Map<String, Variables> variables = new HashMap<>();
    public static Map<String, Function> functions = new HashMap<>();
    private String currentVariable = "";                                                                                //Used to save the key of function
    private String currentFunction = "";                                                                                //Use to hold the function to get it in the return methode
    private String functionName = "";


    @Override
    public Object visitLanguage(alphaParser.LanguageContext ctx) {
        super.visitLanguage(ctx);
        
        System.out.println("breakpoint");
        
        return null;
    }

    @Override
    public Object visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        scope = scope.open();

        Object object = super.visitLeftBracketExpressionRightBracketExpression(ctx);

        scope = scope.close();
        return object;
    }

    @Override
    public Object visitIfStatement(alphaParser.IfStatementContext ctx) {
        for (ParseTree t : ctx.children) {
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
        for (ParseTree t : ctx.children) {
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
    public Object visitMinusExpression(alphaParser.MinusExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitModuloExpression(alphaParser.ModuloExpressionContext ctx) {
        return checkMathType(ctx);
    }


    @Override
    public Object visitNotExpression(alphaParser.NotExpressionContext ctx) {
        DataType type = ((DataTypeCarrier) visit(ctx.expression())).type;
        try {
            DataTypes.typeCheckingBoolean(type, DataType.BOOLEAN);
        } catch (RuntimeException ex) {
            throw new RuntimeException(errorMessageMaker(ctx, "visitNotExpression") + ex.getMessage());
        }
        return type;
    }

    @Override
    public Object visitFalseExpression(alphaParser.FalseExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            try {
                DataTypes.typeCheckingBoolean(DataType.TRUE, scope.lookupVariable(currentVariable));
            } catch (RuntimeException ex) {
                throw new RuntimeException(errorMessageMaker(ctx, "visitFalseExpression") + ex.getMessage());
            }
            if (!ctx.getText().equals("fs")) throw new RuntimeException("Variable =" + ctx.getText() + " was not fs");

            currentVariable = "";                                                                                       //Clear for the next variable
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
        try {
            DataTypes.typeCheckingEqualToExpression(a.type, b.type);                                                    //Check if the 2 datatype are compatible
        } catch (RuntimeException ex) {
            throw new RuntimeException(errorMessageMaker(ctx, "visitEqualToExpression") + ex.getMessage());
        }
        return a;
    }


    @Override
    public Object visitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.expression(1));
        try {
            DataTypes.typeCheckDoubleAndInteger(a.type, b.type);
        } catch (RuntimeException ex) {
            throw new RuntimeException(errorMessageMaker(ctx, "visitMultiplyExpression") + ex.getMessage());
        }
        return a;
    }

    @Override
    public Object visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitVariable(alphaParser.VariableContext ctx) {
        try {
            return new DataTypeCarrier(scope.lookupVariable(currentFunction + "." + ctx.getText()));
        } catch (NullPointerException ex) {
            throw new RuntimeException(ex.getMessage());
        }
    }

    @Override
    public Object visitDivideExpression(alphaParser.DivideExpressionContext ctx) {
        return checkMathType(ctx);
    }


    @Override
    public Object visitStringExpression(alphaParser.StringExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            //if (variables.get(currentVariable).getParams() != DataType.STRING) {
            if (scope.lookupVariable(currentVariable) != DataType.STRING) {
                throw new RuntimeException(errorMessageMaker(ctx, "visitStringExpression Char " + currentVariable
                        + " = " + ctx.getText() + " was supposed to be string"));
            }

            currentVariable = "";                                                                                       //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.STRING);
    }


    @Override
    public Object visitTrueExpression(alphaParser.TrueExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            
            try {
                DataTypes.typeCheckingBoolean(DataType.TRUE, scope.lookupVariable(currentVariable));
            } catch (RuntimeException ex) {
                throw new RuntimeException(errorMessageMaker(ctx, "visitTrueExpression") + ex.getMessage());
            }
            currentVariable = "";                                                                                       //Clear for the next variable
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
        ArrayList<DataType> dataTypeArrayList = new ArrayList<>();                                                      //Create list that hold datatypes
        if (dataTypes.size() > 0) {                                                                                     //Check if function has return var
            for (Object dataType : dataTypes) {                                                                         //Loop through all return types
                dataTypeArrayList.add(DataTypes.getEnum(((java.util.ArrayList)
                        ((alphaParser.DataTypeContext) dataType).children).get(0).toString()));                         //Get datatype and add to the list
            }
            functions.put(currentFunction, new Function(dataTypeArrayList));                                            //Add to the hashmap for later use
        } else {
            functions.put(currentFunction, new Function());
        }

        if (ctx.argumentsDeclaration() != null) {
            @SuppressWarnings("unchecked") ArrayList<DataType> argumentTypes = (ArrayList<DataType>) visit(ctx.argumentsDeclaration());
            functions.get(currentFunction).setArgumentTypes(argumentTypes);
            //Check must have return ammount
            functions.get(currentFunction).setAmount(ctx.argumentsDeclaration().getText().length() -
                    ctx.argumentsDeclaration().getText().replace("=", "").length());


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
        if (!ctx.getText().contains(" = "))
            currentVariable = "";
        return argumentTypes;
    }

    @Override
    public Object visitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx) {
        int amount = ctx.returnMethod().expression().size();                                                            //Get how many
        if (amount > 0) {
            for (int i = 0; i < amount; i++) {
                if (functions.get(currentFunction).getReturnType(i) != ((DataTypeCarrier) visit(ctx.returnMethod().expression(i))).type)
                    throw new RuntimeException(errorMessageMaker(ctx,
                            "visitReturnMethodStatement Function didn't return correct DataType Expected :"
                                    + functions.get(currentFunction).getReturnType(i) + "got "
                                    + ctx.returnMethod().expression(i).getText()));

            }
        }
        if (functions.get(currentFunction).getReturn().size() != amount)
            throw new RuntimeException(errorMessageMaker(ctx,
                    "visitFunctionCall Missing return values"));

        return super.visitReturnMethodStatement(ctx);
    }

    @Override
    public Object visitFunctionCall(alphaParser.FunctionCallContext ctx) {
        Function function = functions.get(ctx.TEXT().getText());
        int returntypes = 0;
        for (int i = 0; i < ctx.children.size(); i++) {
            if (ctx.children.get(i) instanceof alphaParser.DeclarationContext ||
                    ctx.children.get(i) instanceof alphaParser.VariableContext) {
                DataTypeCarrier carrier = (DataTypeCarrier) visit(ctx.children.get(i));
                if (function.getReturnType(returntypes) != carrier.type) {
                    throw new RuntimeException(errorMessageMaker(ctx,
                            "visitFunctionCall return type was incorrect: "
                                    + carrier.type + " expected: " + function.getReturnType(returntypes)));
                }
                ++returntypes;
            }
        }
        //if fucntion is called with no arguments but the are required
        if (ctx.argumentsCall() == null && function.getAmount() > 0)
            throw new RuntimeException(errorMessageMaker(ctx,
                    "visitFunctionCall Missing arguments"));

        if (ctx.argumentsCall() != null) {
            for (int i = 0; i < ctx.argumentsCall().expression().size(); i++) {
                DataTypeCarrier carrier = (DataTypeCarrier) visit(ctx.argumentsCall().expression().get(i));
                if (carrier.type != function.getArgument(i)) {
                    throw new RuntimeException(errorMessageMaker(ctx,
                            "visitFunctionCall argument was of the wrong type: "
                                    + carrier.type + " , expected: " + function.getArgument(i)));
                }
            }
            //Check amount of arguments
            if (function.getAmount() > ctx.argumentsCall().expression().size())
                throw new RuntimeException(errorMessageMaker(ctx,
                        "visitFunctionCall Missing arguments"));

        }
        return super.visitFunctionCall(ctx);
    }


    @Override
    public Object visitCharExpression(alphaParser.CharExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            
            currentVariable = "";                                                                                       //Clear for the next variable
        }
        return new DataTypeCarrier(DataType.CHAR);
    }

    @Override
    public Object visitCatchFunction(alphaParser.CatchFunctionContext ctx) {
        for (ParseTree t : ctx.children) {
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
    public Object visitThrowBlock(alphaParser.ThrowBlockContext ctx) {
        for (ParseTree t : ctx.children) {
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
    public Object visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.expression(1));
        try {
            DataTypes.typeCheckingMathAndString(a.type, b.type);
        } catch (RuntimeException ex) {
            throw new RuntimeException(errorMessageMaker(ctx, "visitPlusExpression") + ex.getMessage());
        }
        return a;
    }

    @Override
    public Object visitNumberExpression(alphaParser.NumberExpressionContext ctx) {
        if (!currentVariable.equals("")) {
            try {
                //Clear for the next variable
                
                Pattern p = Pattern.compile("[.]");
                Matcher m = p.matcher(ctx.getText());
                if (m.find()) {                                                                                         //Check if its a double or integer
                    
                    //this line is very old and very confusing, so commented out
                    //variables.get(currentVariable).setParam(DataType.DOUBLE);                                           //If double change it
                    currentVariable = "";
                    return new DataTypeCarrier(DataType.DOUBLE);
                } else {
                    currentVariable = "";
                    return new DataTypeCarrier(DataType.INTEGER);
                }

            } catch (NullPointerException e) {
                throw new RuntimeException(errorMessageMaker(ctx,
                        "visitNumberExpression Function couldn't find key for : "
                                + currentVariable + " probably miss typed dataType"));
            }
        }

        return new DataTypeCarrier(DataType.INTEGER);
    }

    @Override
    public Object visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.expression(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.expression(1));
        try {
            DataTypes.typeCheckingEqualToExpression(a.type, b.type);                                                    //Check if the 2 datatype are compatible
        } catch (RuntimeException ex) {
            throw new RuntimeException(errorMessageMaker(ctx, "visitNotEqualToExpression") + ex.getMessage());
        }
        return a;
    }

    @Override
    public Object visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        return checkMathType(ctx);
    }

    @Override
    public Object visitDeclaration(alphaParser.DeclarationContext ctx) {
        currentVariable = functionName.equals("") ? ctx.TEXT().getText() :
                functionName + "." + ctx.TEXT().getText(); //All our DataType are 2 long so get everything after that is a Declartion

        //todo: edited this
        variables.put(currentVariable, new Variables(DataTypes.getEnum(ctx.dataType().getText())));
        
        //todo: bezig hiermee
        DataType type = DataTypes.getEnum(ctx.dataType().getText());
        
        scope.declareVariable(currentVariable, DataTypes.getEnum(ctx.dataType().getText()));

        if (!functionName.equals(""))
            variables.get(currentVariable).setFunctionName(functionName);                                              //If the variabel is in a function
        return new DataTypeCarrier(DataTypes.getEnum(ctx.dataType().getText()));
    }

    @Override
    public Object visitDeclarationFill(alphaParser.DeclarationFillContext ctx) {
        DataTypeCarrier data1;
        if (ctx.declaration() != null) {
            data1 = (DataTypeCarrier) visit(ctx.declaration());
            if (!ctx.getText().contains(" = "))
                currentVariable = "";
        } else {
            data1 = (DataTypeCarrier) visit(ctx.variable());
        }

        DataTypeCarrier data2;
        Object object = visit(ctx.expression());
        if (object instanceof DataTypeCarrier) {
            data2 = (DataTypeCarrier) object;
            try {
                DataTypes.typeCheckingExpression(data1.type, data2.type);
            } catch (RuntimeException ex) {
                throw new RuntimeException(errorMessageMaker(ctx, "visitDeclarationFill") + ex.getMessage());
            }
            return data1;
        }

        return null;
    }

    /**
     * Math
     *
     * @param ctx ctx
     * @return DataTypeCarrier
     */
    private DataTypeCarrier checkMathType(alphaParser.ExpressionContext ctx) {
        DataTypeCarrier a = (DataTypeCarrier) visit(ctx.getChild(0));
        DataTypeCarrier b = (DataTypeCarrier) visit(ctx.getChild(2));
        try {
            DataTypes.typeCheckDoubleAndInteger(a.type, b.type);
        } catch (RuntimeException ex) {
            throw new RuntimeException(errorMessageMaker(ctx, "checkMathType") + ex.getMessage());
        }
        return a;
    }

    /**
     * Creates error message with more detail
     *
     * @param ctx  ctx
     * @param text extra text you want to add in front of the message
     * @return String error msg
     */
    private String errorMessageMaker(ParserRuleContext ctx, String text) {
        String msg = text;
        msg += !currentVariable.equals("") ? " currentVar : " + currentVariable : "";
        msg += !currentFunction.equals("") ? " currentFunction : " + currentVariable : "";
        msg += " ctx text :" + ctx.getText();
        return msg;
    }

    @Override
    public Object visitFunction(alphaParser.FunctionContext ctx) {
        functionName = ctx.functionDeclaration().TEXT().getText();
        scope = scope.open();

        super.visitFunction(ctx);

        functionName = "";
        scope = scope.close();
        return null;
    }

}