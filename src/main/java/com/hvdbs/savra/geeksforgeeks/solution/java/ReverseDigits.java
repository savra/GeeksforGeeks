package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Reverse digits",
        url = "https://practice.geeksforgeeks.org/problems/reverse-digit0316/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(LogN)")
public class ReverseDigits {
    public long reverse_digit(long n) {
        StringBuilder res = new StringBuilder();

        while (n > 0) {
            res.append(n % 10);
            n /= 10;
        }

        return Long.parseLong(res.toString());
    }
}
