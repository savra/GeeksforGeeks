package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Automorphic Number",
        url = "https://practice.geeksforgeeks.org/problems/automorphic-number4721/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class AutomorphicNumber {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public String is_AutomorphicNumber(int n) {
        return n % 10 == (n * n) % 10 ? "Automorphic": "Not Automorphic";
    }
}
