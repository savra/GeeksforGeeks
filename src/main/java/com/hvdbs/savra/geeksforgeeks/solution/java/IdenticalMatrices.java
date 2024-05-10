package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Identical Matrices",
        url = "https://practice.geeksforgeeks.org/problems/identical-matrices1042/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N^2)")
public class IdenticalMatrices {
    int areMatricesIdentical(int N, int[][] Grid1, int[][] Grid2) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (Grid1[i][j] != Grid2[i][j]) {
                    return 0;
                }
            }
        }

        return 1;
    }
}
