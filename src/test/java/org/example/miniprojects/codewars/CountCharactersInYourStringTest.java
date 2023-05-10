package org.example.miniprojects.codewars;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CountCharactersInYourStringTest {

    @Test
    public void sampleTest() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('a', 2);
        map.put('b', 1);
        assertEquals(map, CountCharactersInYourString.count("aba"));
    }

}