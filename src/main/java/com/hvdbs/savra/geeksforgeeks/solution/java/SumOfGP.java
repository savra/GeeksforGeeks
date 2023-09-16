package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Sum of GP",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-gp2120/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions")
public class SumOfGP {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public long sum_of_gp(long n, long a, long r) {
        long result = 0;

        int i = 0;

        long tmp = a;

        while (i < n) {
            result += tmp;
            tmp *= r;
            i++;
        }

        return result;
    }
}
