package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindNearestSquareNumberTest {

    @Test
    public void basicTests() {
        assertEquals(1, FindNearestSquareNumber.nearestSq(1));
        assertEquals(1, FindNearestSquareNumber.nearestSq(2));
        assertEquals(9, FindNearestSquareNumber.nearestSq(10));
        assertEquals(121, FindNearestSquareNumber.nearestSq(111));
        assertEquals(10000, FindNearestSquareNumber.nearestSq(9999));
    }
}