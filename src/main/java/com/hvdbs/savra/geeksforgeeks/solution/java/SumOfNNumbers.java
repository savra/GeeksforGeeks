package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Sum of N Numbers",
        url = "https://www.geeksforgeeks.org/problems/sum-of-n-number/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT)
public class SumOfNNumbers {
    public static int nSum(int n) {
        return (n % 2 == 0 ? 1 + n : n) * (n % 2 == 0 ? n / 2 : n / 2 + 1);
    }
}
