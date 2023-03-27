package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ExcelSheetColumnNumbersTest {

    @Test
    public void sampleTest() {
        assertEquals(1, ExcelSheetColumnNumbers.titleToNumber("A"));
        assertEquals(27, ExcelSheetColumnNumbers.titleToNumber("AA"));
        assertEquals(52, ExcelSheetColumnNumbers.titleToNumber("AZ"));
        assertEquals(53, ExcelSheetColumnNumbers.titleToNumber("BA"));
        assertEquals(28779382963L, ExcelSheetColumnNumbers.titleToNumber("CODEWARS"));
    }

}