package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheKBeautyOfANumberTest {

    @Test
    public void sampleTest() {
        assertEquals(2, FindTheKBeautyOfANumber.divisorSubstrings(240, 2));
        assertEquals(2, FindTheKBeautyOfANumber.divisorSubstrings(430043, 2));
    }

}