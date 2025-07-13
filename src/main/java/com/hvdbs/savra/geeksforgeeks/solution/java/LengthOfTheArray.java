package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Length of The Array",
        url = "https://www.geeksforgeeks.org/problems/length-of-the-array/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class LengthOfTheArray {
    public static int arrayLength(int[] arr) {
        return arr.length;
    }
}
