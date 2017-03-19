package main.java.scopechecking;

import main.antlr4.*;
import main.java.utils.DataTypes;
import main.java.utils.model.Method;
import main.java.utils.Scope;
import org.antlr.v4.runtime.tree.ParseTree;

import java.util.ArrayList;

/**
 * Visitor
 */
public class Identifier extends alphaBaseVisitor {
    private static Scope scope = new Scope();
    public static final Scope parentScope = scope;

    @Override
    public Object visitLanguage(alphaParser.LanguageContext ctx) {
        Object object = super.visitLanguage(ctx);

        //check if main (pizza) is called
        if (scope.lookupMethod("pizza") == null) {
            throw new RuntimeException("function pizza does not exist, this is required");
        }

        //check if all called methods actually exist
        ArrayList<String> seenMethods = scope.seenMethodsExist();
        if (seenMethods.size() > 0) {
            throw new RuntimeException("variables " + seenMethods + "  do not exist, these are called");
        }

        return object;
    }

    @Override
    public Object visitLeftBracketExpressionRightBracketExpression(alphaParser.LeftBracketExpressionRightBracketExpressionContext ctx) {
        scope = scope.open();

        Object object = super.visitLeftBracketExpressionRightBracketExpression(ctx);

        scope = scope.close();
        return object;
    }

    @Override
    public Object visitDeclaration(alphaParser.DeclarationContext ctx) {
        if (scope.declareVariable(ctx.TEXT().getText(), DataTypes.getEnum(ctx.dataType().getText()))) {
            if (declaringFunction) {
                method.addParameter(DataTypes.getEnum(ctx.dataType().getText()));
            }

            return super.visitDeclaration(ctx);
        }
        throw new RuntimeException("declared something that already exists: " + ctx.getText());
    }

    private boolean declaringFunction = false;
    private Method method;

    @Override
    public Object visitFunctionDeclaration(alphaParser.FunctionDeclarationContext ctx) {
        //count the amount of ~ to determine if there are return types
        boolean returntypes = false;
        method = new Method(ctx.TEXT().getText());
        if (ctx.getText().length() - ctx.getText().replace("~", "").length() == 2) {
            returntypes = true;
        }
        for (ParseTree t : ctx.children) {
            switch (t.getText()) {
                case "~":
                    if (returntypes && !declaringFunction) {
                        //global variable that is used to get method filled
                        declaringFunction = true;
                    }
                    break;
                default:
                    visit(t);
            }
        }

        if(!scope.declareMethod(method)) throw new RuntimeException("iets hier");                 //todo vernaderd later
        method = null;
        declaringFunction = false;

        return null;
    }

    @Override
    public Object visitFunctionCall(alphaParser.FunctionCallContext ctx) {
        scope.seenMethod(ctx.TEXT().getText());
        return super.visitFunctionCall(ctx);
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
    public Object visitFunction(alphaParser.FunctionContext ctx) {
        scope = scope.open();
        Object object = super.visitFunction(ctx);
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
    public Object visitDataType(alphaParser.DataTypeContext ctx) {
        //if declaring return types for a function
        if (declaringFunction) {
            method.addReturnValue(DataTypes.getEnum(ctx.getText()));
        }
        return super.visitDataType(ctx);
    }

    @Override
    public Object visitVariable(alphaParser.VariableContext ctx) {
        if (scope.lookupVariable(ctx.TEXT().getText()) == null) {
            System.err.println(ctx);
            System.err.println(ctx.depth());
            throw new RuntimeException("variable has not been initialized: " + ctx.getText());
        }
        return super.visitVariable(ctx);
    }

}