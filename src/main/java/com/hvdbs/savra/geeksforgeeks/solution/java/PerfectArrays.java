package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(name = "Perfect Arrays", difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/perfect-arrays4645/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class PerfectArrays {
    public boolean IsPerfect(int a[], int n) {
        if (a.length == 2) {
            return a[0] == a[1];
        }

        int x;
        int y;

        int middleIndx = n / 2;

        if (middleIndx % 2 == 0) {
            x = middleIndx;
            y = middleIndx - 1;
        } else {
            x = middleIndx;
            y = middleIndx;
        }

        for (int i = 0, j = a.length - 1; i < x && j > y; i++, j--) {
            if (a[i] != a[j]) {
                return false;
            }
        }

        return true;
    }
}
