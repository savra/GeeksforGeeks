package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Set kth bit",
        url = "https://practice.geeksforgeeks.org/problems/set-kth-bit3724/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class SetKthBit {
    static int setKthBit(int N,int K){
        return N | 1 << K;
    }
}
