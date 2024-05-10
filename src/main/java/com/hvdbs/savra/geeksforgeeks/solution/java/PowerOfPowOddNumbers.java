package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Power of Pow | Odd Numbers",
        url = "https://practice.geeksforgeeks.org/problems/power-of-pow-odd-numbers1103/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(N)",
        spaceComplexity = "O(1)")
public class PowerOfPowOddNumbers {
    public long sum_of_square_oddNumbers(long n) {
        long res = 0;

        for (int i = 1, j = 0; j < n; i++) {
            if (i % 2 != 0) {
                res += Math.pow(i, 2);
                j++;
            }
        }

        return res;
    }
}
