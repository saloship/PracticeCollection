package tests.Q_819;

import leetcode.normal.Q_819.MostCommonWord;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MostCommonWordTest {

    @Test
    public void mostCommonWord() {
        MostCommonWord solution = new MostCommonWord();
        String para = "Bob. hIt, balL";
        String[] banned = {"bob", "hit"};
        assertEquals(solution.mostCommonWord(para, banned), "ball");
    }
}