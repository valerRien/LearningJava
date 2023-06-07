package org.example.miniprojects.codewars;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class SimpleRemoveDuplicatesTest {

    @Test
    public void sampleTest() {
        Assertions.assertArrayEquals(new int[]{3, 2, 1}, SimpleRemoveDuplicates.solve(new int[]{3, 3, 3, 2, 2, 2, 1}));
    }

    @Test
    public void emptyTest() {
        Assertions.assertArrayEquals(new int[]{}, SimpleRemoveDuplicates.solve(new int[]{}));
    }

    @Test
    public void randomPlaceOccurTest() {
        Assertions.assertArrayEquals(new int[]{3, 1, 2}, SimpleRemoveDuplicates.solve(new int[]{3, 2, 3, 2, 1, 2}));
    }

}