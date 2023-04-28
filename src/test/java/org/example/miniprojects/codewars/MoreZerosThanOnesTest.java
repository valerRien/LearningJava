package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoreZerosThanOnesTest {

    @Test
    public void sampleTest() {
        assertArrayEquals(new char[] {'a','b','d'}, MoreZerosThanOnes.moreZeros("abcde"));
        assertArrayEquals(new char[] {'h', 'b', 'p', 'a', 'd'}, MoreZerosThanOnes.moreZeros("thequickbrownfoxjumpsoverthelazydog"));
        assertArrayEquals(new char[] {'T','H','E','Q','I','C','B','R','F','X','J','P','L', 'A','D'}, MoreZerosThanOnes.moreZeros("THEQUICKBROWNFOXJUMPSOVERTHELAZYDOG"));
        assertArrayEquals(new char[] {'a','b','d','h','p','A','B','C','D','E','F','H','I','J','L','P','Q','R','T','X','0'}, MoreZerosThanOnes.moreZeros("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890_"));
        assertArrayEquals(new char[] {'D', 'I', 'E', 'T'}, MoreZerosThanOnes.moreZeros("DIGEST"));
    }

}