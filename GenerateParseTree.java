import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.FileInputStream;
import java.io.InputStream;

public class GenerateParseTree {
    public static void main(String[] args) throws Exception {

        String inputFile = null;

        if (args.length > 0) inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) is = new FileInputStream(inputFile);

        ANTLRInputStream input = new ANTLRInputStream(is);
        CerlLexer lexer = new CerlLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        CerlParser parser = new CerlParser(tokens);
        ParseTree tree = parser.forms();
        System.out.println(tree.toStringTree(parser));
    }
}
