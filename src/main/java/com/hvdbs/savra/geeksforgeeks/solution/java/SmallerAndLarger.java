package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Smaller and Larger", difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/smaller-and-larger4005/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class SmallerAndLarger {
    int[] getMoreAndLess(int[] arr, int n, int x) {
        int[] result = new int[2];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] <= x) {
                result[0]++;
            }

            if (arr[i] >= x) {
                result[1]++;
            }
        }

        return result;
    }
}
