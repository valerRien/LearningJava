package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNumbersWithEvenNumberOfDigitsTest {

    @Test
    public void sampleTest() {
        assertEquals(2, FindNumbersWithEvenNumberOfDigits.findNumbers(new int[]{12, 345, 2, 6, 7896}));
        assertEquals(1, FindNumbersWithEvenNumberOfDigits.findNumbers(new int[]{555, 901, 482, 1771}));
    }
}