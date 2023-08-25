package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "The dice problem",
        url = "https://practice.geeksforgeeks.org/problems/the-dice-problem2316/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class TheDiceProblem {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static int oppositeFaceOfDice(int N){
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
