package main.java;

import main.antlr4.*;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;


/**
 * Creating the best langauche
 */
public class Alpha {

    public static void main(String[] args) {

        //week 1
        ANTLRInputStream inputStream = new ANTLRInputStream("src/main/alpha/firstcode.alpha");
        // Create lexer and run scanner to create stream of tokens
        alphaLexer lexer = new alphaLexer(inputStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser and feed it the tokens
        alphaParser parser = new alphaParser(tokens);
        ParseTree expression = parser.language(); // should be the start of the program

        //week 2
        // Evaluate by running the visitor
        SemanticEvaluator semanticEvaluator = new SemanticEvaluator();
        semanticEvaluator.visit(expression);

        // then type check
        TypeChecker type = new TypeChecker();
        type.visit(expression);

        System.out.println("done?");
    }
}
