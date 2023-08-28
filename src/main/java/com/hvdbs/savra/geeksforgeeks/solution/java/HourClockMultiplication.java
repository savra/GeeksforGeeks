package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "12 hour clock Multiplication",
        url = "https://practice.geeksforgeeks.org/problems/12-hour-clock-multiplication4709/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class HourClockMultiplication {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static int mulClock(int num1, int num2) {
        return num1 * num2 % 12;
    }
}
