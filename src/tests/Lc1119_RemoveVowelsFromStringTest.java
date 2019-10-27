package tests;

import code.premium.Lc1119_RemoveVowelsFromString;
import org.junit.Test;

import static org.junit.Assert.*;

public class Lc1119_RemoveVowelsFromStringTest {

    @Test
    public void removeVowels() {
        Lc1119_RemoveVowelsFromString solution = new Lc1119_RemoveVowelsFromString();
        assertEquals(solution.removeVowels("leetcodeisacommunityforcoders"),  "ltcdscmmntyfrcdrs");
    }
}