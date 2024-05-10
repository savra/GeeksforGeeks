package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "nPr",
        url = "https://practice.geeksforgeeks.org/problems/npr4253/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class nPr {
    static long nPr(long n, long r) {
        return factorial(n) / factorial(r - 1);
    }

    private static long factorial(long n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
