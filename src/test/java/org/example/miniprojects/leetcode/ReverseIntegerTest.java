package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {

    @Test
    public void sampleTest() {
        assertEquals(321, ReverseInteger.reverse(123));
        assertEquals(-321, ReverseInteger.reverse(-123));
    }
}