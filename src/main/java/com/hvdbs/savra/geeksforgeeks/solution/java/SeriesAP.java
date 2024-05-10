package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Series AP",
        url = "https://practice.geeksforgeeks.org/problems/series-ap5310/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class SeriesAP {
    int nthTermOfAP(int A1, int A2, int N) {
        return A1 + (A2 - A1) * (N - 1);
    }
}
