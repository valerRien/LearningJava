package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class PascalsTriangleTest {

    @Test
    public void sampleTest() {
        assertEquals("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1]]", Arrays.deepToString(PascalsTriangle.pascal(4)));
        assertEquals("[[1], [1, 1], [1, 2, 1], [1, 3, 3, 1], [1, 4, 6, 4, 1]]", Arrays.deepToString(PascalsTriangle.pascal(5)));
    }
}