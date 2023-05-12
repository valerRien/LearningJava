package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class LengthAndTwoValuesTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new String[]{"blue", "red", "blue", "red", "blue", "red", "blue"}, LengthAndTwoValues.alternate(7, "blue", "red"));
    }

}