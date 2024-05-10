package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Remove vowels from string",
        url = "https://practice.geeksforgeeks.org/problems/remove-vowels-from-string1446/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class RemoveVowelsFromString {
    String removeVowels(String S) {
        return S.replaceAll("[aeiou]", "");
    }
}
