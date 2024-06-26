package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

import java.util.ArrayList;

@CodeInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Number Pattern",
        url = "https://practice.geeksforgeeks.org/problems/number-pattern0517/1?page=4&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        timeComplexity = "O(N^2)",
        spaceComplexity = "O(N)")
public class NumberPattern {
    ArrayList<String> numberPattern(int N) {
        ArrayList<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                sb.append(j);
            }

            for (int k = i - 1; k >= 1; k--) {
                sb.append(k);
            }

            result.add(sb.toString());
            sb.setLength(0);
        }

        return result;
    }
}
