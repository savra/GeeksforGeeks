package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Bit Difference",
        url = "https://practice.geeksforgeeks.org/problems/bit-difference-1587115620/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class BitDifference {
    public static int countBitsFlip(int a, int b) {
        return Integer.bitCount(a ^ b);
    }
}
