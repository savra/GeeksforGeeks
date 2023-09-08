package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Even Odd Sum",
        url = "https://practice.geeksforgeeks.org/problems/even-odd-sum5450/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class EvenOddSum {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    ArrayList<Integer> EvenOddSum(int N, int Arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        int sumOdd = 0;
        int sumEven = 0;

        for(int i = 0; i < Arr.length; i++) {
            if ((i + 1) % 2 == 0) {
                sumEven += Arr[i];
            } else {
                sumOdd += Arr[i];
            }
        }

        result.add(sumOdd);
        result.add(sumEven);

        return result;
    }
}
