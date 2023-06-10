package org.example.miniprojects.leetcode;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class SortThePeopleTest {

    @Test
    void sortPeopleSampleTest() {
        Assertions.assertArrayEquals(new String[]{"Mary", "Emma", "John"},
                SortThePeople.sortPeople(new String[]{"Mary", "John", "Emma"}, new int[]{180, 165, 170}));
    }

    @Test
    void sameNameTest() {
        Assertions.assertArrayEquals(new String[]{"Bob", "Alice", "Bob"},
                SortThePeople.sortPeople(new String[]{"Alice", "Bob", "Bob"}, new int[]{155, 185, 150}));
    }

    @Test
    void sameHeightTest() {
        Assertions.assertArrayEquals(new String[]{"Alice", "Mark", "Bob", "Bob"},
                SortThePeople.sortPeople(new String[]{"Bob", "Alice", "Bob", "Mark"}, new int[]{155, 175, 150, 175}));
    }

}