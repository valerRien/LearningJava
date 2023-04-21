package org.example.miniprojects.codewars;

public class FormatWordsIntoASentence {
    public static String formatWords(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }
        String result = "";
        int lastLength = 0;
        for (int i = words.length - 1; i >= 0 ; i--) {
            if (!words[i].isEmpty()) {
                if (result.isEmpty()) {
                    result = words[i];
                    lastLength = words[i].length();
                } else if (result.length() == lastLength) {
                    result = words[i] + " and " + result;
                } else {
                    result = words[i] + ", " + result;
                }
            }
        }
        return result;
    }
}
