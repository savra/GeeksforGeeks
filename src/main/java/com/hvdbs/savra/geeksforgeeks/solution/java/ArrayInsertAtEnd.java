package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        url = "https://www.geeksforgeeks.org/problems/array-insert-at-end/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        name = "Array insert at end"
)
public class ArrayInsertAtEnd {
    public void insertAtEnd(ArrayList<Integer> arr, int val) {
        arr.add(val);
    }
}
