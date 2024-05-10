package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Small Factorial",
        url = "https://practice.geeksforgeeks.org/problems/small-factorial0854/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class SmallFactorial {
    public long find_fact(int n) {
        long res = 1;

        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }
}
