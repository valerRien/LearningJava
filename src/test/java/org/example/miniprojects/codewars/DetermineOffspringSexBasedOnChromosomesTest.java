package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DetermineOffspringSexBasedOnChromosomesTest {

    @Test
    public void tests() {
        assertEquals("Congratulations! You're going to have a son.", DetermineOffspringSexBasedOnChromosomes.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", DetermineOffspringSexBasedOnChromosomes.chromosomeCheck("XX"));
    }
}