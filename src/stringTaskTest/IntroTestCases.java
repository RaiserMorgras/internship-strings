package stringTaskTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class IntroTestCases {

    @Test
    public void testCase1() {
        String s1 = "hello", s2 = "java";
        assertEquals(9, StringTaskSolver.sumStringsLength(s1, s2));
        assertEquals("No", StringTaskSolver.getLexCompareMessage(s1, s2));
        assertEquals("Hello Java", StringTaskSolver.capitalizeJoin(s1, s2));
    }

    @Test
    public void testCase2() {
        String s1 = "zoom", s2 = "in";
        assertEquals(6, StringTaskSolver.sumStringsLength(s1, s2));
        assertEquals("Yes", StringTaskSolver.getLexCompareMessage(s1, s2));
        assertEquals("Zoom In", StringTaskSolver.capitalizeJoin(s1, s2));
    }


}
