package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Palindromic Array", difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/palindromic-array-1587115620/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class PalindromicArray {
    public static int palinArray(int[] a, int n) {
        for (int j : a) {
            String temp = String.valueOf(j);
            StringBuilder sb = new StringBuilder(temp);

            if (!sb.reverse().toString().equals(temp)) {
                return 0;
            }
        }

        return 1;
    }
}
