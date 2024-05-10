package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Input/Output",
        url = "https://practice.geeksforgeeks.org/problems/java-inputoutput0118/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class JavaInputOutput {
    static void printIntString(String S, int N) {
        System.out.println("The input string :" + S);
        System.out.println("The input integer :" + N);
    }
}
