package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void sampleTest() {
        assertEquals("fl", LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));
    }

    @Test
    public void sampleTest2() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"dog","racecar","car"}));
    }

    @Test
    public void sampleTest3() {
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"a","ac"}));
    }

    @Test
    public void emptyString() {
        assertEquals("", LongestCommonPrefix.longestCommonPrefix(new String[]{"", ""}));
    }

    @Test
    public void oneChar() {
        assertEquals("a", LongestCommonPrefix.longestCommonPrefix(new String[]{"a", "a"}));
    }

    @Test
    public void spacesTest() {
        assertEquals(" ", LongestCommonPrefix.longestCommonPrefix(new String[]{"  ", " a"}));
    }
}