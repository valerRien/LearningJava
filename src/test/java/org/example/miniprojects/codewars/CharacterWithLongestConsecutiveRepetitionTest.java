package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CharacterWithLongestConsecutiveRepetitionTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new Object[]{"a", 3}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aaab"));
        assertArrayEquals(new Object[]{"a", 1}, CharacterWithLongestConsecutiveRepetition.longestRepetition("a"));
        assertArrayEquals(new Object[]{"a", 4}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aaaa"));
        assertArrayEquals(new Object[]{"a", 4}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aaaaba"));
        assertArrayEquals(new Object[]{"a", 3}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aabaaa"));
        assertArrayEquals(new Object[]{"a", 3}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aaabbbaa"));
        assertArrayEquals(new Object[]{"a", 3}, CharacterWithLongestConsecutiveRepetition.longestRepetition("zaaabbbaa"));
        assertArrayEquals(new Object[]{"a", 4}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aaabbbaauaaaa"));
        assertArrayEquals(new Object[]{"z", 4}, CharacterWithLongestConsecutiveRepetition.longestRepetition("aaabbbaauzzzz"));
        assertArrayEquals(new Object[]{"", 0}, CharacterWithLongestConsecutiveRepetition.longestRepetition(""));
    }

}