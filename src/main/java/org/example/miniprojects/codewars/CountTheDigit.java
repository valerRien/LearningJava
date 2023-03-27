package org.example.miniprojects.codewars;

import java.util.ArrayList;
import java.util.List;

public class CountTheDigit {
    public static int nbDig(int n, int d) {
        List<String> squares = new ArrayList<>();

        for (int i = 0; i <= n; i++) {
            squares.add(String.valueOf((int)Math.pow(i, 2)));
        }

        int counterOfDigit = 0;
        for (String number : squares) {
            for (int i = 0; i < number.length(); i++) {
                if (String.valueOf(number.charAt(i)).equals(String.valueOf(d))) {
                    counterOfDigit++;
                }
            }
        }


        return counterOfDigit;
    }
}
