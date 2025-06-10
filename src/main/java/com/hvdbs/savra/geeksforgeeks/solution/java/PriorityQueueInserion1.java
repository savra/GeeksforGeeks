package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.PriorityQueue;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        url = "https://www.geeksforgeeks.org/problems/priorityqueue-inserion/1?page=1&category=Arrays,Java&difficulty=Basic&sortBy=accuracy",
        name = "PriorityQueue Inserion - 1",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class PriorityQueueInserion1 {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>();

        for (Integer i : arr) {
            q.offer(i);
        }

        return q;
    }
}
