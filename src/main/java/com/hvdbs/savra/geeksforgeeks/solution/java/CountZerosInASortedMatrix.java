package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Count zeros in a sorted matrix",
        url = "https://practice.geeksforgeeks.org/problems/count-zeros-in-a-sorted-matrix/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class CountZerosInASortedMatrix {
    //My Time Complexity: O(n^2)
    //My Space complexity: O(1)
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
