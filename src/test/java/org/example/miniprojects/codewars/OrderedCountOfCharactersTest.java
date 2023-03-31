package org.example.miniprojects.codewars;

import org.apache.commons.lang3.tuple.Pair;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class OrderedCountOfCharactersTest {

    private static OrderedCountOfCharacters instance = new OrderedCountOfCharacters();

    @Test
    public void sampleTest() {
        assertEquals(new ArrayList<>(Arrays.asList(Pair.of('c', 1), Pair.of('a', 1), Pair.of('t', 1))), instance.orderedCount("cat"));
    }

    @Test
    public void twinC() {
        assertEquals(new ArrayList<>(Arrays.asList(Pair.of('c', 2))), instance.orderedCount("cc"));
    }
}