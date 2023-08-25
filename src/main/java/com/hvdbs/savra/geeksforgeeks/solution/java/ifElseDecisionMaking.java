package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "if-else (Decision Making)",
        url = "https://practice.geeksforgeeks.org/problems/java-if-else-decision-making0924/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class ifElseDecisionMaking {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
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
