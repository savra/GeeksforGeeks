package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Red OR Green",
        url = "https://practice.geeksforgeeks.org/problems/red-or-green5711/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class RedOrGreen {
    static int RedOrGreen(int N, String S) {
        int nCount = 0;
        int rCount = 0;

        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                rCount++;
            } else {
                nCount++;
            }
        }

        return Math.min(nCount, rCount);
    }
}
