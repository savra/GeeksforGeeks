package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Sum of elements in a matrix",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-elements-in-a-matrix2000/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class SumOfElementsInAMatrix {
    int sumOfMatrix(int N, int M, int[][] Grid) {
        int sum = 0;

        for (int i = 0; i < N; i++){
            for (int j = 0; j < M; j++) {
                sum += Grid[i][j];
            }
        }

        return sum;
    }
}
