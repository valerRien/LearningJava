package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BitManipulationTest {

    @Test
    public void sampleTest() {
        assertEquals(255, BitManipulation.eliminateUnsetBits("11010101010101"));
    }

    @Test
    public void zeroTest() {
        assertEquals(0, BitManipulation.eliminateUnsetBits("000"));
    }

    @Test
    public void onesOnlyTest() {
        assertEquals(7, BitManipulation.eliminateUnsetBits("111"));
    }

}