package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConsecutiveStringsTest {

    @Test
    public void sampleTest() {
        assertEquals("abigailtheta", ConsecutiveStrings.longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
        assertEquals("ixoyx3452zzzzzzzzzzzz", ConsecutiveStrings.longestConsec(new String[]{"it","wkppv","ixoyx", "3452", "zzzzzzzzzzzz"}, 3));
    }

    @Test
    public void sampleTest2() {
        assertEquals("oocccffuucccjjjkkkjyyyeehh", ConsecutiveStrings.longestConsec(new String[]{"ejjjjmmtthh", "zxxuueeg", "aanlljrrrxx", "dqqqaaabbb", "oocccffuucccjjjkkkjyyyeehh"}, 1));
        assertEquals("wkppqsztdkmvcuwvereiupccauycnjutlvvweqilsfytihvrzlaodfixoyxvyuyvgpck", ConsecutiveStrings.longestConsec(new String[]{"itvayloxrp","wkppqsztdkmvcuwvereiupccauycnjutlv","vweqilsfytihvrzlaodfixoyxvyuyvgpck"}, 2));
    }


}