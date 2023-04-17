package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheUniqueNumberTest {

    private double precision = 0.0000000000001;

    @Test
    public void sampleTest() {
        assertEquals(1.0, FindTheUniqueNumber.findUniq(new double[]{0, 1, 0}), precision);
        assertEquals(0.0001, FindTheUniqueNumber.findUniq(new double[]{0, 0.0001, 0}), precision);
    }
}