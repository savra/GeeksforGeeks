package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        url = "https://www.geeksforgeeks.org/problems/comparator-sort-strings/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        spaceComplexity = Complexity.ConstantComplexity.LINEAR,
        name = "Comparator Sort Strings"
)
public class ComparatorSortStrings {
    public static void sortByComparator(String[] arr) {
        Arrays.sort(arr, String.CASE_INSENSITIVE_ORDER);
    }
}
