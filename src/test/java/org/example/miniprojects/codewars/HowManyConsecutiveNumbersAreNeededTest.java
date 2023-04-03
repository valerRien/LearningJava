package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class HowManyConsecutiveNumbersAreNeededTest {

    @Test
    public void sampleTest() {
        assertEquals(2, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{4, 8, 6}));
        assertEquals(0, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{1, 2, 3, 4}));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{}));
    }

    @Test
    public void oneElementTest() {
        assertEquals(0, HowManyConsecutiveNumbersAreNeeded.consecutive(new int[]{1}));
    }

}