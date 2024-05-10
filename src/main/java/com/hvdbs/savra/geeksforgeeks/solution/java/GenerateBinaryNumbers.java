package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(difficulty = Difficulty.EASY,
        name = "Generate Binary Numbers",
        url = "https://practice.geeksforgeeks.org/problems/generate-binary-numbers-1587115620/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy",
        timeComplexity = "O(N * LogN)",
        spaceComplexity = "O(1)")
public class GenerateBinaryNumbers {
    static ArrayList<String> generate(int N) {
        ArrayList<String> res = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            res.add(Integer.toBinaryString(i));
        }

        return res;
    }
}
