package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(name = "Swap kth elements",
        url = "https://practice.geeksforgeeks.org/problems/swap-kth-elements5500/1?page=1&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
difficulty = Difficulty.SCHOOL)
public class SwapKthElements {
    void swapKth(int arr[], int n, int k) {
        int tmp = arr[k - 1];
        arr[k - 1] = arr[arr.length - k];
        arr[arr.length - k] = tmp;
    }
}
