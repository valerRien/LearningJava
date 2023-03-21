package org.example.miniprojects.leetcode;


import java.math.BigInteger;


public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        String resultNumber = String.valueOf(getNumberFromNode(l1).add(getNumberFromNode(l2)));
        return fillNodeFromString(resultNumber);
    }

    private ListNode fillNodeFromString(String numberInStringFormat) {
        ListNode[] result = new ListNode[numberInStringFormat.length()];
        for (int i = 0; i < numberInStringFormat.length(); i++) {
            result[i] = new ListNode(Integer.parseInt(String.valueOf(numberInStringFormat.charAt(i))));
        }

        for (int i = result.length - 1; i > 0; i--) {
            result[i].next = result[i - 1];
        }
        return result[result.length-1];
    }

    private BigInteger getNumberFromNode(ListNode listNode) {
        String result = "";
        while (listNode != null) {
            result += String.valueOf(listNode.val);
            listNode = listNode.next;
        }
        return new BigInteger(new StringBuilder(result).reverse().toString());
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
