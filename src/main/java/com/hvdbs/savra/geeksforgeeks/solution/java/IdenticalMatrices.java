package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Identical Matrices",
        url = "https://practice.geeksforgeeks.org/problems/identical-matrices1042/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class IdenticalMatrices {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(1)
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
