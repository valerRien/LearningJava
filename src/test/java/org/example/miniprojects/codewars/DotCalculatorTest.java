package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class DotCalculatorTest {

    @Test
    public void sampleTest() {
        assertEquals(".....", DotCalculator.calc("..... // ."));
        assertEquals("..........", DotCalculator.calc("..... * .."));
        assertEquals("..", DotCalculator.calc("..... // .."));
        assertEquals("....", DotCalculator.calc("..... - ."));
        assertEquals("....................", DotCalculator.calc("..... + ..............."));
        assertEquals("...............", DotCalculator.calc("..... * ..."));
        assertEquals("..", DotCalculator.calc("..... - ..."));
    }
    
    @Test
    public void emptyOutputTest() {
        assertEquals("", DotCalculator.calc(". - ."));
        assertEquals("", DotCalculator.calc(". // .."));
    }

    @Test
    public void emptyInputTest() {
        assertEquals("", DotCalculator.calc(""));
    }
}