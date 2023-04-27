package org.example.miniprojects.leetcode;

public class SubtractTheProductAndSum {
    public static int subtractProductAndSum(int n) {
        String stringValue = String.valueOf(n);

        int sum = 0, product = 1;

        for (int i = 0; i < stringValue.length(); i++) {
            sum += stringValue.charAt(i) - '0';
            product *= stringValue.charAt(i) - '0';
        }

        return product - sum;
    }
}
