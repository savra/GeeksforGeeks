package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        url = "https://www.geeksforgeeks.org/problems/arithmetic-operators-1605594922/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        name = "Arithmetic Operators",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class ArithmeticOperators {
    public static void operations(int x, int y) {
        // Perform addition x+y below
        int p = x + y;
        // Perform subtraction x-y below
        int q = x - y;
        // Perform multiplication x*y below
        int r = x * y;
        // Perform division x/y below
        int s = x / y;
        // Perform modulo operation x%y below
        int t = x % y;

        // The below code prints the output. Don't change it!
        System.out.println(p + " " + q + " " + r + " " + s + " " + t);
    }
}
