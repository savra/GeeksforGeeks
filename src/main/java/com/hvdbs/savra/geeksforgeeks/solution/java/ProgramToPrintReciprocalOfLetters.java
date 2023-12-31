package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Program to print reciprocal of letters",
        url = "https://practice.geeksforgeeks.org/problems/program-to-print-reciprocal-of-letters36233623/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class ProgramToPrintReciprocalOfLetters {
    //My Time Complexity: O(n)
    //My Space complexity: O(n)
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
