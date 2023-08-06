package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Check for Binary",
        url = "https://practice.geeksforgeeks.org/problems/check-for-binary/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        difficulty = Difficulty.SCHOOL)
public class CheckForBinary {
    boolean isBinary(String str) {
        for (int i = 0; i < str.length(); i++) {
            if (!(str.charAt(i) == '1' || str.charAt(i) == '0')) {
                return false;
            }
        }

        return true;
    }
}
