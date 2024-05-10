package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Diagonal sum",
        url = "https://practice.geeksforgeeks.org/problems/diagonal-sum0158/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class DiagonalSum {
    public int DiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            sum += matrix[i][i] + matrix[i][j];
        }

        return sum;
    }
}
