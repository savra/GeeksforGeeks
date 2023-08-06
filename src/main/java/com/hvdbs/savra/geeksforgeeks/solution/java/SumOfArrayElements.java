package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(difficulty = Difficulty.SCHOOL, name = "Sum of Array Elements",
url = "https://practice.geeksforgeeks.org/problems/sum-of-array-elements2502/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class SumOfArrayElements {
    public static int sumElement(int arr[], int n)
    {
        int result = 0;

        for (int i = 0; i < arr.length & i < n; i++) {
            result += arr[i];
        }

        return result;
    }
}
