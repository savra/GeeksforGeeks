package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "C++ if-else (Decision Making)",
        url = "https://practice.geeksforgeeks.org/problems/c-if-else-decision-making4138/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class CIfElseDecisionMaking {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static String compareFive(int N){
        if (N > 5) {
            return "Greater than 5";
        } else if (N < 5) {
            return "Less than 5";
        } else {
            return "Equal to 5";
        }
    }
}
