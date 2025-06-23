package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        name = "Java Streams Max",
        url = "https://www.geeksforgeeks.org/problems/java-streams-max/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC
)
public class JavaStreamsMax {
    public static int maxUsingStreams(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}
