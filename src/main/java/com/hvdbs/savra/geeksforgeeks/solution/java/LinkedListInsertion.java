package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.LinkedList;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "LinkedList Insertion",
        url = "https://www.geeksforgeeks.org/problems/linkedlist-insertion/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class LinkedListInsertion {
    public static LinkedList<Integer> insertion(int[] arr) {
        LinkedList<Integer> result = new LinkedList<>();

        for (int i : arr) {
            result.add(i);
        }

        return result;
    }
}
