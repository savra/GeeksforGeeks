package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Scanner;

@CodeInfo(
        name = "Print Square wall",
        url = "https://www.geeksforgeeks.org/problems/print-square-wall-1605682270--111211/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class PrintSquareWall {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();

        String line = "* ".repeat(n);

        for (int i = 0; i < n; i++) {
            System.out.println(line);
        }
    }
}
