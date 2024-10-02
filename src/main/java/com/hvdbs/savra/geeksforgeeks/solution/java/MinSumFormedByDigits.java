package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.EASY,
        url = "https://www.geeksforgeeks.org/problems/min-sum-formed-by-digits3551/1?page=1&category=Queue&difficulty=Easy&status=unsolved&sortBy=accuracy",
        name = "Min sum formed by digits",
        spaceComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        timeComplexity = Complexity.ConstantComplexity.LINEAR)
public class MinSumFormedByDigits {
    public static long minSum(int arr[], int n) {
        Arrays.sort(arr);

        StringBuilder firstDigitStringBuilder = new StringBuilder();
        StringBuilder secondDigitStringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                firstDigitStringBuilder.append(arr[i]);
            } else {
                secondDigitStringBuilder.append(arr[i]);
            }
        }

        String tmpStrFirstDigit = firstDigitStringBuilder.toString();
        String tmpStrSecondDigit = secondDigitStringBuilder.toString();

        long firstIntDigit = tmpStrFirstDigit.isEmpty() ? 0 : Long.parseLong(tmpStrFirstDigit);
        long secondIntDigit = tmpStrSecondDigit.isEmpty() ? 0 : Long.parseLong(tmpStrSecondDigit);

        return firstIntDigit + secondIntDigit;
    }
}
