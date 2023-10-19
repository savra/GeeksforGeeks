package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Reverse First K elements of Queue",
        url = "https://practice.geeksforgeeks.org/problems/reverse-first-k-elements-of-queue/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class ReverseFirstKElementsOfQueue {
    public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
        int[] tmp = new int[k];

        for (int i = 0; i < k; i++) {
            tmp[i] = q.poll();
        }

        Queue<Integer> queue = new ArrayDeque<>();
        for (int i = k - 1; i >= 0; i--) {
            queue.offer(tmp[i]);
        }

        while (!q.isEmpty()) {
            queue.offer(q.poll());
        }

        return queue;
    }
}
