package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Union of two arrays",
        url = "https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=1&difficulty[]=-1&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        timeComplexity = "O(N + M)",
        spaceComplexity = "O(N + M)")
public class UnionOfTwoArrays {
    public static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> set1 = Arrays.stream(a).boxed().collect(toSet());
        Set<Integer> set2 = Arrays.stream(b).boxed().collect(toSet());

        set1.addAll(set2);

        return set1.size();
    }
}
