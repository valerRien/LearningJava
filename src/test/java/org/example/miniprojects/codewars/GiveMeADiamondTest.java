package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class GiveMeADiamondTest {

    @Test
    public void sampleTest() {
        StringBuilder expected = new StringBuilder();
        expected.append(" *\n");
        expected.append("***\n");
        expected.append(" *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(3));
    }

    @Test
    public void sampleTest2() {
        StringBuilder expected = new StringBuilder();
        expected.append("  *\n");
        expected.append(" ***\n");
        expected.append("*****\n");
        expected.append(" ***\n");
        expected.append("  *\n");

        assertEquals(expected.toString(), GiveMeADiamond.print(5));
    }

}