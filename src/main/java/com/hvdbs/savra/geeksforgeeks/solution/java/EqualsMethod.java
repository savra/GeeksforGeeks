package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        name = "Equals Method",
        url = "https://www.geeksforgeeks.org/problems/equals-method/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC
)
public class EqualsMethod {
    public static boolean areEqual(int a[], int b[]) {
        return Arrays.equals(a, b);
    }
}
