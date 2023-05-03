package org.example.miniprojects.codewars;

public class YourOrderPlease {
    public static String order(String words) {
        if (words == null || words.isEmpty()) return "";

        String[] split = words.split(" ");
        String[] result = new String[split.length];
        for (String word : split) {
            for (int j = 0; j < word.length(); j++) {
                if (word.charAt(j) > '0' && word.charAt(j) <= '9') {
                    result[word.charAt(j) - '0' - 1] = word;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String word : result) {
            sb.append(word).append(" ");
        }

        return sb.toString().trim();
    }
}
