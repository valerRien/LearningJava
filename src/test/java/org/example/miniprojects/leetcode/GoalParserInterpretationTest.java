package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class GoalParserInterpretationTest {

    @Test
    public void sampleTest() {
        assertEquals("Goal", GoalParserInterpretation.interpret("G()(al)"));
        assertEquals("Gooooal", GoalParserInterpretation.interpret("G()()()()(al)"));
    }

}