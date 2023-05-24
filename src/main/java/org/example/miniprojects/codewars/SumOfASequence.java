package org.example.miniprojects.codewars;

public class SumOfASequence {
    public static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
        }

        return sum;
    }
}
