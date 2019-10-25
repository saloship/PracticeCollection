package code.premium;

import code.BaseSolution;

public class Lc1119_RemoveVowelsFromString  extends BaseSolution {
    @Override
    public void solveIt() {
        System.out.println(removeVowels("abcd"));
    }

    public String removeVowels(String string) {
     StringBuilder builder = new StringBuilder();
     for(char ch : string.toCharArray()) {
         if(!isVowel(ch)) {
             builder.append(ch);
         }
     }
     return builder.toString();
    }

    public boolean isVowel (char ch) {
        return ((ch == 'a')|| (ch == 'e')|| (ch == 'i')|| (ch == 'o')|| (ch == 'u'));
    }
}
