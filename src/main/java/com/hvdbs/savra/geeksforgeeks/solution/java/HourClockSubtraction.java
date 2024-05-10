package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "12 hour clock subtraction",
        url = "https://practice.geeksforgeeks.org/problems/12-hour-clock-subtraction1708/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions")
public class HourClockSubtraction {
    static int subClock(int num1, int num2) {
        int diff = num1 - num2;

        if (diff >= 0) {
            if (diff >= 12) {
                return diff % 12;
            } else {
                return diff;
            }
        } else {
            if (Math.abs(diff) > 12) {
                return diff % 12 != 0 ? 12 - (diff % 12 * -1): 0;
            } else {
                return 12 - (diff * -1);
            }
        }
    }
}
