package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Power of Pow | Even Number",
        url = "https://practice.geeksforgeeks.org/problems/power-of-pow-even-number5440/1?page=2&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(N)")
public class PowerOfPowEvenNumber {
    public long sum_of_square_evenNumbers(long n) {
        int i = 0;
        int j = 2;
        long sum = 0;

        while (i < n) {
            sum += (j * j);
            i++;
            j += 2;
        }

        return sum;
    }
}
