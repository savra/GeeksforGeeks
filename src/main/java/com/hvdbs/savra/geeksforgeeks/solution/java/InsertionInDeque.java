package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;

@CodeInfo(
        name = "Insertion in deque",
        url = "https://www.geeksforgeeks.org/problems/insertion-in-deque/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        difficulty = Difficulty.BASIC
)
public class InsertionInDeque {
    public Deque<Integer> dqInsertion(List<Integer> arr) {
        Deque<Integer> dq = new ArrayDeque<>();

        for (Integer integer : arr) {
            dq.offerLast(integer);
        }

        return dq;
    }
}
