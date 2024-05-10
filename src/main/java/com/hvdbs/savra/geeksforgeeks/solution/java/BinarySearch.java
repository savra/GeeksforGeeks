package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Binary Search",
        url = "https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article",
        spaceComplexity = "O(1)",
        timeComplexity = "O(LogN)")
public class BinarySearch {
    int binarySearch(int arr[], int n, int k) {
        int lo = 0;
        int ho = n - 1;

        while (lo <= ho) {
            int m = lo + (ho - lo) / 2;

            if (k < arr[m]) {
                ho = m - 1;
            } else if (k > arr[m]) {
                lo = m + 1;
            } else {
                return m;
            }
        }

        return -1;
    }
}
