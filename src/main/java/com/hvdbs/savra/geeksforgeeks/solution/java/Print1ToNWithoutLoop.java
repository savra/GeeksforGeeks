package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Print 1 To N Without Loop",
        url = "https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class Print1ToNWithoutLoop {
    public void printNos(int N) {
        printNumber(1, N);
    }

    private void printNumber(int i, int N) {
        if (i > N) {
            return;
        }

        System.out.print(i + " ");
        printNumber(i + 1, N);
    }
}
