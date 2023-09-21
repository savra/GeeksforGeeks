package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Leaders in an array",
        url = "https://practice.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1?utm_source=gfg&utm_medium=article&utm_campaign=bottom_sticky_on_article"
)
public class LeadersInAnArray {
    //My Time Complexity: O(n)
    //My Space complexity: O(1)
    static ArrayList<Integer> leaders(int arr[], int n){
        int max = arr[arr.length - 1];

        ArrayList<Integer> res = new ArrayList<>();
        res.add(max);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= max) {
                res.add(0, arr[i]);
                max = arr[i];
            }
        }

        return res;
    }
}
