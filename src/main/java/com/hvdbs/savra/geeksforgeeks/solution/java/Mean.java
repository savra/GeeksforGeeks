package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Mean",
        url = "https://practice.geeksforgeeks.org/problems/mean0021/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class Mean {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    static int mean(int N , int[] A) {
        return (int)Arrays.stream(A).average().orElse(0);
    }
}
