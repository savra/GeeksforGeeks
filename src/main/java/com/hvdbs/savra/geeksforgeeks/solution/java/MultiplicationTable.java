package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Multiplication Table",
        url = "https://practice.geeksforgeeks.org/problems/print-table0303/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class MultiplicationTable {
    static ArrayList<Integer> getTable(int N) {
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            res.add(N * i);
        }

        return res;
    }
}
