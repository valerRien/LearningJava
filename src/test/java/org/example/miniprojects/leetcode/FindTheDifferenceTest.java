package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheDifferenceTest {

    @Test
    public void sampleTest() {
        assertEquals('e', FindTheDifference.findTheDifference("abcd", "abcde"));
    }

    @Test
    public void emptyTest() {
        assertEquals('y', FindTheDifference.findTheDifference("", "y"));
    }

    @Test
    public void emptyTest2() {
        assertEquals('a', FindTheDifference.findTheDifference("a", "aa"));
    }
}