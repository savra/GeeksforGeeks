package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Extract the integers",
        url = "https://practice.geeksforgeeks.org/problems/extract-the-integers4428/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        spaceComplexity = "O(N)",
        timeComplexity = "O(N)")
public class ExtractTheIntegers {
    ArrayList<String> extractIntegerWords(String s) {
        ArrayList<String> result = new ArrayList<>();

        if (java.util.regex.Pattern.matches("[0-9]+", s)) {
            result.add(s);

            return result;
        }

        int startNumSeq = 0;
        int numCount = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                if (startNumSeq == 0) {
                    if (numCount <= 0) {
                        startNumSeq = i;
                    }
                }

                numCount++;
            } else {
                if (numCount != 0) {
                    result.add(s.substring(startNumSeq, startNumSeq + numCount));
                    startNumSeq = 0;
                    numCount = 0;
                }
            }
        }

        if (startNumSeq != 0) {
            result.add(s.substring(startNumSeq, startNumSeq + numCount));
        }

        return result;
    }
}
