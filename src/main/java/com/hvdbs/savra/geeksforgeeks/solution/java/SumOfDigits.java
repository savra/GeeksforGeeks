package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Sum Of Digits",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-digits1742/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(LogN)")
public class SumOfDigits {
    static int sumOfDigits(int N) {
        int result = 0;

        while (N > 0) {
            result += N % 10;
            N /= 10;
        }

        return result;
    }
}
