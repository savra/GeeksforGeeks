package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        name = "The Else if Statement",
        url = "https://www.geeksforgeeks.org/problems/the-else-if-statement--121819/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC
)
public class TheElseIfStatement {
    public static void solve() {
        Scanner s = new Scanner(System.in);

        int i = s.nextInt();

        if (i > 100) {
            System.out.println("Big");
        } else if (i < 10) {
            System.out.println("Small");
        } else {
            System.out.println("Number");
        }
    }
}
