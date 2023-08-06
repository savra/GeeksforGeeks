package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Reverse a String", difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/java-reverse-a-string0416/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class ReverseAString {
    static String revStr(String S) {
        StringBuilder sb = new StringBuilder(S);

        return sb.reverse().toString();
    }
}
