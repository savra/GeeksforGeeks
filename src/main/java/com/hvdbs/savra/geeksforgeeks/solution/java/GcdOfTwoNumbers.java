package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "GCD of two numbers",
        url = "https://practice.geeksforgeeks.org/problems/gcd-of-two-numbers3459/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(Log(Min(a, b)))")
public class GcdOfTwoNumbers {
    public int gcd(int A, int B) {
        if (B == 0) {
            return A;
        }

        return gcd(B, A % B);
    }
}
