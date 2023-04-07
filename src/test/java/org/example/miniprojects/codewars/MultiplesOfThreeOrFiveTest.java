package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOfThreeOrFiveTest {

    @Test
    public void sampleTest() {
        assertEquals(23, MultiplesOfThreeOrFive.solution(10));
    }

    @Test
    public void sampleTest2() {
        assertEquals(78, MultiplesOfThreeOrFive.solution(20));
    }
}