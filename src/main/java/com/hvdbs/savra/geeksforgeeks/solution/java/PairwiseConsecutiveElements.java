package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.Stack;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Pairwise Consecutive Elements",
        url = "https://practice.geeksforgeeks.org/problems/pairwise-consecutive-elements/1?page=1&difficulty[]=-1&status[]=unsolved&category[]=Stack&sortBy=accuracy"
)
public class PairwiseConsecutiveElements {
    public static boolean pairWiseConsecutive(Stack<Integer> st) {
        int nonConsecutiveCount = 0;

        Integer prev = st.pop();
        Integer cur;
        int size = 1;

        while (!st.isEmpty()) {
            cur = st.pop();

            if (Math.abs(prev - cur) != 1) {
                nonConsecutiveCount++;
            }

            prev = cur;
            size++;
        }

        boolean res = false;

        if (size % 2 == 0) {
            if (nonConsecutiveCount == 0) {
                res = true;
            }
        } else {
            if (nonConsecutiveCount <= 1) {
                res = true;
            }
        }

        return res;
    }
}
