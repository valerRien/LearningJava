package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CreditCardMaskTest {

    @Test
    public void sampleTest() {
        assertEquals("############5616", CreditCardMask.maskify("4556364607935616"));
        assertEquals("#######5616",      CreditCardMask.maskify("64607935616"));
    }

    @Test
    public void notEnoughChars() {
        assertEquals("5616", CreditCardMask.maskify("5616"));
        assertEquals("1",      CreditCardMask.maskify("1"));
    }

    @Test
    public void empty() {
        assertEquals("", CreditCardMask.maskify(""));
    }
}