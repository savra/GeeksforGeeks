package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(url = "https://practice.geeksforgeeks.org/problems/remainder-evaluation3755/1?page=1&difficulty[]=-2&sortBy=accuracy",
        name = "Remainder Evaluation",
        difficulty = Difficulty.SCHOOL)
public class RemainderEvaluation {
    static int findRemainder(int num1, int num2){
        return num1 % num2;
    }
}
