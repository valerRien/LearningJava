package org.example.miniprojects.leetcode;

import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class CountItemsMatchingARuleTest {

    @Test
    public void sampleTest() {
        List<String> list1 = new ArrayList<>(Arrays.asList("phone", "blue", "pixel"));
        List<String> list2 = new ArrayList<>(Arrays.asList("phone", "gold", "pixel2"));
        List<String> list3 = new ArrayList<>(Arrays.asList("phone", "silver", "pixel3"));
        List<List<String>> list = new ArrayList<>(Arrays.asList(list1, list2, list3));
        assertEquals(1, CountItemsMatchingARule.countMatches(list, "color", "silver"));
    }

}