package org.example.miniprojects.codewars;

import java.util.*;

public class HelpTheBookseller {
    public static String stockSummary(String[] lstOfArt, String[] lstOf1stLetter) {
        if (lstOfArt.length == 0 || lstOf1stLetter.length == 0) return "";

        Map<String, Integer> labelAndItsSum = new HashMap<>();
        for (String label : lstOfArt) {
            String key = String.valueOf(label.charAt(0));
            int sumFromKey = Integer.parseInt(label.split(" ")[1]);
            if (!labelAndItsSum.containsKey(key)) {
                labelAndItsSum.put(key,  sumFromKey);
            } else {
                labelAndItsSum.put(key, labelAndItsSum.get(key) + sumFromKey);
            }
        }

        StringBuilder resultBuilder = new StringBuilder();
        for (int i = 0; i < lstOf1stLetter.length; i++) {

            Integer sumFromKey = labelAndItsSum.get(lstOf1stLetter[i]);
            if (sumFromKey == null) sumFromKey = 0;

            resultBuilder.append("(").append(lstOf1stLetter[i]).append(" : ").append(sumFromKey).append(")");
            if (i != lstOf1stLetter.length - 1) {
                resultBuilder.append(" - ");
            }
        }

        return resultBuilder.toString();
    }
}
