package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class AreTheyTheSameTest {

    @Test
    public void sampleTest() {
        assertTrue(AreTheyTheSame.comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361}));
        assertFalse(AreTheyTheSame.comp(new int[]{121, 144, 19, 161, 19, 144, 19, 11}, new int[]{132, 14641, 20736, 361, 25921, 361, 20736, 361}));
    }

    @Test
    public void sampleTestMinus() {
        assertTrue(AreTheyTheSame.comp(new int[]{-11, 11, 11}, new int[]{121, 121, 121}));
        assertTrue(AreTheyTheSame.comp(new int[]{-11, 11, -11}, new int[]{121, 121, 121}));
    }

}