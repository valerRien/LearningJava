package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GreetMeTest {

    @Test
    public void sampleTest() {
        assertEquals("Hello Riley!", GreetMe.greet("riley"));
        assertEquals("Hello Jake!", GreetMe.greet("JAKE"));
    }
}