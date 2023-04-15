package org.example.miniprojects.leetcode;

import java.util.HashMap;
import java.util.Map;

public class JewelsAndStones {
    public int numJewelsInStones(String jewels, String stones) {
        Map<Character, Integer> keys = new HashMap<>();
        int count = 0;
        for (int i = 0; i < jewels.length(); i++) {
            keys.put(jewels.charAt(i), 1);
        }
        for (int i = 0; i < stones.length(); i++) {
            char currentChar = stones.charAt(i);
            if (keys.containsKey(currentChar)) {
                count++;
            }
        }
        return count;
    }
}
