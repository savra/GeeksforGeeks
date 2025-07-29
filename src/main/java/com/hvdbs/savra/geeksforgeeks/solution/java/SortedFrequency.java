package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Map;
import java.util.TreeMap;

@CodeInfo(
        name = "Sorted Frequency",
        url = "https://www.geeksforgeeks.org/problems/sorted-frequency/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        difficulty = Difficulty.BASIC
)
public class SortedFrequency {
    public static void freqSorted(int arr[]) {
        Map<Integer, Integer> result = new TreeMap<>();

        for (int i = 0; i < arr.length; i++) {
            result.put(arr[i], result.getOrDefault(arr[i], 0) + 1);
        }

        for (Map.Entry<Integer, Integer> e : result.entrySet()) {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
