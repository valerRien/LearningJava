package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class NodeManiaTest {

    private NodeMania instance = new NodeMania();

    @Test
    public void sampleTest() {
        NodeMania.Node head = instance.new Node(5);
        NodeMania.Node node = instance.new Node(2);
        head.next = node;
        NodeMania.Node node2 = instance.new Node(3);
        node.next = node2;
        NodeMania.Node tail = instance.new Node(1);
        node2.next = tail;
        assertEquals(new Integer(3), NodeMania.searchKFromEnd(head, 2));
    }

}