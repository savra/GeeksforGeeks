package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "12 hour clock Multiplication",
        url = "https://practice.geeksforgeeks.org/problems/12-hour-clock-multiplication4709/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class HourClockMultiplication {
    static int mulClock(int num1, int num2) {
        return num1 * num2 % 12;
    }
}
