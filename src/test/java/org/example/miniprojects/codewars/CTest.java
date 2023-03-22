package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CTest {

    @Test
    public void basicTests() {
        assertEquals("You're a(n) kid", C.a(9));
        assertEquals("You're a(n) kid", C.a(10));
        assertEquals("You're a(n) kid", C.a(11));
        assertEquals("You're a(n) kid", C.a(12));
        assertEquals("You're a(n) teenager", C.a(13));
        assertEquals("You're a(n) teenager", C.a(14));
        assertEquals("You're a(n) teenager", C.a(15));
        assertEquals("You're a(n) teenager", C.a(16));
        assertEquals("You're a(n) teenager", C.a(17));
        assertEquals("You're a(n) adult", C.a(18));
        assertEquals("You're a(n) adult", C.a(19));
        assertEquals("You're a(n) adult", C.a(63));
        assertEquals("You're a(n) adult", C.a(64));
        assertEquals("You're a(n) elderly", C.a(65));
        assertEquals("You're a(n) elderly", C.a(66));
        assertEquals("You're a(n) elderly", C.a(100));
    }
}