package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Maximum Element in Array",
        url = "https://www.geeksforgeeks.org/problems/largest-element-in-array4009--142158/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class MaximumElementInArray {
    public static int largest(int[] arr) {
        int max = 0x80000000;

        for (Integer i : arr) {
            if (i > max) {
                max = i;
            }
        }

        return max;
    }
}
