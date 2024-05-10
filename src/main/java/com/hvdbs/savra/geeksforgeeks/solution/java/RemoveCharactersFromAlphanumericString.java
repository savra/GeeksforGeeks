package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Remove characters from alphanumeric string",
        url = "https://practice.geeksforgeeks.org/problems/remove-characters-from-alphanumeric-string0648/1?page=3&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class RemoveCharactersFromAlphanumericString {
    String removeCharacters(String S) {
        return S.replaceAll("[A-Za-z]", "");
    }
}
