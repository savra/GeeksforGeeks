package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Greatest of three numbers",
        url = "https://practice.geeksforgeeks.org/problems/greatest-of-three-numbers2520/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class GreatestOfThreeNumbers {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    int greatestOfThree(int A, int B, int C) {
        if (A > B) {
            return Math.max(A, C);
        } else {
            return Math.max(B, C);
        }
    }
}
