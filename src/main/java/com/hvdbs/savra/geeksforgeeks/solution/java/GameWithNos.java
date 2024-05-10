package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.statsgenerator.CodeInfo;
import com.hvdbs.savra.statsgenerator.enums.Difficulty;

@CodeInfo(difficulty = Difficulty.BASIC,
        name = "Game with nos",
        url = "https://practice.geeksforgeeks.org/problems/game-with-nos3123/1?page=1&difficulty[]=-1&status[]=unsolved&sortBy=accuracy",
        timeComplexity = "O(N)",
        spaceComplexity = "O(N)")
public class GameWithNos {
    public static int[] game_with_number(int arr[], int n) {
        int[] result = new int[n];

        for (int i = 0, j = 1; i < n; i++, j++) {
            if (j == n) {
                result[i] = arr[i];
                break;
            }

            result[i] = arr[i] ^ arr[j];
        }

        return result;
    }
}
