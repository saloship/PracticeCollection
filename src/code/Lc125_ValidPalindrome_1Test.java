package code;

import org.junit.Test;

import static org.junit.Assert.*;

public class Lc125_ValidPalindrome_1Test {

    @Test
    public void isPalindrome() {
        Lc125_ValidPalindrome_1 solution = (Lc125_ValidPalindrome_1) BaseSolutionFactory
                .provideBaseSolution(BaseSolutionFactory.VALID_PALINDROME);
        assertTrue(solution.isPalindrome(""));
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("race a car"));
        assertTrue(solution.isPalindrome("racecar"));
        assertTrue(solution.isPalindrome(".,"));
    }
}