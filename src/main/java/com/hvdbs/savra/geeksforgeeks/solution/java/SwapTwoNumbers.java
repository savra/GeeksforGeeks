package com.hvdbs.savra.geeksforgeeks.solution.java;


import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Swap two numbers",
        url = "https://practice.geeksforgeeks.org/problems/swap-two-numbers3844/1?page=1&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class SwapTwoNumbers {
    static List<Integer> get(int a, int b) {
        List<Integer> res = new ArrayList<>();
        res.add(b);
        res.add(a);

        return res;
    }
}
