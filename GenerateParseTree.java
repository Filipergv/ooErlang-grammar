import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class GenerateParseTree {
    public static void main(String[] args) throws Exception {
        ANTLRInputStream input = new ANTLRInputStream(System.in);
        CerlLexer lexer = new CerlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CerlParser parser =  new CerlParser(tokens);
        ParseTree tree =  parser.forms();
        System.out.println(tree.toStringTree(parser));
    }
}
