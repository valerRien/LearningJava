package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {

    @Test
    public void sampleTest() {
        assertEquals("[1, 2, 2, 3, 5, 6]", Arrays.toString(MergeSortedArray.merge(new int[]{1,2,3,0,0,0}, 3, new int[]{2,5,6}, 3)));
    }

    @Test
    public void emptyNumsTwo(){
        assertEquals("[1]", Arrays.toString(MergeSortedArray.merge(new int[]{1}, 1, new int[]{}, 0)));
    }

    @Test
    public void emptyNumsOne(){
        assertEquals("[1]", Arrays.toString(MergeSortedArray.merge(new int[]{0}, 0, new int[]{1}, 1)));
    }

}