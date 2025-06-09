package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        url = "https://www.geeksforgeeks.org/problems/multi-parameters-lambda-expression/1?page=1&category=Arrays,Java&difficulty=Basic&sortBy=accuracy",
        name = "Multi Parameters Lambda Expression",
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class MultiParametersLambdaExpression {
    public static Add helperFunction() {
        return (a, b) -> a + b;
    }
}

interface Add {
    int addParameters(int a, int b);
}
