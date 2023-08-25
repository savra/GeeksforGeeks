package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "nPr",
        url = "https://practice.geeksforgeeks.org/problems/npr4253/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class nPr {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)

    static long nPr(long n, long r){
        return factorial(n) / factorial(r - 1);
    }

    private static long factorial(long n) {
        return n == 0 ? 1 : n * factorial(n - 1);
    }
}
