package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MostCommonWordTest {

    @Test
    public void sampleTest() {
        assertEquals("b", MostCommonWord.mostCommonWord("a, a, a, a, b,b,b,c, c", new String[]{"a"}));
    }
}