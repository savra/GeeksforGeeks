package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Substring",
        url = "https://practice.geeksforgeeks.org/problems/java-substring5058/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class JavaSubstring {
    static String javaSub(String S, int L, int R) {
        return S.substring(L, R + 1);
    }
}
