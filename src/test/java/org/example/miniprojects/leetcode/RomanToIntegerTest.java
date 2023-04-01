package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RomanToIntegerTest {

    @Test
    public void sampleTest() {
        assertEquals(5, RomanToInteger.romanToInt("V"));
        assertEquals(10, RomanToInteger.romanToInt("X"));
        assertEquals(1000, RomanToInteger.romanToInt("M"));
    }

    @Test
    public void minusTest() {
        assertEquals(4, RomanToInteger.romanToInt("IV"));
        assertEquals(9, RomanToInteger.romanToInt("IX"));
        assertEquals(999, RomanToInteger.romanToInt("IM"));
    }

    @Test
    public void minusAtMiddleTest() {
        assertEquals(14, RomanToInteger.romanToInt("XIV"));
        assertEquals(19, RomanToInteger.romanToInt("XIX"));
        assertEquals(1999, RomanToInteger.romanToInt("MIM"));
    }
}