package org.example.miniprojects.leetcode;

public class FindTheHighestAltitude {
    public static int largestAltitude(int[] gain) {
        int highest = 0;
        int value = 0;
        for (int i = 0; i < gain.length; i++) {
           value += gain[i];
           if (value > highest) highest = value;
        }

        return highest;
    }
}
