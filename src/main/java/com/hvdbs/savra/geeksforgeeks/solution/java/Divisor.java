package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Divisor",
        url = "https://www.geeksforgeeks.org/problems/divisor/1?page=1&category=Java&difficulty=Basic&status=unsolved,attempted&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC
)
public class Divisor {
    public static void divisor(int n) {
        int i = 1;

        while (i <= n) {
            if (n % i == 0) {
                System.out.print(i + " ");
            }

            i++;
        }
    }
}
