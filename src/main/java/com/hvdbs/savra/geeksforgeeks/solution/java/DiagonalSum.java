package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Diagonal sum",
        url = "https://practice.geeksforgeeks.org/problems/diagonal-sum0158/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class DiagonalSum {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public int DiagonalSum(int[][] matrix) {
        int sum = 0;

        for (int i = 0, j = matrix.length - 1; i < matrix.length; i++, j--) {
            sum += matrix[i][i] + matrix[i][j];
        }

        return sum;
    }
}
