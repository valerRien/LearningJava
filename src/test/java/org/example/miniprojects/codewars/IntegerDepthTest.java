package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerDepthTest {

    @Test
    public void sampleTest() {
        assertEquals(9, IntegerDepth.computeDepth(42));
        assertEquals(10, IntegerDepth.computeDepth(1));
    }
}