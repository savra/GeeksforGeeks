package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

@CodeInfo(name = "Reversing the vowels",
        difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/reversing-the-vowels5304/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class ReversingTheVowels {
    String modify (String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        String reversedVowels = new StringBuilder(s.replaceAll("[^aeiou]", "")).reverse().toString();

        char[] chars = s.toCharArray();


        for (int i = 0, j = 0; i < chars.length; i++) {
            if (vowels.contains(chars[i])) {
                chars[i] = reversedVowels.charAt(j);
                j++;
            }
        }

        return new String(chars);
    }
}
