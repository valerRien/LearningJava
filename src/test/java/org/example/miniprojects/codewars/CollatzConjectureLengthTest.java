package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CollatzConjectureLengthTest {

    @Test
    public void sampleTest() {
        assertEquals(8, CollatzConjectureLength.conjecture(20L));
        assertEquals(111, CollatzConjectureLength.conjecture(500L));
        assertEquals(26, CollatzConjectureLength.conjecture(100L));
    }

}