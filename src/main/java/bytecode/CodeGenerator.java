package main.java.bytecode;


import main.antlr4.alphaBaseVisitor;
import main.antlr4.alphaParser;
import main.java.shared.DataType;
import main.java.shared.DataTypes;
import main.java.shared.model.Function;
import main.java.typechecking.TypeChecker;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class CodeGenerator extends alphaBaseVisitor<ArrayList<String>> {

    final String fileName;
    private static final String NEWLINE = "\r\n";
    private ArrayList<alphaParser.ExpressionContext> globalExpressions = new ArrayList<>();
    private ArrayList<String> globalVariables = new ArrayList<>();
    private DataType[] returnTypes;
    private ArrayList<String> addToMain = new ArrayList<>();
    private ArrayList<String> main = new ArrayList<>();


    public CodeGenerator(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ArrayList<String> visitLanguage(alphaParser.LanguageContext ctx) {
        //todo TEST SCOPE
        TypeChecker.variables.get(0);

        ArrayList<String> list = new ArrayList<>();
        list.add(".class public " + fileName);
        list.add(".super java/lang/Object" + NEWLINE);
        //Standard initializer (calls java.lang.Object's initializer), in other words: the empty constructor
        list.add(".method public <init>()V");
        list.add("aload_0");
        list.add("invokenonvirtual java/lang/Object/<init>()V");
        list.add("return");
        list.add(".end method" + NEWLINE);

        //first, visit all the global statements
        for (ParseTree t : ctx.children) {
            if (t instanceof alphaParser.GlobalStatementsContext) {
                list.addAll(visit(t));
            }
        }

        //then visit all the functions
        for (ParseTree t : ctx.children) {
            if (t instanceof alphaParser.FunctionContext) {
                list.addAll(visit(t));
            }
        }
        //todo count exactle limits and stuff
        //main.set(0,"\r\n.method public static main([Ljava/lang/String;)V");
        main.set(1,".limit stack 100");
        main.set(2,".limit locals 100");
        for (int x = 0; x < addToMain.size(); x++) {
            main.add(x+3, addToMain.get(x));
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

        return list;
    }

    /**
     * @param ctx
     * @return Arraylist with 0: variablename and 1: Datatype (as string)
     */
    @Override
    public ArrayList<String> visitVariable(alphaParser.VariableContext ctx) {
        String variableName = ctx.TEXT().getText();
        DataType type = TypeChecker.variables.get(variableName).getParams();

        ArrayList<String> list = new ArrayList<>();

        list.add(variableName);
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

        //store number todo: number generation and linking and stuff
        list.add(TypeConverter.convert(type, false) + "store " /* + number*/);

        //todo: work out expression

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
            System.out.println(ctx.declarationFinal().declarationFill().expression().getText());
            globalExpressions.add(ctx.declarationFinal().declarationFill().expression());
            globalVariables.add(variableName);

            //todo get value
            //ldc , iconst_1 etc
            addToMain.add(TypeConverter.generateCommand(type,
                    ctx.declarationFinal().declarationFill().expression().getText(),Command.PUT));
            //todo add to main
            //putstatic Exercise4/counter I
            addToMain.add("putstatic "+ fileName + "/" + variableName + TypeConverter.convert(type, true));
        }

        String line = ".field public static " + variableName + " " + TypeConverter.convert(type, true);

        list.add(line);

        return list;
    }



    @Override
    public ArrayList<String> visitFunction(alphaParser.FunctionContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        String functionName = ctx.functionDeclaration().TEXT().getText();
        returnTypes = new DataType[]{DataType.VOID};

        if (functionName.equals("pizza")) {
            functionName = "main";

            //hardcoded, main method always gets string array and returns void
            list.add(NEWLINE +".method public static " + functionName + "([Ljava/lang/String;)V");

        } else {
            //fill in return types
            returnTypes = new DataType[ctx.functionDeclaration().dataType().size()];
            for (int i = 0; i < ctx.functionDeclaration().dataType().size(); i++) {
                returnTypes[i] = DataTypes.getEnum(ctx.functionDeclaration().dataType(i).getText());
            }

            DataType returnType = DataType.VOID;

            //if 1 return type, just do it the normal way
            if (returnTypes.length == 1) {
                returnType = returnTypes[0];
            }

            //setup list of arguments
            String arguments = "";
            for (String s : visitArgumentsDeclaration(ctx.functionDeclaration().argumentsDeclaration())) {
                arguments += s;
            }

            //todo: first argument (spot 0) is called a, second argument (1) is called b, etc

            list.add(NEWLINE +".method public static " + functionName + "(" + arguments + ")" + TypeConverter.convert(returnType, true));

        }
        //Gets amount of variables in function
        int variableAmount = 0;
        for (String k : TypeChecker.variables.keySet()) {
            if (TypeChecker.variables.get(k).getFunctionName() != null) {
                if (TypeChecker.variables.get(k).getFunctionName().equals(functionName)) {
                    variableAmount++;
                }
            }
        }

        int localSize = returnTypes.length + variableAmount; //todo: replace 10 with amount of variables in function

        list.add(".limit stack " + localSize * 2);
        list.add(".limit locals " + localSize);

        if (functionName.equals("main")) {
            //global variables expressions verwerken
            for (int i = 0; i < globalExpressions.size(); i++) {
                String variableName = globalVariables.get(i);
                alphaParser.ExpressionContext expression = globalExpressions.get(i);

                //todo: do stuff with the expression?
            }

        }else{
            //todo call stuff in function
            //todo return statement
        }

        //todo: statements

        list.add(".end method" + NEWLINE);

        if (functionName.equals("main")) {
            main = list;
            return new ArrayList<String>();
        }
        return list;
    }

    private ArrayList<alphaParser.ExpressionContext> argumentDeclarationExpressions = new ArrayList<>();
    private ArrayList<String> argumentDeclarationVariables = new ArrayList<>();

    @Override
    public ArrayList<String> visitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        for (alphaParser.DeclarationFunctionContext d : ctx.declarationFunction()) {

            //variables toevoegen enzo bro
            if (d.declaration() != null) {
                list.add(TypeConverter.convert(d.declaration().dataType().getText(), true));

            } else {
                //TODO CHECK LATER
                list.add(TypeConverter.convert(d.declarationFill().declaration().dataType().getText(), true));
            }
        }
        return list;
    }
}
