package org.example.miniprojects.codewars;

public class Coins {
    public static int coins(int coin1, int coin2) {
        if (gcd(coin1, coin2) != 1)
            return -1;
        return coin1 * coin2 - coin1 - coin2;
    }

    public static int gcd(int coin1, int coin2) {
        while (coin1 != 0) {
            int t = coin1;
            coin1 = coin2 % coin1;
            coin2 = t;
        }
        return coin2;
    }
}
