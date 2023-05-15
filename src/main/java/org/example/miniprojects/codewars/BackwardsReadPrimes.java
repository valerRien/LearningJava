package org.example.miniprojects.codewars;

import java.util.*;

public class BackwardsReadPrimes {
    public static String backwardsPrime(long start, long end) {
        TreeSet<Long> primes = new TreeSet<>();
        for (long i = start; i <= end; i++) {
            if (i > 12) {
                if (isPrime(i)) primes.add(i);
            }
        }
        StringBuilder resultBuilder = new StringBuilder();
        for (Long prime : primes) {
            resultBuilder.append(prime).append(" ");
        }

        return resultBuilder.toString().trim();
    }

    private static boolean isPrime(long number) {
        boolean firstCheck = true, secondCheck = true;

        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                firstCheck = false;
                break;
            }
        }
        int reversedNumber = 0;
        if (firstCheck) {
           reversedNumber = Integer.parseInt(new StringBuilder(String.valueOf(number)).reverse().toString());
            for (int i = 2; i < reversedNumber; i++) {
                if (reversedNumber % i == 0) {
                    secondCheck = false;
                    break;
                }
            }
        }

        return firstCheck && secondCheck && number != reversedNumber;
    }
}
