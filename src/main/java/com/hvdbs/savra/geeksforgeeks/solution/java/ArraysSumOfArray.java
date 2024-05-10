package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(name = "Arrays (Sum of array)",
        url = "https://practice.geeksforgeeks.org/problems/c-arrays-sum-of-array-set-14805/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        difficulty = Difficulty.SCHOOL)
public class ArraysSumOfArray {
    public long getSum(long a[], long n) {
        long result = 0;

        for (long l : a) {
            result += l;
        }

        return result;
    }
}
