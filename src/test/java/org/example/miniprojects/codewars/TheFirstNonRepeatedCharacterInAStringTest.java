package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class TheFirstNonRepeatedCharacterInAStringTest {

    @Test
    public void test1() {
        final String input = "test";
        final Character output = TheFirstNonRepeatedCharacterInAString.firstNonRepeated(input);
        final Character expected = 'e';
        assertEquals(expected, output);
    }

    @Test
    public void test2() {
        final String input = "teeter";
        final Character output = TheFirstNonRepeatedCharacterInAString.firstNonRepeated(input);
        final Character expected = 'r';
        assertEquals(expected, output);
    }

    @Test
    public void test3() {
        final String input = "1122321235121222";
        final Character output = TheFirstNonRepeatedCharacterInAString.firstNonRepeated(input);
        final Character expected = '5';
        assertEquals(expected, output);
    }

    @Test
    public void testNotFound() {
        final String input = "1122";
        final Character output = TheFirstNonRepeatedCharacterInAString.firstNonRepeated(input);
        final Character expected = null;
        assertEquals(expected, output);
    }
}