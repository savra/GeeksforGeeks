package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Sum of Array",
        url = "https://practice.geeksforgeeks.org/problems/sum-of-array2326/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        difficulty = Difficulty.SCHOOL)
public class SumOfArray {
    int sum(int arr[], int n) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }

        return result;
    }
}
