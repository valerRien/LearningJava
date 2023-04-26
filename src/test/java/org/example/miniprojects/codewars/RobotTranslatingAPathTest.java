package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class RobotTranslatingAPathTest {

    @Test
    public void sampleTest() {
        assertEquals("Take 1 step up", RobotTranslatingAPath.walk("^"));
        assertEquals("Take 1 step down", RobotTranslatingAPath.walk("v"));
        assertEquals("Take 2 steps right", RobotTranslatingAPath.walk(">>"));
        assertEquals("Paused", RobotTranslatingAPath.walk(""));
    }

    @Test
    public void sampleTest2(){
        assertEquals("Take 2 steps left\nTake 1 step right", RobotTranslatingAPath.walk("<<>"));
    }

    @Test
    public void sampleTest3(){
        assertEquals("""
                Take 1 step left
                Take 1 step right
                Take 1 step left
                Take 3 steps right
                Take 1 step left
                Take 1 step right
                Take 1 step down
                Take 1 step left""", RobotTranslatingAPath.walk("<><>>><>v<"));
    }
}