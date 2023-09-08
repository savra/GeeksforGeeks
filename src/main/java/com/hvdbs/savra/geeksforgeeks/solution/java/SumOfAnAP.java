package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Sum of an AP",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-an-ap1025/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SumOfAnAP {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    public int sum_of_ap(int n, int a, int d) {
        int i = 0;
        int sum = 0;
        int j = a;

        while (i < n) {
            sum += j;
            j += d;
            i++;
        }

        return sum;
    }
}
