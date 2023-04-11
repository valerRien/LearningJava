package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void sampleTest() {
        assertEquals("[1, 2, Fizz]", FizzBuzz.fizzBuzz(3).toString());
    }

    @Test
    public void sampleTest2() {
        assertEquals("[1, 2, Fizz, 4, Buzz]", FizzBuzz.fizzBuzz(5).toString());
    }

    @Test
    public void sampleTest3() {
        assertEquals("[1, 2, Fizz, 4, Buzz, Fizz, 7, 8, Fizz, Buzz, 11, Fizz, 13, 14, FizzBuzz]", FizzBuzz.fizzBuzz(15).toString());
    }

}