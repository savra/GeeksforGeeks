package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(name = "Print the left element", difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/print-the-left-element2009/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class PrintTheLeftElement {
    public long leftElement(long arr[], long n) {
        Arrays.sort(arr);

        return n % 2 == 0 ? arr[(int)n / 2 - 1] : arr[(int)n / 2];
    }
}
