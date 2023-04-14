package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheIndexOfTheSecondOccurrenceOfALetterInAStringTest {

    @Test
    public void sampleTest() {
        assertEquals(3, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello World!", 'l'));
        assertEquals(7, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("Hello World!", 'o'));
    }

    @Test
    public void emptyTest() {
        assertEquals(-1, FindTheIndexOfTheSecondOccurrenceOfALetterInAString.secondSymbol("", 'q'));
    }
}