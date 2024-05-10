package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.List;

@CodeInfo(
        name = "Find the Highest number",
        difficulty = Difficulty.EASY,
        url = "https://practice.geeksforgeeks.org/problems/find-the-highest-number2259/1?page=1&category=Binary%20Search&difficulty=School,Basic,Easy&status=unsolved&sortBy=accuracy")
public class FindTheHighestNumber {
    public int findPeakElement(List<Integer> a) {
        int l = 0;
        int r = a.size() - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (a.get(mid) < a.get(mid + 1)) {
                l = mid + 1;
            } else {
                r = mid;
            }
        }

        return a.get(l);
    }
}
