package org.example.miniprojects.codewars;

import java.util.*;

public class NodeMania {
    public static Integer searchKFromEnd(Node linkedList, int k){

        if (k == 0) return null;

        List<Integer> nodeValue = new ArrayList<>();
        while (linkedList != null) {
            nodeValue.add(linkedList.data);
            linkedList = linkedList.next;
        }

        if (k > nodeValue.size()) return null;

        return nodeValue.get(nodeValue.size() - k);
    }

    public class Node {
        public final int data;
        public Node next;

        public Node(int data) {
            this.data = data;
        }

    }
}
