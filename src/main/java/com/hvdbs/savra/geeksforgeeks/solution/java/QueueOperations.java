package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.EASY,
        name = "Queue Operations",
        url = "https://www.geeksforgeeks.org/problems/queue-operations/1?page=1&category=Queue&difficulty=Easy&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR)
public class QueueOperations {
    // Function to insert element into the queue
    static void insert(Queue<Integer> q, int k) {
        q.offer(k);
    }

    // Function to find frequency of an element
    // return the frequency of k
    static int findFrequency(Queue<Integer> q, int k) {
        Queue<Integer> tempQueue = new ArrayDeque<>();

        Integer current = q.poll();
        tempQueue.offer(current);

        int frequency = 0;

        while (current != null) {
            if (current == k) {
                frequency++;
            }

            current = q.poll();

            if (current != null) {
                tempQueue.offer(current);
            }
        }

        current = tempQueue.poll();

        while (current != null) {
            q.offer(current);
            current = tempQueue.poll();
        }

        return frequency;
    }
}
