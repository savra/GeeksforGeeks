package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Multiply Array",
        url = "https://practice.geeksforgeeks.org/problems/multiply-array-1658312632/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class MultiplyArray {
    public static int product(int arr[], int n) {
        int res = 1;

        for (int i = 0; i < n; i++) {
            res *= arr[i];
        }

        return res;
    }
}
