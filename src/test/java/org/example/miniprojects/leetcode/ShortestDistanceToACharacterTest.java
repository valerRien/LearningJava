package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShortestDistanceToACharacterTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{3, 2, 1, 0}, ShortestDistanceToACharacter.shortestToChar("aaab", 'b'));
        assertArrayEquals(new int[]{3,2,1,0,1,0,0,1,2,2,1,0}, ShortestDistanceToACharacter.shortestToChar("loveleetcode", 'e'));
    }

    @Test
    public void emptyTest() {
        assertArrayEquals(new int[]{}, ShortestDistanceToACharacter.shortestToChar("aaaaaz", 'b'));
    }
}