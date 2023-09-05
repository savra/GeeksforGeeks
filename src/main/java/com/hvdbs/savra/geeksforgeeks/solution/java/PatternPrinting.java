package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Pattern Printing",
        url = "https://practice.geeksforgeeks.org/problems/pattern-printing1347/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class PatternPrinting {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    static void printPattern(int N) {
        StringBuilder result = new StringBuilder();
        StringBuilder tmp = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            tmp.append("*");
            result.append(tmp).append(" ");
        }

        System.out.print(result);
    }
}
