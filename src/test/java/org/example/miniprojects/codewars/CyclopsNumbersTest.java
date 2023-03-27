package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CyclopsNumbersTest {

    @Test
    public void test() {
        assertFalse(CyclopsNumbers.cyclops(523772));
        assertFalse(CyclopsNumbers.cyclops(1));
        assertTrue(CyclopsNumbers.cyclops(5));
        assertFalse(CyclopsNumbers.cyclops(3));
        assertFalse(CyclopsNumbers.cyclops(13));
        assertTrue(CyclopsNumbers.cyclops(27));
        assertTrue(CyclopsNumbers.cyclops(2015));
        assertFalse(CyclopsNumbers.cyclops(666));
        assertFalse(CyclopsNumbers.cyclops(42));
    }
}