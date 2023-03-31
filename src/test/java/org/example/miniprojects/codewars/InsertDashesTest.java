package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Note that the number will always be non-negative (>= 0).
 */

public class InsertDashesTest {

    @Test
    public void sampleTest() {
        assertEquals("45-7", InsertDashes.insertDash(457));
    }

    @Test
    public void sampleTest2() {
        assertEquals("4568", InsertDashes.insertDash(4568));
    }

    @Test
    public void sampleTest3() {
        assertEquals("45", InsertDashes.insertDash(45));
    }

    @Test
    public void sampleTest4() {
        assertEquals("5-5", InsertDashes.insertDash(55));
    }

    @Test
    public void sampleTest5() {
        assertEquals("5", InsertDashes.insertDash(5));
    }
}