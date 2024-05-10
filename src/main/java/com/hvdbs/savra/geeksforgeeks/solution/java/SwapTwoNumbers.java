package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;
import java.util.List;

@CodeInfo(
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
