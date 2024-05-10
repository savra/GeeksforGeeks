package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.SCHOOL,
        name = "Area of Rectangle, Right Angled Triangle and Circle",
        url = "https://practice.geeksforgeeks.org/problems/area-of-rectange-right-angled-triangle-and-circle2600/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions",
        spaceComplexity = "O(1)",
        timeComplexity = "O(1)")
public class AreaOfRectangleRightAngledTriangleAndCircle {
    static int[] getAreas(int L, int W, int B, int H, int R) {
        int[] result = new int[3];

        result[0] = L * W;
        result[1] = (int) (0.5 * B * H);
        result[2] = (int) (3.14 * (R * R));

        return result;
    }
}
