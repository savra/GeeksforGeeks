package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Find Index",
        url = "https://practice.geeksforgeeks.org/problems/find-index4752/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        difficulty = Difficulty.SCHOOL)
public class FindIndex {
    static int[] findIndex(int a[], int N, int key) {
        int[] result = new int[] {-1, -1};

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                if (result[0] != -1) {
                    result[1] = i;
                } else {
                    result[0] = i;
                }
            }
        }

        if (result[0] != -1 && result[1] == -1) {
            result[1] = result[0];
        }

        return result;
    }
}
