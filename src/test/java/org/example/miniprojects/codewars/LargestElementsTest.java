package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LargestElementsTest {

    @Test
    public void sampleTest() {
        assertEquals(Arrays.toString(new int[]{4, 5}), Arrays.toString(LargestElements.largest(2, new int[]{3, 5, 4, 2, 1})));
        assertEquals(Arrays.toString(new int[]{5}), Arrays.toString(LargestElements.largest(1, new int[]{3, 5, 4, 2, 1})));
    }

    @Test
    public void nEqualsZero() {
        assertEquals(Arrays.toString(new int[]{}), Arrays.toString(LargestElements.largest(0, new int[]{3, 5, 4, 2, 1})));
    }

    @Test
    public void nEqualsArrLength() {
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4, 5}), Arrays.toString(LargestElements.largest(5, new int[]{3, 5, 4, 2, 1})));
    }

    @Test
    public void withDuplicates() {
        assertEquals(Arrays.toString(new int[]{1, 2, 2}), Arrays.toString(LargestElements.largest(3, new int[]{1, 1, 2, 2})));
    }
}