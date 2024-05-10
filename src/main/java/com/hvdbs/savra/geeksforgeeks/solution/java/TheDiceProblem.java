package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "The dice problem",
        url = "https://practice.geeksforgeeks.org/problems/the-dice-problem2316/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class TheDiceProblem {
    static int oppositeFaceOfDice(int N) {
        if (N == 6) {
            return 1;
        } else if (N == 5) {
            return 2;
        } else if (N == 4) {
            return 3;
        } else if (N == 3) {
            return 4;
        } else if (N == 2) {
            return 5;
        } else {
            return 6;
        }
    }
}
