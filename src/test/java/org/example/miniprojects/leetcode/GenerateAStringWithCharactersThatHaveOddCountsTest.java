package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GenerateAStringWithCharactersThatHaveOddCountsTest {

    @Test
    public void generateTheString() {
        assertEquals(5, GenerateAStringWithCharactersThatHaveOddCounts.generateTheString(5).length());
    }
}