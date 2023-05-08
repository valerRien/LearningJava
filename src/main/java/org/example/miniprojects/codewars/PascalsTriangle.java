package org.example.miniprojects.codewars;

import java.util.*;

public class PascalsTriangle {
    public static int[][] pascal(int depth) {
        if (depth <= 0) {return new int[][]{{}};}
        if (depth == 1) {return new int[][]{{1}};}
        if (depth == 2) {return new int[][]{{1}, {1, 1}};}

        List<int[]> resultList = new ArrayList<>();
        resultList.add(new int[]{1});
        resultList.add(new int[]{1,1});

        for (int i = 2; i < depth; i++) {
            int[] previousInts = resultList.get(i - 1);
            int[] newInts = new int[previousInts.length + 1];
            newInts[0] = 1; newInts[newInts.length - 1] = 1;

            for (int j = 1; j < newInts.length - 1; j++) {
                newInts[j] = previousInts[j - 1] + previousInts[j];
            }

            resultList.add(newInts);
        }

        int[][]result = new int[depth][];
        for (int i = 0; i < depth; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }
}
