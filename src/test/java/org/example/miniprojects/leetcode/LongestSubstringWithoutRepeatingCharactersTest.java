package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongestSubstringWithoutRepeatingCharactersTest {

    @Test
    public void sampleTest() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("abcabcbb"));
    }

    @Test
    public void sampleTest2() {
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("bbbbb"));
    }

    @Test
    public void sampleTest3() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring("pwwkew"));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring(""));
    }

    @Test
    public void spaceTest() {
        assertEquals(1, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( " "));
    }

    @Test
    public void repeatedNotOnEdgeTest() {
        assertEquals(3, LongestSubstringWithoutRepeatingCharacters.lengthOfLongestSubstring( "dvdf"));
    }
}