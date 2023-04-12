package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * [input] integer array a
 * Constraints: 1 ≤ a.length ≤ 4 and 0 ≤ a[i] < 256
 * [output] an unsigned integer
 */

public class ArrayPackingTest {

    @Test
    public void sampleTest() {
        assertEquals(21784, ArrayPacking.arrayPacking(new int[]{24, 85, 0}));
        assertEquals(2567447, ArrayPacking.arrayPacking(new int[]{23, 45, 39}));
        assertEquals(257, ArrayPacking.arrayPacking(new int[]{1, 1}));
        assertEquals(0, ArrayPacking.arrayPacking(new int[]{0}));
    }

    @Test
    public void bigNumberTest() {
        assertEquals(4294967295L, ArrayPacking.arrayPacking(new int[]{255, 255, 255, 255}));
    }

}