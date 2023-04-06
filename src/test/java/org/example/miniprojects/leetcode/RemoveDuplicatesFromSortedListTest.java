package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveDuplicatesFromSortedListTest {

    @Test
    public void sampleTest() {

        assertEquals("1 2 3", RemoveDuplicatesFromSortedList.deleteDuplicates(getNodes()).toString());
    }


    public RemoveDuplicatesFromSortedList.ListNode getNodes(){
        RemoveDuplicatesFromSortedList inst = new RemoveDuplicatesFromSortedList();
        RemoveDuplicatesFromSortedList.ListNode head = inst.new ListNode();
        RemoveDuplicatesFromSortedList.ListNode second = inst.new ListNode();
        RemoveDuplicatesFromSortedList.ListNode third = inst.new ListNode();
        RemoveDuplicatesFromSortedList.ListNode fourth = inst.new ListNode();
        RemoveDuplicatesFromSortedList.ListNode fifth = inst.new ListNode();

        head.val = 1; head.next = second;
        second.val = 2; second.next = third;
        third.val = 2; third.next = fourth;
        fourth.val = 3; fourth.next = fifth;
        fifth.val = 3; fifth.next = null;

        return head;
    }
}