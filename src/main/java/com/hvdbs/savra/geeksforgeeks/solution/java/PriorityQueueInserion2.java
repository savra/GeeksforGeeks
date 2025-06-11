package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

@CodeInfo(
        name = "PriorityQueue Inserion - 2",
        difficulty = Difficulty.BASIC,
        url = "https://www.geeksforgeeks.org/problems/priorityqueue-inserion-2/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR
)
public class PriorityQueueInserion2 {
    public static PriorityQueue<Integer> insertion(ArrayList<Integer> arr) {
        PriorityQueue<Integer> q = new PriorityQueue<>(Comparator.reverseOrder());
        q.addAll(arr);

        return q;
    }
}