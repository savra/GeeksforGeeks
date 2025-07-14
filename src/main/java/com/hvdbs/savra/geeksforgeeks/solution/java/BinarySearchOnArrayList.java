package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(
        name = "Binary Search on ArrayList",
        url = "https://www.geeksforgeeks.org/problems/binary-search-on-arraylist/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        difficulty = Difficulty.BASIC,
        spaceComplexity = Complexity.ConstantComplexity.LOGARITHMIC,
        timeComplexity = Complexity.ConstantComplexity.LOGARITHMIC
)
public class BinarySearchOnArrayList {
    public static int binarySearchAL(ArrayList<Integer> list, int k) {
        return binarySearch(0, list.size() - 1, k, list);
    }

    private static int binarySearch(int lo, int hi, int k, ArrayList<Integer> list) {
        if (lo > hi) {
            return -1;
        }

        int m = lo + (hi - lo) / 2;
        int me = list.get(m);

        if (k == me) {
            return m;
        }

        return k > me ? binarySearch(m + 1, hi, k, list) : binarySearch(lo, m - 1, k, list);
    }
}
