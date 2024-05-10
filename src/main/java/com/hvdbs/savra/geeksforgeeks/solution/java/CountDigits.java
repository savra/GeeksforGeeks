package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Count Digits",
        url = "https://practice.geeksforgeeks.org/problems/count-digits5716/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(LogN)",
        spaceComplexity = "O(1)")
public class CountDigits {
    //Expected Time Complexity: O(log N)
    //Expected Space Complexity: O(1)
    static int evenlyDivides(int N) {
        int result = 0;
        int sourceN = N;

        while (N > 0) {
            int tmp = N % 10;

            if (tmp != 0 && sourceN % tmp == 0) {
                result++;
            }

            N /= 10;
        }

        return result;
    }
}
