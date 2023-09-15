package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.BASIC,
        name = "Searching a number",
        url = "https://practice.geeksforgeeks.org/problems/searching-a-number0324/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article"
)
public class SearchingANumber {
    public int search(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            if (arr[i] == k) {
                return i + 1;
            }
        }

        return -1;
    }
}
