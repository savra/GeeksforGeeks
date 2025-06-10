package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Complexity;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Sort Method",
        url = "https://www.geeksforgeeks.org/problems/sort-method/1?page=1&category=Arrays,Java&difficulty=Basic&status=unsolved&sortBy=accuracy",
        timeComplexity = Complexity.ConstantComplexity.LINEARITHMIC,
        spaceComplexity = Complexity.ConstantComplexity.CONSTANT
)
public class SortMethod {
    public static void sortArray(int arr[]) {
        quickSort(arr, 0, arr.length - 1);
    }

    private static void quickSort(int[] array, int low, int high) {
        if (array.length == 0) {
            return;
        }

        int mid = low + (high - low) / 2;
        int pivot = array[mid];

        int i = low, j = high;
        while (i <= j) {
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        }

        if (low < j) {
            quickSort(array, low, j);
        }
        if (i < high) {
            quickSort(array, i, high);
        }
    }

    private static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
