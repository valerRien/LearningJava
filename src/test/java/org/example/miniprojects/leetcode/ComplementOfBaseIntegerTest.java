package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ComplementOfBaseIntegerTest {

    @Test
    public void sampleTest() {
        assertEquals(2, ComplementOfBaseInteger.bitwiseComplement(5));
        assertEquals(0, ComplementOfBaseInteger.bitwiseComplement(7));
        assertEquals(5, ComplementOfBaseInteger.bitwiseComplement(10));
    }
}