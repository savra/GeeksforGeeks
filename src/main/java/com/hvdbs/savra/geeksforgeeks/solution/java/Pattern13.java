package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Pattern 13",
        url = "https://practice.geeksforgeeks.org/problems/triangle-pattern-1661718712/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class Pattern13 {
    void printTriangle(int n) {
        int i = 1;
        int k = 1;
        int j = 0;
        int m = 0;

        while (m < n) {
            while(j < k) {
                System.out.print(i + " ");
                j++;
                i++;
            }

            System.out.println();

            j = 0;
            k++;
            m++;
        }
    }
}
