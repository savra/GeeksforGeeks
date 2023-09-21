package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Print first letter of every word in the string",
        url = "https://practice.geeksforgeeks.org/problems/print-first-letter-of-every-word-in-the-string3632/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class PrintFirstLetterOfEveryWordInTheString {
    String firstAlphabet(String S) {
        StringBuilder sb = new StringBuilder();
        sb.append(S.charAt(0));

        for(int i = 1; i < S.length(); i++) {
            if (S.charAt(i) == ' ') {
                sb.append(S.charAt(i + 1));
            }
        }

        return sb.toString();
    }
}
