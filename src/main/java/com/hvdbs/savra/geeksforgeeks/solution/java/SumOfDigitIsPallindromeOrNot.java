package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Sum of Digit is Pallindrome or not",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-digit-is-pallindrome-or-not2751/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(LogN)",
        spaceComplexity = "O(LogN)")
public class SumOfDigitIsPallindromeOrNot {
    int isDigitSumPalindrome(int N) {
        int sum = 0;

        while (N > 0) {
            sum += N % 10;

            N /= 10;
        }

        if (Math.log10(sum) + 1 == 1) {
            return 1;
        } else {
            int tmp = sum;

            StringBuilder sb = new StringBuilder();

            while (tmp > 0) {
                sb.append(tmp % 10);

                tmp /= 10;
            }

            return String.valueOf(sum).equals(sb.toString()) ? 1 : 0;
        }
    }
}
