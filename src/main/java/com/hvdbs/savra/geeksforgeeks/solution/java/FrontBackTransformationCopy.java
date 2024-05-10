package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Front-Back Transformation - copy",
        url = "https://practice.geeksforgeeks.org/problems/front-back-transformation1659/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class FrontBackTransformationCopy {
    String convert(String s) {
        int charPosition;
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {
                charPosition = s.charAt(i) - 'A';
                sb.append((char) ('Z' - charPosition));
            } else {
                charPosition = s.charAt(i) - 'a';
                sb.append((char) ('z' - charPosition));
            }
        }

        return sb.toString();
    }
}
