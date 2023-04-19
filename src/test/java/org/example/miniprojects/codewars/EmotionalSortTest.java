package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class EmotionalSortTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new String[]{":D", ":D", ":(","T_T"}, EmotionalSort.sortEmotions(true, new String[]{"T_T", ":D", ":(",":D"}));
        assertArrayEquals(new String[]{"T_T", ":(", ":D", ":D"}, EmotionalSort.sortEmotions(false, new String[]{":D", "T_T", ":D", ":("}));
    }
}