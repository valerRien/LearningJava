package org.example.miniprojects.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MergeTwoSortedListsInNode {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<ListNode> listFromNodes = getSortedListFromNodes(list1, list2);
        return getListNodeFromList(listFromNodes);
    }

    private ListNode getListNodeFromList(List<ListNode> list) {
        if (list.isEmpty()) {
            return null;
        }

        for (int i = 0; i < list.size() - 1; i++) {
            list.get(i).next = list.get(i + 1);
        }
        return list.get(0);
    }

    private List<ListNode> getSortedListFromNodes(ListNode listNode1, ListNode listNode2) {
        List<Integer> listFromNodes = new ArrayList<>();
        if (listNode1 != null) {
            while (listNode1.next != null) {
                listFromNodes.add(listNode1.val);
                listNode1 = listNode1.next;
            }
            listFromNodes.add(listNode1.val);
        }

        if (listNode2 != null) {
            while (listNode2.next != null) {
                listFromNodes.add(listNode2.val);
                listNode2 = listNode2.next;
            }
            listFromNodes.add(listNode2.val);
        }
        Collections.sort(listFromNodes);
        List<ListNode> result = new ArrayList<>();
        for (int i = 0; i < listFromNodes.size(); i++) {
            result.add(new ListNode(listFromNodes.get(i)));
        }
        return result;
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
