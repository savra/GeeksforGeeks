package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.*;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Queue Reversal",
        url = "https://practice.geeksforgeeks.org/problems/queue-reversal/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class QueueReversal {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
    public Queue<Integer> rev(Queue<Integer> q) {
        Deque<Integer> queue = new ArrayDeque<>();

        while (q.peek() != null) {
            queue.offerFirst(q.poll());
        }

        return queue;
    }
}
