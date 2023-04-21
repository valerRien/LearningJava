package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FormatWordsIntoASentenceTest {

    @Test
    public void sampleTest() {
        assertEquals("one", FormatWordsIntoASentence.formatWords(new String[]{"one"}));
        assertEquals("one and two", FormatWordsIntoASentence.formatWords(new String[]{"one", "two"}));
        assertEquals("one and two", FormatWordsIntoASentence.formatWords(new String[]{"one", "two", ""}));
        assertEquals("one, two, three and four", FormatWordsIntoASentence.formatWords(new String[]{"one", "two", "three", "four"}));
    }

    @Test
    public void npe() {
        assertEquals("", FormatWordsIntoASentence.formatWords(null));
    }

}