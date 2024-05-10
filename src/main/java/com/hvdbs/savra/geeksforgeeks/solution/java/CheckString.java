package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(name = "Check String",
        difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/check-string1818/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(|S|)")
public class CheckString {
    Boolean check(String s) {
        boolean allSame = true;

        if (s.length() == 1) {
            return true;
        }

        char firstChar = s.charAt(0);


        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != firstChar) {
                allSame = false;
                break;
            }
        }

        return allSame;
    }
}
