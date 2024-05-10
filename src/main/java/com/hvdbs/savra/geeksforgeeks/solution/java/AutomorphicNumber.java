package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Automorphic Number",
        url = "https://practice.geeksforgeeks.org/problems/automorphic-number4721/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class AutomorphicNumber {
    public String is_AutomorphicNumber(int n) {
        return n % 10 == (n * n) % 10 ? "Automorphic" : "Not Automorphic";
    }
}
