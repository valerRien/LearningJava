package org.example.miniprojects.leetcode;

public class CheckIfItIsAStraightLine {
    public static boolean checkStraightLine(int[][] coordinates) {
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        int deltaX = coordinates[1][0] - coordinates[0][0], deltaY = coordinates[1][1] - coordinates[0][1];
        for (int[] xy : coordinates) {
            int x = xy[0], y = xy[1];
            if (deltaX * (y - y1) != deltaY * (x - x1))
                return false;
        }
        return true;
    }
}
