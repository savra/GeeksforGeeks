package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Find difference between sum of diagonals",
        url = "https://practice.geeksforgeeks.org/problems/find-difference-between-sum-of-diagonals1554/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class FindDifferenceBetweenSumOfDiagonals {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    int diagonalSumDifference(int N, int[][] Grid) {
        int primaryDiagonalSum = 0;
        int secondaryDiagonalSum = 0;

        for (int i = 0, j = N - 1; i < N; i++, j--) {
            primaryDiagonalSum += Grid[i][i];
            secondaryDiagonalSum += Grid[i][j];
        }

        return Math.abs(primaryDiagonalSum - secondaryDiagonalSum);
    }
}
