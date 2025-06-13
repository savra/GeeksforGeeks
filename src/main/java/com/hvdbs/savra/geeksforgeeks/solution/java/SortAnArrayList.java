package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        url = "https://www.geeksforgeeks.org/problems/sort-an-arraylist/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        name = "Sort An ArrayList",
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT)
public class SortAnArrayList {
    public static void sortArrayList(ArrayList<Integer> list) {
        quickSort(list, 0, list.size() - 1);
    }

    private static void quickSort(ArrayList<Integer> arr, int l, int h) {
        if (arr == null || arr.isEmpty()) {
            return;
        }

        int m = arr.get(l + (h - l) / 2);
        int i = l;
        int j = h;

        while (i <= j) {
            while(arr.get(i) < m) {
                i++;
            }

            while(arr.get(j) > m) {
                j--;
            }

            if (i <= j) {
                int tmp = arr.get(i);
                arr.set(i, arr.get(j));
                arr.set(j, tmp);
                i++;
                j--;
            }
        }

        if (i < h) {
            quickSort(arr, i, h);
        }

        if (j > l) {
            quickSort(arr, l, j);
        }
    }
}
