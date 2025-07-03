package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        url = "https://www.geeksforgeeks.org/problems/max-and-min-in-arraylist/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        name = "Max and Min In ArrayList")
public class MaxAndMinInArrayList {
    public static int maximumElement(ArrayList<Integer> arr) {
        return arr.stream()
                .mapToInt(Integer::intValue)
                .max()
                .getAsInt();
    }

    public static int minimumElement(ArrayList<Integer> arr) {
        return arr.stream()
                .mapToInt(Integer::intValue)
                .min()
                .getAsInt();
    }
}
