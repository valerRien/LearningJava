package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CountConsonantsTest {

    @Test
    public void sampleTest() {
        assertEquals(2, CountConsonants.getCount("bwae"));
    }

    @Test
    public void sampleTest2() {
        assertEquals(0, CountConsonants.getCount("0123456789"));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, CountConsonants.getCount(""));
    }

    @Test
    public void sampleTest3() {
        assertEquals(7, CountConsonants.getCount("h^$&^#$&^elLo world"));
    }
}