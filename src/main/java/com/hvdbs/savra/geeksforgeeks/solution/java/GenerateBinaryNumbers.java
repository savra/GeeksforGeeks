package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "Generate Binary Numbers",
        url = "https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class GenerateBinaryNumbers {
    //TC: O(N * LogN), SC: O(1)
    static ArrayList<String> generate(int N) {
        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            res.add(Integer.toBinaryString(i));
        }

        return res;
    }
}
