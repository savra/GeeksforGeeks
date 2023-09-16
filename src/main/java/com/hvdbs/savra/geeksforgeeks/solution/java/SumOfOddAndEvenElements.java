package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Sum of odd and even elements",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-odd-and-even-elements3033/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SumOfOddAndEvenElements {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public int[] find_sum(int n) {
        int[] res = new int[2];

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                res[1] += i;
            } else {
                res[0] += i;
            }
        }

        return res;
    }
}
