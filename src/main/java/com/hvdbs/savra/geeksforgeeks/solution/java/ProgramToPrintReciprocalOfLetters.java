package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Program to print reciprocal of letters",
        url = "https://practice.geeksforgeeks.org/problems/program-to-print-reciprocal-of-letters36233623/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class ProgramToPrintReciprocalOfLetters {
    static String reciprocalString(String S) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < S.length(); i++) {
            char currentChar = S.charAt(i);

            if ((currentChar >= 65 && currentChar <= 90)) {
                int chrPosition = currentChar - 65;
                sb.append((char) ('Z' - chrPosition));
            } else if (currentChar >= 97 && currentChar <= 122) {
                int chrPosition = currentChar - 97;
                sb.append((char) ('z' - chrPosition));
            } else {
                sb.append(currentChar);
            }
        }

        return sb.toString();
    }
}
