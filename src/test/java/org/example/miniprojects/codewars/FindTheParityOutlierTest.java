package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindTheParityOutlierTest {

    @Test
    public void sampleTest() {
        assertEquals(11, FindTheParityOutlier.find(new int[]{2, 4,  100, 4, 11, 36}));
        assertEquals(160, FindTheParityOutlier.find(new int[]{177777, 9, 7, 1133, 5, 11, 160}));
        assertEquals(206847684, FindTheParityOutlier.find(new int[]{206847684,1056521,7,17,1901,21104421,7,1,35521,1,7781}));
    }
}