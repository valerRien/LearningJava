package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * The input array will always be valid! (odd-length >= 3)
 */

public class FindTheStrayNumberTest {

    @Test
    public void sampleTest() {
        assertEquals(2, FindTheStrayNumber.stray(new int[]{1, 1, 2}));
        assertEquals(3, FindTheStrayNumber.stray(new int[]{17, 17, 17, 3, 17, 17}));
    }
}