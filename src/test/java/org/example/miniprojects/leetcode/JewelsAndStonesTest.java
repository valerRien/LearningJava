package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1 <= jewels.length, stones.length <= 50
 * jewels and stones consist of only English letters.
 * All the characters of jewels are unique.
 */

public class JewelsAndStonesTest {

    private JewelsAndStones instance = new JewelsAndStones();
    @Test
    public void sampleTest() {
        assertEquals(3, instance.numJewelsInStones("aA", "aAAbbbBBbb"));
        assertEquals(0, instance.numJewelsInStones("z", "ZZZZ"));
    }
}