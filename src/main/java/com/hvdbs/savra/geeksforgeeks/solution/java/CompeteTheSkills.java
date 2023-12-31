package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Compete the skills",
        url = "https://practice.geeksforgeeks.org/problems/compete-the-skills5807/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class CompeteTheSkills {
    //Expected Time Complexity: O(1)
    //Expected Auxiliary Space: O(1)
    //My Time Complexity: O(1)
    //My Auxiliary Space: O(1)
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
