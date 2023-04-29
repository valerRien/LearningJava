package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class DecompressRunLengthEncodedListTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{2, 4, 4, 4}, DecompressRunLengthEncodedList.decompressRLElist(new int[]{1, 2, 3, 4}));
        assertArrayEquals(new int[]{1, 3, 3}, DecompressRunLengthEncodedList.decompressRLElist(new int[]{1, 1, 2, 3}));
    }
}