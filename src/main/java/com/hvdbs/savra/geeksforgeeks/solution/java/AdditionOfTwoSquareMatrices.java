package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Addition of two square matrices",
        url = "https://practice.geeksforgeeks.org/problems/addition-of-two-square-matrices4916/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class AdditionOfTwoSquareMatrices {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(1)
    public void Addition(int[][] matrixA, int[][] matrixB) {
        for (int i = 0; i < matrixA.length; i++) {
            for (int j = 0; j < matrixA[i].length; j++) {
                matrixA[i][j] += matrixB[i][j];
            }
        }
    }
}
