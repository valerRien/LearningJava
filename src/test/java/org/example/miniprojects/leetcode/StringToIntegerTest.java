package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class StringToIntegerTest {

    @Test
    public void sampleTest() {
        assertEquals(42, StringToInteger.myAtoi("42"));
    }

    @Test
    public void sampleTest2() {
        assertEquals(-42, StringToInteger.myAtoi("     -42"));
    }

    @Test
    public void sampleTestWithWords() {
        assertEquals(-42, StringToInteger.myAtoi(" -42 words"));
    }

    @Test
    public void sampleTestWithWords2() {
        assertEquals(0, StringToInteger.myAtoi("words  -42"));
    }

    @Test
    public void overLimitIntNegative() {
        assertEquals(-2147483648, StringToInteger.myAtoi("-91283472332"));
    }

    @Test
    public void overLimitIntPositive() {
        assertEquals(2147483647, StringToInteger.myAtoi("91283472332"));
    }

    @Test
    public void doubleNumber() {
        assertEquals(3, StringToInteger.myAtoi("3.14154"));
    }

    @Test
    public void emptyString() {
        assertEquals(0, StringToInteger.myAtoi(""));
    }

    @Test
    public void sampleTest3() {
        assertEquals(42, StringToInteger.myAtoi("42"));
    }

    @Test
    public void minus() {
        assertEquals(0, StringToInteger.myAtoi("-"));
    }

    @Test
    public void plus() {
        assertEquals(1, StringToInteger.myAtoi("+1"));
    }

    @Test
    public void nubmerAndLetter() {
        assertEquals(1, StringToInteger.myAtoi("1a"));
    }

    @Test
    public void minusAfterNumber() {
        assertEquals(123, StringToInteger.myAtoi("123-"));
    }
}