package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Collections;
import java.util.LinkedList;

@CodeInfo(
        name = "Fill LinkedList",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://www.geeksforgeeks.org/problems/fill-linkedlist/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC
)
public class FillLinkedList {
    public static void fillLinkedList(LinkedList<Integer> ll, int k) {
        Collections.fill(ll, k);
    }
}
