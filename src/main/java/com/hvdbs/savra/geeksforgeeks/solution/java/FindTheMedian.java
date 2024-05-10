package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Find the median",
        url = "https://practice.geeksforgeeks.org/problems/find-the-median0527/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N * LogN)")
public class FindTheMedian {
    public int find_median(int[] v) {
        Arrays.sort(v);
        int length = v.length;

        return length % 2 == 0 ? (v[length / 2] + v[length / 2 - 1]) / 2 : v[length / 2];
    }
}
