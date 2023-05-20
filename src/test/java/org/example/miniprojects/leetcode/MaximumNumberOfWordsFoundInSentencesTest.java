package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumNumberOfWordsFoundInSentencesTest {

    @Test
    public void sampletest() {
        assertEquals(6, MaximumNumberOfWordsFoundInSentences.mostWordsFound(new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"}));
    }

}