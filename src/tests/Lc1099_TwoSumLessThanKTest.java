package tests;

import org.junit.Test;
import static org.junit.Assert.*;
import leetcode.*;

public class Lc1099_TwoSumLessThanKTest {

    @Test
    public void twoSumLessThanK() {
        Lc1099_TwoSumLessThanK solution = new Lc1099_TwoSumLessThanK();
        assertEquals(solution.twoSumLessThanK(new int[]{34,23,1,24,75,33,54,8}, 60), 58);
    }
}