package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Reverse a String",
        url = "https://practice.geeksforgeeks.org/problems/reverse-a-string/1?page=1&difficulty[]=-1&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class ReverseString {
    public static String reverseWord(String str){
        return new StringBuilder(str).reverse().toString();
    }
}
