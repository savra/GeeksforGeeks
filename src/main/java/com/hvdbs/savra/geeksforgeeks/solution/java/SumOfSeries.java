package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Sum of Series",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-series2811/1?page=1&difficulty",
        difficulty = Difficulty.SCHOOL)
public class SumOfSeries {
    long seriesSum(int n) {
        if (n == 1) {
            return n;
        }

        return n % 2 == 0 ? (long) (1 + n) * (n / 2) : (long) (1 + (n - 1)) * ((n - 1) / 2) + n;
    }
}
