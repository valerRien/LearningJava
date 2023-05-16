package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ShuffleStringTest {

    @Test
    public void sampleTest() {
        assertEquals("leetcode", ShuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 1, 2, 3}));
        assertEquals("arigatou", ShuffleString.restoreString("aaiougrt", new int[]{4, 0, 2, 6, 7, 3, 1, 5}));
    }

}