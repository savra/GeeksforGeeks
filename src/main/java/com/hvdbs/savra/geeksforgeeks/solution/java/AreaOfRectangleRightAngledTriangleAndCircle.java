package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Area of Rectangle, Right Angled Triangle and Circle",
        url = "https://practice.geeksforgeeks.org/problems/area-of-rectange-right-angled-triangle-and-circle2600/1?page=3&difficulty[]=-2&status[]=unsolved&status[]=attempted&sortBy=submissions"
)
public class AreaOfRectangleRightAngledTriangleAndCircle {
    //My Time Complexity: O(1)
    //My Space complexity: O(1)
    static int[] getAreas(int L , int W , int B , int H , int R) {
        int[] result = new int[3];

        result[0] = L * W;
        result[1] = (int)(0.5 * B * H);
        result[2] = (int)(3.14 * (R * R));

        return result;
    }
}
