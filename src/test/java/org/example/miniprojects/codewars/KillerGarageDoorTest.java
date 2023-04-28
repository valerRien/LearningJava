package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class KillerGarageDoorTest {

    @Test
    public void staying() {
        assertEquals("000000000", KillerGarageDoor.run("........."));
    }


    @Test
    public void sampleTest() {
        assertEquals("123", KillerGarageDoor.run("P.."));
    }

    @Test
    public void sampleTest2() {
        assertEquals("12345", KillerGarageDoor.run("P...."));
    }

    @Test
    public void stop() {
        assertEquals("12222", KillerGarageDoor.run("P.P.."));
    }

    @Test
    public void oTest() {
        assertEquals("1210000", KillerGarageDoor.run("P.O...."));
    }

    @Test
    public void oTest2() {
        assertEquals("001234321000", KillerGarageDoor.run("..P...O....."));
    }

}