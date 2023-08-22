package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Armstrong Numbers",
        url = "https://practice.geeksforgeeks.org/problems/armstrong-numbers2727/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class ArmstrongNumbers {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static String armstrongNumber(int n) {
        int result = 0;
        int tmp = n;

        while (tmp > 0) {
            result += Math.pow(tmp % 10, 3);
            tmp /= 10;
        }

        return result == n ? "Yes" : "No";
    }
}
