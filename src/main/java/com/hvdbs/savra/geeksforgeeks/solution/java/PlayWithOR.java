package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(
        difficulty = Difficulty.BASIC,
        name = "Play With OR",
        url = "https://practice.geeksforgeeks.org/problems/play-with-or5515/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy"
)
public class PlayWithOR {
    public static int[] game_with_number (int arr[], int n) {
        int[] res = new int[n];

        for (int i = 0, j = 1; i < n; i++, j++) {
            if (j == n) {
                res[i] = arr[i];
                break;
            }

            res[i] = arr[i] | arr[j];
        }

        return res;
    }
}
