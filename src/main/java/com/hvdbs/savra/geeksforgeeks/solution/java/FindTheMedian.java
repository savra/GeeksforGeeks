package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Find the median",
        url = "https://practice.geeksforgeeks.org/problems/find-the-median0527/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class FindTheMedian {
    //My Time Complexity: O(NLogN)
    //My Space complexity: O(1)
    public int find_median(int[] v) {
        Arrays.sort(v);
        int length = v.length;

        return length % 2 == 0 ? (v[length / 2] + v[length / 2 - 1]) / 2 : v[length / 2];
    }
}
