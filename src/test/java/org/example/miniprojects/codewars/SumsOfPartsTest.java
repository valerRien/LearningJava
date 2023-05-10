package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SumsOfPartsTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{21, 20, 18, 15, 11, 6, 0}, SumsOfParts.sumParts(new int[]{1, 2, 3, 4, 5, 6}));
        assertArrayEquals(new int[]{20, 20, 19, 16, 10, 0}, SumsOfParts.sumParts(new int[]{0, 1, 3, 6, 10}));
    }

}