package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Pattern of Strings",
        url = "https://practice.geeksforgeeks.org/problems/pattern-of-strings3829/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class PatternOfStrings {
    ArrayList<String> pattern(String S) {
        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            result.add(S.substring(0, S.length() - i));
        }

        return result;
    }
}
