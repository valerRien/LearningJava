package org.example.miniprojects.codewars;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class AlternateCaseTest {

    @Test
    void alternateCase() {
        Assertions.assertEquals("hELLO wORLD",  AlternateCase.alternateCase("Hello World"));
    }

    @Test
    public void emptyTest() {
        Assertions.assertEquals("", AlternateCase.alternateCase(""));
    }

    @Test
    public void marksTest() {
        Assertions.assertEquals("Yeap!", AlternateCase.alternateCase("yEAP!"));
    }
}