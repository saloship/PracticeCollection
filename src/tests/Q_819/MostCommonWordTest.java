package tests.Q_819;

import leetcode.Lc819_mostCommonWord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostCommonWordTest {

    @Test
    public void mostCommonWord() {
        Lc819_mostCommonWord solution = new Lc819_mostCommonWord();
        String para = "Bob. hIt, balL";
        String[] banned = {"bob", "hit"};
        assertEquals(solution.mostCommonWord(para, banned), "ball");
    }
}