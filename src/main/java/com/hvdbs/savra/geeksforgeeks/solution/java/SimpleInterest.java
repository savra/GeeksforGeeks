package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Simple Interest",
        url = "https://practice.geeksforgeeks.org/problems/simple-interest3457/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class SimpleInterest {
    double simpleInterest(int P, int R, int T) {
        return R / 100.0 * P * T;
    }
}
