package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SortArrayByParityTest {

    @Test
    public void sampleTest() {
        assertEquals("[4, 5, 2, 7]", Arrays.toString(SortArrayByParity.sortArrayByParityII(new int[]{4, 2, 5, 7})));
    }
}