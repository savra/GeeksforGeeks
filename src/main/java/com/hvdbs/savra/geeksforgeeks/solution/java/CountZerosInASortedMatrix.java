package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Count zeros in a sorted matrix",
        url = "https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy",
        timeComplexity = "O(N^2)",
        spaceComplexity = "O(1)")
public class CountZerosInASortedMatrix {
    int countZeros(int A[][], int N) {
        int res = 0;

        for (int i = 0; i < N; i++) {
            for (int j = N - 1; j >= 0; j--) {
                if (A[i][j] == 0) {
                    res += j + 1;
                    break;
                }
            }
        }

        return res;
    }
}
