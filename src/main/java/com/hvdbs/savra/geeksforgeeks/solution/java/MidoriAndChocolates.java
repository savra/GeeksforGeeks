package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Midori and chocolates",
        url = "https://practice.geeksforgeeks.org/problems/midori-and-chocolates2438/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class MidoriAndChocolates {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static long leftShops(long i, long L){
        return (1L << L) - i;
    }
}
