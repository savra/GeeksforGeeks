package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Queue;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Queue Traversal",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        url = "https://www.geeksforgeeks.org/problems/queue-traversal-1594111322/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy"
)
public class QueueTraversal {
    public static void queueTraversal(Queue<Integer> q) {
        Integer current;
        do {
            current = q.poll();

            if (current != null) {
                System.out.print(current + " ");
            }

        } while (current != null);
    }
}
