package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestPalindromicSubstringTest {

    @Test
    public void sampleTest() {
        assertEquals("bb", LongestPalindromicSubstring.longestPalindrome("cbbd"));
    }

    @Test
    public void sampleTest2() {
        assertEquals("aacaa", LongestPalindromicSubstring.longestPalindrome("aacaabdkacaa"));
    }

    @Test
    public void oneLetter() {
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("a"));
    }

    @Test
    public void twoLetters() {
        assertEquals("a", LongestPalindromicSubstring.longestPalindrome("ac"));
    }
}