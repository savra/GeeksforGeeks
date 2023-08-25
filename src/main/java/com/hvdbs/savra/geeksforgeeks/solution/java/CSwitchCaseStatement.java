package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "C++ Switch Case Statement",
        url = "https://practice.geeksforgeeks.org/problems/c-switch-case-statement5900/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class CSwitchCaseStatement {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static String isInRange(int N){
        String result = "";

        switch(N) {
            case 1: result = "one"; break;
            case 2: result = "two"; break;
            case 3: result = "three"; break;
            case 4: result = "four"; break;
            case 5: result = "five"; break;
            case 6: result = "six"; break;
            case 7: result = "seven"; break;
            case 8: result = "eight"; break;
            case 9: result = "nine"; break;
            case 10: result = "ten"; break;
            default: result = "not in range";
        }

        return result;
    }
}
