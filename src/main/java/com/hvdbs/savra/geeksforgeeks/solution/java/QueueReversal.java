package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.*;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Queue Reversal",
        url = "https://practice.geeksforgeeks.org/problems/queue-reversal/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class QueueReversal {
    public Queue<Integer> rev(Queue<Integer> q) {
        Deque<Integer> queue = new ArrayDeque<>();

        while (q.peek() != null) {
            queue.offerFirst(q.poll());
        }

        return queue;
    }
}
