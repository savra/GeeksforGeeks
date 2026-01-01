package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        url = "https://www.geeksforgeeks.org/problems/table-difference/1?page=1&category=Java,two-pointer-algorithm&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC,
        name = "Table Difference")
public class TableDifference {
    public static void difference(int n1, int n2) {
        for (int i = 1; i <= 10; i++) {
            System.out.print(n1 * i - n2 * i + " ");
        }
    }
}
