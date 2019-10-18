package code;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Lc819_mostCommonWord extends BaseSolution {
    @Override
    public void solveIt() {
        String para = "Bob. hIt, balL";
        String[] banned = {"bob", "hit"};
        System.out.println(mostCommonWord(para, banned));
    }
    Map<String, Integer> countMap = new HashMap<>();
    Set<String> bannedSet = new HashSet<>();

    public String mostCommonWord(String paragraph, String[] banned) {
       for(String str : banned) {
           bannedSet.add(str.toLowerCase());
       }
       StringBuilder buffer = new StringBuilder();
       for(int i = 0; i < paragraph.length(); i++) {
           char ch = paragraph.charAt(i);
           if(isLetter(ch)) {
              buffer.append(ch);
           } else {
               if(buffer.length() > 0)
                 checkAndAdd(buffer.toString().toLowerCase());
               buffer = new StringBuilder();
           }
       }
        if (buffer.length() != 0) {
            checkAndAdd(buffer.toString().toLowerCase());
        }
       int maxCount = 0;
       String maxString = "";

       for(String key : countMap.keySet()) {
           int count = countMap.get(key);
           if(count > maxCount) {
               maxCount = count;
               maxString = key;
           }
       }
       return maxString;
    }

    private void checkAndAdd(String string) {
        if(bannedSet.contains(string)) {
            return;
        }
        if(countMap.containsKey(string)) {
            countMap.put(string, countMap.get(string) + 1);
        } else {
            countMap.put(string, 1);
        }
    }

    public boolean isLetter(char c) {
        return ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'));
    }
}
