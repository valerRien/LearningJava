package org.example.miniprojects.codewars;

public class PlayingWithDigits {
    public static long digPow(int n, int p) {
        String stringValueOfN = String.valueOf(n);

        long product = 0;
        for (int i = 0; i < stringValueOfN.length(); i++) {
            product += Math.pow((stringValueOfN.charAt(i) - '0'),p);
            p++;
        }

        return product % n == 0? product / n : -1 ;
    }
}
