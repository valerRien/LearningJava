package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArmstrongNumberTest {

    @Test
    public void sampleTest() {
        assertTrue(ArmstrongNumber.isNarcissistic(153));
        assertFalse(ArmstrongNumber.isNarcissistic(1652));
    }

}