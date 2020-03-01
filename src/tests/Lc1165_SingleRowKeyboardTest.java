package tests;

import leetcode.premium.Lc1165_SingleRowKeyboard;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lc1165_SingleRowKeyboardTest {

    @Test
    public void calculateTime() {
        Lc1165_SingleRowKeyboard solution = new Lc1165_SingleRowKeyboard();
        assertEquals(solution.calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"), 73);
    }
}