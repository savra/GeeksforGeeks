package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "1s Complement",
        url = "https://practice.geeksforgeeks.org/problems/1s-complement2819/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class FirstComplement {
    static String onesComplement(String S, int N) {
        char[] tmp = new char[N];

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                tmp[i] = '1';
            } else {
                tmp[i] = '0';
            }
        }

        return new String(tmp);
    }
}
