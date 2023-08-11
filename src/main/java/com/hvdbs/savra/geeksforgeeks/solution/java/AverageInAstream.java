package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.SCHOOL,
        name = "Average in a stream",
        url = "https://practice.geeksforgeeks.org/problems/average4856/1?page=2&difficulty[]=-2&category[]=Data%20Structures&category[]=Arrays&sortBy=submissions"
)
public class AverageInAstream {
    float[] streamAvg(int[] arr, int n) {
        int count = 1;
        int sum = 0;
        float[] result = new float[n];

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];

            result[i] = (float)sum / count;

            count++;
        }

        return result;
    }
}
