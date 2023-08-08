package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@GeeksForGeeksInfo(name = "Upper case conversion",
        difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/upper-case-conversion5419/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class UpperCaseConversion {
    public String transform(String s) {
        return Arrays.stream(s.split(" "))
                .map(str -> str.substring(0, 1).toUpperCase() + str.substring(1, str.length()))
                .collect(java.util.stream.Collectors.joining(" "));
    }
}
