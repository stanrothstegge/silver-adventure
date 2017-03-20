package main.java.bytecode;


import main.antlr4.alphaBaseVisitor;
import main.antlr4.alphaParser;
import main.java.scopechecking.Identifier;
import main.java.utils.DataType;
import main.java.utils.DataTypes;
import main.java.utils.Scope;
import main.java.utils.model.Variable;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;


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
        main.set(1, ".limit stack 100");
        main.set(2, ".limit locals 100");
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
        list.add(TypeConverter.convert(type, false) + "store "  + number);

        //todo: work out expression

        return list;
    }

    @Override
    public ArrayList<String> visitDeclarationStatementStatement(alphaParser.DeclarationStatementStatementContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        for (ParseTree t : ctx.children) {
            ArrayList<String> temp = visit(t);
            if(temp != null)
                list.addAll(temp);
        }
        return list;
    }

    @Override
    public ArrayList<String> visitDeclarationStatement(alphaParser.DeclarationStatementContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        for (ParseTree t : ctx.children) {
            ArrayList<String> temp = visit(t);
            if(temp != null)
                list.addAll(temp);
        }
        return list;
    }

    @Override
    public ArrayList<String> visitDeclarationFinal(alphaParser.DeclarationFinalContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        for (ParseTree t : ctx.children) {
            ArrayList<String> temp = visit(t);
            if(temp != null)
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
            //global variables expressions verwerken
            for (int i = 0; i < globalExpressions.size(); i++) {
                String variableName = globalVariables.get(i);
                alphaParser.ExpressionContext expression = globalExpressions.get(i);

                //todo: do stuff with the expression?
            }
            list.add("return");

        } else {
            //todo return statement
            //todo don't call visit(ctx), inless you realy like stack overflow errors
//            for (ParseTree t : ctx.statement()) {
//                if (t instanceof alphaParser.ReturnMethodStatementContext) {
//                    ArrayList<String> returnList = visit(t);
//                    list.addAll(returnList); //todo handle every child
//                }
//            }
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

        for (ParseTree t : ctx.children) {
            if (t instanceof alphaParser.StringValueContext ||
                    t instanceof alphaParser.NumberValueContext) {//Handles standalone string and expression
                printText += TypeConverter.generateCommand(DataType.STRING, t.getText(),Command.PUT);
            }
            if(t instanceof  alphaParser.VariableExpressionContext){ //Handles standalone variables
                printText += TypeConverter.generateCommand(scope.lookupVariable(t.getText()), Integer.toString(scope.getVariable(t.getText()).localNumber),Command.LOAD);
            } else {
                ArrayList<String > result = visit(t);
                if (result != null) {
                    list.addAll(visit(t));
                } else {
                    System.out.println("something something went wrong help me " + t.getText());
                }
            }
        }
     
        list.add(printText);
        
        list.add("invokevirtual java/io/PrintStream/println(Ljava/lang/String;)V");

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

//        String value = "" + ctx.getText().replaceAll("\'", "").getBytes();  //this maybe works. maybe not
        String ascii = Integer.toString((int) ctx.getText().replaceAll("\'", "").charAt(0));
        list.add(TypeConverter.generateCommand(DataType.CHAR, ascii, Command.PUT));
        expressionType = DataType.CHAR;

        return list;
    }

    /**
     * Helper method used to build strings from two values
     * @param sources list of items (commands) to add to the string
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
     * @param list command list for the first expression
     * @param type0 datatype of first expression
     * @param list1 command list for second expression
     * @param type1 datatype for second expression
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

    @Override
    public ArrayList<String> visitPlusExpression(alphaParser.PlusExpressionContext ctx) {
        ArrayList<String> list;
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
        } else { //invalid math, so it's a string.
            list = stringBuilder(list0, types[0], list1, types[1]);
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
        ArrayList<String> list;
        
        ArrayList<ArrayList<String>> listOfValues = new ArrayList<>();
        ArrayList<DataType> listOfDataTypes = new ArrayList<>();
        
        for(ParseTree t: ctx.children) {
            if (t instanceof alphaParser.VariableContext 
                    || t instanceof alphaParser.NumberValueContext 
                    || t instanceof alphaParser.StringValueContext 
                    || t instanceof alphaParser.CharValueContext 
                    || t instanceof alphaParser.TrueValueContext 
                    || t instanceof alphaParser.FalseValueContext) {
                listOfValues.add(visit(t));
                listOfDataTypes.add(expressionType);
            }
        }

        boolean onlyNumbers = true;
        for(DataType t: listOfDataTypes) {
            if (t != DataType.INTEGER && t != DataType.DOUBLE) {
                onlyNumbers = false;
            }
        }
        
        if (onlyNumbers) { //only numbers, so addition
            
            if (listOfValues.size() == 1) { //just one thing, do it manually
                list = listOfValues.get(0);
            } else {
                //first add the first two values
                ArrayList<String> result = mathExpression(listOfValues.get(0), listOfDataTypes.get(0), listOfValues.get(1), listOfDataTypes.get(1), "add");

                //then, for each next value, get the last result and add it to the next. loop until done
                for (int i = 2; i < listOfValues.size() - 1; i++) {
                    result = mathExpression(result, expressionType, listOfValues.get(i), listOfDataTypes.get(i), "add");
                }

                list = result;
            }
        } else { //something else, so make it a string
            //fixme: incompatible with new stringbuilder
            
            if (listOfValues.size() == 1) { //just one thing, do it manually
                list = listOfValues.get(0);
            } else {
                //first add the first two values
                ArrayList<String> result = stringBuilder(listOfValues.get(0), listOfDataTypes.get(0), listOfValues.get(1), listOfDataTypes.get(1));

                //then, for each next value, get the last result and add it to the next. loop until done
                for (int i = 2; i < listOfValues.size() - 1; i++) {
                    result = stringBuilder(result, DataType.STRING, listOfValues.get(i), listOfDataTypes.get(i));
                }

                list = result;
            }
        }
        
        return list;
    }

    ///NUMBER COMPARISON
    
    @Override
    public ArrayList<String> visitSmallerThanExpression(alphaParser.SmallerThanExpressionContext ctx) {
        return super.visitSmallerThanExpression(ctx);
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
    public ArrayList<String> visitGreaterOrEqualExpression(alphaParser.GreaterOrEqualExpressionContext ctx) {
        return super.visitGreaterOrEqualExpression(ctx);
    }

    //COMPARISON
    
    @Override
    public ArrayList<String> visitEqualToExpression(alphaParser.EqualToExpressionContext ctx) {
        return super.visitEqualToExpression(ctx);
    }

    @Override
    public ArrayList<String> visitNotEqualToExpression(alphaParser.NotEqualToExpressionContext ctx) {
        return super.visitNotEqualToExpression(ctx);
    }
    
    //BOOLEAN THINGS

    @Override
    public ArrayList<String> visitNotExpression(alphaParser.NotExpressionContext ctx) {
        return super.visitNotExpression(ctx);
    }

    @Override
    public ArrayList<String> visitOrExpression(alphaParser.OrExpressionContext ctx) {
        return super.visitOrExpression(ctx);
    }

    @Override
    public ArrayList<String> visitAndExpression(alphaParser.AndExpressionContext ctx) {
        return super.visitAndExpression(ctx);
    }
    
    ////IMPOSSIBLE//////

    @Override
    public ArrayList<String> visitFunctionCallExpression(alphaParser.FunctionCallExpressionContext ctx) {
        //todo: kill me now
        return super.visitFunctionCallExpression(ctx);
    }

    ////////////////////SCOPE//////////////////////////////

    @Override
    public ArrayList<String> visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        scope = scope.open();

        ArrayList<String> list = super.visitLeftBracketExpressionRightBracketExpression(ctx);

        scope = scope.close();
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
