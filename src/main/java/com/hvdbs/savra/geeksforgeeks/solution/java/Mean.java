package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Mean",
        url = "https://practice.geeksforgeeks.org/problems/mean0021/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class Mean {
    static int mean(int N, int[] A) {
        return (int) Arrays.stream(A).average().orElse(0);
    }
}
