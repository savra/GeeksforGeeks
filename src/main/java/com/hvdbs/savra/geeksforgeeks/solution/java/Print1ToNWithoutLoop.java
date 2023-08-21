package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Print 1 To N Without Loop",
        url = "https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops-1587115620/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class Print1ToNWithoutLoop {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)

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
