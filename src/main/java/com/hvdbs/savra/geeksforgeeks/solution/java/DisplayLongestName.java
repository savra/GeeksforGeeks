package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(name = "Display longest name",
        url = "https://practice.geeksforgeeks.org/problems/display-longest-name0853/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        difficulty = Difficulty.SCHOOL)
public class DisplayLongestName {
    String longest(String names[], int n) {
        int maxLength = 0;
        String maxName = "";

        for (String name : names) {
            if (name.length() > maxLength) {
                maxLength = name.length();
                maxName = name;
            }
        }

        return maxName;
    }
}
