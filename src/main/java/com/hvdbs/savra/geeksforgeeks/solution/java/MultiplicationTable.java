package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Multiplication Table",
        url = "https://practice.geeksforgeeks.org/problems/print-table0303/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class MultiplicationTable {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static ArrayList<Integer> getTable(int N){
        ArrayList<Integer> res = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            res.add(N * i);
        }

        return res;
    }
}
