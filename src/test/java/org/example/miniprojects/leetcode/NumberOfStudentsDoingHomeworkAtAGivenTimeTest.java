package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberOfStudentsDoingHomeworkAtAGivenTimeTest {

    @Test
    public void sampleTest() {
        assertEquals(1, NumberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(new int[]{2}, new int[]{2}, 2));
        assertEquals(1, NumberOfStudentsDoingHomeworkAtAGivenTime.busyStudent(new int[]{1, 1}, new int[]{1, 2}, 2));
    }

}