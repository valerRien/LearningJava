package org.example.miniprojects.leetcode;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class NumberOfCommonFactorsTest {

    @Test
    public void sampleTest() {
        assertEquals(1, NumberOfCommonFactors.commonFactors(1, 1));
        assertEquals(2, NumberOfCommonFactors.commonFactors(2, 4));
    }

}