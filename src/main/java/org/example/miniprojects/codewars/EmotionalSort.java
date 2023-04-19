package org.example.miniprojects.codewars;

import java.util.*;

public class EmotionalSort {

    private static Map<String, Integer> smilesToIndexes = Map.of(":D", 1, ":)", 2, ":|", 3, ":(", 4, "T_T", 5);

    public static String[] sortEmotions(boolean order, String[] emotions) {
        if (order) {
            Arrays.sort(emotions, rightOrder);
        } else {
            Arrays.sort(emotions, reverseOrder);
        }
        return emotions;
    }

    private static Comparator<String> rightOrder = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return smilesToIndexes.get(o1) - smilesToIndexes.get(o2);
        }
    };

    private static Comparator<String> reverseOrder = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return smilesToIndexes.get(o2) - smilesToIndexes.get(o1);
        }
    };
}
