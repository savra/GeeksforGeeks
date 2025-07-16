package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;


@CodeInfo(
        name = "ArrayList insertion",
        url = "https://www.geeksforgeeks.org/problems/arraylist-insertion/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEAR,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT,
        difficulty = Difficulty.BASIC
)
public class ArrayListInsertion {
    public static ArrayList<Integer> fillArrayList(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();

        for (Integer i : arr) {
            result.add(i);
        }

        return result;
    }
}
