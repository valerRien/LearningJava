package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class HighestNumberWithTwoPrimeFactorsTest {

    @Test
    public void test1() {
        System.out.println("Basic Tests");
        assertEquals(Arrays.toString(new long[] {48, 4, 1}),Arrays.toString(HighestNumberWithTwoPrimeFactors.highestBiPrimeFac(2, 3, 50)));
        assertEquals(Arrays.toString(new long[] {605, 1, 2}), Arrays.toString(HighestNumberWithTwoPrimeFactors.highestBiPrimeFac(5, 11, 1000)));
        assertEquals(Arrays.toString(new long[] {4563, 3, 2}), Arrays.toString(HighestNumberWithTwoPrimeFactors.highestBiPrimeFac(3, 13, 5000)));
        assertEquals(Arrays.toString(new long[] {4375, 4, 1}), Arrays.toString(HighestNumberWithTwoPrimeFactors.highestBiPrimeFac(5, 7, 5000)));
    }

    @Test
    public void failedTest(){
        assertEquals(Arrays.toString(new long[]{45125, 3, 2}), Arrays.toString(HighestNumberWithTwoPrimeFactors.highestBiPrimeFac(5,19,50000)));
    }
}