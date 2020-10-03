package tests.Q_1119;

import leetcode.premium.Q_1119.RemoveVowelsFromString;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RemoveVowelsFromStringTest {

    @Test
    public void removeVowels() {
        RemoveVowelsFromString solution = new RemoveVowelsFromString();
        assertEquals(solution.removeVowels("leetcodeisacommunityforcoders"),  "ltcdscmmntyfrcdrs");
    }
}