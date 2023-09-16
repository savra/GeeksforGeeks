package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Small Factorial",
        url = "https://practice.geeksforgeeks.org/problems/small-factorial0854/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SmallFactorial {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public long find_fact(int n) {
        long res = 1;

        for (int i = 2; i <= n; i++) {
            res *= i;
        }

        return res;
    }
}
