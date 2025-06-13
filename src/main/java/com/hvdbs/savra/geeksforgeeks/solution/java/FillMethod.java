package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        name = "Fill Method",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        url = "https://www.geeksforgeeks.org/problems/fill-method/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC)
public class FillMethod {
    public static void fillArray(int arr[], int k) {
        Arrays.fill(arr, k);
    }
}
