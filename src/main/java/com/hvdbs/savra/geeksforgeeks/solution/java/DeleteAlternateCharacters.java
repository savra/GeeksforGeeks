package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Delete alternate characters",
        url = "https://practice.geeksforgeeks.org/problems/java-delete-alternate-characters4036/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class DeleteAlternateCharacters {
    static String delAlternate(String S) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            if (i % 2 == 0) {
                sb.append(S.charAt(i));
            }
        }

        return sb.toString();
    }
}
