package code.premium;

import code.BaseSolution;

import java.util.HashMap;
import java.util.Map;

public class Lc1165_SingleRowKeyboard extends BaseSolution {
    @Override
    public void solveIt() {
        System.out.println(calculateTime("pqrstuvwxyzabcdefghijklmno", "leetcode"));
    }

    public int calculateTime(String keyBoard, String word) {
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < keyBoard.length(); i++) {
            map.put(keyBoard.charAt(i), i);
        }
        int distance = 0;
        int previousPos = 0;
        for(char ch : word.toCharArray()) {
            int pos = map.get(ch);
            distance += Math.abs(pos - previousPos);
            previousPos = pos;
        }
        return distance;
    }
}
