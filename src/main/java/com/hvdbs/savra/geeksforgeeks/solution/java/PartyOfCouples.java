package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(name = "Party of Couples", difficulty = Difficulty.SCHOOL,
url = "https://practice.geeksforgeeks.org/problems/alone-in-couple5507/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class PartyOfCouples {
    static int findSingle(int N, int arr[]){
        java.util.Arrays.sort(arr);

        for (int i = 0; i < arr.length - 1; i += 2) {
            if (arr[i] != arr[i + 1]) {
                return arr[i];
            }
        }

        return arr[arr.length - 1];
    }
}
