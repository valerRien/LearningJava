package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheTownJudgeTest {

    @Test
    public void sampleTest() {
        assertEquals(2, FindTheTownJudge.findJudge(2, new int[][]{{1, 2}}));
        assertEquals(3, FindTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}}));
        assertEquals(-1, FindTheTownJudge.findJudge(3, new int[][]{{1, 3}, {2, 3}, {3, 1}}));
    }


}