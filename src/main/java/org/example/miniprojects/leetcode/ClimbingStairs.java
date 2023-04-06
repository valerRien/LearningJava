package org.example.miniprojects.leetcode;

public class ClimbingStairs {
    public static int climbStairs(int n) {
        int position = 1, subPosition = 1, temp = 0;

        for (int i = 0; i < n - 1; i++) {
            temp = position;
            position = position + subPosition;
            subPosition = temp;
        }

        return position;
    }
}
