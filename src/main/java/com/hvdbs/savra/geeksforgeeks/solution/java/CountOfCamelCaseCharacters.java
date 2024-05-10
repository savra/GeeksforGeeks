package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Count of camel case characters",
        url = "https://practice.geeksforgeeks.org/problems/find-the-camel3348/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class CountOfCamelCaseCharacters {
    int countCamelCase (String s) {
        int result = 0;

        for (int i = 0; i < s.length(); i++) {
            if ((int)s.charAt(i) >= 65 && (int)s.charAt(i) <= 90) {
                result++;
            }
        }

        return result;
    }
}
