package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "12 hour clock addition",
        url = "https://practice.geeksforgeeks.org/problems/12-hour-clock-addition1206/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class HourClockAddition {
    static int clockSum(int num1, int num2){
        int sum = num1 + num2;

        return sum < 12 ? sum: sum % 12;
    }
}
