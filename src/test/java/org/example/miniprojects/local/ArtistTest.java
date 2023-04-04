package org.example.miniprojects.local;

import org.junit.Test;

import static org.junit.Assert.*;

public class ArtistTest {

    @Test
    public void mostContrastDays() throws Exception {
        assertEquals("1 4", Artist.mostContrastDays("4", "2 1 0 -1"));
        assertEquals("6 1", Artist.mostContrastDays("6", "1 2 1 3 1 3"));
    }
}