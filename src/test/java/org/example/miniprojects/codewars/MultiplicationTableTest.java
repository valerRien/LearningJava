package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationTableTest {

    @Test
    public void sampleTest() {
        int[][] test = {{1,2,3},{2,4,6},{3,6,9}};
        assertArrayEquals(test,MultiplicationTable.multiplicationTable(3));
    }
}