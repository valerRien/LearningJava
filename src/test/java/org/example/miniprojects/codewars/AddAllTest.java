package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class AddAllTest {

    @Test
    public void sampleTest() {
        assertEquals(9, AddAll.addAll(new int[]{1, 2, 3}));
        assertEquals(19, AddAll.addAll(new int[]{1, 2, 3, 4}));
    }
}