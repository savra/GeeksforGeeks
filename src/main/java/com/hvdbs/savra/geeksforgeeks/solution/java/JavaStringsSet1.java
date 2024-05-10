package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Java Strings | Set 1",
        url = "https://practice.geeksforgeeks.org/problems/java-strings-set-15112/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class JavaStringsSet1 {
    static String conRevstr(String S1, String S2) {
        return new StringBuilder(S1 + S2).reverse().toString();
    }
}
