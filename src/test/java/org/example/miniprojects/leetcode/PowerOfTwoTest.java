package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void sampleTest() {
        assertTrue(PowerOfTwo.isPowerOfTwo(16));
        assertTrue(PowerOfTwo.isPowerOfTwo(1024));
        assertFalse(PowerOfTwo.isPowerOfTwo(1000));
        assertFalse(PowerOfTwo.isPowerOfTwo(9));
    }
}