package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class StringMatchingInAnArrayTest {

    @Test
    public void sampleTest() {
        assertEquals(Arrays.toString(new String[]{"as", "hero"}), StringMatchingInAnArray.stringMatching(new String[]{"mass", "as", "hero", "superhero"}).toString());
        assertEquals(Arrays.toString(new String[]{}), StringMatchingInAnArray.stringMatching(new String[]{"blue","green","bu"}).toString());
    }

}