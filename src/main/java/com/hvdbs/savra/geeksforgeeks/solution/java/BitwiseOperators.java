package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "Bitwise Operators",
        url = "https://www.geeksforgeeks.org/problems/bitwise-operators-1597314674/1?page=1&category=Java&difficulty=Basic&status=unsolved,attempted&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC
)
public class BitwiseOperators {
    public static void operators(int a, int b, int c) {
        int d = a ^ a;
        int e = c ^ b;
        int f = a & b;
        int g = c | (a ^ a);
        e = ~e;

        System.out.println(d + " " + e + " " + f + " " + g);
    }
}
