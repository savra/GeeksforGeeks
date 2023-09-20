package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Queue;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Queue Push & Pop",
        url = "https://practice.geeksforgeeks.org/problems/queue-designer/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class QueuePushPop {
    public Queue<Integer> push(int arr[], int n) {
        Queue<Integer> res = new java.util.ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            res.offer(arr[i]);
        }

        return res;
    }

    public void _pop(Queue<Integer> q) {
        while(q.peek() != null) {
            System.out.print(q.poll() + " ");
        }
    }
}
