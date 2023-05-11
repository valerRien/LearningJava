package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class DestinationCityTest {

    @Test
    public void sampleTest() {
        List<String> list1 = Arrays.asList("London", "New York");
        List<String> list2 = Arrays.asList("New York","Lima");
        List<String> list3 = Arrays.asList("Lima","Sao Paulo");
        List<List<String>> test = new ArrayList<>();
        test.add(list1); test.add(list2); test.add(list3);
        assertEquals("Sao Paulo", DestinationCity.destCity(test));
    }

}