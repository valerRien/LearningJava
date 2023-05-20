package org.example.miniprojects.leetcode;

public class FindTheKBeautyOfANumber {
    public static int divisorSubstrings(int num, int k) {
        int result = 0;
        String numValue = String.valueOf(num);
        for (int i = 0; i < numValue.length() - k + 1; i++) {
            int div = Integer.parseInt(numValue.substring(i, i + k));
            if (div != 0){
                if (num % div == 0) result++;
            }
        }
        return result;
    }
}
