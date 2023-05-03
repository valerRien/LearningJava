package org.example.miniprojects.codewars;

import org.example.miniprojects.codewars.YourOrderPlease;
import org.junit.Test;

import static org.junit.Assert.*;

public class YourOrderPleaseTest {

    @Test
    public void sampleTest() {
        assertEquals("Thi1s is2 3a T4est", YourOrderPlease.order("is2 Thi1s T4est 3a"));
        assertEquals("Fo1r the2 g3ood 4of th5e pe6ople", YourOrderPlease.order("4of Fo1r pe6ople g3ood th5e the2"));
        assertEquals("", YourOrderPlease.order(""));
    }
}