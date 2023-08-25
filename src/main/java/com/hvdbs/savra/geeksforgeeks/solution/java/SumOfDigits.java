package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Sum Of Digits",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-digits1742/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SumOfDigits {
    //My Time Complexity: O(logN)
    //My Space complexity: O(1)
    static int sumOfDigits(int N) {
        int result = 0;

        while(N > 0) {
            result += N % 10;
            N /= 10;
        }

        return result;
    }
}
