package org.example.miniprojects.leetcode;

public class ConvertBinaryNumberInALinkedListToInteger {
    public int getDecimalValue(ListNode head) {
        StringBuilder binaryValue = new StringBuilder(String.valueOf(head.val));
        ListNode current;
        while ((current = head.next) != null) {
            binaryValue.append(current.val);
            head = current;
        }

        return Integer.parseInt(binaryValue.toString(), 2);
    }

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
