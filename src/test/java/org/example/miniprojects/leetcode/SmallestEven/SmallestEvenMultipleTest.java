package org.example.miniprojects.leetcode.SmallestEven;

import org.example.miniprojects.leetcode.SmallestEvenMultiple;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SmallestEvenMultipleTest {

    @Test
    void sampleTest() {
        Assertions.assertEquals(10, SmallestEvenMultiple.smallestEvenMultiple(5));
    }

    @Test
    void smallestEvenMultiple() {
        Assertions.assertEquals(6, SmallestEvenMultiple.smallestEvenMultiple(6));
    }

    @Test
    void zeroTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> SmallestEvenMultiple.smallestEvenMultiple(0));
    }
}