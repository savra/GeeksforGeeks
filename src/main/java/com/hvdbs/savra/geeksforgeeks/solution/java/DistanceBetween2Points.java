package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Distance between 2 points",
        url = "https://practice.geeksforgeeks.org/problems/distance-between-2-points3200/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class DistanceBetween2Points {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    public int distance(int x1, int y1, int x2, int y2) {
        return (int)Math.round(Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2)));
    }
}
