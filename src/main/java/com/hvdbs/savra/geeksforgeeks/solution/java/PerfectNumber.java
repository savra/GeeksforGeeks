package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Perfect Number",
        url = "https://practice.geeksforgeeks.org/problems/perfect-number3759/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(LogN * N)",
        spaceComplexity = "O(1)")
public class PerfectNumber {
    int isPerfect(int N) {
        int tmp = N;
        int sum = 0;

        while (tmp > 0) {
            sum += factorial(tmp % 10);
            tmp /= 10;
        }

        return sum == N ? 1 : 0;
    }

    private int factorial(int N) {
        if (N <= 1) {
            return 1;
        }

        return N * factorial(N - 1);
    }
}
