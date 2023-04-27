package org.example.miniprojects.leetcode;

import org.junit.Test;

import static org.junit.Assert.*;

public class ConvertBinaryNumberInALinkedListToIntegerTest {

    private ConvertBinaryNumberInALinkedListToInteger instance = new ConvertBinaryNumberInALinkedListToInteger();

    @Test
    public void sampleTest() {
        ConvertBinaryNumberInALinkedListToInteger.ListNode node1 = instance.new ListNode(1);
        ConvertBinaryNumberInALinkedListToInteger.ListNode node2 = instance.new ListNode(0);
        node1.next = node2;
        ConvertBinaryNumberInALinkedListToInteger.ListNode node3 = instance.new ListNode(1);
        node2.next = node3;
        assertEquals(5, instance.getDecimalValue(node1));
    }

}