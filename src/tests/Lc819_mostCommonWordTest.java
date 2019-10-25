package tests;

import code.BaseSolutionFactory;
import code.Lc819_mostCommonWord;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lc819_mostCommonWordTest {

    @Test
    public void mostCommonWord() {
        Lc819_mostCommonWord solution = (Lc819_mostCommonWord) BaseSolutionFactory
                .provideBaseSolution(BaseSolutionFactory.MOST_COMMON_WORD);
        String para = "Bob. hIt, balL";
        String[] banned = {"bob", "hit"};
        assertEquals(solution.mostCommonWord(para, banned), "ball");
    }
}