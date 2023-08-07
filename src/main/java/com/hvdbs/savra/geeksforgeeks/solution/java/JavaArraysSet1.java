package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Java Arrays | Set 1", difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/java-arrays-set-11354/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class JavaArraysSet1 {
    String average(int A[], int N){
        int avg = 0;

        for (int i: A) {
            avg += i;
        }

        return String.format("%.2f", (double)avg / A.length);
    }
}
