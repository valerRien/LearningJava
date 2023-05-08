package org.example.miniprojects.codewars;

public class PascalsTriangle {
    public static int[][] pascal(int depth) {
        if (depth <= 0) {
            return new int[][]{{}};
        }
        if (depth == 1) {
            return new int[][]{{1}};
        }
        if (depth == 2) {
            return new int[][]{{1}, {1, 1}};
        }

        int[][] result = new int[depth][];
        result[0] = new int[]{1};
        result[1] = new int[]{1, 1};

        for (int i = 2; i < depth; i++) {
            int[] previousInts = result[i - 1];
            int[] newInts = new int[previousInts.length + 1];
            newInts[0] = 1;
            newInts[newInts.length - 1] = 1;

            for (int j = 1; j < newInts.length - 1; j++) {
                newInts[j] = previousInts[j - 1] + previousInts[j];
            }

            result[i] = newInts;
        }

        return result;
    }
}
