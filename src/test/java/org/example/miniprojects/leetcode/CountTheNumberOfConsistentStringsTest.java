package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountTheNumberOfConsistentStringsTest {

    @Test
    public void sampleTest() {
        assertEquals(2, CountTheNumberOfConsistentStrings.countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"}));
    }

}