package stringTaskTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AnagramTestCases {

    @Test
    public void testCase1() {
        String s1 = "Donkey", s2 = "KeyNode";
        String expected = "Not Anagrams";
        String actualResult = StringTaskSolver.getAreAnagramsMessage(s1,s2);
        assertEquals(expected, actualResult);
    }

    @Test
    public void testCase2() {
        String s1 = "eDonkey", s2 = "KeyNode";
        String expected = "Anagrams";
        String actualResult = StringTaskSolver.getAreAnagramsMessage(s1,s2);
        assertEquals(expected, actualResult);
    }


}
