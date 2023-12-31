package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Series AP",
        url = "https://practice.geeksforgeeks.org/problems/series-ap5310/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SeriesAP {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    int nthTermOfAP(int A1, int A2, int N) {
        return A1 + (A2 - A1) * (N - 1);
    }
}
