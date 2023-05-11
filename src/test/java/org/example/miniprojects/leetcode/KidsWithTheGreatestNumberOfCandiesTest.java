package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class KidsWithTheGreatestNumberOfCandiesTest {

    @Test
    public void sampleTest() {
        assertEquals("[true, true, true, false, true]", KidsWithTheGreatestNumberOfCandies.kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3).toString());
    }

}