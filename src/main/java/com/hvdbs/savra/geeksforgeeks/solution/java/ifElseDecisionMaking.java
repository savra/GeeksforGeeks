package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "if-else (Decision Making)",
        url = "https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class ifElseDecisionMaking {
    static String compareNM(int n, int m) {
        if (n == m) {
            return "equal";
        } else if (n < m) {
            return "lesser";
        } else {
            return "greater";
        }
    }
}
