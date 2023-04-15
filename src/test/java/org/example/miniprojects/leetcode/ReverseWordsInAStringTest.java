package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsInAStringTest {

    @Test
    public void sampleTest() {
        assertEquals("s'teL ekat edoCteeL tsetnoc", ReverseWordsInAString.reverseWords("Let's take LeetCode contest"));
    }

    @Test
    public void sampleTest2() {
        assertEquals("doG gniD", ReverseWordsInAString.reverseWords("God Ding"));
    }
}