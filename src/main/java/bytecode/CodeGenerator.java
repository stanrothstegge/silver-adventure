package main.java.bytecode;


import main.antlr4.alphaBaseVisitor;
import main.antlr4.alphaParser;
import main.java.scopechecking.Identifier;
import main.java.typechecking.TypeChecker;
import main.java.utils.DataType;
import main.java.utils.DataTypes;
import main.java.utils.Scope;
import main.java.utils.model.Variable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.List;


public class CodeGenerator extends alphaBaseVisitor<ArrayList<String>> {

    final String fileName;

    //To make jasmin code readable for debugging
    private static final String NEWLINE = "\r\n";
    private ArrayList<alphaParser.ExpressionContext> globalExpressions = new ArrayList<>();
    private ArrayList<String> globalVariables = new ArrayList<>();
    private DataType[] returnTypes;
    private ArrayList<String> addToMain = new ArrayList<>();
    private ArrayList<String> main = new ArrayList<>();
    private String functionName = "";
    private Scope scope = new Scope();

    public CodeGenerator(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ArrayList<String> visitLanguage(alphaParser.LanguageContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        list.add(".class public " + fileName);
        list.add(".super java/lang/Object" + NEWLINE);

        //first, visit all the global statements
        for (ParseTree t : ctx.children) {
            if (t instanceof alphaParser.GlobalStatementsContext) {
                list.addAll(visit(t));
            }
        }

        //Standard initializer (calls java.lang.Object's initializer), in other words: the empty constructor
        list.add(NEWLINE + ".method public <init>()V");
        list.add("aload_0");
        list.add("invokenonvirtual java/lang/Object/<init>()V");
        list.add("return");
        list.add(".end method" + NEWLINE);

        //then visit all the functions
        for (ParseTree t : ctx.children) {
            if (t instanceof alphaParser.FunctionContext) {
                list.addAll(visit(t));
            }
        }
        //todo count exactle limits and stuff
        //main.set(0,"\r\n.method public static main([Ljava/lang/String;)V");

        int variableAmount;

        //Gets amount of variables in function
        variableAmount = Identifier.parentScope.getScopeSize("pizza");

        int localSize = variableAmount + 1;//main always has 1 argument todo: replace 10 with amount of variables in function

        main.set(1, ".limit stack " + localSize * 2);
        main.set(2, ".limit locals " + localSize);

        for (int x = 0; x < addToMain.size(); x++) {
            main.add(x + 3, addToMain.get(x));
        }
        list.addAll(main);
        return list;
    }

    /**
     * @param ctx
     * @return Arraylist with 0: variablename and 1: Datatype (as string)
     */
    @Override
    public ArrayList<String> visitDeclaration(alphaParser.DeclarationContext ctx) {
        String variablename = ctx.TEXT().getText();
        DataType type = DataTypes.getEnum(ctx.dataType().getText());

        ArrayList<String> list = new ArrayList<>();

        list.add(variablename);
        list.add(type.toString());

        scope.declareVariable(variablename, type);

        return list;
    }

    /**
     * @param ctx
     * @return Arraylist with 0: variablename and 1: Datatype (as string)
     */
    @Override
    public ArrayList<String> visitVariable(alphaParser.VariableContext ctx) {
        String variableName = ctx.TEXT().getText();
        DataType type = scope.lookupVariable(variableName);

        ArrayList<String> list = new ArrayList<>();

        list.add(variableName);
        if (type == null) {
            type = DataType.VOID;
        }
        list.add(type.toString());

        return list;
    }

    @Override
    public ArrayList<String> visitDeclarationFill(alphaParser.DeclarationFillContext ctx) {
        ArrayList<String> variable = visit(ctx.children.get(0));
        String variableName = variable.get(0);
        DataType type = DataType.valueOf(variable.get(1));

        ArrayList<String> list = new ArrayList<>();

        //put the number in memory
        list.addAll(visit(ctx.expression()));

        //store number new way
        int number = scope.getVariable(variableName).localNumber;

        //todo use commands function for this
        list.add(TypeConverter.convert(type, false) + "store " + number);

        //todo: work out expression

        return list;
    }

    @Override
    public ArrayList<String> visitDeclarationStatementStatement(alphaParser.DeclarationStatementStatementContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        for (ParseTree t : ctx.children) {
            ArrayList<String> temp = visit(t);
            if (temp != null)
                list.addAll(temp);
        }
        return list;
    }

    @Override
    public ArrayList<String> visitDeclarationStatement(alphaParser.DeclarationStatementContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        for (ParseTree t : ctx.children) {
            ArrayList<String> temp = visit(t);
            if (temp != null)
                list.addAll(temp);
        }
        return list;
    }

    @Override
    public ArrayList<String> visitDeclarationFinal(alphaParser.DeclarationFinalContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        for (ParseTree t : ctx.children) {
            ArrayList<String> temp = visit(t);
            if (temp != null)
                list.addAll(temp);
        }
        return list;
    }

    @Override
    public ArrayList<String> visitGlobalStatements(alphaParser.GlobalStatementsContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        String variableName;
        DataType type;
        if (ctx.declaration() != null) {
            ArrayList<String> variable = visit(ctx.declaration());
            variableName = variable.get(0);
            type = DataType.valueOf(variable.get(1));
        } else {
            ArrayList<String> variable = visit(ctx.declarationFinal().declarationFill().children.get(0));
            variableName = variable.get(0);
            type = DataType.valueOf(variable.get(1));

            //expressions opslaan om te verwerken in de pizza functie
            globalExpressions.add(ctx.declarationFinal().declarationFill().expression());                               //todo onnodig?
            globalVariables.add(variableName);
            //todo get value
            //checks if the value is final
            if (ctx.declarationFinal().declarationFill().expression().children.size() == 1) {
                addToMain.add(TypeConverter.generateCommand(type,
                        ctx.declarationFinal().declarationFill().expression().getText(), Command.PUT));
            } else { //if not run through children
                //Visit all the expression children
                //fixme nullpointer city
//                addToMain.addAll(visit(ctx.declarationFinal().declarationFill().expression()));
            }
            //putstatic Exercise4/counter I
            addToMain.add("putstatic " + fileName + "/" + variableName + " " + TypeConverter.convert(type, true));
        }

        String line = ".field public static " + variableName + " " + TypeConverter.convert(type, true);

        list.add(line);

        return list;
    }

    @Override
    public ArrayList<String> visitFunction(alphaParser.FunctionContext ctx) {
        ArrayList<String> list = new ArrayList<>();
        functionName = ctx.functionDeclaration().TEXT().getText();

        scope = scope.open(functionName);

        String functionName = ctx.functionDeclaration().TEXT().getText();
        returnTypes = new DataType[]{DataType.VOID};

        //Main of the programm
        if (functionName.equals("pizza")) {
            functionName = "main";

            //hardcoded, main method always gets string array and returns void
            list.add(NEWLINE + ".method public static " + functionName + "([Ljava/lang/String;)V");

        } else {
            //fill in return types
            returnTypes = new DataType[ctx.functionDeclaration().dataType().size()];
            for (int i = 0; i < ctx.functionDeclaration().dataType().size(); i++) {
                returnTypes[i] = DataTypes.getEnum(ctx.functionDeclaration().dataType(i).getText());
            }

            DataType returnType = DataType.VOID;

            //if 1 return expressionType, just do it the normal way
            if (returnTypes.length == 1) {
                returnType = returnTypes[0];
            }

            //setup list of arguments
            String arguments = "";
            //if there are arguments
            if (ctx.functionDeclaration().argumentsDeclaration() != null) {
                for (String s : visitArgumentsDeclaration(ctx.functionDeclaration().argumentsDeclaration())) {
                    arguments += s;
                }
            }

            //todo: first argument (spot 0) is called a, second argument (1) is called b, etc

            list.add(NEWLINE + ".method public static " + functionName + "(" + arguments + ")" + TypeConverter.convert(returnType, true));

        }

        int variableAmount;

        //Gets amount of variables in function
        if (functionName.equals("main")) {
            variableAmount = Identifier.parentScope.getScopeSize("pizza");
        } else {
            variableAmount = Identifier.parentScope.getScopeSize(functionName);
        }

        int localSize = returnTypes.length + variableAmount; //todo: replace 10 with amount of variables in function

        list.add(".limit stack " + localSize * 2);
        list.add(".limit locals " + localSize);

        /*----------------------------------------------------------------------------------------------------------*/
        // handle all function remaining statements //
        /*----------------------------------------------------------------------------------------------------------*/

        for (ParseTree t : ctx.statement()) {
            //todo dont visit nullpointers
            ArrayList<String> result = visit(t);
            if (result != null) {
                list.addAll(result);
            }
        }


        if (functionName.equals("main")) {
            list.add("return");
        } else {
            if (returnTypes.length == 1) {
                list.add(TypeConverter.convert(returnTypes[0], false) + "return");
            } else {






                String output =  TypeChecker.parentScope.lookupMethod(functionName).getReturn().size() == 1 ?
                        TypeConverter.convert(TypeChecker.parentScope.lookupMethod(functionName).getReturnType(0),true) : "";
                list.add(output +"return");
            }


        }

        list.add(".end method" + NEWLINE);

        if (functionName.equals("main")) {
            main = list;
            return new ArrayList<String>();
        }
        scope = scope.close();
        return list;
    }



    @Override
    public ArrayList<String> visitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx) {
        ArrayList<String> list = new ArrayList<>();


        for (alphaParser.DeclarationFunctionContext d : ctx.declarationFunction()) {
            //variables toevoegen enzo bro
            if (d.declaration() != null) {
                visit(d.declaration());
                list.add(TypeConverter.convert(d.declaration().dataType().getText(), true));

            } else {
                visit(d.declarationFill()); //need to visit declaration, to add it to scope
                //TODO CHECK LATER
                list.add(TypeConverter.convert(d.declarationFill().declaration().dataType().getText(), true));
            }
        }
        return list;
    }

    @Override
    public ArrayList<String> visitPrintFunction(alphaParser.PrintFunctionContext ctx) {
        ArrayList<String> list = new ArrayList<>();
        //todo handle variables and stuff
        list.add("getstatic java/lang/System/out Ljava/io/PrintStream;");
        String printText = "";
        DataType toPrint = DataType.STRING;
        for (ParseTree t : ctx.children) {
            ArrayList<String> result = visit(t);
            if (result != null) {
                list.addAll(result);
                toPrint = expressionType;
            }
        }

        list.add(printText);

        list.add("invokevirtual java/io/PrintStream/println(" + TypeConverter.convert(toPrint, true) + ")V");

        return list;
    }

    @Override
    public ArrayList<String> visitReadFunction(alphaParser.ReadFunctionContext ctx) {
        ArrayList<String> list = new ArrayList<>();
        //Get type
        visit(ctx.declaration());
        list.add("new java/util/Scanner");
        list.add("dup");
        list.add("getstatic java/lang/System.in Ljava/io/InputStream;");
        list.add("invokespecial java/util/Scanner.<init>(Ljava/io/InputStream;)V");
        switch (DataTypes.getEnum(ctx.declaration().dataType().getText())) {
            case CHAR:
                list.add("invokevirtual java/util/Scanner.next()Ljava/lang/String;");
                list.add("iconst_0");
                list.add("invokevirtual java/lang/String.charAt(I)C");
                break;
            case STRING:
                list.add("invokevirtual java/util/Scanner.next()Ljava/lang/String;");
                break;
            case DOUBLE:
                list.add("invokevirtual java/util/Scanner.nextDouble()D");
                break;
            case BOOLEAN:
                list.add("invokevirtual java/util/Scanner.nextBoolean()Z");
                break;
            case INTEGER:
                list.add("invokevirtual java/util/Scanner.nextInt()I");
                break;
        }

        list.add(TypeConverter.generateCommand(scope.lookupVariable(ctx.declaration().TEXT().getText()),
                Integer.toString(scope.getVariable(ctx.declaration().TEXT().getText()).localNumber), Command.STORE));

        return list;
    }

    ///////////////////////EXPRESSIONS////////////////////////////

    private DataType expressionType;

    @Override
    public ArrayList<String> visitStringValue(alphaParser.StringValueContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        list.add(TypeConverter.generateCommand(DataType.STRING, ctx.getText(), Command.PUT));
        expressionType = DataType.STRING;

        return list;
    }

    @Override
    public ArrayList<String> visitNumberValue(alphaParser.NumberValueContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        if (ctx.getText().contains(".")) { //this is a double todo: maybe change to if it has digits behind the number. maybe not.
            list.add(TypeConverter.generateCommand(DataType.DOUBLE, ctx.getText(), Command.PUT));
            expressionType = DataType.DOUBLE;
        } else { //this is an int
            list.add(TypeConverter.generateCommand(DataType.INTEGER, ctx.getText(), Command.PUT));
            expressionType = DataType.INTEGER;
        }

        return list;
    }

    @Override
    public ArrayList<String> visitVariableExpression(alphaParser.VariableExpressionContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        Variable variable = scope.getVariable(ctx.getText());
        list.add(TypeConverter.generateCommand(variable.type, "" + variable.localNumber, Command.LOAD));
        expressionType = variable.type;

        return list;
    }

    @Override
    public ArrayList<String> visitTrueValue(alphaParser.TrueValueContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        list.add(TypeConverter.generateCommand(DataType.TRUE, "1", Command.PUT));
        expressionType = DataType.BOOLEAN;

        return list;
    }

    @Override
    public ArrayList<String> visitFalseValue(alphaParser.FalseValueContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        list.add(TypeConverter.generateCommand(DataType.FALSE, "0", Command.PUT));
        expressionType = DataType.BOOLEAN;

        return list;
    }

    @Override
    public ArrayList<String> visitCharValue(alphaParser.CharValueContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        list.add(TypeConverter.generateCommand(DataType.CHAR, ctx.getText(), Command.PUT));
        expressionType = DataType.CHAR;

        return list;
    }

    /**
     * Helper method used to build strings from two values
     *
     * @param sources   list of items (commands) to add to the string
     * @param dataTypes datatype of each item
     * @return result value (command list)
     */
    public ArrayList<String> stringBuilder(ArrayList<ArrayList<String>> sources, ArrayList<DataType> dataTypes) {
        ArrayList<String> list = new ArrayList<>();

        //first, setup the string builder
        list.add("new java/lang/StringBuilder");
        list.add("dup");
        list.add("invokespecial java/lang/StringBuilder.<init>()V");

        //now, for each variable, load and add
        for (int i = 0; i < sources.size(); i++) {
            list.addAll(sources.get(i));
            list.add("invokevirtual java/lang/StringBuilder.append(" + TypeConverter.convert(dataTypes.get(i), true) + ")Ljava/lang/StringBuilder;");
        }

        //done adding everything, finish off the stringbuilder
        list.add("invokevirtual java/lang/StringBuilder.toString()Ljava/lang/String;");

        expressionType = DataType.STRING;

        return list;
    }

    public ArrayList<String> stringBuilder(ArrayList<String> list, DataType type0, ArrayList<String> list1, DataType type1) {
        ArrayList<ArrayList<String>> totalList = new ArrayList<>();
        totalList.add(list);
        totalList.add(list1);

        ArrayList<DataType> allTypes = new ArrayList<>();
        allTypes.add(type0);
        allTypes.add(type1);

        return stringBuilder(totalList, allTypes);
    }

    /**
     * Helper method used to do math. also sets expressionType to the relevant type
     *
     * @param list     command list for the first expression
     * @param type0    datatype of first expression
     * @param list1    command list for second expression
     * @param type1    datatype for second expression
     * @param modifier modifier to use (eg: 'add', 'div', 'mul' etc)
     * @return command list, or null if invalid datatype is used
     */
    private ArrayList<String> mathExpression(ArrayList<String> list, DataType type0, ArrayList<String> list1, DataType type1, String modifier) {
        if (type0 == DataType.INTEGER) {
            if (type1 == DataType.INTEGER) {
                list.addAll(list1);
                list.add("i" + modifier);

                expressionType = DataType.INTEGER;
            } else if (type1 == DataType.DOUBLE) {
                list.add("i2d"); //convert int to double
                list.addAll(list1);
                list.add("d" + modifier);

                expressionType = DataType.DOUBLE;
            } else { //not a valid math type, return
                return null;
            }
        } else if (type0 == DataType.DOUBLE) {
            if (type1 == DataType.INTEGER) {
                list.addAll(list1);
                list.add("i2d");
                list.add("d" + modifier);

                expressionType = DataType.DOUBLE;
            } else if (type1 == DataType.DOUBLE) {
                list.addAll(list1);
                list.add("d" + modifier);

                expressionType = DataType.DOUBLE;
            } else { //not a valid math type, return
                return null;
            }
        } else { //not a valid math type, return
            return null;
        }

        return list;
    }

    /**
     * Helper method used in working out expressions involving math
     *
     * @param ctx expressionContext
     * @return List of instructions, or null if parameters were invalid
     */
    private ArrayList<String> mathExpression(alphaParser.ExpressionContext ctx, String modifier) {
        ArrayList<String> list;
        //maybe have to convert the first output, so keep output of second expression in a separate list
        ArrayList<String> list0 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();
        DataType[] types = new DataType[2];

        //visit both expressions, store both datatypes
        list0.addAll(visit(ctx.children.get(0)));
        types[0] = expressionType;

        list1.addAll(visit(ctx.children.get(2)));
        types[1] = expressionType;

        //now figure out how to combine those two datatypes.
        ArrayList<String> resultList = mathExpression(list0, types[0], list1, types[1], modifier);

        if (resultList != null) { //valid math, just return this
            list = resultList;
        } else { //invalid math
            list = null;
        }

        return list;
    }

    private boolean onlyPlusExpression = true;
    
    public boolean plusExpressionIsString(alphaParser.PlusExpressionContext ctx) {
        onlyPlusExpression = true;
        boolean isString = false;
        
        List<alphaParser.ExpressionContext> expressions = ctx.expression();

        for (int i = 0; i < expressions.size(); i++) {
            alphaParser.ExpressionContext e = expressions.get(i);
            if (e instanceof alphaParser.PlusExpressionContext) { //check if it's still a plusexpression

                alphaParser.PlusExpressionContext e2 = (alphaParser.PlusExpressionContext) e;
                if (plusExpressionIsString(e2)) { //if child plusexpression is a string, we want to remember and return that
                    isString = true;
                } else if (!onlyPlusExpression) { //child plusexpression is not a string AND it's not only plusexpression, so we immediately return failure.
                    return false;
                }

            } else if (e instanceof alphaParser.ValueExpressionContext || e instanceof alphaParser.VariableExpressionContext) { //todo: support functioncall expression

                //visits the expressions, setting expressiontype to the relevant type.
                visit(e);

                if (expressionType == DataType.CHAR || expressionType == DataType.STRING || expressionType == DataType.BOOLEAN || expressionType == DataType.TRUE || expressionType == DataType.FALSE) {
                    isString = true;
                }
            } else if(e instanceof alphaParser.LeftBracketExpressionRightBracketExpressionContext) {
                
                //unknown expression, add it to the list
                alphaParser.LeftBracketExpressionRightBracketExpressionContext e2 = (alphaParser.LeftBracketExpressionRightBracketExpressionContext) expressions.get(i);
                expressions.add(e2.expression());
                
            } else if(e instanceof alphaParser.GreaterOrEqualExpressionContext ||
                      e instanceof alphaParser.SmallerOrEqualExpressionContext ||
                      e instanceof alphaParser.GreaterThanExpressionContext ||
                      e instanceof alphaParser.SmallerThanExpressionContext ||
                      e instanceof alphaParser.EqualToExpressionContext ||
                      e instanceof alphaParser.NotEqualToExpressionContext ||
                      e instanceof alphaParser.AndExpressionContext ||
                      e instanceof alphaParser.OrExpressionContext ||
                      e instanceof alphaParser.AddCustomExpressionContext) { //these are all definitely string types

                return true;

            } else { //not a plus expression and not a value, so it's definitely math, not a string.
                onlyPlusExpression = false;
                return false;
            }
        }

        return isString;
    }

    private void fillValues(ArrayList<ArrayList<String>> list, ArrayList<DataType> types, alphaParser.ExpressionContext ctx) {
        for(ParseTree t: ctx.children) {
            if (    t instanceof alphaParser.ValueExpressionContext || 
                    t instanceof alphaParser.VariableExpressionContext || 
                    t instanceof alphaParser.LeftBracketExpressionRightBracketExpressionContext ||
                    t instanceof alphaParser.GreaterOrEqualExpressionContext ||
                    t instanceof alphaParser.SmallerOrEqualExpressionContext ||
                    t instanceof alphaParser.GreaterThanExpressionContext ||
                    t instanceof alphaParser.SmallerThanExpressionContext ||
                    t instanceof alphaParser.EqualToExpressionContext ||
                    t instanceof alphaParser.NotEqualToExpressionContext ||
                    t instanceof alphaParser.AndExpressionContext ||
                    t instanceof alphaParser.OrExpressionContext ||
                    t instanceof alphaParser.AddCustomExpressionContext) {
                

                //add the values
                list.add(visit(t));

                types.add(expressionType);
            } else if (t instanceof alphaParser.ExpressionContext) {
                alphaParser.ExpressionContext e = (alphaParser.ExpressionContext) t;
                fillValues(list, types, e);
            }
        }
    }

    private boolean topLevelPlusExpression = true;

    @Override
    public ArrayList<String> visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        ArrayList<String> list;
        boolean localTopLevelPlusExpression = false;

        if (this.topLevelPlusExpression) {
            this.topLevelPlusExpression = false;
            localTopLevelPlusExpression = true;
        }

        if (localTopLevelPlusExpression && plusExpressionIsString(ctx)) { // only check for the first plus expression - is string, so do things differently to optimise for stack
            //if this is a string, we don't loop through the rest of the plusExpressions

            ArrayList<ArrayList<String>> valueList = new ArrayList<>();
            ArrayList<DataType> valueTypes = new ArrayList<>();

            fillValues(valueList, valueTypes, ctx);

            list = stringBuilder(valueList, valueTypes);
        } else {
            //this is a number, so we loop through the rest of the plusexpressions

            //maybe have to convert the first output, so keep output of second expression in a separate list
            ArrayList<String> list0 = new ArrayList<>();
            ArrayList<String> list1 = new ArrayList<>();
            DataType[] types = new DataType[2];

            //visit both expressions, store both datatypes
            list0.addAll(visit(ctx.expression(0)));
            types[0] = expressionType;

            list1.addAll(visit(ctx.expression(1)));
            types[1] = expressionType;

            //now figure out how to combine those two datatypes.
            ArrayList<String> resultList = mathExpression(list0, types[0], list1, types[1], "add");

            if (resultList != null) { //valid math, just return this
                list = resultList;
            } else {
                throw new RuntimeException("this should never happen");
            }
        }

        if (localTopLevelPlusExpression) {
            this.topLevelPlusExpression = true;
        }

        return list;
    }

    @Override
    public ArrayList<String> visitMinusExpression(alphaParser.MinusExpressionContext ctx) {
        return mathExpression(ctx, "sub");
    }

    @Override
    public ArrayList<String> visitModuloExpression(alphaParser.ModuloExpressionContext ctx) {
        return mathExpression(ctx, "rem");
    }

    @Override
    public ArrayList<String> visitMultiplyExpression(alphaParser.MultiplyExpressionContext ctx) {
        return mathExpression(ctx, "mul");
    }

    @Override
    public ArrayList<String> visitDivideExpression(alphaParser.DivideExpressionContext ctx) {
        return mathExpression(ctx, "div");
    }

    @Override
    public ArrayList<String> visitAddCustomExpression(alphaParser.AddCustomExpressionContext ctx) {
        //altijd een string
        ArrayList<String> list = new ArrayList<>();

        ArrayList<ArrayList<String>> listOfValues = new ArrayList<>();
        ArrayList<DataType> listOfDataTypes = new ArrayList<>();

        fillValues(listOfValues, listOfDataTypes, ctx);

        list.addAll(stringBuilder(listOfValues, listOfDataTypes));

        //todo: ooit nog number bij elkaar. maar daarvoor moet TypeChecker ook aangepast worden

        return list;
    }

    ///NUMBER COMPARISON
    private int flagCounter = 0;

    private ArrayList<String> flagHelper(ArrayList<String> variables, String comparison, ArrayList<String> resultFalse, ArrayList<String> resultTrue) {
        ArrayList<String> list = new ArrayList<>();
        String flag = "flag" + flagCounter;
        ++flagCounter;

        //add the values to the stack
        list.addAll(variables);

        //compare
        list.add(comparison + " " + flag + "true");

        //false
        list.addAll(resultFalse);
        list.add("goto " + flag + "end");

        //true
        list.add(flag + "true:");
        list.addAll(resultTrue);

        //endflag
        list.add(flag + "end:");

        return list;
    }
    
    private ArrayList<String> compare(alphaParser.ExpressionContext ctx, String compareType) {
        ArrayList<String> list = new ArrayList<>();
        DataType type;

        //first, load the two variables to compare
        ArrayList<String> list0 = new ArrayList<>();
        ArrayList<String> list1 = new ArrayList<>();

        //visit both expressions, store both datatypes
        list0.addAll(visit(ctx.children.get(0)));
        DataType type0 = expressionType;

        list1.addAll(visit(ctx.children.get(2)));
        DataType type1 = expressionType;

        //convert to proper type is necessary
        if (type0 != type1) { //not equal, so one is double, one is int. find the int and convert
            type = DataType.DOUBLE;
            if (type0 == DataType.INTEGER) {
                list.addAll(list0);
                list.add("i2d");
                list.addAll(list1);
            } else {
                list.addAll(list0);
                list.addAll(list1);
                list.add("i2d");
            }
        } else { //just set the type to whatever the type is
            list.addAll(list0);
            list.addAll(list1);
            type = type0;
        }
        
        String comparison = "if_" + TypeConverter.convert(type, false) + "cmp" + compareType;
        ArrayList<String> resultFalse = new ArrayList<>();
        resultFalse.add(TypeConverter.generateCommand(DataType.BOOLEAN, "0", Command.PUT));
        
        ArrayList<String> resultTrue = new ArrayList<>();
        resultTrue.add(TypeConverter.generateCommand(DataType.BOOLEAN, "1", Command.PUT));
        
        list = flagHelper(list, comparison, resultFalse, resultTrue);
        
        expressionType = DataType.BOOLEAN;

        return list;
    }
            
    @Override
    public ArrayList<String> visitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx) {
        return compare(ctx, "lt");
    }

    @Override
    public ArrayList<String> visitSmallerOrEqualExpression(alphaParser.SmallerOrEqualExpressionContext ctx) {
        return compare(ctx, "le");
    }

    @Override
    public ArrayList<String> visitGreaterThanExpression(alphaParser.GreaterThanExpressionContext ctx) {
        return compare(ctx, "gt");
    }

    @Override
    public ArrayList<String> visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        return compare(ctx, "ge");
    }

    //COMPARISON

    @Override
    public ArrayList<String> visitEqualToExpression(alphaParser.EqualToExpressionContext ctx) {
        return compare(ctx, "eq");
    }

    @Override
    public ArrayList<String> visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx) {
        return compare(ctx, "ne");
    }

    //BOOLEAN THINGS

    @Override
    public ArrayList<String> visitNotExpression(alphaParser.NotExpressionContext ctx) {
        ArrayList<String> list;

        //equal to 0
        String comparison = "ifeq";
        
        //not equal to zero, so one. so add zero to stack
        ArrayList<String> resultFalse = new ArrayList<>();
        resultFalse.add(TypeConverter.generateCommand(DataType.BOOLEAN, "0", Command.PUT));

        //equal to zero, so zero. so add one to stack
        ArrayList<String> resultTrue = new ArrayList<>();
        resultTrue.add(TypeConverter.generateCommand(DataType.BOOLEAN, "1", Command.PUT));

        list = flagHelper(visit(ctx.expression()), comparison, resultFalse, resultTrue);

        expressionType = DataType.BOOLEAN;
        
        return list;
    }

    @Override
    public ArrayList<String> visitOrExpression(alphaParser.OrExpressionContext ctx) {
        ArrayList<String> list;

        //equal to zero
        String comparison = "ifeq";
        
        //not equal to zero, so the first expression is true
        ArrayList<String> resultFalse = new ArrayList<>();
        resultFalse.add(TypeConverter.generateCommand(DataType.BOOLEAN, "1", Command.PUT));

        //equal to zero, so the first expression is false. but maybe the other one is true?
        ArrayList<String> resultTrue = new ArrayList<>();
        
        ArrayList<String> resultTrue2 = new ArrayList<>();
        resultTrue2.add(TypeConverter.generateCommand(DataType.BOOLEAN, "0", Command.PUT));

        ArrayList<String> variable = visit(ctx.expression(1));
        resultTrue.addAll(flagHelper(variable, comparison, resultFalse, resultTrue2));

        variable = visit(ctx.expression(0));
        list = flagHelper(variable, comparison, resultFalse, resultTrue);

        expressionType = DataType.BOOLEAN;

        return list;
    }

    @Override
    public ArrayList<String> visitAndExpression(alphaParser.AndExpressionContext ctx) {
        ArrayList<String> list;

        //equal to zero
        String comparison = "ifeq";

        //not equal to zero, so the first expression is true
        //but is the other one true too?
        ArrayList<String> resultFalse = new ArrayList<>();
        
        ArrayList<String> resultFalse2 = new ArrayList<>();
        resultFalse2.add(TypeConverter.generateCommand(DataType.BOOLEAN, "1", Command.PUT));

        //equal to zero, so the expression is false.
        ArrayList<String> resultTrue = new ArrayList<>();
        resultTrue.add(TypeConverter.generateCommand(DataType.BOOLEAN, "0", Command.PUT));
        
        //second comparison
        resultFalse.addAll(flagHelper(visit(ctx.expression(1)), comparison, resultFalse2, resultTrue));
        
        list = flagHelper(visit(ctx.expression(0)), comparison, resultFalse, resultTrue);

        expressionType = DataType.BOOLEAN;

        return list;
    }

    ////IMPOSSIBLE//////

    @Override
    public ArrayList<String> visitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx) {
        //todo: kill me now
        return super.visitFunctionCallExpression(ctx);
    }

    ///////////////////STATEMENTS//////////////////////////

    @Override
    public ArrayList<String> visitFunctionCallStatement(alphaParser.FunctionCallStatementContext ctx) {
        ArrayList<String> list = new ArrayList<>();
        String input = TypeChecker.parentScope.lookupMethod(ctx.functionCall().TEXT().getText()).getParameters().size() == 1 ?
                TypeConverter.convert(TypeChecker.parentScope.lookupMethod(ctx.functionCall().TEXT().getText()).getParameters(0),true) : "";

        String output =  TypeChecker.parentScope.lookupMethod(ctx.functionCall().TEXT().getText()).getReturn().size() == 1 ?
                TypeConverter.convert(TypeChecker.parentScope.lookupMethod(ctx.functionCall().TEXT().getText()).getReturnType(0),true) : "V";

        list.add("invokestatic " + fileName + "/" + ctx.functionCall().TEXT().getText() + "(" + input + ")" + output );

       if(TypeChecker.parentScope.lookupMethod(ctx.functionCall().TEXT().getText()).getReturn().size() == 1 ){
          ArrayList<String> variable = visit(ctx.functionCall().children.get(0));
          list.add(TypeConverter.generateCommand(DataType.valueOf(variable.get(1)),Integer.toString(scope.getVariable(variable.get(0)).localNumber),Command.STORE));
       }else{
           //todo multible return
       }

        return list;
    }

    @Override
    public ArrayList<String> visitReturnMethodStatement(alphaParser.ReturnMethodStatementContext ctx) {
        ArrayList<String> list = new ArrayList<>();
        if(ctx.returnMethod().expression().size() == 1){
            if(ctx.returnMethod().expression(0) instanceof alphaParser.VariableExpressionContext){
                list.add(TypeConverter.generateCommand(TypeChecker.parentScope.lookupMethod(functionName).getReturnType(0) ,
                        Integer.toString(scope.getVariable(ctx.returnMethod().expression(0).getText()).localNumber),
                        Command.LOAD));
            }else {
                list.add(TypeConverter.generateCommand(TypeChecker.parentScope.lookupMethod(functionName).getReturnType(0)
                        , ctx.returnMethod().expression(0).getText(),
                        Command.PUT));
            }
        }else{
            //todo multible return
        }
        return list;
    }

    ////////////////////SCOPE//////////////////////////////

    @Override
    public ArrayList<String> visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        ArrayList<String> list = visit(ctx.expression());

        return list;
    }

    @Override
    public ArrayList<String> visitIfStatement(alphaParser.IfStatementContext ctx) {
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

        return new ArrayList<>();
    }

    @Override
    public ArrayList<String> visitWhileMethod(alphaParser.WhileMethodContext ctx) {
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

        return new ArrayList<>();
    }

    @Override
    public ArrayList<String> visitCatchFunction(alphaParser.CatchFunctionContext ctx) {
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

        return new ArrayList<>();
    }

    @Override
    public ArrayList<String> visitThrowBlock(alphaParser.ThrowBlockContext ctx) {
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

        return new ArrayList<>();
    }
}
