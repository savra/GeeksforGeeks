package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Input/Output",
        url = "https://practice.geeksforgeeks.org/problems/java-inputoutput0118/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class JavaInputOutput {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static void printIntString(String S, int N){
        System.out.println("The input string :" + S);
        System.out.println("The input integer :" + N);
    }
}
