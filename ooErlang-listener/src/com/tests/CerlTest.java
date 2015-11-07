package com.tests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;

import com.cerl.CerlLexer;
import com.cerl.CerlParser;
import com.cerl.EvalCerlVisitor;

public class CerlTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String inputFile = null;

//        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
//        if (inputFile != null)
			try {
//				is = new FileInputStream(inputFile);
				is = new FileInputStream("/home/varjao/workspace/ooErlang-grammar/examples/helloworld.cerl");
				ANTLRInputStream input;
				input = new ANTLRInputStream(is);
				CerlLexer lexer = new CerlLexer(input);
				CommonTokenStream tokens = new CommonTokenStream(lexer);
				CerlParser parser = new CerlParser(tokens);
				ParseTree tree = parser.forms();
				EvalCerlVisitor visitor = new EvalCerlVisitor();
				visitor.visit(tree);
				
				System.out.println(tree.toStringTree(parser));
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
