package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        name = "No Parameter Lambda Expression",
        url = "https://www.geeksforgeeks.org/problems/no-parameter-lambda-expression/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.CONSTANT,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC)
public class NoParameterLambdaExpression {
    public static Hello helperFunction() {
        return () -> {
            System.out.println("Hello");
        };
    }
}

interface Hello {
    void sayHello();
}
