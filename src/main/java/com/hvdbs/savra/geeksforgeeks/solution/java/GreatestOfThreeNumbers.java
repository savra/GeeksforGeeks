package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Greatest of three numbers",
        url = "https://practice.geeksforgeeks.org/problems/greatest-of-three-numbers2520/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class GreatestOfThreeNumbers {
    int greatestOfThree(int A, int B, int C) {
        if (A > B) {
            return Math.max(A, C);
        } else {
            return Math.max(B, C);
        }
    }
}
