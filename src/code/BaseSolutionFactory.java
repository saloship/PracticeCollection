package code;

import code.premium.Lc1119_RemoveVowelsFromString;

public class BaseSolutionFactory {

    public static final int TWO_SUM_LESS_THAN_K = 1099;
    public static final int REORDER_DATA_LOG_FILE = 937;
    public static final int MOST_COMMON_WORD = 819;
    public static final int VALID_PALINDROME = 125;
    public static final int REMOVE_VOWEL = 1119;

    public static BaseSolution provideBaseSolution(int progType) {
        switch (progType) {
            case TWO_SUM_LESS_THAN_K:
                return new Lc1099_TwoSumLessThanK();
            case REORDER_DATA_LOG_FILE:
                return new Lc937_ReorderDataLogFiles();
            case MOST_COMMON_WORD:
                return new Lc819_mostCommonWord();
            case VALID_PALINDROME:
                return new Lc125_ValidPalindrome_1();
            case REMOVE_VOWEL:
                return new Lc1119_RemoveVowelsFromString();
            default:
                return null;
        }
    }

}
