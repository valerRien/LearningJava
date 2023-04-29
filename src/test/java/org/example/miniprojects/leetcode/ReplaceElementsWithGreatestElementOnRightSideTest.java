package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReplaceElementsWithGreatestElementOnRightSideTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, ReplaceElementsWithGreatestElementOnRightSide.replaceElements(new int[]{17, 18, 5, 4, 6, 1}));
    }
}