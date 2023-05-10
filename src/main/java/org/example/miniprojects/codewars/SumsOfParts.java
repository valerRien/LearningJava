package org.example.miniprojects.codewars;

public class SumsOfParts {
    public static int[] sumParts(int[] ls) {
        int[] result = new int[ls.length + 1];
        result[result.length - 1] = 0;
        int sum = 0;
        for (int i = result.length - 2; i >= 0 ; i--) {
            sum += ls[i];
            result[i] = sum;
        }

        return result;
    }
}
