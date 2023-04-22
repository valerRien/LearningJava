package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class LongPressedNameTest {

    @Test
    public void sampleTest() {
        assertTrue(LongPressedName.isLongPressedName("alex", "aaleex"));
        assertFalse(LongPressedName.isLongPressedName("alex", "aaleexex"));
        assertTrue(LongPressedName.isLongPressedName("vtkgn", "vttkgnn"));
        assertFalse(LongPressedName.isLongPressedName("saeed", "ssaaed"));
    }

    @Test
    public void noSameCharsAtAll() {
        assertFalse(LongPressedName.isLongPressedName("alex", "sy"));
        assertFalse(LongPressedName.isLongPressedName("a", "b"));
    }
}