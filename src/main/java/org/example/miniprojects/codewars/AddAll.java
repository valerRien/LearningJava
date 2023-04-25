package org.example.miniprojects.codewars;

import java.util.PriorityQueue;

public class AddAll {
    public static int addAll(final int[] numbers) {
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for (int n : numbers) {
            queue.offer(n);
        }
        int cost = 0;
        while (queue.size() > 1) {
            int stepCost = queue.poll() + queue.poll();
            queue.offer(stepCost);
            cost += stepCost;
        }
        return cost;
    }
}
