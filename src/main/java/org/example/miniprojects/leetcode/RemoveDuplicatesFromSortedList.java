package org.example.miniprojects.leetcode;

import java.util.TreeMap;

public class RemoveDuplicatesFromSortedList {
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        TreeMap<Integer, ListNode> nodesAndItsValues = new TreeMap<>();
        while (head != null) {
            nodesAndItsValues.put(head.val, head);
            head = head.next;
        }
        Object[] keys = nodesAndItsValues.keySet().toArray();
        for (int i = 0; i < keys.length - 1; i++) {
            nodesAndItsValues.get((Integer)keys[i]).next = nodesAndItsValues.get((Integer)keys[i + 1]);
        }

        nodesAndItsValues.get((Integer)keys[keys.length - 1]).next = null;
        return nodesAndItsValues.get(nodesAndItsValues.firstKey());
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

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            ListNode current = this;
            while (current != null) {
                sb.append(current.val).append(" ");
                current = current.next;
            }
            return sb.toString().trim();
        }
    }

}
