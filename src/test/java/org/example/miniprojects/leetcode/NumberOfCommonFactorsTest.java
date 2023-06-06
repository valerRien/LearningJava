package org.example.miniprojects.leetcode;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertEquals;

public class NumberOfCommonFactorsTest {

    @Test
    public void sampleTest() {
        assertEquals(1, NumberOfCommonFactors.commonFactors(1, 1));
        assertEquals(2, NumberOfCommonFactors.commonFactors(2, 4));
    }

    @Test
    public void zeroesTest() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
           NumberOfCommonFactors.commonFactors(0, 0);
        });
    }

}