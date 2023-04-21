package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class CountTheSmileyFacesTest {

    @Test
    public void sampleTest() {
        assertEquals(2, CountTheSmileyFaces.countSmileys(new ArrayList<>(Arrays.asList(":)", ";(", ";}",":-D"))));
        assertEquals(1, CountTheSmileyFaces.countSmileys(new ArrayList<>(Arrays.asList(";]", ":[", ";*", ":$", ";-D"))));
    }
}