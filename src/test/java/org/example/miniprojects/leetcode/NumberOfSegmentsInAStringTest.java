package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfSegmentsInAStringTest {

    @Test
    public void sampleTest() {
        assertEquals(5, NumberOfSegmentsInAString.countSegments("Hello, my name is John"));
    }

    @Test
    public void sampleTest2() {
        assertEquals(1, NumberOfSegmentsInAString.countSegments("Hello"));
    }

    @Test
    public void emptyTest() {
        assertEquals(0, NumberOfSegmentsInAString.countSegments(""));
    }

    @Test
    public void emptyTest2() {
        assertEquals(0, NumberOfSegmentsInAString.countSegments("                     "));
    }

    @Test
    public void notSimpleTest() {
        assertEquals(6, NumberOfSegmentsInAString.countSegments(", , , ,        a, eaefa"));
    }
}