package org.example.miniprojects.leetcode;

public class MaximumNumberOfWordsFoundInSentences {
    public static int mostWordsFound(String[] sentences) {
        int result = 0;
        for (String sentence : sentences) {
            String[] split = sentence.split(" ");
            if (split.length > result) result = split.length;
        }

        return result;
    }
}
