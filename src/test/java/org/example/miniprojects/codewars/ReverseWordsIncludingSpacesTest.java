package org.example.miniprojects.codewars;


import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseWordsIncludingSpacesTest {

    @Test
    public void sampleTest() {
        assertEquals("мама мыла раму", ReverseWordsIncludingSpaces.reverseWords("амам алым умар"));
    }

    @Test
    public void allSpaces() {
        assertEquals("   ", ReverseWordsIncludingSpaces.reverseWords("   "));
    }

    @Test
    public void singleLetter(){
        assertEquals("a", ReverseWordsIncludingSpaces.reverseWords("a"));
    }
}