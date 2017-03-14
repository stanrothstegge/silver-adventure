package main.java;

import main.antlr4.*;
import main.java.bytecode.CodeGenerator;
import main.java.scopechecking.Identifier;
import main.java.typechecking.TypeChecker;
import org.antlr.v4.runtime.ANTLRFileStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import java.io.IOException;


/**
 * Creating the best language
 */
class Alpha {

    public static void main(String[] args) throws IOException {

        //week 1
        //Load in the file and  create lexer from it
        alphaLexer lexer = new alphaLexer(new ANTLRFileStream("src/main/alpha/test2.alpha"));
        //run scanner to create stream of tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create parser and feed it the tokens
        alphaParser parser = new alphaParser(tokens);
        ParseTree expression = parser.language(); // should be the start of the program

        //week 2
        // Evaluate by running the visitor
        Identifier identifier = new Identifier();
        identifier.visit(expression);
        // then type check
        TypeChecker type = new TypeChecker();
        type.visit(expression);
        //Byte code generator
        CodeGenerator codeGenerator = new CodeGenerator("test2");
        codeGenerator.visit(expression);
        System.out.println("done?");
    }
}
