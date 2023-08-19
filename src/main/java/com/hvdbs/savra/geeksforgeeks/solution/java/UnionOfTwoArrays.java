package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Arrays;
import java.util.Set;

import static java.util.stream.Collectors.toSet;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Union of two arrays",
        url = "https://practice.geeksforgeeks.org/problems/union-of-two-arrays3538/1?page=1&difficulty[]=-1&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class UnionOfTwoArrays {
    //My Time Complexity: O(n + m)
    //My Space complexity: O(n + m)
    public static int doUnion(int a[], int n, int b[], int m) {
        Set<Integer> set1 = Arrays.stream(a).boxed().collect(toSet());
        Set<Integer> set2 = Arrays.stream(b).boxed().collect(toSet());

        set1.addAll(set2);

        return set1.size();
    }
}
