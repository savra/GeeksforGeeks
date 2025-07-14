package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

@CodeInfo(
        name = "Distinct Sorted",
        url = "https://www.geeksforgeeks.org/problems/distinct-sorted--124713/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        difficulty = Difficulty.BASIC
)
public class DistinctSorted {
    public static ArrayList<Integer> uniqueSorted(int arr[]) {
        Set<Integer> tmpSet = new TreeSet<>();

        for (int i = 0; i < arr.length; i++) {
            tmpSet.add(arr[i]);
        }

        return new ArrayList<>(tmpSet);
    }
}
