package com.hvdbs.savra.geeksforgeeks.solution.java;

import com.hvdbs.savra.geeksforgeeks.statsgenerator.GeeksForGeeksInfo;
import com.hvdbs.savra.geeksforgeeks.statsgenerator.enums.Difficulty;

@GeeksForGeeksInfo(
        difficulty = Difficulty.EASY,
        name = "First negative integer in every window of size k",
        url = "https://practice.geeksforgeeks.org/problems/first-negative-integer-in-every-window-of-size-k3345/1?page=1&difficulty[]=0&status[]=unsolved&category[]=Queue&sortBy=accuracy"
)
public class FirstNegativeIntegerInEveryWindowOfSizeK {
    public long[] printFirstNegativeInteger(long A[], int N, int K) {
        boolean wasFind = false;
        long[] res = new long[N - K + 1];
        int l = 0;

        for (int i = 0; i <= N - K; i++) {
            for (int j = i; j < i + K && j < N; j++) {
                if (A[j] < 0) {
                    res[l++] = A[j];
                    wasFind = true;
                    break;
                }
            }

            if (!wasFind) {
                res[l++] = 0;
            }

            wasFind = false;
        }

        return res;
    }
}
