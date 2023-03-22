package org.example.miniprojects.codewars;

public class FindNearestSquareNumber {
    public static int nearestSq(final int n){
        int sqrtFromN =(int) Math.sqrt(n);
        if (sqrtFromN * sqrtFromN == n) {
            return n;
        } else {
            int lowerSq = sqrtFromN * sqrtFromN;
            int higherSq = (sqrtFromN + 1) * (sqrtFromN + 1);
            return n - lowerSq < Math.abs(n - higherSq) ? lowerSq : higherSq;
        }
    }
}
