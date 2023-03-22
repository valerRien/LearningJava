package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SimpleMultiplicationTest {

    @Test
    public void test1() {
        System.out.println("Checking for Odd numbers.");
        assertEquals(9, SimpleMultiplication.simpleMultiplication(1));
        assertEquals(27, SimpleMultiplication.simpleMultiplication(3));
        assertEquals(189, SimpleMultiplication.simpleMultiplication(21));
        assertEquals(207, SimpleMultiplication.simpleMultiplication(23));
    }

    @Test
    public void test2() {
        System.out.println("Checking for Even numbers.");
        assertEquals(16, SimpleMultiplication.simpleMultiplication(2));
        assertEquals(32, SimpleMultiplication.simpleMultiplication(4));
        assertEquals(176, SimpleMultiplication.simpleMultiplication(22));
        assertEquals(208, SimpleMultiplication.simpleMultiplication(26));
    }
}