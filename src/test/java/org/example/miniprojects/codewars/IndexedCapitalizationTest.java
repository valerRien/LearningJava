package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class IndexedCapitalizationTest {

    @Test
    public void sampleTest() {
        assertEquals("aBCdeF", IndexedCapitalization.capitalize("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", IndexedCapitalization.capitalize("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", IndexedCapitalization.capitalize("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", IndexedCapitalization.capitalize("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", IndexedCapitalization.capitalize("codewarriors", new int[]{5}));
    }
}