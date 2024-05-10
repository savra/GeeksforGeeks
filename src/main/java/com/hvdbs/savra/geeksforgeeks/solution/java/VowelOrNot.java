package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Vowel or Not",
        url = "https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class VowelOrNot {
    String isVowel(char c) {
        return java.util.regex.Pattern.matches("[aeiou]|[AEIOU]", Character.toString(c)) ? "YES" : "NO";
    }
}
