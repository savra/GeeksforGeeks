package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;


@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Count Only Once",
        url = "https://www.geeksforgeeks.org/problems/count-only-once/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEAR
)
public class CountOnlyOnce {
    public static int countOnce(int arr[]) {
        Map<Integer, Long> result = Arrays.stream(arr)
                .boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        return result.size();
    }
}
