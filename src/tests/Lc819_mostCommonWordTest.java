package tests;

import leetcode.Lc819_mostCommonWord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lc819_mostCommonWordTest {

    @Test
    public void mostCommonWord() {
        Lc819_mostCommonWord solution = new Lc819_mostCommonWord();
        String para = "Bob. hIt, balL";
        String[] banned = {"bob", "hit"};
        assertEquals(solution.mostCommonWord(para, banned), "ball");
    }
}