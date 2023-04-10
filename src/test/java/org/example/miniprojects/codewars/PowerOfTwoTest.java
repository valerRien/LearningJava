package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class PowerOfTwoTest {

    @Test
    public void sampleTest() {
        assertTrue(PowerOfTwo.isPowerOfTwo(1024));
    }

    @Test
    public void falseTest() {
        assertFalse(PowerOfTwo.isPowerOfTwo(9));
    }
}