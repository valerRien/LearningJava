package org.example.miniprojects.leetcode;

import java.util.*;

public class DecodeTheMessage {
    public static String decodeMessage(String key, String message) {
        Map<Character, Integer> keyTable = fillKeyTable(key);
        return decodeMessage(message, keyTable);
    }

    private static Map<Character, Integer> fillKeyTable(String key) {
        Map<Character, Integer> keyTable = new HashMap<>();
        int index = 0;
        for (int i = 0; i < key.length(); i++) {
            char currentChar = key.charAt(i);
            //check if it's a key sequence or a mark
            if (currentChar < 'a' || currentChar > 'z') continue;
            //break if keyTable full
            if (keyTable.size() == 26) break;
            //fill keyTable, if it's not present
            if (!keyTable.containsKey(currentChar)) {
                keyTable.put(currentChar, index);
                index++;
            }
        }
        return keyTable;
    }

    private static String decodeMessage(String message, Map<Character, Integer> keyTable) {
        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < message.length(); i++) {
            char currentChar = message.charAt(i);
            //decode char if it's an alphabet symbol
            if (currentChar >= 'a' && currentChar <= 'z') currentChar = (char) ('a' + keyTable.get(currentChar));
            //write in a string
            resultBuilder.append(currentChar);
        }
        return resultBuilder.toString();
    }
}
