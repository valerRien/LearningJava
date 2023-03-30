package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;


/**
 * Constraints:
 *
 * 1 <= s.length <= 104
 * s consists of only English letters and spaces ' '.
 * There will be at least one word in s.
 */
public class LengthOfLastWordTest {

    private static LengthOfLastWord instance = new LengthOfLastWord();

    @Test
    public void sampleTest() {
        assertEquals(5, instance.lengthOfLastWord("Hello World"));
    }

    @Test
    public void oneSpacePlusWord() {
        assertEquals(4, instance.lengthOfLastWord(" word"));
    }

    @Test
    public void spaceAtTheInd() {
        assertEquals(5, instance.lengthOfLastWord("hello "));
    }
}