package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecryptStringFromAlphabetToIntegerMappingTest {

    @Test
    public void sampleTest() {
        assertEquals("jkab", DecryptStringFromAlphabetToIntegerMapping.freqAlphabets("10#11#12"));
        assertEquals("acz", DecryptStringFromAlphabetToIntegerMapping.freqAlphabets("1326#"));
    }
}