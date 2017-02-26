package main.java;

import main.antlr4.*;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


/**
 * Creating the best langauche
 */
public class Alpha {

    public static void main(String[] args) throws IOException {

        //week 1
        //Load in the file and  create lexer from it
        alphaLexer lexer = new alphaLexer(new ANTLRFileStream("src/main/alpha/test.alpha"));
        //run scanner to create stream of tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser and feed it the tokens
        alphaParser parser = new alphaParser(tokens);
        ParseTree expression = parser.language(); // should be the start of the program

        //week 2
        // Evaluate by running the visitor

       // SemanticEvaluator semanticEvaluator = new SemanticEvaluator();
        //semanticEvaluator.visit(expression);

       Identifier identifier = new Identifier();
       identifier.visit(expression);


        // then type check
        TypeChecker type = new TypeChecker();
        type.visit(expression);

        System.out.println("done?");
    }
}
