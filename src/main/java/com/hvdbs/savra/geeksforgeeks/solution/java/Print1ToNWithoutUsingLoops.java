package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Print 1 to n without using loops",
        url = "https://practice.geeksforgeeks.org/problems/print-1-to-n-without-using-loops3621/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class Print1ToNWithoutUsingLoops {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    static void printTillN(int N){
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
