package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class SetReducerTest {

    @Test
    public void sampleTest() {
        assertEquals(2, SetReducer.setReducer(new int[]{0, 4, 6, 8, 8, 8, 5, 5, 7}));
        assertEquals(3, SetReducer.setReducer(new int[]{8, 1, 6, 1, 2, 7, 7, 7, 7, 6, 5, 3, 2, 1, 8}));
    }

}