package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveConsecutiveDuplicateWordsTest {

    @Test
    public void sampleTest() {
        assertEquals("word", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("word word"));
    }

    @Test
    public void sampleTest2() {
        assertEquals("a ab", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("a a ab"));
    }

    @Test
    public void sampleTest3() {
        assertEquals("alpha beta gamma delta alpha beta gamma delta", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("alpha beta beta gamma gamma gamma delta alpha beta beta gamma gamma gamma delta"));
    }

    @Test
    public void emptyTest() {
        assertEquals("", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates(""));
    }

    @Test
    public void sampleTest4() {
        assertEquals("cyqje a", RemoveConsecutiveDuplicateWords.removeConsecutiveDuplicates("cyqje cyqje cyqje a a a"));
    }
}