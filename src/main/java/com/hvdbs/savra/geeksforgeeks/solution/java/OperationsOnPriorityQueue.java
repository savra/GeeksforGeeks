package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.PriorityQueue;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Operations on PriorityQueue",
        url = "https://practice.geeksforgeeks.org/problems/operations-on-priorityqueue/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class OperationsOnPriorityQueue {
    // Function to insert element into the queue
    static void insert(PriorityQueue<Integer> q, int k) {
        q.offer(k);
    }

    // Function to find an element k
    static boolean find(PriorityQueue<Integer> q, int k) {
        return q.contains(k);
    }

    // Function to delete the max element from queue
    static int delete(PriorityQueue<Integer> q) {
        return q.poll();
    }
}
