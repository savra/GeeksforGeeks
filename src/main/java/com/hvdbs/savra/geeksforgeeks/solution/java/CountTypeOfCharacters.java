package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Count type of Characters",
        url = "https://practice.geeksforgeeks.org/problems/count-type-of-characters3635/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class CountTypeOfCharacters {
    int[] count(String s) {
        int[] result = new int[4];
        int initialLength = s.length();

        for (int i = 0; i < initialLength; i++) {
            int currentChar = s.charAt(i);

            if (currentChar >= 65 && currentChar <= 90) {
                result[0]++;
            } else if (currentChar >= 97 && currentChar <= 122) {
                result[1]++;
            } else if (currentChar >= 48 && currentChar <= 57) {
                result[2]++;
            }
        }

        result[3] = initialLength - result[2] - result[1] - result[0];

        return result;
    }
}
