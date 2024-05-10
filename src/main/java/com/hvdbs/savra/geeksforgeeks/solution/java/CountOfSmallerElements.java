package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(name = "Count of smaller elements",
        difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/count-of-smaller-elements5947/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class CountOfSmallerElements {
    public long countOfElements(long arr[], long n, long x) {
        int targetElemIndex = -1;

        if (x >= arr[arr.length - 1]) {
            return arr.length;
        }

        for (int i = 0; i < arr.length; i++) {
            if (x >= arr[i]) {
                targetElemIndex = i;
                continue;
            }

            if (targetElemIndex != -1) {
                return targetElemIndex + 1;
            }
        }

        if (targetElemIndex == -1) {
            targetElemIndex = 0;
        }

        return targetElemIndex;
    }
}
