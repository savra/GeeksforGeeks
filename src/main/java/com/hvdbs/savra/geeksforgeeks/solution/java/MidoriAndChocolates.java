package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Midori and chocolates",
        url = "https://practice.geeksforgeeks.org/problems/midori-and-chocolates2438/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class MidoriAndChocolates {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static long leftShops(long i, long L) {
        return (1L << L) - i;
    }
}
