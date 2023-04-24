package org.example.miniprojects.codewars;

public class MultiplicationTable {
    public static int [][] multiplicationTable(int n){
        if (n <= 0) {
            return new int[][]{};
        }

        if (n == 1) {
            return new int[][]{{1}};
        }

        int[][] resultMatrix = new int[n][n];

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                if (i == 0) {
                    resultMatrix[i][j] = j + 1;
                    continue;
                }

                if (j == 0) {
                    resultMatrix[i][j] = i + 1;
                    continue;
                }

                resultMatrix[i][j] = resultMatrix[i][0] * resultMatrix[0][j];
            }
        }

        return resultMatrix;
    }
}
