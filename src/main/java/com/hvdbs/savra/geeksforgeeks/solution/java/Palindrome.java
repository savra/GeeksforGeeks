package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Palindrome",
        url = "https://practice.geeksforgeeks.org/problems/palindrome0746/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class Palindrome {
    public String is_palindrome(int n) {
        String tmp = String.valueOf(n);
        StringBuilder sb = new StringBuilder();

        while (n > 0) {
            sb.append(n % 10);

            n /= 10;
        }

        return tmp.equals(sb.toString()) ? "Yes" : "No";
    }
}
