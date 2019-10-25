package tests;

import code.BaseSolutionFactory;
import code.Lc125_ValidPalindrome_1;
import code.premium.Lc1119_RemoveVowelsFromString;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lc1119_RemoveVowelsFromStringTest {

    @Test
    public void removeVowels() {
        Lc1119_RemoveVowelsFromString solution = (Lc1119_RemoveVowelsFromString) BaseSolutionFactory
                .provideBaseSolution(BaseSolutionFactory.REMOVE_VOWEL);
        assertEquals(solution.removeVowels("leetcodeisacommunityforcoders"),  "ltcdscmmntyfrcdrs");
    }
}