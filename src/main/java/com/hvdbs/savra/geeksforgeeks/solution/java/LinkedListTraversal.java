package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.LinkedList;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "LinkedList Traversal",
        url = "https://www.geeksforgeeks.org/problems/linkedlist-traversal/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class LinkedListTraversal {
    public static void LinkedListTraversal(LinkedList<Integer> list) {
        for(Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
