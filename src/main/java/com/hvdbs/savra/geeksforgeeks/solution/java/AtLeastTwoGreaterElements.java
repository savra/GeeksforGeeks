package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.Arrays;

@GeeksForGeeksInfo(name = "At least two greater elements",
        difficulty = Difficulty.SCHOOL,
        url = "https://practice.geeksforgeeks.org/problems/at-least-two-greater-elements4625/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions")
public class AtLeastTwoGreaterElements {
    public long[] findElements(long a[], long n) {
        Arrays.sort(a);

        long[] result = new long[a.length - 2];

        System.arraycopy(a, 0, result, 0, a.length - 2);

        return result;
    }
}
