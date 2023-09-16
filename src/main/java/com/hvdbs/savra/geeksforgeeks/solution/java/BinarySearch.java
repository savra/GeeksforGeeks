package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Binary Search",
        url = "https://practice.geeksforgeeks.org/problems/binary-search-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article"
)
public class BinarySearch {
    //My Time Complexity: O(LogN)
    //My Space complexity: O(1)
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
