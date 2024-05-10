package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Print 1 to n without using loops",
        url = "https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class Print1ToNWithoutUsingLoops {
    static void printTillN(int N) {
        printN(1, N);
    }

    private static void printN(int i, int N) {
        System.out.print(i + " ");

        if (i == N) {
            return;
        }

        printN(i + 1, N);
    }
}
