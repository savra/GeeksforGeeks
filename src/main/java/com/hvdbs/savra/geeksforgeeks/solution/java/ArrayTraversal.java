package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Array Traversal",
        url = "https://www.geeksforgeeks.org/problems/array-traversal/1?page=1&category=Java,two-pointer-algorithm&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class ArrayTraversal {
    public static void arrayTraversal(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
