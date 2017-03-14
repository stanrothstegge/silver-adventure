package main.java.bytecode;


import main.antlr4.alphaBaseVisitor;
import main.antlr4.alphaParser;
import main.java.shared.DataType;
import main.java.shared.DataTypes;
import main.java.typechecking.TypeChecker;
import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

public class CodeGenerator extends alphaBaseVisitor<ArrayList<String>> {
    
    final String fileName;

    public CodeGenerator(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public ArrayList<String> visitLanguage(alphaParser.LanguageContext ctx) {
        //todo TEST SCOPE
        TypeChecker.variables.get(0);

        ArrayList<String> list = new ArrayList<>();
        list.add(".class public " + fileName);
        list.add(".super java/lang/Object");
        
        //Standard initializer (calls java.lang.Object's initializer), in other words: the empty constructor
        list.add(".method public <init>()V");
        list.add("aload_0");
        list.add("invokenonvirtual java/lang/Object/<init>()V");
        list.add("return");
        list.add(".end method");

        //first, visit all the global statements
        for(ParseTree t :ctx.children) {
            if (t instanceof alphaParser.GlobalStatementContext) {
                list.addAll(visit(t));
            }
        }

        //then visit all the functions
        for(ParseTree t :ctx.children) {
            if (t instanceof alphaParser.FunctionContext) {
                list.addAll(visit(t));
            }
        }
        
        return list;
    }

    /**
     *
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
     * 
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
        
        return list;
    }

    private ArrayList<alphaParser.ExpressionContext> globalExpressions = new ArrayList<>();
    private ArrayList<String> globalVariables = new ArrayList<>();

    @Override
    public ArrayList<String> visitGlobalStatements(alphaParser.GlobalStatementsContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        //todo inbouwen in
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
            
            //todo: expressions opslaan om te verwerken in de pizza functie
            globalExpressions.add(ctx.declarationFinal().declarationFill().expression());
            globalVariables.add(variableName);
        }
        
        String line = ".field public static " + variableName + " " + TypeConverter.convert(type, true);
        
        list.add(line);
        
        return list;
    }
    
    @Override
    public ArrayList<String> visitFunction(alphaParser.FunctionContext ctx) {
        ArrayList<String> list = new ArrayList<>();

        String functionName = ctx.functionDeclaration().TEXT().getText();
        
        if (functionName.equals("pizza")) {
            functionName = "main";
        }
        
        list.add(".method public static " + functionName + "(" + visit(ctx.functionDeclaration().argumentsDeclaration()));
        
        return list;
    }

    private ArrayList<alphaParser.ExpressionContext> argumentDeclarationExpressions = new ArrayList<>();
    private ArrayList<String> argumentDeclarationVariables = new ArrayList<>();

    @Override
    public ArrayList<String> visitArgumentsDeclaration(alphaParser.ArgumentsDeclarationContext ctx) {
        ArrayList<String> list = new ArrayList<>();
        
        for(ParseTree t: ctx.children) {
            //variables toevoegen enzo bro
        }
        
        return list;
    }
    
    //todo: volgens mij nietmeer nodig
    private void test(alphaParser.GlobalStatementsContext ctx){
        String variablename;
        DataType type;
        if (ctx.declaration() != null) {
            variablename = ctx.declaration().TEXT().getText();
            type = DataTypes.getEnum(ctx.declaration().dataType().getText());
        } else {
            if (ctx.declarationFinal().declarationFill().declaration() != null) {
                variablename = ctx.declarationFinal().declarationFill().declaration().TEXT().getText();
                type = DataTypes.getEnum(ctx.declarationFinal().declarationFill().declaration().dataType().getText());
            } else {
                variablename = ctx.declarationFinal().declarationFill().variable().getText();
                type = TypeChecker.variables.get(variablename).getParams();
            }
            globalExpressions.add(ctx.declarationFinal().declarationFill().expression());
            globalVariables.add(variablename);
        }
    }
}
