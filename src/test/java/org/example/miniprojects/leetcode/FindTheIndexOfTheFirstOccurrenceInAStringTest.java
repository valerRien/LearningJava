package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 1 <= haystack.length, needle.length <= 104
 * haystack and needle consist of only lowercase English characters.
 */

public class FindTheIndexOfTheFirstOccurrenceInAStringTest {

    private static FindTheIndexOfTheFirstOccurrenceInAString instance = new FindTheIndexOfTheFirstOccurrenceInAString();

    @Test
    public void sampleTest() {
        assertEquals(0, instance.strStr("sadtest", "sad"));
    }

    @Test
    public void sampleTest2() {
        assertEquals(1, instance.strStr("asadtest", "sad"));
    }

    @Test
    public void spaces() {
        assertEquals(0, instance.strStr(" ", " "));
    }

    @Test
    public void repeated() {
        assertEquals(4, instance.strStr("mississippi", "issip"));
    }
}