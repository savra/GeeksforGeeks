package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Triangle shrinking downwards",
        url = "https://practice.geeksforgeeks.org/problems/triangle-shrinking-downwards0459/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N^2)")
public class TriangleShrinkingDownwards {
    static String triDownwards(String S) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            for (int j = 0; j < S.length(); j++) {
                if (j < i) {
                    sb.append(".");
                } else {
                    sb.append(S.charAt(j));
                }
            }
        }

        return sb.toString();
    }
}
