package org.example.miniprojects.leetcode;

public class CountNegativeNumbersInASortedMatrix {
    public static int countNegatives(int[][] grid) {
        int negativeCount = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = grid[i].length - 1; j >= 0; j--) {
                if (grid[i][j] >= 0) {
                    break;
                }
                negativeCount++;
            }
        }

        return negativeCount;
    }
}
