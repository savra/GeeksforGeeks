package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        url = "https://www.geeksforgeeks.org/problems/evaluate-formulae/1?page=1&category=Java&difficulty=Basic&status=unsolved,attempted&sortBy=accuracy",
        name = "Evaluate Formulae",
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class EvaluateFormulae {
    public static void evalute(int a, int b, int c, int d) {
        int res = (a + b) / c + d;

        System.out.println(res);
    }
}
