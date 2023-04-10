package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class AlphabetWarTest {

    @Test
    public void sampleTest() {
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("z"));
        assertEquals("Let's fight again!", AlphabetWar.alphabetWar("zdqmwpbs"));
        assertEquals("Right side wins!", AlphabetWar.alphabetWar("zzzzs"));
    }

    @Test
    public void sampleTest2() {
        assertEquals("Left side wins!", AlphabetWar.alphabetWar("wwwwwwz"));
    }
}