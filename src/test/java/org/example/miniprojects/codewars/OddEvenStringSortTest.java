package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class OddEvenStringSortTest {

    @Test
    public void sampleTest() {
        assertEquals("CdWr oeas", OddEvenStringSort.sortMyString("CodeWars"));
    }

    @Test
    public void sampleTest2() {
        assertEquals("Wleclgltihuebredrf ofsheesenasnegrof", OddEvenStringSort.sortMyString("Wolfeschlegelsteinhausenbergerdorff"));
    }
}