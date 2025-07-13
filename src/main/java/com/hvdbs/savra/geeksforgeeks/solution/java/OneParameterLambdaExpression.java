package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "One Parameter Lambda Expression",
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        url = "https://www.geeksforgeeks.org/problems/one-parameter-lambda-expression/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy"
)
public class OneParameterLambdaExpression {
    public static Multiply helperFunction() {
        return (n) -> n * 5;
    }

    interface Multiply {
        public int multiplyBy5(int n);
    }
}


