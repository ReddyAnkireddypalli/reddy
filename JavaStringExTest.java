import com.strings.JavaStringEx;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;


public class JavaStringExTest {

    private JavaStringEx javaStringEx = new JavaStringEx();

    @Test
    public void testLineLimit() {

        String line = "Java world java world";
        int limit = 10;

        List<String> printedLines = javaStringEx.printNewLine(line, 10);

        assertEquals("Java world", printedLines.get(0));
        assertEquals("java world", printedLines.get(1));
    }

    @Test
    public void testLineLimitIfItMiddle(){

        String line = "Java worldOneuyuuuiuiuiu java world";
        int limit = 10;

        List<String> printedLines  = javaStringEx.printNewLine(line, 10);

        assertEquals( "Java", printedLines.get(0));
        assertEquals( "worldOneuyuuuiuiuiu", printedLines.get(1));
        assertEquals( "java world", printedLines.get(2));
    }
}
