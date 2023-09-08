package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Simple Interest",
        url = "https://practice.geeksforgeeks.org/problems/simple-interest3457/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SimpleInterest {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    double simpleInterest(int P, int R, int T) {
        return R / 100.0 * P * T;
    }
}
