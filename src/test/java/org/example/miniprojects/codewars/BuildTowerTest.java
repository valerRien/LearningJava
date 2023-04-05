package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class BuildTowerTest {

    @Test
    public void sampleTest() {
        assertEquals(String.join(",", "*"), String.join(",", BuildTower.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", BuildTower.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", BuildTower.towerBuilder(3)));
    }

    @Test
    public void emptyTowerTest(){
        assertEquals( "[]", Arrays.toString(BuildTower.towerBuilder(0)));
    }
}