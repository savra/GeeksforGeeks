package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Compete the skills",
        url = "https://practice.geeksforgeeks.org/problems/compete-the-skills5807/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions",
        timeComplexity = "O(1)",
        spaceComplexity = "O(1)")
public class CompeteTheSkills {
    public void scores(long a[], long b[]) {
        int ca = 0;
        int cb = 0;

        for (int i = 0; i < 3; i++) {
            if (a[i] > b[i]) {
                ca++;
            } else if (a[i] < b[i]) {
                cb++;
            }
        }

        //GFG.ca = ca;
        //GFG.cb = cb;
    }
}
