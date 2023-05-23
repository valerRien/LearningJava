package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MergeStringsAlternatelyTest {

    @Test
    public void sampleTest() {
        assertEquals("apbqcr", MergeStringsAlternately.mergeAlternately("abc", "pqr"));
    }

    @Test
    public void nullTest() {
        assertEquals("abc", MergeStringsAlternately.mergeAlternately("abc", null));
    }

    @Test
    public void diffLengthTest() {
        assertEquals("apbqrs", MergeStringsAlternately.mergeAlternately("ab", "pqrs"));
    }

}