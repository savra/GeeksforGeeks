package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Vowel or Not",
        url = "https://practice.geeksforgeeks.org/problems/vowel-or-not0831/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class VowelOrNot {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    String isVowel(char c){
        return java.util.regex.Pattern.matches("[aeiou]|[AEIOU]", Character.toString(c)) ? "YES" : "NO";
    }
}
